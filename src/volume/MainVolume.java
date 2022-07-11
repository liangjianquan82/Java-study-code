package volume;

import java.util.Scanner;

public class MainVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean loop = true;
        Type t = new Type();
        String name;
        double r;
        double h;
        while(loop){
            System.out.println("Find the volume of: 1- Sphere 2- Cylinder 3- Cube or 4- Exit.Enter 1,2,3, or 4");
            int s1 = sc.nextInt();
            switch (s1){
                case 1:
                    System.out.println("Enter the side:");
                    name = "Sphere";
                    r = sc.nextDouble();
                    t.volume_of_3D_shape(name,r,0);
                    break;
                case 2:
                    System.out.println("Enter the side:");
                    name = "Cylinder";
                    r = sc.nextDouble();
                    System.out.println("Enter the height:");
                    h = sc.nextDouble();
                    t.volume_of_3D_shape(name,r,h);
                    break;
                case 3:
                    System.out.println("Enter the side:");
                    name = "Cube";
                    r = sc.nextDouble();

                    t.volume_of_3D_shape(name,r,0);
                    break;
                case 4:
                    System.out.println("Bye!");
                    loop = false;
                    break;

            }
        }
        sc.close();
    }
}
