public class SumSeries {
   static int i=0 ,sum = 0;
    public static int sum(int n){
        ++i;
        if(n<=0)
        return 0;
        sum = sum+i;
        System.out.println(sum);
        return sum(n-1);
    }
        public static void main(String[] args) {
            sum(5);
        }
    
    
}
