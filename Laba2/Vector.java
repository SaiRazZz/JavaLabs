package com.company;

import java.util.Arrays;

public class Vector {
    private double[] vector;

    public Vector(int length) {
        vector = new double[length];
    }

    public double get(int index) {
        return vector[index];
    }

    public void set(int index, double value) {
        vector[index] = value;
    }

    public int getLength() {
        return vector.length;
    }
    public void setVectorValue (double[] vect) {

        for (var j = 0; j < vect.length; ++j)
        {

            vector[j] =  vect[j];
        }

    }

    public double getMin() {
        var min = vector[0];

        for (var item : vector) {
            if (item < min) {
                min = item;
            }
        }

        return min;
    }

    public double getMax() {
        var max = vector[0];

        for (var item : vector) {
            if (item > max) {
                max = item;
            }
        }

        return max;
    }

    public void sort() {
        for (var i = 0; i < vector.length - 1; ++i) {
            for (var j = 0; j < vector.length - i - 1; ++j) {
                if (vector[j] > vector[j + 1]) {
                    var temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }

    public double norm() {
        var norm = 0;
        for (var item : vector) {
            norm += item * item;
        }
        return Math.sqrt(norm);
    }

    public Vector multiply(double k) {
        double[] array = new double[vector.length];
        Vector result = new Vector(vector.length);
        for (var i = 0; i < vector.length; ++i) {
            array[i]= vector[i] * k;

        }
        result.setVectorValue(array);
        return result;
    }


    public Vector sum(double[] vect) {
        double[] array = new double[vector.length];

        Vector pasha = new Vector(vector.length);

        for (var i = 0; i < vector.length; ++i) {
            array[i] = vector[i] + vect[i];
        }
        pasha.setVectorValue(array);
        return pasha;
    }

    public Vector scalar(double[] vect) {
        double[] array = new double[vector.length];
        Vector result = new Vector(vector.length);


        for (var i = 0; i < vector.length; ++i) {
            array[i] = vector[i] *= vect[i];
        }
        result.setVectorValue(array);
        return result;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "vector=" + Arrays.toString(vector) +
                '}';
    }
}