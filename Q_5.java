

/*5. Telephone Bill Calculation
You are required to write a Java program to calculate the telephone bill for a given 
customer based on their usage. The program should take the following inputs from 
the user:
a. Customer name
b. Phone number
c. Number of calls made
d. Duration of calls (in minutes)
The program should then calculate the bill for the customerbased on the following
criteria:
a. The first 100 calls are charged at a rate of 50 cents per call.
b. Calls beyond the first 100 are charged at a rate of 25 cents per call.
c. All calls are subject to a minimum duration of 1 minute.
d. Calls with a duration less than 1 minute are rounded up to 1 minute.
e. There is a flat rate of $10 per month for all customers.*/
import java.util.Scanner;

class Customer {
    private String customerName;
    private int phoneNumber;
    private int numberOfCalls;
    private int durationOfcall;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setNumberOfCalls(int numberOfCalls) {
        this.numberOfCalls = numberOfCalls;
    }
    public void setDurationOfcall(int durationOfcall) {
        this.durationOfcall = durationOfcall;
    }
    public String getCustomerName() {
        return customerName;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public int getNumberOfCalls() {
        return numberOfCalls;
    }
    public int getDurationOfcall() {
        return durationOfcall;
    }
    public void calculateBill(){
        System.out.println("Your billamount is ");
        //if(this.durationOfcall){

        
        if(this.numberOfCalls<=100){
            double bill = 10 + this.numberOfCalls*(.50);
            System.out.println(bill);
        }
        else if(this.numberOfCalls>100){
            double bill = 10 + this.numberOfCalls*(.25);
            System.out.println(bill);
        }

    }
}

public class Q_5 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
    Customer Cstmer = new Customer();
    System.out.println("Enter your name :");
    Cstmer.setCustomerName(sc.next());
    System.out.println("Enter your phone number :");
    Cstmer.setPhoneNumber(sc.nextInt());
    System.out.println("Enter number of calls you made");
    Cstmer.setNumberOfCalls(sc.nextInt());
    System.out.println("Duration of calls in minutes ");
    Cstmer.setDurationOfcall(sc.nextInt());
 
    Cstmer.calculateBill();
    
    
    }

}
