package testeo;

import programa.Equipo;
import programa.Partido;

public class testPartido {
    public static void main(String[] args) {
        Partido partido = new Partido();
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        char resultado = ' ';
        partido.getEquipo1().setNombre("River");
        partido.getEquipo1().setDescripcion("equipo de futbol Argentino");
        partido.getEquipo2().setNombre("boca");
        partido.getEquipo2().setDescripcion("equipo chico del futbol Argentino");





        resultado = partido.getResultado(partido.getEquipo1());
        System.out.println(" el equipo de"+partido.getEquipo1()+ "Resultado: "+resultado);
        System.out.println(partido);
    }
}
