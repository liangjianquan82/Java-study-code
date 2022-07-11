package part;

public class SelfManufacture extends Part {
    double cost;
    String drawNumber;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDrawNumber() {
        return drawNumber;
    }

    public void setDrawNumber(String drawNumber) {
        this.drawNumber = drawNumber;
    }

    public SelfManufacture() {
    }


    public void setInfo(String partNumber, double budget, double cost, String drawNumber) {

        super.partNumber = partNumber;
        super.budget = budget;
        this.cost = cost;
        this.drawNumber = drawNumber;
        System.out.println("Info updated.");
    }

    /**
     * @return low - true; High - false;
     */
    public boolean costLowOrHigh() {
        if (super.budget >= cost) {
            return true;
        } else if (super.budget < cost){
            return false;
        }else
            return true;
    }

    @Override
    public String showinfo() {
        return "Self-Manufacture:" +
                "\nPartNumber:" + super.partNumber +
                "\nBudget:" + super.budget +
                "\nCost:" + this.cost +
                "\nDrawNumber:" + this.drawNumber ;
    }
}
