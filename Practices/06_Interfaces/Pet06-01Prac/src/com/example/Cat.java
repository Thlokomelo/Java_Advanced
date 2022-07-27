/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author thlok
 */
public class Cat extends Animal implements Pet {

    //String field created
    private String name;

    //created constructor that receives a name String and passes a value of 4 to the parent constructor
    public Cat(String name) {
        super(4);
        this.name = name;
    }

    //craeted getter and setter methods for the name field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //created a no-argument constructor that passes a value of "Fluffy" to the other constructor in this class
    public Cat() {
        this("Fluffy");
    }

    //created method that prints out name + " likes to play with string."
    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    }

   //created method that prints out name + " likes to play with string."
  @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }
            
            
}
