public class Q13 {
    public static void main(String[] args)
    {
        short s = 15;// short to string
        String str= Short.toString(s);
        System.out.println(str);

        short s1 = 45; // short value to short instance
        Short s2 = s1;
        System.out.println(s2);

        String str1 = new String("123");
        Short s3 = new Short(str1);
        System.out.println(s3);





    }
}
