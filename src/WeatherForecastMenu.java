import java.util.Scanner;

public class WeatherForecastMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherForecast wf = new WeatherForecast(70, "Sunny");
        boolean flag = true;
        while (flag) {
            System.out.print("The menu \n1- Show the last update in Fahrenheit.\n" +
                    "2- Show the last update in Fahrenheit.\n" +
                    "3- Update.\n" +
                    "4- Exit\n" +
                    "Enter your choice: ");
            int c = scanner.nextInt();
            switch (c) {
                case 1: wf.getFahrenheit();break;
                case 2: wf.getCelsius();break;
                case 3:
                    System.out.println("Enter the updated temperature in Fahrenheit:");
                    double temperature =scanner.nextDouble();
                    System.out.println("Enter the updated sky condition: 1- Sunny 2- Snowy 3- Cloudy 4- Rainy");
                    int s = scanner.nextInt();
                    String skyCondition = "";
                    switch (s) {
                        case 1:skyCondition = "Sunny";break;
                        case 2:skyCondition = "Snowy";break;
                        case 3:skyCondition = "Cloudy";break;
                        case 4:skyCondition = "Rainy";break;
                    }
                    wf.set(temperature,skyCondition);break;
                case 4: flag=!flag; System.out.print("Bye Bye\n");break;
                default: System.out.print("Wrong entry.Try again!\n");
            }
        }
        scanner.close();
    }
}
