
public class Countcvs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countVowels=0;
		int countConsonant=0;
		int countSpecialCharacters=0;
		String s1="vinay@#$%";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='o'||s1.charAt(i)=='i'||s1.charAt(i)=='u') {
				countVowels++;
			}
			else if(s1.charAt(i)>='a'&& s1.charAt(i)<='z') {
				countConsonant++;
			}
			else {
				countSpecialCharacters++;
			}
			
		}
		System.out.println("vowels are in string "+ countVowels);
		System.out.println("consonant are in string "+ countConsonant);
		System.out.println("special characters are in string "+ countSpecialCharacters);

	}

}
