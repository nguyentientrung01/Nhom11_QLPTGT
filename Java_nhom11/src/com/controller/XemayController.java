/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.model.AccountModel;
import com.model.XemayModel;
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
public class XemayController {
    // ---------------Phần này sử lý cho Account_ADMIN--------------------
    public static List<XemayModel> getAllXemay() {
        List<XemayModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM xemay";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                XemayModel xm = new XemayModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8),rs.getString(9));
                list.add(xm);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }
    
    public static List<XemayModel> getAllByinfo(String ndtimkiem,String timkiemtheo) {
        List<XemayModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM xemay where " + timkiemtheo + " like ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, "%" + ndtimkiem + "%");
            System.out.println(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                XemayModel xm = new XemayModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8),rs.getString(9));
                list.add(xm);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }
    
    public static List<XemayModel> getXeMayBysort(String bangchon) {
        List<XemayModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM xemay order by " + bangchon + " asc";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                XemayModel ac = new XemayModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8),rs.getString(9));
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
            String sql = "SELECT * FROM xemay where idxe = ?";
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
    
    public static XemayModel getxeById(String idxe) {
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM xemay where idxe = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, idxe);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return new XemayModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8),rs.getString(9));
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
    
    public static boolean xoaxeById(String idxe) {
        try {
            Connection con = new DBconnect().con;
            String sql = "delete xemay where idxe = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, idxe);
            int x = pre.executeUpdate();
            if(x>0) return true;
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean luuxemay(String idxe, String tenxe, String hangxe, String mau, int giaban, int namsx,int soluong,String dongco,String dungtich) {
        try {
            Connection con = new DBconnect().con;
            String sql = "insert into xemay values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, idxe);
            pre.setString(2, tenxe);
            pre.setString(3, hangxe);
            pre.setString(4, mau);
            pre.setInt(5, giaban);
            pre.setInt(6, namsx);
            pre.setInt(7, soluong);
            pre.setString(8, dongco);
            pre.setString(9,dungtich);
            // Nếu insert thành công sẽ trả về 1 số lớn hơn 0
            if (pre.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean updatexemay(String idxe, String tenxe, String hangxe, String mau, int giaban, int namsx,int soluong,String dongco,String dungtich) {
        try {
            Connection con = new DBconnect().con;
            String sql = "update xemay set ten = ?,hangxe = ?,mausac = ?,giaban = ?, namsx = ?, soluong = ?,dongco = ?, dungtichxl = ? where idxe = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(9, idxe);
            pre.setString(1, tenxe);
            pre.setString(2, hangxe);
            pre.setString(3, mau);
            pre.setInt(4, giaban);
            pre.setInt(5, namsx);
            pre.setInt(6, soluong);
            pre.setString(7, dongco);
            pre.setString(8,dungtich);
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
