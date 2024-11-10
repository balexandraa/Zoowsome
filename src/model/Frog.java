package model;

public class Frog extends Aquatic{
    public Frog(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }

    public Frog(){
        super(4, "Frog", 2, WaterType.FRESHWATER);
    }
}
