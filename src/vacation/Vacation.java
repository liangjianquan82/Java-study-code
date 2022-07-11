package vacation;

public abstract class Vacation {
    double budget;
    String destination;

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public abstract void numbers_vacation_over_or_under_budget();
    public abstract void showinfo();
}
