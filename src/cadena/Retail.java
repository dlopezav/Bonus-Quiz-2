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
public class Retail extends Eslabon{
    private ArrayList<Producto> productos;

    public Retail(String nombre, Direccion direccion, String descripcion) {
        super(nombre, direccion, descripcion);
        this.productos = new ArrayList<>();
    }
    

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }

    
    
}
