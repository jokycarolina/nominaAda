package ejecutores;

import interfaces.implementaciones.PoblarClasesImpl;
import modelos.Cargo;
import modelos.Empleado;
import interfaces.IBuscarClases;
import interfaces.IPoblarClases;
import interfaces.implementaciones.BuscarClasesImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IPoblarClases poblarClases = new PoblarClasesImpl();

        List<Empleado> empleadoList = poblarClases.crearEmpleados();
        System.out.println(empleadoList);

        IBuscarClases buscarClases = new BuscarClasesImpl();
        buscarClases.buscarEmpleadosPorCargo(empleadoList, new Cargo("junior"));

        IBuscarClases buscarClasesPorNombre = new BuscarClasesImpl();
        buscarClases.buscarEmpleadosPorNombre(empleadoList, "andrea");

    }
}
