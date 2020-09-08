

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Musik {
	String path = "E:\\java\\Meine\\Meine\\mu\\Tatu - Sacrifice.mp3";
	
	
	Musik(){
				}
	Musik(String path){
		if(path != null) 
		this.path = path;
		
	}
	
	synchronized void hallo() {
			try {
			FileInputStream a = new FileInputStream(this.path);
			Player p = new Player(a);
			p.play();
			
//			if (p.isComplete()) {
//				p.close();
//			}
		} catch (Exception e) {
			System.out.print(path );
		}
	}
}