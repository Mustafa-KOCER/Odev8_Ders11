package org.rd;

import java.util.LinkedList;

public class Departman {
    Takim_Lideri takim_lideri;
    String Departman_adi;
    LinkedList<String > IsList = new LinkedList<String >();
    LinkedList<Personel> PersonelList = new LinkedList<Personel>();

    public Departman(String Departman_adi,Takim_Lideri takim_lideri){
        this.Departman_adi = Departman_adi;
        this.takim_lideri = takim_lideri;
    }
    public Departman(){

    }

    public void Personel_Ekle( Personel personel, Departman departman){
        PersonelList.add(personel);
        System.out.println(departman.Departman_adi+" Personel Listesine eklendi: "+personel.ad+" "+personel.soyad);
    }

    public void Personel_Cikar( Personel personel,Departman departman){
        System.out.println(departman.Departman_adi+" Personel Listesinden çıkarıldı: "+personel.ad+" "+personel.soyad);
        PersonelList.remove(personel);
    }
    public void Personel_Degistir(Personel Cikarilan, Personel Eklenen,Departman departman){
        System.out.println(departman.Departman_adi+" Personeller Değişti:"+ Cikarilan.ad+"<->"+Eklenen.ad );
        PersonelList.remove(Cikarilan);
        PersonelList.add(Eklenen);
    }

    public void Personel_Listesi(){
        System.out.print(PersonelList.get(1).departman+" Personel Listesi; ");
        for(int i = 0; i < PersonelList.size(); i++){
            System.out.print(", "+PersonelList.get(i).ad+" "+PersonelList.get(i).soyad);
        }
    }

    public void Gorev_Ekle(String Gorev, Departman departman){
        System.out.println(departman.Departman_adi+" Görev Listesine eklendi: "+Gorev);
        IsList.add(Gorev);

    }
    public void Gorev_Tamamla(String Gorev, Departman departman){
        IsList.remove(Gorev);
        System.out.println(departman.Departman_adi+" Görev Listesinden tamamlanmıştır: "+ Gorev);
    }
    public void Gorev_Listesi(Departman departman){
        System.out.print(departman.Departman_adi+" Görev Listesi; ");
        for(int i = 0; i < IsList.size(); i++){
            System.out.println(", "+IsList.get(i));
        }
    }
    public void Takim_Lideri_Degistir(Takim_Lideri Yeni, Departman Departman){
        Departman.takim_lideri = Yeni;
        System.out.println("Takım Lideri Değişti!!!!");
        System.out.println(Departman.Departman_adi+" Yeni Takim Lideri; "+Yeni.lider.ad+" "+Yeni.lider.soyad);
    }

}

