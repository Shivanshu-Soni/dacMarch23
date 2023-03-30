import java.util.Scanner;
class Challenge{
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        int num = sh.nextInt();

        if(num>= 10 && num<=1000){
            int digit=0,sum=0;
            for(int i=0;i<=digit;i++){
                int j = num%10;
                sum =sum +j;
                digit++;
            }
            System.out.println(sum);
        }
    }
}
