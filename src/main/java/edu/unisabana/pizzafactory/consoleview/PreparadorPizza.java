
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.*;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Pizza;
import edu.unisabana.pizzafactory.model.Tamano;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp = new PreparadorPizza();    
            Pizza pizza = seleccionarPizzaAleatoria();  
            Tamano tamano = seleccionarTamanoAleatorio();      
            pp.prepararPizza(pizza, ingredientes, tamano);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(Pizza pizza, Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {
        IAmasar am = new pizza.createAmasarPizza();
        IHornear hpd = new pizza.createHornearPizza();
        IMoldear mp = new pizza.createMoldearPizza();
        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }

	    aplicarIngredientes(ingredientes);
        h.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }

    private static Pizza seleccionarPizzaAleatorio(){
        Random r = new Random();
        int TPizza = r.nextInt(3);

        switch(TPizza){
            case 0:
                return new PDEL();
            case 1:
                return new PGRU();
            case 2:
                return new PINTE();
            default:
                throw new IllegalStateException("Valor invalido de tipo de Pizza: " + tipoPizza);
        }
    }

    private static Tamano seleccionarTamanoAleatorio(){
        Random r = new Random();
        int TTamano = r.nextInt(Tamano.values().length);

        return Tamano.values()[TTamano];
    }
}
