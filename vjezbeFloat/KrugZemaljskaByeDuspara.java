package vjezbeFloat;

import java.util.Scanner;

//Napiši program koji pročita jedan broj. 
//Nakon toga ako je broj veći od 10 program izračuna površinu kruga i ispišerezultat.
//U suprotno program izračuna opseg kruga i ispiše ga 
//U oba slučaja radijus je jednak upisanom broju.
public class KrugZemaljskaByeDuspara {
	public static void main(String[] args) {
		System.out.print("upiši broj");
		Scanner skener1=new Scanner(System.in);
        Integer radijus=skener1.nextInt();
        
        if(radijus < 11) {
        	float opseg=2*radijus*3.14f;
        	System.out.print(opseg);
        }else {
        	float povrsina=3.14f*radijus*radijus;
        	System.out.print(povrsina);
        }
	}
}
