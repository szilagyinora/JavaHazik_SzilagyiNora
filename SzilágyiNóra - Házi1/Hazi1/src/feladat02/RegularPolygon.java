/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat02;

/**
 * Ez az osztály egy n oldalú szabályos sokszöget kíván modellezni.
 * Megadja a szabályos sokszög oldalainak számát; hosszát; középpontjának x és y koordinátáját.
 * Tartalmaz továbbá beállító és lekérdező metódusokat, illetve megadja a sokszög kerületét és területét;
 * ezt követően kiíratja a sokszöget toString metódussal.
 * @author szila
 */
public class RegularPolygon {
    
    private int n;
    private double side;
    private double x;
    private double y;
    
    
    /**
     * Paraméter nélküli konstruktor, amely egy szabályos sokszöget hoz létre 
     * alapértelmezett értékekkel, a sokszög középpontját a (0, 0) pontba helyezi.
     */
    public RegularPolygon(){
        this.n=3;
        this.side=1;
        this.x=0;
        this.y=0;
    }
    
    
    /**
     * Konstruktor, amely a megadott oldalszámmal és oldalhosszal hoz létre egy szabályos sokszöget, 
     * amelynek a középpontját a (0, 0) pontba helyezi.
     */
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }
    
    
    /**
     * Konstruktor, amely a megadott oldalszámmal, oldalhosszal, x- és y koordinátákkal 
     * létrehoz egy szabályos sokszöget.
     */
    public RegularPolygon(int n, double side, double x, double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    /**
     * Lekérdezzük a sokszög kerületét.
     * @return oldalainak száma * oldal hossza
     */
    public double getPerimeter()
    {
       return this.n * this.side;
    }
    
    
    /**
     * Lekérdezzük a szabályos sokszög területét.
     * @return (n * side^2) / 4 * tan(PI * n)
     */
    public double getArea()
    {
        return (this.n*Math.pow(this.side, 2))/(4*Math.tan(Math.PI/this.n));
    } // Math.pow: hatványozás
    
    
    /**
     * Kiíratjuk a sokszöget toString metódus segítségével.
     */
    @Override
    public String toString() {
        return "RegularPolygon:" + "\n oldalainak szama: " + this.n + "\n oldala hossza: " + this.side + "\n x es y koordinataja: " + this.x + " ; " + this.y;
    }
    
    
}
