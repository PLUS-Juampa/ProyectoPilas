/**
 * Created by juam_ on 08/11/2017.
 */
public class Nodo {

    private int valor;
    private Nodo prox;

    public Nodo(){

    }

    public Nodo(int v){
        this.valor = v;
        this.prox = null;
    }

    public void setValor(int v){
        valor = v;
    }

    public void setProx(Nodo p){
        prox = p;
    }

    public int getValor(){
        return valor;
    }

    public Nodo getProx(){
        return prox;
    }

}
