package Programmers;
import java.util.Arrays;

import java.util.Scanner;

public class Phone_book {
	
	public static boolean Phone_book(String[] Phone_book) {
		boolean answer = true;
		
		Arrays.sort(Phone_book);
		
		for(int i=0;i<Phone_book.length-1;i++) {
			if(Phone_book[i+1].startsWith(Phone_book[i])) {
				answer = false;
			}
		}
		return answer;
	}
	

}
