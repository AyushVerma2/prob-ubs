package com.hackerrank.github.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
//    @OneToOne(fetch = FetchType.LAZY,
//            cascade =  CascadeType.ALL,
//            mappedBy = "event")
   // private Actor actor;

//    @OneToOne(fetch = FetchType.LAZY,
//            cascade =  CascadeType.ALL,
//            mappedBy = "event")
   // private Repo repo;
    private Timestamp createdAt;

    public Event() {
    }

    public Event(Long id, String type, Actor actor, Repo repo, Timestamp createdAt) {
        this.id = id;
        this.type = type;
        //this.actor = actor;
        //this.repo = repo;
        this.createdAt = createdAt;
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "type", nullable = false)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    @Column(name = "actor", nullable = false)
//    public Actor getActor() {
//        return actor;
//    }

//    public void setActor(Actor actor) {
//        this.actor = actor;
//    }
//    @Column(name = "repo", nullable = false)
//    public Repo getRepo() {
//        return repo;
//    }
//
//    public void setRepo(Repo repo) {
//        this.repo = repo;
//    }

    @Column(name = "createdAt", nullable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
