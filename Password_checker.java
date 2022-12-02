import java.util.Scanner;
//import java.util.*;

public class Password_checker {
    public static void main(String[] args) {
        System.out.println("enter password");
        Scanner input = new Scanner(System.in);
        String pass = input.nextLine();
        boolean spchar = false;
        boolean upper = false;
        boolean lower = false;
        boolean numbers = false;
        boolean length = false;

        if (pass.length() >= 8) {
            length = true;
        } else {
            System.out.println("password length is less than 8");
        }
        for (int i = 0; i < pass.length(); i++) {
            char a = pass.charAt(i);
            if (a >= 65 && a <= 90) // for upper case
            {
                upper = true;
            }
            if (a >= 97 && a <= 122) {
                lower = true;

            }
            if (a >= 48 && a <= 57) {
                numbers = true;
            }
            if (a >= 32 && a <= 47 || a >= 58 && a <= 64 || a >= 91 && a <= 96 || a >= 123 && a <= 126) {
                spchar = true;
            }
        }


        if (spchar == true && numbers == true&& lower == true && upper== true && length == true) {
            System.out.println("your password  is strong ");
        }
        else 
        {
            if (length != true)
            {
                System.out.println("Your Password is to short (min. length 8 digits)");
            }
            if (upper != true)
            {
                System.out.println("Your Password has no uppercase letters");
            }


            if (lower != true) {
                System.out.println("Your Password has no lowercase letters");
            }
            if (numbers != true){
                System.out.println("Your Password has no numbers");
            }

            if (spchar != true) {
                System.out.println("Your Password has no special chars");
            }
        }
    }
}
