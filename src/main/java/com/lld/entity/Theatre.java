package com.lld.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "theatre")
@Getter
@Setter
public class Theatre extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "theatre")
    List<Auditorium> auditorium;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;
}
