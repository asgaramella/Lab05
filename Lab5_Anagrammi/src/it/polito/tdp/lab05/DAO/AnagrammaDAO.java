package it.polito.tdp.lab05.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class AnagrammaDAO {
	
	public boolean isCorrect(String anagramma){
		boolean ris=false;
		
		String sql="SELECT nome "+
					"FROM parola "+
					"where nome=?";
		
		String jdbcURL="jdbc:mysql://localhost/dizionario?user=root";
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, anagramma);

			ResultSet rs = st.executeQuery();

			if(rs.next()) {
				ris=true;
			}
			
			
			conn.close();
			return ris;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
		
	}
		
			}
	
	
		
		
	
	
	


