package vjezbeInteger;

import java.util.Scanner;

public class Mjenjacnica {
	public static void main(String[] args) {
		
		  Scanner in= new Scanner(System.in);
		  System.out.println("unesi iznose eura i centa");
		  System.out.print("iznos u eurima = "); int eura = in.nextInt();
		  System.out.print("izos u centima = "); int centa = in.nextInt(); centa =
		  100*eura+centa; double kuna = centa*0.0751; System.out.print("kuna: ");
		  System.out.print(kuna);
		 
	}
}
             
