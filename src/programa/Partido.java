package programa;

import java.util.Random;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    public Partido() {
        this.equipo1 = new Equipo();
        this.equipo2 = new Equipo();
        Random rand = new Random();
        this.golesEquipo1 = rand.nextInt(2);
        this.golesEquipo2 = rand.nextInt(2);
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    /**
     * funcion que determina si el equipo que se consulto gano/perdio/empato
     * @param equipo mando un equipo
     * @return devuelve un char g/e/p
     */
    public char getResultado(Equipo equipo){
        char res = ' ';
        if(equipo.getNombre().equals(equipo1.getNombre())){
            if (golesEquipo1 > golesEquipo2){
                res = 'G';
            } else if (golesEquipo1 < golesEquipo2) {
                res = 'P';
            }else {
                res = 'E';
            }
        }
        if(equipo.getNombre().equals(equipo2.getNombre())){
            if(golesEquipo2 > golesEquipo1){
                res = 'G';
            } else if (golesEquipo2 < golesEquipo1) {
             res = 'P';
            }else {
                res = 'E';
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipo1=" + this.equipo1 +
                ", equipo2=" + this.equipo2 +
                ", golesEquipo1=" + this.golesEquipo1 +
                ", golesEquipo2=" + this.golesEquipo2 +
                '}';
    }
}
