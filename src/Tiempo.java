public class Tiempo {
    private byte hora;
    private byte minutos;

    public Tiempo() {
    }

    public Tiempo(byte hora, byte minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public byte getHora() {
        return hora;
    }

    public void setHora(byte hora) {
        do {
            if (hora>=24){
                hora-=24;
            }
        }while (hora>24);
    }

    public byte getMinutos() {
        return minutos;
    }

    public void setMinutos(byte minutos) {
        do {
            if (minutos>=60){
                minutos-=60;
                hora++;
            }
        }while (minutos>60);
    }

    @Override
    public String toString() {
        return getHora()+":"+getMinutos();
    }
}
