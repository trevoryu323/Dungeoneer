package entity.creature;

import entity.ACreature;
import entity.creatureStat;

public class draugr extends ACreature {
    
    public draugr(int lvl) {
        this.name = "draugr";
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
