package pozivMetodeDrugeKlase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<Cat> macke=new ArrayList();
		Cat srecko=new Cat(false,"salamu od ljubasa",4,"sivo sarena");
		macke.add(0, srecko);
		System.out.println(macke.get(0).vratiMacka());
		
		List<Cat> macke2=new LinkedList();
		macke2.add(0, srecko);
		System.out.println(macke2.get(0).vratiMacka());
	}

}
