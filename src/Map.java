
public class Map {
    private int x;
    private int y;
    private int currentX = 0;
    private int currentY = 0;
    private boolean[][] mines;
    private int health;

    public Map(int x, int y) {
        this.x = x;
        this.y = y;
        mines = new boolean[x][y];
    }


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCurrentX() {
		return currentX;
	}

	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}

	public int getCurrentY() {
		return currentY;
	}

	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}
	
	public void move(String direction, Character player) {
        if (direction.equals("N")) {
            currentY = (currentY - 1 + y) % y;
        } else if (direction.equals("E")) {
            currentX = (currentX + 1) % x;
        } else if (direction.equals("S")) {
            currentY = (currentY + 1) % y;
        } else if (direction.equals("W")) {
            currentX = (currentX - 1 + x) % x;
        }
       
        if (mines[currentX][currentY]) {
        	System.out.println("Oops! You stepped on a mine!");
            player.takeDamage(50);
            System.out.println("Your health: " + player.getHealth());

        }
	}
	
    public void placeMines(int[][] minePositions) {
    	for (int[] position : minePositions) {
    		int mineX = position[0];
    		int mineY = position[1];
    		mines[mineX][mineY] = true;
        
    	}
    }
    	
    	public void printMap(Character player) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (i == player.getCurrentX() && j == player.getCurrentY()) {
                        System.out.print("P "); // Player Pos
                    } else if (mines[i][j]) {
                        System.out.print("X "); // The mines 
                    } else {
                        System.out.print(". "); // Other place in the map 
                    }
                }
                System.out.println();
            }
    }
}
	
        

