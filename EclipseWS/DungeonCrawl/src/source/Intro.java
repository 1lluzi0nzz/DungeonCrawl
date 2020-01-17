package source;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import javax.swing.*;

public class Intro extends BasicGameState{
	
	Image bg;
	public String mseX = "0";
	public String mseY = "0";

	public int csX = 700;
	public int csY = 160;
	
	public Intro(int state){
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		bg = new Image("res/graphic/screens/mountains.png");
		
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{

		g.setColor(Color.green);
		g.drawImage(bg, 0, 0);
		g.drawString("X "+ mseX, 20, 34);
		g.drawString("Y "+ mseY, 20, 46);
		
		
		
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
		Input i = gc.getInput();
		gc.setShowFPS(false);
		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		mseX = "X "+mouseX;
		mseY = "Y "+mouseY;
		
		
		if(i.isMousePressed(0)) {
			sbg.enterState(1);
		}
		
	}
	
	public int getID(){
		return 0;
	}
}
