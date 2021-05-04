package gameProject;

public class EdevletCheckManager implements UserCheckingManagements {
	public void checkUser(User user) {
		System.out.println(user.getUserName() + " kullanýcýsý sistemde mevcut");
	}
}
