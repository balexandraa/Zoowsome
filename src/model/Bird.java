package model;

public abstract class Bird extends Animal{
    protected Boolean migrates;
    protected Integer avgFlightAltitude;

    public Bird(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
        super(nrOfLegs, name);
        this.migrates = migrates;
        this.avgFlightAltitude = avgFlightAltitude;
    }

    public Boolean getMigrates() {
        return migrates;
    }

    public void setMigrates(Boolean migrates) {
        this.migrates = migrates;
    }

    public Integer getAvgFlightAltitude() {
        return avgFlightAltitude;
    }

    public void setAvgFlightAltitude(Integer avgFlightAltitude) {
        this.avgFlightAltitude = avgFlightAltitude;
    }
}
