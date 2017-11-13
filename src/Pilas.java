/**
 * Created by juam_ on 08/11/2017.
 */
public class Pilas {

    private Nodo top;

    public Pilas() {
        top = null;
    }

    public boolean vacia() {
        return (top == null);
    }

    public void push(int valor) {

        Nodo nuevoNodo;

        if (vacia()) {
            top = new Nodo(valor);
        } else {
            nuevoNodo = new Nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }

    }

    public void peek() {
        Nodo temp = top;
        if (temp != null) {
            System.out.println("La pila es: ");
            while (temp != null) {
                System.out.println(temp.getValor());
                temp = temp.getProx();
            }
            System.out.println();
        } else {
            System.out.println("Pila vacía \n");
        }
    }

    public void cima() {
        if (!vacia()) {
            System.out.println("Cima: " + top.getValor());
        } else {
            System.out.println("La pila está vacía");
        }
    }

    public void pop() {
        if (!vacia()) {
            System.out.println("Dato extraído: " + top.getValor());
            top = top.getProx();
        } else {
            System.out.println("La pila está vacía");
        }
    }

    

}

