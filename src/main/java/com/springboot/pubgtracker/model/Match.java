package com.springboot.pubgtracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Document(collection = "match")
public class Match {
    @Id
    private String matchId;
    private String titleId;
    private String createdAt;
    private Long userId;
	public String getMatchId() {
		return matchId;
	}
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	public String getTitleId() {
		return titleId;
	}
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Match(String matchId, String titleId, String createdAt, Long userId) {
		super();
		this.matchId = matchId;
		this.titleId = titleId;
		this.createdAt = createdAt;
		this.userId = userId;
	}
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", titleId=" + titleId + ", createdAt=" + createdAt + ", userId=" + userId
				+ "]";
	}
    
    
}
