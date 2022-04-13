package com.springboot.pubgtracker.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "player")
public class Player {
	@Id
    private String id;
    private String name;
    private int kills;
    private int assists;
    private String timeSurvived;
	private Long userId;

	public Player() {
	}

	public Player(String id, String name, int kills, int assists, String timeSurvived, Long userId) {
		this.id = id;
		this.name = name;
		this.kills = kills;
		this.assists = assists;
		this.timeSurvived = timeSurvived;
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setId(String id) {
		this.id = id;
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
		return "Player{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", kills=" + kills +
				", assists=" + assists +
				", timeSurvived='" + timeSurvived + '\'' +
				'}';
	}
}
