package interfaces.implementaciones;

import modelos.Cargo;
import modelos.Empleado;
import interfaces.IPoblarClases;

import java.util.ArrayList;
import java.util.List;

public class PoblarClasesImpl implements IPoblarClases {
        @Override
        public List<Empleado> crearEmpleados() {
            List<Empleado> empleados = new ArrayList<>();

            Empleado empleado1 = new Empleado("Chaily",989, new Cargo("junior"));
            Empleado empleado2 = new Empleado("Caro", 5555, new Cargo("junior"));
            Empleado empleado3 = new Empleado("CaroBroggi", 222, new Cargo("junior"));
            Empleado empleado4 = new Empleado("AndreaLeiva", 77777, new Cargo("junior"));
            Empleado empleado5 = new Empleado("Andrea", 33333, new Cargo("junior"));

            empleados.add(empleado1);
            empleados.add(empleado2);
            empleados.add(empleado3);
            empleados.add(empleado4);
            empleados.add(empleado5);


            return empleados;


        }
        
}
