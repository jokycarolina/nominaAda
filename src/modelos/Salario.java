package modelos;

import modelos.Enums.TipoDeNivel;

public class Salario extends Empleado {
    private TipoDeNivel nivel;
    private int horasExtras;
    private int salarioTotal;
    private int numeroDeHorasExtras;
    private int sueldoBase;

    public Salario(String nombre, int dni, Cargo cargo, TipoDeNivel nivel, int horasExtras, int salarioTotal, int numeroDeHorasExtras, int sueldoBase) {
        super(nombre, dni, nivel);
        this.nivel = nivel;
        this.horasExtras = horasExtras;
        this.salarioTotal = salarioTotal;
        this.numeroDeHorasExtras = numeroDeHorasExtras;
        this.sueldoBase = sueldoBase;
    }

    public TipoDeNivel getCargo() {
        return nivel;
    }

    public void setCargo(TipoDeNivel nivel) {
        this.nivel = nivel;
    }

    public int getSueldoBase() {
        if (nivel.equals("JUNIOR")) {
            sueldoBase = 50000;
        } else if (nivel.equals("SENIOR")) {
            sueldoBase = 100000;
        }
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getSalarioTotal() {
        salarioTotal = getSueldoBase() + getHorasExtras();

        return salarioTotal;
    }

    public void setSalarioTotal(int salarioTotal) {
        this.salarioTotal = salarioTotal;
    }


    public int getHorasExtras() {
        if (getCargo().equals ("JUNIOR")) {
            horasExtras = 300 * numeroDeHorasExtras;
        } else if (getCargo().equals("SENIOR")) {
            horasExtras = 500 * numeroDeHorasExtras;
        }

        return horasExtras;
    }
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }


    @Override
    public String toString() {
        return "Salario{" +
                "cargo=" + getCargo().name() +
                ", horasExtras=" + horasExtras +
                ", salarioTotal=" + salarioTotal +
                ", numeroDeHorasExtras=" + numeroDeHorasExtras +
                ", sueldoBase=" + sueldoBase +
                '}';
    }
}