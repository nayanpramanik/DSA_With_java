package String;

public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
       System.out.println(str);
//        Hello-->Mello
       str.setCharAt(0,'M');
       System.out.println(str);
   }
    
}