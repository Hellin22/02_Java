package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {
    private String code;
    private String board;
    private String name;
    private int price;
    private java.util.Date manufaturingDate;

    public Product() {
    }

    public Product(String code, String board, Date manufaturingDate) {
        this.code = code;
        this.board = board;
        this.name = name;
        this.price = price;
        this.manufaturingDate = manufaturingDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufaturingDate() {
        return manufaturingDate;
    }

    public void setManufaturingDate(Date manufaturingDate) {
        this.manufaturingDate = manufaturingDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", board='" + board + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufaturingDate=" + manufaturingDate +
                '}';
    }
}
