import java.util.Scanner;
class Recursion_1{
	
	//static Scanner sc = new Scannner(System.in);
	public static int fib(int n){
			if(n<=1)
				return n;
			else
				return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args){
		
		
		//System.out.println("Enter your num");
		//int n = sc.nextInt();
		for(int i= 0;i<20;i++)
		System.out.println(fib(i)+" ");
	}
}