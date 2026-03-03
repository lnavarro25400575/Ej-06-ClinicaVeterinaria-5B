
public class Agenda {

    private Cita citas[];
    private int totalCitas = 0;
    private int capacidadMaxima;

    public Agenda(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        if (this.capacidadMaxima > 0) {
            this.citas = new Cita[capacidadMaxima];
        } else {
            System.out.println("La capacidad Maxima de citas debe ser mayor a 0");
        }
    }

    public void agregarCita(Cita cita) {
        if (totalCitas < capacidadMaxima) {
            this.citas[totalCitas] = cita;
            ++totalCitas;
        } else {
            System.out.println("Agenda llena");
        }
    }

    public void mostrarTodasLascITAS() {
        for (int i = 0; i < totalCitas; i++) {
            this.citas[i].mostrarResumen();
        }
    }    
    
    public void buscarCitasPorCliente(String nombre){
        for(int i=0; i<this.totalCitas; i++){
            if(citas[i].getcliente().getnombre().equals(nombre)){
                this.citas[i].mostrarResumen();
            }

        }
    }
    
    public int contarCitas(){
        return this.totalCitas;
    }
}
