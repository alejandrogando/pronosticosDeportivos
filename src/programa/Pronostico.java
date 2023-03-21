package programa;

public class Pronostico {
 private Equipo equipo;
    private Partido partido;
    private char resultado;

    public Pronostico() {
        this.equipo = new Equipo();
        this.partido = new Partido();
        this.resultado = ' ';
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public char getResultado() {
        return resultado;
    }

    public void setResultado(char resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Pronostico{" +
                "equipo=" + this.equipo +
                ", partido=" + this.partido +
                ", resultado=" + this.resultado +
                '}';
    }
}
