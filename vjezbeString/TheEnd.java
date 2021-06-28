package vjezbeString;

import java.util.Scanner;

//Napiši program koji čita riječi sa tipkovnice
//tako dugo dok ne upišemo riječ ’’KRAJ’
public class TheEnd {
	public static void main(String[] args) {
		System.out.print("upisi rijec");
		for (int i = 1; i !=0; i++) {
		   Scanner skener1=new Scanner(System.in);
		   String rijec=skener1.next();
		   if (!rijec.equals("kraj")) {
		      System.out.print(rijec);
		   } else {
			   i=0;
		   }
		}
	}
}
