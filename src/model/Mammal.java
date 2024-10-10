package model;

public abstract class Mammal extends Animal{
    protected float normalBodyTemperature;
    protected float percBodyHair;

    public Mammal(Integer nrOfLegs, String name, float normalBodyTemperature, float percBodyHair) {
        super(nrOfLegs, name);
        this.normalBodyTemperature = normalBodyTemperature;
        this.percBodyHair = percBodyHair;
    }

    public float getNormalBodyTemperature() {
        return normalBodyTemperature;
    }

    public void setNormalBodyTemperature(float normalBodyTemperature) {
        this.normalBodyTemperature = normalBodyTemperature;
    }

    public float getPercBodyHair() {
        return percBodyHair;
    }

    public void setPercBodyHair(float percBodyHair) {
        this.percBodyHair = percBodyHair;
    }
}
