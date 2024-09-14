package com.sandbox.Generics;

public class Box <T>{
    private T contents;

    public Box() {

    }
    public T getContents() {
        return contents;
    }
    public void setContents(T contents);
}
