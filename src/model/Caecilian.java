package model;

public class Caecilian extends Aquatic{
    public Caecilian(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }

    public Caecilian(){
        super(0, "Caecilian", 1, WaterType.FRESHWATER);
    }
}
