package vjezbeNesvrstani;

public class WhilePetlje {
	public static void main(String[] args) {
		int i=0;
		System.out.println("Try while loop:");
		while(i!=0) {
			System.out.println("Iteration "+ i);
			i++;
		}
		
		System.out.println("Try do while loop");
		i=0;
		do {
			System.out.println("Iteration "+ i);
			i++;
		} while(i<0);

	}
}
