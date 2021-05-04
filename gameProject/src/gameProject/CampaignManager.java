package gameProject;

public class CampaignManager {
	
	public void addCampaign(Campaign campaign, Game game) {
		System.out.println("Sistemdeki " + game.getGameName() + " adl� oyuna" + campaign.getCampaignName() + " kampanyas� eklendi!");
	}
	
	public void removeCampaign(Campaign campaign, Game game) {
		System.out.println("Sistemdeki " + game.getGameName() + " adl� oyunun" + campaign.getCampaignName() + " kampanyas� kald�r�ld�!");
	}
	
	public void updateCampaign(Campaign campaign, Game game) {
		System.out.println("Sistemdeki " + game.getGameName() + " adl� oyunun" + campaign.getCampaignName() + " kampanyas� g�ncellendi!");
	}
	
}
