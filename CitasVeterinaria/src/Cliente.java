
public class Cliente {
    private String nombre;
    private String identificacion;
    private String direccion;
    private String telefono;
    
    public Cliente(String nombre, String identificacion, String direccion, String telefono){
    this.nombre = nombre;
    this.direccion  = direccion;
    this.identificacion = identificacion;
    this.telefono = telefono;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return this.nombre;
    }
    
    public void setidentificacion(String identificacion){
        this.identificacion = identificacion;
        
    }
    
    public String getidentificacion(){
        return this.identificacion;
        
    }
    
    public void setdireccion(String direccion){
        this.direccion = direccion;
    }
    public String getdireccion(){
        return this.direccion;
    }
    
    public void settelefono(String telefono){
        this.telefono = telefono;
    }
    public String gettelefono(){
        return this.telefono;
    }
    
    public void mostrarDatosClientes(){
        System.out.println("Nombre del cliente: " + this.nombre + "\n" +
                "ID : " + this.identificacion + "\n" +
                "No.telefono: " +this.telefono + "\n" + 
                "direccion: " + this.direccion);
    }    
    
    
}





