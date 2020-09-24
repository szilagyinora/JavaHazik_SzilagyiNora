/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat06;

/**
 * Ezt a LinearEquation osztályt egy 2×2-es lineáris egyenletrendszerhez hoztuk létre.
 * @author szila
 */
public class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }
    
    /**
     * Olyan metódus, amely igaz értéket ad vissza, ha ad-bc nem egyenlő 0-val, különben hamis.
     * @return 
     */
    public boolean isSolvable(){
    if ((this.a*this.d-this.b*this.c) != 0) {
        return true;
    }
    else
        return false;
    }
    
    
    /**
     * Olyan metódus, amely a feladatban megadott X egyenletrendszer megoldását adja vissza.
     * @return (ed-bf) / (ad-bc)
     */
    public double getX(){
        return ((this.e*this.d - this.b*this.f) / (this.a*this.d - this.b*this.c));
    }
    
    /**
     * Olyan metódus, amely a feladatban megadott Y egyenletrendszer megoldását adja vissza.
     * @return (af-ec) / (ad-bc)
     */
    public double getY(){
        return ((this.a*this.f - this.e*this.c) / (this.a*this.d - this.b*this.c));
    }

    /**
     * Az osztály sztring reprezentációja, amely hogyha ad - bc értéke 0, 
     * kiírja a „The equation has no solution.” üzenetet, különben visszaadja nekünk
     * az X és Y értékét.
     * @return 
     */
    @Override
    public String toString() {
        if ((this.a*this.d - this.b*this.c) == 0){
            return "The equation has no solution.";
        }
        else
            return "X = " + getX() + " és Y = " + getY();
    }
    
    
    
} 

