public class Test {
 public static void main(String[] args) {
     System.out.println("return value of getValue(): " + getValue());
//     int x = 1;
//     System.out.println(x++);
//     System.out.println(x);
//     System.out.println(x++);
//     System.out.println(++x);
//     
//     String str = "";
//     System.out.println(str.length());
//     System.out.println(str.split(",").length);
 }
 public static int getValue() {
     int i = 1;
     try {
         i = 4;
     } finally{
//         i++;
//    	 i = i++;
         return i++;
     }
     }
 }