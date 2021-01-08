package interfaces.implementaciones;

import modelos.Cargo;
import modelos.Empleado;
import interfaces.IBuscarClases;

import java.util.ArrayList;
import java.util.List;

public class BuscarClasesImpl implements IBuscarClases {
    @Override
    public List<Empleado> buscarEmpleadosPorCargo(List<Empleado> empleados, Cargo cargo) {
        List<Empleado> empleados_Cargo = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (empleado.getCargo() == cargo) {
                empleados_Cargo.add(empleado);
            }
        }
        System.out.println(
                "Los empleados con el " + cargo +
                        " Son: " + "\n" + empleados_Cargo);
        return empleados_Cargo;
    }

    @Override
    public List<Empleado> buscarEmpleadosPorNombre(List<Empleado> empleados, String nombre) {
        List<Empleado> empleados_Nombre = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                empleados_Nombre.add(empleado);
            }
        }
        System.out.println(
                "Los empleados con el nombre " + nombre +
                        " Son: " + "\n" + empleados_Nombre);


        return empleados_Nombre;
    }
}
