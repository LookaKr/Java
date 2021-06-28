package vjezbeInteger;

import java.util.Scanner;

public class RimskiBrojevi {
	
	private static void pretvoriBrojURimskiBroj(Integer value) {
		if(value >10) {
			System.out.println("Houstone,we have a problem");
		}
		else if(value ==1) {
			System.out.println("I");
		}
		else if(value ==2) {
			System.out.println("II");
		}
		else if(value ==3) {
			System.out.println("III");
		}
		else if(value ==4) {
			System.out.println("IV");
		}
		else if(value ==5) {
			System.out.println("V");
		}
		else if(value ==6) {
			System.out.println("VI");
		}
		else if(value ==7) {
			System.out.println("VII");
		}
		else if(value ==8) {
			System.out.println("VIII");
		}
		else if(value ==9) {
			System.out.println("IX");
		}
		else if(value ==10) {
			System.out.println("X");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please eneter a number between 1-10:");
		Scanner keyboard= new Scanner(System.in);
		int value = keyboard.nextInt();
		pretvoriBrojURimskiBroj(value);
		
	}

}
