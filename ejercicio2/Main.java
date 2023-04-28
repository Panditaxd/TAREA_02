package ejemplo2;

public class Main {

    public static void main(String args[])
    {
        EcuacionDeSegundoGrado ecuacion = new EcuacionDeSegundoGrado();
        ecuacion.establecerA(4);
        ecuacion.establecerB(8);
        ecuacion.establecarC(-12);

        System.out.println("Valor A: "+ecuacion.obtenerA());
        System.out.println("Valor B: "+ecuacion.obtenerB());
        System.out.println("Valor C: "+ecuacion.obtenerC());

        ecuacion.discriminante();


    }
}
