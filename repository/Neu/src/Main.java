
public class Main {

	public static void main(String[] args) {
		Logik l = Logik.getInstance();
		l.startData();
        l.convertStringtoHD();
//		l.init();
	}

	void musikabspielen() {
		Musik musik = new Musik();
		while (true) {
			musik.hallo();
			try {
				Thread.sleep(1000 * 60 * 25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}