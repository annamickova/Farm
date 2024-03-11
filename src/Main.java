public class Main {
    public static void main(String[] args) {


        Farm farm = new Farm();
        Rose rose = new Rose("rose", 100, 10, 50);
        farm.plant(rose);
        System.out.println(farm);
    }
}