/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author DELL
 */
public class HoadonModel {
    private String mahoadon;
    private String ngaytao;
    private String tenxe;
    private String tenhangxe;
    private int soluong;
    private String nguoimua;
    private String diachi;
    private String sdt;
    private String taikhoanmua;
    private String trangthai;

    public HoadonModel() {
    }

    public HoadonModel(String mahoadon, String ngaytao, String tenxe, String tenhangxe, int soluong, String nguoimua, String diachi, String sdt, String taikhoanmua, String trangthai) {
        this.mahoadon = mahoadon;
        this.ngaytao = ngaytao;
        this.tenxe = tenxe;
        this.tenhangxe = tenhangxe;
        this.soluong = soluong;
        this.nguoimua = nguoimua;
        this.diachi = diachi;
        this.sdt = sdt;
        this.taikhoanmua = taikhoanmua;
        this.trangthai = trangthai;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }
    
    public String getTaikhoanmua() {
        return taikhoanmua;
    }

    public void setTaikhoanmua(String taikhoanmua) {
        this.taikhoanmua = taikhoanmua;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getNguoimua() {
        return nguoimua;
    }

    public void setNguoimua(String nguoimua) {
        this.nguoimua = nguoimua;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public String getTenhangxe() {
        return tenhangxe;
    }

    public void setTenhangxe(String tenhangxe) {
        this.tenhangxe = tenhangxe;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }


    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
