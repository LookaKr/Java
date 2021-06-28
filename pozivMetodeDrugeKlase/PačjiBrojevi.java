package pozivMetodeDrugeKlase;

import java.util.Scanner;

public class PačjiBrojevi {
	
public static void main(String[] args) {
	int n1;
	MojiPačjiBrojevi original=new MojiPačjiBrojevi();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	n1=sc.nextInt();
	original.setBroj(n1);
	if(original.checkNumber()) {
		System.out.println(n1+" is a Duck number");
	} else {
		System.out.println(n1+" is not a Duck number");
	}
}
}
