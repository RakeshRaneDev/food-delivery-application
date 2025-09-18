package com.bytestroke.restaurant_listing.repository;

import com.bytestroke.restaurant_listing.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
