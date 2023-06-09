package com.lld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity(name = "user")
@Getter
@Setter
public class User extends BaseEntity {


    private String name;

    @OneToMany(mappedBy = "user")
    private List<Ticket> ticket;

}
