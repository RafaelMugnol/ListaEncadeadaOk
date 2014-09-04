package lista;

public class Fila {

    private Nodo frente;
    private Nodo fim;
    private int num;

    public Fila() {
        fim = null;
        frente = null;
        num = 0;
    }

    public boolean vazia() {
        return this.getNum() == 0;
    }

    public void enfileira(int item) {
        Nodo n = new Nodo();
        n.item = item;
        if (vazia()) {
            frente = n;
            n.prox = null;
        } else {
            fim.prox = n;
            n.prox = null;
        }
        fim = n;
        num++;
    }

    public int desenfileira() {
        if (vazia()){
            return -1;
        }
        else{
            int item = frente.item;
            frente = frente.prox;
            num --;
            return item;
        }
    }

    public String toString(){
        Nodo aux;
        String s = "";
        int n = 1;
        aux = this.frente;
        while (aux != null) {
            s = s + "    " + n + "º - " + aux.item + "\n";
            aux = aux.prox;
            n++;
        }
        return s;
    }
    
    public int getNum() {
        return num;
    }
    
    

}
