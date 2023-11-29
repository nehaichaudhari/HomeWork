package com.collection_list_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Consider List of T20 Players. 
//Player (playerid,Name,Country,team)
//e.g.   (1,”MSDhoni”,”India”,”Chennai Super Kings”)
//Then find out which team has maximum Australian players. 
public class Question11 {
	public static void main(String[] args) {
		ArrayList<Player> al = new ArrayList<>();
		al.add(new Player(1, "MSDhoni", "India", "Chennai Super Kings"));
		al.add(new Player(2, "David Warner", "Australia", "Delhi Capitals"));
		al.add(new Player(3, "Steven Smith", "Australia", "Rajasthan Royals"));
		al.add(new Player(4, "Virat Kohali", "India", "RCB"));
		al.add(new Player(5, "Rohit Sharma", "India", "MI"));
		al.add(new Player(6, "Mitchell Marsh", "Australia", "Delhi Capitals"));
		
		HashMap<String, Integer> map = new HashMap<>();
		
		Iterator<Player> itr = al.iterator();
		while(itr.hasNext()) {
			Player p = itr.next();
			if(p.getCountry().equals("Australia")) {
				if(map.containsKey(p.getTeam())) {
					map.put(p.getTeam(),map.get(p.getTeam())+1);
				}else
				{
					map.put(p.getTeam(),1);
				}
			}
		}
		int max=0;
		String teamName=null;
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue()>max) {
				max = m.getValue();
				teamName = m.getKey();
			}
		}
		System.out.println("Team name is: "+teamName);
	}
}
class Player{
	private int id;
	private String name;
	private String country;
	private String team;
	
	public Player() {
	}

	public Player(int id, String name, String country, String team) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.team = team;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", country=" + country + ", team=" + team + "]";
	}
}
