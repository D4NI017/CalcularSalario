package es.iesmz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {
    @Test
    public void testCalcularSalarioBruto1() {
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.venedor, 2000.0f, 8.0f);
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
}