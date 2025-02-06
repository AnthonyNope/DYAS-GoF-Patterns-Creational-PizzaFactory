package edu.unisabana.pizzafactory.model;

public abstract class Pizza {
    public abstract IAmasar createAmasarPizza();
    public abstract IHornear createHornearPizza();
    public abstract IMoldear createMoldearPizza();

    public void PrepararPizza(){
        createAmasarPizza().amasar();
        createHornearPizza().hornear();
        createMoldearPizza().moldear();
    }
}
