package gym;
public class Equipamiento {
    public String nombre;
    public String estado;
    public String[] fechaMantenimiento;
    public String proveedor;
    public String[] areaMuscular;
    public int pesoMaxSocio;
    public int cargaMax;
    public int cargaMin;
    public int altura;
    public int anchura;
    public int longitud;

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public String[] getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String[] getAreaMuscular() {
        return areaMuscular;
    }

    public int getPesoMaxSocio() {
        return pesoMaxSocio;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public int getCargaMin() {
        return cargaMin;
    }

    public int getAltura() {
        return altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaMantenimiento(String[] fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setAreaMuscular(String[] areaMuscular) {
        this.areaMuscular = areaMuscular;
    }

    public void setPesoMaxSocio(int pesoMaxSocio) {
        this.pesoMaxSocio = pesoMaxSocio;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public void setCargaMin(int cargaMin) {
        this.cargaMin = cargaMin;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Equipamiento(String nombre, String estado, String[] fechaMantenimiento, String proveedor, String[] areaMuscular, int pesoMaxSocio, int cargaMax, int cargaMin, int altura, int anchura, int longitud) {
        this.nombre = nombre;
        this.estado = estado;
        this.fechaMantenimiento = fechaMantenimiento;
        this.proveedor = proveedor;
        this.areaMuscular = areaMuscular;
        this.pesoMaxSocio = pesoMaxSocio;
        this.cargaMax = cargaMax;
        this.cargaMin = cargaMin;
        this.altura = altura;
        this.anchura = anchura;
        this.longitud = longitud;
    }
    public void registrarEquipamiento(){
        
    }
    public void mostrarEquipamiento(){
        
    }
    public void editarEquipamiento(){
        
    }
    public void eliminarEquipamiento(){
        
    }
}
