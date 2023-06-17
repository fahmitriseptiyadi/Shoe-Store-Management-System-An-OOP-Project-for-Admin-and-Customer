/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */
public class ConnectionManager {

    private Connection con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/myshoesstoreoop"; // myDB --> nama database kita
    private String username = "root"; // user name DMBS
    private String password = ""; // pswd DMBS

    public Connection logOn() {
        try {
            //Load JDBC Driver
            Class.forName(driver).newInstance();
            //Buat object Connection
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public void logOff() {
        try {
            //Tutup Koneksi
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
