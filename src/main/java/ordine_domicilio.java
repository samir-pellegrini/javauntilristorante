/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class ordine_domicilio extends ordine {
    private double orario;
    private String indirizzo;
    public ordine_domicilio(int numeroiden,String nomecam,double orario, String indirizzo) {
        super(numeroiden,nomecam);
        this.orario=orario;
        this.indirizzo=indirizzo;
        
    }
    public double sommaord()
    { double prezzo=0;
    int quotadom=2;
        piatto m= new piatto("","");
        for(int i=0; i<ord.size();i++)
        {
            m=(piatto) ord.elementAt(i);
            m.sommmaing();
            
             prezzo= prezzo + m.sommmaing();
        }
        prezzo=prezzo+ quotadom;
       return  prezzo;
    } 
}
