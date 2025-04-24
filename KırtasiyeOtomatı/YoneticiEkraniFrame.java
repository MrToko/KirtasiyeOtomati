/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kirtasiyeotomati;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class YoneticiEkraniFrame extends javax.swing.JFrame {

    // yönetici kayıt işlemleri tabloları çağırdım
    DefaultTableModel tableMusteriModel;
    DefaultTableModel tabloUrunModel;
    DefaultTableModel tabloYoneticiModel;
    DefaultTableModel tabloSiparisModel;
    Kullanici kullanici;

    public YoneticiEkraniFrame(Kullanici kullanici) {
        initComponents();
        this.kullanici = kullanici;
        tableMusteriModel = new DefaultTableModel();
        tableMusteriModel.setColumnIdentifiers(new Object[]{"ID", "AD SOYAD", "EMAİL"});
        tbl_musteriTablo.setModel(tableMusteriModel);

        tabloYoneticiModel = new DefaultTableModel();
        tabloYoneticiModel.setColumnIdentifiers(new Object[]{"ID", "AD SOYAD", "EMAİL"});
        tbl_yoneticiTablo.setModel(tabloYoneticiModel);

        tabloUrunModel = new DefaultTableModel();
        tabloUrunModel.setColumnIdentifiers(new Object[]{"ID", "Ürün Adı", "Ürün Fiyat", "Ürün Stok Adet"});
        tbl_urunTablo.setModel(tabloUrunModel);

        tabloSiparisModel = new DefaultTableModel();
        tabloSiparisModel.setColumnIdentifiers(new Object[]{"Kullanıcı ID", "Urun ID", "Ürün Adı", "Ürün Fiyatı", "Ürün Kalan Stok Adet"});
        tbl_siparisTablo.setModel(tabloSiparisModel);

        txt_yoneticiId.setText(String.valueOf(this.kullanici.kullaniciId));
        txt_yoneticiAdiSoyadi.setText(this.kullanici.kullaniciadSoyad);
        txt_yoneticiEmail.setText(this.kullanici.kullaniciemail);
        txt_yoneticiSifre.setText(this.kullanici.kullanicisifre);
        txt_yoneticiId.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_musteriEkle = new javax.swing.JButton();
        btn_musteriSil = new javax.swing.JButton();
        btn_urunEkle = new javax.swing.JButton();
        btn_urunSil = new javax.swing.JButton();
        btn_urunGuncelle = new javax.swing.JButton();
        btn_musteriGuncelle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_urunTablo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_musteriTablo = new javax.swing.JTable();
        btn_urunArama = new javax.swing.JButton();
        btn_musteriArama = new javax.swing.JButton();
        txt_urunArama = new javax.swing.JTextField();
        txt_musteriArama = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txt_kullaniciKayitEmail = new javax.swing.JTextField();
        txt_kullaniciKayitAdiSoyadi = new javax.swing.JTextField();
        txt_kullaniciKayitSifre = new javax.swing.JTextField();
        chcbox_KullaniciUserTipi = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_kullaniciKayitId = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txt_urunAdi = new javax.swing.JTextField();
        txt_urunFiyati = new javax.swing.JTextField();
        txt_urunStokAdedi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_urunId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txt_yoneticiEmail = new javax.swing.JTextField();
        txt_yoneticiAdiSoyadi = new javax.swing.JTextField();
        txt_yoneticiSifre = new javax.swing.JTextField();
        chcbox_YoneticiUserTipi1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_yoneticiId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btn_guncelle = new javax.swing.JButton();
        txt_yoneticiArama = new javax.swing.JTextField();
        btn_yoneticiArama = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_yoneticiTablo = new javax.swing.JTable();
        btn_yoneticiEkle = new javax.swing.JButton();
        btn_yoneticiSil = new javax.swing.JButton();
        btn_yoneticiGuncelle = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        txt_yoneticiKayitEmail = new javax.swing.JTextField();
        txt_yoneticiKayitAdiSoyadi = new javax.swing.JTextField();
        txt_yoneticiKayitSifre = new javax.swing.JTextField();
        chcbox_YoneticikayıtUserTipi = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_yoneticiKayitId = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_siparisTablo = new javax.swing.JTable();
        btn_siparisleriGoster = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_ıtem_anaekranadon = new javax.swing.JMenuItem();
        menu_ıtem_kirtasiyedencık = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yönetici", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        btn_musteriEkle.setText("Müşteri Ekle");
        btn_musteriEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_musteriEkleActionPerformed(evt);
            }
        });

        btn_musteriSil.setText("Müşteri Sil");
        btn_musteriSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_musteriSilActionPerformed(evt);
            }
        });

        btn_urunEkle.setText("Ürün Ekle");
        btn_urunEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunEkleActionPerformed(evt);
            }
        });

        btn_urunSil.setText("Ürün Sil");
        btn_urunSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunSilActionPerformed(evt);
            }
        });

        btn_urunGuncelle.setText("Ürün Güncelle");
        btn_urunGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunGuncelleActionPerformed(evt);
            }
        });

        btn_musteriGuncelle.setText("Müşteri Güncelle");
        btn_musteriGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_musteriGuncelleActionPerformed(evt);
            }
        });

        tbl_urunTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_urunTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_urunTablo);

        tbl_musteriTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_musteriTabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_musteriTablo);

        btn_urunArama.setText("Ürün Arama");
        btn_urunArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunAramaActionPerformed(evt);
            }
        });

        btn_musteriArama.setText("Müşteri Arama");
        btn_musteriArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_musteriAramaActionPerformed(evt);
            }
        });

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kullanıcı Kayıt", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        chcbox_KullaniciUserTipi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chcbox_KullaniciUserTipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Müşteri", "Yönetici", " " }));
        chcbox_KullaniciUserTipi.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Kullanıcı Adı Soyad");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Kullanıcı Şifre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Kullanıcı Tipi");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Kullanıcı Id");

        txt_kullaniciKayitId.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_kullaniciKayitId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_kullaniciKayitSifre)
                                        .addComponent(txt_kullaniciKayitAdiSoyadi)
                                        .addComponent(chcbox_KullaniciUserTipi, 0, 200, Short.MAX_VALUE)
                                        .addComponent(txt_kullaniciKayitEmail)))))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kullaniciKayitEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kullaniciKayitAdiSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kullaniciKayitSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcbox_KullaniciUserTipi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_kullaniciKayitId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ürün Kayıt", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Ürün Adı ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Ürün Fiyatı");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Ürün Stok Adedi");

        txt_urunId.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Ürün Id");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_urunId)
                    .addComponent(txt_urunFiyati, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txt_urunAdi)
                    .addComponent(txt_urunStokAdedi))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_urunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_urunFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_urunStokAdedi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_urunId)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_urunArama, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_urunArama, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_urunEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_urunSil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_urunGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(btn_musteriEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_musteriSil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_musteriGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txt_musteriArama, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_musteriArama, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_urunArama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_musteriArama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_urunArama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_musteriArama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_urunGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_urunSil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_urunEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_musteriGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_musteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_musteriSil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("İşlemler", jPanel2);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel7.setBackground(new java.awt.Color(0, 153, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yönetici Kayıt", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N

        chcbox_YoneticiUserTipi1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chcbox_YoneticiUserTipi1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yönetici", "Müşteri", " " }));
        chcbox_YoneticiUserTipi1.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Yönetici Adı Soyad");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Yönetici Şifre");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Kullanıcı Tipi");

        txt_yoneticiId.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Yönetici Id");

        btn_guncelle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_guncelle.setText("Güncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_yoneticiArama.setText("Yönetici Arama");
        btn_yoneticiArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yoneticiAramaActionPerformed(evt);
            }
        });

        tbl_yoneticiTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_yoneticiTabloMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_yoneticiTablo);

        btn_yoneticiEkle.setText("Yönetici Ekle");
        btn_yoneticiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yoneticiEkleActionPerformed(evt);
            }
        });

        btn_yoneticiSil.setText("Yönetici Sil");
        btn_yoneticiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yoneticiSilActionPerformed(evt);
            }
        });

        btn_yoneticiGuncelle.setText("Yönetici Güncelle");
        btn_yoneticiGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yoneticiGuncelleActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yönetici Kayıt", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        chcbox_YoneticikayıtUserTipi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chcbox_YoneticikayıtUserTipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yönetici", "Müşteri" }));
        chcbox_YoneticikayıtUserTipi.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Email");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Yönetici Adı Soyad");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Yönetici  Şifre");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Yönetici  Tipi");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Yönetici  Id");

        txt_yoneticiKayitId.setEnabled(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_yoneticiKayitId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_yoneticiKayitSifre)
                                        .addComponent(txt_yoneticiKayitAdiSoyadi)
                                        .addComponent(chcbox_YoneticikayıtUserTipi, 0, 200, Short.MAX_VALUE)
                                        .addComponent(txt_yoneticiKayitEmail))))
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_yoneticiKayitEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_yoneticiKayitAdiSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_yoneticiKayitSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcbox_YoneticikayıtUserTipi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txt_yoneticiKayitId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_yoneticiSifre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(txt_yoneticiAdiSoyadi, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(chcbox_YoneticiUserTipi1, 0, 200, Short.MAX_VALUE)
                                            .addComponent(txt_yoneticiEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(txt_yoneticiId)))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btn_yoneticiEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_yoneticiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_yoneticiGuncelle))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txt_yoneticiArama, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_yoneticiArama, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(91, 91, 91))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yoneticiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yoneticiAdiSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yoneticiSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chcbox_YoneticiUserTipi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_yoneticiId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_yoneticiArama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_yoneticiArama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_yoneticiGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_yoneticiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_yoneticiEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);

        jTabbedPane1.addTab("Personel İşlemleri", jPanel1);

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setBackground(new java.awt.Color(153, 204, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Gelen Siparişler");

        jScrollPane4.setViewportView(tbl_siparisTablo);

        btn_siparisleriGoster.setText("Siparişleri Göster");
        btn_siparisleriGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siparisleriGosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel15)
                        .addGap(69, 69, 69)
                        .addComponent(btn_siparisleriGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_siparisleriGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel9);

        jTabbedPane1.addTab("Siparişler", jPanel8);

        getContentPane().add(jTabbedPane1);

        jMenu1.setText("Çıkış");

        menu_ıtem_anaekranadon.setText("Ana Ekrana Geri Dön");
        menu_ıtem_anaekranadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ıtem_anaekranadonActionPerformed(evt);
            }
        });
        jMenu1.add(menu_ıtem_anaekranadon);

        menu_ıtem_kirtasiyedencık.setText("Kirtasiyeden Çık");
        menu_ıtem_kirtasiyedencık.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ıtem_kirtasiyedencıkActionPerformed(evt);
            }
        });
        jMenu1.add(menu_ıtem_kirtasiyedencık);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_musteriEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_musteriEkleActionPerformed

        Pattern pattern = Pattern.compile("^([a-z]+\\w*){3,}@{1}((gmail)|(hotmail)){1}(.com){1}$");
        Matcher matcher = pattern.matcher(txt_kullaniciKayitEmail.getText());

        try {

            if (txt_kullaniciKayitAdiSoyadi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Kullanıcı Adınızı Ve Soyadınızı Giriniz");
            } else if (txt_kullaniciKayitEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Emailinizi Giriniz");
            } else if (txt_kullaniciKayitSifre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Şifrenizi Giriniz");
            } else {
                if (!matcher.find()) { // regexin doğru olup olmadığını kontrol eden if bloğu
                    JOptionPane.showMessageDialog(this, "Regex İçin Uygun Değildir \n example@gmail.com Veya example@hotmail.com \n Yukardaki Örneğe Benzer Kayıt Yapmalısınız");
                } else {
                    Kullanici newk = new Kullanici();

                    newk.kullaniciemail = txt_kullaniciKayitEmail.getText();
                    newk.kullaniciadSoyad = txt_kullaniciKayitAdiSoyadi.getText();
                    newk.kullanicisifre = txt_kullaniciKayitSifre.getText();
                    newk.kullaniciTipi = chcbox_KullaniciUserTipi.getSelectedItem().toString();

                    if (KirtasiyeDatabase.Addp(newk)) {
                        JOptionPane.showMessageDialog(this, "Kullanıcı Başarıyla Eklendi");
                    } else {
                        JOptionPane.showMessageDialog(this, "Kullanıcı Eklenmedi");
                    }
                }

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_musteriEkleActionPerformed

    private void btn_musteriSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_musteriSilActionPerformed

        if (tbl_musteriTablo.getSelectedRow() < 0) {
            return;
        }
        int id = (int) tableMusteriModel.getValueAt(tbl_musteriTablo.getSelectedRow(), 0);

        if (KirtasiyeDatabase.Deletep(id)) {
            JOptionPane.showMessageDialog(this, "Müşteri Başarıyla Silindi");
        } else {
            JOptionPane.showMessageDialog(this, "Müşteri Silinmedi");
        }
        txt_kullaniciKayitAdiSoyadi.setText("");
        txt_kullaniciKayitEmail.setText("");
        txt_kullaniciKayitSifre.setText("");

    }//GEN-LAST:event_btn_musteriSilActionPerformed

    private void btn_urunEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunEkleActionPerformed

        try {

            if (txt_urunAdi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Ürünün Adını Giriniz");
            } else if (txt_urunFiyati.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Ürünün Fiyatını Giriniz");
            } else if (txt_urunStokAdedi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Ürünün Stok Adedini Giriniz");
            } else {

                Urun urun = new Urun();

                urun.urunAdi = txt_urunAdi.getText();
                urun.urunFiyati = txt_urunFiyati.getText();
                urun.urunStokAdedi = txt_urunStokAdedi.getText();

                if (KirtasiyeDatabase.Addu(urun)) {
                    JOptionPane.showMessageDialog(this, "Ürün Başarıyla Eklendi");
                } else {
                    JOptionPane.showMessageDialog(this, "Ürün Eklenmedi");
                }

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_urunEkleActionPerformed

    private void btn_urunSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunSilActionPerformed
        if (tbl_urunTablo.getSelectedRow() < 0) {
            return;
        }
        int id = (int) tabloUrunModel.getValueAt(tbl_urunTablo.getSelectedRow(), 0);

        if (KirtasiyeDatabase.Deleteu(id)) {
            JOptionPane.showMessageDialog(this, "Ürün Başarıyla Silindi");
        } else {
            JOptionPane.showMessageDialog(this, "Ürün Silinmedi");
        }
        txt_urunAdi.setText("");
        txt_urunFiyati.setText("");
        txt_urunStokAdedi.setText("");
    }//GEN-LAST:event_btn_urunSilActionPerformed

    private void btn_urunGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunGuncelleActionPerformed

        Urun newUrun = new Urun();

        newUrun.urunId = Integer.parseInt(txt_urunId.getText());
        newUrun.urunAdi = txt_urunAdi.getText();
        newUrun.urunFiyati = txt_urunFiyati.getText();
        newUrun.urunStokAdedi = txt_urunStokAdedi.getText();

        if (KirtasiyeDatabase.UpdateUrun(newUrun)) {
            JOptionPane.showMessageDialog(this, "Ürün Başarıyla Güncellendi");
        } else {
            JOptionPane.showMessageDialog(this, "Ürün Güncellenmedi");
        }

        txt_urunAdi.setText("");
        txt_urunFiyati.setText("");
        txt_urunStokAdedi.setText("");

    }//GEN-LAST:event_btn_urunGuncelleActionPerformed

    private void btn_musteriGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_musteriGuncelleActionPerformed

        Kullanici newk = new Kullanici();

        newk.kullaniciId = Integer.parseInt(txt_kullaniciKayitId.getText());
        newk.kullaniciadSoyad = txt_kullaniciKayitAdiSoyadi.getText();
        newk.kullaniciemail = txt_kullaniciKayitEmail.getText();
        newk.kullanicisifre = txt_kullaniciKayitSifre.getText();
        newk.kullaniciTipi = chcbox_KullaniciUserTipi.getSelectedItem().toString();

        if (KirtasiyeDatabase.Updatep(newk)) {
            JOptionPane.showMessageDialog(this, "Müşteri Başarıyla Güncellendi");
        } else {
            JOptionPane.showMessageDialog(this, "Müşteri Güncellenmedi");
        }

        txt_kullaniciKayitAdiSoyadi.setText("");
        txt_kullaniciKayitEmail.setText("");
        txt_kullaniciKayitSifre.setText("");
        chcbox_KullaniciUserTipi.setSelectedIndex(0);

    }//GEN-LAST:event_btn_musteriGuncelleActionPerformed

    private void tbl_urunTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_urunTabloMouseClicked

        if (tbl_urunTablo.getSelectedRow() < 0) {
            return;
        }
        int id = (int) tabloUrunModel.getValueAt(tbl_urunTablo.getSelectedRow(), 0);

        Urun newUrun = KirtasiyeDatabase.SearchUrunById(id);

        if (newUrun != null) {
            txt_urunId.setText(String.valueOf(newUrun.urunId));
            txt_urunAdi.setText(newUrun.urunAdi);
            txt_urunFiyati.setText(newUrun.urunFiyati);
            txt_urunStokAdedi.setText(newUrun.urunStokAdedi);

        }

    }//GEN-LAST:event_tbl_urunTabloMouseClicked

    private void tbl_musteriTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_musteriTabloMouseClicked

        if (tbl_musteriTablo.getSelectedRow() < 0) {
            return;
        }
        int id = (int) tableMusteriModel.getValueAt(tbl_musteriTablo.getSelectedRow(), 0);

        Kullanici newk = KirtasiyeDatabase.SearchPersonelById(id);

        if (newk != null) {
            txt_kullaniciKayitId.setText(String.valueOf(newk.kullaniciId));
            txt_kullaniciKayitAdiSoyadi.setText(newk.kullaniciadSoyad);
            txt_kullaniciKayitEmail.setText(newk.kullaniciemail);
            txt_kullaniciKayitSifre.setText(newk.kullanicisifre);

            switch (newk.kullaniciTipi) {
                case "Müşteri":
                    chcbox_KullaniciUserTipi.setSelectedIndex(0);
                    break;
                case "Yönetici":
                    chcbox_KullaniciUserTipi.setSelectedIndex(1);
                    break;
            }

        }

    }//GEN-LAST:event_tbl_musteriTabloMouseClicked

    private void btn_urunAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunAramaActionPerformed

        String search = this.txt_urunArama.getText();
        tabloUrunModel.setRowCount(0);
        ArrayList<Urun> urunList = KirtasiyeDatabase.urunSearch(search);

        for (Urun newuUrun : urunList) {
            tabloUrunModel.addRow(new Object[]{newuUrun.urunId, newuUrun.urunAdi, newuUrun.urunFiyati, newuUrun.urunStokAdedi});
        }

        txt_urunFiyati.setText("");
        txt_urunAdi.setText("");
        txt_urunStokAdedi.setText("");
        txt_urunStokAdedi.setText("");
    }//GEN-LAST:event_btn_urunAramaActionPerformed

    private void btn_musteriAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_musteriAramaActionPerformed

        String search = this.txt_musteriArama.getText();
        tableMusteriModel.setRowCount(0);
        ArrayList<Kullanici> kullaniciList = KirtasiyeDatabase.kullaniciSearch(search);

        for (Kullanici newk : kullaniciList) {
            tableMusteriModel.addRow(new Object[]{newk.kullaniciId, newk.kullaniciadSoyad, newk.kullaniciemail});
        }

        txt_kullaniciKayitAdiSoyadi.setText("");
        txt_kullaniciKayitEmail.setText("");
        txt_kullaniciKayitSifre.setText("");
        chcbox_KullaniciUserTipi.setSelectedIndex(0);

    }//GEN-LAST:event_btn_musteriAramaActionPerformed

    private void menu_ıtem_anaekranadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ıtem_anaekranadonActionPerformed
        AnaEkran anaEkran = new AnaEkran();
        anaEkran.setVisible(true);
        setVisible(false);


    }//GEN-LAST:event_menu_ıtem_anaekranadonActionPerformed

    private void menu_ıtem_kirtasiyedencıkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ıtem_kirtasiyedencıkActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Çıkmak İstediğinizden Emin Misiniz ?", " Kontrol ", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            System.exit(0);
        } else {
            return;
        }

    }//GEN-LAST:event_menu_ıtem_kirtasiyedencıkActionPerformed

    private void btn_yoneticiAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yoneticiAramaActionPerformed

        String search = this.txt_yoneticiArama.getText();
        tabloYoneticiModel.setRowCount(0);
        ArrayList<Kullanici> kullaniciList = KirtasiyeDatabase.YoneticiSearch(search);

        for (Kullanici newk : kullaniciList) {
            tabloYoneticiModel.addRow(new Object[]{newk.kullaniciId, newk.kullaniciadSoyad, newk.kullaniciemail});
        }

        txt_yoneticiKayitAdiSoyadi.setText("");
        txt_yoneticiKayitEmail.setText("");
        txt_yoneticiKayitSifre.setText("");
        chcbox_YoneticikayıtUserTipi.setSelectedIndex(0);


    }//GEN-LAST:event_btn_yoneticiAramaActionPerformed

    private void tbl_yoneticiTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_yoneticiTabloMouseClicked

        if (tbl_yoneticiTablo.getSelectedRow() < 0) {
            return;
        }
        int id = (int) tabloYoneticiModel.getValueAt(tbl_yoneticiTablo.getSelectedRow(), 0);

        Kullanici newk = KirtasiyeDatabase.SearchYoneticiById(id);

        if (newk != null) {
            txt_yoneticiKayitId.setText(String.valueOf(newk.kullaniciId));
            txt_yoneticiKayitAdiSoyadi.setText(newk.kullaniciadSoyad);
            txt_yoneticiKayitEmail.setText(newk.kullaniciemail);
            txt_yoneticiKayitSifre.setText(newk.kullanicisifre);

            switch (newk.kullaniciTipi) {
                case "Müşteri":
                    chcbox_YoneticikayıtUserTipi.setSelectedIndex(0);
                    break;
                case "Yönetici":
                    chcbox_YoneticikayıtUserTipi.setSelectedIndex(1);
                    break;
            }

        }


    }//GEN-LAST:event_tbl_yoneticiTabloMouseClicked

    private void btn_yoneticiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yoneticiEkleActionPerformed

        // JOptionPane.showMessageDialog(rootPane, "Admin Hoşgeldin");
        try {

            if (txt_yoneticiKayitAdiSoyadi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Yönetici Adınızı Ve Soyadınızı Giriniz");
            } else if (txt_yoneticiKayitEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Emailinizi Giriniz");
            } else if (txt_yoneticiKayitSifre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Şifrenizi Giriniz");
            } else {

                Kullanici newk = new Kullanici();

                newk.kullaniciemail = txt_yoneticiKayitEmail.getText();
                newk.kullaniciadSoyad = txt_yoneticiKayitAdiSoyadi.getText();
                newk.kullanicisifre = txt_yoneticiKayitSifre.getText();
                newk.kullaniciTipi = chcbox_YoneticikayıtUserTipi.getSelectedItem().toString();
                String sifre = JOptionPane.showInputDialog(rootPane, "Yönetici Eklemek İçin Admin Şifrenizi Girmeniz Gerekmektdir");
                if (!sifre.equals("ts61")) {
                    JOptionPane.showMessageDialog(rootPane, "Parola Yanlış");
                } else {
                    if (!KirtasiyeDatabase.YoneticiKontrol(txt_yoneticiKayitEmail.getText())) {
                        JOptionPane.showMessageDialog(this, "Hesap Başkasına Aittir Lütfen başka email giriniz");
                    } else {
                        if (KirtasiyeDatabase.Addy(newk)) {
                            JOptionPane.showMessageDialog(this, "Yönetici Başarıyla Eklendi");
                        } else {
                            JOptionPane.showMessageDialog(this, "Yönetici Eklenmedi");
                        }
                    }
                }
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btn_yoneticiEkleActionPerformed

    private void btn_yoneticiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yoneticiSilActionPerformed

        String sifre = JOptionPane.showInputDialog(rootPane, "Yönetici Silmek İçin Admin Şifrenizi Girmeniz Gerekmektdir");
        if (!sifre.equals("ts61")) {
            JOptionPane.showMessageDialog(rootPane, "Parola Yanlış");
        } else {
            // JOptionPane.showMessageDialog(rootPane, "Admin Hoşgeldin");
            if (tbl_yoneticiTablo.getSelectedRow() < 0) {
                return;
            }
            int id = (int) tabloYoneticiModel.getValueAt(tbl_yoneticiTablo.getSelectedRow(), 0);

            if (KirtasiyeDatabase.Deletey(id)) {
                JOptionPane.showMessageDialog(this, "Yönetici Başarıyla Silindi");
            } else {
                JOptionPane.showMessageDialog(this, "Yönetici Silinmedi");
            }
            txt_yoneticiKayitAdiSoyadi.setText("");
            txt_yoneticiKayitEmail.setText("");
            txt_yoneticiKayitSifre.setText("");
        }


    }//GEN-LAST:event_btn_yoneticiSilActionPerformed

    private void btn_yoneticiGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yoneticiGuncelleActionPerformed

        String sifre = JOptionPane.showInputDialog(rootPane, "Yönetici Silmek İçin Admin Şifrenizi Girmeniz Gerekmektdir");

        if (!sifre.equals("ts61")) {
            JOptionPane.showMessageDialog(rootPane, "Parola Yanlış");
        } else {
            // JOptionPane.showMessageDialog(rootPane, "Admin Hoşgeldin");
            Kullanici newk = new Kullanici();

            newk.kullaniciId = Integer.parseInt(txt_yoneticiKayitId.getText());
            newk.kullaniciadSoyad = txt_yoneticiKayitAdiSoyadi.getText();
            newk.kullaniciemail = txt_yoneticiKayitEmail.getText();
            newk.kullanicisifre = txt_yoneticiKayitSifre.getText();
            newk.kullaniciTipi = chcbox_YoneticikayıtUserTipi.getSelectedItem().toString();

            if (KirtasiyeDatabase.Updatey(newk)) {
                JOptionPane.showMessageDialog(this, "Müşteri Başarıyla Güncellendi");
            } else {
                JOptionPane.showMessageDialog(this, "Müşteri Güncellenmedi");
            }

            txt_yoneticiKayitAdiSoyadi.setText("");
            txt_yoneticiKayitEmail.setText("");
            txt_yoneticiKayitSifre.setText("");
            chcbox_YoneticikayıtUserTipi.setSelectedIndex(0);

        }


    }//GEN-LAST:event_btn_yoneticiGuncelleActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed

        try {
            if (txt_yoneticiEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Emailinizi Giriniz");
            } else if (txt_yoneticiAdiSoyadi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Adınızı Ve Soyadınızı Giriniz");
            } else if (txt_yoneticiSifre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Şifrenizi Giriniz");
            } else {

                Kullanici newk = new Kullanici();

                newk.kullaniciId = Integer.parseInt(txt_yoneticiId.getText());
                newk.kullaniciemail = txt_yoneticiEmail.getText();
                newk.kullaniciadSoyad = txt_yoneticiAdiSoyadi.getText();
                newk.kullanicisifre = txt_yoneticiSifre.getText();
                newk.kullaniciTipi = chcbox_YoneticiUserTipi1.getSelectedItem().toString();

                if (KirtasiyeDatabase.Updatey(newk)) {
                    JOptionPane.showMessageDialog(this, "Yönetici Başarıyla Güncellendi");
                } else {
                    JOptionPane.showMessageDialog(this, "Yönetici Güncellenmedi");
                }
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void btn_siparisleriGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siparisleriGosterActionPerformed

        tabloSiparisModel.setRowCount(0);

        ArrayList<Urun> uruns = KirtasiyeDatabase.SiparisSearch(this.kullanici.kullaniciId);

        for (Urun newuUrun : uruns) {
            tabloSiparisModel.addRow(new Object[]{newuUrun.urunKullaniciId, newuUrun.urunId, newuUrun.urunAdi, newuUrun.urunFiyati, newuUrun.urunStokAdedi});
        }


    }//GEN-LAST:event_btn_siparisleriGosterActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //   new YoneticiEkraniFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_musteriArama;
    private javax.swing.JButton btn_musteriEkle;
    private javax.swing.JButton btn_musteriGuncelle;
    private javax.swing.JButton btn_musteriSil;
    private javax.swing.JButton btn_siparisleriGoster;
    private javax.swing.JButton btn_urunArama;
    private javax.swing.JButton btn_urunEkle;
    private javax.swing.JButton btn_urunGuncelle;
    private javax.swing.JButton btn_urunSil;
    private javax.swing.JButton btn_yoneticiArama;
    private javax.swing.JButton btn_yoneticiEkle;
    private javax.swing.JButton btn_yoneticiGuncelle;
    private javax.swing.JButton btn_yoneticiSil;
    private javax.swing.JComboBox<String> chcbox_KullaniciUserTipi;
    private javax.swing.JComboBox<String> chcbox_YoneticiUserTipi1;
    private javax.swing.JComboBox<String> chcbox_YoneticikayıtUserTipi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem menu_ıtem_anaekranadon;
    private javax.swing.JMenuItem menu_ıtem_kirtasiyedencık;
    private javax.swing.JTable tbl_musteriTablo;
    private javax.swing.JTable tbl_siparisTablo;
    private javax.swing.JTable tbl_urunTablo;
    private javax.swing.JTable tbl_yoneticiTablo;
    private javax.swing.JTextField txt_kullaniciKayitAdiSoyadi;
    private javax.swing.JTextField txt_kullaniciKayitEmail;
    private javax.swing.JTextField txt_kullaniciKayitId;
    private javax.swing.JTextField txt_kullaniciKayitSifre;
    private javax.swing.JTextField txt_musteriArama;
    private javax.swing.JTextField txt_urunAdi;
    private javax.swing.JTextField txt_urunArama;
    private javax.swing.JTextField txt_urunFiyati;
    private javax.swing.JTextField txt_urunId;
    private javax.swing.JTextField txt_urunStokAdedi;
    private javax.swing.JTextField txt_yoneticiAdiSoyadi;
    private javax.swing.JTextField txt_yoneticiArama;
    private javax.swing.JTextField txt_yoneticiEmail;
    private javax.swing.JTextField txt_yoneticiId;
    private javax.swing.JTextField txt_yoneticiKayitAdiSoyadi;
    private javax.swing.JTextField txt_yoneticiKayitEmail;
    private javax.swing.JTextField txt_yoneticiKayitId;
    private javax.swing.JTextField txt_yoneticiKayitSifre;
    private javax.swing.JTextField txt_yoneticiSifre;
    // End of variables declaration//GEN-END:variables
}
