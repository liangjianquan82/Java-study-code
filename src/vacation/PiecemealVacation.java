package vacation;

import java.util.ArrayList;

public class PiecemealVacation extends Vacation {
    ArrayList items = new ArrayList();
    ArrayList costs = new ArrayList();

    public PiecemealVacation() {
    }
    public void setinfo(ArrayList items,ArrayList costs,double budget,String destination) {
        setItems(items);
        setCosts(costs);
        super.budget = budget;
        super.destination = destination;

    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public ArrayList getCosts() {
        return costs;
    }

    public void setCosts(ArrayList costs) {
        this.costs = costs;
    }

    @Override
    public void numbers_vacation_over_or_under_budget() {
        double calculate=0;
        calculate = super.budget-total_costs();
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
                "\nItems :"+getItems()+
                "\ncosts :"+getCosts()+
                "\nTotal costs :"+total_costs());
        numbers_vacation_over_or_under_budget();
    }

    public double total_costs() {
        double total = 0;
        for (int i = 0; i < this.costs.size(); i++) {
            total += (double)this.costs.get(i);
        }
        return total;
    }
}
