package programa;

import java.util.ArrayList;

public class PronosticoDeportivo {
    private ArrayList<Participante>listaParticipantes;
    private ArrayList<Equipo>listaEquipos;
    private ArrayList<Partido>listaPartidos;

    public PronosticoDeportivo() {
        this.listaParticipantes = new ArrayList<>();
        this.listaEquipos = new ArrayList<>();
        this.listaPartidos = new ArrayList<>();
    }

    public ArrayList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    @Override
    public String toString() {
        return "PronosticoDeportivo{" +
                "listaParticipantes=" + this.listaParticipantes +
                ", listaEquipos=" + this.listaEquipos +
                ", listaPartidos=" + this.listaPartidos +
                '}';
    }
}
