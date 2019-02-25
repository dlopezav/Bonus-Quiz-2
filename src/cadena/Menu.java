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
        System.out.println("1. Gestion granja\n2. Gestion Manufacturer\n 3.Gestion Distri\n4.Gestion Retail\n5.Guardar registro\n6.Cargar registro");
        Scanner a= new Scanner(System.in);
        int b = a.nextInt();
        return b;
    }
}
