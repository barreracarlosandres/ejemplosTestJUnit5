package com.test.ejemplo_test.metodos_privados;

public class VoidSinParametros {

    private String paraAsignar = "valorInicial";

    @SuppressWarnings("java:S1144")
    private void privateVoidSinParametros(){
        paraAsignar = "asigandoEnMetodoPrivateVoid";
    }

    public String recuperarParametroAsignado(){
        return  this.paraAsignar;
    }
}