package foods;

public abstract class Food {
    String description;
    int cal;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public abstract double amountFoodCal(int nb);



}
