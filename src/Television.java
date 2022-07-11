public class Television {
    double price;
    String brand;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Television() {
    }
    public Television(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Television{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
