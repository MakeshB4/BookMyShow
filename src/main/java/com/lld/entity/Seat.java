package com.lld.entity;

import com.lld.enums.SeatStatus;
import com.lld.enums.SeatType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "seat")
@Getter
@Setter
public class Seat extends BaseEntity {

    private String seatNumber;

    private  Integer  seatRow;
    private Integer seatCol;

    @OneToMany(mappedBy = "seat")
    private List<ShowSeat> showSeatList;


    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;

    @ManyToOne
    @JoinColumn(name = "auditorium_id",referencedColumnName = "id")
    private Auditorium auditorium;


    @Enumerated(EnumType.STRING)
    private SeatType seatType;

}
