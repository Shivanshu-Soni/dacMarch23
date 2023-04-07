
/*2. BMI Calculator 
You have been asked to write a Java program to implement a BMI (Body Mass 
Index) calculator. The program should have the following functionality:
The BMI calculator class should have the following fields:
a. height: A double field to store the height of the person in meters.
b. weight: A double field to store the weight of the person in kilograms.
The BMI calculator class should have the following methods:
a. A constructor to initialize the height and weight fields of the BMI calculator 
object.
b. Getter and setter methods.
c. Double calculateBMI(): A method to calculate the BMI of the person using the 
following formula: 
BMI = weight / (height * height).*/
import java.util.Scanner;

class BmiCalculator {

    private double height;
    private double weight;

    BmiCalculator(double height, double weight) {

    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class TestBmi
   {
    Scanner sc = new Scanner(System.in);
    BmiCalculator Person = new BmiCalculator( 0,0);
    


  
    
  


    

   
   
    


    // double BMI = weight / (height * height);
     //System.out.println(BMI);
   }

public class Q_2 {
    public static void main(String[] args) {

        // BmiCalculator b = new BmiCalculator();

        // b.setHeight(6.2);
        // b.setWeight(77.440);
        // b.getHeight();
        // b.getWeight();
        // b.calculateBMI();

    }

}
