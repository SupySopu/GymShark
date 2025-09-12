package gym;

import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> lista_empleados = new ArrayList<>();
<<<<<<< Updated upstream
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
=======
        ArrayList<Socio> listadoSocios = new ArrayList<>();
        ArrayList<Ejercicio> lista_ejercicios = new ArrayList<>();
        String Contraseña ="R3tsuk0l0v3";
        boolean opcion_ingreso = false;
        int Tries=0;
        while (Tries!=3) { 
         String IngresoContraseña = JOptionPane.showInputDialog("Bienvenido a GymShark:" 
                                                            + "\nIngrese la contraseña");
         if(IngresoContraseña.equals(Contraseña)){
             opcion_ingreso=true;
             break;
         }else{
             JOptionPane.showMessageDialog(null,"Contraseña incorecta");
         }
         Tries++; 
        }
        if(opcion_ingreso == false){
            JOptionPane.showMessageDialog(null,"Inicio de sesion fallido.");
        }
        while(opcion_ingreso == true){
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
                    
                    switch(opcion_submenu_socios) {
                            
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
                        "1-Ingresar empleado\n" +
                        "2-Mostrar empleados\n" +
                        "3-Buscar empleados\n" +
                        "4-Editar empleados\n" +
                        "5-Eliminar empleados"
                    ));

                    switch (opcion_submenu_empleados) {
                        
                        // Ingresar empleados
                        case 1:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Ingresar empleado");
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
                            int dni_busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nombre del ejericio a buscar:"));
                            for(Empleado empleado_encontrado : lista_empleados){
                                if(empleado_encontrado.getDni() == dni_busqueda){
                                        JOptionPane.showMessageDialog(null,
                                                "Nombre: " + empleado_encontrado.getNombre() +
                                                "\nApellido: " + empleado_encontrado.getApellido() +
                                                "\nDNI: " + empleado_encontrado.getDni() +
                                                "\nCorreo: " + empleado_encontrado.getCorreo() +
                                                "\nRol: " + empleado_encontrado.getRol() +
                                                "\nSueldo: " + empleado_encontrado.getSueldo());
                                        break;
                                }else{
                                        JOptionPane.showMessageDialog(null, "No se ha encontrado el empleado.");
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

                            JOptionPane.showMessageDialog(null, "Empleado modificado exitosamente");
                            dni_modificar = true;
                            break;

                            }
                            if(!dni_modificar){
                                JOptionPane.showMessageDialog(null, "No se ha encontrado el dni ingresado");
                            }
                            break;
                            
                            
                        // Eliminar empleados
                        case 5:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Eliminar empleado");
                            int dni_a_eliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI a eliminar:"));
                            boolean dni_eliminar = false;
                            for(Empleado empleado_encontrado : lista_empleados){
                                if(empleado_encontrado.getDni() == dni_a_eliminar){
                                    lista_empleados.remove(empleado_encontrado);
                                    dni_eliminar = true;
                                    JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
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
=======
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida");
                            break;
                    }
                    
                    break;
                    
                
                // Ejercicios
                case 3:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Ejercicios");
                    int opcion_submenu_ejercicios = Integer.parseInt(JOptionPane.showInputDialog(
                        "¡Bienvenido! Seleccione una opción:\n" +
                        "1-Ingresar ejercicios\n" +
                        "2-Mostrar ejercicios\n" +
                        "3-Buscar ejercicios\n"
                    ));

                    switch (opcion_submenu_ejercicios) {
                        // Ingresar ejercicios
                        case 1:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Ingresar Ejercicios");
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del ejercicio");
                            int repeticiones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de repeticiones"));
                            int series = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de series"));
                            Ejercicio ejercicio_nuevo = new Ejercicio(nombre, repeticiones, series);
                            lista_ejercicios.add(ejercicio_nuevo);
                            JOptionPane.showMessageDialog(null, "Ejercicio ingresado con éxito");
                            break;
      
                        // Mostrar ejercicios
                        case 2:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar ejercicios");
                            if (lista_ejercicios.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "No hay ejercicios ingresados");
                            } else {
                                for (Ejercicio ejercicios_guardados : lista_ejercicios) {
                                    JOptionPane.showMessageDialog(null,
                                            "Nombre: " + ejercicios_guardados.getNombre() +
                                            "\nRepeticiones: " + ejercicios_guardados.getRepeticiones() +
                                            "\nSeries: " + ejercicios_guardados.getSeries());
                                }
                            }
                            break;

                        // Buscar ejercicios
                        case 3:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Buscar ejercicio");
                            String nombre_busqueda = JOptionPane.showInputDialog("Ingrese el nombre del ejercicio a buscar:");
                            for(Ejercicio ejercicio_encontrado : lista_ejercicios){
                                if(ejercicio_encontrado.getNombre().equalsIgnoreCase(nombre_busqueda)){
                                        JOptionPane.showMessageDialog(null,
                                                "Nombre: " + ejercicio_encontrado.getNombre() +
                                            "\nRepeticiones: " + ejercicio_encontrado.getRepeticiones() +
                                            "\nSeries: " + ejercicio_encontrado.getSeries());
                                        break;
                                }else{
                                        JOptionPane.showMessageDialog(null, "No se ha encontrado el ejercicio.");
                                        }
                            }
                            break;
                    
                // Default
                default:
                    break;
            }
        }
        }
>>>>>>> Stashed changes
    }
    
}
