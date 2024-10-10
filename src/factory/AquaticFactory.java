package factory;

import model.*;

public class AquaticFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Aquatics.CAECILIAN.equals(type)) {
            return new Caecilian();
        } else if (Constants.Animals.Aquatics.FROG.equals(type)) {
            return new Frog();
        } else if (Constants.Animals.Aquatics.SALAMANDER.equals(type)) {
            return new Salamander();
        } else {
            throw new Exception("Invalid animal exception!");
        }
    }
}
