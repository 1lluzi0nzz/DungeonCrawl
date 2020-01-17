package source;
import org.newdawn.slick.*;

public class Player {
	
	public static Player p;
	public static Animation cAnim;
	public static Animation movingUp;
	public static Animation movingDown;
	public static Animation movingLeft;
	public static Animation movingRight;
	public static Animation attack;
	
	public static int maxHP;
	public static int curHP;
	public static int attackdmg;
	public static int[] duration = {200, 200};
	public static int[] attDuration = {100, 100, 100, 100, 100, 1};
	public static float xCoord = 540;
	public static float yCoord = 200;
	
	public Player(int maxHP, int curHP, int attackdmg) throws SlickException {
		this.maxHP = maxHP;
		this.curHP = curHP;
		this.attackdmg = attackdmg;
		
		Image[] walkUp = {new Image("res/graphic/animations/dudebroMove/dudebro.png"),new Image("res/graphic/animations/dudebroMove/dudebro.png")};
		Image[] walkDown = {new Image("res/graphic/animations/dudebroMove/dudebro.png"),new Image("res/graphic/animations/dudebroMove/dudebro.png")};
		Image[] walkLeft = {new Image("res/graphic/animations/dudebroMove/dudebro.png"),new Image("res/graphic/animations/dudebroMove/dudebro.png")};
		Image[] walkRight = {new Image("res/graphic/animations/dudebroMove/dudebro.png"),new Image("res/graphic/animations/dudebroMove/dudebro.png")};
		Image[] att = {new Image("res/graphic/animations/dudebroAttack/dudebro attack 1.png"), 
					new Image("res/graphic/animations/dudebroAttack/dudebro attack 2.png"), 
					new Image("res/graphic/animations/dudebroAttack/dudebro attack 3.png"), 
					new Image("res/graphic/animations/dudebroAttack/dudebro attack 2.png"), 
					new Image("res/graphic/animations/dudebroAttack/dudebro attack 1.png"), 
					new Image("res/graphic/animations/dudebroMove/dudebro.png")};
		
		movingUp = new Animation(walkUp, duration, false);
		movingDown = new Animation(walkDown, duration, false);
		movingLeft = new Animation(walkLeft, duration, false);
		movingRight = new Animation(walkRight, duration, false);
		attack = new Animation(att, attDuration, true);
		cAnim = movingDown;
		
	}
	//Frame 3 dmg frame
	public static void basicAttack(){
		Player.cAnim = Player.attack;
		Player.attack.stopAt(5);
		Player.attack.restart();
		
	}
	
}