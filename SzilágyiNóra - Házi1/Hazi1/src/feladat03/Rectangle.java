/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat03;

/**
 * Ez az osztály egy téglalapot kíván reprezentálni.
 * Modellezi a téglalap szélességét és magasságát alapértelmezett értékekkel,
 * lekérdezi a téglalap kerületét és területét, majd kiíratja azokat.
 * @author szila
 */
public class Rectangle {
    public double width;
    public double height;
    
    /**
     * Paraméter nélküli konstruktor, amely egy alapértelmezett téglalapot hoz létre.
     */
    public Rectangle()
    {
        this.height=1;
        this.width=1;
    }
    
    /**
     * Konstruktor, amely megadott width és height értékekkel hoz létre egy téglalapot.
     */
    public Rectangle(double w, double h)
    {
        this.height=h;
        this.width=w;
    }
    
    /**
     * Lekérdezés, amely az aktuális téglalap területének az értékét adja vissza.
     * @return magasság * szélesség
     */
    public double getArea()
    {
        return this.height*this.width;
    }
    
    /**
     * Lekérdezés, amely az aktuális téglalap kerületének az értékét adja vissza.
     * @return 2 * (magasság + szélesség)
     */
    public double getPerimeter()
    {
        return 2*(this.height+this.width);
    }

    /**
     * A toString metódus segítségével kiíratjuk a téglalap adatait.
     * @return 
     */
    @Override
    public String toString() {
        return " teglalap adatai" + "\nszelessege: " + this.width + "\nhosszusaga: " + height + 
                "\nterulete: " + getArea() + "\nkerulete: " + getPerimeter() + "\n";
    }
    
    
}
