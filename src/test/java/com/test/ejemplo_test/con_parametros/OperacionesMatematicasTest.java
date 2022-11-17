package com.test.ejemplo_test.con_parametros;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class OperacionesMatematicasTest {

    private Integer respuestaOperacion = null;
    private Integer respuestaEsperada = null;

    @ParameterizedTest
    @ValueSource(ints = { -1, 0, 1, 2, 3 })
    void duplicar(Integer x) {

        //arrange
        respuestaEsperada = x + x;
        //act
        respuestaOperacion = OperacionesMatematicas.duplicar(x);
        //assert
        Assertions.assertNotNull(respuestaOperacion);
        Assertions.assertEquals(respuestaEsperada, respuestaOperacion);
    }

    @ParameterizedTest
    @CsvSource({"1,1", "1,2", "1,3"})
    void sumar(Integer x, Integer y){
        //arrange
        respuestaEsperada = x + y;
        //act
        respuestaOperacion = OperacionesMatematicas.sumar(x,y);
        //assert
        Assertions.assertNotNull(respuestaOperacion);
        Assertions.assertEquals(respuestaEsperada, respuestaOperacion);
    }
}