package com.springboot.pubgtracker.controller;

import com.springboot.pubgtracker.model.Match;
import com.springboot.pubgtracker.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatchController {

    @Autowired
    MatchService matchService;

    @PostMapping("/addFav")
    void createMatch(@RequestBody Match match){
        matchService.createMatch(match);
    }

    @DeleteMapping("/deleteFav/{id}")
    void deleteMatch(@PathVariable("id") String matchId){
        matchService.deleteMatch(matchId);
    }

    @GetMapping("/favMatch/{id}")
    List<Match> getAllMatch(@PathVariable("id") Long userId){
        return matchService.getFavouriteMatch(userId);
    }
}
