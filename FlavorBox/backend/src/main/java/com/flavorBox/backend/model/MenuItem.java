package com.flavorBox.backend.model;

public class MenuItem {
    private Long id;
    private String name;
    private double price;
    private Category category;
    private String description;
    private String imageUrl;
    private int quantity;
    private boolean isVeg;  // true = veg, false = non-veg

    public MenuItem(Long id, String name, double price, Category category,
                    String description, String imageUrl, int quantity, boolean isVeg) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.imageUrl = imageUrl;
        this.quantity = quantity;
        this.isVeg = isVeg;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public boolean isVeg() { return isVeg; }
    public void setVeg(boolean veg) { isVeg = veg; }
}
