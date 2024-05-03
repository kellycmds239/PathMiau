package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ConectarDao {
    public  Connection mycon = null;
    public String       sql = null;
    public PreparedStatement ps = null; 

    public ConectarDao () {
        String strcon = "jdbc:mysql://localhost:3306";//cria a string de conexão ao servidor xaamp 
        try {

            mycon = DriverManager.getConnection(strcon, "root", "");
            criarBanco();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + ex);
        }
    }

    
    public void criarBanco () {
        
         

        try {
            ps = mycon.prepareStatement("CREATE DATABASE IF NOT EXISTS petMiau");
            ps.execute();
            
            ps = mycon.prepareStatement("USE petMiau");
            ps.execute();
            
                       
            ps = mycon.prepareStatement("create table  if not exists clientes() ");
            ps.execute();
            
            
            ps = mycon.prepareStatement("create table  if not exists clientes() ");
            ps.execute();
            
            
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados !" + err.getMessage());
        }
    
    }
    
}
