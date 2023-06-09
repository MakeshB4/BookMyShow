package com.lld.entity;

import com.lld.enums.Genere;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "movie")
@Getter
@Setter
public class Movie extends BaseEntity {

    private String movieName;


    @Enumerated(EnumType.STRING)
    private Genere genere;

    @OneToMany(mappedBy = "movie")
    private List<Show> show;

    @ManyToMany
    @JoinTable(name="movie_actor",
    joinColumns =  @JoinColumn(name = "actor_id" ,referencedColumnName = "id") ,
    inverseJoinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id")
    )
    private List<Actor> actors;

    @ManyToOne
    @JoinColumn(name = "ticket_id" ,referencedColumnName = "id")
    private Ticket ticket;





}
