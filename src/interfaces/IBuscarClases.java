package interfaces;

import modelos.Cargo;
import modelos.Empleado;

import java.util.List;

public interface IBuscarClases {

    List<Empleado> buscarEmpleadosPorCargo(List<Empleado> empleados, Cargo cargo);

    List<Empleado> buscarEmpleadosPorNombre(List<Empleado> empleados, String nombre);
}
