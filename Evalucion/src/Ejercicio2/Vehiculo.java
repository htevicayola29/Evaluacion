package Ejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public void mostrarDetalles(){
        System.out.println("marca : "+marca);
        System.out.println("modelo :"+modelo);
        System.out.println("precio : "+precio);

    }
    public double getPrecio() {
        if (precio >= 2500 && precio <=4000){
            System.out.println(" vehiculo encontrado de 2500 a 4000");
        }else{
            System.out.println(" este vehiculo no cumple con los requisitos");
        }
            return precio;
        }
}
