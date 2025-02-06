package edu.unisabana.pizzafactory.model;

public class HORNEADORPIZZA implements IHornear {
    private String TMASA;

    public HORNEADORPIZZA (String TMASA){
        this.TMASA = TMASA;
    }

    @Override
    public void hornear(){
        System.out.println("Horneando pizza con tipo de masa : "+ TMASA );
    }
}
