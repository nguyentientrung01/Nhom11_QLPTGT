/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.model.AccountModel;
import com.model.OtoModel;
import com.model.XemayModel;
import com.model.XetaiModel;
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
public class XetaiController {
    // ---------------Phần này sử lý cho Account_ADMIN--------------------
    public static List<XetaiModel> getAllXetai() {
        List<XetaiModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM xetai";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                XetaiModel xm = new XetaiModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9));
                list.add(xm);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }
    
    public static List<XetaiModel> getAllByinfo(String ndtimkiem,String timkiemtheo) {
        List<XetaiModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM xetai where " + timkiemtheo + " like ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, "%" + ndtimkiem + "%");
            System.out.println(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                XetaiModel xm = new XetaiModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9));
                list.add(xm);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }
    
    public static XetaiModel getxeById(String idxe) {
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM xetai where idxe = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, idxe);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return new XetaiModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9));
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
    
    public static List<XetaiModel> getXetaiBysort(String bangchon) {
        List<XetaiModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM xetai order by " + bangchon + " asc";
            PreparedStatement pre = con.prepareStatement(sql);
            System.out.println(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                XetaiModel ac = new XetaiModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9));
                list.add(ac);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }
    
    public static boolean checkxeById(String idxe) {
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM xetai where idxe = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, idxe);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean xoaxeById(String idxe) {
        try {
            Connection con = new DBconnect().con;
            String sql = "delete xetai where idxe = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, idxe);
            int x = pre.executeUpdate();
            if(x>0) return true;
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean luuxetai(String idxe, String tenxe, String hangxe, String mau, int giaban, int namsx,int soluong,int trongtai,String nhienlieu) {
        try {
            Connection con = new DBconnect().con;
            String sql = "insert into xetai values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, idxe);
            pre.setString(2, tenxe);
            pre.setString(3, hangxe);
            pre.setString(4, mau);
            pre.setInt(5, giaban);
            pre.setInt(6, namsx);
            pre.setInt(7, soluong);
            pre.setInt(8, trongtai);
            pre.setString(9,nhienlieu);
            // Nếu insert thành công sẽ trả về 1 số lớn hơn 0
            if (pre.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean updatexetai(String idxe, String tenxe, String hangxe, String mau, int giaban, int namsx,int soluong,int trongtai,String nhienlieu) {
        try {
            Connection con = new DBconnect().con;
            String sql = "update xetai set ten = ?,hangxe = ?,mausac = ?,giaban = ?, namsx = ?, soluong = ?,trongtai = ?, nhienlieu = ? where idxe = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(9, idxe);
            pre.setString(1, tenxe);
            pre.setString(2, hangxe);
            pre.setString(3, mau);
            pre.setInt(4, giaban);
            pre.setInt(5, namsx);
            pre.setInt(6, soluong);
            pre.setInt(7, trongtai);
            pre.setString(8,nhienlieu);
            // Nếu insert thành công sẽ trả về 1 số lớn hơn 0
            if (pre.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
