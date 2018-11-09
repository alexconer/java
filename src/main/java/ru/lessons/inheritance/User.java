package ru.lessons.inheritance;

/**
 * Created by ShishkinA on 27.07.2018.
 */
public class User {
    public String name;
    private double salary;

    public User(String name){
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}
