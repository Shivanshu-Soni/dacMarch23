public class Series {
    static int i = 0;

    public static int printSeries(int n) {
        i++;
        if (n <= 0) {
            return 0;
        } else {
            System.out.println(i);
            return printSeries(n - 1);
        }

    }

    public static void main(String[] args) {
       // System.out.println(printSeries(5));
        int n =5;
        printSeries(n);
    }
}
