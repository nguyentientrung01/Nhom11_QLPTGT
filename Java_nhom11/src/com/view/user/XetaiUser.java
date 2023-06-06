/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.user;

import com.controller.XemayController;
import com.controller.XetaiController;
import com.model.XemayModel;
import com.model.XetaiModel;
import com.view.admin.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class XetaiUser extends javax.swing.JFrame {

    private String taikhoan;
    private String idxeclick;
    public XetaiUser(String username) {
        initComponents();
        khoitaobang();
        taikhoan = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        butthoat = new javax.swing.JButton();
        butdonhang = new javax.swing.JButton();
        buthome = new javax.swing.JButton();
        butxemay = new javax.swing.JButton();
        butoto = new javax.swing.JButton();
        butxetai = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panxemay = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ndtk = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        sxtheo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangchinh = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tktheo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        butthoat.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        butthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/Exit_40.png"))); // NOI18N
        butthoat.setText("Thoát");
        butthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butthoatActionPerformed(evt);
            }
        });

        butdonhang.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        butdonhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/hoa_don.png"))); // NOI18N
        butdonhang.setText("Đơn hàng");
        butdonhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butdonhangActionPerformed(evt);
            }
        });

        buthome.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buthome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/home_40.png"))); // NOI18N
        buthome.setText("Trang chủ");
        buthome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buthomeActionPerformed(evt);
            }
        });

        butxemay.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        butxemay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/xe_may_24.png"))); // NOI18N
        butxemay.setText("Xe máy");
        butxemay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butxemayMouseClicked(evt);
            }
        });
        butxemay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butxemayActionPerformed(evt);
            }
        });

        butoto.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        butoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/oto_24.png"))); // NOI18N
        butoto.setText("Ô tô");
        butoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butotoActionPerformed(evt);
            }
        });

        butxetai.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        butxetai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/xe_tai_24.png"))); // NOI18N
        butxetai.setText("Xe tải");
        butxetai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butxetaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butdonhang, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addComponent(buthome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(butthoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(butxemay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(butoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(butxetai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(buthome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(butxemay, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(butoto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(butxetai, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(butdonhang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(butthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        panxemay.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/xe_tai_24.png"))); // NOI18N
        jLabel2.setText("Cửa hàng xe tải");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/search_24.png"))); // NOI18N
        jButton3.setText("Tìm kiếm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        sxtheo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        sxtheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID xe  A-Z", "Tên xe A-Z", "Hãng xe A-Z", "Giá bán Thấp-Cao", "Năm s.xuất Cũ-Mới", "Trọng tải Thấp-Cao" }));
        sxtheo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sxtheoActionPerformed(evt);
            }
        });

        bangchinh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        bangchinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Hãng xe", "Phân khôi", "Màu sac", "Nam san xuat", "Giá bán", "So luong", "Tình trang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bangchinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bangchinhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bangchinh);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Tìm kiếm theo");

        tktheo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tktheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Xe", "Tên Xe", "Hãng Xe", "Năm s.xuất", "Màu sắc", "Nhiên liệu" }));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Sắp xếp theo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/shopcart.png"))); // NOI18N
        jButton2.setText("Đặt hàng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/lam_moi_24.png"))); // NOI18N
        jButton1.setText("Làm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panxemayLayout = new javax.swing.GroupLayout(panxemay);
        panxemay.setLayout(panxemayLayout);
        panxemayLayout.setHorizontalGroup(
            panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panxemayLayout.createSequentialGroup()
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panxemayLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tktheo, 0, 114, Short.MAX_VALUE))
                            .addComponent(ndtk))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sxtheo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );
        panxemayLayout.setVerticalGroup(
            panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panxemayLayout.createSequentialGroup()
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panxemayLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tktheo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(ndtk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sxtheo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(panxemay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panxemay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String noidung = ndtk.getText();
        String timkiemtheo = String.valueOf(tktheo.getSelectedItem());
        if(timkiemtheo.equals("ID Xe")) timkiemtheo = "idxe";
        if(timkiemtheo.equals("Tên Xe")) timkiemtheo = "ten";
        if(timkiemtheo.equals("Hãng Xe")) timkiemtheo = "hangxe";
        if(timkiemtheo.equals("Năm s.xuất")) timkiemtheo = "namsx";
        if(timkiemtheo.equals("Trọng tải")) timkiemtheo = "trongtai";
        if(timkiemtheo.equals("Màu sắc")) timkiemtheo = "mausac";
        if(timkiemtheo.equals("Nhiên liệu")) timkiemtheo = "nhienlieu";
        bangtimkiem(noidung,timkiemtheo);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void butxemayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butxemayMouseClicked
        // TODO add your handling code here:
//        panxemay.setVisible(true);
    }//GEN-LAST:event_butxemayMouseClicked

    private void butxemayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butxemayActionPerformed
        JFrame x = new XemayUser(taikhoan);
        dispose();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_butxemayActionPerformed

    private void butdonhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdonhangActionPerformed
        JFrame x = new DonhangUser(taikhoan);
        dispose();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_butdonhangActionPerformed

    private void butthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butthoatActionPerformed
        dispose();
    }//GEN-LAST:event_butthoatActionPerformed

    private void butotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butotoActionPerformed
        JFrame x = new XetaiUser(taikhoan);
        dispose();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_butotoActionPerformed

    private void butxetaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butxetaiActionPerformed

    }//GEN-LAST:event_butxetaiActionPerformed

    private void bangchinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bangchinhMouseClicked

    }//GEN-LAST:event_bangchinhMouseClicked

    private void buthomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buthomeActionPerformed
        JFrame x = new HomeUser(null);
        dispose();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_buthomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        khoitaobang();
        ndtk.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sxtheoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sxtheoActionPerformed
        String bangchon = String.valueOf(sxtheo.getSelectedItem());
        if(bangchon.contains("ID xe")) bangchon = "idxe";
        if(bangchon.contains("Tên xe")) bangchon = "ten";
        if(bangchon.contains("Hãng xe")) bangchon = "hangxe";
        if(bangchon.contains("Giá bán")) bangchon = "giaban";
        if(bangchon.contains("Trọng tải")) bangchon = "trongtai";
        if(bangchon.contains("Năm s.xuất")) bangchon = "namsx";
        bangsapxep(bangchon);
    }//GEN-LAST:event_sxtheoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(idxeclick==null) {
            JOptionPane.showMessageDialog(null, "Bạn cần chọn vào mặt hàng cần đặt");
            return;
        }
        XetaiModel xm = XetaiController.getxeById(idxeclick);
        if(xm.getSoluong()<=0) {
            JOptionPane.showMessageDialog(null, "Xe đã hết hàng mời quý khách lựa chọn mẫu khác");
        }
        JFrame x = new DathangUser(xm.getTen(),xm.getHangxe(),xm.getGiaban(),taikhoan);
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void khoitaobang() {
        String[] column = {"IdXe","Tên","Hãng xe","Màu sắc","Giá bán","Năm s.xuất","Số lượng","Trọng tải","Nhiên liệu"};
        DefaultTableModel model = new DefaultTableModel();
        List<XetaiModel> list = new ArrayList<>();
        list = XetaiController.getAllXetai();
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (XetaiModel t : list) {
            Object[] x = {t.getIdxe(),t.getTen(),t.getHangxe(),t.getMausac(),t.getGiaban(),t.getNamsx(),t.getSoluong(),t.getTrongtai(),t.getNhienlieu()};
            model.addRow(x);
        }
        bangchinh.setModel(model);
        bangchinh.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Kiểm tra xem có phải sự kiện nhấp chuột hay không
                if (e.getValueIsAdjusting()) {
                    // Lấy chỉ số hàng đã chọn
                    int selectedRow = bangchinh.getSelectedRow();
                    // In ra thông tin của hàng đã chọn
                    if (selectedRow != -1) {
                          idxeclick = (String) bangchinh.getValueAt(selectedRow, 0);
                    }
                    
                }
            }
        });
    }
    
    public void bangtimkiem(String ndtimkiem,String timkiemtheo) {
        String[] column = {"IdXe","Tên","Hãng xe","Màu sắc","Giá bán","Năm s.xuất","Số lượng","Trọng tải","Nhiên liệu"};
        DefaultTableModel model = new DefaultTableModel();
        List<XetaiModel> list = new ArrayList<>();
        list = XetaiController.getAllByinfo(ndtimkiem, timkiemtheo);
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (XetaiModel t : list) {
            Object[] x = {t.getIdxe(),t.getTen(),t.getHangxe(),t.getMausac(),t.getGiaban(),t.getNamsx(),t.getSoluong(),t.getTrongtai(),t.getNhienlieu()};
            model.addRow(x);
        }
        bangchinh.setModel(model);
    }
    
    
    public void bangsapxep(String bangchon) {
        String[] column = {"IdXe","Tên","Hãng xe","Màu sắc","Giá bán","Năm s.xuất","Số lượng","Trọng tải","Nhiên liệu"};
        DefaultTableModel model = new DefaultTableModel();
        List<XetaiModel> list = new ArrayList<>();
        list = XetaiController.getXetaiBysort(bangchon);
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (XetaiModel t : list) {
            Object[] x = {t.getIdxe(),t.getTen(),t.getHangxe(),t.getMausac(),t.getGiaban(),t.getNamsx(),t.getSoluong(),t.getTrongtai(),t.getNhienlieu()};
            model.addRow(x);
        }
        bangchinh.setModel(model);
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame x = new XetaiUser(null);
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangchinh;
    private javax.swing.JButton butdonhang;
    private javax.swing.JButton buthome;
    private javax.swing.JButton butoto;
    private javax.swing.JButton butthoat;
    private javax.swing.JButton butxemay;
    private javax.swing.JButton butxetai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ndtk;
    private javax.swing.JPanel panxemay;
    private javax.swing.JComboBox<String> sxtheo;
    private javax.swing.JComboBox<String> tktheo;
    // End of variables declaration//GEN-END:variables
}
