package com.management.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    // Getters and setters
}
