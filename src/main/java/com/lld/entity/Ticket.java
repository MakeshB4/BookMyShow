package com.lld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "ticket")
@Getter
@Setter
public class Ticket extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "movie_id",referencedColumnName = "id")
    private  Movie movie;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "ticket")
    private List<ShowSeat> showSeat;

    @ManyToOne
    @JoinColumn(name = "show_id",referencedColumnName = "id")
    private Show show;


}
