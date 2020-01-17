package source;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import javax.swing.*;

public class Spawn extends BasicGameState{
	
	public String mseX = "0";
	public String mseY = "0";

	public int csX = 700;
	public int csY = 160;
	
	Image bg;
	
	public Spawn(int state){
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		bg = new Image("res/graphic/map/Spawn.png");
		Player.p = new Player(100,100,100);
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{

		g.setColor(Color.white);
		
		g.drawImage(bg, 0, 0);
		g.drawString("Room: "+this.getClass().toString().substring(13, this.getClass().toString().length()), 20, 22);
		g.drawString("X "+ mseX, 20, 34);
		g.drawString("Y "+ mseY, 20, 46);
		
		g.drawString("PlayerX "+Player.xCoord,20, 60);
		g.drawString("PlayerY "+Player.yCoord,20, 74);
		
		Player.cAnim.draw(Player.xCoord, Player.yCoord);
		
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
		Input i = gc.getInput();
		gc.setShowFPS(false);
		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		mseX = "X "+mouseX;
		mseY = "Y "+mouseY;
		
		/**
		 * KEYBOARD HANDLING STARTS
		 */
		if((i.isKeyDown(i.KEY_W))) {
			Player.cAnim = Player.movingUp;
			Player.yCoord -= delta *.33f;
		}
		if((i.isKeyDown(i.KEY_S))) {
			Player.cAnim = Player.movingDown;
			Player.yCoord += delta *.33f;
		}
		if((i.isKeyDown(i.KEY_A))) {
			Player.cAnim = Player.movingLeft;
			Player.xCoord -= delta * .33f;
		}
		if((i.isKeyDown(i.KEY_D))) {
			Player.cAnim = Player.movingRight;
			Player.xCoord += delta * .33f;
		}
		if((i.isKeyPressed(i.KEY_SPACE))) {
				Player.basicAttack();
		}
		
		/**
		 * ROOM MOVING LOGIC
		 */
		//Bot Wall Detection
		if((Player.xCoord <= 89)) {
			Player.xCoord += delta * .33f;
		}
		if((Player.xCoord >= 656)) {
			Player.xCoord -= delta * .33f;
		}
		if((Player.yCoord >= 522)) {
			Player.yCoord -= delta * .33f;
		}
		if((Player.yCoord <= 95) && (Player.xCoord >= 89) && (Player.xCoord <= 294)){
			Player.yCoord += delta * .33f;
		}
		//ENTER UP
		if((Player.yCoord <= 0) && (Player.xCoord >= 333) && (Player.xCoord <= 660)) {
			sbg.enterState(12);
			Player.xCoord = 500;
			Player.yCoord = 600;
		}
		
	}
	
	public int getID(){
		return 1;
	}
}
