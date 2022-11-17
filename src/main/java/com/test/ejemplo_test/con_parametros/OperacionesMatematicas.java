package com.test.ejemplo_test.con_parametros;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OperacionesMatematicas {

    public static Integer duplicar(Integer numero)
    {
        return numero * 2;
    }

    public static Integer sumar(Integer numero1, Integer numero2)
    {
        return numero1 + numero2;
    }
}