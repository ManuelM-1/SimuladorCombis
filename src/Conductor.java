public class Conductor extends Persona {
    private float salario;
    private byte unidad;
    private int viajes;
    private byte asientos;
    private float pasajeTotal;

    public Conductor() {
    }

    public Conductor(String nombre, int edad, float salario, byte unidad, int viajes, byte asientos, float pasajeTotal) {
        super(nombre, edad);
        this.salario = salario;
        this.unidad = unidad;
        this.viajes=viajes;
        this.asientos = asientos;
        this.pasajeTotal = pasajeTotal;
    }

    public Conductor(String nombre, int edad, float salario, double gas) {
        super(nombre, edad);
        this.salario = salario;
        this.viajes=viajes;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public byte getUnidad() {
        return unidad;
    }

    public void setUnidad(byte unidad) {
        this.unidad = unidad;
    }

    public double getViajes() {
        return viajes;
    }

    public void setViajes(int viajes) {
        this.viajes =viajes;
    }

    public byte getAsientos() {
        return asientos;
    }

    public void setAsientos(byte asientos) {
        this.asientos = asientos;
    }

    public float getPasajeTotal() {
        return pasajeTotal;
    }

    public void setPasajeTotal(float pasajeTotal) {
        this.pasajeTotal = pasajeTotal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario: " + getSalario() +
                "\nUnidad: " + getUnidad() + "\nNúmero de viajes: " + getViajes() + "\nNúmero de asientos: " + getAsientos() +
                "\nNúmero de pasajeros durante el viaje: " + getPasajeTotal();
    }
}
