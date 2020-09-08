import java.io.File;

public class Logik {
	private static Logik instance = new Logik();
	Data d = new Data();
	Read a = new Read();
	static View v = new View();

	private Logik() {
	}

	public static Logik getInstance() {
		return instance;
	}

	void startData() {
		convertHDtoString("HalloWo");
		v.defaultView("Halo");
		start(0,0,0);
	}

	void start(int i, int j, int k) {
		d.setUserIndex(i);
        d.setThemaIndex(j);
        d.setTitelIndex(k);
        v.setUser(d.getUser());
		v.setThemaList(d.getThemaList());
		v.setTitelList(d.getTitelList());
		v.setText(d.getTextList().get(0));
    }

	public void switchUser(boolean b) {
		int i = d.getUserIndex();
		if (b) {i++;}
		else {i--;}
		if (i > d.getUserList().size()-1) {i = 0;}
		if (i < 0) {i = d.getUserList().size()-1;}
		start( i, 0, 0);
	}

	public void switchThema(int i) {
		d.setThema(v.getThema(i));
		start(d.getUserIndex(),i,0);
	}

	public void switchTitel(int i) {
		d.setTitel(v.getTitel(i));
		start(d.getUserIndex(),d.getThemaIndex(),i);
	}
	
	void convertHDtoString(String name) {
		Read r = new Read();
		System.out.println(r.getUserArray());// array
		r.insert("HalloWo"); // einbinden
		while (!r.isEmpty()) {
			r.setNext();
			d.setUser(r.getUser());
			d.setThema(r.getThema());
			d.setTitel(r.getTitel());
			d.setText(r.getText());
		}
	}

	void convertStringtoHD() {
		Write w = new Write();
		for (int i = 0; i < d.getUserList().size(); i++) {
			w.setUser(d.getUserList().get(i));
			for (int j = 0; j < d.getThemaList().size(); j++) {
				w.setThema(d.getThemaList().get(j));
				for (int k = 0; k < d.getTitelList().size(); k++) {
					w.setTitel(d.getTitelList().get(k));
					for (int l = 0; l < d.getTextList().size(); l++) {
						w.setText(d.getTextList().get(l));
					}
				}
			}
			w.setEnd(d.getUserList().get(i));
		}
		w.setUserList(d.getUserList());
	}
}
