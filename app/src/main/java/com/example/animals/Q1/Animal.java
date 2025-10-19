package com.example.animals.Q1;

public abstract class Animal
{
    String name;

    Animal(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }

    public abstract String makeSound();

    public abstract String move();

    public abstract String eat();
}
