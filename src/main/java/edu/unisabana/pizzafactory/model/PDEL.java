package edu.unisabana.pizzafactory.model;

public class PDEL extends Pizza{

    @Override
    public IMoldear CreateMoldearPizza(){
        return new MOLDEADORPIZZA("Delgada");
    }

    @Override
    public IAmasar createAmasarPizza(){
        return new AMASADORPIZZA("Delgada");

    }

    @Override
    public IHornear CreateHornearPizza(){
        return new HORNEADORPIZZA("Delgada");
    }

   
}
