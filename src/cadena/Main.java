/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.time.*;
import java.util.*;

/**
 *
 * @author CARITO
 */
public class Main {

    public static void main(String[] args) {
        Farmer x = new Farmer("Granja_X", "produce_leche", "ViaCota-km2");
        Farmer y = new Farmer("Garcja_Y", "produce_harina", "ViaSubachoche-km7");
        Manufacturer w = new Manufacturer("Manufacturera_W", "Hace_pan", "PuentePiedra");
        Distribution d = new Distribution("Distribucion_D", "Centro_de_distribucion", "Subachoque");
        Retail r = new Retail("Comercializadora_R", "comercializadora_de_pan", "Cortijo");

        Scanner lectura = new Scanner(System.in);
        int a = 0;
        String n = "BaseDatos.txt";
        do {
            System.out.println("Digite una opcion: ");
            System.out.println("1.Generar un producto(cadena de suministro)");
            System.out.println("2.Adquirir un producto(cliente)");
            System.out.println("3.Guardar informacion de mis productos(cliente)");

            String a1 = lectura.nextLine();
            a = Integer.parseInt(a1);
            switch (a) {
                case 1:
                    System.out.println("Creacion de materias primas");
                    System.out.println("Ingrese el codigo de la materia prima a crear primero: ");
                    System.out.println("    1.harina");
                    System.out.println("    2.leche");
                    String name = lectura.nextLine();
                    if (name.equals("1")) {
                        name = "harina";
                    } else if (name.equals("2")) {
                        name = "leche";
                    } else {
                        System.out.println("opcion invalida");
                        break;
                    }
                    int name1 = Integer.parseInt(name);
                    System.out.println("Ingrese la fecha de elaboracion o cultivo: ");
                    System.out.println("Dia: ");
                    String day = lectura.nextLine();
                    int day1 = Integer.parseInt(day);
                    System.out.println("Mes: ");
                    String ms1 = lectura.nextLine();
                    int ms = Integer.parseInt(ms1);
                    System.out.println("Anio: ");
                    String year = lectura.nextLine();
                    int year1 = Integer.parseInt(year);
                    LocalDate date1 = LocalDate.of(year1, ms, day1);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Gracias, Hasta pronto");
                    a = 4;
                    break;
            }
        } while (a < 2);
    }
}
//GestionArchivo g = new GestionArchivo(n);

//        LocalDate n = LocalDate.of(2019, 2, 27);
//        System.out.println(n);
//        System.out.println(n.getDayOfMonth());
//        int o = n.getDayOfMonth();
//        Integer p = n.getMonthValue();
//        System.out.println("dia: "+ o);
//        System.out.println("mes: "+ p);
//        Farmer farmer = new Farmer("McDonald","El viejo tenia una granja", "iaiaoh");
//        Dato dato = new Dato(LocalDate.of(1900, 2,1 ), farmer);
//        System.out.println("dato: "+ dato.getFechae());
//        LocalDate hoy = LocalDate.now();
//        System.out.println("hoy:" + hoy);
//    }
//    
//}
