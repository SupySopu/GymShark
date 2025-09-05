package gym;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombre_socio = JOptionPane.showInputDialog("Bienvenido, ingrese su nombre");
        String apellido_socio = JOptionPane.showInputDialog("Ingrese su apellido");
        int dni_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su DNI (Sin puntos)"));
        int edad_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        int peso_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso (En Kg)"));
        int altura_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura (En cm)"));
        String plan_socio = JOptionPane.showInputDialog("Ingrese su plan de entrenamiento");
        
        
        Socio socio_de_prueba = new Socio(nombre_socio, apellido_socio, dni_socio, edad_socio, peso_socio, altura_socio, plan_socio);
        JOptionPane.showMessageDialog(null, "Bienvenido " + socio_de_prueba.getNombre() + " " + socio_de_prueba.getApellido());
        JOptionPane.showMessageDialog(null, "Su DNI es: " + socio_de_prueba.getDNI());
        JOptionPane.showMessageDialog(null, "Su edad es: " + socio_de_prueba.getEdad());
        JOptionPane.showMessageDialog(null, "Su peso es: " + socio_de_prueba.getPeso() + " Kilogramos");
        JOptionPane.showMessageDialog(null, "Su altura es: " + socio_de_prueba.getAltura() + " Centimetros");
        JOptionPane.showMessageDialog(null, "Su plan de entrenamiento es: " + socio_de_prueba.getPlanDeEntrenamiento());
        
    }
    
}
