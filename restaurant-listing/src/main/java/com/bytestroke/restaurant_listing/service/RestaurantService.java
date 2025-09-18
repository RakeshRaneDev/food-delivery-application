package com.bytestroke.restaurant_listing.service;

import com.bytestroke.restaurant_listing.dto.RestaurantDto;
import com.bytestroke.restaurant_listing.entity.Restaurant;
import com.bytestroke.restaurant_listing.mapper.RestaurantMapper;
import com.bytestroke.restaurant_listing.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {
    RestaurantRepository restaurantRepository;
    RestaurantService(RestaurantRepository restaurantRepository){
        this.restaurantRepository = restaurantRepository;
    }

    public List<RestaurantDto> fetchAllRestaurants() {
       List<Restaurant> restaurants =   restaurantRepository.findAll();
      return restaurants.stream()
                .map(restaurant -> RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(restaurant)).collect(Collectors.toList());
    }
}
