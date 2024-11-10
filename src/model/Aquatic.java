package model;

public abstract class Aquatic extends Animal{
    protected Integer avgSwimDepth;

    public enum WaterType {
        SALTWATER,
        FRESHWATER
    }
    protected WaterType  waterType;

    public Aquatic(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
        super(nrOfLegs, name);
        this.avgSwimDepth = avgSwimDepth;
        this.waterType = waterType;
    }

    public Integer getAvgSwimDepth() {
        return avgSwimDepth;
    }

    public void setAvgSwimDepth(Integer avgSwimDepth) {
        this.avgSwimDepth = avgSwimDepth;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }
}
