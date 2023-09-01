
public class Character {
    private String name;
    private int health;
    private String position;

    public Character(String name, int health, String position) {
        this.name = name;
        this.health = health;
        this.position = position;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	  public void takeDamage(int damage) {
	        health -= damage;
	        if (health <= 0) {
	        }
	  }

	public boolean isDefeated() {
		return health <= 0;
		
	}

	public int getCurrentX() {
		return 0;
	}

	public int getCurrentY() {
		return 0;
	}
}
