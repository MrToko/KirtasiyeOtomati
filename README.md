# Kırtasiye Otomatı Projesi

Bu proje, **Java Swing** ile geliştirilen bir kırtasiye otomatıdır. Kullanıcılar ve yöneticiler için ayrı paneller sunar. Kullanıcılar, otomat üzerinden kırtasiye ürünlerini seçebilir, sepetlerine ekleyebilir ve satın alabilirler. Ayrıca kullanıcılar, sisteme kayıt olabilir ve giriş yapabilirler. Yönetici paneli ise ürün yönetimi, kullanıcı işlemleri ve sistem raporlarını içerir. Proje, MySQL Workbench ile veri yönetimi sağlamakta olup, kullanıcılar ve ürünler gibi veriler veritabanında saklanmaktadır.


## Özellikler

- **Kullanıcı Paneli**:
  - Ürün listeleme ve ürün seçimi
  - Sepet yönetimi
  - Kullanıcı kaydı ve giriş işlemleri
  - Satın alma işlemleri
  - Regex Kontrolü: Giriş sırasında, kullanıcıların e-posta adresleri gmail.com veya hotmail.com uzantılı olup olmadığı regex ile kontrol edilir. Bu sayede geçerli e-posta formatı doğrulanır.
- **Yönetici Paneli**:
  - Ürün ekleme, güncelleme ve silme
  - Kullanıcı yönetimi
  - Satış raporları ve sistem izleme

- **Veritabanı Desteği**:
  - MySQL Workbench kullanılarak kullanıcılar ve ürünler gibi veriler depolanır.
  - Kullanıcı ve ürün bilgileri dinamik olarak veritabanına bağlanır.
  - Veritabanı bağlantısı için JDBC kullanılır.

- **Java Swing GUI**:
  - Kullanıcı dostu bir grafik arayüzü.
  - Sistem, masaüstü uygulaması olarak geliştirilmiştir ve Java Swing kullanılarak görsel tasarım yapılmıştır.

## Gereksinimler

- **Java JDK** (Java 8 veya üzeri)
- **MySQL Workbench** (Veritabanı yönetimi için)
- **Eclipse veya IntelliJ IDEA** (IDE tercihinize göre)
- **MySQL Bağlantı Kitaplıkları** (JDBC)
