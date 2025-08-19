package com.flavorBox.backend.service;

import com.flavorBox.backend.model.MenuItem;
import com.flavorBox.backend.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flavorBox.backend.model.Category;


import java.util.List;

@Service
public class MenuItemServiceImpl implements MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @Override
    public MenuItem createMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    @Override
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    @Override
    public MenuItem getMenuItemById(Long id) {
        return menuItemRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMenuItem(Long id) {
        menuItemRepository.deleteById(id);
    }

    @Override
public List<MenuItem> getMenuItemsByCategory(Category category) {
    return menuItemRepository.findByCategory(category);
}


    @Override
public List<MenuItem> getMenuItemsByVeg(boolean veg) {
    return menuItemRepository.findByVeg(veg);
}

}
