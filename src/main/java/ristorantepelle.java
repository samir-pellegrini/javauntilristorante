/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class ristorantepelle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        piatto puno= new piatto("capra arrosto","secondo");
        piatto pdue= new piatto("cavallo arrosto","secondo");
        Ingredienti uno= new Ingredienti("capra", 1, 20.0);
          Ingredienti quattro= new Ingredienti("cavolo", 1, 4.0);
        Ingredienti tre=new Ingredienti("patata",1,2.0);
        Ingredienti due= new Ingredienti("cavallo",1,30.0);
        ristorante r1= new ristorante();
        ordine otre= new ordine(1234,"giovanni"); 
        ordine_tavolo ouno= new ordine_tavolo(1234,"giacomo");
        ordine_domicilio odue= new ordine_domicilio(1226,"angelo",21,"via di brozzi");
        
        puno.addingre(uno);
        puno.addingre(quattro);
        pdue.addingre(due);
        pdue.addingre(tre);
        
        r1.addpatt(puno);
        r1.addpatt(pdue);
        
        ouno.addpatts(puno);
        odue.addpatts(pdue);
        
        ouno.sommaord();
        odue.sommaord();
        
        System.out.println("la somma è" +   ouno.sommaord());
       System.out.println("la somma è" +   odue.sommaord());
    }
    
}
