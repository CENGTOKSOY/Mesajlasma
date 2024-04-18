# Sohbet Uygulaması

Bu uygulama, bir sohbet kutusu oluşturmak için Java sınıflarını içerir. Sohbet kutusu, mesajları gönderen ve alan kişileri takip eder.

## Kullanım

1. `Test` sınıfının `main` metodu, sohbeti başlatır.
2. `Kisi` sınıfı, kişilerin ad, soyad ve meslek bilgilerini içerir.
3. `Mesaj` sınıfı, mesaj metni, gönderen ve alan kişileri ve tarihi içerir.
4. `Sohbet` sınıfı, mesajları saklar ve yazdırır.

## Örnek Kullanım

```java
public class Test {
    public static void main(String[] args) {
        Sohbet sohbet = new Sohbet();

        Kisi kisi1 = new Kisi("ALİ", "ASLAN", "BANKACI");
        Kisi kisi2 = new Kisi("Mehmet", "Tercan", "Avukat");
        Kisi kisi3 = new Kisi("Aylin", "Yılmaz", "Doktor");
        Kisi kisi4 = new Kisi("Canan", "Yıldız", "İşçi");

        Mesaj msg1 = new Mesaj("İyiyim Sen Nasılsın?", kisi2, kisi1, "21.03.2024");
        Mesaj msg2 = new Mesaj("Bugün saat 18.00'de toplanalım", kisi4, kisi3, "21.03.2024");
        Mesaj msg3 = new Mesaj("Toplantı iptal edildi", kisi3, kisi1, "21.03.2024");

        sohbet.mesajGonder(msg1);
        sohbet.mesajGonder(msg2);
        sohbet.mesajGonder(msg3);

        sohbet.mesajlariYazdir();
    }
}
