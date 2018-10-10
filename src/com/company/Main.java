package com.company;

public class Main {

    public static void main(String[] args) {

        CrazyMathProfezzor crazyMathProfezzor = new CrazyMathProfezzor();

        double[] myArray = new double[3];
        myArray[0] = 3.14;
        myArray[1] = 3.33333;
        myArray[2] = 777;
        System.out.println(crazyMathProfezzor.add(myArray));

        System.out.println(crazyMathProfezzor.isPrimeNumber(17));


    }
}
