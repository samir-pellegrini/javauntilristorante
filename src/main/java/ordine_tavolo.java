/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class ordine_tavolo extends ordine{
      
 public ordine_tavolo(int numeroiden,String nomecam) {
 super(numeroiden,nomecam);
 }
 
   public double sommaord()
    { double prezzo=0;
        piatto m= new piatto("","");
        for(int i=0; i<ord.size();i++)
        {
            m=(piatto) ord.elementAt(i);
            m.sommmaing();
            
             prezzo= prezzo + m.sommmaing();
        }
       return  prezzo;
    }

}
