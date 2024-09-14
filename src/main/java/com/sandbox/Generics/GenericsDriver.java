package com.sandbox.Generics;

public class GenericsDriver {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        IntegerBox. setContents(42);
        System.out.println(integerBox);

        DoubleBox doubleBox = new DoubleBox();
        doubleBox.setContents(42.0);
        System.out.println(doubleBox);

        Box<Integer> integerBox2 = new Box<>();
        integerBox2. setContents(42);
        System.out.println(integerBox2);

        Box<Double> doubleBox2 = new Box<>();
        doubleBox2.setContent(42.0);
        System.out.println(doubleBox2);
    }
}
