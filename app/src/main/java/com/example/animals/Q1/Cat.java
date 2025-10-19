package com.example.animals.Q1;

class Cat extends Animal
{
    Cat(String name)
    {
        super(name);
    }

    @Override
    public String makeSound()
    {
        return "meow";
    }

    @Override
    public String move()
    {
        return "sneak";
    }

    @Override
    public String eat()
    {
        return "fish";
    }
}
