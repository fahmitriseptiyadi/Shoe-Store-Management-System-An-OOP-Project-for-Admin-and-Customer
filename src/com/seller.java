/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author Lenovo
 */
public class seller {

    private String id_seller;
    private String name;
    private String pass;
    private String gender;

    public seller() {
    }

    public seller(String id_seller) {
        this.id_seller = id_seller;
    }

    public seller(String id_seller, String name, String pass, String gender) {
        this.id_seller = id_seller;
        this.name = name;
        this.pass = pass;
        this.gender = gender;
    }

    public String getId_seller() {
        return id_seller;
    }

    public void setId_seller(String id_seller) {
        this.id_seller = id_seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "seller{" + "id_seller=" + id_seller + ", name=" + name + ", pass=" + pass + ", gender=" + gender + '}';
    }

}
