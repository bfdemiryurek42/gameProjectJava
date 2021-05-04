package gameProject;

public class GameManager {
	
	public void buyGame(Game game, User user) {
		System.out.println(user.getUserName() + " adl� kullan�c� sistemdeki " + game.getGameName() + " oyununu " + game.getPrice() + " fiyat�yla sat�n alm��t�r.");
	}
	
	public void listAllGames() {
		System.out.println("B�t�n oyunlar listelendi.");
	}
	
	public void addGame(Game game) {
		System.out.println(game.getGameName() + " sisteme eklendi");
	}
	
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + " sistemden silindi");
	}
	
	public void updateGame(Game game) {
		System.out.println(game.getGameName() + " oyunu g�ncellendi");
	}
}
