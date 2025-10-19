package com.example.animals.Q4;

class Salesperson extends Employee
{
    double salesAmount;
    double commissionRate;

    Salesperson(String name, double baseSalary, double salesAmount, double commissionRate)
    {
        super(name, baseSalary);
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateSalary()
    {
        return baseSalary + (salesAmount * commissionRate);
    }

    @Override
    public String getDetails()
    {
        return "Salesperson: " + name + ", base salary=" + baseSalary + ", sales=" + salesAmount;
    }

    @Override
    public String performTask()
    {
        return "Selling ";
    }
}