package com.bytestroke.restaurant_listing.controller;

import com.bytestroke.restaurant_listing.dto.RestaurantDto;
import com.bytestroke.restaurant_listing.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public ResponseEntity<List<RestaurantDto>> fetchAllRestaurants(){
      List<RestaurantDto> restaurants = restaurantService.fetchAllRestaurants();
      return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }

}
