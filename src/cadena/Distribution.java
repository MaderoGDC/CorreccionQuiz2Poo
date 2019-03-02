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
public class Distribution extends Eslabon{
    
    private ArrayList<ProductoM> productos;
    
    public Distribution(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        this.productos = new ArrayList<>();
        
    }

    public Distribution(ArrayList<ProductoM> productos, String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        this.productos = productos;
    }
    public void AgrPm(ProductoM pc){
        this.productos.add(pc);
    }
    public void distribuir( Retail r, LocalDate fecha_s){
         for (ProductoM p : productos) {
            Dato d1 = new Dato(fecha_s, r);
            p.datos.add(d1);
            p.datos.get(1).setEslabonE(p.datos.get(0).getEslabonS());
            p.datos.get(1).setFechae(p.datos.get(0).getFechas());
            p.getDatos().get(1).setEslabonS(r);
            p.getDatos().get(1).setFechas(fecha_s);
            r.AgrPm(p);
            }
        //productos.clear();
    }

    public ArrayList<ProductoM> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoM> productos) {
        this.productos = productos;
    }
    

}
