package lista;

public class Pilha {

    private Nodo topo;
    private int num;

    public Pilha() {
        topo = null;
        num = 0;
    }

    public boolean vazia() {
        return this.getNum() == 0;
    }

    public void empilha(int item) {
        Nodo n = new Nodo();
        n.item = item;
        if (vazia()) {
            n.prox = null;
        } else {
            n.prox = topo;
        }
        this.topo = n;
        num++;
    }

    public int desempilha() {
        if (vazia()) {
            return -1;
        } else {
            int item = topo.item;
            topo = topo.prox;
            num --;
            return item;
        }
    }

    public String toString(){
        Nodo aux;
        String s = "";
        aux = this.topo;
        while (aux != null) {
            s = s + "             " + aux.item + "\n";
            aux = aux.prox;
        }
        return s;
    }
    
    public int getNum() {
        return num;
    }
}
