import java.awt.Font;

public abstract class Feld {
	private String name = "";
	private Font schrift = new Font(null);

	Feld(String name, int size) {
		this.name = name;
		this.schrift = new Font("Arial", Font.PLAIN, size);
	}

	String getName() {
		return name;
	}

	@Override
	public String toString() {
		return  name;
	}

	abstract public void setName(String name);

	abstract void setBounds(int x, int y, int width, int height);

	abstract String getData();
	abstract  void setData(String s);
}
