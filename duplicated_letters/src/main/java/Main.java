/**
 * Implement a method that removes nearby duplicated letters in a given string
 */

public class Main {
    public static void main(String[] args) {

    }

    /**
     * Get a string. Set the flag duplicatesPresent to false.
     * If the string length is zero break the loop.
     * Else set index i to 0. If i+1=s.length(), i.e. there's just one letter in the string, set
     * the flag to false, cause there no duplicates and break the loop.
     * Else set index j to i+1.
     * If the letter in position i is the same as the letter in position j, set duplicatesPresent to true.
     * Remove these letters by taking the substring starting at zero (inclusively) and ending at i (exclusively).
     * Set i and j back to 0 and 1.
     * Else set the flag to false indicating that no duplicates have been found and increment i and j.
     */
    public static String removeDuplicatedLetters(String s) {
        boolean duplicatesPresent=false;

        do {
            if (s.length()==0) break;
            int i=0;

            while (i<s.length()) {
                if (i+1==s.length()) {
                    duplicatesPresent=false;
                    break;
                }

                else {
                    int j = i + 1;

                    if (s.charAt(i) == s.charAt(j)) {
                        duplicatesPresent = true;

                        s=s.substring(0, i)+s.substring(j + 1);

                        break;
                    } else {
                        duplicatesPresent = false;
                        i++;
                        j++;
                    }
                }
            }
        }

        while (duplicatesPresent);

        return s;
    }
}
