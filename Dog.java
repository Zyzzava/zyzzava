public class Dog {
    private String name;
    private int weight;
    private boolean isMale;

    public Dog(String name, int weight, boolean isMale) {
        this.name = name;
        this.weight = weight;
        this.isMale = isMale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
