package gameProject;

public class Campaign {
	private int id;
	private int gameId;
	private String campaignName;
	private String campaignDescription;
	
	public Campaign() {
		
	}

	public Campaign(int id, int gameId, String campaignName, String campaignDescription) {
		this.id = id;
		this.gameId = gameId;
		this.campaignName = campaignName;
		this.campaignDescription = campaignDescription;
	}

	public int getId() {
		return id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignDescription() {
		return campaignDescription;
	}

	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}
	
	
	
	
}
