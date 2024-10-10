package model;

public class Turtle extends Reptile{
    public Turtle(Integer nrOfLegs, String name, boolean laysEggs) {
        super(nrOfLegs, name, laysEggs);
    }

    public Turtle(){
        super(4, "Turtle", true);
    }
}
