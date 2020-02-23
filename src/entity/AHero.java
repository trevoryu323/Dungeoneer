package entity;

// represents a Hero
public abstract class AHero extends AEntity {
    String plateRank;
    int exp;
    public boolean flee;
    
    // determine if the hero flees combat
    void flee() {
        this.flee = true;
    }

}