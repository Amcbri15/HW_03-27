package nyc.c4q.Amcbri15;

import java.util.Scanner;
/**
 * Created by c4q-anthony-mcbride on 3/22/15.
 */
public class ASCII {

    public static void main(String[] args) {
        String greeting = "Hello, world!";
        Scanner in = new Scanner(System.in);


        System.out.println("Please enter your phrase to encode: ");
        String input = in.next();
        System.out.println(rot13Encode(input) + "\n");

        for (int i = 0; i < greeting.length(); i++) {
            char c = greeting.charAt(i);

            // converts "c" into an int
            int code = (int) c;
            System.out.println("char " + c + " = " + code);
            System.out.println("This character is lower case! = " + isLowercaseLetter(greeting.charAt(i)));
        }


    }
    public static boolean isUppercaseLetter(char c) {
        int code = (int) c;

        if (code >= 065 && code <= 90) {
            return true;
        }
        else {
            return false;
        }
    }

    /* Does the same as above because above statement is boolean already.

    public static boolean isUppercaseLetter(char c) {

        return (int) c >= 065 && (int) c <= 90;
    }
    */


    public static boolean isLowercaseLetter(char c) {
        if ((int) c >= 97 && (int) c <= 122) {
            return true;
        } else {
            return false;
        }
    }
    public static String rot13Encode(String str) {



        String output = "";
        for(int i = 0; i < str.length(); ++i) {

            int NumVal = (int) str.charAt(i);  //letter

            if ((NumVal >= 65 && NumVal <= 90) || (NumVal >= 97) && NumVal <= 122) { //alphabet

                NumVal += 13;
                if (NumVal > 122) {
                    NumVal -= 26;
                }
                output += (char) NumVal;
            }
            else {                                                        ///not a letter
                output += (char) NumVal;
            }

        }
        return output;
    }
}
