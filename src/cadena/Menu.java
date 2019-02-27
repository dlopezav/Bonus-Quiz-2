/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.util.Scanner;

/**
 *
 * @author dlopezav
 */
public class Menu {
    int a;
    public Menu() {
        this.a = 0;
    }
    
    public int Options(){
        System.out.println("CARGAR ANTES DE USAR\n1. Creacion granja\n2. Creacion Manufacturer\n3. Creacion Distribuidores\n4. Creacion Retail\n5. Gestion del comercio\n6. Guardar registro\n7. Cargar registro\n8.Traza/Compra de producto");
        Scanner a= new Scanner(System.in);
        int b = a.nextInt();
        return b;
    }
    public int ventas(){
        System.out.println("\n1. Asignar producto a Manufactura \n2. Asignar producto de manufactura a distribuidor \n3. Asignar producto de distribuidor a retail");
        Scanner a= new Scanner(System.in);
        int b = a.nextInt();
        return b;
    }
}
