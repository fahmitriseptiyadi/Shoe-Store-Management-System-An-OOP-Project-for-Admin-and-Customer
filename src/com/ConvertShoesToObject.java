/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import exec.ExecuteShoes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ConvertShoesToObject {

    public String[][] getShoes() {
        List<shoes> myShs = new ArrayList<shoes>();
        ExecuteShoes eShs = new ExecuteShoes();
        myShs = eShs.getAllshoes();
        String[][] dataShoes = new String[myShs.size()][6];
        int i = 0;
        for (shoes shs : myShs) {
            dataShoes[i][0] = shs.getId_shoes();
            dataShoes[i][1] = shs.getName();
            dataShoes[i][2] = shs.getCat();
            dataShoes[i][3] = shs.getType();
            dataShoes[i][4] = "" + shs.getQuantity();
            dataShoes[i][5] = "" + shs.getPrice();

            i++;
        }
        return dataShoes;
    }
}
