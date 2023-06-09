package com.lld.service;

import com.lld.entity.City;
import com.lld.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public City addCity(City city) {
        return adminRepository.addCity(city);
    }

    public void deleteCity(Long id) {
        adminRepository.deleteCity(id);
    }

    public List<City> getCities() {
       return adminRepository.getAllCity();
    }

    public City getCityById(Long id){
        return  adminRepository.getCityById(id);
    }

}
