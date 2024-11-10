package model;

public class Lizard extends Reptile{
    public Lizard(Integer nrOfLegs, String name, boolean laysEggs) {
        super(nrOfLegs, name, laysEggs);
    }

    public Lizard(){
        super(4, "Lizard", false);
    }
}
