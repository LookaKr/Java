package vjezbeString;

import java.util.Scanner;

public class UserInputScanner {
	public static void main(String[] args) {
		Scanner userInputScanner=new Scanner(System.in);
		System.out.print("Tell me your name");
		String userInputName=userInputScanner.nextLine();
		System.out.println("Hello"+userInputName+"!");
	}

}
