package model;

public class Penguin extends Bird{
    public Penguin(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }

    public Penguin(){
        super(2, "Penguin", false, 0);
    }
}
