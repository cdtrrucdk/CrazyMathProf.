package com.company;

public class CrazyMathProfezzor {

    public String firstName;
    public String lastName;
    public int favoritePrimeNumber;


    public int add(int x, int y)
    {
        return x + y;
    }

    public double add(double d1, double d2)
    {
        return d1+d2;
    }


    public int add(int[] numbers)
    {
        return 1;
    }

    public double add(double[] numbers)
    {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }

        return sum;
    }

    public boolean isPrimeNumber (int number) {

        for (int i = 2; i < number; i++)
        {
            if (number%i == 0) return false;
        }

        return true;
    }


}
