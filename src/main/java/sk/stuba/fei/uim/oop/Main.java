package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {

        Hrac jedna = new Hrac();
        jedna.inicializacia(1000,5,"Dusan Cinkota");
        jedna.disp();

        jedna.precPeniaze(250);
        System.out.println();
        jedna.disp();
    }
}
