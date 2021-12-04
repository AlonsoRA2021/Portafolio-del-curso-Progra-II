package test.Entidades;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Entidades.ObjetoMadera;
import Entidades.ObjetoMetalico;
import Entidades.ObjetoPlastico;
import Servicios.Calculador;

public class CalculadorTest {
    @Test
    public void calculadorPosicionMadera(){
        final int resultado = Calculador.calcularPosicion(new ObjetoMadera(10));
        assertEquals(20, resultado);
    }
    @Test
    public void calculadorPosicionMetalico(){
        final int resultado = Calculador.calcularPosicion(new ObjetoMetalico(10));
        assertEquals(23, resultado);
    }
    @Test
    public void calculadorPosicionPlastico(){
        final int resultado = Calculador.calcularPosicion(new ObjetoPlastico(10));
        assertEquals(33, resultado);
    }
}
