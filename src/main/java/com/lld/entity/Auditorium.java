package com.lld.entity;

import com.lld.enums.Features;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "auditorium")
@Getter
@Setter
public class Auditorium extends BaseEntity {

    private String name;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Features> features;

    @OneToMany(mappedBy = "auditorium")
    private List<Show>  show;

    @ManyToOne
    @JoinColumn(name = "theatre_id" ,referencedColumnName = "id")
    private Theatre theatre;


    @OneToMany(mappedBy = "auditorium")
    private List<Seat> seat;




}
