package edu.unisabana.pizzafactory.model;

public class PINTE extends Pizza {
    @Override
    public IMoldear CreateMoldearPizza(){
        return new MOLDEADORPIZZA("Integral");
    }

    @Override
    public IAmasar createAmasarPizza(){
        return new AMASADORPIZZA("Integral");

    }

    @Override
    public IHornear CreateHornearPizza(){
        return new HORNEADORPIZZA("Integral");
    }
    
}
