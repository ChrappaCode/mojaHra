package sk.stuba.fei.uim.oop;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hrac {

    private final String meno;
    private int peniaze;
    private int level;
    private int depresion = 1000;
    private int dmg = 0;
    private int rage = 0;
    private List<Item> inventar;

    public Hrac(String name){

        this.meno = name;
        this.level = 1;
        this.peniaze = 1000;
        this.inventar = new ArrayList<>();

    }

    public void disp (){

        if(this.depresion > 1050 && this.rage > 10){
            lvlUp();
        }

        System.out.println("meno: " + this.meno);
        System.out.println("peniaze: " + this.peniaze + "$");
        System.out.println("level: " + this.level);
        System.out.println("dmg: " + this.dmg);
        System.out.println("depresia: " + this.depresion);
        System.out.println("rage: " + this.rage + "%");

    }

    public void precPeniaze(int kolko){

        this.peniaze -= kolko;

    }

    public void dajPeniaze(int kolko){

        this.peniaze += kolko;

    }

    public void lvlUp(){

        this.level++;
        this.depresion /= 2;
        this.rage /= 3;


    }

    public void ziskalItem(Item item){

        this.inventar.add(item);
        this.dmg += item.dmg / 10 ;

    }

    public void showInventar(){

        System.out.println("inventar: ");

        for (Item s : inventar) {
            System.out.println(s.meno);
        }

    }

    public void mojaDepresia(){

        for (Item s : inventar) {

            if(s.meno.equals("Afk support")){

                this.depresion += 100;
                this.rage += 50;

            }

        }

    }



}
