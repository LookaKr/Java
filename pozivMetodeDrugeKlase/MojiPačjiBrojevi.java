package pozivMetodeDrugeKlase;

import java.util.List;

public class MojiPačjiBrojevi {
Integer broj;
List<Integer> duckBrojevi;



public Integer getBroj() {
	return broj;
}



public void setBroj(Integer broj) {
	this.broj = broj;
}



public List<Integer> getDuckBrojevi() {
	return duckBrojevi;
}



public void setDuckBrojevi(List<Integer> duckBrojevi) {
	this.duckBrojevi = duckBrojevi;
}



public MojiPačjiBrojevi(Integer broj, List<Integer> duckBrojevi) {
	super();
	this.broj = broj;
	this.duckBrojevi = duckBrojevi;
}





public MojiPačjiBrojevi() {
	super();
}



public boolean checkNumber() {
	Integer number=this.broj;
	while(this.broj !=0) {
		if(number%10==0) 
			return true;
		
		number=number/10;
	}
	return false;
}

}
