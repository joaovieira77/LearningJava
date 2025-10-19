package arraylists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Maintwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();

        System.out.println("=== Registro de Frutas ===");
        System.out.println("Digite o nome das frutas (ou 'sair' para finalizar):");

        while (true) {
            System.out.print("Fruta: ");
            String fruit = scanner.nextLine();

            if (fruit.equalsIgnoreCase("sair")) {
                break;
            }

            fruits.add(fruit);
        }

        if (fruits.isEmpty()) {
            System.out.println("\nNenhuma fruta foi adicionada.");
        } else {
            Collections.sort(fruits);

            System.out.println("\n=== Lista de Frutas em Ordem Alfabética ===");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }

        scanner.close();
    }
}
