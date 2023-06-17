/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec;

import com.shoes;
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
public class ExecuteShoes {

    public List<shoes> getAllshoes() {
        String query = "select * from shoes";
        ConnectionManager conMan = new ConnectionManager();
        List<shoes> lsShoes = new ArrayList<shoes>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                shoes shs = new shoes();
                shs.setId_shoes(rs.getString("id_shoes"));
                shs.setName(rs.getString("name"));
                shs.setCat(rs.getString("category"));
                shs.setType(rs.getString("type"));
                shs.setQuantity(rs.getInt("quantity"));
                shs.setPrice(rs.getInt("price"));
                lsShoes.add(shs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteShoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsShoes;
    }

    public int insertData(shoes shs) {
        int hasil = 0;
        String query = "insert into shoes(id_shoes, name, category, type, quantity, price)values"
                + "('" + shs.getId_shoes() + "','" + shs.getName() + "', '" + shs.getCat() + "','" + shs.getType() + "','" + shs.getQuantity() + "', " + shs.getPrice() + ")";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteShoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }

    public int deleteData(String delID_shoes) {
        String query = "Delete from shoes where id_shoes='" + delID_shoes + "'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteShoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }

    public int editData(shoes shs) {
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update shoes set name='" + shs.getName() + "', category='" + shs.getCat() + "',type='" + shs.getType() + "', quantity= " + shs.getQuantity() + ",price= " + shs.getPrice()
                + " where id_shoes='" + shs.getId_shoes() + "'";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteShoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }

}
