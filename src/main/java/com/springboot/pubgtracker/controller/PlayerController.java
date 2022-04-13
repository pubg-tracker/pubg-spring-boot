package com.springboot.pubgtracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.pubgtracker.model.Match;
import com.springboot.pubgtracker.model.Player;
import com.springboot.pubgtracker.service.MatchService;
import com.springboot.pubgtracker.service.PlayerService;

@RestController
public class PlayerController {
	@Autowired
    PlayerService playerService;


    @PostMapping("/addPlayer")
    void createPlayer(@RequestBody Player player){
        playerService.createPlayer(player);
    }

    @DeleteMapping("/deletePlayer/{id}")
    void deletePlayer(@PathVariable("id") String playerId){
    	playerService.deletePlayer(playerId);
    }

    @GetMapping("/getPlayer/{id}")
    List<Player> getPlayer(@PathVariable("id") Long playerId){
        return playerService.getPlayer(playerId);
    }
    @GetMapping("/getPlayers")
    List<Player> getPlayers(){
        return playerService.getPlayers();
    }
}
