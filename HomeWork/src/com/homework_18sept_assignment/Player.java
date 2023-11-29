package com.homework_18sept_assignment;

class Country {
	private int id;
	private String name;

	Country() {

	}

	Country(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public String toString() {
		return "\nCountry id is: " + id + "\nCountry name is: " + name;
	}*/
}

public class Player {
	private int playerId;
	private String playerName;
	private Country c;

	Player() {

	}

	Player(int playerId, String playerName, Country c) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.c = c;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Country getC() {
		return c;
	}

	public void setC(Country c) {
		this.c = c;
	}

	/*public String toString() {
		return "\nPlayer id is: " + playerId + "\nPlayer name is: " + playerName + "\nCountry details: " + c;
	}*/

	public static void main(String[] args) {
		Player p1 = new Player();
		p1.setPlayerId(1);
		p1.setPlayerName("sachin");
		p1.setC(new Country());
		p1.getC().setId(101);
		p1.getC().setName("india");
		System.out.println("Player id is: "+p1.getPlayerId());
		System.out.println("Player name is: "+p1.getPlayerName());
		System.out.println("Country id is: "+p1.getC().getId());
		System.out.println("Country name is: "+p1.getC().getName());
	}

}
