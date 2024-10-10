package model;

public abstract class Insect extends Animal{
    private Boolean canFly;
    private Boolean isDangerous;

    public Insect(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
        super(nrOfLegs, name);
        this.canFly = canFly;
        this.isDangerous = isDangerous;
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    public Boolean getDangerous() {
        return isDangerous;
    }

    public void setDangerous(Boolean dangerous) {
        isDangerous = dangerous;
    }
}
