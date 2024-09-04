/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul13;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author giaaa
 */
public class koneksi {
        private static Connection koneksi;

    public static Connection GetConnection() throws SQLException {
        if (koneksi == null) {
            DriverManager.registerDriver(new Driver());
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3310/belajarjava?serverTimezone=UTC", "root", "");
        }
        return koneksi;
    }
}
