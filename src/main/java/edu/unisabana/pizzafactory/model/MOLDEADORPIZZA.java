package edu.unisabana.pizzafactory.model;

public class MOLDEADORPIZZA implements IMoldear{
    private String TMASA;

    public MOLDEADORPIZZA (String TMASA){
        this.TMASA = TMASA;
    }

    @Override
    public void moldearPizzaPequena (){
        System.out.println("Moldeando pizza pequeña con masa de :"+TMASA);
    }

    @Override
    public void moldearPizzaMediana (){
        System.out.println("Moldeando pizza grande con masa de : "+TMASA);
    }
}
