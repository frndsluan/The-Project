/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1886519
 */
public class ConnectionFactory {
    
    private final String url;
    private final String usr;
    private final String pwd;

    public ConnectionFactory() {
        this.url = "jdbc:mysql://localhost:3306/sakila";
        this.usr = "root";
        this.pwd = null;
    }
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, usr, pwd);
    }
    
    
    
}
