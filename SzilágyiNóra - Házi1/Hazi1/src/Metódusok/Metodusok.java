/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metódusok;

import java.util.Arrays;

/**
 * Az osztály 14 db statikus metódust tartalmaz, amik meghívhatók a main függvényünkben.
 * @author szila
 */
public class Metodusok {

    //1
    /**
     * Az Arrays rendező segítségével a számokat tömbbe tesszük és növekvő sorrendben adjuk vissza.
     */
    public static void novekvoSorrend(int a, int b, int c) {
        int[] array = {a,b,c};
        Arrays.sort(array);
        System.out.println("1. feladat: " + Arrays.toString(array));
    }
    
    
    //2
    /**
     * Az Arrays rendező segítségével a számokat tömbbe tesszük, majd for ciklus segítségével 
     * megvizsgáljuk a tömböt, és if-fel megkeressük a legkisebb értéket, illetve a számok 
     * abszolutértékei közül a legnagyobbat; ezeket kiíratjuk.
     */
    public static void minAbszolutMax(double a, double b, double c){
        double[] array = {a,b,c};
        
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
            min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > max ) {
                max = Math.abs(array[i]);
            }
        }
        System.out.println("\n2. feladat: minimum: " + min + ", abszolútérték maximuma:" + max);
        }
    
    
    //3
    /**
     * Az eljárás 4 db valós számot ír ki 3 féleképpen.
     * Először az adott sorrendben, majd ha d >= 0, az a, c, b, d sorrendben, 
     * egyébként az a, b, d, c sorrendben.
     */
    public static void sorrend(double a, double b, double c, double d){
        System.out.println("\n3. feladat:\n"+a+", "+b+", "+c+", "+", "+d);
        if (d >= 0) {
            System.out.println(a+", "+c+", "+b+", "+d);
        }
        else
            System.out.println(a+", "+b+", "+d+", "+c);
    }
   

    //4
    /**
     * Ebben a metódusban három szigorúan pozitív valós számot adunk meg, amelyek
     * egy háromszög oldalait képeznék. A metódus, amely paraméterként megkapja ezeket 
     * a számokat és eldönti, hogy képezhetik-e ezek a számok egy háromszög oldalait.
     * (A háromszög bármely oldalának hossza kisebb a másik két oldal hosszának összegénél!)
     */
    public static boolean haromszog(double a, double b, double c){
        if (a<=0 || b<=0 || c<=0) {
            return false;
        }
        else if ((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        }
        else
            return false;
    }
    
    
    //5
    /**
     * Ez a metódus visszaadja, hogy hány szökőév volt/lesz két különböző évszám között.
     */
    public static void szokoev(int a, int b){
        int db=0;
        for (int i=a; i<=b; i++){
            if((i%4==0 && i%100!= 0) || i%400==0) {
                db++;
            }
        }
        System.out.println("\n5. feladat: " +db+ " db szökőév volt a két évszám között.");
    }
    
    
    //6
    /**
     * Ez a metódus visszaad egy érdemjegyet az alapján, mit adunk meg paraméternek.
     * Ha a case közül valamelyik érték megegyezik a paraméterünkkel, akkor annak az utasítása hajtódik végre.
     * Más esetben kiírja, hogy "Nem létezik ilyen érdemjegy."
     */
    public static void erdemjegy(int e){

        switch(e){
            case 1 : System.out.println("\n6. feladat: Elégtelen"); break;
            case 2 : System.out.println("\n6. feladat: Elégséges"); break;
            case 3 : System.out.println("\n6. feladat: Közepes"); break;
            case 4 : System.out.println("\n6. feladat: Jó"); break;
            case 5 : System.out.println("\n6. feladat: Kiváló"); break;
            default : System.out.println("\n6. feladat: Nem létezik ilyen érdemjegy.");
        }   
    }
    
    
    //7
    /**
     *  Ez a metódus kiszámítja két természetes szám egész hányadosát adott minta alapján, majd kiírja azt.
     */
    public static void Osztas(int a, int b){
        int hanyados = 0;
        do {
         hanyados = hanyados + 1;
         a = a-b;
        } while (a>=b);
        System.out.println("\n7. feladat: a hányados " + hanyados);
    }
    
    
    //8
    /**
     * Az algoritmusunk eldönti, hogy az adott n nullától különböző természetes számunk prímszám-e vagy sem.
     * Egy szám akkor prím, ha pontosan két osztója van: 1 és önmaga.
     * Az algoritmus megszámolja az adott szám osztóit, elosztva ezt sorban minden számmal 1-től n-ig.
     * A döntésnek megfelelő üzenetet az osztók száma alapján írjuk ki.
     */
    public static void Prím_1(int n){
    
    }
    
    public static void Prím_2(int n){
        
    }
    
    //9
    /**
     * Ez a metódus generálja és kiírja egyenként a Fibonacci-sorozat első n elemét, 
     * amelyeket három változó segítségével állapít meg.
    **/
    
    public static void Fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = a+b;
        
        System.out.print("\n9. feladat: ");
        if(n==1){
            System.out.print(a + ", ");
        }
        else if(n==2){
            System.out.print(a + ", " + b + ", ");
        }
        else{
            c = a+b;
            System.out.print(a + ", " + b + ", " + c + ", ");
        }
        
        int k = 3;
        do{
            a=b;
            b=c;
            c=a+b;
        System.out.print(c + ", ");
        k=k+1;
        }while (k<n);
        System.out.println("");
    }
    
    //10
    /**
     * Adott az n természetes szám, amelynek legfeljebb 9 számjegye van.
     * A metódussal létrehozzuk és kiírjuk azt a számot, amely az eredeti szám számjegyeit fordított sorrendben tartalmazza.
     * Az ujszam kezdőértéke 0.
     */
    public static void ujszam(int n, int ujszam){
        do {
            ujszam = ujszam * 10 + n%10;
            n /= 10;
        } while(n!=0);
        
        System.out.println("\n10. feladat: " + ujszam);
    }
    
    //11
    /**
     *  Ez a metódus paraméterként kap egy 0 és 12 közötti egész számot és visszaadja annak faktoriálisát.
     */
    public static void faktorialis(int n){
        long a=1;
        for (int i=0; i<n; i++) {
            a *= n;
        }
        System.out.println("\n11. feladat: " + a);
    }
    
    //12
    /**
     * Ez a metódus megtalálja és kiírja az összes k-val osztható számot, amelyek 
     * két adott szám (n1 és n2) között találhatók.
     */
    public static void oszthato(int k, int n1, int n2){
    
        System.out.print("\n12. feladat:");
        for(int i=n1; i<=n2; i++){
            if(i%k==0){
                System.out.print(i + ", ");
            }
        }
        System.out.print("\n");
    }
    
    //13
    /**
     * Ez a metódus megkeresi azt a legkisebb Fibonacci-számot, amely nagyobb mint egy adott n szám. 
     * Az n számot paraméterként adjuk át, az eredményt visszatérítési értékként.
     */
    public static int fib(int n){
        int a = 0;
        int b = 1;
        int fi = 1;
    
        for (int i=1; i<n+100; i++) {
            fi=a+b;
            if(fi>n){
                break;
            }
        a = b;
        b = fi;
        }
        return fi;
     }
    
    
    //14
    /**
     * Ez a metódus megkeresi azokat az 1000-nél kisebb számokat, amelyek egyenlők 
     * számjegyeik köbének összegével, majd kiírja ezeket a standard kimenetre.
     * Megvizsgáljuk for cklussal az összes 1000 alatti számot, majd if-fel megnézzük, 
     * hogy helyiértékenként a számjegyeiket 3. hatványra emelve összegük maga 
     * a teljes szám értékét adja-e vissza. Ha igen, akkor kiíratjuk őket.
     */
    public static void kisebbMint1000(){
    
        System.out.print("\n14. feladat: ");
        for(int i=0; i<1000; i++) {
            int szam = i;
            
            int szazasok = szam/100;
            szam = szam-(szazasok * 100);
            
            int tizesek = szam/10;
            szam = szam-(tizesek * 10);
            
            int egyesek=szam;
            
            if((Math.pow(egyesek, 3) + Math.pow(tizesek, 3) + Math.pow(szazasok, 3))== i)
                System.out.print(i + ", ");
            }
        System.out.println("\n ");
    }
    
    
    /**
     * Ebben a main függvényben tudjuk meghívni az elkészített statikus metódusainkat.
     * Az eljárások azon értékekkel számolnak, amiket megadunk paraméterként.
     */
    public static void main(String[] args) {
        novekvoSorrend(265,192,540);
        minAbszolutMax(41,-23,-156);
        sorrend(5,2.6,-7,4.8);
        haromszog(2.3,5.2,4);
        szokoev(1996,2020);
        erdemjegy(5);
        Osztas(125,5);
        Fibonacci(12);
        ujszam(321,0);
        faktorialis(5);
        oszthato(4,4,24);
        fib(47);
        kisebbMint1000();
    }
}
