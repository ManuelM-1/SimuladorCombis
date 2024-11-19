public class Conductor extends Persona {
    private float salario;
    private byte unidad;
    private double gas;
    private byte asientos;
    private float pasajeTotal;

    public Conductor() {
    }

    public Conductor(String nombre, int edad, float salario, byte unidad, double gas, byte asientos, float pasajeTotal) {
        super(nombre, edad);
        this.salario = salario;
        this.unidad = unidad;
        this.gas = gas;
        this.asientos = asientos;
        this.pasajeTotal = pasajeTotal;
    }

    public Conductor(String nombre, int edad, float salario, double gas) {
        super(nombre, edad);
        this.salario = salario;
        this.gas = gas;
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

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
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
                "\nUnidad: " + getUnidad() + "\nGasolina usada: " + getGas() + "\nNúmero de asientos: " + getAsientos() +
                "\nNúmero de pasajeros durante el viaje: " + getPasajeTotal();
    }
}
