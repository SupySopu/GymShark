package gym;

public class Ejercicio {
    public String nombre;
    public int repeticiones;
    public int series;
    
    public Ejercicio(String nombre, int repeticiones, int series){
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.series = series;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
    
    
}
