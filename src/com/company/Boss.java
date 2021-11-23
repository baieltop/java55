package com.company;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossDefence;

    public Boss(int bossHealth, int bossDamage, String bossDefence) {
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
        this.bossDefence = bossDefence;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }
}



