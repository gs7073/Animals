package com.example.animals.Q1;

class Fish extends Animal
{
    Fish(String name)
    {
        super(name);
    }

    @Override
    public String makeSound()
    {
        return "bloop";
    }

    @Override
    public String move()
    {
        return "swim (cant move on land)";
    }

    @Override
    public String eat()
    {
        return "plankton";
    }
}
