/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kirtasiyeotomati;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KirtasiyeDatabase {
// burada mysql kodlarını kullandım gerekli kütüphaneleri kullanarak
    private static final String connectionString = "jdbc:mysql://127.0.0.1:3306/db_kirtasiye?user=root&password=toko61";

    private static Connection conn;

    public static Kullanici LoginKullanici(String email, String password) {// müşteri giriş fonksiyonu
        Kullanici kullanici = null;
        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String query = "SELECT * FROM dB_kirtasiye.tbl_kullanici WHERE email='" + email + "' AND sifre='" + password + "';";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                kullanici = new Kullanici();
                kullanici.kullaniciId = rs.getInt("id");
                kullanici.kullaniciadSoyad = rs.getString("ad_soyad");
                kullanici.kullaniciemail = rs.getString("email");
                kullanici.kullanicisifre = rs.getString("sifre");
                kullanici.kullaniciTipi = rs.getString("kullanici_tipi");

            }

            conn.close();

        } catch (Exception e) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, e);
        }
        return kullanici;
    }

    public static Kullanici LoginYonetici(String email, String password) { // yönetici giriş fonksiyonu
        Kullanici kullanici = null;
        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String query = "SELECT * FROM dB_kirtasiye.tbl_yonetici WHERE email='" + email + "' AND sifre='" + password + "';";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                kullanici = new Kullanici();
                kullanici.kullaniciId = rs.getInt("id");
                kullanici.kullaniciadSoyad = rs.getString("ad_soyad");
                kullanici.kullaniciemail = rs.getString("email");
                kullanici.kullanicisifre = rs.getString("sifre");
                kullanici.kullaniciTipi = rs.getString("kullanici_tipi");

            }

            conn.close();

        } catch (Exception e) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, e);
        }
        return kullanici;
    }

    public static boolean Addp(Kullanici newk) { // müşteri ekleme fonk
        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();

            String query = "INSERT INTO db_kirtasiye.tbl_kullanici"
                    + "(ad_soyad, email, sifre,kullanici_tipi)"
                    + "VALUES('" + newk.kullaniciadSoyad + "','" + newk.kullaniciemail + "','"
                    + newk.kullanicisifre + "','" + newk.kullaniciTipi + "');";

            /*        String query = "INSERT INTO db_kirtasiye.tbl_kullanici" +"(ad_soyad, email, sifre,kullanici_tipi)" 
                    + VALUES('" + newk.kullaniciId + "','" + newk.kullaniciadSoyad + "','" + newk.kullaniciemail + "','"
                    + newk.kullanicisifre + "',');"; */
            stmt.execute(query);
            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public static boolean Addy(Kullanici newk) {
        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();

            String query = "INSERT INTO db_kirtasiye.tbl_yonetici"
                    + "(ad_soyad, email, sifre,kullanici_tipi)"
                    + "VALUES('" + newk.kullaniciadSoyad + "','" + newk.kullaniciemail + "','"
                    + newk.kullanicisifre + "','" + newk.kullaniciTipi + "');";

            /*        String query = "INSERT INTO db_kirtasiye.tbl_kullanici" +"(ad_soyad, email, sifre,kullanici_tipi)" 
                    + VALUES('" + newk.kullaniciId + "','" + newk.kullaniciadSoyad + "','" + newk.kullaniciemail + "','"
                    + newk.kullanicisifre + "',');"; */
            stmt.execute(query);
            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public static ArrayList<Kullanici> kullaniciSearch(String search) {

        ArrayList<Kullanici> kullaniciList = new ArrayList<>();

        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement st = conn.createStatement();
            String query1 = "SELECT * FROM db_kirtasiye.tbl_kullanici WHERE ad_soyad LIKE '%" + search + "%' OR email LIKE '%" + search + "%'";
            ResultSet rs = st.executeQuery(query1);

            while (rs.next()) {
                Kullanici newk = new Kullanici();
                newk.kullaniciId = rs.getInt("id");
                newk.kullaniciadSoyad = rs.getString("ad_soyad");
                newk.kullaniciemail = rs.getString("email");
                newk.kullanicisifre = rs.getString("sifre");
                newk.kullaniciTipi = rs.getString("kullanici_tipi");

                kullaniciList.add(newk);
            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kullaniciList;
    }

    public static ArrayList<Kullanici> YoneticiSearch(String search) {

        ArrayList<Kullanici> yoneticiList = new ArrayList<>();

        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement st = conn.createStatement();
            String query1 = "SELECT * FROM db_kirtasiye.tbl_yonetici WHERE ad_soyad LIKE '%" + search + "%' OR email LIKE '%" + search + "%'";
            ResultSet rs = st.executeQuery(query1);

            while (rs.next()) {
                Kullanici newk = new Kullanici();
                newk.kullaniciId = rs.getInt("id");
                newk.kullaniciadSoyad = rs.getString("ad_soyad");
                newk.kullaniciemail = rs.getString("email");
                newk.kullanicisifre = rs.getString("sifre");
                newk.kullaniciTipi = rs.getString("kullanici_tipi");

                yoneticiList.add(newk);
            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        return yoneticiList;
    }

    public static boolean Updatep(Kullanici newk) {

        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String q = "UPDATE db_kirtasiye.tbl_kullanici SET "
                    + "ad_soyad='" + newk.kullaniciadSoyad
                    + "',email='" + newk.kullaniciemail
                    + "',sifre='" + newk.kullanicisifre
                    + "',kullanici_tipi='" + newk.kullaniciTipi
                    + "' WHERE id=" + newk.kullaniciId + ";";

            stmt.executeUpdate(q);
            conn.close();
            return true;

        } catch (SQLException ex) {

            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public static boolean StokGuncelle(int id, int azalt) {

        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String q = "SELECT * FROM db_kirtasiye.tbl_urun where id=" + id + ";";

            ResultSet rs = stmt.executeQuery(q);
            while (rs.next()) {
                int stokAdeti = rs.getInt("urun_stok_adet");
                int yeniStokAdet = stokAdeti - azalt;
                String q1 = "UPDATE db_kirtasiye.tbl_urun SET urun_stok_adet=" + yeniStokAdet + " WHERE id=" + id + ";";
                stmt.executeUpdate(q1);
            }

            conn.close();
            return true;

        } catch (SQLException ex) {

            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public static boolean YoneticiKontrol(String email) {

        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String q = "SELECT count(id) AS total FROM db_kirtasiye.tbl_yonetici where email='" + email + "';";
            ResultSet rs = stmt.executeQuery(q);

            while (rs.next()) {
                int total = rs.getInt("total");
                if (total == 0) {
                    return true;
                }
            }
            conn.close();
            return false;
        } catch (SQLException ex) {

            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public static boolean KullaniciKontrol(String email) {

        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String q = "SELECT count(id) AS total FROM db_kirtasiye.tbl_kullanici where email='" + email + "';";
            ResultSet rs = stmt.executeQuery(q);

            while (rs.next()) {
                int total = rs.getInt("total");
                if (total == 0) {
                    return true;
                }
            }
            conn.close();
            return false;
        } catch (SQLException ex) {

            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public static boolean Updatey(Kullanici newk) {

        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String q = "UPDATE db_kirtasiye.tbl_yonetici SET "
                    + "ad_soyad='" + newk.kullaniciadSoyad
                    + "',email='" + newk.kullaniciemail
                    + "',sifre='" + newk.kullanicisifre
                    + "',kullanici_tipi='" + newk.kullaniciTipi
                    + "' WHERE id=" + newk.kullaniciId + ";";

            stmt.executeUpdate(q);
            conn.close();
            return true;

        } catch (SQLException ex) {

            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public static Kullanici SearchPersonelById(int id) {

        Kullanici newk = null;

        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement st = conn.createStatement();
            String query1 = "SELECT * FROM db_kirtasiye.tbl_kullanici WHERE id=" + id + ";";
            ResultSet rs = st.executeQuery(query1);

            if (rs.next()) {
                newk = new Kullanici();
                newk.kullaniciId = rs.getInt("id");
                newk.kullaniciadSoyad = rs.getString("ad_soyad");
                newk.kullaniciemail = rs.getString("email");
                newk.kullanicisifre = rs.getString("sifre");
                newk.kullaniciTipi = rs.getString("kullanici_tipi");

            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        return newk;
    }

    public static Kullanici SearchYoneticiById(int id) {

        Kullanici newk = null;

        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement st = conn.createStatement();
            String query1 = "SELECT * FROM db_kirtasiye.tbl_yonetici WHERE id=" + id + ";";
            ResultSet rs = st.executeQuery(query1);

            if (rs.next()) {
                newk = new Kullanici();
                newk.kullaniciId = rs.getInt("id");
                newk.kullaniciadSoyad = rs.getString("ad_soyad");
                newk.kullaniciemail = rs.getString("email");
                newk.kullanicisifre = rs.getString("sifre");
                newk.kullaniciTipi = rs.getString("kullanici_tipi");

            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        return newk;
    }

    public static boolean Deletep(int id) {

        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String query = "delete from db_kirtasiye.tbl_kullanici where id=" + id;
            stmt.execute(query);
            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean Deletey(int id) {

        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String query = "delete from db_kirtasiye.tbl_yonetici where id=" + id;
            stmt.execute(query);
            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean Addu(Urun newUrun) {
        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();

            String query = "INSERT INTO db_kirtasiye.tbl_urun"
                    + "(urun_adi, urun_fiyat, urun_stok_adet)"
                    + "VALUES('" + newUrun.urunAdi + "','"
                    + newUrun.urunFiyati + "','" + newUrun.urunStokAdedi + "');";

            /*        String query = "INSERT INTO db_kirtasiye.tbl_kullanici" +"(ad_soyad, email, sifre,kullanici_tipi)" 
                    + VALUES('" + newk.kullaniciId + "','" + newk.kullaniciadSoyad + "','" + newk.kullaniciemail + "','"
                    + newk.kullanicisifre + "',');"; */
            stmt.execute(query);
            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public static ArrayList<Urun> urunSearch(String search) {

        ArrayList<Urun> urunList = new ArrayList<>();

        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement st = conn.createStatement();
            String query1 = "SELECT * FROM db_kirtasiye.tbl_urun WHERE urun_adi LIKE '%" + search + "%' OR urun_fiyat LIKE '%" + search + "%'";
            ResultSet rs = st.executeQuery(query1);

            while (rs.next()) {
                Urun urun = new Urun();
                urun.urunId = rs.getInt("id");
                urun.urunAdi = rs.getString("urun_adi");
                urun.urunFiyati = rs.getString("urun_fiyat");
                urun.urunStokAdedi = rs.getString("urun_stok_adet");

                urunList.add(urun);
            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        return urunList;
    }

    public static Urun SearchUrunById(int id) {

        Urun urun = null;

        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement st = conn.createStatement();
            String query1 = "SELECT * FROM db_kirtasiye.tbl_urun WHERE id=" + id + ";";
            ResultSet rs = st.executeQuery(query1);

            if (rs.next()) {
                urun = new Urun();
                urun.urunId = rs.getInt("id");
                urun.urunAdi = rs.getString("urun_adi");
                urun.urunFiyati = rs.getString("urun_fiyat");
                urun.urunStokAdedi = rs.getString("urun_stok_adet");

            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        return urun;
    }

    public static boolean Deleteu(int id) {

        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String query = "delete from db_kirtasiye.tbl_urun where id=" + id;

            stmt.execute(query);
            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public static boolean UpdateUrun(Urun newUrun) {

        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String q = "UPDATE db_kirtasiye.tbl_urun SET "
                    + "urun_adi='" + newUrun.urunAdi
                    + "',urun_fiyat='" + newUrun.urunFiyati
                    + "',urun_stok_adet='" + newUrun.urunStokAdedi
                    + "' WHERE id=" + newUrun.urunId + ";";

            stmt.executeUpdate(q);
            conn.close();
            return true;

        } catch (SQLException ex) {

            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public static ArrayList<Urun> GetUruns() {
        ArrayList<Urun> newUruns = null;
        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String query = "SELECT * FROM dB_kirtasiye.tbl_urun;";
            ResultSet rs = stmt.executeQuery(query);
            newUruns = new ArrayList<>();
            while (rs.next()) {
                Urun urun = new Urun();
                urun.urunId = rs.getInt("id");
                urun.urunAdi = rs.getString("urun_adi");
                urun.urunFiyati = rs.getString("urun_fiyat");
                urun.urunStokAdedi = rs.getString("urun_stok_adet");
                newUruns.add(urun);
            }
            conn.close();

        } catch (Exception e) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, e);
        }
        return newUruns;
    }

    public static boolean AddUrunToKullaniciById(int id_kullanici, int id_urun) {
        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String query = "INSERT INTO db_kirtasiye.tbl_urun_kullanici"
                    + "(id_kullanici, id_urun)"
                    + "VALUES(" + id_kullanici + "," + id_urun + ");";

            stmt.execute(query);
            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public static boolean DeleteUrunToKullaniciById(int id_kullanici, int id_urun) {
        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String query = "DELETE FROM db_kirtasiye.tbl_urun_kullanici WHERE id_kullanici=" + id_kullanici + " AND id_urun=" + id_urun + ";";
            stmt.execute(query);
            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public static ArrayList<Urun> GetKullaniciSelectedUrunByIdJoin(int id) {
        ArrayList<Urun> newUruns = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();
            String query = "SELECT * FROM dB_kirtasiye.tbl_urun_kullanici AS uk "
                    + "INNER JOIN dB_kirtasiye.tbl_urun AS u "
                    + "ON uk.id_urun=u.id WHERE uk.id_kullanici=" + id + ";";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Urun urun = new Urun();
                urun.urunId = rs.getInt("id");
                urun.urunAdi = rs.getString("urun_adi");
                newUruns.add(urun);
            }
            conn.close();

        } catch (Exception e) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, e);
        }
        return newUruns;
    }

    public static ArrayList<Urun> SiparisSearch(int id_kullanici) {

        ArrayList<Urun> urunList = new ArrayList<>();
     
        try {

            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement st = conn.createStatement();
            String query1 = "SELECT * FROM dB_kirtasiye.tbl_urun_kullanici AS uk INNER JOIN dB_kirtasiye.tbl_urun AS u ON uk.id_urun=u.id;" ;
            ResultSet rs = st.executeQuery(query1);

            while (rs.next()) {
                Urun urun = new Urun();
                urun.urunId = rs.getInt("id_urun");
                urun.urunAdi = rs.getString("urun_adi");
                urun.urunFiyati = rs.getString("urun_fiyat");
                urun.urunStokAdedi = rs.getString("urun_stok_adet");
                urun.urunKullaniciId = rs.getString("id_kullanici");
                urunList.add(urun);
            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(KirtasiyeDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        return urunList;
    }

}
