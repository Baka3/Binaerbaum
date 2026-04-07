public class Knoten<T> {
    private T inhalt;
    private Knoten<T> linke; //kleiner
    private Knoten<T> rechte; //größer

    public Knoten (T pInhalt){
        this.inhalt = pInhalt;
        this.linke = null;
        this.rechte = null;
    }

    public boolean istBlattknote(){
        if (getLinke() == null && getRechte() == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void inorder(){ //LWR
        if(getLinke()!=null){
            getLinke().inorder();
        }
        System.out.println(getInhalt());
        if (getRechte()!=null){
            getRechte().inorder();
        }
    }
    public void preorder(){ //WLR
        System.out.println(getInhalt());
        if (getLinke()!=null){
            getLinke().preorder();
        }
        if(getRechte()!=null){
            getRechte().preorder();
        }
    }
    public void postorder(){ //LRW
        if (getLinke()!=null){
            getLinke().postorder();
        }
        if(getRechte()!=null){
            getRechte().postorder();
        }
        System.out.println(getInhalt());
    }

    public T getInhalt() {
        return inhalt;
    }
    public Knoten<T> getLinke() {
        return linke;
    }
    public Knoten<T> getRechte() {
        return rechte;
    }
    public void setIhnalt(T ihnalt) {
        this.inhalt = ihnalt;
    }
    public void setLinke(Knoten<T> linke) {
        this.linke = linke;
    }
    public void setRechte(Knoten<T> rechte) {
        this.rechte = rechte;
    }
}
