package com.ojt.green.eatgo.interfaces;

import com.ojt.green.eatgo.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
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
}
