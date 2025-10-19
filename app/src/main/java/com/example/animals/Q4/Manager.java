package com.example.animals.Q4;


class Manager extends Employee
{
    double bonus;

    Manager(String name, double baseSalary, double bonus)
    {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary()
    {
        return baseSalary + bonus;
    }

    @Override
    public String getDetails()
    {
        return "Manager: " + name + ",  base salary=" + baseSalary + ", bonus=" + bonus;
    }

    @Override
    public String performTask()
    {
        return "Manage";
    }
}