package Configuration;

public class LibAno {
	
	private int nbre;
	private String libelle;
	
	
	
	public LibAno(int nbre, String libelle) {
		
		this.nbre = nbre;
		this.libelle = libelle;
		
	}

	public int getNbre() {
		
		return nbre;
		
	}
	
	public void setNbre(int nbre) {
		
		this.nbre = nbre;
		
	}
	
	public String getLibelle() {
		
		return libelle;
		
	}
	
	public void setLibelle(String libelle) {
		
		this.libelle = libelle;
		
	}
	
	

}
