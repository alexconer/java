package ru.lessons.abstracting;

/**
 * Created by ShishkinA on 02.08.2018.
 */
public abstract class Good {
    private double cost;
    private double weight;

    public Good(double cost, double weight){
        this.cost = cost;
        this.weight = weight;
    }

    public abstract double cost();

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public final double getWeight() {
        return weight;
    }
}
