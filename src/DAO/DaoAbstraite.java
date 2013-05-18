/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Technique.SingletonConnection;

/**
 *
 * @author rmh
 */
public abstract class DaoAbstraite<T> {
    public Connection connect(){
		return SingletonConnection.getInstance().getConnection();
	}
	public abstract void create();
	public abstract T insert (T obj);
	public abstract void delete(T obj);
	public abstract void update(T obj);
	public abstract T find(int id);
    
}
