/**
 * First Generics class
 */
package com.example.generics;

public class Box<T> {

    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
