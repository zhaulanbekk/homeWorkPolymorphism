package com.company;

public class Shark extends Animal{
    public Shark() {
    }

    @Override
    public void eat() {
        super.eat();
    }

    void attack(){
        System.out.println("Can attack");
    }
}
