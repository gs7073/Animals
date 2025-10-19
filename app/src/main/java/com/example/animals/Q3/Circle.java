package com.example.animals.Q3;

    class Circle extends Shape
    {
        double radius;

        Circle(double radius)
        {
            this.radius = radius;
        }

        @Override
        public double calculateArea()
        {
            return 3.14 * radius * radius;
        }

        @Override
        public double calculatePerimeter()
        {
            return 2 * 3.14 * radius;
        }
    }


