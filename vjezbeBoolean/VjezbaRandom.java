package vjezbeBoolean;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class VjezbaRandom {
	public static void main(String[] args) throws InterruptedException {
		//pljačka kladionice
		Random rdInteger = new Random();
		int bound = 50;  
		int kof=rdInteger.nextInt(bound);
		Scanner userInputScanner=new Scanner(System.in);
		System.out.println("Dobar dan kospodine, za koliko novčeka ce biti uplatica?");
		String novac=userInputScanner.nextLine();
		System.out.println("Aaaa,jeste šarmantni. Neka je sa srecom. Pričekajmo rezultate.");
		TimeUnit.SECONDS.sleep(5);
		Random rdBoolean = new Random(); 
		if(rdBoolean.nextBoolean()) {
			int dobitak=kof*Integer.parseInt(novac);
			System.out.print("Dobio si"+String.valueOf(dobitak) +". Kad častiš?");
		} else {
			System.out.println("Šta ti igraš sina ti milog...");
		}
		
				
	}

}
