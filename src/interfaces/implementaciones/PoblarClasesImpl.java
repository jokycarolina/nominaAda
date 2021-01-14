package interfaces.implementaciones;

import modelos.Cargo;
import modelos.Empleado;
import interfaces.IPoblarClases;
import modelos.Enums.TipoDeNivel;

import java.util.ArrayList;
import java.util.List;

public class PoblarClasesImpl implements IPoblarClases {
        @Override
        public List<Empleado> crearEmpleados() {
            List<Empleado> empleados = new ArrayList<>();

            Empleado empleado1 = new Empleado("Chaily",98,TipoDeNivel.JUNIOR);
            Empleado empleado2 = new Empleado("Caro", 5555,TipoDeNivel.SENIOR);
            Empleado empleado3 = new Empleado("CaroBroggi", 222,TipoDeNivel.JUNIOR);
            Empleado empleado4 = new Empleado("AndreaLeiva", 77777,TipoDeNivel.JUNIOR);
            Empleado empleado5 = new Empleado("Andrea", 33333,TipoDeNivel.JUNIOR);

            empleados.add(empleado1);
            empleados.add(empleado2);
            empleados.add(empleado3);
            empleados.add(empleado4);
            empleados.add(empleado5);


            return empleados;


        }

    @Override
    public List<Cargo> crearCargo() {
            List <Cargo> Cargo = new ArrayList<>();
            Cargo cargo1 = new Cargo(TipoDeNivel.JUNIOR);
            Cargo cargo2 = new Cargo (TipoDeNivel.SENIOR);

        return Cargo;
    }

}
