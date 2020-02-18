package entity;

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
}