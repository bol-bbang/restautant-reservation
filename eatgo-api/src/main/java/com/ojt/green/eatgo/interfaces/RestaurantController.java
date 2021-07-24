package com.ojt.green.eatgo.interfaces;

import com.ojt.green.eatgo.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = new ArrayList<Restaurant>();
        restaurants.add(new Restaurant(1004L,"Green", "an-yang"));

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){
        List<Restaurant> restaurants = new ArrayList<Restaurant>();
        restaurants.add(new Restaurant(1004L,"Green", "an-yang"));
        restaurants.add(new Restaurant(1005L,"Shin-jun", "an-yang"));

        return restaurants.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
