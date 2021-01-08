package modelos;

public class Empleado {
    private String nombre;
    private int dni;
    private Cargo cargo;

    public Empleado(String nombre, int dni, Cargo cargo) {
        this.nombre = nombre;
        this.dni = dni;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", cargo=" + cargo +
                '}';
    }
}