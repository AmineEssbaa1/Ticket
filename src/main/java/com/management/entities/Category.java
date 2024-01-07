package com.management.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_category;

    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Event> events;

    // Getters and setters
}
