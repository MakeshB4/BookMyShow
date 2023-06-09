package com.lld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "actor")
@Getter
@Setter
public class Actor extends BaseEntity {
     private String name;

     @ManyToMany(mappedBy = "actors")
     private List<Movie> movies;
}
