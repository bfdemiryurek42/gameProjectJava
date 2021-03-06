package gameProject;

public class UserManager {
	
	private UserCheckingManagements userCheckingManagements;
	
	public UserManager(UserCheckingManagements userCheckingManagements) {
		this.userCheckingManagements = userCheckingManagements;
	}
	public void addUser(User user) {
		System.out.println(user.getUserName()+" kullanıcısı sisteme eklendi");
	}
	public void deleteUser(User user) {
		userCheckingManagements.checkUser(user);
		System.out.println(user.getUserName()+" kullanıcısı sistemden silindi");
	}
	public void updateUser(User user) {
		userCheckingManagements.checkUser(user);
		System.out.println(user.getUserName()+" kullanıcısının bilgileri güncellendi");
	}
}
