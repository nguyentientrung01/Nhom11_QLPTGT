/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.admin;

import com.controller.HoadonController;
import com.model.HoadonModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Don_hang extends javax.swing.JFrame {

    private String idxeclick = "";
    private int rowclick = -1;

    public Don_hang() {
        initComponents();
        khoitaobang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        butthoat = new javax.swing.JButton();
        butdonhang = new javax.swing.JButton();
        buthome = new javax.swing.JButton();
        butkhoxe = new javax.swing.JButton();
        buttaikhoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panhoadon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ndtk = new javax.swing.JTextField();
        buttk = new javax.swing.JButton();
        butsx = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangchinh = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tktheo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        butcapnhat = new javax.swing.JButton();
        butxoa = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lammoi = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        butloc = new javax.swing.JComboBox<>();
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

        butkhoxe.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        butkhoxe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/kho_xe.png"))); // NOI18N
        butkhoxe.setText("Kho Xe");
        butkhoxe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butkhoxeMouseClicked(evt);
            }
        });
        butkhoxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butkhoxeActionPerformed(evt);
            }
        });

        buttaikhoa.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buttaikhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/tai_khoan.png"))); // NOI18N
        buttaikhoa.setText("Tài Khoản");
        buttaikhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttaikhoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(butdonhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buthome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(butkhoxe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttaikhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
            .addComponent(butthoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(buthome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(butdonhang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(buttaikhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(butkhoxe, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(butthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(272, 272, 272))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        panhoadon.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Quản lý đơn hàng");

        buttk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/search_24.png"))); // NOI18N
        buttk.setText("Tìm kiếm");
        buttk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttkActionPerformed(evt);
            }
        });

        butsx.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        butsx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hóa đơn (A-Z)", "Ngày tạo (Mới-Cũ)" }));
        butsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsxActionPerformed(evt);
            }
        });

        bangchinh.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        bangchinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày tạo", "Tên xe", "Hãng xe", "Số lượng", "Người nhận", "Địa chỉ", "SĐT", "Tài khoản", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bangchinh);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Tìm kiếm theo");

        tktheo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tktheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hóa đơn", "Ngày tạo", "Tên xe", "Hãng xe", "Tài khoản", "Địa chỉ", "SĐT" }));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Sắp xếp theo");

        butcapnhat.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        butcapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/cap_nhat_24.png"))); // NOI18N
        butcapnhat.setText("Cập nhật");
        butcapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcapnhatActionPerformed(evt);
            }
        });

        butxoa.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        butxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/xoa.png"))); // NOI18N
        butxoa.setText("Xóa");
        butxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butxoaActionPerformed(evt);
            }
        });

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

        lammoi.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        lammoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/lam_moi_24.png"))); // NOI18N
        lammoi.setText("Làm mới");
        lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lammoiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Lọc đơn hàng");

        butloc.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        butloc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Đã giao", "Chưa giao" }));
        butloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butlocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panhoadonLayout = new javax.swing.GroupLayout(panhoadon);
        panhoadon.setLayout(panhoadonLayout);
        panhoadonLayout.setHorizontalGroup(
            panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panhoadonLayout.createSequentialGroup()
                .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panhoadonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panhoadonLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panhoadonLayout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(butxoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butcapnhat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panhoadonLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(panhoadonLayout.createSequentialGroup()
                        .addComponent(ndtk, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttk, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(butloc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butsx, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(panhoadonLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tktheo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        panhoadonLayout.setVerticalGroup(
            panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panhoadonLayout.createSequentialGroup()
                .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panhoadonLayout.createSequentialGroup()
                        .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panhoadonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tktheo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panhoadonLayout.createSequentialGroup()
                        .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ndtk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(butsx)
                            .addComponent(butloc))
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(panhoadonLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(butcapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(butxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 394, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panhoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butkhoxeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butkhoxeMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_butkhoxeMouseClicked

    private void buttkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttkActionPerformed
        idxeclick = "";
        rowclick = -1;
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
        if (timkiemtheo.equals("Tài khoản")) {
            timkiemtheo = "taikhoan";
        }
        if (timkiemtheo.equals("Địa chỉ")) {
            timkiemtheo = "diachi";
        }
        if (timkiemtheo.equals("SĐT")) {
            timkiemtheo = "sdt";
        }
        bangtimkiem(noidungtimkiem, timkiemtheo);
    }//GEN-LAST:event_buttkActionPerformed

    private void butkhoxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butkhoxeActionPerformed
        dispose();
        JFrame x = new Kho_xe();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_butkhoxeActionPerformed

    private void butdonhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdonhangActionPerformed
        dispose();
        JFrame x = new Don_hang();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_butdonhangActionPerformed

    private void butthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butthoatActionPerformed
        dispose();
    }//GEN-LAST:event_butthoatActionPerformed

    private void butxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butxoaActionPerformed
        if (idxeclick.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn cần chọn vào dòng cần xóa");
            return;
        }
        String hdxoa = idxeclick;
        int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắc xóa hóa đơn này?");
        if (x == 0) {
            if (HoadonController.deleteByMahd(hdxoa)) {
                JOptionPane.showMessageDialog(null, "Đã xóa hóa đơn có mã: " + hdxoa);
                lammoi();
            } else {
                JOptionPane.showMessageDialog(null, "Hệ thống đã xảy ra lỗi khi xóa");
            }
        }
    }//GEN-LAST:event_butxoaActionPerformed

    private void buttaikhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttaikhoaActionPerformed
        dispose();
        JFrame x = new Account_admin();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_buttaikhoaActionPerformed

    private void buthomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buthomeActionPerformed
        dispose();
        JFrame x = new Home_admin();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_buthomeActionPerformed

    private void butcapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcapnhatActionPerformed
        if (idxeclick.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn cần chọn vào dòng cần cập nhật");
            return;
        }
        String mahoadon = idxeclick;
        String ngaytao = (String) bangchinh.getValueAt(rowclick, 1);
        String tenxe = (String) bangchinh.getValueAt(rowclick, 2);
        String hangxe = (String) bangchinh.getValueAt(rowclick, 3);
        String nguoimua = (String) bangchinh.getValueAt(rowclick, 5);
        String diachi = (String) bangchinh.getValueAt(rowclick, 6);
        String sdt = (String) bangchinh.getValueAt(rowclick, 7);
        String taikhoan = (String) bangchinh.getValueAt(rowclick, 8);
        String trangthai = (String) bangchinh.getValueAt(rowclick, 9);
        int soluong;
        System.out.println(ngaytao);
        try {
            soluong = Integer.parseInt(bangchinh.getValueAt(rowclick, 4).toString());
            System.out.println(soluong);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Số lượng không được âm và không được chứa ký tự đặc biệt");
            return;
        }
        if (ngaytao.equals("") || tenxe.equals("") || hangxe.equals("") || nguoimua.equals("") || diachi.equals("") || sdt.equals("") || taikhoan.equals("") || trangthai.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn cần điền đầy đủ thông tin");
        }
        int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn cập nhật lại hóa đơn này?");
        if (x == 0) {
            if (HoadonController.updateByMahd(mahoadon, ngaytao, tenxe, hangxe, soluong, nguoimua, diachi, sdt, taikhoan, trangthai)) {
                JOptionPane.showMessageDialog(null, "Đã cập nhật hóa đơn có mã: " + mahoadon);
                lammoi();
            } else {
                JOptionPane.showMessageDialog(null, "Hệ thống đã xảy ra lỗi khi cập nhật");
            }
        }
//        String trangthai = String.valueOf(tthai.getSelectedItem());
//        if (mahoadon.equals("")) {
//            JOptionPane.showMessageDialog(null, "Bạn cần nhập mã hóa đơn để cập nhật");
//        }
//        else {
//            if (HoadonController.checkMahd(mahoadon) == false) {
//                JOptionPane.showMessageDialog(null, "Không tồn tại mã hóa đơn bạn định cập nhật");
//            } else {
//                int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn cập nhật lại hóa đơn này?");
//                if (x == 0) {
//                    if (HoadonController.updateByMahd(mahoadon,trangthai)) {
//                        JOptionPane.showMessageDialog(null, "Đã cập nhật hóa đơn có mã: " + mahoadon);
//                        lammoi();
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Hệ thống đã xảy ra lỗi khi cập nhật");
//                    }
//                }
//            }
//        }
    }//GEN-LAST:event_butcapnhatActionPerformed

    private void lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lammoiActionPerformed
        lammoi();
        idxeclick = "";
        rowclick = -1;
    }//GEN-LAST:event_lammoiActionPerformed

    private void butlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butlocActionPerformed
        idxeclick = "";
        rowclick = -1;
        String giatriloc = String.valueOf(butloc.getSelectedItem());
        System.out.println(giatriloc);
        if (giatriloc.equals("...") == false) {
            bangtimkiem(giatriloc, "trangthai");
        } else
            khoitaobang();
    }//GEN-LAST:event_butlocActionPerformed

    private void butsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsxActionPerformed
        idxeclick = "";
        rowclick = -1;
        String sxtheo = String.valueOf(butsx.getSelectedItem());
        if (sxtheo.contains("Mã hóa đơn")) {
            bangsapxep("mahoadon");
        } else if (sxtheo.contains("Ngày tạo")) {
            bangsapxep("ngaytao");
        }
    }//GEN-LAST:event_butsxActionPerformed

    // ------------------------Phần sử lý nội dung logic----------------------------------
    public void khoitaobang() {
        String[] column = {"Mã hóa đơn", "Ngày tạo", "Tên xe", "Hãng xe", "Số lượng", "Người nhận", "Địa chỉ", "SDT", "Tài khoản", "Trạng thái"};
        DefaultTableModel model = new DefaultTableModel();
        List<HoadonModel> list = new ArrayList<>();
        list = HoadonController.getHoadon();
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (HoadonModel t : list) {
            Object[] x = {t.getMahoadon(), t.getNgaytao(), t.getTenxe(), t.getTenhangxe(), t.getSoluong(), t.getNguoimua(), t.getDiachi(), t.getSdt(), t.getTaikhoanmua(), t.getTrangthai()};
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
//                        System.out.println(idxeclick);
                        rowclick = selectedRow;
                    }

                }
            }
        });
    }

    public void bangtimkiem(String noidungtimkiem, String timkiemtheo) {
        String[] column = {"Mã hóa đơn", "Ngày tạo", "Tên xe", "Hãng xe", "Số lượng", "Người nhận", "Địa chỉ", "SDT", "Tài khoản", "Trạng thái"};
        DefaultTableModel model = new DefaultTableModel();
        List<HoadonModel> list = new ArrayList<>();
        list = HoadonController.getHoadonBytimkiem(noidungtimkiem, timkiemtheo);
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (HoadonModel t : list) {
            Object[] x = {t.getMahoadon(), t.getNgaytao(), t.getTenxe(), t.getTenhangxe(), t.getSoluong(), t.getNguoimua(), t.getDiachi(), t.getSdt(), t.getTaikhoanmua(), t.getTrangthai()};
            model.addRow(x);
        }
        bangchinh.setModel(model);
    }

    public void bangsapxep(String cansxep) {
        String[] column = {"Mã hóa đơn", "Ngày tạo", "Tên xe", "Hãng xe", "Số lượng", "Người nhận", "Địa chỉ", "SDT", "Tài khoản", "Trạng thái"};
        DefaultTableModel model = new DefaultTableModel();
        List<HoadonModel> list = new ArrayList<>();
        list = HoadonController.getHoadonBysapxep(cansxep);
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (HoadonModel t : list) {
            Object[] x = {t.getMahoadon(), t.getNgaytao(), t.getTenxe(), t.getTenhangxe(), t.getSoluong(), t.getNguoimua(), t.getDiachi(), t.getSdt(), t.getTaikhoanmua(), t.getTrangthai()};
            model.addRow(x);
        }
        bangchinh.setModel(model);
    }

    public void lammoi() {
        ndtk.setText("");
        rowclick = -1;
        idxeclick = "";
        khoitaobang();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame x = new Don_hang();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangchinh;
    private javax.swing.JButton butcapnhat;
    private javax.swing.JButton butdonhang;
    private javax.swing.JButton buthome;
    private javax.swing.JButton butkhoxe;
    private javax.swing.JComboBox<String> butloc;
    private javax.swing.JComboBox<String> butsx;
    private javax.swing.JButton buttaikhoa;
    private javax.swing.JButton butthoat;
    private javax.swing.JButton buttk;
    private javax.swing.JButton butxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lammoi;
    private javax.swing.JTextField ndtk;
    private javax.swing.JPanel panhoadon;
    private javax.swing.JComboBox<String> tktheo;
    // End of variables declaration//GEN-END:variables
}
