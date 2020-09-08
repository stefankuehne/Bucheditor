import java.util.ArrayList;

public class User {
	private String name = "";
	private ArrayList<Thema> thema = new ArrayList<>();

	User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Thema> getThemaList() {
		return thema;
	}

	public void setThema(ArrayList<Thema> thema) {
		this.thema = thema;
	}

	void addThema(String thema) {
		if (!themaExists(thema)) {
			this.thema.add(new Thema(thema));
		}
	}

	boolean themaExists(String thema) {
		for (int i = 0; i < this.thema.size(); i++) {
			Thema tmp = this.thema.get(i);
			if (tmp.getThema().equals(thema)) {
				return true;
			}
		}
		return false;
	}

	public int getIndex() {
		
		return 0;
	}
	
}
