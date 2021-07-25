package com.ojt.green.eatgo.interfaces;

import com.ojt.green.eatgo.domain.MenuItem;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MenuItemRepositoryImpl implements MenuItemRepository {

    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    MenuItemRepositoryImpl(){
        menuItems.add(new MenuItem("Kimchi"));
    }

    @Override
    public List<MenuItem> findAllByRestaurantId(Long RestaurantId) {
        return menuItems;
    }
}
