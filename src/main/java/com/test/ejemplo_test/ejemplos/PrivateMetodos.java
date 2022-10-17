package com.test.ejemplo_test.ejemplos;

public class PrivateMetodos {

    private String paraAsignar = "inicial";

    private void voidSinParametros(){
        paraAsignar = "funciono";
    }


    public String getParaAsignar(){
        return  this.paraAsignar;
    }
}
