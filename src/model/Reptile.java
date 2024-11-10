package model;

public abstract class Reptile extends Animal{
    protected boolean laysEggs;

    public Reptile(Integer nrOfLegs, String name, boolean laysEggs) {
        super(nrOfLegs, name);
        this.laysEggs = laysEggs;
    }

    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }
}
