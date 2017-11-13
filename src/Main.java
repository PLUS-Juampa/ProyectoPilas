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
            System.out.println(" ********** PILAS **********");
            System.out.println("******** MENÚ PRINCIPAL ********");
            System.out.print("1. Insertar. \t2. Mostrar.\t3. Buscar.\t4. Eliminar.\n5. Tamaño.\t\t6. Máximo.\t7. Mínimo.\t8. Terminar.\n");
            System.out.println();
            System.out.print("Elija una opción: ");
            System.out.println();
            opcion = sc.nextLine();

            switch (opcion) {
                case "1": {
                    try {
                        System.out.println("*** Insertar ***");
                        System.out.println("¿Cuántos números desea insertar?");
                        String n = sc.nextLine();

                        for(int i = 1; i<=Integer.parseInt(n); i++ ){
                            System.out.print("Inserte número: " + i + "   ");
                            p.push(Integer.parseInt(sc.nextLine()));
                        }

                        System.out.println("\n*** Números agregados ***\n");
                    }catch (Exception e){
                        System.out.println("\n*** Debe ingresar sólo números ***\n");
                    }
                    System.out.println();
                    break;
                }
                case "2": {
                    System.out.println("*** Mostrar ***");
                    p.peek();
                    System.out.println("\n*** Datos mostrados correctamente ***\n");
                    break;
                }
                case "3": {
                    System.out.println("*** Buscar ***");
                    p.cima();
                    System.out.println("\n");
                    break;
                }
                case "4": {
                    System.out.println("*** Eliminar ***");
                    p.pop();
                    System.out.println("\n");
                    break;
                }
                case "5": {
                    System.out.println("*** Tamaño ***");
                    System.out.println("\n");
                    break;
                }
                case "6": {
                    System.out.println("*** Máximo ***");
                    p.maximo();
                    System.out.println("\n");
                    break;
                }
                case "7": {
                    System.out.println("*** Mínimo ***");
                    p.minimo();
                    System.out.println("\n");
                    break;
                }
                case "8": {
                    System.out.println("\n¡Hasta luego!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("\b\t*** Opción incorrecta ***\n");
                    break;
                }
            }
        } while (!opcion.equals("8"));


        /*
        p.push(100);
        p.push(50);
        p.push(20);

        p.peek();
        p.cima();
        p.pop();
        p.peek();
        p.pop();
        p.cima();
        p.pop();
        p.peek();
        */




    }

}
