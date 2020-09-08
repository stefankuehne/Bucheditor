
import java.util.ArrayList;

public class View {
	private MainGui g = new MainGui();
	private ArrayList<Feld> feld = new ArrayList<>();

	void defaultView(String name) {
		feld = g.start();
	for(int i= 0;i<feld.size();i++) {
		System.out.print(feld.get(i).getName()+"     ");
		System.out.println(feld.get(i).getData()+"  "+i);
		}
	}

// Reihenfolge der Inizialisierung in MainGui
	public void setText(String text) {
		feld.get(3).setData(text);
	}

	public void setUser(String user) {
		feld.get(4).setData(user);
	}

	// feld 5-10
	public void setThemaList(ArrayList<String> thema) {
		for (int i = 0; i < thema.size(); i++) {
			feld.get(5 + i).setData(thema.get(i));
		}
	}
	public String getThema(int i) {
		return feld.get(i+5).getData();
	}

	// feld 11 -20
	public void setTitelList(ArrayList<String> titel) {
		for (int i = 0; i < titel.size(); i++) {
			feld.get(11 + i).setData(titel.get(i));
		}
	}
public String getTitel(int i) {
		return feld.get(i+11).getData();
	}
	void setTitel(String name) {
		feld.get(2).setData(name);
	}

	public String getNewUser() {
		return feld.get(0).getData();
	}

	public String getThema() {
		return feld.get(1).getData();
	}

	public String getTitel() {
		return feld.get(2).getData();
	}

	public String getText() {
		return feld.get(3).getData();
	}

	public String getUserName() {
		System.out.println(feld.get(4).getData());
		return feld.get(4).getData();
	}

	

	

	
}
