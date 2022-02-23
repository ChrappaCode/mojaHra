package sk.stuba.fei.uim.oop;

public class Hrac {

    String meno;
    int peniaze;
    int level;

    public void inicializacia(int money , int lvl , String name){

        this.meno = name;
        this.level = lvl;
        this.peniaze = money;

    }

    public void disp (){

        System.out.println("meno: " + this.meno);
        System.out.println("peniaze: " + this.peniaze + "$");
        System.out.println("level: " + this.level);

    }

    public void precPeniaze(int kolko){

        this.peniaze -= kolko;

    }

    public void dajPeniaze(int kolko){

        this.peniaze += kolko;

    }

}
