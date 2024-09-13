package com.sandbox.inheritance.vehicle;

public class Car extends LandCraft {

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
    @Override
    public void run() {
        System.out.println("Car is running.");
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car {");
        sb.append("engineStarted=").append(engineStarted);
        sb.append('}');
        return sb.toString();
    }
}


