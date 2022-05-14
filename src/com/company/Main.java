package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal eagle = new Eagle();
        Animal turtle = new Turtle();
        Animal shark = new Shark();

        Eagle[] eagles=new Eagle[8];
        Turtle[] turtles=new Turtle[8];
        Shark[] sharks=new Shark[8];




        Animal[] animals = {eagle, turtle, shark};
        for (Animal animal1 : animals) {
            if (animal1 instanceof Eagle) {
                ((Eagle) animal1).fly();
                System.out.println(eagle.getClass());
                eagles[0]= (Eagle) animal1;
            } else if (animal1 instanceof Turtle) {
                ((Turtle) animal1).swim();
                System.out.println(turtle.getClass());
                turtles[0]=(Turtle) animal1;
            } else if (animal1 instanceof Shark) {
                ((Shark) animal1).attack();
                System.out.println(shark.getClass());
                sharks[0] = (Shark)animal1;
            }
        }
    }
}