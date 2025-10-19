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
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter()
        {
            return 2 * Math.PI * radius;
        }
    }


