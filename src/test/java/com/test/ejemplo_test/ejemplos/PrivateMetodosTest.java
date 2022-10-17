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

        Method privateMethod = PrivateMetodos.class.getDeclaredMethod("voidSinParametros");
        privateMethod.setAccessible(true);
        privateMethod.invoke(privateMetodos);

        Assertions.assertEquals("funciono", privateMetodos.getParaAsignar());
    }

    @Test
    void getParaAsignar(){
        Assertions.assertEquals("inicial", privateMetodos.getParaAsignar());
    }
}