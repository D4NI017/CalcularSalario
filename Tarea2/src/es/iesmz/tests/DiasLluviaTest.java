package es.iesmz.tests;

import es.iesmz.tests.DiasLluvia;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiasLluviaTest {
    @Test
    public void test1RegistroDia(){ //Test para registrar un dia que existe
        boolean resultadoReal = DiasLluvia.registroDia(13, 5, true);
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2RegistroDia(){ //Test para registrar un dia que existe
        boolean resultadoReal = DiasLluvia.registroDia(22, 7, false);
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3RegistroDia(){ //Test para registrar un dia que no existe
        boolean resultadoReal = DiasLluvia.registroDia(43, 13, true);
        boolean resultadoEsperado = true;
        assertNotEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test1consultarDia(){ //Test para consultar un dia que no se ha registrado como lluvia anteriormente
        boolean resultadoReal = DiasLluvia.consultarDia(1, 3);
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2consultarDia(){ //Test para consultar un dia que no se ha registrado como lluvia anteriormente
        boolean resultadoReal = DiasLluvia.consultarDia(9, 23);
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3consultarDia(){ //Test para consultar un dia que no se ha registrado como lluvia anteriormente y indicamos como resultado esperado True
        boolean resultadoReal = DiasLluvia.consultarDia(7, 30);
        boolean resultadoEsperado = true;
        assertNotEquals(resultadoEsperado, resultadoReal);
    }

    //No se como realizar este test ya que no he creado un programa en el que registrar datos por lo tanto al no tener ningun dia
    // como true no me da el resultado que quiero
    @Test
    public void test1trimestreLluvioso(){
        int resultadoReal = DiasLluvia.trimestreLluvioso();
        int resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test1primerDiaDeLluvia(){ //Al no tener ningun dia como true el resultado esperado es 0
        int resultadoReal = DiasLluvia.primerDiaLluvia();
        int resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2primerDiaDeLluvia(){ //Al no tener ningun dia como true el resultado esperado es 0 si ponemos > 0 no coincide por eso no se realiza otro test que lo pase
        int resultadoReal = DiasLluvia.primerDiaLluvia();
        int resultadoEsperado = 5;
        assertNotEquals(resultadoEsperado, resultadoReal);
    }
}