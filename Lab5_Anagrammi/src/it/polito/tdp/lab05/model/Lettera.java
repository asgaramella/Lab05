package it.polito.tdp.lab05.model;

public class Lettera {
	 private char lettera;
	 private int codice;
	public Lettera(char lettera, int codice) {
		super();
		this.lettera = lettera;
		this.codice = codice;
	}
	
	public char getLettera() {
		return lettera;
	}

	public void setLettera(char lettera) {
		this.lettera = lettera;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codice;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lettera other = (Lettera) obj;
		if (codice != other.codice)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Lettera [lettera=" + lettera + ", codice=" + codice + "]";
	}
	 
	 

}
