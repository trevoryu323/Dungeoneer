package entity.heroes;

import entity.AHero;
import entity.heroStat;

public class goblin extends AHero{

    public goblin(int lvl) {
        this.name = "goblin";
        this.level = lvl;
        this.stat = new heroStat();
        this.stat.accuracy = stat.scaleStat(1, lvl);
        this.stat.attack = stat.scaleStat(1, lvl);
        this.stat.defense = stat.scaleStat(1, lvl);
        this.stat.hitpoints = stat.scaleStat(1, lvl);
        this.stat.speed = stat.scaleStat(1, lvl);
        this.stat.weight = stat.scaleStat(1, lvl);
    }

    
}

