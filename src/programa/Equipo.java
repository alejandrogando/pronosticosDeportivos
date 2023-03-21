package programa;

public class Equipo {
    private String nombre;
    private String descripcion;

    public Equipo() {
        this.nombre = "";
        this.descripcion = "";
    }

    public Equipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + this.nombre + '\'' +
                ", descripcion='" + this.descripcion + '\'' +
                '}';
    }
}
