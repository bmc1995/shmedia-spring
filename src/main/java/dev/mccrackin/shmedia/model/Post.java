package dev.mccrackin.shmedia.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.time.Instant;

//import java.time.*;

@Entity
@Table
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Post(Integer id, String content) {
        this.id = id;
        this.content = content;
        this.createdAt = Instant.now();
        this.updatedAt = createdAt;
    }
    //    @PrePersist
//    protected void prePersist() {
//        if (this.createdAt == null) createdAt = Instant.now();
//        if (this.updatedAt == null) updatedAt = createdAt;
//    }
//
//    @PreUpdate
//    protected void preUpdate() {
//        updatedAt = Instant.now();
//    }
}
//Since the Date uses the VM time, wouldn't it be possible for an updatedAt to occur earlier than createdAt?