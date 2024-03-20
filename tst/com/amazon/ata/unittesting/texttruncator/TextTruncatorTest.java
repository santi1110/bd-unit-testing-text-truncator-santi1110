package com.amazon.ata.unittesting.texttruncator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test the <code>TextTruncator</code> behavior.
 */
public class TextTruncatorTest {
    @Test
    public void truncateTo_stringLongerThanNumChars_shortensToFirstNumChars() {
        // GIVEN
        String original = "One two three four five";
        TextTruncator truncator = new TextTruncator(original);

        // WHEN
        String truncatedString = truncator.truncateTo(7);

        // THEN
        Assertions.assertEquals("One two", truncatedString,
                                "Expected to truncate to the first 7 characters");

    }

    @Test
    public void truncateTo_nullString_NotFail(){
        //GIVEN
        TextTruncator truncator = new TextTruncator(null);
        //WHEN
        String result = truncator.truncateTo(10);
        //THEN
        Assertions.assertEquals("", result, "Truncating a null string, returning a empty string");

    }
    @Test
    public void truncateTo_desiredlenght_returnString(){
        //GIVEN
        TextTruncator truncator = new TextTruncator("This is a very long string that needs truncation.");
        //WHEN
        String result = truncator.truncateTo(15);
        //THEN
        Assertions.assertEquals(15,result.length(), "We need to truncate to desire lenght to 15");

    }

    @Test
    public void truncatoTo_suffix_returnappend(){
        //GIVEN
        TextTruncator truncator = new TextTruncator("Short text");
        //WHEN
        String result = truncator.truncateTo(10,"");
        //THEN
        Assertions.assertEquals("Short text", result, "Truncated String");
    }

    /* ADD YOUR TESTS HERE */

}
