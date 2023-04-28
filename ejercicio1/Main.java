package ejemplo1;

public class Main {

    public static void main(String args[])
    {
        EcuacionDePrimerGrado ecuacion = new EcuacionDePrimerGrado();
        ecuacion.establecerA(4);
        ecuacion.establecerB(2);
    

        System.out.println("Valor A: "+ecuacion.obtenerA());
        System.out.println("Valor B: "+ecuacion.obtenerB());
  

        ecuacion.proceso();


    }
}
