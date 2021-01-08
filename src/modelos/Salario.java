package modelos;

public class Salario extends Empleado {
    private Cargo cargo;
    private int horasExtras;
    private int salarioTotal;
    private int numeroDeHorasExtras;
    private int sueldoBase;

    public Salario(String nombre, int dni, Cargo cargo, int horasExtras, int salarioTotal, int numeroDeHorasExtras, int sueldoBase) {
        super(nombre, dni, cargo);
        this.horasExtras = horasExtras;
        this.salarioTotal = salarioTotal;
        this.numeroDeHorasExtras = numeroDeHorasExtras;
        this.sueldoBase = sueldoBase;
    }

    @Override
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getSueldoBase() {
        if (cargo.equals("junior")) {
            sueldoBase = 50000;
        } else if (cargo.equals("senior")) {
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
        if (cargo.getNivel().equals("junior")) {
            horasExtras = 300 * numeroDeHorasExtras;
        } else if (cargo.getNivel().equals("senior")) {
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
                "cargo=" + cargo +
                ", horasExtras=" + horasExtras +
                ", salarioTotal=" + salarioTotal +
                ", numeroDeHorasExtras=" + numeroDeHorasExtras +
                ", sueldoBase=" + sueldoBase +
                '}';
    }
}