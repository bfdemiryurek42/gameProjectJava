package gameProject;

public class CampaignManager {
	
	public void addCampaign(Campaign campaign, Game game) {
		System.out.println("Sistemdeki " + game.getGameName() + " adlý oyuna" + campaign.getCampaignName() + " kampanyasý eklendi!");
	}
	
	public void removeCampaign(Campaign campaign, Game game) {
		System.out.println("Sistemdeki " + game.getGameName() + " adlý oyunun" + campaign.getCampaignName() + " kampanyasý kaldýrýldý!");
	}
	
	public void updateCampaign(Campaign campaign, Game game) {
		System.out.println("Sistemdeki " + game.getGameName() + " adlý oyunun" + campaign.getCampaignName() + " kampanyasý güncellendi!");
	}
	
}
