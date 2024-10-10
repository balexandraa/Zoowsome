package factory;

import model.*;

public class BirdFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Birds.STORK.equals(type)) {
            return new Stork();
        } else if (Constants.Animals.Birds.OWL.equals(type)) {
            return new Owl();
        } else if (Constants.Animals.Birds.PENGUIN.equals(type)) {
            return new Penguin();
        } else {
            throw new Exception("Invalid animal exception!");
        }
    }
}
