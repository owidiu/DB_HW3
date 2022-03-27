package com.company;

public enum Type {
    MARGUERITA("Marguerita"),
    PROSCIUTTOFUNGHI("ProsciuttoFunghi"),
    CAPRICIOSA("Capriciosa"),
    QUATROSTAGIONI("QuatroStagioni");

    private String type;

    Type (String type){
        this.type = type;
    }

    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
