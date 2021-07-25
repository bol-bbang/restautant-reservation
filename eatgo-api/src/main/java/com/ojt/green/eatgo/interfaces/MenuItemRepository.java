package com.ojt.green.eatgo.interfaces;

import com.ojt.green.eatgo.domain.MenuItem;

import java.util.List;

public interface MenuItemRepository {
    List<MenuItem> findAllByRestaurantId(Long RestaurantId);
}
