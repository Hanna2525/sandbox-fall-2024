package com.sandbox.inheritance.vehicle;

public class Truck extends LandCraft {
    @Override
    public void transport() {
        System.out.println("Transporting truck stuff.");

    }

    @Override
    public void accelerate() {
        System.out.println("Truck is accelerating.");

    }
    @Override
    public void run() {
        System.out.println("Truck is running.");//new added
    }
public void horn(){
    System.out.println(" Truck is Honking.");

}
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Truck {");
        sb.append("engineStarted=").append(engineStarted);
        sb.append('}');
        return sb.toString();
    }
}
