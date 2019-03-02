/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author CARITO
 */
public class Manufacturer extends Eslabon {
    private ArrayList<ProductoC> Mp      ;
    private ArrayList<ProductoM> productosM; 
    
    public Manufacturer(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        this.productosM = new ArrayList<>();
        this.Mp = new ArrayList<>();
    }
    
    public void registrar(LocalDate fecha_e,String nombre,int lote){
        
        ProductoM pm = new ProductoM(this.Mp,lote, nombre, fecha_e, this);
        this.productosM.add(pm);
        

    }
    public void enviar (Distribution d, LocalDate fecha_s){
        for (ProductoM p : productosM) {            
            p.datos.get(0).setEslabonS(d);
            p.datos.get(0).setFechas(fecha_s);
            d.AgrPm(p);
        }
        //productosM.clear();
    }
    public void AgrMp(ProductoC pc){
        this.Mp.add(pc);
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<ProductoC> getMp() {
        return Mp;
    }

    public void setMp(ArrayList<ProductoC> Mp) {
        this.Mp = Mp;
    }

    public ArrayList<ProductoM> getProductosM() {
        return productosM;
    }

    public void setProductosM(ArrayList<ProductoM> productosM) {
        this.productosM = productosM;
    }
    
}
