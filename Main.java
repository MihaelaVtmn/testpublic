
public class Main {

	public static void main(String[] args) {
		PlayerStatus player = new PlayerStatus();
		PlayerStatus oponent = new PlayerStatus();

		player.initPlayer("JaneDoe", 3, 10000);
		oponent.initPlayer("JohnDoe", 2, 10000);
		
		player.setPositionX(45);
		player.setPositionY(80);
		
		player.setWeaponInHand("knife");
		oponent.setWeaponInHand("sniper");
		System.out.println(player.getWeaponInHand());
		System.out.println(oponent.getWeaponInHand());
		
		player.printPlayer();
		oponent.printPlayer();
	}

}
