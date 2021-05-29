package interfaces;

import modelos.Empleado;
import modelos.Enums.TipoDeNivel;

import java.util.List;

public interface IBuscarClases {

    List<Empleado> buscarEmpleadosPorCargo(List<Empleado> empleados, TipoDeNivel nivel);

    List<Empleado> buscarEmpleadosPorNombre(List<Empleado> empleados, String nombre);

    void buscarEmpleadosPorDni(List<Empleado> empleados, int dni);
}
