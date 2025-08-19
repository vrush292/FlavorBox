package com.flavorBox.backend.repository;

import com.flavorBox.backend.model.MenuItem;
import com.flavorBox.backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

    // Find all menu items by category
    List<MenuItem> findByCategory(Category category);

    // Find by veg/non-veg
    List<MenuItem> findByVeg(boolean veg);
}
