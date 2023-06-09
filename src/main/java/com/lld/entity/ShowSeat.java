package com.lld.entity;

import com.lld.enums.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "show_seat")
@Getter
@Setter
public class ShowSeat extends BaseEntity {

    private int price;

    @ManyToOne
    @JoinColumn(name = "seat_id", referencedColumnName = "id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "show_id", referencedColumnName = "id")
    private Show show;

    @ManyToOne
    @JoinColumn(name="ticket_id",referencedColumnName = "id")
    private Ticket ticket;


    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;

}
