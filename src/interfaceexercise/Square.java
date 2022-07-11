package interfaceexercise;

public class Square implements RegularPolygon {
    public Square() {
    }

    public Square(double sidelenght) {

        setSidelenght(sidelenght);
    }

    double sidelenght;
    double NumSides;


    public void setSidelenght(double sidelenght) {
        this.sidelenght = sidelenght;
    }

    public void setNumSides(double numSides) {
        NumSides = numSides;
    }

    @Override
    public double getNumSides() {
        this.NumSides = 4;
        return NumSides;
    }

    @Override
    public double getSideLength() {
        return sidelenght;
    }

    public double getPerimeter() {
        return getNumSides() * getSideLength();
    }

    public void getInteriorAngle() {
        System.out.println ("degree:"+((getNumSides() - 2)* 180 / getNumSides()));
        System.out.println ("radians:"+((getNumSides() - 2)* 3.14 / getNumSides()));

    }
}
