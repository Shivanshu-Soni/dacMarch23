public class Q17 {
    public static void main(String[] args)
    {
        int a =10;
        int b= 20;
        int i = Integer.compare(a, b);
        if(a>b){
            System.out.println("max vlaue is"+a );
            System.out.println("min value is" +b);
        }
        else{
            System.out.println("max value is"+b);
            System.out.println("min value is" +a);
        }
        
       int i1 = Integer.sum(a,b);
       System.out.println(i1);



    }
}
