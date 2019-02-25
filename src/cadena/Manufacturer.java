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
public class Manufacturer extends Eslabon{
    private ArrayList<Producto> productos;
    private String ruta;

    public Manufacturer(String nombre, Direccion direccion, String descripcion) {
        super(nombre, direccion, descripcion);
        this.productos = new ArrayList<>();
        this.ruta = "Archivos/Manu";
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }
    public boolean guardar() throws FileNotFoundException, IOException{
        File bb = new File(this.ruta);
        if(!bb.exists()){
            bb.createNewFile();
        }
        PrintStream archivo = new PrintStream(bb);
        for(Producto b: productos){
            archivo.print("\n"+b.getNombre()+":");
            for(String item: b.getItems()){
                archivo.print(b+":");
            }
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
            if(q.contains("Farmer")){
                
            }
        }
        carga.close();
        return product;
    }
}
