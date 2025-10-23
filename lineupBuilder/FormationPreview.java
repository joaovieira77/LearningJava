package lineupBuilder;

public class FormationPreview {
    public static void display(String formation) {
        System.out.println("\n📋 Formation Preview: " + formation);
        switch (formation) {
        case "4-3-3":
            System.out.println("        ST");
            System.out.println("RW              LW");
            System.out.println("   CM   CM   CM");
            System.out.println("LB   CB   CB   RB");
            System.out.println("        GK");
            break;
        case "4-4-2":
            System.out.println("     ST       ST");
            System.out.println("   LM   CM   CM   RM");
            System.out.println("   LB   CB   CB   RB");
            System.out.println("          GK");
            break;
        case "3-5-2":
            System.out.println("    ST       ST");
            System.out.println("RM  CM  CAM  CM  LM");
            System.out.println("   CB   CB   CB");
            System.out.println("       GK");
            break;
        case "4-2-3-1":
            System.out.println("     ST");
            System.out.println("RW   CAM   LW");
            System.out.println("  CDM  CDM");
            System.out.println("LB   CB   CB   RB");
            System.out.println("       GK");
            break;
        case "3-4-3":
            System.out.println("RW     ST     LW");
            System.out.println("RM  CM   CM  LM");
            System.out.println("  CB   CB   CB");
            System.out.println("       GK");
            break;
        case "5-3-2":
            System.out.println("     ST      ST");
            System.out.println("     CM  CM  CM");
            System.out.println("LWB  CB  CB  CB  RWB");
            System.out.println("         GK");
            break;
        case "4-1-4-1":
            System.out.println("       ST");
            System.out.println("LM  CM  CM  RM");
            System.out.println("      CDM");
            System.out.println("LB   CB   CB   RB");
            System.out.println("       GK");
            break;
        default:
            System.out.println("Unknown formation. No preview available.");
    }
}

}