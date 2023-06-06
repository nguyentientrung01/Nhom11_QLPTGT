/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class DBconnect {
    public Connection con = null;
    public DBconnect() {        
        try {           
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLPTGT_3;trustServerCertificate=true;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, "Trung", "123456");
            System.out.println("kết nối  thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
