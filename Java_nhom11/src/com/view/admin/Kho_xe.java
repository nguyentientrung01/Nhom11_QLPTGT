/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.admin;

import com.controller.HoadonController;
import com.controller.XemayController;
import com.model.HoadonModel;
import com.model.XemayModel;
import com.view.user.XetaiUser;
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
public class Kho_xe extends javax.swing.JFrame {

    private String idxeclick = "";
    private int rowclick = -1;
    
    public Kho_xe() {
        initComponents();
        khoitaobang();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        buthoadon = new javax.swing.JButton();
        buthome = new javax.swing.JButton();
        butkhoxe = new javax.swing.JButton();
        buttaikhoa = new javax.swing.JButton();
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
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ten = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hang = new javax.swing.JComboBox<>();
        mau = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nam = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        sl = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        gia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dt = new javax.swing.JTextField();
        pkhoxe = new javax.swing.JPanel();
        pankhoxe = new javax.swing.JPanel();
        butxemay = new javax.swing.JButton();
        butoto = new javax.swing.JButton();
        butxetai = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/Exit_40.png"))); // NOI18N
        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        buthoadon.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buthoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/hoa_don.png"))); // NOI18N
        buthoadon.setText("Đơn hàng");
        buthoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buthoadonActionPerformed(evt);
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
            .addComponent(buthoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buthome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(butkhoxe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttaikhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buthome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(buthoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(buttaikhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(butkhoxe, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
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
                .addGap(389, 389, 389))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panxemay.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/xe_may_24.png"))); // NOI18N
        jLabel2.setText("Quản lý xe máy");

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/search_24.png"))); // NOI18N
        jButton3.setText("Tìm kiếm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        sxtheo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        sxtheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID xe  A-Z", "Tên xe A-Z", "Hãng xe A-Z", "Giá bán Thấp-Cao", "Năm s.xuất Cũ-Mới" }));
        sxtheo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sxtheoActionPerformed(evt);
            }
        });

        bangchinh.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        bangchinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdXe", "Tên", "Hãng xe", "Màu sac", "Giá bán", "Năm s.xuất", "Số lượng", "Động cơ", "Dung tích x.l"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bangchinh);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Tìm kiếm theo");

        tktheo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tktheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Xe", "Tên Xe", "Hãng Xe", "Năm s.xuất", "Màu sắc", "Động Cơ", "Dung tích xi lanh" }));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Sắp xếp theo");

        jButton5.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/them.png"))); // NOI18N
        jButton5.setText("Thêm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/cap_nhat_24.png"))); // NOI18N
        jButton6.setText("Cập nhật");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/xoa.png"))); // NOI18N
        jButton7.setText("Xóa");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
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

        jButton12.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/lam_moi_24.png"))); // NOI18N
        jButton12.setText("Làm mới");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Tên");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Hãng xe");

        hang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda", "Yamaha" }));
        hang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hangActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Màu sắc");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Năm s.xuất");

        nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020" }));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Số lượng");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Động cơ");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Giá bán");

        gia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("IdXe");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Dung tích x.l");

        javax.swing.GroupLayout panxemayLayout = new javax.swing.GroupLayout(panxemay);
        panxemay.setLayout(panxemayLayout);
        panxemayLayout.setHorizontalGroup(
            panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panxemayLayout.createSequentialGroup()
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panxemayLayout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6))
                            .addGroup(panxemayLayout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panxemayLayout.createSequentialGroup()
                                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panxemayLayout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(52, 52, 52))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panxemayLayout.createSequentialGroup()
                                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ten, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hang, javax.swing.GroupLayout.Alignment.LEADING, 0, 137, Short.MAX_VALUE)
                                    .addComponent(mau, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(id)))
                            .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panxemayLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dt))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panxemayLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panxemayLayout.createSequentialGroup()
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panxemayLayout.createSequentialGroup()
                                .addComponent(ndtk, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panxemayLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tktheo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(275, 275, 275)))
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sxtheo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panxemayLayout.setVerticalGroup(
            panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panxemayLayout.createSequentialGroup()
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panxemayLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tktheo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ndtk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sxtheo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(panxemayLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hang, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panxemayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout pankhoxeLayout = new javax.swing.GroupLayout(pankhoxe);
        pankhoxe.setLayout(pankhoxeLayout);
        pankhoxeLayout.setHorizontalGroup(
            pankhoxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );
        pankhoxeLayout.setVerticalGroup(
            pankhoxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        butxemay.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
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

        butoto.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        butoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/oto_24.png"))); // NOI18N
        butoto.setText("Ô tô");
        butoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butotoActionPerformed(evt);
            }
        });

        butxetai.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        butxetai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/view/icon/xe_tai_24.png"))); // NOI18N
        butxetai.setText("Xe tải");
        butxetai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butxetaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pkhoxeLayout = new javax.swing.GroupLayout(pkhoxe);
        pkhoxe.setLayout(pkhoxeLayout);
        pkhoxeLayout.setHorizontalGroup(
            pkhoxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pkhoxeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pkhoxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butxemay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butxetai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pankhoxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pkhoxeLayout.setVerticalGroup(
            pkhoxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pkhoxeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butxemay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pkhoxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pkhoxeLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(pankhoxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pkhoxeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(butoto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butxetai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pkhoxe, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(panxemay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(panxemay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(pkhoxe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butkhoxeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butkhoxeMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_butkhoxeMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        idxeclick = "";
        String noidung = ndtk.getText();
        String timkiemtheo = String.valueOf(tktheo.getSelectedItem());
        if(timkiemtheo.equals("ID Xe")) timkiemtheo = "idxe";
        if(timkiemtheo.equals("Tên Xe")) timkiemtheo = "ten";
        if(timkiemtheo.equals("Hãng Xe")) timkiemtheo = "hangxe";
        if(timkiemtheo.equals("Năm s.xuất")) timkiemtheo = "namsx";
        if(timkiemtheo.equals("Động Cơ")) timkiemtheo = "dongco";
        if(timkiemtheo.equals("Màu sắc")) timkiemtheo = "mausac";
        if(timkiemtheo.equals("Dung tích xi lanh")) timkiemtheo = "dungtichxl";
        bangtimkiem(noidung,timkiemtheo);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void butxemayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butxemayMouseClicked
        // TODO add your handling code here:
//        panxemay.setVisible(true);
    }//GEN-LAST:event_butxemayMouseClicked

    private void butxemayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butxemayActionPerformed
        
    }//GEN-LAST:event_butxemayActionPerformed

    private void butkhoxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butkhoxeActionPerformed

    }//GEN-LAST:event_butkhoxeActionPerformed

    private void buthoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buthoadonActionPerformed
        dispose();
        JFrame x = new Don_hang();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_buthoadonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void butotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butotoActionPerformed
        dispose();
        JFrame x = new Oto_admin();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_butotoActionPerformed

    private void butxetaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butxetaiActionPerformed
        dispose();
        JFrame x = new Xe_tai_admin();
        x.setLocationRelativeTo(null);
        x.setVisible(true);   
    }//GEN-LAST:event_butxetaiActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(idxeclick.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn cần chọn dòng muốn xóa");
            return;
        }
        if(XemayController.checkxeById(idxeclick)==false) {
            JOptionPane.showMessageDialog(null, "ID xe cần xóa không tồn tại");
            return;
        }
        int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn xóa xe có id: " + idxeclick);
        if(x==0) {
            if(XemayController.xoaxeById(idxeclick)) {
                JOptionPane.showMessageDialog(null, "Đã xóa thành công");
                khoitaobang();
            }
            else {
                JOptionPane.showMessageDialog(null,  "Hệ thống đã xảy ra lỗi");
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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

    private void hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hangActionPerformed

    private void giaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        String idxe = (String)bangchinh.getValueAt(rowclick, 0);
        String tenxe = (String)bangchinh.getValueAt(rowclick, 1);
        String hangxe = (String)bangchinh.getValueAt(rowclick, 2);
        String mauxe = (String)bangchinh.getValueAt(rowclick, 3);
        String namsxphu = "" +  bangchinh.getValueAt(rowclick, 5);
        String dungtich = (String)bangchinh.getValueAt(rowclick, 8);
        String dongco = "" + bangchinh.getValueAt(rowclick, 7);
        
        
        String slphu = "" + bangchinh.getValueAt(rowclick, 6);
        String giabanphu = "" + bangchinh.getValueAt(rowclick, 4);
        int soluong; 
        int giaban;
        int namsx;
        
        
        if(idxe.equals("") || tenxe.equals("") || mauxe.equals("") || giabanphu.equals("") || slphu.equals("") || dongco.equals("") || dungtich.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn cần điền đầy đủ thông tin các cột");
            return;
        }
        try {
            soluong = Integer.parseInt(slphu);
            giaban = Integer.parseInt(giabanphu);
            namsx = Integer.parseInt(namsxphu);
            if(soluong < 0 || giaban < 0) {
                JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đúng định dạng");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đúng định dạng");
            return;
        }
        
        if(XemayController.checkxeById(idxe)) {
            JOptionPane.showMessageDialog(null, "ID xe đã tồn tại, bạn cần nhập id xe khác");
        }
        else {
            if(XemayController.luuxemay(idxe, tenxe, hangxe, mauxe, giaban, namsx, soluong, dongco, dungtich)) {
                JOptionPane.showMessageDialog(null, "Đã thêm thành công");
                khoitaobang();
            }
            else {
                JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi trong hệ thống");
            }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(rowclick == -1) {
            JOptionPane.showMessageDialog(null, "Bạn cần click vào dòng cần cập nhật");
            return;
        }
        String idxe = (String)bangchinh.getValueAt(rowclick, 0);
        String tenxe = (String)bangchinh.getValueAt(rowclick, 1);
        String hangxe = (String)bangchinh.getValueAt(rowclick, 2);
        String mauxe = (String)bangchinh.getValueAt(rowclick, 3);
        String namsxphu = "" +  bangchinh.getValueAt(rowclick, 5);
        String dongco = (String)bangchinh.getValueAt(rowclick, 7);
        String dungtich = (String)bangchinh.getValueAt(rowclick, 8);
        String slphu = "" + bangchinh.getValueAt(rowclick, 6);
        String giabanphu = "" + bangchinh.getValueAt(rowclick, 4);
        int soluong; 
        int giaban;
        int namsx;
        if(XemayController.checkxeById(idxe)==false) {
            JOptionPane.showMessageDialog(null, "ID xe cần cập nhật không tồn tại");
            return;
        }
        if(idxe.equals("") || tenxe.equals("") || mauxe.equals("") || giabanphu.equals("") || slphu.equals("") || dongco.equals("") || dungtich.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn cần điền đầy đủ thông tin các cột");
            return;
        }
        try {
            soluong = Integer.parseInt(slphu);
            giaban = Integer.parseInt(giabanphu);
            namsx = Integer.parseInt(namsxphu);
            if(soluong < 0 || giaban < 0) {
                JOptionPane.showMessageDialog(null, "Giá bán hoặc số lượng hoặc năm sx không được để giá trị âm");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Giá bán hoặc số lượng hoặc năm sx chưa đúng định dạng");
            return;
        }
        int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn cập nhật lại xe có id: " + idxe);
        if(x==0) {
            if(XemayController.updatexemay(idxe, tenxe, hangxe, mauxe, giaban, namsx, soluong, dongco, dungtich)) {
                JOptionPane.showMessageDialog(null, "Đã cập nhật thành công");
                khoitaobang();
            }
            else {
                JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi hệ thống");
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        khoitaobang();
        id.setText(null);
        ten.setText(null);
        sl.setText(null);
        mau.setText(null);
        dt.setText(null);
        dc.setText(null);
        ndtk.setText(null);
        idxeclick = "";
        rowclick = -1;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void sxtheoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sxtheoActionPerformed
        idxeclick = "";
        String bangchon = String.valueOf(sxtheo.getSelectedItem());
        if(bangchon.contains("ID xe")) bangchon = "idxe";
        if(bangchon.contains("Tên xe")) bangchon = "ten";
        if(bangchon.contains("Hãng xe")) bangchon = "hangxe";
        if(bangchon.contains("Giá bán")) bangchon = "giaban";
        if(bangchon.contains("Năm s.xuất")) bangchon = "namsx";
        bangsapxep(bangchon);
        idxeclick = "";
        rowclick = -1;
    }//GEN-LAST:event_sxtheoActionPerformed

    // --Phần sử lý dữ liệu 
     
    
    public void khoitaobang() {
        String[] column = {"IdXe","Tên","Hãng xe","Màu sắc","Giá bán","Năm s.xuất","Số lượng","Động cơ","Dung tích x.l"};
        DefaultTableModel model = new DefaultTableModel();
        List<XemayModel> list = new ArrayList<>();
        list = XemayController.getAllXemay();
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (XemayModel t : list) {
            Object[] x = {t.getIdxe(),t.getTen(),t.getHangxe(),t.getMausac(),t.getGiaban(),t.getNamsx(),t.getSoluong(),t.getDongco(),t.getDtxilanh()};
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
                          rowclick = selectedRow;
                    }
                    
                }
            }
        });
    }
    
    
    public void bangtimkiem(String ndtimkiem,String timkiemtheo) {
        String[] column = {"IdXe","Tên","Hãng xe","Màu sắc","Giá bán","Năm s.xuất","Số lượng","Động cơ","Dung tích x.l"};
        DefaultTableModel model = new DefaultTableModel();
        List<XemayModel> list = new ArrayList<>();
        list = XemayController.getAllByinfo(ndtimkiem, timkiemtheo);
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (XemayModel t : list) {
            Object[] x = {t.getIdxe(),t.getTen(),t.getHangxe(),t.getMausac(),t.getGiaban(),t.getNamsx(),t.getSoluong(),t.getDongco(),t.getDtxilanh()};
            model.addRow(x);
        }
        bangchinh.setModel(model);
    }
    
    
    public void bangsapxep(String bangchon) {
        String[] column = {"IdXe","Tên","Hãng xe","Màu sắc","Giá bán","Năm s.xuất","Số lượng","Động cơ","Dung tích x.l"};
        DefaultTableModel model = new DefaultTableModel();
        List<XemayModel> list = new ArrayList<>();
        list = XemayController.getXeMayBysort(bangchon);
        System.out.println(list.size());
        for (String x : column) {
            model.addColumn(x);
        }
        for (XemayModel t : list) {
            Object[] x = {t.getIdxe(),t.getTen(),t.getHangxe(),t.getMausac(),t.getGiaban(),t.getNamsx(),t.getSoluong(),t.getDongco(),t.getDtxilanh()};
            model.addRow(x);
        }
        bangchinh.setModel(model);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame x = new Kho_xe();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangchinh;
    private javax.swing.JButton buthoadon;
    private javax.swing.JButton buthome;
    private javax.swing.JButton butkhoxe;
    private javax.swing.JButton butoto;
    private javax.swing.JButton buttaikhoa;
    private javax.swing.JButton butxemay;
    private javax.swing.JButton butxetai;
    private javax.swing.JTextField dc;
    private javax.swing.JTextField dt;
    private javax.swing.JTextField gia;
    private javax.swing.JComboBox<String> hang;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mau;
    private javax.swing.JComboBox<String> nam;
    private javax.swing.JTextField ndtk;
    private javax.swing.JPanel pankhoxe;
    private javax.swing.JPanel panxemay;
    private javax.swing.JPanel pkhoxe;
    private javax.swing.JTextField sl;
    private javax.swing.JComboBox<String> sxtheo;
    private javax.swing.JTextField ten;
    private javax.swing.JComboBox<String> tktheo;
    // End of variables declaration//GEN-END:variables
}
