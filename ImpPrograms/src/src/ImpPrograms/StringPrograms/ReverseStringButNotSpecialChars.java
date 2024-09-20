package ImpPrograms.StringPrograms;

public class ReverseStringButNotSpecialChars {
	// Reverse String but do not change place of special characters/punctuations
	public static void reverseString(char[] charArray) {
		int l = 0;
		int r = charArray.length - 1;

		while (l < r) {
			if (!Character.isAlphabetic(charArray[l])) {
				l++;
			} else if (!Character.isAlphabetic(charArray[r])) {
				r--;
			} else {
				char temp = charArray[r];
				charArray[r] = charArray[l];  //changing indexes here
				charArray[l] = temp;
				l++;
				r--;

			}
		}
	}

	public static void main(String[] args) {
		String str = "Su!sh"; 
		char[] charArray = str.toCharArray();
		//System.out.println(charArray.length);
		ReverseStringButNotSpecialChars.reverseString(charArray);
		String rev = new String(charArray);
		System.out.println(rev);

	}
}
