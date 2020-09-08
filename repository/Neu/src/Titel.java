import java.util.ArrayList;

public class Titel {
	private String titel="";
	private ArrayList <String> text = new ArrayList<>();
public Titel(String titel) {
	if(titel == null) {titel="";}
		this.titel = titel;
	}

void addText(String text) {
	if(!textExists(text)) 
    this.text.add(text);
	}

boolean textExists(String text) {
	for (int i = 0; i < this.text.size(); i++) {
		String tmp = this.text.get(i);
			 if(tmp.equals(text)) {return true;}
	}
	return false;
}

public String getTitel() {
	return titel;
}

public void setTitel(String titel) {
	this.titel = titel;
}

public ArrayList<String> getTextList() {
	return text;
}

public void setTextList(ArrayList<String> text) {
	this.text = text;
}


}

