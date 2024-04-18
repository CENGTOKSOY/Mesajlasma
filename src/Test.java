public class Test {
    private static String[] args;

    public static void main(String[] args) {
        Test.args = args;
        Sohbet sohbet=new Sohbet();
        Kisi kisi1=new Kisi("ALİ","ASLAN","BANKACI");
        Kisi kisi2=new Kisi("Mehmet","Tercan","Avukat");
        Kisi kisi3=new Kisi("Aylin","Yılmaz","Doktor");
        Kisi kisi4=new Kisi("Canan","Yıldız","İşçi");

        Mesaj msg1=new Mesaj("İyiyim Sen Nasılsın?",kisi2,kisi1,"21.03.2024");
        Mesaj msg2=new Mesaj("Bugün saat 18.00 de toplanalım",kisi4,kisi3,"21.03.2024");
        Mesaj msg3=new Mesaj("Toplantı İptal edildi",kisi3,kisi1,"21.03.2024");

        sohbet.mesajGonder(msg1);
        sohbet.mesajGonder(msg2);
        sohbet.mesajGonder(msg3);
        sohbet.mesajlariYazdir();

    }
}
