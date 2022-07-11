package interfaceexercise;

public class EquilateralTriangle implements RegularPolygon {
    public EquilateralTriangle() {
    }

    public EquilateralTriangle(double side_lenght) {

        setSidelenght(side_lenght);
    }


    double sidelenght;
    double NumSides;


    public void setSidelenght(double side_lenght) {
        this.sidelenght = side_lenght;
    }

    public void setNumSides(double numSides) {
        NumSides = numSides;
    }

    @Override
    public double getNumSides() {
        this.NumSides = 3;
        return NumSides;
    }

    @Override
    public double getSideLength() {
        return sidelenght;
    }

    public double getPerimeter() {

        return (getSideLength() * getNumSides());
    }

    public void getInteriorAngle() {
        System.out.println ("degree:"+((getNumSides() - 2)* 180 / getNumSides()));
        System.out.println ("radians:"+((getNumSides() - 2)* 3.14 / getNumSides()));

    }

}
