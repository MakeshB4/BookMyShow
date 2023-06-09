package com.lld.controller.admin;


import com.lld.entity.City;
import com.lld.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/admin/cities")
@RestController
public class CityController {

    AdminService adminService;

    public CityController(AdminService adminService) {
        this.adminService = adminService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public City addCity(@RequestBody City city) {
        return adminService.addCity(city);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(value = "/{id}")
    public void deleteCity(@PathVariable Long id) {
        log.info("Id {}", id);
        adminService.deleteCity(id);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<City> getCities() {
        return adminService.getCities();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public City getCityById(@PathVariable Long id) {
        return adminService.getCityById(id);
    }

}
