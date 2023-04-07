/*4. Electricity Bill Calculation
Create a class named "ElectricityBill" that has the following instance variables:
a. customerName (String)
b. unitsConsumed (double)
c. billAmount (double)
Create a constructor that initializes the customerName and unitsConsumed instance
variables.
Define a method named "calculateBillAmount" that calculates the bill amount based 
on the number of units consumed. The formula for calculating the bill amount is:
a. For the first 100 units: Rs. 5 per unit
b. For the next 200 units: Rs. 7 per unit
c. For the remaining units: Rs. 10 per unit
Implement the "calculateBillAmount" method in the "ElectricityBill" class.
Define a main method that creates an object of the "ElectricityBill" class and sets the 
customerName and unitsConsumed instance variables. Then, call the 
"calculateBillAmount" method to calculate the bill amount and display the 
customerName, unitsConsumed, and billAmount/* */
import java.util.Scanner;

class ElectricityBill {
   private String customerName;
   private double unitsConsumed;
   private double billAmount;

    ElectricityBill() {

    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBillamount(double billamount) {
        this.billAmount = billamount;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBillamount() {
        return billAmount;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public void calculateBillAmount() {
        
        
        System.out.println("customerName is "+getCustomerName() );
        System.out.println("Units consumed are "+getUnitsConsumed());
        
        if(this.unitsConsumed<=100){
            this.billAmount = (this.unitsConsumed)*5;
            System.out.println("Your bill is :"+this.billAmount);
        }
        else if(this.unitsConsumed>100 && this.unitsConsumed<=300){
            this.billAmount = (100*5) + (this.unitsConsumed*7);
            System.out.println("Your bill is :"+this.billAmount);

        }
        else if(this.unitsConsumed>300){
            this.billAmount = (100*5)+(200*7)+(this.unitsConsumed*10);
            System.out.println("Your bill is :"+this.billAmount);
        }

    }
            
        
        

         
        
        

    
}

public class Q_4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ElectricityBill bill = new ElectricityBill();
        System.out.println("Enter customers name :");
        bill.setCustomerName(sc.nextLine());
        System.out.println("Enter units consumed :");
        bill.setUnitsConsumed(sc.nextInt());


        
        bill.calculateBillAmount();
    }

}
