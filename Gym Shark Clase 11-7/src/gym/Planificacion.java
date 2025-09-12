package gym;

import java.util.Random;

public class Planificacion {
    public String[] rutinas = {
            "Día de piernas", 
            "Día de pecho", 
            "Día de brazos", 
            "Día de glúteos", 
            "Día de espalda",
            "Día de cardio",
            "Día de flexibilidad"
        };
    
    public String getPlanificacionRandom() {
        Random random = new Random();
        int indice = random.nextInt(rutinas.length);
        return rutinas[indice];
    }
}
