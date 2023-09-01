
import java.util.Scanner;

public class TextGame {
    public static void main(String[] args) {
        Map gameMap = new Map(10, 10);
        int[][] minePositions = {
        	    {1, 1},
        	    {2, 3},
        	    {4, 2},
        	    {5, 8},
        	    {8, 2},
        	    {5, 6}
        	};

        	gameMap.placeMines(minePositions);
        Character player = new Character("Jeevan", 100, "Good");
        Character ai = new Character("Chester", 100, "Evil");
        Scanner scan = new Scanner(System.in);

        while (true) {
        	
            System.out.println("You are at position (" + gameMap.getCurrentY() + ", " + gameMap.getCurrentX() + ")");
            System.out.print("Enter direction (N/E/S/W): ");
            String direction = scan.nextLine().toUpperCase();
            gameMap.move(direction, player);
            
            try {
                System.out.print("Enter direction (N/E/S/W): ");
                String direction1 = scan.nextLine().toUpperCase();

                // Validate direction input
                if (!direction1.matches("[NESW]")) {
                    throw new IllegalArgumentException("Invalid direction. Please enter N, E, S, or W.");
                }


            
            if (player.isDefeated()) {
                System.out.println("Game over! you stepped on too many mines :( TRY AGAIN :(.");
                break;
            }

            if (gameMap.getCurrentX() == 4 && gameMap.getCurrentY() == 4) {
                System.out.println("WELL DONE YOU FOUND THE TREASURE YOUR RICH :)");
                break;
            }
            
            }catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } 
        
        gameMap.printMap(player);
        
        }
    }
}