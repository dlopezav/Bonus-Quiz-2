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
