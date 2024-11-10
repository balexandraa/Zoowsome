package model;

public class Cow extends Mammal{
    public Cow(Integer nrOfLegs, String name, float normalBodyTemperature, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemperature, percBodyHair);
    }

    public Cow(){
        super(4, "Cow", 38, 75);
    }
}
