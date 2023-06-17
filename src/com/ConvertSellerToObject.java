/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import exec.ExecuteSeller;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ConvertSellerToObject {
    public String[][] getSeller() {
        List<seller> mySlr = new ArrayList<seller>();
        exec.ExecuteSeller eSlr = new ExecuteSeller();
        mySlr = eSlr.getAllseller();
        String[][] dataSeller = new String[mySlr.size()][4];
        int i = 0;
        for (seller slr : mySlr) {
            dataSeller[i][0] = slr.getId_seller();
            dataSeller[i][1] = slr.getName();
            dataSeller[i][2] = slr.getPass();
            dataSeller[i][3] = slr.getGender();
            i++;
        }
        return dataSeller;
    }
    
}
