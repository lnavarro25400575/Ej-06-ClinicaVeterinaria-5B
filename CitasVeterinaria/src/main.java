public class main {
  public static void main(String[] args){
      Mascota mirinda = new Mascota("Mirinda", "Perro", "Fina", 3, 20);
      Cliente licho = new Cliente("Doña Licho", "ID-LICHO", "Av.Mx123", "311-Licho");
      Cita c1 = new Cita (licho, mirinda, "02/03/26", "16:00");
      //c1.mostrarResumen();
      c1.getcliente().settelefono("311-210-3465");
      //c1.mostrarResumen();
      
      
     Mascota fanta = new Mascota("fanta", "Perro", "Fina", 1, 25);
      Cliente simon = new Cliente("Don Simon", "ID-SIMON", "Av.Mx1001", "311-SIMON");
      Cita c2 = new Cita (simon, fanta, "03/03/26", "16:00");
     // c2.mostrarResumen();
      c2.getcliente().setnombre("Simon");
      
      Agenda ag1 = new Agenda(5);
      ag1.agregarCita(c1);
      ag1.agregarCita(c2);
      ag1.agregarCita(c1);
      
      ag1.buscarCitasPorCliente("Doña Licho");
      System.out.println("Total de citas en la agenda: " + ag1.contarCitas());        
      
  }  
}
