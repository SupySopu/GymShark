package gym;

import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> lista_empleados = new ArrayList<>();
        ArrayList<Socio> listadoSocios = new ArrayList<>();
        
        int opcion_ingreso = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar al programa?\n1-SI\n2-NO"));   
        while(opcion_ingreso == 1){
            int opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido! Seleccione una opcion:\n"
                    + "1 - Socios\n"
                    + "2 - Empleados\n"
                    + "3 - Ejercicios"));
            
            switch(opcion_menu){
                
                // Socios
                case 1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Socios");
                    int opcion_submenu_socios = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"
                            + "1 - Ingresar Socio\n"
                            + "2 - Mostrar socios\n"
                            + "3 - Buscar socio"));
                    
                    switch(opcion_submenu_socios
                            
                        // Ingresar socios
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
                            
                        // Mostrar socios
                        case 2: 
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar Socio");
                            if (listadoSocios.isEmpty()){
                                JOptionPane.showMessageDialog(null, "No hay socios ingresados");
                            } else {
                                for(Socio sociosGuardados : listadoSocios){
                                    JOptionPane.showMessageDialog(null, 
                                            "Nombre: " + sociosGuardados.getNombre() +
                                            "\nApellido: " + sociosGuardados.getApellido() +
                                            "\nDNI: " + sociosGuardados.getDNI() +
                                            "\nEdad: " + sociosGuardados.getEdad() +
                                            "\nPeso: " + sociosGuardados.getPeso() +
                                            "\nAltura: " + sociosGuardados.getAltura());
                                    }
                            }
                            break;
                            
                        // Ingresar Buscar Socio
                        case 3:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Buscar Socio");
                            break;
                        default:
                            break;
                    }
                    
                    break;
                    
                    
                // Empleados
                case 2:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Empleados");
                    
                    int opcion_submenu_empleados = Integer.parseInt(JOptionPane.showInputDialog(
                        "¡Bienvenido! Seleccione una opción:\n" +
                        "1-Cargar empleado\n" +
                        "2-Mostrar empleados\n" +
                        "3-Buscar empleados\n" +
                        "4-Editar empleados\n" +
                        "5-Eliminar empleados"
                    ));

                    switch (opcion_submenu_empleados) {
                        
                        // Ingresar empleados
                        case 1:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Cargar empleado");
                            String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                            String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                            int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su DNI"));
                            String correo = JOptionPane.showInputDialog("Ingrese su correo");
                            String rol = JOptionPane.showInputDialog("Ingrese su rol");
                            double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
                            Empleado empleado_nuevo = new Empleado(nombre, apellido, dni, correo, rol, sueldo);
                            lista_empleados.add(empleado_nuevo);
                            JOptionPane.showMessageDialog(null, "Empleado ingresado con éxito");
                            break;
                            
                        // Mostrar empleados
                        case 2:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar empleados");
                            if (lista_empleados.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "No hay empleados ingresados");
                            } else {
                                for (Empleado empleados_guardados : lista_empleados) {
                                    JOptionPane.showMessageDialog(null,
                                            "Nombre: " + empleados_guardados.getNombre() +
                                            "\nApellido: " + empleados_guardados.getApellido() +
                                            "\nDNI: " + empleados_guardados.getDni() +
                                            "\nCorreo: " + empleados_guardados.getCorreo() +
                                            "\nRol: " + empleados_guardados.getRol() +
                                            "\nSueldo: " + empleados_guardados.getSueldo());
                                }
                            }
                            break;

                        // Buscar empleados
                        case 3:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Buscar empleado");
                            int dni_busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI a buscar:"));
                            boolean dni_encontrado = false;
                            for(Empleado empleado_encontrado : lista_empleados){
                                if(empleado_encontrado.getDni() == dni_busqueda){
                                        JOptionPane.showMessageDialog(null,
                                                "Nombre: " + empleado_encontrado.getNombre() +
                                                "\nApellido: " + empleado_encontrado.getApellido() +
                                                "\nDNI: " + empleado_encontrado.getDni() +
                                                "\nCorreo: " + empleado_encontrado.getCorreo() +
                                                "\nRol: " + empleado_encontrado.getRol() +
                                                "\nSueldo: " + empleado_encontrado.getSueldo());
                                        dni_encontrado = true;
                                        break;
                                }else{
                                        JOptionPane.showMessageDialog(null, "No se ha encontrado el usuario.");
                                        }
                            }
                            break;
                            
                        // Editar empleados
                        case 4:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Editar empleado");
                            int dni_a_modificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del empleado a modificar"));
                            boolean dni_modificar = false;
                            for(Empleado empleado_encontrado : lista_empleados){
                                if (empleado_encontrado.getDni() == dni_a_modificar){
                                    JOptionPane.showMessageDialog(null,
                                                "Nombre: " + empleado_encontrado.getNombre() +
                                                "\nApellido: " + empleado_encontrado.getApellido() +
                                                "\nDNI: " + empleado_encontrado.getDni() +
                                                "\nCorreo: " + empleado_encontrado.getCorreo() +
                                                "\nRol: " + empleado_encontrado.getRol() +
                                                "\nSueldo: " + empleado_encontrado.getSueldo());
                                }
                                String nuevo_nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                                String nuevo_apellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido");
                                int nuevo_dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo DNI"));
                            String nuevo_correo = JOptionPane.showInputDialog("Ingrese el nuevo correo");
                            String nuevo_rol = JOptionPane.showInputDialog("Ingrese el nuevo rol");
                            double nuevo_sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo sueldo"));
                            empleado_encontrado.setNombre(nuevo_nombre);
                            empleado_encontrado.setApellido(nuevo_apellido);
                            empleado_encontrado.setDni(nuevo_dni);
                            empleado_encontrado.setCorreo(nuevo_correo);
                            empleado_encontrado.setRol(nuevo_rol);
                            empleado_encontrado.setSueldo(nuevo_sueldo);

                            }
                            break;
                            
                            
                        // Eliminar empleados
                        case 5:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Eliminar empleado");
                            int dni_a_eliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI a eliminar:"));
                            boolean dni_eliminar = false;
                            for(Empleado empleado_encontrado : lista_empleados){
                                if(empleado_encontrado.getDni() == dni_a_eliminar){
                                    lista_empleados.remove(dni_a_eliminar);
                                    dni_eliminar = true;
                                    JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
                                    break;
                                }
                                if(!dni_eliminar){
                                    JOptionPane.showMessageDialog(null, "No se ha encontrado el dni ingresado");
                                }
                            }
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida");
                            break;
                    }
                    
                    break;
                    
                
                // Ejercicios
                case 3:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Ejercicios");
                    break;
                    
                // Default
                default:
                    break;
            }
        }
    }
    
}
