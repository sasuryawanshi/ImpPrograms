package ImpPrograms;

public class CountVowels {
	public static void main(String[] args) {
		String str = "Mobile";

		int count = 0;

		for( Character s : str.toCharArray()){
			switch (s){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;
				default:
			}
		}
		System.out.println("Total vowels " + count);
	}
}
