package entity.creature;

import entity.AEntity;

public class slimeball extends AEntity {
    
    public slimeball(int lvl) {
        this.name = "slimeball";
        this.level = lvl;
        this.stat = new creatureStat();
        this.stat.accuracy = stat.scaleStat(this.stat.accuracy, lvl);
        this.stat.attack = stat.scaleStat(this.stat.attack, lvl);
        this.stat.defense = stat.scaleStat(this.stat.defense, lvl);
        this.stat.hitpoints = stat.scaleStat(this.stat.hitpoints, lvl);
        this.stat.speed = stat.scaleStat(this.stat.speed, lvl);
        this.stat.weight = stat.scaleStat(this.stat.weight, lvl);
    }

        
}
