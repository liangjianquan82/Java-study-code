package foods;

public class LiquidFood extends Food {

    double viscosity;//dilute,medium,dense
    int nb;
    double foodCal;

    public double getFoodCal() {
        return foodCal;
    }

    public void setFoodCal(double foodCal) {
        this.foodCal = foodCal;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public double getViscosity() {
        return viscosity;
    }

    public void setViscosity(double viscosity) {
        this.viscosity = viscosity;
    }

    public LiquidFood() {
    }

    public void setLiquidFood(String description, int cal, double viscosity, int nb) {
        super.description = description;
        super.cal = cal;
        this.viscosity = viscosity;
        this.foodCal = amountFoodCal(nb);
        this.nb = nb;
        System.out.println("Info updated.");
    }

    /**
     * @param nb :The number of food
     * @return Amount Calories
     */
    @Override
    public double amountFoodCal(int nb) {
        this.nb = nb;
        return nb * super.cal;
    }

    @Override
    public String toString() {
        return "LiquidFood name/description: " + super.description +
                "\nCalories per serving: " + super.cal +
                "\nNumber of servings: " + this.nb +
                "\nAmount of food: " + this.foodCal +
                "\nviscosity: " + this.viscosity + " cP";
    }
}
