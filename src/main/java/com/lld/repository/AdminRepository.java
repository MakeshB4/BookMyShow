package com.lld.repository;

import com.lld.entity.City;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminRepository {
    CityRepository cityRepository;


    public AdminRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }


    public City addCity(City city) {
        return cityRepository.save(city);
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    public List<City> getAllCity() {
        return cityRepository.findAll();
    }

    public City getCityById(Long id) {
        return cityRepository.findById(id).orElseThrow();
    }
}
