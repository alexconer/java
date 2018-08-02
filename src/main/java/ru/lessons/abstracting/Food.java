package ru.lessons.abstracting;

/**
 * Created by ShishkinA on 02.08.2018.
 */
public class Food extends Good {

    public Food(double cost, double weight) {
        super(cost, weight);
    }

    @Override
    public double cost() {
        return getCost();
    }
}
