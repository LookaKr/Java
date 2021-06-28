package vjezbeString;

import java.util.Scanner;

//Napiši program koji pročita jednu riječ. 
//Nakon toga program 10 puta ispiše tu riječ.
public class Kopirka {
public static void main (String [] args) {
	System.out.print("upisite trazenu rijec");
	Scanner skener1=new Scanner(System.in);
	String rijec=skener1.next();
	for (int i = 0; i < 11; i++) {
		  System.out.println(rijec);
		}

	
}
}
