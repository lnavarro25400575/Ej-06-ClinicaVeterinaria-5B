
public class Mascota {

    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private double peso;

    public Mascota(String nombre, String especie, String raza, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return this.nombre;
    }

    public void setespecie(String especie) {
        this.especie = especie;
    }

    public String getespecie() {
        return this.especie;
    }

    public void setraza(String raza) {
        this.raza = raza;
    }

    public String getraza() {
        return this.raza;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public int getedad() {
        return this.edad;
    }

    public void setpeso(double peso) {
        this.peso = peso;
    }

    public double getpeso() {
        return this.peso;
    }

}
