package com.test.ejemplo_test.ejemplos;

public class PrivateMetodos {

    private String paraAsignar = "valorInicial";

    private void privateVoidSinParametros(){
        paraAsignar = "asigandoEnMetodoPrivateVoid";
    }

    public String getParaAsignar(){
        return  this.paraAsignar;
    }
}
