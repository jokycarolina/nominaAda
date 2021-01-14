package modelos;

import modelos.Enums.TipoDeNivel;

public class Empleado {
    private String nombre;
    private int dni;
    private TipoDeNivel nivel;

    public Empleado(String nombre, int dni, TipoDeNivel nivel) {
        this.nombre = nombre;
        this.dni = dni;

        this.nivel = nivel;
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

    public TipoDeNivel getNivel() {
        return nivel;
    }

    public void setNivel(TipoDeNivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", nivel=" + nivel.name() +
                '}';
    }
}