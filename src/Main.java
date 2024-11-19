import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        byte menu=0;
        Lista simulacion=new Lista();
        Nodo nodo;
        do {
            menu = Byte.parseByte(JOptionPane.showInputDialog("1. Insertar datos \n2. Eliminar\n3. Ver\n4. Salir"));
            switch (menu){

            }
        }while (menu!=4);
    }
    public static Pasajero datosPasajero(){
        byte edad = Byte.parseByte(JOptionPane.showInputDialog("Edad del pasajero: "));
        byte caso = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el tipo de pasajero : \n1.- Normal\n2.- Estudiante\n3.- Adulto mayor (mostrar credencial)\n4.-Persona con discapacidad"));
        Pasajero pasajero = new Pasajero(edad,caso);
        return pasajero;
    }
}