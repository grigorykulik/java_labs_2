import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateLettersTest {

    @Test
    @DisplayName("aab")
    public void whenGivenSamplesFromAssignmentShouldReturnCorrectValues() {
        // Test string 1
        String s1="aab";
        assertEquals(Main.removeDuplicatedLetters(s1), "b");

        System.out.println("Given: "+s1);
        System.out.println("Expected result: b");
        System.out.println("Actual result: "+ Main.removeDuplicatedLetters(s1));
        System.out.println();

        // Test string 2
        String s2="aabb";
        assertEquals(Main.removeDuplicatedLetters(s2), "");

        System.out.println("Given: "+s2);
        System.out.println("Expected result: empty string");
        System.out.println("Actual result: "+ Main.removeDuplicatedLetters(s2));
        System.out.println();

        // Test string 3
        String s3="abfbaf";
        assertEquals(Main.removeDuplicatedLetters(s3), "abfbaf");

        System.out.println("Given: "+s3);
        System.out.println("Expected result: abfbaf");
        System.out.println("Actual result: "+ Main.removeDuplicatedLetters(s3));
        System.out.println();

        // Test string 4
        String s4="abccbaf";
        assertEquals(Main.removeDuplicatedLetters(s4), "f");

        System.out.println("Given: "+s4);
        System.out.println("Expected result: f");
        System.out.println("Actual result: "+ Main.removeDuplicatedLetters(s4));
        System.out.println();
    }

    @Test
    public void whenGivenAnEmptyStringShouldReturnEmptyString() {
        String s="";
        assertEquals(Main.removeDuplicatedLetters(s), "");
    }
}
