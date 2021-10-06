import java.util.ArrayList;
import java.util.List;

public class StringConverter {

    public String reverseString(String stringToBeReverted) {
        String revertedString = "";

        for (int i = stringToBeReverted.length() - 1; i >= 0; i--) {
            char tempData = stringToBeReverted.charAt(i);
            revertedString += Character.toString(tempData);
        }

        return revertedString;
    }

    public String capitalizeString(String stringToBeCapitalized) {
        String capitalizedString = "";
        String[] listCaps = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] listLowercaps = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for(int i = 0; i < stringToBeCapitalized.length(); i++) {
            char tempChar = stringToBeCapitalized.charAt(i);

            if (Character.toString(tempChar).equals(listLowercaps[i]) || Character.toString(tempChar).equals(listCaps[i])){
                capitalizedString += listCaps[i];
            }
        }
        return capitalizedString;
    }

    public String lowercaseString(String stringToBeCapitalized) {
        String capitalizedString = "";
        String[] listCaps = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] listLowercaps = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for(int i = 0; i < stringToBeCapitalized.length(); i++) {
            char tempChar = stringToBeCapitalized.charAt(i);

            if (Character.toString(tempChar).equals(listLowercaps[i]) || Character.toString(tempChar).equals(listCaps[i])){
                capitalizedString += listLowercaps[i];
            }
        }
        return capitalizedString;
    }

}
