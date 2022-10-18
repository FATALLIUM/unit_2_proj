public class CustomStringMethods {

    public CustomStringMethods() {
    }


    public boolean foundIn(String searchFor, String searchIn) {
        return searchIn.contains(searchFor);

    }

    public boolean longerThan(String myString, int maxLength) {
        return myString.length() > maxLength;
    }

    public String funnyString(String str, int idx) {
        String newString = str.substring(idx, idx + 1);
        return newString + str + newString;
    }

    public String pigLatin(String orig) {
        String newOrig = orig.substring(1, orig.length()) + orig.substring(0, 1);
        return newOrig + "ay";
    }


    /* BELOW ARE THE 6 NEW METHODS TO ADD TO YOUR CustomStringMethods CLASS! */

    public void alphabetical(String str1, String str2) {
        if (str1.compareTo(str2) > 0) {
            System.out.println(str1 + " comes after " + str2 + " alphabetically.");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " comes before " + str2 + " alphabetically.");
        } else {
            System.out.println(str1 + " and " + str2 + " are the same string");
        }
    }

    public String halvesReversed(String myString) {
        String firstHalf = myString.substring(0, myString.length() / 2);
        String secondHalf = myString.substring(myString.length() / 2);
        return secondHalf + firstHalf;
    }


    public String yellOrWhisper(String myString) {
        String upperCase = myString.toUpperCase();
        String lowerCase = myString.toLowerCase();
        char charUp = upperCase.charAt(0);
        if (myString.charAt(0) == charUp) {
            return upperCase;
        } else {
            return lowerCase;
        }
    }

    public String endUp(String myString, int numToCap) {
        if (numToCap > myString.length()) {
            return myString.toUpperCase();
        } else {
            String cap = myString.substring(myString.length() - numToCap);
            String origString = myString.substring(0, myString.length() - numToCap);
            return origString + cap.toUpperCase();
        }

    }

    public String removeCharacter(String myString, int removeIdx) {
        if (removeIdx >= myString.length()) {
            return myString;
        } else {
            String removed1 = myString.substring(0, removeIdx);
            String removed2 = myString.substring(removeIdx + 1);
            return removed1 + removed2;
        }
    }


    public String insertAt(String orig, String insertText, String searchStr) {
        if (orig.contains(searchStr)) {
            String orig1 = orig.substring(0, orig.indexOf(searchStr));
            String orig2 = orig.substring(orig.indexOf(searchStr));
            return orig1 + insertText + orig2;
        } else {
            return orig + insertText;
        }
    }

    public boolean endsLy(String str) {
        if (str.length() > 1) {
            return (str.charAt(str.length() - 1) == 'y' && str.charAt(str.length() - 2) == 'l');
        } else {
            return false;
        }
    }

    public String lastTwo(String str) {
        if(str.length() < 2)
            return str;

        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) +
                str.charAt(str.length() - 2);
    }

}