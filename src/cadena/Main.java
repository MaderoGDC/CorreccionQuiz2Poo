/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.io.IOException;
import java.time.*;
import java.util.*;

/**
 *
 * @author CARITO
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Farmer x = new Farmer("Granja_X", "produce_leche", "lat:21_long:_23");
        Farmer y = new Farmer("Granja_Y", "produce_harina", "lat:56_long:12");
        Manufacturer w = new Manufacturer("Manufacturera_W", "manufactura_pan", "lat:89_long: 21");
        Distribution d = new Distribution("Distribucion_D", "Centro_de_distribucion", "lat:12_long:23");
        Retail r = new Retail("Comercializadora_R", "comercializadora_de_pan", "lat:21_long:23");

        Scanner lectura = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("Digite una opcion: ");
            System.out.println("1.Generar un producto(cadena de suministro)");
            System.out.println("2.Adquirir un producto(cliente) y guardar ");
            System.out.println("3.salir ");
            int a;
            String a1 = lectura.nextLine();
            a = Integer.parseInt(a1);
            switch (a) {
                case 1:
                    System.out.println("Creacion de materias primas");
                    System.out.println("Ingrese el codigo de la materia prima a crear primero: ");
                    System.out.println("    1.harina");
                    System.out.println("    2.leche");
                    String name = lectura.nextLine();
                    int name1 = Integer.parseInt(name);
                    Farmer f1 = y;
                    Farmer f2 = x;
                    if (name.equals("1")) {
                        name = "harina";
                        f1 = y;
                        f2 = x;
                    } else if (name.equals("2")) {
                        name = "leche";
                        f1 = x;
                        f2 = y;
                    } else {
                        System.out.println("opcion invalida");
                        break;
                    }
                    try {
                        //registro
                        System.out.println("Ingrese la fecha de elaboracion en la granja: ");
                        System.out.println("Dia: ");
                        String day = lectura.nextLine();
                        int day1 = Integer.parseInt(day);
                        System.out.println("Mes: ");
                        String ms = lectura.nextLine();
                        int ms1 = Integer.parseInt(ms);
                        System.out.println("Anio: ");
                        String year = lectura.nextLine();
                        int year1 = Integer.parseInt(year);
                        LocalDate date1 = LocalDate.of(year1, ms1, day1);
                        f1.registrar(name, date1);
                        System.out.println("se registro la " + name + " con exito");
                        //envio
                        System.out.println("digite la fecha de salida de la granja: ");
                        System.out.println("Dia: ");
                        String day2 = lectura.nextLine();
                        int day22 = Integer.parseInt(day2);
                        System.out.println("Mes: ");
                        String ms2 = lectura.nextLine();
                        int ms22 = Integer.parseInt(ms2);
                        System.out.println("Anio: ");
                        String year2 = lectura.nextLine();
                        int year22 = Integer.parseInt(year2);
                        LocalDate date1s = LocalDate.of(year22, ms22, day22);
                        f1.enviar(w, date1s);
                        f1.getProductosC().get(0).traza();

                        //otra materia prima
                        //registro
                        System.out.println("ahora la otra materia prima");
                        if (name.equals("leche")) {
                            name = "harina";
                        } else {
                            name = "leche";
                        }
                        System.out.println("Ingrese la fecha de elaboracion en la granja: ");
                        System.out.println("Dia: ");
                        String day3 = lectura.nextLine();
                        int day33 = Integer.parseInt(day3);
                        System.out.println("Mes: ");
                        String ms3 = lectura.nextLine();
                        int ms33 = Integer.parseInt(ms3);
                        System.out.println("Anio: ");
                        String year3 = lectura.nextLine();
                        int year33 = Integer.parseInt(year);
                        LocalDate date2 = LocalDate.of(year33, ms33, day33);
                        f2.registrar(name, date2);
                        System.out.println("se registro la " + name + " con exito");
                        //envio:
                        System.out.println("digite la fecha de salida de la granja: ");
                        System.out.println("Dia: ");
                        String day4 = lectura.nextLine();
                        int day44 = Integer.parseInt(day4);
                        System.out.println("Mes: ");
                        String ms4 = lectura.nextLine();
                        int ms44 = Integer.parseInt(ms4);
                        System.out.println("Anio: ");
                        String year4 = lectura.nextLine();
                        int year44 = Integer.parseInt(year4);
                        LocalDate date1so = LocalDate.of(year44, ms44, day44);
                        f2.enviar(w, date1so);
                        f2.getProductosC().get(0).traza();
                    } catch (Exception e) {
                        System.out.println("ocurrio un error en la produccion de materia prima: " + e);
                        break;
                    }
                    System.out.println("Las materias primas han sido enviadas a la " + w.getNombre() + " que " + w.getDescripcion());
                    //empieza la produccion de pan
                    try {
                        String namep = "pan";
                        System.out.println("ingrese la fecha de manufactura del pan");
                        System.out.println("Dia: ");
                        String day = lectura.nextLine();
                        int day1 = Integer.parseInt(day);
                        System.out.println("Mes: ");
                        String ms = lectura.nextLine();
                        int ms1 = Integer.parseInt(ms);
                        System.out.println("Anio: ");
                        String year = lectura.nextLine();
                        int year1 = Integer.parseInt(year);
                        LocalDate date1 = LocalDate.of(year1, ms1, day1);
                        System.out.println("digite el num de lote");
                        String lote = lectura.nextLine();
                        int lote1 = Integer.parseInt(lote);
                        w.registrar(date1, namep, lote1);
                        System.out.println("se registro el " + namep + " con exito");
                        System.out.println("digite la fecha de salida de la manufacturera: ");
                        System.out.println("Dia: ");
                        day = lectura.nextLine();
                        day1 = Integer.parseInt(day);
                        System.out.println("Mes: ");
                        ms = lectura.nextLine();
                        ms1 = Integer.parseInt(ms);
                        System.out.println("Anio: ");
                        year = lectura.nextLine();
                        year1 = Integer.parseInt(year);
                        LocalDate date1s = LocalDate.of(year1, ms1, day1);
                        w.enviar(d, date1s);
                        System.out.println("info del producto");
                        System.out.println(w.getProductosM().size());
                        w.getProductosM().get(0).factura();
                    } catch (Exception e) {
                        System.out.println("ocurrio un error en el proceso de manufactura");
                        System.out.println(e);
                    }
                    System.out.println("El producto ha sido enviado a la" + d.getNombre());
                    //distrinucion del producto
                    try {
                        System.out.println("Ingrese le fecha de distribucion");
                        System.out.println("Dia: ");
                        String day = lectura.nextLine();
                        int day1 = Integer.parseInt(day);
                        System.out.println("Mes: ");
                        String ms = lectura.nextLine();
                        int ms1 = Integer.parseInt(ms);
                        System.out.println("Anio: ");
                        String year = lectura.nextLine();
                        int year1 = Integer.parseInt(year);
                        LocalDate date1 = LocalDate.of(year1, ms1, day1);
                        d.distribuir(r, date1);
                        System.out.println("se distribuyo con exito: ");
                        d.getProductos().get(0).factura();
                    } catch (Exception e) {
                        System.out.println("ocurrio un error en la distribucion");
                        e.printStackTrace();
                    }
                    System.out.println("el producto fue enviado a la" + r.getNombre());
                    try {
                        System.out.println("digite el precio de venta para el producto");
                        String precio = lectura.nextLine();
                        Double precio1 = Double.parseDouble(precio);
                        System.out.println("digite el codigo de venta del producto");
                        String codigo = lectura.nextLine();
                        int codigo1 = Integer.parseInt(codigo);
                        r.etiquetar(codigo1, precio1);
                    } catch (Exception e) {
                        System.out.println("ocurrio un error en retail");
                        e.printStackTrace();
                    }
                    System.out.println("Listo! El producto esta en la " + r.getNombre() + " listo para venderse");
                    break;
                case 2:                    
                    System.out.println("digite su nombre: ");
                    String nombreC = lectura.nextLine();
                    System.out.println("Bienvenido:" + nombreC);
                    int npr = r.getProductos().size();
                    Client c = new Client(nombreC);
                    if (npr > 0) {
                        System.out.println("num productos en la tienda");
                        System.out.println(npr);
                        c.comprar(r, LocalDate.now());
                        c.getMisCompritas().get(c.getMisCompritas().size()-1).factura();

                    } else {
                        System.out.println("num productos en la tienda");
                        System.out.println(npr);
                        System.out.println("Lo sentimos, no hay articulos opara la venta");
                    }
                    Guardar ga = new Guardar(nombreC);
                    ga.save(c.getMisCompritas());
                    break;
                case 3:
                    System.out.println("Gracias, Hasta pronto");
                    salir = true;
                    break;
            }
        } while (!salir);
    }
}
