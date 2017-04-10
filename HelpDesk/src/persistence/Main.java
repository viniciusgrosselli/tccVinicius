package persistence;  
  
import java.sql.Statement;  
import java.sql.Connection;  
import java.sql.DriverManager;  
  
/** 
 * 
 * @author Edwar Saliba Júnior 
 */  
public class Main {  
  
    /** 
     * @param args the command line arguments 
     */  
    public static void main(String[] args) {  
        EntityManagerUtil.getEntityManager();
    }  
}  