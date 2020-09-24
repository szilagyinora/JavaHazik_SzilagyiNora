/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat05;

/**
 * Ez az osztály a valós világbeli másodfokú egyenleteket kívánja modellezni.
 * Megadja az egyenlet diszkriminánsát, gyökeit és sztring reprezentációját.
 * @author szila
 */
public class QuadraticEquation {
    
    private double a; //másodfokú egyenletnél double
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    /**
     * Olyan metódus, ami visszaadja diszkrimináns értékét. 
     * @return b^2 - 4ac
     */
    public double getDiscriminant(){
        return Math.pow(b, 2) - 4*this.a*this.c;
    } // Math.pow: hatványozás
    
    
    /**
     * Visszaadja a másodfokú egyenlet egyik gyökét, ha a diszkrimináns nem negatív.
     * Ha a diszkrimináns negatív, egy üzenetet ír ki erről tájékoztatva a felhasználót,
     * és visszaad egy 0 értéket is.
     * @return a másodfokú egyenlet első gyöke: (-b + sqrt(diszkrimináns))/2a
     */
    public double getRoot1(){
        if(this.getDiscriminant()<0){
            System.out.println("Negativ diszkriminans, nincs valos gyok");
        return 0;
        }
        else
            return (-this.b + Math.sqrt(this.getDiscriminant()))/(2*this.a);
    } // Math.sqrt: gyökvonás
    
    
    /**
     * Visszaadja a másodfokú egyenlet másik gyökét, ha a diszkrimináns nem negatív.
     * Ha a diszkrimináns negatív, egy üzenetet ír ki erről tájékoztatva a felhasználót,
     * és visszaad egy 0 értéket is.
     * @return a másodfokú egyenlet második gyöke: (-b - sqrt(diszkrimináns))/2a
     */
    public double getRoot2(){
        if(this.getDiscriminant()<0){
            System.out.println("\nNegatív diszkrimináns, nincs valós gyök");
        return 0;
        }
        else
        return (-this.b - Math.sqrt(this.getDiscriminant()))/(2*this.a);    
    } //statikus metódus

    
    /**
     * Az osztály sztring reprezentációját adja vissza.
     * Ha a diszkrimináns pozitív, kiírja a 2 gyököt. 
     * Ha a diszkrimináns 0, kiírja a (közös) gyököt.
     * Egyébként írja ki a „The equation has no roots.” üzenetet.
     * @return 
     */
    @Override
    public String toString() {
        if (getDiscriminant() > 0) {
            return "Első gyök: " + getRoot1() + "\nMásodik gyök: " + getRoot2();       
        }
        else if (getDiscriminant() == 0) {
             return "első gyök = második gyök = " + getRoot1();
        }
        else
            
               return "The equation has no roots.";
    }  
    
}
