/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author CARITO
 */
public class ProductoC extends Producto{
    
    public ProductoC(String nombre, LocalDate fecha_e, Eslabon eslabon) {
        super(nombre, fecha_e, eslabon);
    }    
    
    @Override
    public void addDato(Dato dato) {
        super.addDato(dato); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDatos(ArrayList<Dato> datos) {
        super.setDatos(datos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Dato> getDatos() {
        return super.getDatos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
