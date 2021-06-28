package vjezbeListNiz;

public class Niz {
	public static void main(String[] args) {
		int[] red= new int[5];
		red[0]= 7;
		red[1]= 12;
		red[2]= 2;
		red[3]= 58;
		red[4]= 3;
		int yellow = red[2]+red[4];
		
		for(int i=0;i<5;++i) {
			System.out.println(red[i]);
		}
		System.out.println(yellow);
		
		int [] blue = {5,87,98,101,454};
		for(int i=0;i<5;++i) {
			System.out.println(blue[i]);
		}
		String [] harobotichari = {"najljepsi","najpametniji","najbolji jedaci","moje ljubavi i perica koja se stalno gura nama"};
		for(int i=0;i<4;++i) {
			System.out.println(harobotichari[i]);
		}
	}
}