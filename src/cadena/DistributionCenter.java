/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author dlopezav
 */
public class DistributionCenter extends Eslabon{
    String ruta;
    private ArrayList<Producto> productos;
    
    public DistributionCenter(String nombre, Direccion direccion, String descripcion) {
        super(nombre, direccion, descripcion);
        this.ruta = "Archivos/Distri";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean guardar() throws FileNotFoundException, IOException{
        File bb = new File(this.ruta);
        if(!bb.exists()){
            bb.createNewFile();
        }
        PrintStream archivo = new PrintStream(bb);
        for(Producto b: productos){
            
        }
        archivo.flush();
        archivo.close();
        return true;
    }
     public ArrayList<Producto> Cargar() throws FileNotFoundException, IOException{
        ArrayList<Producto> product = new ArrayList<>();
        FileReader fr = new FileReader (new File(this.ruta)); 
        BufferedReader carga = new BufferedReader(fr);
        while(carga.ready()){
            String q = carga.readLine();
            
        }
        carga.close();
        return product;
    }
}
