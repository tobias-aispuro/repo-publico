public class Vehiculo {

    // Atributos privados de la clase
    private String marca;
    private String modelo;
    private int anio;
    private double velocidad;

    // Constructor de la clase
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = 0; // La velocidad inicial es 0
    }

    // Métodos getter y setter para los atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getVelocidad() {
        return velocidad;
    }

    // Métodos específicos de la clase
    public void acelerar(double incremento) {
        if(incremento > 0) {
            velocidad += incremento;
        }
    }

    public void frenar(double decremento) {
        if(decremento > 0) {
            velocidad -= decremento;
            if(velocidad < 0) {
                velocidad = 0; // La velocidad no puede ser negativa
            }
        }
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }
}
