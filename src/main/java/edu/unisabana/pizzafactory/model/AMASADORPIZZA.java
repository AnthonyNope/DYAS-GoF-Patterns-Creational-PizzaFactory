package edu.unisabana.pizzafactory.model;

public class AMASADORPIZZA  implements IAmasar{
    private String TMASA;

    public AMASADORPIZZA(String TMASA){
        this.TMASA = TMASA;

    }

    @Override
    public void amasar(){
        System.out.println("Amasando pizza con tipo de masa : " + TMASA );

    }
}
