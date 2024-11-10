package model;

public class Monkey extends Mammal{
    public Monkey(Integer nrOfLegs, String name, float normalBodyTemperature, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemperature, percBodyHair);
    }

    public Monkey(){
        super(2, "Monkey", 37, 70);
    }
}
