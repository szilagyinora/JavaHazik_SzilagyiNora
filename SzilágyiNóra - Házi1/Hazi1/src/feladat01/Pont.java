/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat01;

/**
 * Ebben az osztályban egy kétdimenziós pontot szeretnénk modellezni,
 * itt a pont két koordinátáját (x,y) fogjuk tárolni, illetve a pont életre keltésére
 * szolgáló konstruktort, amivel be tudjuk állítani létrehozáskor a két koordinátát.
 * Ezután megírjuk a 2 koordinátához a beállító és lekérdező metódusokat.
 * @author szila
 */
public class Pont {
        
    private double x;
    private double y;
    
    public Pont(){
        this.x=x;
        this.y=y;
    }
    
    public Pont(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public void setX(double x){
        this.x=x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public void setY(double y){
        this.y=y;
    }
    
}
