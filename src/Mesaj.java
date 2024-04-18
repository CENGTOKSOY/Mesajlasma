public class Mesaj {
    String mesajMetni;
    Kisi kimden,kime;
    String tarih;
      public Mesaj(String mesajMetni, Kisi kimden, Kisi kime, String tarih) {
        this.mesajMetni = mesajMetni;
        this.kimden = kimden;
        this.kime = kime;
        this.tarih = tarih;
    }
}
