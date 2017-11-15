import java.util.Scanner;

/**
 * Created by juam_ on 08/11/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pilas p = new Pilas();

        String opcion;
        do {
            System.out.println(" ********** PILAS **********"); // Muestra el menú de las diferentes opciones
            System.out.println("******** MENÚ PRINCIPAL ********");
            System.out.print("1. Insertar. \t2. Mostrar.\t3. Buscar.\t4. Eliminar.\n5. Tamaño.\t\t6. Máximo.\t7. Mínimo.\t8. Terminar.\n");
            System.out.println();
            System.out.print("Elija una opción: ");
            System.out.println();
            opcion = sc.nextLine(); // Lee la opción digitada por el usaurio

            switch (opcion) {   // Dependiendo la opción se ejecutará cada una de las siguientes tareas
                case "1": {
                    try {   // Em caso de esta opción se insertarán datos a la pila
                        System.out.println("*** Insertar ***");
                        System.out.println("¿Cuántos números desea insertar?");
                        String n = sc.nextLine();   // Pregunta al usuario cuántos números desea agregar

                        for(int i = 1; i<=Integer.parseInt(n); i++ ){
                            System.out.print("Inserte número: " + i + "   ");
                            p.push(Integer.parseInt(sc.nextLine()));    // Dependiendo cuantos desea ingresar solicitará al usuario los numeros
                        }

                        System.out.println("\n*** Números agregados ***\n");
                    }catch (Exception e){   // En caso de no insertar un número mostrará el siguiente mensaje
                        System.out.println("\n*** Debe ingresar sólo números ***\n");
                    }
                    System.out.println();
                    break;
                }
                case "2": { // Dependiendo esta opción se mostrarán los elementos en la pila
                    System.out.println("*** Mostrar ***");
                    p.peek();   // LLamará al método para mostrar los elementos en la pila
                    System.out.println("\n*** Datos mostrados correctamente ***\n");
                    break;
                }
                case "3": { // Dependieno esta opción buscará un número en la pila
                    System.out.println("*** Buscar ***");
                    System.out.println("Digite nùmero a buscar");
                    try {
                        String numBuscar = sc.nextLine();   // Solicita al usuario el número
                        p.buscar(Integer.parseInt(numBuscar));  // Llamará el método para saber si el elemento se encuentra en la Pila
                    }catch (Exception e){   // En caso de no digitar un número se mostrará el siguiente mensaje
                        System.out.println("\n\tDebe ingresar un número entero\n");
                    }
                    break;
                }
                case "4": { // Dependiendo esta opción eliminará un número en la Pila
                    System.out.println("*** Eliminar ***");
                    System.out.println("Digite número a eliminar");
                    try {
                        String numEliminar = sc.nextLine(); // Solicita al usuario el número a eliminar
                        if(p.eliminar(Integer.parseInt(numEliminar))){  // Llamará al método para eliminar el número en caso de que exista en la Pila
                            System.out.println("\n\t*** Número Eliminado ***\n");
                        }else { // Sino existe mostrará el siguiente mensaje
                            System.out.println("\n\t*** Número inexistente en Pila ***\n");
                        }
                    }catch (Exception e){   // En caso de no digitar un número se mostrará el siguiente mensaje
                        System.out.println("\n\t*** Debe ingresar sólo números ***\n");
                    }

                    break;
                }
                case "5": { // Dependiendo esta opción se mostrará el tamaño de la Pila
                    System.out.println("*** Tamaño ***");
                    System.out.println("El tamaño de la Pila es: " + p.getSize());  // Llama al método que contiene el tamaño o el número de elementos de la Pila
                    System.out.println("\n");
                    break;
                }
                case "6": { // Dependiendo esta opción buscará el valor más grande en la Pila
                    System.out.println("*** Máximo ***");
                    p.maximo(); // Llamará al método que buscará entre los números el valor más grande
                    System.out.println("\n");
                    break;
                }
                case "7": { // Dependiendo esta opción buscará el valor menor en la Pila
                    System.out.println("*** Mínimo ***");
                    p.minimo(); // Llamada al método que buscará entre los números el valor más pequeño
                    System.out.println("\n");
                    break;
                }
                case "8": { // En caso de esta opción se terminará la ejecución del programa
                    System.out.println("\n¡Hasta luego!");
                    System.exit(0);
                    break;
                }
                default: {  // En caso de digitar una opción diferente  a las anteriores mostrará el siguiente mensaje y el menú nuevamente
                    System.out.println("\b\t*** Opción incorrecta ***\n");
                    break;
                }
            }
        } while (!opcion.equals("8"));

    }

}
