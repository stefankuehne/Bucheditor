import java.util.ArrayList;

public class Thema {
	private String thema ="";
	private ArrayList <Titel> titel = new ArrayList<>();
public Thema(String thema) {
	this.thema = thema;
	}

public String getThema() {
	return thema;
}

public void setThema(String thema) {
	this.thema = thema;
}

public ArrayList<Titel> getTitelList() {
	return titel;
}


void addTitel(String titel){
	if ( ! titelExists(titel))
	this.titel.add(new Titel(titel));
		}
boolean titelExists(String titel) {
	
	for (int i = 0; i < this.titel.size(); i++) {
		Titel tmp = this.titel.get(i);
		 if(tmp.getTitel().equals(titel)) {return true;} 
	}
	return false;
}

public void getIndex() {
	
	
}


}
