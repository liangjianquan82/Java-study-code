package foods;

public class Fruit extends Food {
    String season;//spring,summer,Autumn,winter
    int nb;
    double foodCal;

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public double getFoodCal() {
        return foodCal;
    }

    public void setFoodCal(double foodCal) {
        this.foodCal = foodCal;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Fruit() {}

    /**
     * @param description
     * @param cal         :Calories per serving
     * @param season      :spring,summer,Autumn,winter
     */
    public void setFruit(String description, int cal, int season,int nb) {

        super.description = description;
        super.cal = cal;
        choiceSeason(season);
        this.foodCal = amountFoodCal(nb);
        this.nb = nb;

    }

    /**
     *
     * @param cs //spring,summer,Autumn,winter
     * @return
     */
    public void choiceSeason(int cs){
        switch (cs){
            case 1:this.season = "Spring";break;
            case 2:this.season = "Summer";break;
            case 3:this.season = "Autumn";break;
            case 4:this.season = "Winter";break;
            default:this.season = "Spring";
        }
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
        return "Fruit name/description: " + description + '\'' +
                "\nCalories per serving: " + super.cal +
                "\nNumber of servings: " + this.nb +
                "\nAmount of food: " + this.foodCal +
                "\nFruit season: " + this.season ;
    }
}
