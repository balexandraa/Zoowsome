package model;

public class Dinosaur extends Reptile{
    public Dinosaur(Integer nrOfLegs, String name, boolean laysEggs) {
        super(nrOfLegs, name, laysEggs);
    }

    public Dinosaur(){
        super(2, "Dinosaur", true);
    }
}
