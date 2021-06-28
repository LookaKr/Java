package pozivMetodeDrugeKlase;

public class CatMain {
	public static void main(String[] args) {
		Cat cat = new Cat(false, "lazanje", 4, "black");
		
		System.out.println("Cat is Vegeterian?" +cat.isVegeterian());
		System.out.println("Cat eats" + cat.getEats());
		System.out.println("Cat has" + cat.getNoOfLegs() + "legs");
		System.out.println("Cat color is" + cat.getColor());
		System.out.println("jel mačak Garfiled? " + cat.jelMacakGarfiled());
		}

}
