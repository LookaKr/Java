package vjezbeInteger;

import java.util.Scanner;

//Napiši program koji pročita jedan broj. 
//Nakon toga ispiše sve brojeve od 5 do tog broja.
public class RokajIntegere {
	public static void main(String[] args) {
		System.out.print("upisi jedan broj");
		Scanner skener1=new Scanner(System.in);
		Integer broj=skener1.nextInt();
		for (int i = 5; i < broj; i++) {
			  System.out.println(i);
			}
	}
}
