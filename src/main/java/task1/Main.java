package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diameter = 0.0;
        boolean isValid = false;

        while(!isValid){
            System.out.print("Please write a diameter of pizza: ");
            String val = scanner.next();
            try{
                diameter = Double.parseDouble(val);
                isValid = true;
            }catch (NumberFormatException ex){
                System.out.println("Invalid input. Please enter an double or integer or float.");
            }
        }

        if(diameter != 0.0){
            System.out.println(getSquarePizza(diameter));
        }
        else{
            System.out.println("The diameter is " + diameter);
        }
    }

    //S = PI * (r ^ 2), PI = 3.141592653589793
    private static double getSquarePizza(double diameter){
        double radius = diameter / 2;
        return Math.PI * Math.pow(radius, 2);
    }
}