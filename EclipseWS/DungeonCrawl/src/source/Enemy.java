package source;

import org.newdawn.slick.Animation;

public class Enemy {
	
	private static Animation a;
	private static int maxHP;
	private static int curHP;
	private static int attackdmg;
	
	public Enemy(Animation a, int maxHP, int curHP, int attackdmg) {
		this.a = a;
		this.maxHP = maxHP;
		this.curHP = curHP;
		this.attackdmg = attackdmg;
	}
}
