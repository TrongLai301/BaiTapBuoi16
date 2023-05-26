package BaiTap2;

import java.util.Scanner;

public class TestPhoneNumberExample {
    public static PhoneNumberExample phoneNumberExample;
    public static String[] phoneNumberCheck;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phoneNumberExample = new PhoneNumberExample();
        System.out.println("Enter quantity phone number: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        phoneNumberCheck = new String[quantity];
        int i = 0;
        while (i < quantity) {
            System.out.print("Enter phone number: ");
            String enter = sc.nextLine();
            phoneNumberCheck[i] = enter;
            i++;
        }
        for (String numberCheck : phoneNumberCheck
             ) {
            boolean isValid = phoneNumberExample.isValid(numberCheck);
            System.out.println("Phone number: "+numberCheck +" is:"+ isValid);
        }
    }
}
