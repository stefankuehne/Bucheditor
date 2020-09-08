import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Write {
	private String pfad = "src/";
	private String all="";

	public void writeHD(String eingabe) {
		try {
			File datei = new File(pfad + eingabe);
			datei.createNewFile();
			datei.delete();
			PrintWriter pw = new PrintWriter(new FileWriter(datei));
			pw.print(all);
			pw.flush();
			pw.close();
		} catch (Exception e) {
		}
	}

	public void setUser(String name) {
		String s = "<html>\r\n" + " <head>\r\n" + "  <title>";
		s = s + name + "</title>\r\n" + " </head>\r\n" + " <body>\r\n";
		all = all + s;
	}

	void setEnd(String name) {
		all = all + " </body>\r\n" + "</html>";
		writeHD(name);
	}

	public void setThema(String thema) {
		String s = "<h1>";
		s = s + thema + "</h1>\n";
		all = all + s;
	}

	public void setTitel(String titel) {
		String s = "<h2>";
		s = s + titel + "</h2>\n";
		all = all + s;
	}

	public void setText(String text) {
		String s = "<p>";
		s = s + text + "</p>\n";
		all = all + s;
	}
void setUserList(ArrayList<String> arrayList ){
	this.all = arrayList.toString() ;
	writeHD("UserList");
	all="";
}
	
}
