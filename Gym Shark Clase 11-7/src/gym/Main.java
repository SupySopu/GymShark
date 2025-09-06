package gym;

import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> lista_empleados = new ArrayList<>();
        JOptionPane.showMessageDialog(null, "+100000000000000000 de aura"); //By Nahue
        int opcion_ingreso = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar al programa? 1-Sí | 0-No"));

        if (opcion_ingreso == 1) {
            do {
                int opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "¡Bienvenido! Seleccione una opción:\n" +
                    "1-Cargar empleado\n" +
                    "2-Mostrar empleados\n" +
                    "3-Buscar empleados\n" +
                    "4-Editar empleados\n" +
                    "5-Eliminar empleados"
                ));

                switch (opcion_menu) {
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

                opcion_ingreso = Integer.parseInt(
                    JOptionPane.showInputDialog("¿Desea continuar en el programa? 1-Sí | 0-No")
                );

            } while (opcion_ingreso == 1);
        }

        JOptionPane.showMessageDialog(null, "Saliste del programa");
    }
    
}
