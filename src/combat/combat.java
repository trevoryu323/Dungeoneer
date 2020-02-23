package combat;

import entity.ACreature;
import entity.AHero;

// represents the combat system
public class combat {
    AHero hero;
    ACreature creature;

    combat(AHero hero, ACreature creature) {
        this.hero = hero;
        this.creature = creature;
    }

    // represents the loop for the combat logic
    // return false if a hero or creature has less than 0 hitpoints OR if flee() returns true
    boolean inProgress() {
        return (this.hero.stat.hitpoints > 0) && (this.creature.stat.hitpoints > 0) && this.hero.flee;
    }
}