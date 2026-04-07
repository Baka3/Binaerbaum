import java.util.LinkedList;

public class Binaerbaum <T extends Number & Comparable<T>>{

    private Knoten<T> wurzel;

    public Binaerbaum(){
    }
    public Binaerbaum(Knoten<T> pWurzel){
        this.wurzel = pWurzel;
    }

    public boolean istLeer(){
        if (wurzel==null){
            return true;
        }
        else{
            return false;
        }
    }
        public int anzahl_Knoten(Knoten<T> pWurzel){
            if (pWurzel == null){
                return 0;
            }
            else{
                return 1 + anzahl_Knoten(pWurzel.getLinke()) + anzahl_Knoten(pWurzel.getRechte());
            }
            }
    public int anzahlBlaetter(Knoten<T> pWurzel){ //lezte
        if(pWurzel == null){
            return 0;
        }
        else if(pWurzel.getLinke() == null && pWurzel.getRechte() == null){
            return +1;
        }
        else{
            return anzahlBlaetter(pWurzel.getLinke()) + anzahlBlaetter(pWurzel.getRechte());
        }
    }
    //public Binaerbaum <T> a = new Binaerbaum<>(wurzel);

    public int tiefe(Knoten<T> k, T x, int aktuelleTiefe){
    if(k == null) return -1;   // значення не знайдено

    if(k.getInhalt().equals(x)){
        return aktuelleTiefe;
    }

    // шукаємо вліво
    int links = tiefe(k.getLinke(), x, aktuelleTiefe + 1);
    if(links != -1){
        return links;
    }

    // шукаємо вправо
    return tiefe(k.getRechte(), x, aktuelleTiefe + 1);
}

    public int hoehe(Knoten<T> pWurzel){
        if(pWurzel == null){
            return 0;
        }
        else{
            return 1 + Math.max(hoehe(pWurzel.getLinke()), hoehe(pWurzel.getRechte()));
        }
        
    }
    /*public int hoehe(Knoten<T> pWurzel){
    if (pWurzel == null) {
        return -1;   // немає навіть вузла → немає ребер
    }
    return 1 + Math.max(
        hoehe(pWurzel.getLinke()),
        hoehe(pWurzel.getRechte())
    );
}*/
 public int hoehe_ (Knoten<T> pWurzel){
    if (pWurzel == null) {
        return -1;   // немає навіть вузла → немає ребер
    }
    return 1 + Math.max(
        hoehe_(pWurzel.getLinke()),
        hoehe_(pWurzel.getRechte())
    );
}

    public int sum(Knoten<T> pWurzel){
        if (pWurzel == null){
            return 0;
        }
        else{
            //return pWurzel.getInhalt() + sum(pWurzel.getLinke()) + sum(pWurzel.getRechte());
            return pWurzel.getInhalt().intValue() + sum(pWurzel.getLinke()) + sum(pWurzel.getRechte());
        }
    }
/* 
    /* public boolean contains(int x){
    return contains(wurzel, x);
    } */

    /*public boolean contains(Knoten<T> k, int x){
        if(k == null) return false;
        if(k.getInhalt().intValue() == x) return true;

    return contains(k.getLinke(), x) || contains(k.getRechte(), x);
    }

    /*public int max(){
    return max(wurzel);
    }

    int max(Knoten<Integer> k){
    if(k == null) return 0;

    int m = k.getInhalt();
    m = Math.max(m, max(k.getLinke()));
    m = Math.max(m, max(k.getRechte()));

    return m;
    }

    public int max(){
    return max(wurzel);
}*/
/*
public int max(Knoten<T> k){
    if(k == null){
        // Порожній вузол – повертаємо найменше можливе число
        return Integer.MIN_VALUE;
    }

    T maxWert = k.getInhalt();

    // Перевіряємо ліве піддерево
    T linksMax = max(k.getLinke());
    if(linksMax > maxWert){
        maxWert = linksMax;
    }

    // Перевіряємо праве піддерево
    T rechtsMax = max(k.getRechte());
    if(rechtsMax > maxWert){
        maxWert = rechtsMax;
    }

    return maxWert;
}
*/

    /*public int min(){
    return min(wurzel);
    }

    public int min(Knoten<Integer> k){
    if(k == null) return Integer.MAX_VALUE;

    int m = k.getInhalt();
    m = Math.min(m, min(k.getLinke()));
    m = Math.min(m, min(k.getRechte()));

    return m;
    }*/
/* 
public int min(Knoten<T> k){
    if(k == null){
        // Порожній вузол – повертаємо найбільше можливе число
        return Integer.MAX_VALUE;
    }

    T minWert = k.getInhalt();

    // Ліве піддерево
    int linksMin = min(k.getLinke());
    if(linksMin.compareTo(minWert) < 0){
        minWert = linksMin;
    }

    // Праве піддерево
    T rechtsMin = min(k.getRechte());
    if(rechtsMin.compareTo(minWert) < 0){
        minWert = rechtsMin;
    }

    return minWert;
}
*/


/* public void einfuegen(int x){
    if(wurzel == null){
        wurzel = new Knoten<>(x);
    }
    else{
        einfuegen(wurzel, x);
    }
} */
/* 
public void einfuegen(Knoten<T> k, T x){ // ми хочемо додати значення х (НЕ вузол. його ще нема)
    if(wurzel == null){
        wurzel = new Knoten<>(x);
    }
    if(k.getLinke() == null){
        k.setLinke(new Knoten<>(x));
        return;
    }
    if(k.getRechte() == null){
        k.setRechte(new Knoten<>(x));
        return;
    }

    // якщо обидва зайняті, ліземо вліво
    einfuegen(k.getLinke(), x);
}

*/

    public void ausgebenInorder(){
        if(!istLeer()){
        wurzel.inorder();
        }
    }
    public void ausgebenPreorder(){
        if (!istLeer()){
            wurzel.preorder();
        }
    }
    public void ausgebenPostorder(){
        if (!istLeer()){
            wurzel.postorder();
        } 
    }

    public Knoten<T> getWurzel() {
        return wurzel;
    }
    public void setWurzel(Knoten<T> wurzel) {
        this.wurzel = wurzel;
    }
}