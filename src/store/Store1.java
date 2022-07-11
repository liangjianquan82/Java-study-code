package store;

public class Store1 {
    public final double SALES_TAX_RATE = 0.06;
    private String name;
    public Store1(String name) {

        setName(name);

    }
    public String getName() {

        return name;

    }
    public void setName(String name) {

        this.name = name;

    }
    public String toString() {

        return ("Name: " + name);

    }
}
