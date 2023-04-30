import java.util.Arrays;

public class BinarySearch {
    
    public static int bSearch(int[] arr ,int l,int r, int key){
        if(l<r){
            int mid = (l+r)/2;
            if(arr[mid] ==key)
            return mid;
            if(arr[mid]>key)
             r=mid-1;
            else 
            l = mid+1;


        }
        return -1;
    }
    public static void sort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] =  temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {33,23,21,5,67,7,89};
        //BinarySearch.sort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int key =5;
       int index =bSearch(arr, 0, 6, key);
       if(index == -1){
            System.out.println("KEY NOT FOUND");

       }else{
        System.out.println("KEY FOUND"+index);
       }


    }
}
