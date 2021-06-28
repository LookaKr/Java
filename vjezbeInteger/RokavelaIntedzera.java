package vjezbeInteger;

import java.util.Scanner;

//Napiši program koji pročita 3 broja. 
//Program izračuna srednju vrijednost. 
//Rezultat ispiše onoliko puta koliko iznosi 1.upisani broj
public class RokavelaIntedzera {
	public static void main(String[] args) {
		System.out.print("upiši prvi broj. prvijanac.");
		Scanner skener1=new Scanner(System.in);

		Integer dugadevetka=skener1.nextInt();
		System.out.print("Unesite drugi broj. drugijenac");
		Scanner skener2=new Scanner(System.in);
		Integer kratkasedmica=skener2.nextInt();
		System.out.print("Unesite treci broj. trecijenac");
		Scanner skener3=new Scanner(System.in);
		Integer drugadrugica=skener3.nextInt();
		Integer srednjavrijednost=(dugadevetka+kratkasedmica+drugadrugica)/3;
		for (int i = 0; i < dugadevetka; i++) {
			  System.out.println(srednjavrijednost);
			}
	}
}
