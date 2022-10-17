package com.test.ejemplo_test.ejemplos;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootTest
 class PrivateMetodosTest {

    @InjectMocks
    PrivateMetodos privateMetodos;

    @Test
    void voidSinParametros() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Method privateMethod = PrivateMetodos.class.getDeclaredMethod("privateVoidSinParametros");
        privateMethod.setAccessible(true);
        privateMethod.invoke(privateMetodos);

        Assertions.assertEquals("asigandoEnMetodoPrivateVoid", privateMetodos.getParaAsignar());
    }

    @Test
    void getParaAsignar(){
        Assertions.assertEquals("valorInicial", privateMetodos.getParaAsignar());
    }
}