package gameProject;

public class GameManager {
	
	public void buyGame(Game game, User user) {
		System.out.println(user.getUserName() + " adlý kullanýcý sistemdeki " + game.getGameName() + " oyununu " + game.getPrice() + " fiyatýyla satýn almýþtýr.");
	}
	
	public void listAllGames() {
		System.out.println("Bütün oyunlar listelendi.");
	}
	
	public void addGame(Game game) {
		System.out.println(game.getGameName() + " sisteme eklendi");
	}
	
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + " sistemden silindi");
	}
	
	public void updateGame(Game game) {
		System.out.println(game.getGameName() + " oyunu güncellendi");
	}
}
