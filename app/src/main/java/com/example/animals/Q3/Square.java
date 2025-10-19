package com.example.animals.Q3;

class Square extends Shape
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    @Override
    public double calculateArea()
    {
        return side * side;
    }

    @Override
    public double calculatePerimeter()
    {
        return 4 * side;
    }
}
