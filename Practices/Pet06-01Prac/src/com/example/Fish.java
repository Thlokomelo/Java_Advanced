/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author thlok
 */
public class Fish extends Animal implements Pet {

    //string field added
    private String name;

    //added getter and setter methods for the name field
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    //added constructor that passes a value of 0 to the parent constructor
    public Fish() {
        super(0);
    }

    // added method that prints out "Just keep swimming."
    @Override
    public void play() {
        System.out.println("Just keep swimming.");
    }

    //added method that prints out "Fish eat pond scum."
    @Override
    public void eat() {
        System.out.println("Fish eat pond scum.");
    }

    //added method that overrides the Animal class walk method
    @Override
    public void walk() {
        super.walk();   //called first before the print
        System.out.println("Fish, of course, can't walk; they swim.");
}
}
