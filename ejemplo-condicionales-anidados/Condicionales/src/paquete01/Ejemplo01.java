/*
 * Dada una opción (1,2,3), imprimir los valores de verdad
 * para la operación de a y b. Donde 1 es para AND, 2 para OR, 3 para NOT
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la operación que requiere generar\n"
                + "1. AND\n"
                + "2. OR\n"
                + "3. NOT");
        opcion = entrada.nextInt(); //5
        
        if (opcion > 0 && opcion <= 3) { //5 cvdzxc 
            if (opcion==1) {
                System.out.printf("%s\n", "Trabajar con AND");
                
            }else{
                if (opcion==2) {
                    System.out.printf("%s\n", "Trabajar con OR");
                }else{
                    // se asume opción = 3
                    // sería con NOT
                    System.out.printf("%s\n", "Trabajar con NOT");
                }
            }
        }else{
            System.out.printf("%s\n", "Opción inválida");
        }

    }

}
/*
lo que deberia ingrsar un usuario paraw que me salga en pantalla trabajar con and
debe igresar el 1.
*/