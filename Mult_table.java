import java.util.Scanner;

public class Mult_table {
static Scanner sc = new Scanner(System.in);
 static int i = 1; 
public static int table(int n ,int i){
    
    if(i>10)
    return 0;
    int tab = n*i;
    
    System.out.println(tab);

    return table(n,i+1);
}

    public static void main(String[] args) {
       // System.out.println("which number table do you want");
        int a = 10; //sc.nextInt();
        table(a,1);
    }
    
}
