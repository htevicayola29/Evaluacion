package Ejercicio2;

import Ejercicio1.Empleado;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo1=new Vehiculo("toyota","corolla",2600);
        Vehiculo vehiculo2=new Vehiculo("lamborghini","huracan2005",2500);
        Vehiculo vehiculo3=new Vehiculo("toyota","hilux",5000);
        vehiculo1.mostrarDetalles();
        vehiculo1.getPrecio();
        System.out.println();
        vehiculo2.mostrarDetalles();
        vehiculo2.getPrecio();
        System.out.println();
        vehiculo3.mostrarDetalles();
        vehiculo3.getPrecio();
    }

}