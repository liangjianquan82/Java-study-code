package store;

import java.util.Arrays;

public class MobileStore extends Store1 {

    double annual_sale;//year
    int annual_sale_hand_sets;
    double month_sale[] = new double[12];//each month
    int month_hand_set_sales[] = new int[12];
    double average_price_each_hand_set;

    public double getAnnual_sale() {
        return annual_sale;
    }

    public void setAnnual_sale(double annual_sale) {
        this.annual_sale = annual_sale;
    }

    public int getAnnual_sale_hand_sets() {
        return annual_sale_hand_sets;
    }

    public void setAnnual_sale_hand_sets(int annual_sale_hand_sets) {
        this.annual_sale_hand_sets = annual_sale_hand_sets;
    }

    public double[] getMonth_sale() {
        return month_sale;
    }

    public void set_month_sale(double[] Month_sale) {
        this.month_sale = Month_sale;
    }

    public int[] getMonth_hand_set_sales() {
        return month_hand_set_sales;
    }

    public void setMonth_hand_set_sales(int[] month_hand_set_sales) {
        this.month_hand_set_sales = month_hand_set_sales;
    }

    public double getAverage_price_each_hand_set() {
        return average_price_each_hand_set;
    }

    public void setAverage_price_each_hand_set(double average_price_each_hand_set) {
        this.average_price_each_hand_set = average_price_each_hand_set;
    }

    public MobileStore(String name) {
        super(name);
    }
    public void setInfo( int month_hand_set_numbers[], double month_sale_price[]) {
        this.month_sale = month_sale_price;
        this.month_hand_set_sales = month_hand_set_numbers;
        selling_price_hand_set();
        System.out.println("Info updated.");
    }
    public String month_most_sale() {
        double lp = this.month_hand_set_sales[0];
        int index = 0;
        String month = null;
        boolean loop = true;

        for (int i = 0; i < this.month_hand_set_sales.length; i++) {
            if (lp < this.month_hand_set_sales[i]) {
                lp = this.month_hand_set_sales[i];
                index = i;
            }
        }
        switch (index) {
            case 0:
                month = "January";break;
            case 1:
                month = "February";break;
            case 2:
                month = "March";break;
            case 3:
                month = "April";break;
            case 4:
                month = "May";break;
            case 5:
                month = "June";break;
            case 6:
                month = "July";break;
            case 7:
                month = "August";break;
            case 8:
                month = "September";break;
            case 9:
                month = "October";break;
            case 10:
                month = "November";break;
            case 11:
                month = "December";break;
        }
        return "The month with the highest sales of hand-sets:" + month ;
    }

    public void selling_price_hand_set() {

        double total_price = 0;
        int total_numbers_hand_sets = 0;
        for(int i = 0; i < this.month_hand_set_sales.length; i++){
            total_price += this.month_sale[i];
            total_numbers_hand_sets +=  this.month_hand_set_sales[i];
        }
        this.annual_sale = total_price;
        this.annual_sale_hand_sets = total_numbers_hand_sets;
        this.average_price_each_hand_set =  total_price/total_numbers_hand_sets;
    }

    @Override
    public String toString() {
        return "Mobile Store name: " +super.getName()+
                "\nSale tax annual year sale: " + this.annual_sale +
                //"\nAfter sale tax annual year sale:" + (this.annual_sale-(this.annual_sale*super.SALES_TAX_RATE)) +
                "\nAverage hand_set price:" +  String.format("%.2f", this.average_price_each_hand_set) ;
    }
}
