package controller;

import factory.AnimalFactory;
import factory.SpeciesFactory;
import model.*;

public class MainController {
    public static void main(String[] args) throws Exception {
        AnimalFactory abstractFactory = new AnimalFactory();

        SpeciesFactory mamalSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
        Animal lorenzoTheCow = mamalSpeciesFactory.getAnimal(Constants.Animals.Mammals.COW);
        System.out.printf("%s has %d legs!\n", lorenzoTheCow.getName(),lorenzoTheCow.getNrOfLegs());

        SpeciesFactory reptileSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
        Animal toniTheTurtle = reptileSpeciesFactory.getAnimal(Constants.Animals.Reptiles.TURTLE);
        if (toniTheTurtle instanceof Reptile) {
            Reptile turtleToni = (Reptile) toniTheTurtle;
            if (turtleToni.isLaysEggs()) {
                System.out.printf("%s lays eggs!\n", turtleToni.getName());
            } else {
                System.out.printf("%s does not lay eggs!\n", turtleToni.getName());
            }
        }

        SpeciesFactory birdSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
        Animal pamThePenguin = birdSpeciesFactory.getAnimal(Constants.Animals.Birds.PENGUIN);
        if (pamThePenguin instanceof Bird) {
            Bird penguinPam = (Bird) pamThePenguin;
            if (penguinPam.getMigrates()) {
                System.out.printf("%s does migrate!\n", penguinPam.getName());
            } else {
                System.out.printf("%s does not migrate!\n", penguinPam.getName());
            }
        }

        Animal owenTheOwl = birdSpeciesFactory.getAnimal(Constants.Animals.Birds.OWL);
        if (owenTheOwl instanceof Bird) {
            Bird owlOwen = (Bird) owenTheOwl;
            System.out.printf("%s has average flight altitude at %d meters\n", owlOwen.getName(), owlOwen.getAvgFlightAltitude());
        }

        SpeciesFactory aquaticSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
        Animal pepeTheFrog = aquaticSpeciesFactory.getAnimal(Constants.Animals.Aquatics.FROG);
        if (pepeTheFrog instanceof Aquatic) {
            Aquatic frogPepe = (Frog) pepeTheFrog;
            System.out.printf("%s lives in %s\n", frogPepe.getName(), frogPepe.getWaterType());
         }

        SpeciesFactory insectsSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
        Animal fifiTheButterfly = insectsSpeciesFactory.getAnimal(Constants.Animals.Insects.BUTTERFLY);
        if (fifiTheButterfly instanceof Insect) {
            Insect butterflyFifi = (Insect) fifiTheButterfly;
            if (butterflyFifi.getDangerous()) {
                System.out.printf("%s is dangerous!\n", butterflyFifi.getName());
            } else {
                System.out.printf("%s is not dangerous!\n", butterflyFifi.getName());
            }
        }

    }
}
