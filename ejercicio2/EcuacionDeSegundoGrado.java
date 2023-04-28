package ejemplo2;
import java.lang.Math;
public class EcuacionDeSegundoGrado {
    double a;
    double b;
    double c;
    double expresion=0;
    double r1=0;
    double r2=0;
    public void establecerA(double numA){
        a = numA;
    }
    public double obtenerA(){
        return a;
    }
    public void establecerB(double numB){
        b = numB;
    }
    public double obtenerB(){
        return b;
    }
    public void establecarC(double numC){
        c = numC;
    }
    public double obtenerC(){
        return c;
    }
    public double discriminante(){
        expresion = Math.pow(obtenerB(), 2) - 4*obtenerA()*obtenerC();
        if (expresion > 0)
        {
            proceso();
            respuesta();
        }
        if (expresion == 0) 
        {
            proceso();
            respuesta();
        }
        if(expresion < 0)
        {
            System.out.println("el resultado es imaginario");
        }
        return 0;
    }  
    public void proceso(){
    
        r1=(-obtenerB()+(Math.sqrt(expresion)))/(2*obtenerA());
        r2=(-obtenerB()-(Math.sqrt(expresion)))/(2*obtenerA());
    }
    public void respuesta(){
        System.out.println("x1 = "+r1);
        System.out.println("x2 = "+r2);
    }
}
