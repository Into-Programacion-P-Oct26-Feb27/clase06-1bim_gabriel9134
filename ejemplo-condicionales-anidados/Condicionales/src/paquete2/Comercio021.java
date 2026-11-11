
package paquete2;

import java.util.Locale;
import java.util.Scanner;

public class Comercio021 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String apellido;
        String region;
        int edad;
        double sueldoBasico;
        int numeroProductos;

        double productividad;
        double coeficiente = 0.6;
        double bono = 0;

        double porcentajeSeguro = 0;
        double adicionalSeguro;

        double sueldoFinal;

        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();

        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese la region del empleado (Sierra, Costa, Oriente, Insular):");
        region = entrada.nextLine();

        System.out.println("Ingrese el sueldo basico por favor");
        sueldoBasico = entrada.nextDouble();

        System.out.println("Ingrese el numero de productos vendidos por favor");
        numeroProductos = entrada.nextInt();

        // Determinar el porcentaje del seguro segun la region
        if (region.equalsIgnoreCase("Sierra")) {
            porcentajeSeguro = 10;
        } else {
            if (region.equalsIgnoreCase("Costa")) {
                porcentajeSeguro = 12;
            } else {
                if (region.equalsIgnoreCase("Oriente")) {
                    porcentajeSeguro = 15;
                } else {
                    if (region.equalsIgnoreCase("Insular")) {
                        porcentajeSeguro = 30;
                    } else {
                        System.out.println("Region no valida.");
                        return;
                    }
                }
            }
        }

        // Calcular la productividad
        productividad = numeroProductos * coeficiente;

        if (productividad <= 30) {
            bono = 25;
        } else {
            if (productividad > 30 && productividad < 80) {
                bono = 50;
            } else {
                if (productividad >= 80 && productividad < 200) {
                    bono = 100;
                } else {
                    if (productividad >= 200 && productividad <= 500) {
                        bono = 200;
                    } else {
                        bono = 300;
                    }
                }
            }
        }

        // Calcular el seguro y el sueldo final
        adicionalSeguro = (sueldoBasico * porcentajeSeguro) / 100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;

        // Mostrar reporte
        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Region: %s\n"
                + "Sueldo: $%.2f\n"
                + "Numero de productos vendidos: %d\n"
                + "\tProductividad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Porcentaje del seguro: %.0f%%\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n",
                nombre,
                apellido,
                edad,
                region,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                porcentajeSeguro,
                adicionalSeguro,
                sueldoFinal);

    }
}
/*
de acuerdo a nueva normativa el porcentaje del seguro es variable, si el empleado
es de la sierra el porcenaje del seguro es 10%, costa 12 %, oriente 15%, insular 
30%, acoplar la solucion para que considere la nueva normativa
*/ 