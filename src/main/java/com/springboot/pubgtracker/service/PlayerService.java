package com.springboot.pubgtracker.service;

import java.util.List;

import com.springboot.pubgtracker.model.Player;

public interface PlayerService {

	void createPlayer(Player player);

	void deletePlayer(String playerId);

	List<Player> getPlayer(Long playerId);

	List<Player> getPlayers();


}
