package com.ojt.green.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RestaurantTests {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant(1004L,"Green", "an-yang");
        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Green"));
        assertThat(restaurant.getAddress(), is("an-yang"));
    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant(1004L,"Green", "경기도 안양");
        assertThat(restaurant.getInformation(), is("Green in 경기도 안양"));
    }
}