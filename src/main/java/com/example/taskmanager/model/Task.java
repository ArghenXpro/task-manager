package com.example.taskmanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo; // Кому назначена задача

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy; // Кто создал задачу

    private LocalDateTime createdAt;

    private boolean completed;
}