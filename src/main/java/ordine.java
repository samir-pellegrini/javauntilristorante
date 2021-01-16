
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class ordine {
    private int numeroiden;
      private String nomecam;
    private double prezzo;
    Vector <piatto> ord;

    public int getNumeroiden() {
        return numeroiden;
    }

    public String getNomecam() {
        return nomecam;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public Vector<piatto> getOrd() {
        return ord;
    }

    public void setNumeroiden(int numeroiden) {
        this.numeroiden = numeroiden;
    }

    public void setNomecam(String nomecam) {
        this.nomecam = nomecam;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setOrd(Vector<piatto> ord) {
        this.ord = ord;
    }

    
    public ordine(int numeroiden,String nomecam) {
        this.numeroiden = numeroiden;
        this.nomecam=nomecam;
        ord= new Vector <piatto>(); 
    }
    public void addpatts(piatto i)
    {
      ord.addElement(i); 
    }
    public void removepatts(piatto i)
    {
        ord.removeElement(i);
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
    
    public double confronto()
            { 
                double max=0;
                piatto m= new piatto("","");// nn si mette il vettore tra le parentesi 
                for(int i=0;i<ord.size();i++)
                {
                     m=(piatto) ord.elementAt(i);
                     m.sommmaing();
                     if(m.sommmaing()>max)
                     {
                         max= m.sommmaing();
                     }
                    
                }
                return max;
            }
}
