package com.springboot.pubgtracker.repository;

import com.springboot.pubgtracker.model.Match;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends MongoRepository<Match,String> {
}
