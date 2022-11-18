package PairWorkShop;

public class Customer {
    private int id=0;
    private String name;

    public Customer(String name) {
        id++;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
