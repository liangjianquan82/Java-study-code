package volume;

public class Type implements Volume {
    @Override
    public void volume_of_3D_shape(String shape_name, double r, double h) {
        //1- Sphere 2- Cylinder 3- Cube or 4- Exit. Enter 1,2,3, or 4
        //Sphere volume = (4/3) · π · r3
        if (shape_name.equalsIgnoreCase("Sphere")) {
            System.out.println("Sphere volume =");
            System.out.println(( 4  * pi * Math.pow(r, 3)/ 3));
        }
        //cylinder volume = π · r2 · h
        else if (shape_name.equalsIgnoreCase("Cylinder") ){
            System.out.println("Cylinder volume =");
            System.out.println(( pi * Math.pow(r, 2)*h));
        }
        //cube volume = s3
        else if (shape_name.equalsIgnoreCase("Cube") ) {
            System.out.println("Cube volume =");
            System.out.println((  Math.pow(r, 3)));
        }
    }
}
