package it.polito.tdp.lab05.model;

import java.util.*;

import it.polito.tdp.lab05.DAO.AnagrammaDAO;

public class Model {
	private char[] lettere;
	private List<Lettera> parola;
	
	
   public Model() {
		super();
		
	}

	private void scegli( List<Lettera>parziale,int livello,List<String> anagrammi){
		if(parziale.size()==lettere.length){
			String s="";
			for(Lettera ltemp:parziale){
			s+=Character.toString(ltemp.getLettera());
			}
			if(!anagrammi.contains(s))
				anagrammi.add(s);
		}
		else{
			
			for(Lettera ltemp: parola){
				 if(! parziale.contains(ltemp)){
					 
				     parziale.add(ltemp);
					 
					 scegli(parziale,livello+1,anagrammi);
					 
					 parziale.remove(ltemp);
					 
			}
					
			}
			
		}
	}
	
	public List<String> risolvi(String s){
		lettere=s.toCharArray();
		parola=new LinkedList<Lettera>();
		
		for(int i=0;i<lettere.length;i++){
			parola.add(new Lettera(lettere[i],i));
		}
		
		
		List<Lettera> parziale= new LinkedList<Lettera>() ;
		List<String> anagrammi=new LinkedList<String>();
		scegli(parziale,0,anagrammi);
		return anagrammi;
	}
	
	
	public boolean trovata(String s){
		AnagrammaDAO dao= new AnagrammaDAO();
		return dao.isCorrect(s);
	}
	
}
