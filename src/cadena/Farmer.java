/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author CARITO
 */
    public class Farmer extends Eslabon {
        private ArrayList<Producto> productosC; 
        public Farmer(String nombre, String descripcion, String direccion) {
            super(nombre, descripcion, direccion);
        }
    
    public void registrar(String nombre, LocalDate fechae){
        ProductoC p =  new ProductoC(nombre,fechae,this);
        this.productosC.add(p);
    }    
    public void enviar (Manufacturer m, LocalDate fecha_s){
        for (Producto p : productosC) {
            m.AgrMp(p);
            p.datos.get(0).setEslabonS(m);
            p.datos.get(0).setFechas(fecha_s);
        }
        productosC.clear();
    }
}
