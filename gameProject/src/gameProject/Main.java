package gameProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User();
		user1.setEmail("kullanici1@gmail.com");
		user1.setFirstName("Engin");
		user1.setId(1);
		user1.setIdentityNumber("123321");
		user1.setLastName("Demiroð");
		user1.setUserName("MCT,PMP,ITIL");
		
		User user2 = new User();
		user2.setEmail("bugra@bugra.com");
		user2.setFirstName("Bugra");
		user2.setId(2);
		user2.setIdentityNumber("123123");
		user2.setLastName("Demiryurek");
		user2.setUserName("kullanici1");
		
		Game halflife = new Game();
		halflife.setDiscount(10);
		halflife.setId(1);
		halflife.setPrice(50);
		halflife.setGameName("Halflife");
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(halflife);
		gameManager.buyGame(halflife, user1);
		
		UserManager userManager = new UserManager(new EdevletCheckManager());
		userManager.addUser(user1);
		userManager.updateUser(user2);
		
		
	}

}
