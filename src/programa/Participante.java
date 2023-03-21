package programa;

import java.util.ArrayList;

public class Participante {
    private String nombre;
    private ArrayList<Pronostico>listaPronosticos;

    public Participante() {
        this.nombre = "";
        this.listaPronosticos = new ArrayList<Pronostico>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pronostico> getListaPronosticos() {
        return listaPronosticos;
    }

    public void setListaPronosticos(ArrayList<Pronostico> listaPronosticos) {
        this.listaPronosticos = listaPronosticos;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + this.nombre + '\'' +
                ", listaPronosticos=" + this.listaPronosticos +
                '}';
    }
}
