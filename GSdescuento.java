package ejemplosformularios.gamingshopgt;


public class GSdescuento {
    public void calculo(int a, int b){
    }
    
    public void calculo(int a, int b, int d){    
    }
    
    public float descuento(int a, int b){
        return a * b/100;
        
    }
    public float descuento(int a, int b, int d){
        return (a*b/100)+d;
    }
}
