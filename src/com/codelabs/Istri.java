package com.codelabs;

/**
 * Created by adammb on 7/30/16.
 */
public class Istri {
    private static Istri istri=null;

    public String getNamaSuami() {
        return namaSuami;
    }

    public void setNamaSuami(String namaSuami) {
        this.namaSuami = namaSuami;
    }

    private String namaSuami;

    private Istri(){
        System.out.println("Halo, saya istri kamu!");
    }

    public static synchronized Istri getIstri(){
        if(istri==null)
            istri=new Istri();

        return istri;
    }

    public void katakanSesuatu(){
        System.out.println("Mau dibuatkan masakan apa mas "+namaSuami+"?");
    }
}
