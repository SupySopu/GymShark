package gym.shark.clase.pkg11.pkg7;

import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> lista_empleados = new ArrayList<>();
//        ArrayList<Socio> lista_socios = new ArrayList<>();
        int opcion_ingreso = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar al programa? 1-Sí | 2-No"));
        do{
            int opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido! Seleccione una opción: 1-Cargar empleado | 2- Mostrar empleados | 3 - Buscar empleados | 4 - Editar empleados | 5 - Eliminar empleados"));
            switch(opcion_menu){
                case 1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Cargar empleado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar empleado");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Buscar empleado");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Editar empleado");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Eli empleado");
                    break;
                default:
                    break;
            }
//            int opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido! Seleccione una opción: 1-Ingresar Socio | 2- Mostrar socios | 3 - Buscar socios"));
//            switch(opcion_menu){
//                case 1:
//                    JOptionPane.showMessageDialog(null, "Has seleccionado: Ingresar Socio");
//                    String nombre_socio = JOptionPane.showInputDialog("Bienvenido, ingrese su nombre");
//                    String apellido_socio = JOptionPane.showInputDialog("Ingrese su apellido");
//                    int dni_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su DNI"));
//                    int edad_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
//                    int peso_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso"));
//                    int altura_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura"));
//                    String plan_socio = JOptionPane.showInputDialog("Ingrese su plan de entrenamiento");
//                    Socio socio_de_prueba = new Socio(nombre_socio, apellido_socio, dni_socio, edad_socio, peso_socio, altura_socio, plan_socio);
//                    lista_socios.add(socio_de_prueba);
//                case 2: 
//                    JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar Socio");
//                    break;
//                case 3:
//                    JOptionPane.showMessageDialog(null, "Has seleccionado: Buscar Socio");
//                    break;
//                default:
//                    break;
//        }
        opcion_ingreso = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar al programa? 1-Sí | 2-No"));
        }while (opcion_ingreso!=2);
//        JOptionPane.showMessageDialog(null, "Adios :3");
    }
    
}
//        JOptionPane.showMessageDialog(null, "Bienvenido: " + socio_de_prueba.getNombre() + socio_de_prueba.getApellido());
//        JOptionPane.showMessageDialog(null, "Su dni es: " + socio_de_prueba.getDNI());
//        JOptionPane.showMessageDialog(null, "Su edad es: " + socio_de_prueba.getEdad());
//        JOptionPane.showMessageDialog(null, "Su peso es: " + socio_de_prueba.getPeso());
//        JOptionPane.showMessageDialog(null, "Su altura es: " + socio_de_prueba.getAltura());
//        JOptionPane.showMessageDialog(null, "Su plan de entrenamiento es: " + socio_de_prueba.getPlanDeEntrenamiento());