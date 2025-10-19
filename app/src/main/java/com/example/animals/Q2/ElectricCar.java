package com.example.animals.Q2;

class ElectricCar extends Car
{
    ElectricCar(String name)
    {
        super(name);
    }

    @Override
    public String accelerate()
    {
        return "electric boost";
    }
}