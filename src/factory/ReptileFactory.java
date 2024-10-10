package factory;

import model.*;

public class ReptileFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Reptiles.TURTLE.equals(type)) {
            return new Turtle();
        } else if (Constants.Animals.Reptiles.LIZARD.equals(type)) {
            return new Lizard();
        } else if (Constants.Animals.Reptiles.DINOSAUR.equals(type)) {
            return new Dinosaur();
        } else {
            throw new Exception("Invalid animal exception!");
        }
    }
}
