package org.rd;

class Erkek extends Personel {

    public Erkek(String ad, String soyad, int yas, String departman){
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.departman = departman;
    }

    @Override
    void emeklilik_kontrol() {
        if(this.yas >= 65){
            System.out.println("Emekli olabilir");
        }
        else {
            System.out.println("Emekli olması kalan yıl:  "+(65-this.yas));
        }
    }
}
