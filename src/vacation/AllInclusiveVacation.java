package vacation;

import java.util.ArrayList;

public class AllInclusiveVacation extends Vacation {
    ArrayList brand = new ArrayList();
    ArrayList rating= new ArrayList();
    ArrayList price= new ArrayList();
    int idx ;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public AllInclusiveVacation( ) {

    }
    public void setinfo(ArrayList brand ,  ArrayList rating, ArrayList price,
                        double budget,String destination){
        setBrand(brand);
        setRating(rating);
        setPrice(price);
        super.budget = budget;
        super.destination = destination;

    }



    public ArrayList getBrand() {
        return brand;
    }

    public void setBrand(ArrayList brand) {
        this.brand = brand;
    }

    public ArrayList getRating() {
        return rating;
    }

    public void setRating(ArrayList rating) {
        this.rating = rating;
    }

    public ArrayList getPrice() {
        return price;
    }

    public void setPrice(ArrayList price) {
        this.price = price;
    }

    @Override
    public void numbers_vacation_over_or_under_budget() {
        double calculate=0;
        calculate = super.budget-(double)this.price.get(getIdx());
        if(calculate>=0){
            System.out.println("Vacation speed low than budget $"+calculate);
        }
        else if(calculate<0){
            System.out.println("Vacation speed more than budget $"+Math.abs(calculate));
        }
    }


    @Override
    public void showinfo() {
        System.out.println("Vacation destination :" + super.destination +
                "\nVacation budget :"+super.budget+
                "\nChoices brand :"+this.getBrand().get(getIdx())+
                "\nRating stars :"+this.getRating().get(getIdx())+
                "\nPrice :"+this.getPrice().get(getIdx()));
        numbers_vacation_over_or_under_budget();
    }
}
