package gym;

import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ejercicios> lista_ejercicios = new ArrayList<>();
        ArrayList<Equipamiento> lista_equipamiento = new ArrayList<>();
        ArrayList<Empleado> lista_empleados = new ArrayList<>();
        ArrayList<Socio> lista_socios = new ArrayList<>();
        
        String Contraseña ="R3tsuk0l0v3";
        boolean opcion_user = false;
        int Tries=0;
        while (Tries!=3) { 
         String IngresoContraseña = JOptionPane.showInputDialog("Bienvenido a GymShark:" 
                                                            + "\nIngrese la contraseña");
         if(IngresoContraseña.equals(Contraseña)){
             opcion_user=true;
             break;
         }else{
             JOptionPane.showMessageDialog(null,"Contraseña incorecta");
         }
         Tries++; 
        }
        if(opcion_user == false){
            JOptionPane.showMessageDialog(null,"Inicio de sesion fallido.");
        }
        
        
        while(opcion_user == true){
            int opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido! Seleccione una opcion:\n"
                    + "1 - Socios\n"
                    + "2 - Empleados\n"
                    + "3 - Ejercicios\n"
                    + "4 - Equipamiento\n"
                    + "5 - Planificacion"));
            
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
                            lista_socios.add(socio_de_prueba);
                            break;
                            
                        // Mostrar socios
                        case 2: 
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar Socio");
                            if (lista_socios.isEmpty()){
                                JOptionPane.showMessageDialog(null, "No hay socios ingresados");
                            } else {
                                for(Socio sociosGuardados : lista_socios){
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
                            
                            int dni_busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI a buscar:"));
                            boolean dni_encontrado_socio = false;
                            for(Socio socio_encontrado : lista_socios){
                                if(socio_encontrado.getDNI() == dni_busqueda){
                                        JOptionPane.showMessageDialog(null,
                                                "Nombre: " + socio_encontrado.getNombre() +
                                                "\nApellido: " + socio_encontrado.getApellido() +
                                                "\nDNI: " + socio_encontrado.getDNI() +
                                                "\nEdad: " + socio_encontrado.getEdad() +
                                                "\nPeso: " + socio_encontrado.getPeso() +
                                                "\nAltura: " + socio_encontrado.getAltura() +
                                                "\nPlan de Entrenamiento: " + socio_encontrado.getPlanDeEntrenamiento()
                                        );
                                        dni_encontrado_socio = true;
                                        break;
                                }else{
                                        JOptionPane.showMessageDialog(null, "No se ha encontrado el usuario.");
                                        }
                            }
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
                                    break;
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
                                }else {
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
                            Ejercicios ejercicio_nuevo = new Ejercicios(nombre, repeticiones, series);
                            lista_ejercicios.add(ejercicio_nuevo);
                            JOptionPane.showMessageDialog(null, "Ejercicio ingresado con éxito");
                            break;
                    
                            // Mostrar ejercicios
                        case 2:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar ejercicios");
                            if (lista_ejercicios.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "No hay ejercicios ingresados");
                            } else {
                                for (Ejercicios ejercicios_guardados : lista_ejercicios) {
                                    JOptionPane.showMessageDialog(null,
                                            "Nombre: " + ejercicios_guardados.getNombre() +
                                            "\nRepeticiones: " + ejercicios_guardados.getRepeticiones() +
                                            "\nSeries: " + ejercicios_guardados.getSeries());
                                }
                            }
                            break;
                            
                            case 3:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Buscar ejercicio");
                            String nombre_busqueda = JOptionPane.showInputDialog("Ingrese el nombre del ejercicio a buscar:");
                            for(Ejercicios ejercicio_encontrado : lista_ejercicios){
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
                    break;
                    
                    
                // Equipamiento
                case 4:
                    JOptionPane.showMessageDialog(null, "Has seleccionado: Equipamiento");
                    int opcion_submenu_equipamiento = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"
                            + "1 - Ingresar equipamiento\n"
                            + "2 - Mostrar equipamiento\n"));
                    
                    switch(opcion_submenu_equipamiento) {
                            
                        // Ingresar equipamiento
                        case 1:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Ingresar Equipamiento");
                            String nombre_equipamiento = JOptionPane.showInputDialog("Bienvenido, ingrese el nombre");
                            String estado_equipamiento = JOptionPane.showInputDialog("Ingrese el estado");
                            String fechaMantenimiento_equipamiento = JOptionPane.showInputDialog("Ingrese la fecha de mantenimiento");
                            String proveedor_equipamiento = JOptionPane.showInputDialog("Ingrese el proveedor");
                            String areaMuscular_equipamiento = JOptionPane.showInputDialog("Ingrese el area muscular");
                            int pesoMaxSocio_equipamiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso maximo que aguanta"));
                            int cargaMax_equipamiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la carga maxima"));
                            int cargaMin_equipamiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de mantenimiento"));
                            int altura_equipamiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el proveedor"));
                            int anchura_equipamiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el area muscular"));
                            int longitud_equipamiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso maximo que aguanta"));
                            
                            Equipamiento equipamiento_de_prueba = new Equipamiento(
                                    nombre_equipamiento, 
                                    estado_equipamiento, 
                                    fechaMantenimiento_equipamiento, 
                                    proveedor_equipamiento, 
                                    areaMuscular_equipamiento, 
                                    pesoMaxSocio_equipamiento, 
                                    cargaMax_equipamiento, 
                                    cargaMin_equipamiento, 
                                    altura_equipamiento, 
                                    anchura_equipamiento, 
                                    longitud_equipamiento);
                            
                            lista_equipamiento.add(equipamiento_de_prueba);
                            break;
                            
                        // Mostrar equipamento
                        case 2:
                            JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar equipamiento");
                            if (lista_equipamiento.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "No hay equipamientos ingresados");
                            } else {
                                for (Equipamiento equipamientos_guardados : lista_equipamiento) {
                                    JOptionPane.showMessageDialog(null,
                                            "Nombre: " + equipamientos_guardados.getNombre() +
                                            "\nEstado: " + equipamientos_guardados.getEstado() +
                                            "\nFecha de Mantenimiento: " + equipamientos_guardados.getFechaMantenimiento() +
                                            "\nProveedor: " + equipamientos_guardados.getProveedor() +
                                            "\nArea Muscular: " + equipamientos_guardados.getAreaMuscular() +
                                            "\nPeso Maximo de Socio: " + equipamientos_guardados.getPesoMaxSocio() +
                                            "\nCarga Maxima: " + equipamientos_guardados.getCargaMax() +
                                            "\nCarga Minima: " + equipamientos_guardados.getCargaMin() +
                                            "\nAltura: " + equipamientos_guardados.getAltura() +
                                            "\nAnchura: " + equipamientos_guardados.getAnchura() +
                                            "\nLongitud: " + equipamientos_guardados.getLongitud());
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    
                // Planificacion
                case 5:
                    Planificacion planificacion = new Planificacion();

                    int opcionDia = Integer.parseInt(JOptionPane.showInputDialog(
                        "Seleccione un día:\n" +
                        "1 - Lunes\n" +
                        "2 - Martes\n" +
                        "3 - Miércoles\n" +
                        "4 - Jueves\n" +
                        "5 - Viernes"
                    ));
                            
                    String dia = "";
                        switch (opcionDia) {
                            case 1:
                                dia = "Lunes";
                                break;
                            case 2:
                                dia = "Martes";
                                break;
                            case 3:
                                dia = "Miércoles";
                                break;
                            case 4:
                                dia = "Jueves";
                                break;
                            case 5:
                                dia = "Viernes";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                                return;
                            }
                            
                           String rutinaDelDia = planificacion.getPlanificacionRandom();
                           JOptionPane.showMessageDialog(null, dia + " - " + rutinaDelDia);
                            
                           break;
                // Default
                default:
                    break;
            }
        }
    }
    
}
