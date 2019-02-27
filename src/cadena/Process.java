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
public class Process {
    private ArrayList<Eslabon> business;

    public Process() {
        this.business = new ArrayList<>();
    }

    public ArrayList<Eslabon> getBusiness() {
        return business;
    }

    public void setBusiness(ArrayList<Eslabon> business) {
        this.business = business;
    }
    
    public void crearEslabon(Eslabon a){
        business.add(a);
    }
     
}
