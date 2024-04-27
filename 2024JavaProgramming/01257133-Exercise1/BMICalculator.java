package ntou.cs.java2024;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the BMI (Body Mass Index) calculator");
        
        System.out.print("Please enter your weight (kiloframs): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Please enter your height (centimeter): ");
        double height = scanner.nextDouble();
        height /= 100;

        double BMI = weight / height / height;
        String status;

        if(BMI < 18.5) status = "Underweight";
        else if(BMI < 25) status = "Normal";
        else if(BMI < 30) status = "Overweight";
        else status = "Obese";

        System.out.printf("Your BMI is %.1f (%s)%n", BMI, status);
    }
}
