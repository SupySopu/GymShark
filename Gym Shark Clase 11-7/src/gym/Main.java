package gym;

import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> lista_empleados = new ArrayList<>();
        ArrayList<Socio> listadoSocios = new ArrayList<>();
        
        int opcion_ingreso = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar al programa?\n1-SI\n2-NO"));   
        while(opcion_ingreso == 1){
            int opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido! Seleccione una opción: 1-Socios | 2- Empleados | 3 - Ejercicios"));
            switch(opcion_menu){
                case 1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Socios");
                    int opcion_submenu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción: 1-Ingresar Socio | 2- Mostrar socios | 3 - Buscar socio"));
                    switch(opcion_submenu){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Ingresar Socio");
                            String nombre_socio = JOptionPane.showInputDialog("Bienvenido, ingrese su nombre");
                            String apellido_socio = JOptionPane.showInputDialog("Ingrese su apellido");
                            int dni_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su DNI"));
                            int edad_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                            int peso_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso"));
                            int altura_socio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura"));
                            String plan_socio = JOptionPane.showInputDialog("Ingrese su plan de entrenamiento");
                            Socio socio_de_prueba = new Socio(nombre_socio, apellido_socio, dni_socio, edad_socio, peso_socio, altura_socio, plan_socio);
                            listadoSocios.add(socio_de_prueba);
                            break;
                        case 2: 
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar Socio");
                            if (listadoSocios.isEmpty()){
                                JOptionPane.showMessageDialog(null, "No hay socios ingresados");
                            } else {
                                for(Socio sociosGuardados : listadoSocios){
                                    JOptionPane.showMessageDialog(null, 
                                            "Nombre " + sociosGuardados.getNombre() +
                                            "\nApellido " + sociosGuardados.getApellido() +
                                            "\nDNI " + sociosGuardados.getDNI() +
                                            "\nEdad " + sociosGuardados.getEdad() +
                                            "\nPeso " + sociosGuardados.getPeso() +
                                            "\nAltura " + sociosGuardados.getAltura());
                                    }
                            }
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Buscar Socio");
                            break;
                        default:
                            break;
                    }
                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Empleados");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Ejercicios");
                    break;
                default:
                    break;
            }
        }
    }
    
}
    
//        JOptionPane.showMessageDialog(null, "Bienvenido: " + socio_de_prueba.getNombre() + socio_de_prueba.getApellido());
//        JOptionPane.showMessageDialog(null, "Su dni es: " + socio_de_prueba.getDNI());
//        JOptionPane.showMessageDialog(null, "Su edad es: " + socio_de_prueba.getEdad());
//        JOptionPane.showMessageDialog(null, "Su peso es: " + socio_de_prueba.getPeso());
//        JOptionPane.showMessageDialog(null, "Su altura es: " + socio_de_prueba.getAltura());
//        JOptionPane.showMessageDialog(null, "Su plan de entrenamiento es: " + socio_de_prueba.getPlanDeEntrenamiento());