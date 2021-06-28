package vjezbeString;

import java.util.Scanner;

//Napiši program koji pročita jednu riječ. 
//nakon toga je ispiše onoliko puta koliko iznosi broj slova u toj riječi. 
//(pomoć:metoda koja određuje dužinu riječi:  int duzina=rijec.lenght();)
public class KopirkaBrojac {
	public static void main (String [] args) {
		System.out.print("upisite trazenu rijec");
		Scanner skener1=new Scanner(System.in);
		String rijec=skener1.next();
		int duzina=rijec.length();
		for (int i = 0; i < duzina; i++) {
			  System.out.println(rijec);
			}

	}
}
