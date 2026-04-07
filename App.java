public class App {

    public static void main(String[] args) {
        Knoten w5 = new Knoten(5);
        Knoten w2 = new Knoten(2);
        Knoten w1 = new Knoten(1);
        Knoten w3 = new Knoten(3);
        Knoten w9 = new Knoten(9);
        Knoten w6 = new Knoten(6);
        Knoten w4 = new Knoten(4);
        Knoten w15 = new Knoten(15);
        Knoten w16 = new Knoten(16);
        Knoten w11 = new Knoten(11);
        Knoten w13 = new Knoten(13);
        Knoten w10 = new Knoten(10);

        w5.setLinke(w2);
        w2.setLinke(w1);
        w2.setRechte(w4);
        w4.setLinke(w3);

        w5.setRechte(w9);
        w9.setLinke(w6);
        w9.setRechte(w15);
        w15.setLinke(w11);
        w15.setRechte(w16);
        w11.setLinke(w10);
        w11.setRechte(w13);

        Binaerbaum<Integer> baum = new Binaerbaum<>(w5);
        //Binaerbaum<Integer>

        //baum.setWurzel(w5);

        System.out.println("Inorder: ");
        baum.ausgebenInorder();
        System.out.println("Postorder: " );
        baum.ausgebenPostorder();
        System.out.println("Preorder: ");
        baum.ausgebenPreorder();
        System.out.println("Sum: " + baum.sum(baum.getWurzel()));
        System.out.println("Knoten: " + baum.anzahl_Knoten(baum.getWurzel()));
        System.out.println("Blaetter: " + baum.anzahlBlaetter(baum.getWurzel()));
        System.out.println("Hoehe: " + baum.hoehe_(baum.getWurzel()));
        System.out.println("Tiefe: " + baum.tiefe(baum.getWurzel(),16,0));
        //System.out.println("Max: " + baum.max(baum.getWurzel()));
        //System.out.println("Min: " + baum.min(baum.getWurzel()));
        //System.out.println("Contains: " + baum.contains(baum.getWurzel(),10));


    }
}