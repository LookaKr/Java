package pozivMetodeDrugeKlase;

public class Cat {
Boolean vegetarian;
String eats;
Integer noOfLegs;
String color;
public Cat(Boolean vegetarian, String eats, Integer noOfLegs, String color) {
	super();
	this.vegetarian = vegetarian;
	this.eats = eats;
	this.noOfLegs = noOfLegs;
	this.color = color;
}
public String getEats() {
	return eats;
}
public void setEats(String eats) {
	this.eats = eats;
}
public Integer getNoOfLegs() {
	return noOfLegs;
}
public void setNoOfLegs(Integer noOfLegs) {
	this.noOfLegs = noOfLegs;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String isVegeterian() {
	if (this.vegetarian==true) {
		return "yes";
	} else {
		return "no";
	}

}

public boolean jelMacakGarfiled() {
	if(this.eats=="lazanje") {
		return true;
	}else {
		return false;
	}
}
public String vratiMacka() {
	return this.color + this.eats + this.getNoOfLegs() + this.isVegeterian();
}


}
