package Servicios;

import Entidades.ObjetoMadera;
import Entidades.ObjetoMetalico;
import Entidades.ObjetoPlastico;

public class Calculador {
    public static int calcularPosicion(ObjetoMadera saltador){
        return saltador.saltar();
    }
    public static int calcularPosicion(ObjetoMetalico saltador){
        return saltador.saltar();
    }
    public static int calcularPosicion(ObjetoPlastico saltador){
        return saltador.saltar();
    }
}
