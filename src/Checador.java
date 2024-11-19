public class Checador extends Persona{
    private Object horSalida;
    private Object horLlegada;

    public Checador() {
    }

    public Checador(String nombre, int edad, Object horSalida, Object horLlegada) {
        super(nombre, edad);
        this.horSalida = horSalida;
        this.horLlegada = horLlegada;
    }

    public Object getHorSalida() {
        return horSalida;
    }

    public void setHorSalida(Object horSalida) {
        this.horSalida = horSalida;
    }

    public Object getHorLlegada() {
        return horLlegada;
    }

    public void setHorLlegada(Object horLlegada) {
        this.horLlegada = horLlegada;
    }
}
