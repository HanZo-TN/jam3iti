/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Technique;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rmh
 */
public class SingletonConnection {
    
    private String url;
	private String mdp;
	private String login;
	private Connection dbConnexion;
	
	
	private SingletonConnection(){
		
		url = "jdbc:mysql://localhost:3306/esprit";
		mdp="espritpwd";
		login="esprit";
        try {
            dbConnexion = DriverManager.getConnection(url, login, mdp);
        } catch (SQLException ex) {
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		
		
	}
	
	static SingletonConnection c;
	public static synchronized SingletonConnection getInstance(){
		if(c==null)
		{c=new SingletonConnection();
		System.out.println("connection etablie"+c.hashCode());
		}
	else System.out.println("existe deja"+c.hashCode());
	return c;
	}
	public Connection getConnection()
	{
		return dbConnexion;
	}

    
}
