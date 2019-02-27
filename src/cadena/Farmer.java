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
public class Farmer extends Eslabon {
    private ArrayList<String> productos;

    public Farmer(String nombre, Direccion direccion, String descripcion) {
        super(nombre, direccion, descripcion);
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public ArrayList<String> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<String> productos) {
        this.productos = productos;
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
    
    public void addProducto(String producto){
        productos.add(producto);
    }
            
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
