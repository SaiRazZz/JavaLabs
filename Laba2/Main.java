package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input vector length:");
        int length = Integer.parseInt(reader.readLine());

        var vector = new Vector(length);

        System.out.println("Input values line by line:");
        for (int i = 0; i < length; ++i) {
            vector.set(i, Double.parseDouble(reader.readLine()));
        }
        double[] pov = {1.24, 1.50, 3.60};

        System.out.println("Min: " + vector.getMin());
        System.out.println("Max: " + vector.getMax());
        System.out.println("Norm: " + vector.norm());

        System.out.println("Before sort:");
        System.out.println(vector);
        vector.sort();
        System.out.println("After sort:");
        System.out.println(vector);

        System.out.println("multiply"+ vector.multiply(5));


        System.out.println("Sum:");
        vector.sum(pov);
        System.out.println(vector);

        System.out.println("Scalar:");
        vector.scalar(pov);
        System.out.println(vector);
    }
}