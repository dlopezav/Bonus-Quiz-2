/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.util.ArrayList;

/**
 *
 * @author dlopezav
 */
public class Producto {
    private String nombre;
    private ArrayList<String> items;
    private double precio;
    private ArrayList<String> traza;
    private Fecha fecha;
    private int codigo;

    public Producto() {
        this.nombre = nombre;
        this.fecha = new Fecha();
        this.precio = precio;
        this.items = new ArrayList<>();
        this.traza = new ArrayList<>();
        this.codigo = codigo;
    }
    
    public void añadirTraza(String e){
        traza.add(e);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public ArrayList<String> getTraza() {
        return traza;
    }

    public void setTraza(ArrayList<String> traza) {
        this.traza = traza;
    }

    public Producto(String nombre, ArrayList<String> items, double precio, ArrayList<String> traza, Fecha fecha) {
        this.nombre = nombre;
        this.items = items;
        this.precio = precio;
        this.traza = traza;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
