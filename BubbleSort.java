import java.util.Scanner;

public class BubbleSort {

    public static int[] bbSort(int[] arr){
        boolean flag;
        int n = arr.length;
        for(int i = 0 ; i<n-1;i++){
            flag =false;

            for(int j = 0;j<n-i-1;j++)

                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                } 
            

        }return arr;
        

    }

    public  static void display(int[] arr){
        for(int i =0;i<arr.length;i++)
        System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  int[] arr = {23,34,44,23,45,98,4,65};
        System.out.println(arr);

        BubbleSort.bbSort(arr);
        BubbleSort.display(arr);
       */
        System.out.println("enter size of an array");
        //for(int i = 0;i<arr.length;i++)
        
           int[] array = new int[sc.nextInt()] ;
        
      
    
      System.out.println("enter elements in array");
      for(int i = 0;i<array.length;i++){
           array[i] = sc.nextInt();
      }
      BubbleSort.bbSort(array);
      BubbleSort.display(array);

      sc.close();
    }
   ;
    
}