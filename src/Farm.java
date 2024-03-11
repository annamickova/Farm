import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> flowers;
    private ArrayList<Animal> animals;

    public Farm() {
        this.flowers = new ArrayList<>();
        this.animals = new ArrayList<>();
    }

    private boolean isPlanted(Flower flower){
        boolean planted = false;
        for (int i = 0; i < flowers.size()-1; i++) {
            if (flowers.get(i).equals(flower)){
                planted = true;
            }
        }
        return planted;
    }

    private double fitsIntoGarden(){
        double remainigPlace = 100;
        for (int i = 0; i < flowers.size()-1; i++) {
            remainigPlace -= flowers.get(i).neededArea;
        }
        return remainigPlace;
    }
    public void plant(Flower flower){
        if (fitsIntoGarden() != 0) flowers.add(flower);
    }

    public void water(Flower flower){
        if (isPlanted(flower)) flower.chanceOfGrowth += 10;

    }

    @Override
    public String toString() {
        return "\nFarm" +
                "\nflowers: " + flowers +
                "\nanimals: " + animals;
    }
}
