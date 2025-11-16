//DIAGRAMA YA HECHO EN LA GUIA DE PRACTICA
package COMPOSICIONYAGREGACION.Ejercicio10;

public class Evento {
    private String nombre;
    private int nc;
    private Charla[] C;
    public Evento(String nombre){
        this.nombre = nombre;
        this.C = new Charla[50];
    }
    public String getNombre(){
        return nombre;
    }
    public int getNc(){
        return nc;
    }
    public void agregarCharla(Charla charla){
        if(nc < C.length){
            C[nc] = charla;
            nc++;
        } else {
            System.out.println("No se pueden agregar más charlas, capacidad máxima alcanzada.");
        }
    }
    public double calcularPromedioEdad() {
        if (nc == 0) {
            return 0;
        }
        int cont = 0;
        int sumaEdades = 0;
        for (int i = 0; i < nc; i++) {
            for(int j=0; j<C[i].getNp(); j++){
                sumaEdades += C[i].getP()[j].getEdad();
                cont++;
            }
        }
        if (cont == 0) return 0;
        return (double) sumaEdades / cont;
    }
    public boolean verificarSiSeEncuentraParticipanteX(String nombreX, String apellidoX){
        for(int i=0; i<nc; i++){
            if(C[i].verificarSiSeEncuentraPartX(nombreX, apellidoX)){
                return true;
            }
        }
        return false;
    }
    public void eliminarCharlasSpeakerX(int ciX) {
        int nuevaCantidad = 0;
        Charla[] nuevasCharlas = new Charla[C.length];

        for (int i = 0; i < nc; i++) {
            if (C[i].getS().getCi() != ciX) {
                nuevasCharlas[nuevaCantidad++] = C[i];
            }
        }

        C = nuevasCharlas;
        nc = nuevaCantidad;
    }
    public void ordenarCharlasNroParticipantes(){
        for(int i=0; i<nc-1; i++){
            for(int j=0; j<nc-i-1; j++){
                if(C[j].getNp() > C[j+1].getNp()){
                    Charla temp = C[j];
                    C[j] = C[j+1];
                    C[j+1] = temp;
                }
            }
        }
    }
    public void mostrarCharlas() {
        for (int i = 0; i < nc; i++) {
            //if (C[i] != null) suponiendo que ninguna charla es nula
                C[i].mostrarDatosCharla();
            //}
        }
    }
}
