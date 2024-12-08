package org.example.librarymanagementsystem.model;




public class Book {
    private int Id;
    private String Name;
    private String Author;
    private int Price;
    private int Stock;

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Book(int id, String name, String author, int price, int stock) {
        Id = id;
        Name = name;
        Author = author;
        Price = price;
        Stock = stock;
    }
}
