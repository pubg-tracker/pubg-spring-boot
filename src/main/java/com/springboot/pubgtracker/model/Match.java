package com.springboot.pubgtracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Document(collection = "match")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match {
    @Id
    private String matchId;
    private String titleId;
    private String createdAt;
    private Long userId;
}
