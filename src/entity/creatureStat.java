package entity;

import entity.AStats;

public class creatureStat extends AStats {

    // initialize stats for a creature
    public creatureStat() {
        this.accuracy = 1;
        this.attack = 1;
        this.defense = 1;
        this.hitpoints = 1;
        this.speed = 1;
        this.weight = 1;
    }
}