package entity;

// represents an Entity
public abstract class AEntity {
    protected String name; // entity names
    protected int level;  // entity's level
    public AStats stat;  // entity's stats


    // Returns a formatted string of the Entity fields
	public String inspect() {
        return "\nName: " + name +
        "\nLevel: " + level +
        "\nStats: " + stat.inspectStats();
	}

} 