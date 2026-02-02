package Casino;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int creditos = 500; // começa com 500

        while (true) {
            System.out.println("\n=== MINI CASINO ===");
            System.out.println("Créditos: " + creditos);
            System.out.println("1 - Blackjack");
            System.out.println("2 - Roleta");
            System.out.println("3 - Pedra Papel Tesoura");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> creditos = Blackjack.play(sc, creditos);
                case 2 -> creditos = Roleta.play(sc, creditos);
                case 3 -> creditos = PedraPapelTesoura.play(sc, creditos);
                case 0 -> {
                    System.out.println("Até à próxima!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }

            if (creditos <= 0) {
                System.out.println("Ficaste sem créditos! Jogo terminado.");
                sc.close();
                return;
            }
        }
    }
}
