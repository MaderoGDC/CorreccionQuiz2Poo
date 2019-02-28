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
public class ProductoM extends Producto{
    private ArrayList<ProductoC> Mp;
    private int Lote;
    private Integer cod ;
    private Double precio;

    public ProductoM(ArrayList<ProductoC> Mp, int Lote, String nombre, LocalDate fecha_e, Eslabon eslabon) {
        super(nombre, fecha_e, eslabon);
        this.Mp = Mp;
        this.Lote = Lote;
        this.cod = null;
        this.precio = 0.0;
    }


    public ProductoM(ArrayList<ProductoC> Mp, String nombre, LocalDate fecha_e, Eslabon eslabon) {
        super(nombre, fecha_e, eslabon);
        this.Mp = Mp;
    }
    public void factura(){
        System.out.println("Materias primas utilizadas en el producto: ");
        for(ProductoC pc : Mp) {
            pc.traza();
        }
        this.traza();
    }
    @Override
    public void addDato(Dato dato) {
        super.addDato(dato); 
    }

    @Override
    public void setDatos(ArrayList<Dato> datos) {
        super.setDatos(datos);
    }

    @Override
    public ArrayList<Dato> getDatos() {
        return super.getDatos(); 
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); 
    }

    @Override
    public String getNombre() {
        return super.getNombre(); 
    }

    public ArrayList<ProductoC> getMp() {
        return Mp;
    }

    public void setMp(ArrayList<ProductoC> Mp) {
        this.Mp = Mp;
    }

    public int getLote() {
        return Lote;
    }

    public void setLote(int Lote) {
        this.Lote = Lote;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
}
