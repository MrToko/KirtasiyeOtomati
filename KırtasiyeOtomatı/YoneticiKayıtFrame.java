/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kirtasiyeotomati;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class YoneticiKayıtFrame extends javax.swing.JFrame {

    /**
     * Creates new form YoneticiKayıtFrame
     */
    public YoneticiKayıtFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_kayıtOl = new javax.swing.JButton();
        txt_yoneticiiKayitEmail = new javax.swing.JTextField();
        txt_yoneticiiKayitAdiSoyadi = new javax.swing.JTextField();
        txt_yoneticiiKayitSifre = new javax.swing.JTextField();
        chcbox_KullaniciUserTipi = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_geriDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yönetici Kayıt", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N

        btn_kayıtOl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_kayıtOl.setText("Kayıt Ol");
        btn_kayıtOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayıtOlActionPerformed(evt);
            }
        });

        chcbox_KullaniciUserTipi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chcbox_KullaniciUserTipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yönetici", "Müşteri", " " }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Yönetici Adı Soyad");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Yönetici Şifre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Kullanıcı Tipi");

        btn_geriDon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_geriDon.setText("Geri Dön");
        btn_geriDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_yoneticiiKayitSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_yoneticiiKayitAdiSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chcbox_KullaniciUserTipi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_yoneticiiKayitEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_geriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_kayıtOl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_yoneticiiKayitEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_yoneticiiKayitAdiSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_yoneticiiKayitSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcbox_KullaniciUserTipi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kayıtOl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_geriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kayıtOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayıtOlActionPerformed

        // burada kayıt işlemi fonk
        Pattern pattern = Pattern.compile("^([a-z]+\\w*){3,}@{1}((gmail)|(hotmail)){1}(.com){1}$");
        Matcher matcher = pattern.matcher(txt_yoneticiiKayitEmail.getText());

        try {

            if (txt_yoneticiiKayitEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Emailinizi Giriniz");
            } else if (txt_yoneticiiKayitAdiSoyadi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Adınızı Ve Soyadınızı Giriniz");
            } else if (txt_yoneticiiKayitSifre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Şifrenizi Giriniz");
            } else {

                if (!matcher.find()) { // regexin doğru olup olmadığını kontrol eden if bloğu
                    JOptionPane.showMessageDialog(this, "Regex İçin Uygun Değildir \n example@gmail.com Veya example@hotmail.com \n Yukardaki Örneğe Benzer Kayıt Yapmalısınız");
                } else {
                    Kullanici newk = new Kullanici();

                    newk.kullaniciemail = txt_yoneticiiKayitEmail.getText();
                    newk.kullaniciadSoyad = txt_yoneticiiKayitAdiSoyadi.getText();
                    newk.kullanicisifre = txt_yoneticiiKayitSifre.getText();
                    newk.kullaniciTipi = chcbox_KullaniciUserTipi.getSelectedItem().toString();

                    if (!KirtasiyeDatabase.YoneticiKontrol(txt_yoneticiiKayitEmail.getText())) {
                        JOptionPane.showMessageDialog(this, "Hesap Başkasına Aittir Lütfen başka email giriniz");
                    } else {
                        if (KirtasiyeDatabase.Addp(newk)) {
                            JOptionPane.showMessageDialog(this, "Yönetici Başarıyla Eklendi");
                            MusteriGirisi musteriGirisi = new MusteriGirisi();
                            musteriGirisi.setVisible(true);
                            setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(this, "Yönetici Eklenmedi");
                        }
                    }

                }

            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_btn_kayıtOlActionPerformed

    private void btn_geriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriDonActionPerformed
        YoneticiGirisi yoneticiGirisi = new YoneticiGirisi();
        yoneticiGirisi.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_geriDonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YoneticiKayıtFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geriDon;
    private javax.swing.JButton btn_kayıtOl;
    private javax.swing.JComboBox<String> chcbox_KullaniciUserTipi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_yoneticiiKayitAdiSoyadi;
    private javax.swing.JTextField txt_yoneticiiKayitEmail;
    private javax.swing.JTextField txt_yoneticiiKayitSifre;
    // End of variables declaration//GEN-END:variables
}
