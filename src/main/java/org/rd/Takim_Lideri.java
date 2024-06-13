package org.rd;

class Takim_Lideri extends Departman{
    String  departmani;
    Personel lider;

    public  Takim_Lideri (String departman, Personel personel){
        lider = personel;
        lider.takim_lideri = true;
        departmani = departman;
    }

    public void Takim_Lideri_Cagir (){
        System.out.println("\n"+lider.departman +" Takım Lideri: "+lider.ad+" "+lider.soyad);

    }

}