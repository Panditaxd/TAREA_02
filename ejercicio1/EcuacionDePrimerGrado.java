package ejemplo1;
public class EcuacionDePrimerGrado{
    int a;
    int b;
    double expresion=0;
    public void establecerA(int numA){
        a = numA;
    }
    public double obtenerA(){
        return a;
    }
    public void establecerB(int numB){
        b = numB;
    }
    public double obtenerB(){
        return b;
    }
    public double proceso(){
        System.out.println("0 = "+obtenerA()+" + "+obtenerB()+" * x");
        expresion=(-obtenerA()/obtenerB());
        System.out.println("x = "+expresion);
        return 0;
    }
    
}