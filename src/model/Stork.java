package model;

public class Stork extends Bird{
    public Stork(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }

    public Stork(){
        super(2,"Stork", true, 4800);
    }
}
