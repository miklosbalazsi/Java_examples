package com.example.generics;import com.example.generics.Box;public class Main {    public static void main(String[] args) {        Box<Integer> integerBox = new Box<Integer>();        // JAVA7 diamond operator, compiler determines the type of the parameter.        Box<String> stringBox = new Box<>();        integerBox.setT(5);        stringBox.setT("ASDF");        System.out.println(integerBox.getT());        System.out.println(stringBox.getT());    }}