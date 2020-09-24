/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat04;

import java.util.Date;
import java.util.Objects;

/**
 * Ez az osztály az Ital adatait: nevét, kiszerelését, árát és gyártási dátumát tárolja.
 * @author szila
 */
public class Ital {
    protected String nev;
    protected String kiszereles;
    private static int ar;
    protected Date gyartasiDatum;

    /**
     * Konstruktor, amelynek segítségével a név és kiszerelés adattagjának kezdőérték adható.
     * A gyártásiDátum az ital létrehozását/gyártásának idejét tárolja, amit nem paraméterként adunk át a konstruktornak,
     * hanem annak belsejében, a lefutásakor hozunk létre. Az ár statikus adattag alapértelmezett értéket kap.
     */
    public Ital(String nev, String kiszereles) { //
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.gyartasiDatum = new Date(); //
        this.ar = 10;
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public static int getAr() {
        return ar;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public static void setAr(int ar) {
        Ital.ar = ar;
    }

    /**
     * A toString metódus a feladatban adott példa alapján visszaadja az ital adatait. 
     */
    @Override
    public String toString() {
        return this.nev + ", " + this.kiszereles + ", " + this.ar + " Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
    /**
     * Equals metódus, amely akkor tekint egyenlőnek két italt, ha a nevük, kiszerelésük és az áruk is megegyezik.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        if (!Objects.equals(this.kiszereles, other.kiszereles)) {
            return false;
        }
        if (!Objects.equals(this.ar, other.ar)) {
            return false;
        }
        return true;
    }

    /**
     * Osztályszintű metódus, amely visszaadja, hogy az ital alapértelmezetten forintban értendőt ára mennyi euróba kerülne.
     * @return ár osztva a jelenlegi euro árfolyammal
     */
    public static int getArEuroban(){
        return getAr()/364;
    }

}
