package OOPsTelusku;

import java.sql.SQLOutput;

// A is the superclass and B is the subclass here
class A extends Object{ // if we write object or don't write it. It is always there
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }
    // NOTE - Every Constructor in Java has a method which is there and that method is 'super()'
    // So every constructor will have super
}
class B extends A {
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){ // it comes in the method
        this(); // super method simply means call the costructor method of the super class -- goes to line 11
        // if we put n in super(), It will be parameterised and will be sent to Class A where method is parameterised
        System.out.println("in B int");
    }
}
public class thisAndSuper {
    public static void main(String[] args) {
        B obj = new B(5); // when we do this, it goes to line 23
    }
}

// now we did from B to A, but then what will happen if we do super() in class A...
// Always remember, Every class in java extends to the 'Object' class

// So whenever we see super then that means we are calling the  constructor of the Object class

// now what is "this"

// So if we want both the constructor (Parameterised and Default), so can we call them with just one object?

// So in the constructor we did super(), but if we want to call the constructor of the same class then
// we have to write 'this()' instead of 'super()'

