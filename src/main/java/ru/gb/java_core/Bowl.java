package ru.gb.java_core;

public class Bowl {

    private int foodAmount;
    private boolean foodEnough;

    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.printf("Food increased by %d pts, there is now %d\n", amount, foodAmount);
    }

    public void decreaseFood(int amount) {
        if (this.foodAmount - amount < 0) {
            System.out.println("Food can't be negative");
            this.foodEnough = false;
            return;
        }
        this.foodAmount -= amount;
        this.foodEnough = true;
    }

    public void addFood(int amount) {
        this.foodAmount += amount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public boolean getFoodEnough() {
        return foodEnough;
    }
}
