package model;

public abstract class Animal {
    protected Integer nrOfLegs;
    protected String name;

    public Animal(Integer nrOfLegs, String name) {
        this.nrOfLegs = nrOfLegs;
        this.name = name;
    }

    public Integer getNrOfLegs() {
        return nrOfLegs;
    }

    public void setNrOfLegs(Integer nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
