import java.util.ArrayList;

public class Data {
	private ArrayList<User> userList = new ArrayList<>();
	private User tmpUser = new User("");
	private Thema tmpThema= new Thema("");
	private Titel tmpTitel= new Titel("");
	private String tmpText= "";

	public String getUser() {
		return tmpUser.getName();
	}

	public ArrayList<String> getUserList() {
		ArrayList<String> tmpUserList = new ArrayList<>();
		for (int i = 0; i < userList.size(); i++) {
			tmpUserList.add(userList.get(i).getName());
		}
		return tmpUserList;
	}
	

	public ArrayList<String> getThemaList() {
		ArrayList<String> tmpThemaList = new ArrayList<>();
		for (int i = 0; i < tmpUser.getThemaList().size(); i++) {
			tmpThemaList.add(tmpUser.getThemaList().get(i).getThema());
		}
		return tmpThemaList;
	}

	public ArrayList<String> getTitelList() {
		ArrayList<String> tmpTitelList = new ArrayList<>();
		for (int i = 0; i < tmpThema.getTitelList().size(); i++) {
			tmpTitelList.add(tmpThema.getTitelList().get(i).getTitel());
		}
		return tmpTitelList;
	}

	public ArrayList<String> getTextList() {
		ArrayList<String> tmpTextList = new ArrayList<>();
		for (int i = 0; i < tmpTitel.getTextList().size(); i++) {
			tmpTextList.add(tmpTitel.getTextList().get(i));
		}
		return tmpTextList;
	}

	public void setUser(String tmpUser) {
		if (!userExists(tmpUser)) {
			userList.add(new User(tmpUser));}
		for (int i = 0; i < userList.size(); i++) {
			if (userExists(tmpUser)) {
				this.tmpUser = userList.get(i);
				}
		}
	}
public void setThema(String tmpThema) {
		if (!tmpUser.themaExists(tmpThema)) {
			tmpUser.addThema(tmpThema);
			}
		for (int i = 0; i < tmpUser.getThemaList().size(); i++) {
			if (tmpUser.getThemaList().get(i).getThema().equals(tmpThema)) {
				this.tmpThema = tmpUser.getThemaList().get(i);
			}
		}
}

	public void setTitel(String tmpTitel) {
		if (!tmpThema.titelExists(tmpTitel)) {
			tmpThema.addTitel(tmpTitel);}
		for (int i = 0; i < tmpThema.getTitelList().size(); i++) {
			if (tmpThema.getTitelList().get(i).getTitel().equals(tmpTitel)) {
				this.tmpTitel = tmpThema.getTitelList().get(i);
			}
		}
	}

	public void setText(String tmpText) {
		if (!tmpTitel.textExists(tmpText)) {
			tmpTitel.addText(tmpText);}
		for (int i = 0; i < tmpTitel.getTextList().size(); i++) {
			if (tmpTitel.getTextList().get(i).equals(tmpText)) {
				this.tmpText = tmpTitel.getTextList().get(i);
			}
		}
	}
	private boolean userExists(String user) {
		for (int i = 0; i < this.userList.size(); i++) {
			User tmp = this.userList.get(i);
			if (tmp.getName().equals(user)) {return true;}
		}
		return false;
	}

	public int getUserIndex() {
		return userList.indexOf(tmpUser);
	}

	public void setUserIndex(int i) {
		tmpUser = userList.get(i);
		
	}

	public void setThemaIndex(int i) {
		if( i < this.tmpUser.getThemaList().size()){
		tmpThema = this.tmpUser.getThemaList().get(i);
		}else { tmpThema = this.tmpUser.getThemaList().get(0);}
	}
	public void setTitelIndex(int i) {
		if( i < this.tmpThema.getTitelList().size()){
			tmpTitel = this.tmpThema.getTitelList().get(i);
			} else {tmpTitel = this.tmpThema.getTitelList().get(0);}
		
	}

	public int getThemaIndex() {
		return this.tmpUser.getThemaList().indexOf(tmpThema);
	}
	
}
