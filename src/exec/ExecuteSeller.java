/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec;

import com.seller;
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
public class ExecuteSeller {

    public List<seller> getAllseller() {
        String query = "select * from seller";
        ConnectionManager conMan = new ConnectionManager();
        List<seller> lsSeller = new ArrayList<seller>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                seller slr = new seller();
                slr.setId_seller(rs.getString("id_seller"));
                slr.setName(rs.getString("name"));
                slr.setPass(rs.getString("pass"));
                slr.setGender(rs.getString("gender"));
                lsSeller.add(slr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsSeller;
    }

    public int insertData(seller slr) {
        int hasil = 0;
        String query = "insert into seller(id_seller, name, pass, gender)values"
                + "('" + slr.getId_seller() + "','" + slr.getName() + "','" + slr.getPass() + "','" + slr.getGender() + "')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }

    public int deleteData(String delID_seller) {
        String query = "Delete from seller where id_seller='" + delID_seller + "'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }

    public int editData(seller slr) {
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update seller set name='" + slr.getName() + "', pass='" + slr.getPass()+ "', gender= '" + slr.getGender()
                + "' where id_seller='" + slr.getId_seller() + "'";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteShoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
}
