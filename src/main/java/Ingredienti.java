/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
class Ingredienti {

    private String nomeing;
    private int quantita;
    private double costo;

    public Ingredienti(String nomeing, int quantita, double costo) {
        this.nomeing = nomeing;
        this.quantita = quantita;
        this.costo = costo;
    }

    public String getnomeing() {
        return nomeing;
    }

    public int getquantita() {
        return quantita;
    }

    public double getcosto() {
        return costo;
    }

    public void setnomeing(String nomeing) {
        this.nomeing = nomeing;
    }

    public void setquantita(int quantita) {
        this.quantita = quantita;
    }

    public void setcosto(double costo) {
        this.costo = costo;
    }


   
    
      
}
