package com.test.ejemplo_test.metodos_privados;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ExtendWith(MockitoExtension.class)
class VoidSinParametrosTest {

    @InjectMocks
    VoidSinParametros voidSinParametros;

    @Test
    void voidSinParametros() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Method privateMethod = VoidSinParametros.class.getDeclaredMethod("privateVoidSinParametros");
        privateMethod.setAccessible(true);
        privateMethod.invoke(voidSinParametros);

        Assertions.assertEquals("asigandoEnMetodoPrivateVoid", voidSinParametros.recuperarParametroAsignado());
    }

    @Test
    void getParaAsignar(){
        Assertions.assertEquals("valorInicial", voidSinParametros.recuperarParametroAsignado());
    }
}