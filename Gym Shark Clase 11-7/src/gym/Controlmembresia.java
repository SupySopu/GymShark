package gym;
public class Controlmembresia {
public String[] tipo;
public String[] fechaInicio;
public String[] fechaVencimiento;
public int precio;
public int descuento;

    public String[] getTipo() {
        return tipo;
    }

    public String[] getFechaInicio() {
        return fechaInicio;
    }

    public String[] getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getPrecio() {
        return precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public void setFechaInicio(String[] fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaVencimiento(String[] fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Controlmembresia(String[] tipo, String[] fechaInicio, String[] fechaVencimiento, int precio, int descuento) {
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.precio = precio;
        this.descuento = descuento;
    }

    public void registrarMem(){
        
    }
    public void mostrarMem(){
        
    }
    public void editarMem(){
        
    }
    public void eliminarMem(){
        
    }
    public void registrarMemAlSocio(){
        
    }
    public void mostrarMemAlSocio(){
        
    }
    public void editarMemAlSocio(){
        
    }
    public void eliminarMemAlSocio(){
        
    }
    public void calcularDescuento(){
        
    }
}
