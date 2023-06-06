/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author DELL
 */
public class XemayModel extends CommonXe{
    private String dtxilanh;
    private String dongco;

    public XemayModel() {
    }

    public XemayModel(String idxe, String ten, String hangxe, String mausac, int giaban, int namsx, int soluong,String dongco,String dtxilanh) {
        super(idxe, ten, hangxe, mausac, giaban, namsx, soluong);
        this.dtxilanh = dtxilanh;
        this.dongco = dongco;
    }

    public String getDtxilanh() {
        return dtxilanh;
    }

    public void setDtxilanh(String dtxilanh) {
        this.dtxilanh = dtxilanh;
    }

    public String getDongco() {
        return dongco;
    }

    public void setDongco(String dongco) {
        this.dongco = dongco;
    }

    

    
    
}
