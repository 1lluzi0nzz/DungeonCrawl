package source;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import javax.swing.*;

public class Room10 extends BasicGameState{
	
	public String mseX = "0";
	public String mseY = "0";

	public int csX = 700;
	public int csY = 160;
	
	Image bg;
	
	public Room10(int state){
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		bg = new Image("res/graphic/map/10.png");
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
		if(((Player.xCoord <= 60)) && ((Player.yCoord >= 420) || (Player.yCoord <= 226))) {
			Player.xCoord += delta * .33f;
		}
		if(((Player.xCoord >= 902))) {
			Player.xCoord -= delta * .33f;
		}
		if(Player.xCoord >= 640) {
			if(Player.yCoord <= 63) {
				Player.yCoord += delta * .33f;
			}
			if(Player.yCoord >= 626) {
				Player.yCoord -= delta * .33f;
			}
		}
		if(Player.xCoord <= 360) {
			if(Player.yCoord <= 63) {
				Player.yCoord += delta * .33f;
			}
			if(Player.yCoord >= 626) {
				Player.yCoord -= delta * .33f;
			}
		}
		if(Player.yCoord >= 625) {
			Player.yCoord -= delta * .33f;
		}
		//ENTER UP
		if(Player.yCoord <= 0) {
			sbg.enterState(8);
			Player.xCoord = 500;
			Player.yCoord = 600;
		}
		//ENTER LEFT
		if(Player.xCoord <= 10) {
			sbg.enterState(2);
			//912 307
			Player.xCoord = 912;
			Player.yCoord = 307;
		}
	}
	
	public int getID(){
		return 7;
	}
}
