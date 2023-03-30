/*2. Write a Java program to find the k largest elements in a given array. Elements in the array 
can be in any order (Use scanner class to input and Array, below picture is example do not 
make static array as repsrented in example)*/
import java.util.Scanner ;
class Challenge2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int arrlength = sc.nextInt();
        int arr[]= new int[arrlength];

        for(int i =0;i<arrlength;i++)
        {
           System.out.println("enter elements in array at index "+i);
           arr[i]=sc.nextInt();

        }
        int largest=arr[0];
        
        for(int i=1;i<arrlength;i++){
            if(arr[0]<arr[i])
            {
               // System.out.println("hi");
                largest=arr[i];
            }
        }
       
        System.out.println("largest value :"+largest);
        
    }
    
}
