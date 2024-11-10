package model;

public class Salamander extends Aquatic{
    public Salamander(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }

    public Salamander(){
        super(4, "Salamander", 1, WaterType.FRESHWATER);
    }
}
