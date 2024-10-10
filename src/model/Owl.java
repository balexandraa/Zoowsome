package model;

public class Owl extends Bird{
    public Owl(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }

    public Owl(){
        super(2,"Owl", false, 30);
    }
}
