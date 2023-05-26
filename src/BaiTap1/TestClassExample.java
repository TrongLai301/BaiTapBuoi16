package BaiTap1;

import java.util.Scanner;

public class TestClassExample {
    public static ClassExample classExample;
    public static String[] classArray ;

    public static void main(String[] args) {
        classExample = new ClassExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lớp học: ");
        int numClass = sc.nextInt();
        classArray = new String[numClass];
        int i = 0;
        sc.nextLine();
        while (i < numClass) {
            System.out.println("Tạo tên lớp học: ");
            String enter = sc.nextLine();
            classArray [i]= enter;
            i++;
        }
        for (String classCheck: classArray
             ) {
            boolean isValid = classExample.validate(classCheck);
            System.out.println("Name class: "+classCheck+" is: "+isValid);
        }
    }
}
