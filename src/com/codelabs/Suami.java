package com.codelabs;

/**
 * Created by adammb on 7/30/16.
 */
public class Suami {
    private static Suami suami = null;
    private String namaIstri;

    public String getNamaIstri() {
        return namaIstri;
    }

    public void setNamaIstri(String namaIstri) {
        this.namaIstri = namaIstri;
    }

    private Suami(){
        System.out.println("Halo, saya suami kamu");
    }

    private static Suami getSuami(){
        if(suami==null)
            suami=new Suami();

        return suami;
    }

    public void katakanSesuatu(){
        System.out.println("Mau dibelikan baju warna apa dek "+namaIstri+"?");
    }
}
