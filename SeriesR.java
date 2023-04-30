public class SeriesR {
    //static int i = 0;

    public static int printSeries(int n) {
        
        if (n <= 0) {
            return 0;
        } else {
            System.out.println(n);
            return printSeries(n - 1);
        }

    }

    public static void main(String[] args) {
       // System.out.println(printSeries(5));
        int n =5;
        printSeries(n);
    }
}
