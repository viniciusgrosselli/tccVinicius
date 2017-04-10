/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Vinicius
 */
public class Conexao {
    
    private static String url = "jdbc:postgresql://localhost:5432/DBHelpDesk";
    private static String driver = "org.postgresql.Driver";
    private static String usuario = "postgres";
    private static String senha = "postgres";
    private static Connection con = null;
    
    public static Connection getConexao(){
        if (con == null ) {
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(url, usuario, senha);
            } catch (Exception e) {
                System.out.println("Erro : " + e.getMessage());
            }
        }
        return con;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
         return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
        public static PreparedStatement getPreparedStatement(String sql){
        if (con == null){
            con = getConexao();
        }
        try {
            return con.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
        }
        return null;
    }
}
