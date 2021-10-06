import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringUtility {

    @Test
    public void Should_ReverseAString_When_GivenAStringOfLenghtTwo() {
        StringConverter stringConvert = new StringConverter();
        String convertedString = stringConvert.reverseString("ab");

        assertEquals("ba", convertedString);
    }

    @Test
    public void Should_ReverseAString_When_GivenAStringOfAnyLength() {
        StringConverter stringConvert = new StringConverter();
        String convertedString = stringConvert.reverseString("abcdefghijklm");

        assertEquals("mlkjihgfedcba", convertedString);
    }


    @Test
    public void Should_CapitaliseAString_When_GivenAStringOfLowerCaseLettersOfAnyLength() {
        StringConverter stringConvert = new StringConverter();
        String convertedString = stringConvert.capitalizeString("abcdefghijklm");

        assertEquals("ABCDEFGHIJKLM", convertedString);
    }

    @Test
    public void Should_CapitaliseAString_When_GivenAStringWithUpperAndLowercaseLetters() {
        StringConverter stringConvert = new StringConverter();
        String convertedString = stringConvert.capitalizeString("aBcDeFghijklm");

        assertEquals("ABCDEFGHIJKLM", convertedString);
    }

    @Test
    public void Should_LowercaseAString_When_GivenAStringOfAnyLength() {
        StringConverter stringConvert = new StringConverter();
        String convertedString = stringConvert.lowercaseString("ABCDEFGHIJKLM");

        assertEquals("abcdefghijklm", convertedString);
    }

    @Test
    public void Should_LowercaseAString_When_GivenAStringWithUpperAndLowercaseLetters() {
        StringConverter stringConvert = new StringConverter();
        String convertedString = stringConvert.lowercaseString("aBcDeFghijklm");

        assertEquals("abcdefghijklm", convertedString);
    }

}
