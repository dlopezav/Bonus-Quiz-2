/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author dfeli
 */
public class GestionRegistro {
    private String ruta;
    
    public GestionRegistro(String ruta) {
        this.ruta = ruta;
    }
    
    
    public ArrayList<Eslabon> Cargar() throws FileNotFoundException, IOException {
        ArrayList<Eslabon> eslabones = new ArrayList<>();
        FileInputStream fa = new FileInputStream (new File("Archivos/Cadena")); 
        BufferedReader lfa = new BufferedReader(new InputStreamReader(fa));
        
         String q = lfa.readLine();
        while(lfa.ready()){
            
            q = lfa.readLine();
            
            if(q.contains("Farm:")){
                String[] r = q.split(":");
                System.out.println(r[0]);
                Direccion d = new Direccion(Integer.parseInt(r[3]),Integer.parseInt(r[4]));
                Farmer farm = new Farmer(r[1],d,r[2]);
                String cl = lfa.readLine();
                if(cl.contains("Cultivo:")){
                    String[] cul = cl.split(":");
                    for(int i=1; i<cul.length;i++){
                        farm.addProducto(cul[i]);
                    }
                }else{
                    q = cl;
                }
                eslabones.add(farm);
            }
        }
        fa.getChannel().position(0);
        lfa = new BufferedReader(new InputStreamReader(fa));
            while(lfa.ready()){
                q = lfa.readLine();
            if(q.contains("ManuF")){
                String[] r = q.split(":");
                System.out.println(r[0]);
                Direccion d= new Direccion(Integer.parseInt(r[3]),Integer.parseInt(r[4]));
                Manufacturer manu = new Manufacturer(r[1],d,r[2]);
                boolean h=true;
                while(lfa.ready()&&h){
                String o = null;
                o = lfa.readLine();
                if(o.contains("-")){
                    String[] s = o.split(":");
                    Producto producto = new Producto();
                    producto.setNombre(s[1]);
                    producto.getFecha().setManufacturer(Integer.parseInt(s[2]));
                    producto.getTraza().add(s[3]);
                    for(int i=4;i<s.length;i++){
                    producto.getItems().add(s[i]);
                    }
                    manu.addProducto(producto);
                }else{
                    h=false;
                    q=o;
                }
                
                }
                eslabones.add(manu);
            }
            }
            fa.getChannel().position(0);
            lfa = new BufferedReader(new InputStreamReader(fa));
            while(lfa.ready()){
                q = lfa.readLine();
            if(q.contains("Distri")){
                String[] r = q.split(":");
                System.out.println(r[0]);
                Direccion d= new Direccion(Integer.parseInt(r[3]),Integer.parseInt(r[4]));
                DistributionCenter manu = new DistributionCenter(r[1],d,r[2]);
                boolean h=true;
                while(h&&lfa.ready()){
                String o = null;
                o = lfa.readLine();
                if(o.contains("-")){
                    String[] s = o.split(":");
                    Producto producto = new Producto();
                    producto.setNombre(s[1]);
                    producto.getFecha().setDistri(Integer.parseInt(s[2]));
                    
                    manu.addProducto(producto);
                }else{
                    h=false;
                    q=o;
                }
                }
                eslabones.add(manu);
            }
            }
            fa.getChannel().position(0);
            lfa = new BufferedReader(new InputStreamReader(fa));
            while(lfa.ready()){
                q = lfa.readLine();
            if(q.contains("Retail")){
                String[] r = q.split(":");
                System.out.println(r[0]);
                Direccion d= new Direccion(Integer.parseInt(r[3]),Integer.parseInt(r[4]));
                Retail manu = new Retail(r[1],d,r[2]);
                boolean h=true;
                while(h&&lfa.ready()){
                String o = null;
                o = lfa.readLine();
                if(o.contains("-")){
                    String[] s = o.split(":");
                    Producto producto = new Producto();
                    producto.setNombre(s[1]);
                    producto.setPrecio(Double.parseDouble(s[2]));
                    producto.getFecha().setManufacturer(Integer.parseInt(s[3]));
                    producto.getFecha().setDistri(Integer.parseInt(s[4]));
                    producto.getFecha().setRetail(Integer.parseInt(s[5]));
                    producto.setCodigo(Integer.parseInt(s[6]));
                    manu.addProducto(producto);
                }else{
                    h=false;
                    q=o;
                }
                }
                eslabones.add(manu);
            }
            
        }
        fa.getChannel().position(0);
        return eslabones;
        
    }
     public boolean guardar(ArrayList<Eslabon> arr) throws FileNotFoundException, IOException{
        File bb = new File(this.ruta);
        if(!bb.exists()){
            bb.createNewFile();
        }
        PrintWriter archivo = new PrintWriter(bb);
        for(Eslabon z: arr){
            if(z instanceof Farmer){
                archivo.print("\nFarm:"+((Farmer) z).getNombre()+":"+((Farmer) z).descripcion+":"+z.getDireccion().getLatitud()+":"+z.getDireccion().getLongitud()+"\n");
                archivo.print("Cultivo:");
                for(String p: ((Farmer) z).getProductos()){
                    archivo.print(p+":");
                }
                archivo.print("\n");
            }
            if(z instanceof Manufacturer){
                archivo.print("\nManuF:"+((Manufacturer) z).getNombre()+":"+((Manufacturer) z).descripcion+":"+z.getDireccion().getLatitud()+":"+z.getDireccion().getLongitud());
                
                ArrayList<Producto> pro = ((Manufacturer) z).getProductos();
                for(Producto p: pro){
                    p.añadirTraza(((Manufacturer) z).nombre);
                    archivo.print("\n"+"-"+":"+p.getNombre()+":"+p.getFecha().getManufacturer()+":"+p.getTraza().get(0)+":");
                    for(String i: p.getItems()){
                        archivo.print(i+":");
                    }
                }
                archivo.print("\n");
            }
            if(z instanceof DistributionCenter){
                archivo.print("\nDistri:"+((DistributionCenter) z).getNombre()+":"+((DistributionCenter) z).descripcion+":"+z.getDireccion().getLatitud()+":"+z.getDireccion().getLongitud());
                ArrayList<Producto> pro = ((DistributionCenter) z).getProductos();
                for(Producto p: pro){
                    archivo.print("\n"+"-"+":"+p.getNombre()+":"+p.getFecha().getDistri());
                }
                archivo.print("\n");
            }
            if(z instanceof Retail){
                archivo.print("\nRetail:"+((Retail) z).getNombre()+":"+((Retail) z).descripcion+":"+z.getDireccion().getLatitud()+":"+z.getDireccion().getLongitud());
                for(Producto p: ((Retail) z).getProductos()){
                    System.out.println(p.getFecha().getManufacturer());
                    archivo.print("\n"+"-"+":"+p.getNombre()+":"+p.getPrecio()+":"+p.getFecha().getManufacturer()+":"+p.getFecha().getDistri()+":"+p.getFecha().getRetail()+":"+p.getCodigo()+":");
                }
                archivo.print("\n");
            }
        }
        archivo.flush();
        archivo.close();
        return true;
    }
}
