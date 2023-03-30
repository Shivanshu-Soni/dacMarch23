public class Question8 {
    public static void main(String[] args){
        Byte b= 118;//byte to string
        String str = Byte.toString(b);
        System.out.println(str);

        //byte value into byte instance
        byte b1 = 112;
        Byte by1 = new Byte(b1);
        
        System.out.println(by1);

        //string instance into byte instance
        String st = "shivanshu";
        byte[] byteArray = st.getBytes();


        
    }
}
