import programa.Equipo;
import programa.Participante;
import programa.Partido;
import programa.Pronostico;

import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.ArrayList;
import java.util.Scanner;

public class testMain {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Participante> listaParticipantes = new ArrayList<>();
    static ArrayList<String> participantes = new ArrayList<>();

    static ArrayList<Equipo> listaEquipos = new ArrayList<>();
    static ArrayList<Partido> listaPartidos = new ArrayList<>();
    static ArrayList<Pronostico> listaPronosticos = new ArrayList<>();

    public static void main(String[] args) {
        ///armado de equipos
        Equipo equipo1 = new Equipo("River", " barrio de Belgrano");
        Equipo equipo2 = new Equipo("Boca", "barrio de la boca");
        Equipo equipo3 = new Equipo("Racing", "avellaneda");
        Equipo equipo4 = new Equipo("Independiente", "Avellaneda");

        listaEquipos.add(equipo1);
        listaEquipos.add(equipo2);
        listaEquipos.add(equipo3);
        listaEquipos.add(equipo4);


        int op;
        do {
            System.out.println("*********************PRONOSTICOS DEPORTIVOS**********************");
            System.out.println("1-Crear Pronostico Deportivo");
            System.out.println("2-Cargar Equipos");
            System.out.println("3-Listar Pronosticos");
            System.out.println("4-Listar Equipos");
            System.out.println("5-Listar Participantes");
            System.out.println("");
            System.out.println("");
            System.out.print("ingrese opcion:");
            op = scan.nextInt();
            scan.nextLine();
            switch (op) {

                case 1:
                    creaPronostico();
                    break;
                case 2:
                    cargarEquipo();
                    break;
                case 3:
                    listarPronosticos();
                    break;
                case 4:
                    listarEquipos();
                    break;
                case 5:
                    listarParticipantes();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;

                default:
                    System.out.print("opciopn invalida reingrese");
            }
        } while (op != 9);
    }

    public static void creaPronostico() {
        ////variables de entorno

        String nombreParticipante;
        String nombreEquipo;
        String nombreEquipoRival;
        char resultado;
        int pos;
        int posRival;
        Equipo equipoRival;

        char control = ' ';
        ////// carga de participante

        Participante participante = new Participante();

        System.out.println("Ingrese nombre del Participante");
        nombreParticipante = scan.nextLine();
        participante.setNombre(nombreParticipante);

        /////carga de pronostico

        do {
            Pronostico pronostico = new Pronostico();
            ///Carga el equipo favorito
            System.out.println("Ingrese nombre de su Equipo");
            nombreEquipo = scan.nextLine();
            pos = buscarEquipo(nombreEquipo);/// suponiendo que el equipo siempre lo encuentre
            if (pos != -1) {

                pronostico.setEquipo(listaEquipos.get(pos));
            }

            ///carga el partido entre equipo favorito y rival a eleccion.
            pronostico.getPartido().setEquipo1(listaEquipos.get(pos));

            System.out.println("Ingrese Equipo Rival");
            nombreEquipoRival = scan.nextLine();
            posRival = buscarEquipo(nombreEquipoRival);
            if (posRival != -1) {
                pronostico.getPartido().setEquipo2(listaEquipos.get(posRival));
            }


            System.out.println("EL equipo elegido" + pronostico.getPartido().getEquipo1() +
                    "gana /G,pierde/P,empata/E elija opcion:");
            resultado = scan.next().charAt(0);
            pronostico.setResultado(resultado);
            listaPronosticos.add(pronostico);
            participante.setListaPronosticos(listaPronosticos);
            listaParticipantes.add(participante);

            System.out.println("desea realizar otro pronostico? S/N");
            control = scan.next().charAt(0);
            scan.nextLine();
        } while (control == 's');


    }

    /**
     * funcion que busca un equipo en la lista de equipos
     *
     * @param nombreEquipo este parametro lo ingresa el usuario
     * @return devuelve la posicion  del equipo o -1 sino lo encuentra.
     */
    public static int buscarEquipo(String nombreEquipo) {
        int i = -1;
        for (Equipo equipo : listaEquipos) {
            if (nombreEquipo.equals(equipo.getNombre())) {
                i = listaEquipos.indexOf(equipo);
            }
        }
        return i;
    }

    /**
     * carga un equipo y lo guarda en la lista de Equipos.
     */
    public static void cargarEquipo() {
        Equipo equipoNuevo = new Equipo();
        String nombreEquipo = "";
        String descripcion = "";

        System.out.println("Ingrese nombre del Equipo");
        nombreEquipo = scan.nextLine();
        equipoNuevo.setNombre(nombreEquipo);

        System.out.println("ingrese Descripcion del Equipo");
        descripcion = scan.nextLine();
        equipoNuevo.setDescripcion(descripcion);
        listaEquipos.add(equipoNuevo);
    }

    /**
     * muestra todos los participantes de la lista de participantes
     */
    public static void listarPronosticos() {
        for (Participante par : listaParticipantes) {
            System.out.println(par);
        }
    }

    /**
     * lista todos los equipos que hay guardados en la lista de Equipos
     */
    public static void listarEquipos() {
        for (Equipo equipo : listaEquipos) {
            System.out.println(equipo);
        }
    }

    /**
     * extrae de la lista de participantes los nombres de todos los participantes
     */
    public static void listarParticipantes() {
        for (Participante par : listaParticipantes) {
            participantes.add(par.getNombre());
        }
        System.out.println(participantes);
    }
}
