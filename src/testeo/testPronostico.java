package testeo;

import programa.Equipo;
import programa.Partido;
import programa.Pronostico;

public class testPronostico {
    public static void main(String[] args) {

        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        Pronostico pronostico = new Pronostico();
        Partido partido = new Partido();

        equipo1.setNombre("River");
        equipo1.setDescripcion("equipo de futbol Argentino");
        equipo2.setNombre("boca");
        equipo2.setDescripcion("equipo chico del futbol Argentino");

        pronostico.setResultado('G');
        pronostico.setEquipo(equipo1);
        partido.setEquipo1(equipo1);
        partido.setEquipo1(equipo2);
        pronostico.getPartido().setEquipo1(equipo1);
        pronostico.getPartido().setEquipo2(equipo2);
        pronostico.getPartido().setGolesEquipo1(2);
        pronostico.getPartido().setGolesEquipo2(1);


        System.out.println(pronostico);

    }
}
