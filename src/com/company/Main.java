package com.company;

public class Main {

    public static void main(String[] args) {
        Boss nil=new Boss(700,50,"Magik");
        System.out.println("Boss: " + nil.getBossHealth()+ " "+nil.getBossDamage()+" "+nil.getBossDefence());

        Hero[] heroes=createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Hero:" +heroes[i].getHealth()+ " " +heroes[i].getDamage()+ " " + heroes[i].getSuperpower());

        }

    }


    public static Hero[] createHeroes(){
        Hero stiv=new Hero(100,30,"Physical");
        Hero maikl=new Hero(120,50);
        Hero kill= new Hero(110,20,"Kinetic");
        Hero[] heroes={stiv,maikl,kill };
        return heroes;
    }





}

