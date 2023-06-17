/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec;

import com.category;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class ExecuteCategory {

    public List<category> getAllcategory() {
        String query = "select * from category";
        ConnectionManager conMan = new ConnectionManager();
        List<category> lsCategory = new ArrayList<category>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                category ctr = new category();
                ctr.setId_category(rs.getString("id_category"));
                ctr.setName(rs.getString("name"));
                ctr.setDescription(rs.getString("description"));
                lsCategory.add(ctr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsCategory;
    }

    public int insertData(category ctr) {
        int hasil = 0;
        String query = "insert into category(id_category, name, description)values"
                + "('" + ctr.getId_category() + "','" + ctr.getName() + "','" + ctr.getDescription() + "')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }

    public int deleteData(String delID_category) {
        String query = "Delete from category where id_category='" + delID_category + "'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }

    public int editData(category ctr) {
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update category set name='" + ctr.getName() + "', description='" + ctr.getDescription()+ "' where id_category ='" + ctr.getId_category() + "'";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteShoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
}
