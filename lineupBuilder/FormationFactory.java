package lineupBuilder;

import java.util.*;

public class FormationFactory {
    public static List<String> getPositions(String formation) {
        switch (formation) {
            case "4-3-3":
                return Arrays.asList("GK", "RB", "CB", "CB", "LB", "CM", "CM", "CM", "RW", "ST", "LW");
            case "4-4-2":
                return Arrays.asList("GK", "RB", "CB", "CB", "LB", "RM", "CM", "CM", "LM", "ST", "ST");
            case "3-5-2":
                return Arrays.asList("GK", "CB", "CB", "CB", "RM", "CM", "CAM", "CM", "LM", "ST", "ST");
            case "4-2-3-1":
                return Arrays.asList("GK", "RB", "CB", "CB", "LB", "CDM", "CDM", "CAM", "RW", "LW", "ST");
            case "3-4-3":
                return Arrays.asList("GK", "CB", "CB", "CB", "RM", "CM", "CM", "LM", "RW", "ST", "LW");
            case "5-3-2":
                return Arrays.asList("GK", "RWB", "CB", "CB", "CB", "LWB", "CM", "CM", "CAM", "ST", "ST");
            case "4-1-4-1":
                return Arrays.asList("GK", "RB", "CB", "CB", "LB", "CDM", "RM", "CM", "CM", "LM", "ST");
            default:
                System.out.println("⚠️ Unknown formation. Defaulting to 4-4-2.");
                return Arrays.asList("GK", "RB", "CB", "CB", "LB", "RM", "CM", "CM", "LM", "ST", "ST");
        }
    }
}
