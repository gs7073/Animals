package com.example.animals.Q1;

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "woof";
    }

    @Override
    public String move() {
        return "run";
    }

    @Override
    public String eat() {
        return "meat";
    }
}