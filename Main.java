public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Vehiculo
        Vehiculo miCoche = new Vehiculo("Toyota", "Corolla", 2020);

        // Mostrar la información inicial del vehículo
        miCoche.mostrarInformacion();

        // Acelerar el vehículo
        miCoche.acelerar(50);
        miCoche.mostrarInformacion();

        // Frenar el vehículo
        miCoche.frenar(20);
        miCoche.mostrarInformacion();
    }
}
