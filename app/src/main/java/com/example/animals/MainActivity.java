package com.example.animals;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}

abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name; }
    String getName() {
        return name; }
    abstract String makeSound();
    abstract String move();
    abstract String eat();
}

class Dog extends Animal {
    Dog(String name) {
        super(name); }
    String makeSound() {
        return "woof"; }
    String move() {
        return "run"; }
    String eat() {
        return "meat"; }
}

class Cat extends Animal {
    Cat(String name) {
        super(name); }
    String makeSound() {
        return "meow"; }
    String move() {
        return "sneak"; }
    String eat() {
        return "fish"; }
}

class Bird extends Animal {
    Bird(String name) {
        super(name); }
    String makeSound() {
        return "tweet"; }
    String move() {
        return "fly"; }
    String eat() {
        return "seeds"; }
}

class Fish extends Animal {
    Fish(String name) {
        super(name); }
    String makeSound() {
        return "bubble"; }
    String move() {
        return "swim"; }
    String eat() {
        return "plankton"; }
}
