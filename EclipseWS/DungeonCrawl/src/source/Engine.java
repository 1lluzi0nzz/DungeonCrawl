package source;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import javax.swing.JOptionPane;

public class Engine extends StateBasedGame{

	public static final String gname = "DungeonCrawl - Team Aerosentient";
	public static String gMode;
	
	public static final int intro = 0;
	public static final int spawn = 1;
	public static final int room00 = 2;
	public static final int room01 = 3;
	public static final int room02 = 4;
	public static final int room03 = 5;
	public static final int room04 = 6;
	public static final int room10 = 7;
	public static final int room11 = 8;
	public static final int room12 = 9;
	public static final int room13 = 10;
	public static final int room14 = 11;
	public static final int room20 = 12;
	public static final int room21 = 13;
	public static final int room22 = 14;
	public static final int room23 = 15;
	public static final int room24 = 16;
	public static final int room30 = 17;
	public static final int room31 = 18;
	public static final int room32 = 19;
	public static final int room33 = 20;
	public static final int room34 = 21;
	public static final int room40 = 22;
	public static final int room41 = 23;
	public static final int room42 = 24;
	public static final int room43 = 25;
	public static final int room44 = 26;
	public static final int bossRoom = 27;
	
	public Engine(String gname){
		super(gname);
		this.addState(new Intro(intro));
		this.addState(new Spawn(spawn));
		this.addState(new Room00(room00));
		this.addState(new Room01(room01));
		this.addState(new Room02(room02));
		this.addState(new Room03(room03));
		this.addState(new Room04(room04));
		this.addState(new Room10(room10));
		this.addState(new Room11(room11));
		this.addState(new Room12(room12));
		this.addState(new Room13(room13));
		this.addState(new Room14(room14));
		this.addState(new Room20(room20));
		this.addState(new Room21(room21));
		this.addState(new Room22(room22));
		this.addState(new Room23(room23));
		this.addState(new Room24(room24));
		this.addState(new Room30(room30));
		this.addState(new Room31(room31));
		this.addState(new Room32(room32));
		this.addState(new Room33(room33));
		this.addState(new Room34(room34));
		this.addState(new Room40(room40));
		this.addState(new Room41(room41));
		this.addState(new Room42(room42));
		this.addState(new Room43(room43));
		this.addState(new Room44(room44));
		this.addState(new BossRoom(bossRoom));

	}
	public void initStatesList(GameContainer gc ) throws SlickException{
		this.getState(intro).init(gc, this);
		this.getState(spawn).init(gc, this);
		this.getState(room00).init(gc, this);
		this.getState(room01).init(gc, this);
		this.getState(room02).init(gc, this);
		this.getState(room03).init(gc, this);
		this.getState(room04).init(gc, this);
		this.getState(room10).init(gc, this);
		this.getState(room11).init(gc, this);
		this.getState(room12).init(gc, this);
		this.getState(room13).init(gc, this);
		this.getState(room14).init(gc, this);
		this.getState(room20).init(gc, this);
		this.getState(room21).init(gc, this);
		this.getState(room22).init(gc, this);
		this.getState(room23).init(gc, this);
		this.getState(room24).init(gc, this);
		this.getState(room30).init(gc, this);
		this.getState(room31).init(gc, this);
		this.getState(room32).init(gc, this);
		this.getState(room33).init(gc, this);
		this.getState(room34).init(gc, this);
		this.getState(room40).init(gc, this);
		this.getState(room41).init(gc, this);
		this.getState(room42).init(gc, this);
		this.getState(room43).init(gc, this);
		this.getState(room44).init(gc, this);
		this.getState(bossRoom).init(gc, this);
		
		this.enterState(intro);
	}
	
	public static void main(String[] args){
		AppGameContainer agc = null;
		try{
			agc = new AppGameContainer(new Engine(gname));
			agc.setDisplayMode(1366, 768, false);
			
			//agc.setIcon("");
			agc.start();
		}catch(SlickException e){
			e.printStackTrace();	
		}
		
	}

}
