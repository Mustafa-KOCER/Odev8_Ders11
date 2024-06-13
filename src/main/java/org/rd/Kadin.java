package org.rd;

class Kadin extends Personel {

    public Kadin(String ad, String soyad, int yas, String departman){
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.departman = departman;
    }
    @Override
    void emeklilik_kontrol() {
        if(this.yas >= 60){
            System.out.println("Emekli olabilir");
        }
        else {
            System.out.println("Emekli olması kalan yıl:  "+(60-this.yas));
        }
    }
}
