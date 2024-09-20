package ImpPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "Listen";
        String string2 = "Silent";
        if (areAnagrams(string1, string2)) {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are not anagrams.");
        }
    }

    private static boolean areAnagrams(String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        }
        char[] stringOne = string1.trim().replace(" ", "").toLowerCase().toCharArray();
        char[] stringTwo = string1.trim().replace(" ", "").toLowerCase().toCharArray();

        Arrays.sort(stringOne);
        Arrays.sort(stringTwo);

        return Arrays.equals(stringOne,stringTwo);
    }
}
