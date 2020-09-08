import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Knopf extends Feld  {
	private JButton button;
	private String name = "";
	static Listener l =new Listener();
	Knopf(String name, int size) {
		super(name, size);
		button = new JButton(name);
		button.addActionListener(l);
		button.setActionCommand(name);
		button.setFont(new Font("Arial", Font.PLAIN, size));
		this.name = name;
	}

	@Override
	void setBounds(int x, int y, int width, int height) {
		button.setBounds(x, y, width, height);

	}

	@Override
	String getData() {
		return name;
	}

	public JButton getJ() {
		return button;
	}

	@Override
	public void setName(String name) {
		button.setActionCommand(name);
		

	}

	@Override
	void setData(String s) {
		button.setText(s);
		
	}

	

	

}
