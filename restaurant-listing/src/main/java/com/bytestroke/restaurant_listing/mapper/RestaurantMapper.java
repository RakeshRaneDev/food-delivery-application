package com.bytestroke.restaurant_listing.mapper;

import com.bytestroke.restaurant_listing.dto.RestaurantDto;
import com.bytestroke.restaurant_listing.entity.Restaurant;
import org.mapstruct.factory.Mappers;

public interface RestaurantMapper {
    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDtoToRestaurant(RestaurantDto restaurantDto);
    RestaurantDto mapRestaurantToRestaurantDto(Restaurant restaurant);
}
