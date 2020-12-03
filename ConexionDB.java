package ejemplosformularios.gamingshopgt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionDB {
    public Connection con;

    public ConexionDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/databasegs","root","pasword");      
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void cerrar(){
        try{
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    
    }
    
    public void insertUpdate(String sql){
        try{
        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ResultSet select(String sql){
        try{
            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            return rs;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}