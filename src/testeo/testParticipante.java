package testeo;

import programa.Participante;

public class testParticipante {
    public static void main(String[] args) {
        Participante participante = new Participante();

        participante.setNombre("alejandro");
        participante.getListaPronosticos();

        System.out.println(participante);

    }
}
