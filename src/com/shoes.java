/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author Lenovo
 */
public class shoes {

    private String id_shoes;
    private String name;
    private String cat;
    private String type;
    private int quantity;
    private int price;

    public shoes() {
    }

    public shoes(String id_shoes) {
        this.id_shoes = id_shoes;
    }

    public shoes(String id_shoes, String name, String cat, String type, int quantity, int price) {
        this.id_shoes = id_shoes;
        this.name = name;
        this.cat = cat;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId_shoes() {
        return id_shoes;
    }

    public void setId_shoes(String id_shoes) {
        this.id_shoes = id_shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "shoes{" + "id_shoes=" + id_shoes + ", name=" + name + ", cat=" + cat + ", type=" + type + ", quantity=" + quantity + ", price=" + price + '}';
    }

}
