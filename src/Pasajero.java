public class Pasajero extends Persona {
    private float pasaje;
    private byte caso;

    public Pasajero() {
    }

    public Pasajero(String nombre, int edad, float pasaje, byte caso) {
        super(nombre, edad);
        this.pasaje = pasaje;
        this.caso=caso;
    }
    public Pasajero( int edad, byte caso) {
        super( edad);
        this.caso=caso;
    }

    public byte getCaso() {
        return caso;
    }

    public void setCaso(byte caso) {
        this.caso = caso;
    }

    public float getPasaje() {
        return pasaje;
    }

    public void setPasaje(float pasaje) {
        pasaje=10;
        if (caso ==2) {
            pasaje = 9;
        } else if (caso == 3) {
            pasaje = 6;
        } else if (caso == 4) {
            pasaje = 4;
        } else if (getEdad()<3) {
            pasaje=0;
        }

    }

    @Override
    public String toString() {
        return "Descuento de pasaje: " + getPasaje();
    }
}
