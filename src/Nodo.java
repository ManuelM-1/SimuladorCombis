public class Nodo {
    private Object dato;
    private Nodo sig;

    public Nodo() {
    }
    public Nodo(Object d){
        dato=d;
        sig =null;
    }
    public Nodo(Object d,Nodo s){
        dato =d;
        sig=s;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "Campo Dato= " + getDato() + " | Campo Siguiente= " + getSig();
    }
}
