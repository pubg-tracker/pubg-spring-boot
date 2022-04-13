package com.springboot.pubgtracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springboot.pubgtracker.model.Match;
import com.springboot.pubgtracker.model.Player;
import com.springboot.pubgtracker.service.MatchService;
import com.springboot.pubgtracker.service.PlayerService;

@CrossOrigin
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
