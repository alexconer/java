package ru.lessons.inheritance;

/**
 * Created by ShishkinA on 27.07.2018.
 */
public class Manager extends User {

    private double bonus;

    public Manager(String name) {
        super(name);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}

class Assistant extends User {

    private Manager manager;

    public Assistant(String name, Manager m){
        super(name);
        manager = m;
    }
}
