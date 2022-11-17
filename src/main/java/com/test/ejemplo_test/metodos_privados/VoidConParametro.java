package com.test.ejemplo_test.metodos_privados;

public class VoidConParametro {

    private String paraAsignar = "valorInicial";

    @SuppressWarnings("java:S1144")
    private void privateVoidMetodoConParametro(String nuevoValor){
        this.paraAsignar = nuevoValor;
    }

    public String recuperarParametroAsignado(){
        return  this.paraAsignar;
    }
}