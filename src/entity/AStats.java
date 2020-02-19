package entity;

// this class represents the shared stat attributes between all Entities
// including creatures and heroes

public abstract class AStats {
    public int accuracy;  // chance to hit
    public int attack;  // maximum hit
    public int defense;  // chance to block
    public int hitpoints;  // total hitpoints
    public int speed;  // chance to attack first
    public int weight;  // base weight

    // this method allows stats to be scaled dependent on level
    public int scaleStat(int stat, int level) {
        return stat = stat + (level * 5);
    }

    // returns the formatted string of Stat fields.
	public String inspectStats() {
        return "\n\tAccuracy: " + this.accuracy +
        "\n\tAttack: " + this.attack +
        "\n\tDefense: " + this.defense +
        "\n\tHitpoints: " + this.hitpoints +
        "\n\tSpeed: " + this.speed + 
        "\n\tWeight: " + this.weight;
	}
}