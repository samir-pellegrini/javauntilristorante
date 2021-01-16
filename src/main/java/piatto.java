
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
public class piatto {
    
private String nome;
private String tipo;
    Vector<Ingredienti> ingre;

    public piatto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        ingre=new Vector <Ingredienti> ();
    }

    public void addingre(Ingredienti i)
    {
      ingre.addElement(i); 
    }
    public void removeingre(int i)
    {
        ingre.removeElementAt(i);
    }
    
    public double sommmaing()
    {
         /* si crea una variabile di tipo ingrediente dove si 
       salvano le informazioni
        
        dopo con get si estrae il dato e si somma a tot
        ElementAt prende il dato
       */
       Ingredienti m= new Ingredienti("", 0, 0.0);
       double tot =0.0;
    for(int i=0; i<ingre.size(); i++)
    {
          m=(Ingredienti) ingre.elementAt(i);
          
           //if(m.getquantita() >1 )
          //{ 
       // tot= m.getquantita() * m.getcosto();
       //     }
      
         
              tot=tot + m.getcosto();
         
    }
    
    return  tot;
}
   
}
