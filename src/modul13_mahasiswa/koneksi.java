/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul13_mahasiswa;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;

/**
 *
 * @author giaaa
 */
public class koneksi {

     private static Connection koneksi;

    public static Connection GetConnection() throws SQLException {
        if (koneksi == null) {
            DriverManager.registerDriver(new Driver());
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3310/pmr_visual?serverTimezone=UTC", "root", "");
        }
        return koneksi;
    }

}
