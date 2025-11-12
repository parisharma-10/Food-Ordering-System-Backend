package com.example.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foodorderingsystem.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
