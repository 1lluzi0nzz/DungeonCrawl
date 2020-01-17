package source;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

public class MusicEngine {
	
	public static Music boss;
	
	public static void playBossTheme() {
		try {
			boss = new Music("res/sound/sans.ogg");
			boss.loop(1f, .02f);
		}catch(SlickException s) {
			s.printStackTrace();
		}
	}
}
