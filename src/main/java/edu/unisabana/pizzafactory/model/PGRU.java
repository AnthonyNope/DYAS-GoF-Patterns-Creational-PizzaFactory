package edu.unisabana.pizzafactory.model;

public class PGRU extends Pizza{
    @Override
    public IMoldear CreateMoldearPizza(){
        return new MOLDEADORPIZZA("Gruesa");
    }

    @Override
    public IAmasar createAmasarPizza(){
        return new AMASADORPIZZA("Gruesa");
    }

    @Override
    public IHornear CreateHornearPizza(){
        return new HORNEADORPIZZA("Gruesa");
    }
    
}
