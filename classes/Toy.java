package classes;

public class Toy {
    private int id;
    private String name;
    private double weight;
    private int count;

    public Toy(int id, String name, double weight, int count) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.count = count;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}