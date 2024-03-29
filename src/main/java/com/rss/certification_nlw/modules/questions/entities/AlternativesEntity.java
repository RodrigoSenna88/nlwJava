package com.rss.certification_nlw.modules.questions.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity(name = "alternatives")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlternativesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;

    private boolean isCorrect;

    private List<AlternativesEntity> alternatives;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
