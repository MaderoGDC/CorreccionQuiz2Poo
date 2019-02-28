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
public class Client {
    private String nombre;
    private ArrayList<ProductoM> misCompritas;

    public Client(String nombre) {
        this.nombre = nombre;
        this.misCompritas = new ArrayList<>();
    }
    public void AgrCom(ProductoM pc){
        this.misCompritas.add(pc);
    }
    public void comprar(Retail r, LocalDate F){
        r.vender(this,F);
    }
}
