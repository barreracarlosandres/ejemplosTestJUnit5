package com.test.ejemplo_test.con_parametros;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junitpioneer.jupiter.CartesianValueSource;

class OperacionesMatematicasTest {

    @ParameterizedTest
    @ValueSource(ints = { -1, 0, 1, 2, 3 })
    void duplicar(int x) {

        //arrange
        int respuestaOperacion = 0;
        int respuestaEsperada = x + x;
        //act
        respuestaOperacion = OperacionesMatematicas.duplicar(x);
        //assert
        Assertions.assertNotNull(respuestaOperacion);
        Assertions.assertEquals(respuestaEsperada, respuestaOperacion);
    }

    @ParameterizedTest
    @CsvSource({"1,1", "1,2", "1,3"})
    void sumar(int x, int y){
        //arrange
        int respuestaEsperada = x + y;
        int respuestaOperacion = 0;
        //act
        respuestaOperacion = OperacionesMatematicas.sumar(x,y);
        //assert
        Assertions.assertNotNull(respuestaOperacion);
        Assertions.assertEquals(respuestaEsperada, respuestaOperacion);
    }
}