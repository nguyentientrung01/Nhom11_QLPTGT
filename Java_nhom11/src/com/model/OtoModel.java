/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author DELL
 */
public class OtoModel extends CommonXe{
    private int socho;
    private String nhienlieu;

    public OtoModel() {
    }

    public OtoModel(String idxe, String ten, String hangxe, String mausac, int giaban, int namsx, int soluong,int socho, String nhienlieu) {
        super(idxe, ten, hangxe, mausac, giaban, namsx, soluong);
        this.socho = socho;
        this.nhienlieu = nhienlieu;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    public String getNhienlieu() {
        return nhienlieu;
    }

    public void setNhienlieu(String nhienlieu) {
        this.nhienlieu = nhienlieu;
    }

    
    
    
}
