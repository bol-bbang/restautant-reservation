package com.ojt.green.eatgo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList<Restaurant>();

    public RestaurantRepositoryImpl(){
        restaurants.add(new Restaurant(1004L,"Green", "an-yang"));
        restaurants.add(new Restaurant(1005L,"Shin-jun", "an-yang"));
    }

    @Override
    public List<Restaurant> findAll(){
        return restaurants;
    }

    @Override
    public Restaurant findById(Long id) {
        return restaurants.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
