public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;


    @Override
    public String toString() {
        return "\nAnimal" +
                "\ntype: " + type +
                "\nname: " + name +
                "\nsize: " + size +
                "\nspecialCare: " + specialCare;
    }
}
