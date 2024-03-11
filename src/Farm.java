import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> flowers;
    private ArrayList<Animal> animals;
    private double farmSize;

    public Farm() {
        this.flowers = new ArrayList<>();
        this.animals = new ArrayList<>();
        this.farmSize = 100;
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

    public void plant(Flower flower){
        if (farmSize-flower.neededArea > 0) {
            flowers.add(flower);
            farmSize -= flower.neededArea;
        }else {
            System.out.println("flower can not be added");
        }
    }

    public boolean flowerKind(Flower flower){
        int count = 5;
        for (int i = 0; i < flowers.size(); i++) {
        }
        return true;
    }

    public void water(Flower flower){
        if (isPlanted(flower)) flower.chanceOfGrowth += 10;

    }
    public void animalCount(){
        for (int i = 0; i < animals.size()-1; i++) {

        }
    }
    public void buyAnimal(Animal animal){
        animals.add(animal);
    }
    public void sellAnimal(Animal animal){
        animals.remove(animal);
    }

    public void pet(Animal animal){
        if (animal.specialCare.equals("pet")){
            System.out.println("this animal likes petting");
        }
    }


    @Override
    public String toString() {
        return "\nFarm" +
                "\nflowers: " + flowers +
                "\nanimals: " + animals +
                "\nremaining place" + farmSize;
    }
}
