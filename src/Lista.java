public class Lista {
    private Nodo inicio, fin;

    public Lista() {
        inicio = fin = null; //crea una lista vacia
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public boolean esVacia() {  //metodo para saber si la lista esta vacia
        if (inicio == null)     //La lista es vacia si no tiene datos  y su inicio es nulo
            return true;
        else return false;
    }

    public void insertarInicio(Nodo n) {     //metodo para insertar un dato en el inicio de la lista
        if (esVacia()) {
            inicio = fin = n;
        } else {
            n.setSig(inicio);
            inicio = n;
        }
    }

    public void insertarFin(Nodo n) {
        if (esVacia()) {
            inicio = fin = n;
        } else {
            fin.setSig(n);
            fin = n;
        }
    }

    public Nodo eliminaInicio() {
        Nodo tem = inicio;
        if (!esVacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                inicio = tem.getSig();
                tem.setSig(null);
            }
        }
        return tem;
    }

    public Nodo eliminaFin() {
        Nodo tem = fin;
        if (!esVacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                fin = inicio;
                while (fin.getSig() != tem) {
                    fin = fin.getSig();
                }
                fin.setSig(null);
            }
        }
        return tem;
    }

    public double consumoGas(){
        Nodo tem = inicio;
        Conductor c = null;
        return c.getViajes()*0.12;
    }

    @Override
    public String toString() {
        String salida = "Contenido de Lista \n";
        if (esVacia()) {
            salida += "Lista vacia";
        }
        Nodo tem = inicio;
        Persona p = null;
        while (tem != null) {
            p = (Persona) tem.getDato();
            salida += p.toString() + " \n";
            tem = tem.getSig();
        }
        return salida;
    }
}
