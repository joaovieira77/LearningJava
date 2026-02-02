package Casino;

import java.util.*;

public class PedraPapelTesoura {

    public static int play(Scanner sc, int creditos) {
        Random random = new Random();

        System.out.println("=== PEDRA PAPEL TESOURA ===");
        System.out.println("Créditos atuais: " + creditos);
        System.out.print("Quanto queres apostar? ");
        int aposta = sc.nextInt();
        sc.nextLine();

        if (aposta > creditos || aposta <= 0) {
            System.out.println("Aposta inválida.");
            return creditos;
        }

        String[] opcoes = {"pedra", "papel", "tesoura"};

        System.out.print("Escolhe (pedra/papel/tesoura): ");
        String player = sc.nextLine().toLowerCase();

        String cpu = opcoes[random.nextInt(3)];
        System.out.println("CPU escolheu: " + cpu);

        if (player.equals(cpu)) {
            System.out.println("Empate! A aposta volta.");
            return creditos;
        }

        boolean win =
                (player.equals("pedra") && cpu.equals("tesoura")) ||
                (player.equals("papel") && cpu.equals("pedra")) ||
                (player.equals("tesoura") && cpu.equals("papel"));

        if (win) {
            System.out.println("Ganhaste " + aposta + " créditos!");
            return creditos + aposta;
        } else {
            System.out.println("Perdeste " + aposta + " créditos.");
            return creditos - aposta;
        }
    }
}
