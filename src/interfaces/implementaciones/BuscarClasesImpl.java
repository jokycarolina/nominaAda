package interfaces.implementaciones;

import modelos.Empleado;
import interfaces.IBuscarClases;
import modelos.Enums.TipoDeNivel;

import java.util.ArrayList;
import java.util.List;

public class BuscarClasesImpl implements IBuscarClases {
    @Override
    public List<Empleado> buscarEmpleadosPorCargo(List<Empleado> empleados, TipoDeNivel nivel) {
        List<Empleado> empleados_Cargo = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (empleado.getNivel() == nivel) {
                empleados_Cargo.add(empleado);
            }
        }
        System.out.println(
                "Los empleados con el " + nivel +
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

    @Override
    public void buscarEmpleadosPorDni(List<Empleado> empleados, int dni) {
        List<Empleado> empleados_Dni = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (empleado.getDni() == dni) {
                empleados_Dni.add(empleado);
            }
        }
        System.out.println(
                "El empleado con el N° Dni " + dni +
                        " es: " + "\n" + empleados_Dni);
    }
}
