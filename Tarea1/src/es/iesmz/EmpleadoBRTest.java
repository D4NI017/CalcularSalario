package es.iesmz;

import org.junit.jupiter.api.Test;

import static es.iesmz.TipoEmpleado.venedor;
import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {
    @Test
    public void testCalcularSalarioBruto1() {
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(venedor, 2000.0f, 8.0f);
        float resultadoEsperado = 1360.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalcularSalarioNeto1() {
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(2000);
        float resultadoEsperado = 1640;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalcularSalarioNeto2() {
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(1500);
        float resultadoEsperado = 1230;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalcularSalarioNeto3() {
        float resultadoReal = EmpleadoBR.calcularSalarioNeto((float) 1499.99);
        float resultadoEsperado = (float) 1259.9916;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalcularSalarioNeto4() {
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(1250);
        float resultadoEsperado = 1050;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalcularSalarioNeto5() {
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(1000);
        float resultadoEsperado = 840;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalcularSalarioNeto6() {
        float resultadoReal = EmpleadoBR.calcularSalarioNeto((float) 999.99);
        float resultadoEsperado = (float) 999.99;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalcularSalarioNeto7() {
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(500);
        float resultadoEsperado = 500;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalcularSalarioNeto8() {
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(0);
        float resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalcularSalarioNeto9() {
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(-1);
        float resultadoEsperado = -1;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalcularSalarioBruto10() {
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(venedor, 2000, 8 );
        float resultadoEsperado = 1360;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
}