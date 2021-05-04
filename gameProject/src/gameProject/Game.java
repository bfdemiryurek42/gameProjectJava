package gameProject;

import java.sql.Date;

public class Game {
	private int id;
	private Campaign campaign;
	private String gameName;
	private Date releaseDate;
	private double price;
	private double discount;
	
	public Game() {
		
	}
	
	public Game(int id, Campaign campaign, String gameName, Date releaseDate, double price, double discount) {
		super();
		this.id = id;
		this.campaign = campaign;
		this.gameName = gameName;
		this.releaseDate = releaseDate;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Campaign getCampain() {
		return campaign;
	}

	public void setCampain(Campaign campaign) {
		this.campaign = campaign;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getPrice() {
		return price - (price * discount / 100);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
