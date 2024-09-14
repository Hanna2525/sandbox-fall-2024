package com.sandbox.exception;

public class calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int... b) {
        int sum = a;
        for (int i : b) {
            sum += i;

        }
        return sum;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;

    }

    public static int divide(int a, int b) {
        int returnValue = 0;
        try {
            returnValue = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Can't divide by zero");
        }
        reture retureValue;
    }

    public float divide(float a, float b) throws DivideByZeroExcdeption {
        if (b == 0.0) {
            throw new DivideByZeroExcdeption();
    }
 return a /b;
}

    public static void main(String[] args) {
     System.out.println(divide (5,0));
     System.out.println(divide(5.0f, 0.0f));

     }

    }
}
