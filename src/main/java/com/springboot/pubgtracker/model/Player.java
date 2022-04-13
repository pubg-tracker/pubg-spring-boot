package com.springboot.pubgtracker.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "player")
public class Player {
	@Id
    private String playerId;
    private String name;
    private int kills;
    private int assists;
    private String timeSurvived;
	public Player(String playerId, String name, int kills, int assists, String timeSurvived) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.kills = kills;
		this.assists = assists;
		this.timeSurvived = timeSurvived;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public String getTimeSurvived() {
		return timeSurvived;
	}
	public void setTimeSurvived(String timeSurvived) {
		this.timeSurvived = timeSurvived;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", kills=" + kills + ", assists=" + assists
				+ ", timeSurvived=" + timeSurvived + "]";
	}
    
    
   
}
