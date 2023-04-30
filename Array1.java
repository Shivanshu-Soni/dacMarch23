package Array.Array_1;

import javax.lang.model.util.ElementScanner6;

public class Array1 {
   private  int[] a;//declare two variable one for arr and int.
   private int n;

   public Array1(int size){
   a= new int[size];
   n = 0;

   }
   public  void insert(int i, int j) {
        a[i] = j;
        n++;
   }
   public  boolean find(int key){
    if(a.length!=0){
        for(int j = 0; j<a.length-1;j++){
            if(a[j] == key);
            System.out.println(key+"found at"+a[j]);
            return true;
        }

    }
    return false;

   }
   public  void sort(int arr[]){
    for(int i= 0;i<a.length-1;i++)
        if(a[i]<a[i+1]){
            int temp = a[i];
            a[i]= a[i+1];
            a[i+1] =  temp;


        }
        public void  delete(int value){
            int j;
            for( j=0;j<n;j++){
                if(a[j]==value)//yaha se humko index mil rha jaha pe key hai
                break;
            }
            for(int k=j;k<n;k++){
                a[k] = a[k+1];//k+1 ki value ko k me daal do(ovverride)
            }
            n--;//this is for decreasing size of array

            }


        
    
    
   }



    



   public static void main(String[] args) {
    Array1 arr = new Array1(20);
    arr.insert(0,44);
    arr.insert(1,43);
    arr.insert(2,45);
    arr.insert(3,65);
    arr.insert(4,76);
    int key = 65;
    if(arr.find(key))
    System.out.println("found");
    else {}
    System.out.println("not found");
     arr.delete(45);


   }

}

