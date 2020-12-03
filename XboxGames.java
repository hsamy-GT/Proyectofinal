package ejemplosformularios.gamingshopgt;

public class XboxGames extends Game {
    public XboxGames(String nombre){
           this.nombre=nombre;
       }
    @Override
    public void agotados(){
        tiempoventa();
        if(tiempo>3)
            this.existencia = false;
    }
    
    @Override
    public void tiempoventa(){
        this.tiempo+=1;
   }
}
