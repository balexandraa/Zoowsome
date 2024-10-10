package model;

public class Spider extends Insect{
    public Spider(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
        super(nrOfLegs, name, canFly, isDangerous);
    }

    public Spider(){
        super(8, "Spider", false, true);
    }
}
