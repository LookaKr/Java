package vjezbeListNiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaAutomobila {
		public static void main(String[] args) {
			System.out.print("upiši prvu marku auta.");
			Scanner skener1=new Scanner(System.in);
			String auto1=skener1.next();
			
			System.out.print("upiši drugu marku auta");
			Scanner skener2=new Scanner(System.in);
			String auto2=skener2.next();
			
			System.out.print("upiši treću marku auta");
			Scanner skener3=new Scanner(System.in);
			String auto3=skener3.next();
			
			 List<String> mojiAuti = new ArrayList<String>();
			 mojiAuti.add(auto1);
			 mojiAuti.add(auto2);
			 mojiAuti.add(auto3);
			 
			 if (mojiAuti.contains("Opel")) {
			      System.out.print("g***o");
			   } else {
				   System.out.print("bravo");
			   }
		}
}
					
