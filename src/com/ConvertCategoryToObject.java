/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import exec.ExecuteCategory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ConvertCategoryToObject {
    public String[][] getCategory() {
        List<category> myCtr = new ArrayList<category>();
        exec.ExecuteCategory eCtr = new ExecuteCategory();
        myCtr = eCtr.getAllcategory();
        String[][] dataCategory = new String[myCtr.size()][3];
        int i = 0;
        for (category ctr : myCtr) {
            dataCategory[i][0] = ctr.getId_category();
            dataCategory[i][1] = ctr.getName();
            dataCategory[i][2] = ctr.getDescription();
            i++;
        }
        return dataCategory;
    }
    
}
