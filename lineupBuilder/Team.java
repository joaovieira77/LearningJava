package lineupBuilder;

import java.util.ArrayList;

public class Team {
    private String name;
    private String formation;
    private ArrayList<Player> lineup = new ArrayList<>();

    public Team(String name, String formation) {
        this.name = name;
        this.formation = formation;
    }

    public String getName() {
        return name;
    }

    public String getFormation() {
        return formation;
    }

    public void addPlayer(Player player) {
        lineup.add(player);
    }

    public void displayLineup() {
        System.out.println("\n" + name + " (" + formation + ")");
        for (Player p : lineup) {
            p.display();
        }
    }
}

