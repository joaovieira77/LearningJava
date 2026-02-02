package Casino;

import java.util.*;

public class Blackjack {

    private static final Random random = new Random();

    private static int drawCard() {
        int card = random.nextInt(13) + 1;
        return Math.min(card, 10); // J, Q, K = 10
    }

    public static int play(Scanner sc, int creditos) {

        System.out.println("=== BLACKJACK ===");
        System.out.println("Créditos atuais: " + creditos);
        System.out.print("Quanto queres apostar? ");
        int aposta = sc.nextInt();
        sc.nextLine();

        if (aposta > creditos || aposta <= 0) {
            System.out.println("Aposta inválida.");
            return creditos;
        }

        int player = drawCard() + drawCard();
        int dealer = drawCard() + drawCard();

        System.out.println("As tuas cartas: " + player);
        System.out.println("Carta visível do dealer: " + dealer);

        // Jogador joga
        while (true) {
            System.out.print("Queres outra carta? (s/n): ");
            String op = sc.nextLine().toLowerCase();

            if (op.equals("s")) {
                int card = drawCard();
                player += card;
                System.out.println("Recebeste: " + card + " | Total: " + player);

                if (player > 21) {
                    System.out.println("Passaste dos 21! Perdeste " + aposta + " créditos.");
                    return creditos - aposta;
                }
            } else {
                break;
            }
        }

        // Dealer joga
        while (dealer < 17) {
            dealer += drawCard();
        }

        System.out.println("Dealer total: " + dealer);

        // Resultado
        if (dealer > 21 || player > dealer) {
            System.out.println("Ganhaste " + aposta + " créditos!");
            return creditos + aposta;
        } else if (player == dealer) {
            System.out.println("Empate! A aposta volta.");
            return creditos;
        } else {
            System.out.println("Perdeste " + aposta + " créditos.");
            return creditos - aposta;
        }
    }
}
