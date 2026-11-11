/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Comercio012 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2

        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;

        double productividad;
        double coeficiente = 0.6;
        double bono = 0;

        double porcentajeSeguro = 8;
        double adicionalSeguro;

        double sueldoFinal;

        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();

        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();

        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();

        // calcular la productividad
        productividad = numeroProductos * coeficiente;

        adicionalSeguro = (sueldoBasico * porcentajeSeguro) / 100;

        if (productividad <= 30) {
            bono = 25; // $25
            sueldoFinal = adicionalSeguro + bono + sueldoBasico;
            System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                    + "Nombres: %s\n"
                    + "Apellidos: %s\n"
                    + "Edad: %d\n"
                    + "Sueldo: $%.2f\n"
                    + "Número de productos vendidos: %d\n"
                    + "\tProductidad: %.2f\n"
                    + "\tBono: $%.2f\n"
                    + "Adicional del seguro: $%.2f\n\n"
                    + "Sueldo final: $%.2f\n",
                    nombre,
                    apellido,
                    edad,
                    sueldoBasico,
                    numeroProductos,
                    productividad,
                    bono,
                    adicionalSeguro,
                    sueldoFinal);

        } else {
            if (productividad > 30 && productividad < 80) {
                bono = 50;
                sueldoFinal = adicionalSeguro + bono + sueldoBasico;
                System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                        + "Nombres: %s\n"
                        + "Apellidos: %s\n"
                        + "Edad: %d\n"
                        + "Sueldo: $%.2f\n"
                        + "Número de productos vendidos: %d\n"
                        + "\tProductidad: %.2f\n"
                        + "\tBono: $%.2f\n"
                        + "Adicional del seguro: $%.2f\n\n"
                        + "Sueldo final: $%.2f\n",
                        nombre,
                        apellido,
                        edad,
                        sueldoBasico,
                        numeroProductos,
                        productividad,
                        bono,
                        adicionalSeguro,
                        sueldoFinal);

            } else {
                if (productividad >= 80 && productividad < 200) {
                    bono = 100;
                    sueldoFinal = adicionalSeguro + bono + sueldoBasico;
                    System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                            + "Nombres: %s\n"
                            + "Apellidos: %s\n"
                            + "Edad: %d\n"
                            + "Sueldo: $%.2f\n"
                            + "Número de productos vendidos: %d\n"
                            + "\tProductidad: %.2f\n"
                            + "\tBono: $%.2f\n"
                            + "Adicional del seguro: $%.2f\n\n"
                            + "Sueldo final: $%.2f\n",
                            nombre,
                            apellido,
                            edad,
                            sueldoBasico,
                            numeroProductos,
                            productividad,
                            bono,
                            adicionalSeguro,
                            sueldoFinal);

                } else {
                    if (productividad >= 200) {
                        bono = 200;
                        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
                        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                                + "Nombres: %s\n"
                                + "Apellidos: %s\n"
                                + "Edad: %d\n"
                                + "Sueldo: $%.2f\n"
                                + "Número de productos vendidos: %d\n"
                                + "\tProductidad: %.2f\n"
                                + "\tBono: $%.2f\n"
                                + "Adicional del seguro: $%.2f\n\n"
                                + "Sueldo final: $%.2f\n",
                                nombre,
                                apellido,
                                edad,
                                sueldoBasico,
                                numeroProductos,
                                productividad,
                                bono,
                                adicionalSeguro,
                                sueldoFinal);

                    }
                }
            }
        }

    }

}
