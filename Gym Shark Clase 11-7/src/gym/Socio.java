package gym;
import javax.swing.JOptionPane;

public class Socio {
public String nombre;
public String apellido;
public int DNI;
public int edad;
public int peso;
public int altura;
public String planDeEntrenamiento;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public String getPlanDeEntrenamiento() {
        return planDeEntrenamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
   public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPlanDeEntrenamiento(String planDeEntrenamiento) {
        this.planDeEntrenamiento = planDeEntrenamiento;
    }

    
    public Socio(String nombre, String apellido, int DNI, int edad, int peso, int altura, String planDeEntrenamiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.planDeEntrenamiento = planDeEntrenamiento;
    }
    
    public void registrarSocio(){
   
    }
   
    
    public void editarSocio(){
        
    }
    
    public void eliminarSocio(){
        
    }    

    public void pagarCuota(){
        
    }
    
    public void seleccionarTipoEntrenamiento(){
        
    }    

    public void reservarActividad(){
        
    }    
    
    public void invitarSocio(){
        
    }

    public void calcularIMC(){
        
    }    
}

