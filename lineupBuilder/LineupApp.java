package lineupBuilder;

import java.util.*;

public class LineupApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Team teamA = createTeam(scanner, "A");
        Team teamB = createTeam(scanner, "B");

        System.out.println("\n--- Final Lineups ---");
        teamA.displayLineup();
        teamB.displayLineup();

        scanner.close();
    }

    private static Team createTeam(Scanner scanner, String label) {
        System.out.print("Enter Team " + label + " name: ");
        String name = scanner.nextLine();

        System.out.print("Choose formation (4-3-3, 4-4-2, 3-5-2, 4-2-3-1, 3-4-3, 5-3-2, 4-1-4-1): ");
        String formation = scanner.nextLine();

        Team team = new Team(name, formation);
        List<String> positions = FormationFactory.getPositions(formation);

        System.out.println("Enter 11 players for " + name + ":");
        for (String pos : positions) {
            System.out.print("→ " + pos + ": ");
            String playerName = scanner.nextLine();
            team.addPlayer(new Player(playerName, pos));
        }

        return team;
    }
}
