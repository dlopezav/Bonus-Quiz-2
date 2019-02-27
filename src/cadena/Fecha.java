/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

/**
 *
 * @author dfeli
 */
class Fecha {
    private int Retail;
    private int Manufacturer;
    private int Distri;

    public Fecha() {
        this.Retail = Retail;
        this.Manufacturer = Manufacturer;
        this.Distri = Distri;
    }

    public int getRetail() {
        return Retail;
    }

    public void setRetail(int Retail) {
        this.Retail = Retail;
    }

    public int getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(int Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public int getDistri() {
        return Distri;
    }

    public void setDistri(int Distri) {
        this.Distri = Distri;
    }

    public Fecha(int Retail, int Manufacturer, int Distri) {
        this.Retail = Retail;
        this.Manufacturer = Manufacturer;
        this.Distri = Distri;
    }

    
    
}
