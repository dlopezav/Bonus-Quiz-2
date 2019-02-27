/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dlopezav
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Menu b = new Menu();
        Process sistema = new Process();
        GestionRegistro x = new GestionRegistro("Archivos/Cadena");
        String nombre = null;
        String descripcion = null;
        int latitud = 0;
        int longitud = 0;
        Scanner a= new Scanner(System.in);
        int opcion = 0;
        int c = 0;
        int n = 0;
        while(true){
            int u=100;
            try{   
                    
            opcion = b.Options();
            }catch(Exception e){
                System.out.println("Ingreso mal el dato");
            }
            switch(opcion){
                
                case 1:
                    System.out.println("1.Crear granja");
                    try{   
                    c = a.nextInt();
                    }catch(Exception e){
                        System.out.println("Ingreso mal el dato");
                    }
                    switch(c){
                        case 1:
                            try{
                            System.out.println("Crear granja");
                            System.out.println("\nNombre:");
                            nombre = a.nextLine();
                            nombre = a.nextLine();
                            System.out.println("Descripcion:");
                            descripcion = a.nextLine();
                            System.out.println("Latitud:");
                            latitud = a.nextInt();
                            System.out.println("Longitud:");
                            longitud = a.nextInt();
                            a.nextLine();
                            Direccion dir = new Direccion(latitud,longitud);
                            Eslabon Farmer = new Farmer(nombre,dir,descripcion);
                            System.out.println("Anadir nombre materia prima, al finalizar digite 0");
                            while(u!=0){
                            String g = a.nextLine();
                            if(g.equals("0")){
                                u=0;
                            }else{
                            ((Farmer)Farmer).addProducto(g);
                            }
                            }
                            u=100;
                            sistema.crearEslabon(Farmer);
                            }catch(Exception e){
                                System.out.println("No digito correctamente");
                                e.printStackTrace();
                            }
                            
                            break;
                        case 2:
                            System.out.println();

                        break;
                        
                    }
                break;
                case 2:
                {
                    System.out.println("1.Crear manufacturer");
                    int m=0;
                    try{
                    m = a.nextInt();
                    }catch(Exception e){
                        System.out.println("Digito mal");
                    }
                    switch(m){
                        case 1:
                            try{
                            System.out.println("Crear manufacturer");
                            System.out.println("\nNombre:");
                            nombre = a.nextLine();
                            nombre = a.nextLine();
                            System.out.println("Descripcion:");
                            descripcion = a.nextLine();
                            System.out.println("Latitud:");
                            latitud = a.nextInt();
                            System.out.println("Longitud:");
                            longitud = a.nextInt();
                            a.nextLine();
                            }catch(Exception e){
                                System.out.println("No digito correctamente");
                            }
                            Direccion dir = new Direccion(latitud,longitud);
                            Eslabon Manu = new Manufacturer(nombre,dir,descripcion);
                            sistema.crearEslabon(Manu);
                            break;
                    }
                break;
                }
                case 3:
                {
                    System.out.println("1.Crear distribuidor ");
                    try{
                    n = a.nextInt();
                    }catch(Exception e){
                        System.out.println("Digito mal");
                    }
                    switch(n){
                        case 1:
                            System.out.println("Crear distribuidor");
                            System.out.println("\nNombre:");
                            nombre = a.nextLine();
                            nombre = a.nextLine();
                            System.out.println("Descripcion:");
                            descripcion = a.nextLine();
                            System.out.println("Latitud:");
                            latitud = a.nextInt();
                            System.out.println("Longitud:");
                            longitud = a.nextInt();
                            a.nextLine();
                            
                            Direccion dirc = new Direccion(latitud,longitud);
                            Eslabon Dist = new DistributionCenter(nombre,dirc,descripcion);
                            sistema.crearEslabon(Dist);
                            break;
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("1.Crear retail ");
                    int o = 0;
                    try{
                    o = a.nextInt();
                    }catch(Exception e){
                        System.out.println("Digito mal");
                    }
                    switch(o){
                        case 1:
                            try{
                            System.out.println("Crear retail");
                            System.out.println("\nNombre:");
                            nombre = a.nextLine();
                            nombre = a.nextLine();
                            System.out.println("Descripcion:");
                            descripcion = a.nextLine();
                            System.out.println("Latitud:");
                            latitud = a.nextInt();
                            System.out.println("Longitud:");
                            longitud = a.nextInt();
                            a.nextLine();
                            }catch(Exception e){
                                System.out.println("No digito correctamente");
                            }
                            Direccion dire = new Direccion(latitud,longitud);
                            Eslabon retail = new Retail(nombre,dire,descripcion);
                            sistema.crearEslabon(retail);
                            break;
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Venta y creacion de productos");
                    int f = 0;
                    try{
                       f = b.ventas(); 
                    }catch(Exception e){
                        System.out.println("Digito mal");
                    }
                    
                    switch(f){
                        case 1:
                        {
                            System.out.println("Ingrese nombre del producto:");
                            String name = a.nextLine();
                            System.out.println("Puede repetirse la peticion debido a la clase Scanner");
                            name = a.nextLine();
                            System.out.println("Ingrese nombre de la manufactura");
                            String manu = a.nextLine();
                            System.out.println("Ingrese fecha de paso");
                            int fecha = a.nextInt();
                            System.out.println("Ingrese materias primas hasta ingresar 0");
                            Producto producto = new Producto();
                            while(u!=0){
                            String g = a.nextLine();
                            if(g.equals("0")){
                                u=0;
                            }else{
                                producto.getItems().add(g);
                            }
                            }
                            producto.setNombre(name);
                            producto.getFecha().setManufacturer(fecha);
                            System.out.println("fecha");
                            u=100;
                            for(Eslabon y: sistema.getBusiness()){
                                if(y.getNombre().equals(manu)){
                                    ((Manufacturer)y).getProductos().add(producto);
                                }
                            }
                        }   
                        break;
                        case 2:
                        {
                            System.out.println("Ingrese el nombre del producto:");
                            String name = a.nextLine();
                            System.out.println("Puede repetirse la peticion debido a la clase Scanner");
                            name = a.nextLine();
                            System.out.println("Ingrese nombre de la manufactura");
                            String manu = a.nextLine();
                            System.out.println("Ingrese nombre de la distribuidora");
                            String distri = a.nextLine();
                            System.out.println("Ingrese fecha de paso en la distribuidora");
                            int fecha = a.nextInt();
                            Producto paraenviar = new Producto();
                            for(Eslabon y: sistema.getBusiness()){
                                if(y.getNombre().equals(manu)){
                                    ArrayList<Producto> pro = ((Manufacturer)y).getProductos();
                                    for(Producto pr: pro){
                                        if(pr.getNombre().equals(name)){
                                            paraenviar = pr;
                                        }
                                    }
                                }
                            }
                            paraenviar.getFecha().setDistri(fecha);
                            for(Eslabon y: sistema.getBusiness()){
                                if(y.nombre.equals(distri)){
                                    ((DistributionCenter)y).addProducto(paraenviar);
                                }
                            }
                            }
                        break;
                        case 3:
                            {
                            System.out.println("Ingrese el nombre del producto:");
                            String name = a.nextLine();
                            System.out.println("Puede repetirse la peticion debido a la clase Scanner:");
                            name = a.nextLine();
                            System.out.println("Ingrese nombre del distribuidor");
                            String distri = a.nextLine();
                            System.out.println("Ingrese nombre del retail");
                            String reta = a.nextLine();
                            System.out.println("Ingrese fecha de paso en el retail");
                            int date = a.nextInt();
                            System.out.println("Ingrese precio del producto");
                            double precio = a.nextDouble();
                            System.out.println("Ingrese codigo del producto");
                            int codigo = a.nextInt();
                            Producto paraenviar = new Producto();
                            for(Eslabon y: sistema.getBusiness()){
                                if(y.getNombre().equals(distri)){
                                    for(Producto pr: ((DistributionCenter)y).getProductos()){
                                        if(pr.getNombre().equals(name)){
                                            paraenviar = pr;
                                        }
                                    }
                                }
                            }
                            paraenviar.getFecha().setRetail(date);
                            paraenviar.setPrecio(precio);
                            paraenviar.setCodigo(codigo);
                            for(Eslabon y: sistema.getBusiness()){
                                if(y.nombre.equals(reta)){
                                    ((Retail)y).getProductos().add(paraenviar);
                                }
                            }
                            }
                        break;
                    }
                }
                    break;
                case 6:
                {
                    System.out.println("Guardando");
                {
                    try {
                        x.guardar(sistema.getBusiness());
                        
                    } catch (IOException ex) {
                        
                    }
                }
                }
                    break;
                case 7:
                {
                    System.out.println("Cargar");
                    ArrayList<Eslabon> carga = new ArrayList<>();
                    try{
                        carga = x.Cargar();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    sistema.setBusiness(carga);
                    
                }
                    break;
                case 8:
                {
                    System.out.println("Ingrese el nombre del producto del que quiere conocer la traza");
                    String proc = a.nextLine(); 
                    int hora1 = 0;
                    String manu = null;
                    int hora2 = 0;
                    String distri = null;
                    int hora3 = 0;
                    String retail = null;
                    String materiaPrima = " ";
                    String granjas = " ";
                    Producto yy= new Producto();
                    for(Eslabon v: sistema.getBusiness()){
                        
                        if(v instanceof Manufacturer){
                            for(Producto o :((Manufacturer) v).getProductos()){
                                if(o.getNombre().equals(proc)){
                                    yy = o;
                                }
                            }
                        }
                    }
                    for(Eslabon v: sistema.getBusiness()){
                        
                        if(v instanceof Manufacturer){
                            for(Producto o :((Manufacturer) v).getProductos()){
                                if(o.getNombre().equals(proc)){
                                    manu = ((Manufacturer) v).nombre;
                                    hora1=o.getFecha().getManufacturer();
                                    for(String item: o.getItems()){
                                        materiaPrima+= item+", ";
                                    }
                                }
                            }
                        }
                        if(v instanceof DistributionCenter){
                            for(Producto o :((DistributionCenter) v).getProductos()){
                                if(o.getNombre().equals(proc)){
                                    distri = ((DistributionCenter) v).nombre;
                                    hora2=o.getFecha().getDistri();
                                }
                            }
                        }
                        if(v instanceof Retail){
                            for(Producto o :((Retail) v).getProductos()){
                                if(o.getNombre().equals(proc)){
                                    retail = ((Retail) v).nombre;
                                    hora3=o.getFecha().getRetail();
                                }
                            }
                        }
                        if(v instanceof Farmer){
                            for(String i: yy.getItems()){
                                for(String j: ((Farmer)v).getProductos()){
                                if(i.equals(j)){
                                    granjas+=((Farmer) v).nombre+", ";
                                    break;
                                }
                                }
                            }
                        }
                    }
                    System.out.println("El producto pasó por.\n Manufacturadora: "+manu+" con fecha: "+hora1+"\n Distribuidora: "+distri+" con fecha: "+hora2+"\n Retail: "+retail+" con fecha: "+hora3);
                    System.out.println("Su materia prima es:"+materiaPrima);
                    System.out.println("Las granjas encargadas fueron: "+granjas);
                }
                    break;
                
            }
        

            
        }
    
    }
}        
    
