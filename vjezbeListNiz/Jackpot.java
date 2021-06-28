package vjezbeListNiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jackpot {
	public static void main(String[] args) {
		System.out.print("upisi DOBITNE brojeve");
		Scanner skener1=new Scanner(System.in);
		   String kombinacija=skener1.next();
		   Integer a=Integer.parseInt(kombinacija.substring(0,2));
		      Integer b=Integer.parseInt(kombinacija.substring(3,5));
		      Integer c=Integer.parseInt(kombinacija.substring(6,8));
		      Integer d=Integer.parseInt(kombinacija.substring(9,11));
		      Integer e=Integer.parseInt(kombinacija.substring(12,14));
		      Integer f=Integer.parseInt(kombinacija.substring(15,17));
		      Integer g=Integer.parseInt(kombinacija.substring(18,20));

		      List<Integer> mojiBrojevi = new ArrayList<Integer>();
		      mojiBrojevi.add(a);
		      mojiBrojevi.add(b);
		      mojiBrojevi.add(c);
		      mojiBrojevi.add(d);
		      mojiBrojevi.add(e);
		      mojiBrojevi.add(f);
		      mojiBrojevi.add(g);
		      List<Integer> officialBrojevi = new ArrayList<Integer>();
		      officialBrojevi.add(15);
		      officialBrojevi.add(26);
		      officialBrojevi.add(35);
		      officialBrojevi.add(37);
		      officialBrojevi.add(43);
		      officialBrojevi.add(3);
		      officialBrojevi.add(8);
		      for (int i = 0; i < mojiBrojevi.size(); i++) {
				  if (officialBrojevi.contains(mojiBrojevi.get(i))) {
					  if (i != mojiBrojevi.size()-1) {
						  continue;
					  }
					  System.out.print("jackpooooooot");
				  } else {
					  System.out.print("niste osvojili");
					  break;
				  }
				  
				}
	}
}
