package com.wzl.entity;

public class Book {
    private int id ;
    private String bookname;
    private String author;
    private String description;
    private String image;
    private int clicktime;

    public Book(int id, String bookname, String author, String description, String image, int clicktime) {
        this.id = id;
        this.bookname = bookname;
        this.author = author;
        this.description = description;
        this.image = image;
        this.clicktime = clicktime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getClicktime() {
        return clicktime;
    }

    public void setClicktime(int clicktime) {
        this.clicktime = clicktime;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", clicktime=" + clicktime +
                '}';
    }
}
