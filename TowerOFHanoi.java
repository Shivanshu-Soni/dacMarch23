public class TowerOFHanoi {// s= source, h= helper tower,d= destination tower
    public static void towerOFHanoi(int n, char s, char h, char d) {// n = number of rings
        if (n == 1) {
            System.out.println(s + " to " + d);
            return;
        }
        towerOFHanoi(n - 1, s, d, h);
        System.out.println(s + " to " + d);
        towerOFHanoi(n-1, h, s, d);

    }

    public static void main(String[] args) {
        int c = 3;
        towerOFHanoi(c, 'a', 'b', 'c');

    }

}
