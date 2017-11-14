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

    public void maximo() {
        Nodo temp = top;
        int max = 0;
        if (temp != null) {
            while (temp != null) {
                if (temp.getValor() > max) {
                    max = temp.getValor();
                }
                temp = temp.getProx();
            }

            System.out.println("Valor máximo: " + max);
        }
        else {
            System.out.println("La pila está vacía");
        }
    }

    public void minimo(){
        Nodo temp = top;
        int min = 100;
        if (temp != null) {
            while (temp != null) {
                if (temp.getValor() < min) {
                    min = temp.getValor();
                }
                temp = temp.getProx();
            }

            System.out.println("Valor minimo: " + min);
        }
        else {
            System.out.println("La pila está vacía");
        }

    }


    public void buscar(int referencia){
        // Crea una copia de la pila.
        Nodo aux = top;

        int pos = 0;
        // Bandera para verificar si existe el elemento a buscar.
        boolean existe = false;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la pila.
        while(existe != true && aux != null){
            // Compara si el valor del nodo es igual que al de referencia.
            if (referencia == aux.getValor()) {
                // Cambia el valor de la bandera.
                existe = true;
            }
            else{
                // Avanza al siguiente nodo.
                aux = aux.getProx();
                pos++;
            }
        }

        if(existe){
            System.out.println("Número encontrado en posoción: " + pos);
        }else {
            System.out.println("\nNúmero inexistente en la Pila\n");
        }
        // Retorna el valor de la bandera.
    }

    public boolean buscarAuxiliar(int referencia){
        // Crea una copia de la pila.
        Nodo aux = top;
        // Bandera para verificar si existe el elemento a buscar.
        boolean existe = false;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la pila.
        while(existe != true && aux != null){
            // Compara si el valor del nodo es igual que al de referencia.
            if (referencia == aux.getValor()) {
                // Cambia el valor de la bandera.
                existe = true;
            }
            else{
                // Avanza al siguiente nodo.
                aux = aux.getProx();
            }
        }
        // Retorna el valor de la bandera.
        return existe;
    }

    public boolean eliminar(int referencia){

        boolean existe = true;
        // Consulta si el valor existe en la pila.
        if (buscarAuxiliar(referencia)) {
            // Crea una pila auxiliar para guardar los valores que se
            // vayan desapilando de la pila original.
            Nodo pilaAux = null;
            // Recoore la pila hasta llegar al nodo que tenga el valor
            // igual que el de referencia.
            while(referencia != top.getValor()){

                // Crea un nodo temporal para agregarlos a la pila auxiliar.
                Nodo temp = new Nodo();
                // Ingresa el valor al nodo temporal.
                temp.setValor(top.getValor());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(pilaAux == null){
                    // Inicializa la pila auxiliar.
                    pilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al inicio.
                else{
                    temp.setProx(pilaAux);
                    pilaAux = temp;
                }
                // Elimina el nodo del tope de la pila hasta llegar al nodo
                // que se desea eliminar.
                retirar();
            }
            // Elimina el nodo que coincide con el de referencia.
            retirar();

            // Regresa los valores de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(pilaAux != null){
                // Utiliza el metodo apilar para regresar los elementos a
                // la pila original.
                push(pilaAux.getValor());
                // Avansa al siguiente nodo de la pila auxiliar.
                pilaAux = pilaAux.getProx();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            pilaAux = null;
        }else {
            existe = false;
        }

        return existe;
    }

    public void retirar(){
        if (!vacia()) {
            // Asigna como primer nodo al siguiente de la pila.
            top = top.getProx();
            // Decrementa el contador del tamaño de la pila
            //tamanio--;
        }
    }


}

