package vehicle;

public class Car extends Vehicle{
    public Car(String nm,int wheels,float v){
        super.ownName = nm;
        super.wheels = wheels;
        this.engineDisplacement = v;
    }
    float engineDisplacement;

    @Override
    public void showInfromation() {
        System.out.println("The own's name :"+super.ownName+
                "\nThe wheels :"+super.wheels+
                "The horsePower : "+ this.engineDisplacement*super.wheels+". This is a motorized vehicle");
    }
}
