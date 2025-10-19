package com.example.animals.Q4;

class Developer extends Employee
{
    int overtimeHours;
    double overtimeRate;

    Developer(String name, double baseSalary, int overtimeHours, double overtimeRate)
    {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary()
    {
        return baseSalary + (overtimeHours * overtimeRate);
    }

    @Override
    public String getDetails()
    {
        return "Developer: " + name + ", base salary=" + baseSalary + ", overtime hours=" + overtimeHours;
    }

    @Override
    public String performTask()
    {
        return "Develop";
    }
}
