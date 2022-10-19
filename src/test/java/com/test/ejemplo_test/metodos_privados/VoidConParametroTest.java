package com.test.ejemplo_test.metodos_privados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootTest
class VoidConParametroTest {

    @InjectMocks
    VoidConParametro voidConParametro;

    @Test
    void voidSinParametros() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Method privateMethod = VoidConParametro.class.getDeclaredMethod("privateVoidMetodoConParametro", String.class);
        privateMethod.setAccessible(true);
        privateMethod.invoke(voidConParametro, "nuevoValor");

        Assertions.assertEquals("nuevoValor", voidConParametro.recuperarParametroAsignado());
    }

    @Test
    void getParaAsignar(){
        Assertions.assertEquals("valorInicial", voidConParametro.recuperarParametroAsignado());
    }
}