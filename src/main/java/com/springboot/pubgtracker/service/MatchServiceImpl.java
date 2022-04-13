package com.springboot.pubgtracker.service;

import com.springboot.pubgtracker.model.Match;
import com.springboot.pubgtracker.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {
    @Override
    public void createMatch(Match match) {

    }

    @Override
    public List<Match> getFavouriteMatch(Long userId) {
        return null;
    }

    @Override
    public void deleteMatch(String id) {

    }
}
