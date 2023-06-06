/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author DELL
 */
public class XetaiModel extends CommonXe{
    private int trongtai;
    private String nhienlieu;

    public XetaiModel() {
    }

    public XetaiModel(String idxe, String ten, String hangxe, String mausac, int giaban, int namsx, int soluong,int trongtai, String nhienlieu) {
        super(idxe, ten, hangxe, mausac, giaban, namsx, soluong);
        this.trongtai = trongtai;
        this.nhienlieu = nhienlieu;
    }

    public int getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(int trongtai) {
        this.trongtai = trongtai;
    }

    public String getNhienlieu() {
        return nhienlieu;
    }

    public void setNhienlieu(String nhienlieu) {
        this.nhienlieu = nhienlieu;
    }

    
    
}
