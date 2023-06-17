/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author Lenovo
 */
public class category {

    private String id_category;
    private String name;
    private String description;

    public category(String id_category) {
        this.id_category = id_category;
    }

    public category() {
    }

    public category(String id_category, String name, String description) {
        this.id_category = id_category;
        this.name = name;
        this.description = description;
    }

    public String getId_category() {
        return id_category;
    }

    public void setId_category(String id_category) {
        this.id_category = id_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "category{" + "id_category=" + id_category + ", name=" + name + ", description=" + description + '}';
    }

}
