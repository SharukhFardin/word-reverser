package ds.stack;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {		
		
		System.out.println("Enter a word to reverse : ");
		Scanner word = new Scanner(System.in);
		String word1  = word.nextLine();
		
		System.out.println();
		System.out.println("The reversed number is : "+reverseWord(word1));
		
		word.close();
	}
	
	public static String reverseWord(String str) {
		int length = str.length();
		StackString word = new StackString(length);
		
		for(int j=0; j<str.length(); j++) {
			char ch = str.charAt(j);
			word.push(ch);
		}
		String revWord = "";
		while(!word.isEmpty()) {
			revWord = revWord+word.pop();
		}
		str = revWord;
		return str;
	}		
	
}
