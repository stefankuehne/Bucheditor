
import java.io.File;
import java.util.Scanner;

public class Read {
	private String pfad = "src/";
	private String user;
	private String thema;
	private String titel;
	private String text;
	private String tmp;

	void insert(String dateiName) {
		this.tmp = readHD(dateiName);
		this.user = dateiName;
		tmp = tmp.substring(tmp.indexOf("<h1>"), tmp.indexOf("</body>"));
	}

	void setNext() {
		int startThema = tmp.indexOf("<h1>") + 4;
		int endThema = tmp.indexOf("</h1>");
		int startTitel = tmp.indexOf("<h2>") + 4;
		int endTitel = tmp.indexOf("</h2>");
		int startText = tmp.indexOf("<p>") + 3;
		int endText = tmp.indexOf("</p>");
		if (tmp.contains("<h1>")) {
			if (startThema < startTitel) {
				this.thema = tmp.substring(startThema, endThema);
			}
		}
		if (tmp.contains("<h2>")) {
			if (startTitel < startText) {
				this.titel = tmp.substring(startTitel, endTitel);
			}
		}
		if (tmp.contains("<p>")) {
			this.text = tmp.substring(startText, endText);
		}
		int tmpLength = tmp.length();
		if (tmpLength > 4) {
			tmp = tmp.substring(tmp.indexOf("</p>") + 4, tmpLength);
			
		} else
			tmp = "";

	}

	private String readHD(String name) {
		String text = "";
		try {
			File datei = new File(pfad + name);
			Scanner s = new Scanner(datei);
			while (s.hasNextLine()) {
				text = text + s.nextLine() + "\n";
			}
			s.close();
		} catch (Exception e) {
		}
		return text;
	}

	public String getUser() {
		return user;
	}

	public String getThema() {
		return thema;
	}

	public String getTitel() {
		return titel;
	}

	public String getText() {
		return text;
	}
    public boolean isEmpty() {
		return tmp.isEmpty();
	}
    String getUserArray(){
    	return readHD("UserList");
    }
}
