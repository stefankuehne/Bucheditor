import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener implements FocusListener, ActionListener, KeyListener {
	static Logik l = Logik.getInstance();

	@Override
	public void focusGained(FocusEvent e) {
		
		System.out.println();
	}

	@Override
	public void focusLost(FocusEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "<":
			l.switchUser(true);
			break;
		case ">":
			l.switchUser(false);
			break;
		case "ThemaList1":
			l.switchThema(0);
			break;
		case "ThemaList2":
			l.switchThema(1);
			break;
		case "ThemaList3":
			l.switchThema(2);
			break;
		case "ThemaList4":
			l.switchThema(3);
			break;
		case "ThemaList5":
			l.switchThema(4);
			break;
		case "ThemaList6":
			l.switchThema(5);
			break;
		case "TitelList1":
			l.switchTitel(0);
			break;
		case "TitelList2":
			l.switchTitel(1);
			break;
		case "TitelList3":
			l.switchTitel(2);
			break;
		case "TitelList4":
			l.switchTitel(3);
			break;
		case "TitelList5":
			l.switchTitel(4);
			break;
		case "TitelList6":
			l.switchTitel(5);
			break;
		case "TitelList7":
			l.switchTitel(6);
			break;
		case "TitelList8":
			l.switchTitel(7);
			break;
		case "TitelList9":
			l.switchTitel(8);
			break;
		case "TitelList10":
			l.switchTitel(9);
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent k) {
	}

	@Override
	public void keyReleased(KeyEvent k) {
	}

	@Override
	public void keyTyped(KeyEvent k) {
	}

}
