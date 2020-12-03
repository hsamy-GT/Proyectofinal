package ejemplosformularios.gamingshopgt;
import ejemplosformularios.gamingshopgt.Game;
import java.util.ArrayList;

public class GamingShopGT {

    ArrayList <Game>games = new ArrayList();
    public void ingresarJuego(Game tmp){
        games.add(tmp);
    
    }
     
    /*public void venderJuego(String game){
        int n=games.size();
        Game tmp;
        for (int i=0; i<=(n-1); i++){
            tmp=null;
            tmp=games.get(i);
            if (tmp.nombre.compareTo(game)==0)
             break;
        
        }
    }
    */
    
    public void agotado(){
        ArrayList <Game>ActGames = new ArrayList();
        int n = games.size();
        Game tmp;
        for (int i=0; i<=(n-1); i++){
            tmp=null;
            tmp=games.get(i);
            tmp.agotados();
            ActGames.add(tmp);
        }   
        games.clear();
        games=ActGames;
    }
    
    public String verIngresos(){
        String gameList = "";
        int n=games.size();
        String existencia = " ";
        Game tmp;
        for(int i=0;i<=(n-1);i++){
            tmp=null;
            tmp=games.get(i);
           if(tmp.getExistencia())
               existencia = "Disponible para venta";
           else 
               existencia = "No disponible para compra";
            gameList+="*Juego: "+tmp.nombre+" *Existencia: "+existencia+" *Tiempo: "+tmp.tiempo+" días";
            gameList+="\n";
    }
        return gameList;
    }
}
