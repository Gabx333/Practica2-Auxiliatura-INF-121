//DIAGRAMA YA HECHO EN LA GUIA DE PRACTICA
package COMPOSICIONYAGREGACION.Ejercicio10;

public class Charla {
    private String nombreCharla;
    private String lugar;
    private Speaker S;
    private int np;
    private Participante[] P;

    public Charla(String nombreCharla, String lugar, Speaker S, int np) {
        this.nombreCharla = nombreCharla;
        this.lugar = lugar;
        this.S = S;
        this.np = np;
        this.P = new Participante[50];
    }
    public String getNombreCharla() {
        return nombreCharla;
    }
    public String getLugar() {
        return lugar;
    }
    public Speaker getS() {
        return S;
    }
    public int getNp() {
        return np;
    }
    public void agregarParticipante(Participante participante) {
        if (np < P.length) {
            P[np] = participante;
            np++;
        } else {
            System.out.println("No se pueden agregar más participantes, capacidad máxima alcanzada.");
        }
    }
    public Participante[] getP() {
        return P;
    }
    public boolean verificarSiSeEncuentraPartX(String nombreX, String apellidoX){
        for(int i=0; i<np; i++){
            if((P[i].getNombre().equals(nombreX) && P[i].getApellido().equals(apellidoX)) || (S.getNombre().equals(nombreX) && S.getApellido().equals(apellidoX))){
                return true;
            }
        }
        return false;
    }
    public void mostrarDatosCharla(){
        System.out.println("Nombre Charla: " + nombreCharla);
        System.out.println("Lugar: " + lugar);
        System.out.println("Speaker: " + S.getNombre() + " " + S.getApellido());
        System.out.println("Número de Participantes: " + np);
    }
}