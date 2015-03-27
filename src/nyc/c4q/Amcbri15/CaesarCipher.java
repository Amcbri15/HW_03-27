package nyc.c4q.Amcbri15;

import java.util.Scanner;

/**
 * Class for Encoding and Decoding CaesarCiphers
 */
public class CaesarCipher {

    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static boolean codeBreaker(String encoded, String encoded2) {
        for (int i = 1; i < 26; i++) {
            // setting i as the offset in encoded2 string checks for all characters in the range(26) specified in the encode method
            if (encoded.equals(encode(encoded2,i)))
                return true;
        }
        return false;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to encode");

        String input = sc.nextLine();
        String encoded = CaesarCipher.encode(input, 25);
        // added second encode here to test encode method for cipher comparison later
        String encoded2 = CaesarCipher.encode(input, 13);
        System.out.println(encoded + " " + encoded2);

        String decoded = CaesarCipher.decode(encoded, 25);
        // added second decode here to test decode method for cipher comparison later
        String decoded2 = CaesarCipher.decode(encoded2, 13);
        System.out.println(decoded + " " + decoded2);


        System.out.println("\nPlease enter two strings to compare: ");
        String encodeTest = sc.nextLine();
        String cipher = encode(encodeTest, 11);
        String encodeTest2 = sc.nextLine();
        String cipher2 = encode(encodeTest2, 14);

        System.out.println("\nThe ciphers for your strings are " + cipher + " and " + cipher2 + " repectively.");

        if (codeBreaker(cipher, cipher2)) {
            System.out.println("\nThese two ciphers both correspond to the same input.");
        }
        else
            System.out.println("\nThese two ciphers do not correspond to the same input.");


    }
}
