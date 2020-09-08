
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class TextFeld extends Feld  {
	private JTextArea text = new JTextArea();
	 static Listener l = new Listener();
	TextFeld(String name, int size) {
		super(name, size);
		text.addFocusListener(l);
		text.setAutoscrolls(true);
		text.addKeyListener(l);	
		text.setFont(new Font("Arial", Font.PLAIN, size));
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
	}

	@Override
	public String toString() {
		return String.format("TextFeld [text=%s]", text);
	}

	@Override
	String getData() {
		
		return text.getText();
	}

	@Override
	void setBounds(int x, int y, int width, int height) {
		text.setBounds(x, y, width, height);
	}

	@Override
	public void setName(String name) {
		text.setName(name);

	}

	public JTextArea getJ() {

		return text;
	}

	
	@Override
	void setData(String s) {
		text.setText(s);
		
	}

	
}
