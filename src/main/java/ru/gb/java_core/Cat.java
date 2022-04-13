package ru.gb.java_core;

public class Cat {

    private String name;
    private int appetite;
    private boolean eaten;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.eaten = false;
    }

    public void eat(Bowl bowl) {
        bowl.decreaseFood(appetite);
        this.eaten = bowl.getFoodEnough();
        if (this.eaten) {
            System.out.printf("Cat %s has eaten %d food\n", name, appetite);
        } else {
            System.out.printf("Cat %s hasn't eaten food\n", name);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", eaten=" + eaten +
                '}';
    }

}
