package ejecutores;

import interfaces.implementaciones.PoblarClasesImpl;
import modelos.Cargo;
import modelos.Empleado;
import interfaces.IBuscarClases;
import interfaces.IPoblarClases;
import interfaces.implementaciones.BuscarClasesImpl;
import modelos.Enums.TipoDeNivel;

import java.util.List;

import static modelos.Enums.TipoDeNivel.JUNIOR;

public class Main {

    public static void main(String[] args) {
        IPoblarClases poblarClases = new PoblarClasesImpl();

        List<Empleado> empleadoList = poblarClases.crearEmpleados();
        System.out.println(empleadoList);

        IBuscarClases buscarClases = new BuscarClasesImpl();
        buscarClases.buscarEmpleadosPorCargo (empleadoList,JUNIOR);

        IBuscarClases buscarClasesPorNombre = new BuscarClasesImpl();
        buscarClases.buscarEmpleadosPorNombre(empleadoList, "andrea");

        IBuscarClases buscarClasesPorDni = new BuscarClasesImpl();
        buscarClases.buscarEmpleadosPorDni(empleadoList, 222);

    }
}
