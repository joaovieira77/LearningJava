package Casino;

import java.util.*;

public class Roleta {

    private static final Random random = new Random();

    public static int play(Scanner sc, int creditos) {

        System.out.println("=== ROLETA ===");
        System.out.println("Créditos atuais: " + creditos);
        System.out.print("Quanto queres apostar? ");
        int aposta = sc.nextInt();

        if (aposta > creditos || aposta <= 0) {
            System.out.println("Aposta inválida.");
            return creditos;
        }

        System.out.println("1 - Vermelho");
        System.out.println("2 - Preto");
        System.out.println("3 - Número (0-36)");
        System.out.print("Escolha: ");
        int op = sc.nextInt();

        int escolhaNumero = -1;
        if (op == 3) {
            System.out.print("Escolhe o número (0-36): ");
            escolhaNumero = sc.nextInt();
        }

        // Só agora geramos o resultado
        int result = random.nextInt(37);
        boolean isRed = result % 2 == 0 && result != 0;

        System.out.println("A roleta girou... saiu " + result + 
            (result == 0 ? " (Verde)" : isRed ? " (Vermelho)" : " (Preto)"));

        boolean ganhou = false;
        int ganho = 0;

        switch (op) {
            case 1 -> {
                if (isRed) {
                    ganhou = true;
                    ganho = aposta;
                }
            }
            case 2 -> {
                if (!isRed && result != 0) {
                    ganhou = true;
                    ganho = aposta;
                }
            }
            case 3 -> {
                if (escolhaNumero == result) {
                    ganhou = true;
                    ganho = aposta * 35;
                }
            }
            default -> System.out.println("Opção inválida.");
        }

        if (ganhou) {
            System.out.println("Ganhaste " + ganho + " créditos!");
            creditos += ganho;
        } else {
            System.out.println("Perdeste " + aposta + " créditos.");
            creditos -= aposta;
        }

        return creditos;
    }
}
