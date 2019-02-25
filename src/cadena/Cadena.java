/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.io.IOException;
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
    public static void main(String[] args) {
        Menu b = new Menu();
        Process sistema = new Process();
        String nombre = null;
        String descripcion = null;
        int latitud = 0;
        int longitud = 0;
        Scanner a= new Scanner(System.in);
        int opcion = 0;
        while(true){
            try{
            opcion = b.Options();
            }catch(Exception e){
                System.out.println("Digito mal");
            }
            switch(opcion){
                case 1:
                    System.out.println("1.Crear granja 2. Modificar granja");
                    int c = a.nextInt();
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
                            }catch(Exception e){
                                System.out.println("No digito correctamente");
                            }
                            Direccion dir = new Direccion(latitud,longitud);
                            Eslabon Farmer = new Farmer(nombre,dir,descripcion);
                            sistema.crearEslabon(Farmer);
                            break;
                        case 2:
                            System.out.println();

                        break;
                        
                    }
                break;
                case 2:
                    System.out.println("1.Crear manufacturer 2. Modificar manufacturer");
                    int m = a.nextInt();
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
                case 3:
                    System.out.println("1.Crear distribuidor 2. Modificar distribuidor");
                    int n = a.nextInt();
                    switch(n){
                        case 1:
                            try{
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
                            }catch(Exception e){
                                System.out.println("No digito correctamente");
                            }
                            Direccion dirc = new Direccion(latitud,longitud);
                            Eslabon Dist = new DistributionCenter(nombre,dirc,descripcion);
                            sistema.crearEslabon(Dist);
                            break;
                case 4:
                    System.out.println("1.Crear retail 2. Modificar retail");
                    int o = a.nextInt();
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
                case 5:
                    
                    for(Eslabon x: sistema.getBusiness()){
                        if(x instanceof Farmer){
                            try {
                                ((Farmer) x).guardar();
                            } catch (IOException ex) {
                                System.out.println("No hay archivo");
                            }
                        }
                        if(x instanceof Manufacturer){
                            try {
                                ((Manufacturer) x).guardar();
                            } catch (IOException ex) {
                                System.out.println("No hay archivo");
                            }
                        }
                        if(x instanceof DistributionCenter){
                            try {
                                ((DistributionCenter) x).guardar();
                            } catch (IOException ex) {
                                System.out.println("No hay archivo");
                            }
                        }
                        if(x instanceof Retail){
                            try {
                                ((Retail) x).guardar();
                            } catch (IOException ex) {
                                System.out.println("No hay archivo");
                            }
                        }
                    }
                    break;
                case 6:
                    
                    System.out.println("Cargar");
                    
                    try{
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    break;
            }
            }


             }
    
            }
        }
    }
}