import java.util.*;

public class Ass02_Craps {
    public static void main(String[] args) {

        Random AIRANDOM = new Random();
        ArrayList<String> AIMOVES = new ArrayList<>();
        Scanner UserInput = new Scanner(System.in);

        String Name = "";
        String Player1 = "";
        String Player2 = "AI";
        String AIMOVE = "";

        // Add the possible moves for the game
        AIMOVES.add("R");
        AIMOVES.add("P");
        AIMOVES.add("S");

        // Get player 1 name and move
        Name = SafeInput.getNonZeroLenString(UserInput, "Player 1: Enter your name: ");
        Player1 = SafeInput.getRegExString(UserInput, "Enter your move (R/P/S): ", "R|P|S");

        // Get the AI's move
        int randomIndex = AIRANDOM.nextInt(AIMOVES.size());
        String RandomELEMENT = AIMOVES.get(randomIndex);

        // Determine the winner
        if (Player1.equalsIgnoreCase("R") && RandomELEMENT.equalsIgnoreCase("S")) {
            System.out.println(Name + ": You win!");
        } else if (Player1.equalsIgnoreCase("R") && RandomELEMENT.equalsIgnoreCase("P")) {
            System.out.println(Player2 + ": You win!");
        } else if (Player1.equalsIgnoreCase("P") && RandomELEMENT.equalsIgnoreCase("S")) {
            System.out.println(Player2 + ": You win!");
        } else if (Player1.equalsIgnoreCase("R") && RandomELEMENT.equalsIgnoreCase("R")) {
            System.out.println("Tie!");
        } else if (Player1.equalsIgnoreCase("P") && RandomELEMENT.equalsIgnoreCase("P")) {
            System.out.println("Tie!");
        } else if (Player1.equalsIgnoreCase("S") && RandomELEMENT.equalsIgnoreCase("S")) {
            System.out.println("Tie!");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
