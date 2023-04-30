public class Recur {
    static int i;
    public static int show(int n){
        if(n==1){
            return n;
        }
        return 2*show(n-1);
        
        
    }
    public static void main(String[] args) {
        show(1);
        System.out.println(show(5));
    }
    
}
