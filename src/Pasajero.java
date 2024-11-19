public class Pasajero extends Persona {
    private float descPasaje;

    public Pasajero() {
    }

    public Pasajero(String nombre, int edad, float descPasaje) {
        super(nombre, edad);
        this.descPasaje = descPasaje;
    }

    public float getDescPasaje() {
        return descPasaje;
    }

    public void setDescPasaje(float descPasaje) {
        this.descPasaje = descPasaje;
    }

    @Override
    public String toString() {
        return "Descuento de pasaje: " + getDescPasaje();
    }
}
