import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//mit Hilfe von Walid Al Aswad und Kenbi Fakhreddine

class passwordvalidatorTest {
    @Test
    public void testPasswordTooShort(){
        boolean output = passwordvalidator.checkPassword("123");
        assertFalse(output);
    }

    @Test
    public void testPasswordTooLong(){
        boolean output = passwordvalidator.checkPassword("123456789123456789123456789123456789");
        assertFalse(output);
    }

    @Test
    public void testPasswordValidLength(){
        boolean output = passwordvalidator.checkPassword("1A23Hjafut@!");
        assertTrue(output);
    }

    @Test
    public void testPasswordContainsOnlyUppercase(){
        boolean output = passwordvalidator.checkPassword("ABCDEFGHIJKL");
        assertFalse(output);
    }

    @Test
    public void testPasswordContainsOnlyLowercase(){
        boolean output = passwordvalidator.checkPassword("abcdefghijkl");
        assertFalse(output);
    }

    @Test
    public void testPasswordContainsNoDigits(){
        boolean output = passwordvalidator.checkPassword("ahgkgsdHJZF");
        assertFalse(output);
    }

    @Test
    public void testPasswordContainsDigitsUpperLowerSpecial(){
        boolean output = passwordvalidator.checkPassword("ahgkgsd9H7JZF@");
        assertTrue(output);
    }

    @Test
    public void testPasswordContainsDigitsUpperLowerNoSpecial(){
        boolean output = passwordvalidator.checkPassword("ahgkgsd9H7JZF");
        assertFalse(output);
    }

    @Test
    public void testPasswordContains4DigitsInARow(){
        boolean output = passwordvalidator.checkPassword("ahgkgsd9999H7JZF");
        assertFalse(output);
    }

    @Test
    public void testPasswordContains4DigitsInARow2(){
        boolean output = passwordvalidator.checkPassword("ahg44444kgsd99H7JZF");
        assertFalse(output);
    }

    @Test
    public void testPasswordContains3Digits(){
        boolean output = passwordvalidator.checkPassword("gsadgas256712HJG$");
        assertFalse(output);
    }

    @Test
    public void testPasswordIsPerfect(){
        boolean output = passwordvalidator.checkPassword("ahg44@!kGsd99H7JZF");
        assertTrue(output);
    }
}
