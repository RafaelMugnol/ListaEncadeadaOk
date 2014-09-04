package lista;

public class Lista {

    private Nodo i;
    private Nodo f;
    private int num;

    public Lista() {
        i = null;
        f = null;
        num = 0;
    }

    public boolean vazia() {
        return this.getNum() == 0;
    }

    public void inserirInicio(int item) {
        Nodo n = new Nodo();
        n.item = item;
        if (vazia()) {
            this.f = n;
            n.prox = null;
        } else {
            n.prox = i;
        }
        this.i = n;
        this.num++;
    }

    public void excluiInicio() {
        if (vazia()) {
            System.out.print("Lista vazia!");
        } else {
            this.i = this.i.prox;
            if (this.getNum() == 1) {
                this.f = null;
            }
            num--;
        }
    }

    public void insereFinal(int item) {
        Nodo n = new Nodo();
        n.item = item;
        n.prox = null;
        if (vazia()) {
            this.i = n;
        } else {
            this.f.prox = n;
        }
        this.f = n;
        num++;
    }

    public void excluiFinal() {
        if (vazia()) {
            System.out.println("Lista Vazia!");
        } else if (getNum() == 1) {
            this.i = null;
            this.f = null;
            num--;
        } else {
            Nodo aux;
            aux = this.i;
            while (aux.prox.prox != null) {
                aux = aux.prox;
            }
            aux.prox = null;
            f = aux;
            num--;
        }
    }

    public int acessaInicio() {
        if (vazia()) {
            return 0;
        } else {
            return (this.i.item);
        }
    }

    public int acessaFinal() {
        if (vazia()) {
            return 0;
        } else {
            return (this.f.item);
        }
    }

 

    public String toString() {
        Nodo aux;
        String s = "";
        aux = this.i;
        while (aux != null) {
            s = s + "-" + aux.item + "\n";
            aux = aux.prox;
        }
        return s;
    }

    public int acessa(int pos) {
        if (vazia()) {
            return 0;
        } else if (pos == 1) {
            return (acessaInicio());
        } else if (pos == getNum() - 1) {
            return (acessaFinal());
        } else {
            Nodo aux = i;
            int i;
            for (i = 0; i < pos - 1; i++) {
                aux = aux.prox;
            }
            return aux.item;
        }
    }

    public void insere(int pos, int item) {
        if (vazia()){
            inserirInicio(item);
        }
        else if (pos == 1) {
            inserirInicio(item);
        } else if (pos == getNum() - 1) {
            insereFinal(item);
        } else {
            Nodo n = new Nodo();
            Nodo aux;
            aux = this.i;
            int i;
            for (i = 0; i < pos - 2; i++) {
                aux = aux.prox;
            }
            n.item = item;
            n.prox = aux.prox;
            aux.prox = n;
            num++;
        }
    }

    public void exclui(int pos) {
        if(vazia()){
            System.out.println("Lista Vazia!!");
        } 
        else if (pos == 1) {
            excluiInicio();
        } 
        else if (pos == getNum() - 1) {
            excluiFinal();
        }
        else{
            Nodo n = new Nodo();
            Nodo aux;
            aux = this.i;
            int i;
            for (i = 0; i < pos -2; i++) {
                aux = aux.prox;
            }
            aux.prox=aux.prox.prox;
            num--;
        }
    }
    
    
    public int getNum() {
        return num;
    }

}
