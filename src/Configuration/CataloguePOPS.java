package Configuration;

import java.util.ArrayList;
import java.sql.*;

public class CataloguePOPS {
	
	
	private String activite;
	private String libelleActivite;
	private String sousActivite;
	private String libellesousAct;
	private String codeProduit;
	private String nomsysop;
	private String codesysop;
	
	
	public CataloguePOPS(String activite, String libelleActivite, String sousActivite, String libellesousAct,String codeProduit, String nomsysop, String codesysop) 
	{
		
		this.activite = activite;
		this.libelleActivite = libelleActivite;
		this.sousActivite = sousActivite;
		this.libellesousAct = libellesousAct;
		this.codeProduit = codeProduit;
		this.nomsysop = nomsysop;
		this.codesysop = codesysop;
		
	}

	public String getActivite() {
		
		return activite;
		
	}

	public void setActivite(String activite) {
		
		this.activite = activite;
		
	}

	public String getLibelleActivite() {
		
		return libelleActivite;
		
	}

	public void setLibelleActivite(String libelleActivite) {
		
		this.libelleActivite = libelleActivite;
		
	}

	public String getSousActivite() {
		
		return sousActivite;
		
	}

	public void setSousActivite(String sousActivite) {
		
		this.sousActivite = sousActivite;
		
	}

	public String getLibellesousAct() {
		
		return libellesousAct;
		
	}

	public void setLibellesousAct(String libellesousAct) {
		
		this.libellesousAct = libellesousAct;
		
	}

	public String getCodeProduit() {
		
		return codeProduit;
		
	}

	public void setCodeProduit(String codeProduit) {
		
		this.codeProduit = codeProduit;
		
	}

	public String getNomsysop() {
		
		return nomsysop;
		
	}

	public void setNomsysop(String nomsysop) {
		
		this.nomsysop = nomsysop;
		
	}

	public String getCodesysop() {
		
		return codesysop;
		
	}

	public void setCodesysop(String codesysop) {
		
		this.codesysop = codesysop;
		
	}
	
	public static ArrayList<CataloguePOPS> CatalogueFunc() throws Exception{
		
		ArrayList<CataloguePOPS> cat=new ArrayList<CataloguePOPS>();
		Connection conn =ConnectionPsql.PsqlConnexion();
		
		PreparedStatement ps = conn.prepareStatement("select activite,libelle_activite,sous_activite,libelle_sous_activite,code_produit,nom_sys_operant,code_sys_operant FROM cat_pops");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			cat.add(new CataloguePOPS(rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7)));
		}
		
		return cat;
	}
	
	

}
