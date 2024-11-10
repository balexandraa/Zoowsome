package model;

public class Tiger extends Mammal{
    public Tiger(Integer nrOfLegs, String name, float normalBodyTemperature, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemperature, percBodyHair);
    }

    public Tiger(){
        super(4,"Tiger", 39, 90);
    }
}
