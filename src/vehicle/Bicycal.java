package vehicle;

public class Bicycal extends Vehicle {
    public Bicycal(String nm, int wheels) {
        super.ownName = nm;
        super.wheels = wheels;
    }
    @Override
    public void showInfromation() {
        System.out.println("The own's name :" + super.ownName +
                "\nThe wheels :" + super.wheels + ". This is a Bicycal");
    }
}
