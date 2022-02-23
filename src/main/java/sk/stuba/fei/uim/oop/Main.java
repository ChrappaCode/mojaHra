package sk.stuba.fei.uim.oop;


public class Main {
    public static void main(String[] args) {

        Hrac jedna = new Hrac("Dusan Cinkota");
        jedna.disp();

        jedna.precPeniaze(250);
        System.out.println();
        jedna.disp();

        System.out.println();
        jedna.disp();

        Item item1 = new Item();
        item1.newItem("Afk support" , 10);
        Item item2 = new Item();
        item2.newItem("Op support" , 100);

        System.out.println();
        jedna.ziskalItem(item1);
        jedna.ziskalItem(item2);

        jedna.disp();
        System.out.println();
        jedna.showInventar();

        jedna.mojaDepresia();
        System.out.println();
        jedna.disp();


    }
}
