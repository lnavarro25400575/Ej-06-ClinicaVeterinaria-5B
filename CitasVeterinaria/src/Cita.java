
public class Cita {
    private Cliente cliente;
    private Mascota mascota;
    private String fecha;
    private String hora;
    
    public Cita(Cliente cliente, Mascota mascota, String fecha, String hora){
        this.cliente = cliente;
        this.mascota = mascota;
        this.fecha = fecha;
        this.hora = hora;
        
    }
    
    public void setmascota(Mascota mascota){this.mascota= mascota;}
    public Mascota getmascota(){return this.mascota;}
    
    public void setcliente(Cliente cliente){this.cliente = cliente;}
    public Cliente getcliente(){return this.cliente;}
    
    public void setfecha(String fecha){this.fecha = fecha;}
    public String getfecha(){return this.fecha;}
    
    public void sethora(String hora){this.hora = hora;}
    public String gethora(){return this.hora;}
    
    public void mostrarResumen(){
        System.out.println("-----Resumen de Cita-------");
        cliente.mostrarDatos();
        mascota.mostrarDatos();
        System.out.print("fecha: " +this.fecha + "| Hora: " +this.hora);
        System.out.println("----------------------------");
    }
    
}
