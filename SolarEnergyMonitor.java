        
import java.util.Scanner;

public class SolarEnergyMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read energy generated in kWh
        System.out.print("Enter energy generated in kWh: ");
        double energyGenerated = scanner.nextDouble();

        // Check generation level using an if-else statement
        if (energyGenerated >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        scanner.close();
    }
}