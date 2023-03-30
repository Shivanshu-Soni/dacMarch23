public class Q16 {
    public static void main(String args[])
    {
        int i = 10;
        //int value to string
        String str=Integer.toString(i);
        System.out.println(str);

        //int value into integer instance
        int i1 = 23;
        Integer i2 = new Integer(i1);
        System.out.println(i2);

        //string instance into integer instance
        String str1 = new String();
        str1 = "12";
        Integer i4 = Integer.valueOf(str);
        System.out.println(str1);

        //int vlaue into binary octal and hexadcimal string
        int a =40;
       String s4 = Integer.toBinaryString(a);
       System.out.println(s4);
       String s5 = Integer.toOctalString(a);
       System.out.println(s5);
       String s6 = Integer.toHexString(a);
       System.out.println(s6);


         


    }
}
