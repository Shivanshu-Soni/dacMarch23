public class LinearSearch {
    public static int linearS(int[] arr,int key){
        for( int i = 0; i<arr.length; i++ ){
             if(arr[i] == key)
              return i;

            
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={43,45,33,12,1,78};
        int key = 33;
      int index =LinearSearch.linearS(arr, key);
      if(index!= -1){
        System.out.println("key found at index");
      }
      else{
        System.out.println("key not found at index");
      }


        

    }
}