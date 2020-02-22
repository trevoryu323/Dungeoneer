package entity.creature;

import entity.ACreature;
import entity.creatureStat;

public class ghast extends ACreature {
    
    public ghast(int lvl) {
        this.name = "ghast";
        this.level = lvl;
        this.stat = new creatureStat();
        this.stat.accuracy = stat.scaleStat(1, lvl);
        this.stat.attack = stat.scaleStat(1, lvl);
        this.stat.defense = stat.scaleStat(1, lvl);
        this.stat.hitpoints = stat.scaleStat(1, lvl);
        this.stat.speed = stat.scaleStat(1, lvl);
        this.stat.weight = stat.scaleStat(1, lvl);
    }

        
}
