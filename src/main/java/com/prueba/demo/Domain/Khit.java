package com.prueba.demo.Domain;

public class Khit {
    private int id;
    private String title;
    private String description;
    private int price;
    private String image;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
