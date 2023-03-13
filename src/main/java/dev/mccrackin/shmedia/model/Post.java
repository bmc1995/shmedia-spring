package dev.mccrackin.shmedia.model;

import jakarta.persistence.*;

import java.time.*;

@Entity
@Table
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;

    private Instant createdAt;
    private Instant updatedAt;

    @PrePersist
    protected void prePersist() {
        if (this.createdAt == null) createdAt = Instant.now();
        if (this.updatedAt == null) updatedAt = createdAt;
    }

    @PreUpdate
    protected void preUpdate() {
        updatedAt = Instant.now();
    }
    // STOPSHIP: 3/13/23  
}