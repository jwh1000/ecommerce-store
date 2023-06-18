package com.estore.api.estoreapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class to represent a Product in our EStore.
 * Each product has a name, price, description, id, and quantity.
 * 
 * @author Rylan Arbour
 */
public class Product {
    /**
     * The name of the product.
     */
    @JsonProperty("name") private String name;
    /**
     * The price of the product.
     */
    @JsonProperty("price") private double price;
    /**
     * The description of the product.
     */
    @JsonProperty("description") private String description;
    /**
     * The id of the product.
     */
    @JsonProperty("id") private int id;
    /**
     * The amount of this product the owner has available to sell.
     */
    @JsonProperty("quantity") private int quantity;

    /**
     * Creates a product with the given name, price, and ID.
     * @param name The name of the product
     * @param price The price of the product
     * @param id The id of the product
     */
    public Product(@JsonProperty("name") String name, @JsonProperty("price") double price, @JsonProperty("id") int id) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.quantity = 0;
        this.description = "Lorem Ipsum";
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    //Mutators for all fields, so that an Owner will have an easier time editing any particular product.
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //String representation of product, for tests/debugging
    @Override
    public String toString() {
        return "Product ID " + this.id + ": " +this.name;
    }
}
