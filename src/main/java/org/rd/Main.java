package org.rd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Erkek Personel_1 = new Erkek("Mustafa","OZKAN",40,"IT");
        Kadin Personel_2 = new Kadin("Ayşe","FATMA",20,"IT");
        Kadin Personel_3 = new Kadin("Kara","SENER",30,"IT");
        Erkek Personel_4 = new Erkek("Batu","DENIZ",40,"IT");

        Erkek Personel_5 = new Erkek("Batı","KUZEY",50,"IK");
        Erkek Personel_6 = new Erkek("Güney","DOGU",70,"IK");
        Kadin Personel_7 = new Kadin("Hayriye","FUAT",20,"IK");
        Kadin Personel_8 = new Kadin("ECE","UGUR",20,"IK");

        Takim_Lideri Lider_1 = new Takim_Lideri("IT", Personel_1);

        Departman IT = new Departman("IT", Lider_1);

        IT.Personel_Ekle(Personel_1,IT);
        IT.Personel_Ekle(Personel_2,IT);
        IT.Personel_Ekle(Personel_4,IT);


        IT.takim_lideri = Lider_1;

        IT.Personel_Degistir(Personel_2,Personel_3,IT);
        IT.Personel_Cikar(Personel_4,IT);

        IT.Personel_Listesi();

        IT.takim_lideri.Takim_Lideri_Cagir();

        Takim_Lideri Lider_3 = new Takim_Lideri("IT", Personel_3);
        IT.Takim_Lideri_Degistir(Lider_3,IT);
        IT.takim_lideri.Takim_Lideri_Cagir();

        IT.Gorev_Ekle("GOREV1",IT);
        IT.Gorev_Ekle("GOREV2",IT);
        IT.Gorev_Tamamla("GOREV1", IT);
        IT.Gorev_Listesi(IT);

        System.out.println("\n***************************************************\n");

        Takim_Lideri Lider_2 = new Takim_Lideri("IK",Personel_5);

        Departman IK = new Departman("IK", Lider_2);

        IK.Personel_Ekle(Personel_5,IK);
        IK.Personel_Ekle(Personel_6,IK);
        IK.Personel_Ekle(Personel_8,IK);

        IK.takim_lideri = Lider_2;

        IK.Personel_Degistir(Personel_6,Personel_7,IK);
        IK.Personel_Cikar(Personel_8,IK);

        IK.Personel_Listesi();

        IK.takim_lideri.Takim_Lideri_Cagir();

        IK.Gorev_Ekle("GOREV11",IK);
        IK.Gorev_Ekle("GOREV2",IK);
        IK.Gorev_Tamamla("GOREV11", IK);
        IK.Gorev_Listesi(IK);

    }
}