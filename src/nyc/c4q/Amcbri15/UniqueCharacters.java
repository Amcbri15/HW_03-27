package nyc.c4q.Amcbri15;

import java.util.Scanner;

/**
 * Created by c4q-anthony-mcbride on 3/26/15.
 */
public class UniqueCharacters {

    public static String uniqueCharacters(String s) {
        StringBuilder s2 = new StringBuilder(); // Creates an object of type StringBuilder called s2
        String indexString; // Placeholder in the loop to build the return String

        for (int i = 0; i < s.length(); i++) {
            indexString = s.substring(i, i + 1); // Sets this iteration's indexString to the current index of substring i to i + 1

            if (s2.indexOf(indexString) == -1) { // -1 is the default return value if the substring index does not occur previously
                s2.append(indexString); // Adds the argument of the current iteration of the loop to s2
            }
        }
        return s2.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String initialWord;

        System.out.println("Please enter a string: ");
        initialWord = in.next();

        System.out.println("Here is your string with all duplicate characters removed: " + uniqueCharacters(initialWord));
    }
}
