/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.model.AccountModel;
import com.utils.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class AccountController {

    //---------- Phần này sử lý cho đăng ký, đăng nhập
    public static boolean checkaccount(String user, String pass) {
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM Account where username = ? and password = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, user);
            pre.setString(2, pass);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static String getRole(String user) {
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT role FROM Account where username = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, user);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean luuAccount(String user, String pass, String displayname, String role, String status) {
        try {
            Connection con = new DBconnect().con;
            String sql = "insert into Account values (?,?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, user);
            pre.setString(2, pass);
            pre.setString(3, displayname);
            pre.setString(4, role);
            pre.setString(5, status);
            // Nếu insert thành công sẽ trả về 1 số lớn hơn 0
            if (pre.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkDkUser(String user) {
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM Account where username = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, user);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    // ---------------Phần này sử lý cho Account_ADMIN--------------------
    public static List<AccountModel> getAccount() {
        List<AccountModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM Account";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                AccountModel ac = new AccountModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                list.add(ac);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }
    
    public static List<AccountModel> getAccountTheoyc(String nd,String tktheo) {
        List<AccountModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM Account where "+ tktheo+" like ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1,"%" + nd + "%");        
            System.out.println(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                AccountModel ac = new AccountModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                list.add(ac);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }
    
    public static List<AccountModel> getAccountBysort(String ndsort) {
        List<AccountModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM Account order by " + ndsort + " asc";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                AccountModel ac = new AccountModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                list.add(ac);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }

    public static boolean updateAccount(String user, String pass, String displayname, String role, String status) {
        try {
            Connection con = new DBconnect().con;
            String sql = "update Account set password = ? , displayname = ?, role = ?, status = ? where username = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, pass);
            pre.setString(2, displayname);
            pre.setString(3, role);
            pre.setString(4, status);
            pre.setString(5, user);
            int x = pre.executeUpdate();
            // Nếu update thành công sẽ trả về 1 số lớn hơn 0
            if (x > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean deleteAccount(String user) {
        try {
            Connection con = new DBconnect().con;
            String sql = "delete Account where username = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, user);
            int x = pre.executeUpdate();
            while (x > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
   

}
