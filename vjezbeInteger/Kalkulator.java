package vjezbeInteger;

import java.util.Random;
import java.util.Scanner;

public class Kalkulator {
	public static void main(String[] args) {
System.out.print("Odaberite računsku operaciju. Imate 4 opcije: 1. Zbrajanje 2. Oduzimanje 3. Množenje 4. Dijeljenje");
Scanner skener1=new Scanner(System.in);

Integer operacija=skener1.nextInt();
System.out.print("Prvi broj");
Scanner skener2=new Scanner(System.in);
Integer prvibroj=skener2.nextInt();
System.out.print("Drugi broj");
Scanner skener3=new Scanner(System.in);
Integer drugibroj=skener3.nextInt();
		if(operacija==1) {
			Integer zbroj=prvibroj+drugibroj;
			System.out.print(String.valueOf(zbroj));
		}else if(operacija==2) {
			Integer razlika=prvibroj-drugibroj;
			System.out.print(String.valueOf(razlika));
		}else if(operacija==3) {
			Integer umnozak=prvibroj*drugibroj;
			System.out.print(String.valueOf(umnozak));
		}else {
			Integer djelnik=prvibroj/drugibroj;
			System.out.print(String.valueOf(djelnik));
		}
				
	}



}
