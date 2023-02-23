package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lefrontend {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        System.out.print("Digita la cantidad de producto: ");
        Integer cantidadProducto = entrada.nextInt();
        System.out.println("La cantidad fue: "+cantidadProducto);

        //Asi se crea una fecha obteniendola del sistema
        LocalDate fecha=LocalDate.now();
        System.out.println(fecha);

        //Asi se asigna una fecha en especifico
        LocalDate fecha2 = LocalDate.of(2023,02,24);
        System.out.println(fecha2);

        //Como encontrar la diferencia entre dos fechas
        Long difereciaEntreFechas= ChronoUnit.DAYS.between(fecha, fecha2);
        System.out.println(difereciaEntreFechas);

    }
}