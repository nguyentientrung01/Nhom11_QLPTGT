/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.model.AccountModel;
import com.model.HoadonModel;
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
public class HoadonController {

    //-------------------Phần sử lý cho admin---------------------------
    public static List<HoadonModel> getHoadon() {
        List<HoadonModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM hoadon";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                HoadonModel hd = new HoadonModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(hd);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }

    public static List<HoadonModel> getHoadonBytimkiem(String noidungtimkiem, String timkiemtheo) {
        List<HoadonModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM hoadon where " + timkiemtheo + " like ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, "%" + noidungtimkiem + "%");
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                HoadonModel hd = new HoadonModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(hd);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }

    public static List<HoadonModel> getHoadonBysapxep(String cansxep) {
        List<HoadonModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM hoadon order by " + cansxep + " asc";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                HoadonModel hd = new HoadonModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(hd);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }

    public static boolean luudonhang(String mahoadon, String ngaytao, String tenxe, String hangxe, int soluong, String nguoimua, String diachi, String sdt, String taikhoan, String trangthai) {
        try {
            Connection con = new DBconnect().con;
            String sql = "insert into hoadon values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, mahoadon);
            pre.setString(2, ngaytao);
            pre.setString(3, tenxe);
            pre.setString(4, hangxe);
            pre.setInt(5, soluong);
            pre.setString(6, nguoimua);
            pre.setString(7, diachi);
            pre.setString(8, sdt);
            pre.setString(9, taikhoan);
            pre.setString(10, trangthai);
            // Nếu insert thành công sẽ trả về 1 số lớn hơn 0
            if (pre.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkMahd(String mahd) {
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM hoadon where mahoadon = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, mahd);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return true;
            }
            return false;

        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkdondagiao(String mahd) {
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM hoadon where mahoadon = ? and trangthai = N'Đã giao'";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, mahd);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return true;
            }
            return false;

        } catch (Exception e) {
            return false;
        }
    }

    public static boolean deleteByMahd(String mahd) {
        try {
            Connection con = new DBconnect().con;
            String sql = "Delete hoadon where mahoadon = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, mahd);
            int x = pre.executeUpdate();
            if (x > 0) {
                return true;
            }

            return false;

        } catch (Exception e) {
            return false;
        }
    }

    public static boolean updateByMahd(String mahoadon, String ngaytao, String tenxe, String hangxe, int soluong, String nguoimua, String diachi, String sdt, String taikhoan, String trangthai) {
        try {
            Connection con = new DBconnect().con;
            String sql = "UPDATE hoadon SET ngaytao = ?, tenxe = ?, hangxe = ?, soluong = ?, nguoimua = ?, diachi = ?, sdt = ?, taikhoan = ?, trangthai = ? WHERE mahoadon = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, ngaytao);
            pre.setString(2, tenxe);
            pre.setString(3, hangxe);
            pre.setInt(4, soluong);
            pre.setString(5, nguoimua);
            pre.setString(6, diachi);
            pre.setString(7, sdt);
            pre.setString(8, taikhoan);
            pre.setString(9, trangthai);
            pre.setString(10, mahoadon);
            System.out.println(pre.toString());
            int x = pre.executeUpdate();
            if (x > 0) {
                return true;
            }
            return false;

        } catch (Exception e) {
            return false;
        }
    }

//    public static void main(String[] args) {
//        System.out.println(updateByMahd("hd1863", "2023-05-30", "xemay2", "honda", 2, "Tran Hoan", "Nam Dinh", "034359454", "user1", "Chua giao"));
//    }

    // ---- Phần hóa đơn dành cho user
    public static List<HoadonModel> getHoadon(String taikhoan) {
        List<HoadonModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM hoadon where taikhoan = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, taikhoan);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                HoadonModel hd = new HoadonModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(hd);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }

    public static List<HoadonModel> getHoadonBytimkiem(String noidungtimkiem, String timkiemtheo, String taikhoan) {
        List<HoadonModel> list = new ArrayList<>();
        try {
            Connection con = new DBconnect().con;
            String sql = "SELECT * FROM hoadon where taikhoan = ? and " + timkiemtheo + " like ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, taikhoan);
            pre.setString(2, "%" + noidungtimkiem + "%");
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                HoadonModel hd = new HoadonModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(hd);
            }

        } catch (Exception e) {
            return list;
        }
        return list;
    }

}
