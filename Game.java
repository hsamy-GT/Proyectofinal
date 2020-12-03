package ejemplosformularios.gamingshopgt;

public abstract class Game {
    
    public String nombre;
    
    public boolean existencia=true;
    public int tiempo=0;
    
    
    public abstract void agotados();
    public abstract void tiempoventa();

    public boolean getExistencia(){
        return existencia;
    }

}
