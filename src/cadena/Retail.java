package cadena;


import cadena.Eslabon;
import java.time.LocalDate;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CARITO
 */
public class Retail extends Eslabon {
    
    private ArrayList<ProductoM> productos;
    
    public Retail(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        this.productos = new ArrayList<>();
    }
    
    public void AgrPm(ProductoM pc){
        this.productos.add(pc);
    }
    public void etiquetar(int cod, Double precio){
         for (ProductoM p : productos) {
            p.datos.get(2).setEslabonE(p.datos.get(1).getEslabonS());
            p.datos.get(2).setFechae(p.datos.get(1).getFechas());
            p.setCod(cod);
            p.setPrecio(precio);
        }
        //productos.clear();
    }
    public boolean vender(Client client, LocalDate f_venta){
        this.productos.get(this.productos.size()-1).getDatos().get(2).setFechas(f_venta);
        client.AgrCom(this.productos.get(productos.size()-1));       
        this.productos.remove(this.productos.size()-1);           
           return true;     
    }

    public ArrayList<ProductoM> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoM> productos) {
        this.productos = productos;
    }
    
}
