/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kirtasiyeotomati;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class MusteriGirisi extends javax.swing.JFrame {

    public MusteriGirisi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_girisYap = new javax.swing.JButton();
        btn_kayıtOl = new javax.swing.JButton();
        txt_musteriEmail = new javax.swing.JTextField();
        txt_musteriSifre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_geriDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Giriş", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 36))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        btn_girisYap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_girisYap.setText("Giriş");
        btn_girisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisYapActionPerformed(evt);
            }
        });

        btn_kayıtOl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_kayıtOl.setText("Kayıt Ol");
        btn_kayıtOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayıtOlActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Müşteri Email");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Müşteri Şifre");

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
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_musteriEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_geriDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_kayıtOl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_musteriSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btn_girisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_musteriEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_musteriSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_girisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kayıtOl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_geriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_girisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisYapActionPerformed

        Pattern pattern = Pattern.compile("^([a-z]+\\w*){3,}@{1}((gmail)|(hotmail)){1}(.com){1}$"); // regex kontrolü
        Matcher matcher = pattern.matcher(txt_musteriEmail.getText());

        try {

            if (txt_musteriEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Emailiniz Giriniz");
            } else if (txt_musteriSifre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen Şifrenizi Giriniz");
            } else {

                if (!matcher.find()) { // regexin doğru olup olmadığını kontrol eden if bloğu
                    JOptionPane.showMessageDialog(this, "Regex İçin Uygun Değildir \n example@gmail.com Veya example@hotmail.com \n Yukardaki Örneğe Benzer Giriş Yapmalısınız");
                } else {

                    String email = txt_musteriEmail.getText();

                    String password = txt_musteriSifre.getText();

                    Kullanici kullanici = KirtasiyeDatabase.LoginKullanici(email, password);

                    if (kullanici != null) {
                        //       JOptionPane.showMessageDialog(rootPane, "Başarılı");
                        if (kullanici.kullaniciTipi.compareTo("Müşteri") == 0) {
                            JOptionPane.showMessageDialog(rootPane, "Giriş Başarılı");
                            MusteriEkrani musteriEkrani = new MusteriEkrani(kullanici);
                            musteriEkrani.setVisible(true);
                            setVisible(false);
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Giriş Başarısız");
                    }
                }
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btn_girisYapActionPerformed

    private void btn_kayıtOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayıtOlActionPerformed

        MusteriKayitFrame musteriKayitFrame = new MusteriKayitFrame();
        musteriKayitFrame.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_btn_kayıtOlActionPerformed

    private void btn_geriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriDonActionPerformed
        AnaEkran anaEkran = new AnaEkran();
        anaEkran.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_btn_geriDonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriGirisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geriDon;
    private javax.swing.JButton btn_girisYap;
    private javax.swing.JButton btn_kayıtOl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_musteriEmail;
    private javax.swing.JTextField txt_musteriSifre;
    // End of variables declaration//GEN-END:variables
}
