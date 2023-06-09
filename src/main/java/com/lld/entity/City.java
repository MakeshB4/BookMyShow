package com.lld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name="city")
@Getter
@Setter
public class City extends BaseEntity {

    private String cityName;

   @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
   private List<Theatre> theatres;

}
