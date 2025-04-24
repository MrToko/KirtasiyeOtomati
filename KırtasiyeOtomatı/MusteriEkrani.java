/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kirtasiyeotomati;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MusteriEkrani extends javax.swing.JFrame {
// bütün tabloları çağırdım
    DefaultTableModel tabloUrunModel;
    DefaultTableModel sepetTableModel;
    DefaultTableModel siparisTabloModel;
    Kullanici k;

    public MusteriEkrani(Kullanici k) {
        initComponents();
        this.k = k;
        tabloUrunModel = new DefaultTableModel();
        tabloUrunModel.setColumnIdentifiers(new Object[]{"ID", "Ürün Adı", "Ürün Fiyat"});
        tbl_urunTablo.setModel(tabloUrunModel);
        txt_müsteriAdi.setText(String.valueOf(this.k.kullaniciemail));
        txt_kullaniciKayitAdiSoyadi1.setText(this.k.kullaniciadSoyad);
        txt_kullaniciKayitEmail1.setText(this.k.kullaniciemail);
        txt_kullaniciKayitSifre1.setText(this.k.kullanicisifre);
        txt_kullaniciKayitId.setText(String.valueOf(this.k.kullaniciId));
        txt_kullaniciKayitId.setEnabled(false);
        //   txt_kullaniciKayitAdiSoyadi1.setText(k.);

        setUruntoTable();

        /*  tabloUrunModel = new DefaultTableModel();
        tabloUrunModel.setColumnIdentifiers(new Object[]{"ID", "Ürün Adı", "Ürün Fiyat", "Ürün Stok Adet"});
        tbl_urunTablo.setModel(tabloUrunModel);*/
        siparisTabloModel = new DefaultTableModel();
        siparisTabloModel.setColumnIdentifiers(new Object[]{"ID", "Ürün Adı"});
        tbl_siparisTablo.setModel(siparisTabloModel);

        sepetTableModel = new DefaultTableModel();
        sepetTableModel.setColumnIdentifiers(new Object[]{"ID", "Ürün Adı", "Ürün Fiyat"});
        tbl_sepetTablo.setModel(sepetTableModel);

    }

    private void setUruntoTable() { // hazır olarak ürünleri çağıran fonk
        ArrayList<Urun> newUruns = KirtasiyeDatabase.GetUruns();
        tabloUrunModel.setRowCount(0);
        for (Urun urun : newUruns) {
            tabloUrunModel.addRow(new Object[]{urun.urunId, urun.urunAdi, urun.urunFiyati});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tap_hesabıDuzenle = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txt_kullaniciKayitEmail1 = new javax.swing.JTextField();
        txt_kullaniciKayitAdiSoyadi1 = new javax.swing.JTextField();
        txt_kullaniciKayitSifre1 = new javax.swing.JTextField();
        chcbox_KullaniciUserTipi1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_kullaniciKayitId = new javax.swing.JTextField();
        btn_kullanıcıGuncelle = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_siparisTablo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btn_siparislerimiGoster = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sepetTablo = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_urunTablo = new javax.swing.JTable();
        btn_sepeteEkle = new javax.swing.JButton();
        btn_sepettenCıkar = new javax.swing.JButton();
        btn_cıkıs = new javax.swing.JButton();
        btn_toplamFiyat = new javax.swing.JButton();
        txt_toplamFiyat = new javax.swing.JTextField();
        txt_müsteriAdi = new javax.swing.JTextField();
        btn_urunArama = new javax.swing.JButton();
        txt_urunArama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_satınAl = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_item_anaekrandon = new javax.swing.JMenuItem();
        menu_ıtem_kirtasiyedencıkıs = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jPanel1);

        tap_hesabıDuzenle.setBackground(new java.awt.Color(153, 0, 255));
        tap_hesabıDuzenle.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tap_hesabıDuzenleStateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kullanıcı Kayıt", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        chcbox_KullaniciUserTipi1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chcbox_KullaniciUserTipi1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Müşteri", "Yönetici", " " }));
        chcbox_KullaniciUserTipi1.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Kullanıcı Adı Soyad");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Kullanıcı Şifre");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Kullanıcı Tipi");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Kullanıcı Id");

        btn_kullanıcıGuncelle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_kullanıcıGuncelle.setText("Güncelle");
        btn_kullanıcıGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullanıcıGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_kullaniciKayitId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_kullaniciKayitSifre1)
                                        .addComponent(txt_kullaniciKayitAdiSoyadi1)
                                        .addComponent(chcbox_KullaniciUserTipi1, 0, 200, Short.MAX_VALUE)
                                        .addComponent(txt_kullaniciKayitEmail1)))))
                        .addGap(0, 19, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_kullanıcıGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kullaniciKayitEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kullaniciKayitAdiSoyadi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kullaniciKayitSifre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcbox_KullaniciUserTipi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_kullaniciKayitId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_kullanıcıGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(tbl_siparisTablo);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Siparişler");

        btn_siparislerimiGoster.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_siparislerimiGoster.setText("Şiparişlerimi Göster");
        btn_siparislerimiGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siparislerimiGosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_siparislerimiGoster)
                        .addGap(173, 173, 173))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_siparislerimiGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        tap_hesabıDuzenle.addTab("Hesap Düzenle", jPanel3);

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));

        jScrollPane2.setViewportView(tbl_sepetTablo);

        tbl_urunTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_urunTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_urunTablo);

        btn_sepeteEkle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_sepeteEkle.setText("Sepete Ekle");
        btn_sepeteEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sepeteEkleActionPerformed(evt);
            }
        });

        btn_sepettenCıkar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_sepettenCıkar.setText("Çıkar");
        btn_sepettenCıkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sepettenCıkarActionPerformed(evt);
            }
        });

        btn_cıkıs.setText("Çıkış");
        btn_cıkıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cıkısActionPerformed(evt);
            }
        });

        btn_toplamFiyat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_toplamFiyat.setText("ToplamFiyat");
        btn_toplamFiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_toplamFiyatActionPerformed(evt);
            }
        });

        btn_urunArama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_urunArama.setText("Ürün Arama");
        btn_urunArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunAramaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Sepet");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Müşteri Adı");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ürün Listesi");

        btn_satınAl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_satınAl.setText("Satın Al");
        btn_satınAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_satınAlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_urunArama, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_urunArama, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_sepettenCıkar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_sepeteEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btn_satınAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_toplamFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_toplamFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(144, 144, 144))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_müsteriAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_cıkıs, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_müsteriAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_urunArama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_urunArama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btn_sepeteEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sepettenCıkar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 240, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cıkıs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_toplamFiyat, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txt_toplamFiyat, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn_satınAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tap_hesabıDuzenle.addTab("Alışveriş", jPanel2);

        getContentPane().add(tap_hesabıDuzenle);

        jMenu1.setText("Çıkış");

        menu_item_anaekrandon.setText("Ana Ekrana Dön");
        menu_item_anaekrandon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_anaekrandonActionPerformed(evt);
            }
        });
        jMenu1.add(menu_item_anaekrandon);

        menu_ıtem_kirtasiyedencıkıs.setText("Kırtasiyeden Çıkış");
        menu_ıtem_kirtasiyedencıkıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ıtem_kirtasiyedencıkısActionPerformed(evt);
            }
        });
        jMenu1.add(menu_ıtem_kirtasiyedencıkıs);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_urunAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunAramaActionPerformed

        String search = this.txt_urunArama.getText();
        tabloUrunModel.setRowCount(0);
        ArrayList<Urun> urunList = KirtasiyeDatabase.urunSearch(search);

        for (Urun newuUrun : urunList) {
            tabloUrunModel.addRow(new Object[]{newuUrun.urunId, newuUrun.urunAdi, newuUrun.urunFiyati});
        }

    }//GEN-LAST:event_btn_urunAramaActionPerformed

    private void btn_sepeteEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sepeteEkleActionPerformed

        if (tbl_urunTablo.getSelectedRow() < 0) {
            return;
        }

        int id_urun = Integer.parseInt(tabloUrunModel.getValueAt(tbl_urunTablo.getSelectedRow(), 0).toString());
        int id = (int) tabloUrunModel.getValueAt(tbl_urunTablo.getSelectedRow(), 0);
        Urun newUrun = KirtasiyeDatabase.SearchUrunById(id);

        if (KirtasiyeDatabase.AddUrunToKullaniciById(this.k.kullaniciId, id_urun)) {
            sepetTableModel.addRow(new Object[]{newUrun.urunId, newUrun.urunAdi, newUrun.urunFiyati});

            JOptionPane.showMessageDialog(this, "Eklendi");
        } else {
            JOptionPane.showMessageDialog(this, "Eklenmedi");
        }

        /*
        if (tbl_urunTablo.getSelectedRow() < 0) {
            return;
        }
        int id = (int) tabloUrunModel.getValueAt(tbl_urunTablo.getSelectedRow(), 0);
        
        Urun newUrun = KirtasiyeDatabase.SearchUrunById(id);
        
        if (newUrun != null) {
            sepetTableModel.addRow(new Object[]{newUrun.urunAdi, newUrun.urunFiyati});
        }*/

    }//GEN-LAST:event_btn_sepeteEkleActionPerformed

    private void tbl_urunTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_urunTabloMouseClicked

    }//GEN-LAST:event_tbl_urunTabloMouseClicked

    private void btn_toplamFiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_toplamFiyatActionPerformed

        int toplamfiyat = 0;

        for (int i = 0; i < sepetTableModel.getRowCount(); i++) {
            Object urunFiyatı = sepetTableModel.getValueAt(i, 2);
            toplamfiyat += Integer.parseInt(String.valueOf(urunFiyatı));
        }
        txt_toplamFiyat.setText(String.valueOf(toplamfiyat));


    }//GEN-LAST:event_btn_toplamFiyatActionPerformed

    private void btn_sepettenCıkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sepettenCıkarActionPerformed

        if (tbl_urunTablo.getSelectedRow() < 0) {
            return;
        }
        int id_urun = Integer.parseInt(tabloUrunModel.getValueAt(tbl_urunTablo.getSelectedRow(), 0).toString());

        if (KirtasiyeDatabase.DeleteUrunToKullaniciById(this.k.kullaniciId, id_urun)) {
            sepetTableModel.removeRow(tbl_sepetTablo.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Ürün Silindi");
        } else {
            JOptionPane.showMessageDialog(this, "Ürün Silinmedi");
        }


    }//GEN-LAST:event_btn_sepettenCıkarActionPerformed

    private void btn_kullanıcıGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullanıcıGuncelleActionPerformed

        try {
            if (txt_kullaniciKayitAdiSoyadi1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Adınızı Ve Soyadınızı Giriniz");
            } else if (txt_kullaniciKayitEmail1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Emailinizi Giriniz");
            } else if (txt_kullaniciKayitSifre1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Şifrenizi Giriniz");
            } else {

                Kullanici newk = new Kullanici();

                newk.kullaniciId = Integer.parseInt(txt_kullaniciKayitId.getText());
                newk.kullaniciemail = txt_kullaniciKayitEmail1.getText();
                newk.kullaniciadSoyad = txt_kullaniciKayitAdiSoyadi1.getText();
                newk.kullanicisifre = txt_kullaniciKayitSifre1.getText();
                newk.kullaniciTipi = chcbox_KullaniciUserTipi1.getSelectedItem().toString();

                if (KirtasiyeDatabase.Updatep(newk)) {
                    JOptionPane.showMessageDialog(this, "Müşteri Başarıyla Güncellendi");
                } else {
                    JOptionPane.showMessageDialog(this, "Müşteri Güncellenmedi");
                }
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btn_kullanıcıGuncelleActionPerformed

    private void btn_cıkısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cıkısActionPerformed

        int option = JOptionPane.showConfirmDialog(rootPane, "Çıkmak İstediğinizden Emin Misiniz ?", " Kontrol ", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_btn_cıkısActionPerformed

    private void tap_hesabıDuzenleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tap_hesabıDuzenleStateChanged

        /*    if (tap_hesabıDuzenle.getSelectedIndex() == 1) {
            ArrayList<Urun> uruns = KirtasiyeDatabase.GetKullaniciSelectedUrunByIdJoin(this.k.kullaniciId);
            siparisTabloModel.setRowCount(0);
            for (Urun urun : uruns) {
                siparisTabloModel.addRow(new Object[]{urun.urunId, urun.urunAdi, urun.urunFiyati});
            }
        }*/

    }//GEN-LAST:event_tap_hesabıDuzenleStateChanged

    private void menu_item_anaekrandonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_anaekrandonActionPerformed

        AnaEkran anaEkran = new AnaEkran();
        anaEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menu_item_anaekrandonActionPerformed

    private void menu_ıtem_kirtasiyedencıkısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ıtem_kirtasiyedencıkısActionPerformed

        int option = JOptionPane.showConfirmDialog(rootPane, "Çıkmak İstediğinizden Emin Misiniz ?", " Kontrol ", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_menu_ıtem_kirtasiyedencıkısActionPerformed

    private void btn_satınAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_satınAlActionPerformed

        int option = JOptionPane.showConfirmDialog(rootPane, "Sepetteki Ürünleri Almak İstediğinize Emin Misiniz?", " Kontrol ", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            for (int i = 0; i < tbl_sepetTablo.getRowCount(); i++) {
                Object id = tbl_sepetTablo.getValueAt(i, 0);
                //   Object adet = tbl_sepetTablo.getValueAt(i, 3);
                KirtasiyeDatabase.StokGuncelle(Integer.parseInt(String.valueOf(id)), 1);
            }
            JOptionPane.showMessageDialog(this, "Siparişiniz Verildi");
        } else {
            return;
        }


    }//GEN-LAST:event_btn_satınAlActionPerformed

    private void btn_siparislerimiGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siparislerimiGosterActionPerformed

        ArrayList<Urun> uruns = KirtasiyeDatabase.GetKullaniciSelectedUrunByIdJoin(this.k.kullaniciId);
        siparisTabloModel.setRowCount(0);
        for (Urun urun : uruns) {
            siparisTabloModel.addRow(new Object[]{urun.urunId, urun.urunAdi});
        }


    }//GEN-LAST:event_btn_siparislerimiGosterActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new MusteriEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cıkıs;
    private javax.swing.JButton btn_kullanıcıGuncelle;
    private javax.swing.JButton btn_satınAl;
    private javax.swing.JButton btn_sepeteEkle;
    private javax.swing.JButton btn_sepettenCıkar;
    private javax.swing.JButton btn_siparislerimiGoster;
    private javax.swing.JButton btn_toplamFiyat;
    private javax.swing.JButton btn_urunArama;
    private javax.swing.JComboBox<String> chcbox_KullaniciUserTipi1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem menu_item_anaekrandon;
    private javax.swing.JMenuItem menu_ıtem_kirtasiyedencıkıs;
    private javax.swing.JTabbedPane tap_hesabıDuzenle;
    private javax.swing.JTable tbl_sepetTablo;
    private javax.swing.JTable tbl_siparisTablo;
    private javax.swing.JTable tbl_urunTablo;
    private javax.swing.JTextField txt_kullaniciKayitAdiSoyadi1;
    private javax.swing.JTextField txt_kullaniciKayitEmail1;
    private javax.swing.JTextField txt_kullaniciKayitId;
    private javax.swing.JTextField txt_kullaniciKayitSifre1;
    private javax.swing.JTextField txt_müsteriAdi;
    private javax.swing.JTextField txt_toplamFiyat;
    private javax.swing.JTextField txt_urunArama;
    // End of variables declaration//GEN-END:variables
}
