package com.flavorBox.backend.service;
import com.flavorBox.backend.model.Category;
import com.flavorBox.backend.model.MenuItem;
import java.util.List;

public interface MenuItemService {
    MenuItem createMenuItem(MenuItem menuItem);
    List<MenuItem> getAllMenuItems();
    MenuItem getMenuItemById(Long id);
    void deleteMenuItem(Long id);
    List<MenuItem> getMenuItemsByCategory(Category category);
    List<MenuItem> getMenuItemsByVeg(boolean veg);
}
