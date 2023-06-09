package com.lld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "showtime")
@Getter
@Setter
public class Show extends BaseEntity {


    private LocalDateTime startTime;

    private LocalDateTime endTime;

    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeat;

    @ManyToOne
    @JoinColumn(name = "auditorium_id", referencedColumnName = "id")
    private Auditorium auditorium;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private Movie movie;

    @OneToMany(mappedBy = "show")
    private List<Ticket> ticket;


}
