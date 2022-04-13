package ru.gb.java_core;

public class Main {

    public static void main(String args[]) {

        Cat[] cat = {new Cat("Barsik", 100),
            new Cat("Molly", 30),
            new Cat("Oscar", 55),
            new Cat("Kitty", 45)};

        Bowl bowl = new Bowl();
        bowl.putFood(180);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(bowl);
            System.out.println(cat[i].toString());
        }

        System.out.println(bowl.getFoodAmount());

    }
}
