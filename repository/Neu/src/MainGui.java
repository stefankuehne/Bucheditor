
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainGui {
	private final Dimension DIMENSION = Toolkit.getDefaultToolkit().getScreenSize();
	private final int x = DIMENSION.width;
	private final int y = DIMENSION.height;
	private final int gr = 144;// gross
	private final int n = 64; // normal
	private final int l = 44;// listeundKnöpfe
	private final int h = 100; // höhe der listeundKnöpfe
	private ArrayList<Feld> feld = new ArrayList<>();
	private JFrame f = new JFrame();

	MainGui() {}
	ArrayList<Feld> start() {
		f.setSize(x, y - 100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		// Reihenfolge der Inizialisierung in MainGui
		addJtextArea("User", l, x - (x / 6), 0, (x / 6), h);
		addJtextArea("Thema", l, x - (x / 6), 300, (x / 6), h);
		addJtextArea("Titel", gr, x - (x * 5 / 6), 5, x - 2 * (x / 6), 360);
		addJtextArea("Text", n, x - (x * 5 / 6), 365, x - 2 * (x / 6), 1040);
		addKnopf("nameUsernow", l, x - (x / 6), 100, (x / 6), h);
		for (int i = 0; i < 5; i++) {
			String tmp = "ThemaList" + (i + 1);
			addKnopf(tmp, l, x - (x / 6), (i * h) + 400, (x / 6), h);
		}
		for (int i = 0; i < 9; i++) {
			String tmp = "TitelList" + (i + 1);
			addKnopf(tmp, l, 0, i * h, (x / 6), h);
		}

		addKnopf("<", l, x - (x / 6), 200, (x / 6) / 2, h);
		addKnopf(">", l, x - (x / 6) + (x / 6) / 2, 200, (x / 6) / 2, h);
		return feld;
	}

	private void addJButton(JButton j) {
		f.add(j);
		f.repaint();
	}

	private void addJTextArea(JTextArea j) {
		f.add(j);
		f.repaint();
	}

	private void addKnopf(String s, int size, int x, int y, int width, int height) {
		Feld tmp = new Knopf(s, size);// ActinonCommand s
		tmp.setName(s); // Name
		tmp.setData(s);
		tmp.setBounds(x, y, width, height);
		addJButton(((Knopf) tmp).getJ());
		feld.add(tmp);
	}

	private void addJtextArea(String text, int size, int x, int y, int width, int height) {
		Feld tmp = new TextFeld(text, size);
		((TextFeld) tmp).setData(text);
		tmp.setBounds(x, y, width, height);
		addJTextArea(((TextFeld) tmp).getJ());
		feld.add(tmp);
	}
}