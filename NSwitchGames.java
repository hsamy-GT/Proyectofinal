package ejemplosformularios.gamingshopgt;

public class NSwitchGames extends Game {
    public NSwitchGames(String nombre){
        this.nombre = nombre;    
    }
    
    @Override
    public void agotados(){
        tiempoventa();
        if(tiempo>5)
            this.existencia = false;
    }
    @Override
    public void tiempoventa(){
        this.tiempo+=1;
   }
}