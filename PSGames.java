package ejemplosformularios.gamingshopgt;

public class PSGames extends Game {
    public PSGames(String nombre){
           this.nombre=nombre;
       }
    @Override
    public void agotados(){
        tiempoventa();
        if(tiempo>=2)
            this.existencia = false;
    }
    @Override
    public void tiempoventa(){
        this.tiempo+=1;
   }
}
