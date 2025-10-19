package com.example.animals.Q4;


abstract class Employee
{
    String name;
    double baseSalary;

    Employee(String name, double baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName()
    {
        return name;
    }

    public abstract double calculateSalary();

    public abstract String getDetails();

    public abstract String performTask();
}
