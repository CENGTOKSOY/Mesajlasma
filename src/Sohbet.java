public class Sohbet {
    Mesaj[] mesajKutusu=new Mesaj[50];
    int mesajSayisi=0;

    public void mesajGonder(Mesaj msg){
        mesajKutusu[mesajSayisi++]=msg;
    }

    public void mesajlariYazdir(){
        for(int i=0;i<mesajSayisi;i++) {
            System.out.println("Mesaj->"+(i+1));
            System.out.println("Mesajı Gönderen Kişi Adı:->" + mesajKutusu[i].kimden.ad);
            System.out.println("Mesajı Gönderen Kişi Soyadı:->" + mesajKutusu[i].kimden.soyad);
            System.out.println("Mesajı Alan Kişi Ad:->" + mesajKutusu[i].kime.ad);
            System.out.println("Mesajı Alan Kişi Soyad:->" + mesajKutusu[i].kime.soyad);
            System.out.println("Mesaj Metni:->" + mesajKutusu[i].mesajMetni);
            System.out.println("Mesajı Tarihi:->" + mesajKutusu[i].tarih);
        }

    }


}
