/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.user;

import com.controller.HoadonController;
import com.model.HoadonModel;
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

public class DonhangUser extends javax.swing.JFrame {
    private String taikhoan;
    private String idxeclick;
    public DonhangUser(String username) {
        initComponents();
        this.taikhoan = username;
        khoitaobang();    
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
        butsearch = new javax.swing.JButton();
        butloc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangchinh = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tktheo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        butlammoi = new javax.swing.JButton();
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(433, 433, 433))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panxemay.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/dang_cho.png"))); // NOI18N
        jLabel2.setText("Danh sách đơn hàng");

        butsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/search_24.png"))); // NOI18N
        butsearch.setText("Tìm kiếm");
        butsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsearchActionPerformed(evt);
            }
        });

        butloc.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        butloc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Đã giao", "Chưa giao" }));
        butloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butlocActionPerformed(evt);
            }
        });

        bangchinh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        bangchinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày tạo", "Người nhận", "Địa chỉ", "Tên xe", "Tên hãng xe", "Số lượng", "Giá tiền", "Tổng tiền", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tktheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hóa đơn", "Ngày tạo", "Tên xe", "Hãng xe" }));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Lọc đơn hàng");

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

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setText("Hủy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        butlammoi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        butlammoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/lam_moi_24.png"))); // NOI18N
        butlammoi.setText("Làm mới");
        butlammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butlammoiActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butlammoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ndtk, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panxemayLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tktheo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addComponent(butsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butloc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))))
        );
        panxemayLayout.setVerticalGroup(
            panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panxemayLayout.createSequentialGroup()
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tktheo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butsearch)
                            .addComponent(ndtk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butloc))
                        .addGap(8, 8, 8))
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)))
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(butlammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void butsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsearchActionPerformed
        String noidungtimkiem = ndtk.getText();
        String timkiemtheo = String.valueOf(tktheo.getSelectedItem());
        if (timkiemtheo.equals("Mã hóa đơn")) {
            timkiemtheo = "mahoadon";
        }
        if (timkiemtheo.equals("Ngày tạo")) {
            timkiemtheo = "ngaytao";
        }
        if (timkiemtheo.equals("Tên xe")) {
            timkiemtheo = "tenxe";
        }
        if (timkiemtheo.equals("Hãng xe")) {
            timkiemtheo = "hangxe";
        }
        bangtimkiem(noidungtimkiem, timkiemtheo);
    }//GEN-LAST:event_butsearchActionPerformed

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

    }//GEN-LAST:event_butdonhangActionPerformed

    private void butthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butthoatActionPerformed
        dispose();
    }//GEN-LAST:event_butthoatActionPerformed

    private void butotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butotoActionPerformed
        JFrame x = new OtoUser(taikhoan);
        dispose();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_butotoActionPerformed

    private void butxetaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butxetaiActionPerformed
        JFrame x = new XetaiUser(taikhoan);
        dispose();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_butxetaiActionPerformed

    private void bangchinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bangchinhMouseClicked

    }//GEN-LAST:event_bangchinhMouseClicked

    private void buthomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buthomeActionPerformed
        JFrame x = new HomeUser(taikhoan);
        dispose();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_buthomeActionPerformed

    private void butlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butlammoiActionPerformed
        khoitaobang();
        ndtk.setText(null);
    }//GEN-LAST:event_butlammoiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(idxeclick == null) {
            JOptionPane.showMessageDialog(null, "Bạn cần chọn vào đơn hàng cần hủy");
        }
        else {
            if(HoadonController.checkdondagiao(idxeclick)) {
                JOptionPane.showMessageDialog(null, "Đơn hàng đã giao không thể hủy");
            }
            else {
                int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn hủy đơn hàng có mã: " + idxeclick);
                if(x==0) {
                    if(HoadonController.deleteByMahd(idxeclick)) {
                        JOptionPane.showMessageDialog(null, "Đã hủy thành công đơn hàng");
                        khoitaobang();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Đã có lỗi hệ thống, tạm thời chưa thể hủy");
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void butlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butlocActionPerformed
        String giatriloc = String.valueOf(butloc.getSelectedItem());
        System.out.println(giatriloc);
        if (giatriloc.equals("...") == false) {
            bangtimkiem(giatriloc, "trangthai");
        } else
            khoitaobang();
    }//GEN-LAST:event_butlocActionPerformed

    public void khoitaobang() {
        String[] column = {"Mã hóa đơn", "Ngày tạo", "Tên xe", "Hãng xe", "Số lượng", "Người nhận", "Địa chỉ", "SDT", "Trạng thái"};
        DefaultTableModel model = new DefaultTableModel();
        List<HoadonModel> list = new ArrayList<>();
        list = HoadonController.getHoadon(taikhoan);
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (HoadonModel t : list) {
            Object[] x = {t.getMahoadon(), t.getNgaytao(), t.getTenxe(), t.getTenhangxe(), t.getSoluong(), t.getNguoimua(), t.getDiachi(), t.getSdt(), t.getTrangthai()};
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
    
    
    
    public void bangtimkiem(String noidungtimkiem, String timkiemtheo) {
        String[] column = {"Mã hóa đơn", "Ngày tạo", "Tên xe", "Hãng xe", "Số lượng", "Người nhận", "Địa chỉ", "SDT", "Trạng thái"};
        DefaultTableModel model = new DefaultTableModel();
        List<HoadonModel> list = new ArrayList<>();
        list = HoadonController.getHoadonBytimkiem(noidungtimkiem, timkiemtheo,taikhoan);
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (HoadonModel t : list) {
            Object[] x = {t.getMahoadon(), t.getNgaytao(), t.getTenxe(), t.getTenhangxe(), t.getSoluong(), t.getNguoimua(), t.getDiachi(), t.getSdt(), t.getTrangthai()};
            model.addRow(x);
        }
        bangchinh.setModel(model);
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame x = new DonhangUser("user");
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangchinh;
    private javax.swing.JButton butdonhang;
    private javax.swing.JButton buthome;
    private javax.swing.JButton butlammoi;
    private javax.swing.JComboBox<String> butloc;
    private javax.swing.JButton butoto;
    private javax.swing.JButton butsearch;
    private javax.swing.JButton butthoat;
    private javax.swing.JButton butxemay;
    private javax.swing.JButton butxetai;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JComboBox<String> tktheo;
    // End of variables declaration//GEN-END:variables
}
