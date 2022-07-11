package part;

import java.util.Arrays;

public class OutSource extends Part {
    String suppliers[];
    double prices[];

    public String[] getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(String[] suppliers) {
        this.suppliers = suppliers;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    public OutSource() {
    }


    public void setInfo(String partNumber, double budget, String supplier[], double prices[]) {
        super.partNumber = partNumber;
        super.budget = budget;
        this.suppliers = supplier;
        this.prices = prices;
        System.out.println("Info updated.");
    }

    public String SupplierAndLowPrice() {
        double lp = this.prices[0];
        int index = 0;
        boolean loop = true;

        for (int i = 0; i < this.prices.length; i++) {
            if (lp > this.prices[i]) {
                lp=this.prices[i];
                index = i;
            }
        }
        return "Lowest-cost \nsupplier:"+suppliers[index]+
                "\nPrice:"+lp;
    }

    @Override
    public String showinfo() {
        return "OutSource:" +
                "\nPartNumber='" + super.partNumber + '\'' +
                "\nBudget=" + super.budget ;

    }
}
