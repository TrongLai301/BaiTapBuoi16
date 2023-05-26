import java.util.Locale;
import java.util.*;
public class test {
    public static void main(String[] args) {
        String input = "1 fish 2 fish red fish blue fish";

        // \\s* means 0 or more repetitions of any whitespace character
        // fish is the pattern to find
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");

        System.out.println(s.next());   // prints: 1
        System.out.println(s.nextInt());   // prints: 2
        System.out.println(s.next());      // prints: red
        System.out.println(s.next());      // prints: blue

        // don't forget to close the scanner!!
        s.close();
//        String s1= "Welcome to java";
//        String s2= "Programming is fun";
//        String s3= "Welcome to java";
//        System.out.println("\t");
//        System.out.println(s1==s2);
//        System.out.println("\t");
//        System.out.println(s2==s3);
//        System.out.println("\t");
//        System.out.println(s1.equals(s2));
//        System.out.println("\t");
//        System.out.println(s1.equals(s3));
//        System.out.println("\t");
//        System.out.println(s1.compareTo(s2));
//        System.out.println("\t");
//        System.out.println(s2.compareTo(s3));
//        System.out.println("\t");
//        System.out.println(s2.compareTo(s2));
//        System.out.println("\t");
//        System.out.println(s1.charAt(0));
//        System.out.println("\t");
//        System.out.println(s1.indexOf("j"));
//        System.out.println("\t");
//        System.out.println(s1.indexOf("to"));
//        System.out.println("\t");
//        System.out.println(s1.lastIndexOf("a"));
//        System.out.println("\t");
//        System.out.println(s1.lastIndexOf("o",15));
//        System.out.println("\t");
//        System.out.println(s1.substring(5));
//        System.out.println("\t");
//        System.out.println(s1.substring(5,11));
//        System.out.println("\t");
//        System.out.println(s1.startsWith("Wel"));
//        System.out.println("\t");
//        System.out.println(s1.endsWith("java"));
//        System.out.println("\t");
//        System.out.println(s1.toLowerCase());
//        System.out.println("\t");
//        System.out.println(s1.toUpperCase());
//        System.out.println("\t");
//        System.out.println(s1.concat(s2));
//        System.out.println("\t");
//        System.out.println(s1.contains(s2));
//        System.out.println("\t");
//        System.out.println("\t Wel \t".trim());
//        System.out.println("\t");
//        String x = "1,2,3,4,5,6";
//        String[] y = x.split(",");
//        int tong = 0;
//        for(String z : y){
//            int so = Integer.parseInt(z);
//            if(so % 2 == 0){
//                tong+=so;
//            }
//        }
//
//        System.out.println(tong);
    }
}