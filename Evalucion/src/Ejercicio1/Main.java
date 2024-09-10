package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<Empleado> empleados=new ArrayList<>();
            empleados.add(new Empleado("Juan",30,2500));
            empleados.add(new Empleado("Maria",25,3200));
            empleados.add(new Empleado("Marco",26,2900));
            for(Empleado empleado:empleados){
                empleado.aplicarAumento();
            }
        }
}
