/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CARITO
 */
public class Guardar {

    private String direction;

    public Guardar(String direction) {
        this.direction = direction;
    }

    public String trazaM(ProductoM p) {
        String s = "";
        s = s + "Nombre_Producto: " + "\n" + p.nombre + "\n";
        for (int i = 0; i < p.datos.size(); i++) {
            if (p.datos.get(i).getEslabonS() == null) {
                Retail e = new Retail(" ", " ", " ");
                p.datos.get(i).setEslabonS(e);

            }
            s = s + "Lugar llegada:  " + p.datos.get(i).getEslabonE().getNombre()
                    + " Fecha Llegada: " + p.datos.get(i).getFechae()
                    + "\n";
            s = s + "Lugar destino: " + p.datos.get(i).getEslabonS().nombre
                    + " Fecha Salida: " + p.datos.get(i).getFechas() + "\n";

        }
        return s;
    }

    public String trazaC(ProductoC p) {
        String s = "";
        s = s + "Nombre Producto: " + p.nombre + "\n";
        for (int i = 0; i < p.datos.size(); i++) {
            if (p.datos.get(i).getEslabonS() == null) {
                Retail e = new Retail(" ", " ", " ");
                p.datos.get(i).setEslabonS(e);

            }
            s = s + "Lugar llegada:  " + p.datos.get(i).getEslabonE().getNombre()
                    + " Fecha Llegada: " + p.datos.get(i).getFechae()
                    + "\n";
            s = s + "Lugar destino: " + p.datos.get(i).getEslabonS().nombre
                    + " Fecha Salida: " + p.datos.get(i).getFechas() + "\n";

        }
        return s;
    }

    public String guardar(ProductoM p) {
        String s = "";
        s = s + "Materias_primas_utilizadas_en_el_producto:" + "\n";
        s = s + (p.getMp().size()) + "\n";
        for (int i = 0; i < p.getMp().size(); i++) {
            s = s + trazaC(p.getMp().get(i));
        }
        s += "Lote: " + "\n" +p.getLote() + "\n";
        s += "Codigo: " +"\n" + p.getCod() + "\n";
        s += "Precio: " +"\n" + p.getPrecio() + "\n";
        s = s + trazaM(p);

        return s;
        
    }
    public boolean save(ArrayList<ProductoM> pm) throws IOException{        
        File archivo = new File(this.direction);
        if(!archivo.exists())
            archivo.createNewFile();      
        PrintStream salida = new PrintStream(archivo);
        String s = "";
        for(ProductoM p : pm){
            s+=guardar(p); 
        }        
        salida.print(s);
        return true;
    }

}
