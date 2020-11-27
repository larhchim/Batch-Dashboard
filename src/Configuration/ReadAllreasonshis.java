package Configuration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class ReadAllreasonshis {
	
	private Date date_traitement;
	private String ref_ext;
	private String motif_rjet;
	private String type_ano;
	private String nat_maj;
	private String cyc_vie;
	private String typ_maj_icb;
	private String typ_prd;
	
	
	public ReadAllreasonshis(Date date_traitement, String ref_ext, String motif_rjet, String type_ano, String nat_maj,String cyc_vie, String typ_maj_icb, String typ_prd) 
	{
		
		this.date_traitement = date_traitement;
		this.ref_ext = ref_ext;
		this.motif_rjet = motif_rjet;
		this.type_ano = type_ano;
		this.nat_maj = nat_maj;
		this.cyc_vie = cyc_vie;
		this.typ_maj_icb = typ_maj_icb;
		this.typ_prd = typ_prd;
		
	}


	public Date getDate_traitement() {
		
		return date_traitement;
		
	}
	


	public void setDate_traitement(Date date_traitement) {
		
		this.date_traitement = date_traitement;
		
	}


	public String getRef_ext() {
		
		return ref_ext;
		
	}


	public void setRef_ext(String ref_ext) {
		
		this.ref_ext = ref_ext;
		
	}


	public String getMotif_rjet() {
		
		return motif_rjet;
		
	}


	public void setMotif_rjet(String motif_rjet) {
		
		this.motif_rjet = motif_rjet;
		
	}


	public String getType_ano() {
		
		return type_ano;
		
	}


	public void setType_ano(String type_ano) {
		
		this.type_ano = type_ano;
		
	}


	public String getNat_maj() {
		
		return nat_maj;
		
	}


	public void setNat_maj(String nat_maj) {
		
		this.nat_maj = nat_maj;
		
	}


	public String getCyc_vie() {
		
		return cyc_vie;
		
	}


	public void setCyc_vie(String cyc_vie) {
		
		this.cyc_vie = cyc_vie;
		
	}


	public String getTyp_maj_icb() {
		
		return typ_maj_icb;
		
	}


	public void setTyp_maj_icb(String typ_maj_icb) {
		
		this.typ_maj_icb = typ_maj_icb;
		
	}


	public String getTyp_prd() {
		
		return typ_prd;
		
	}


	public void setTyp_prd(String typ_prd) {
		
		this.typ_prd = typ_prd;
		
	}
	
	
	public static ArrayList<ReadAllreasonshis> AllElements() throws Exception{
		ArrayList<ReadAllreasonshis> array = new ArrayList<>();
		Connection conn = ConnectionPsql.PsqlConnexion();
		PreparedStatement ps =conn.prepareStatement("\r\n" + 
				"SELECT date_traitement AS DateTraitement,ref_ext AS reference,motif_rejet AS Motif,type_ano AS Anomalie,\r\n" + 
				"CASE WHEN nat_maj like 'C' THEN 'Creation'\r\n" + 
				"WHEN  nat_maj like 'M' AND cyc_vie like 'T' THEN 'Cloture'\r\n" + 
				"WHEN nat_maj like 'M' AND cyc_vie like 'C' AND typ_maj_icb like 'S' THEN 'Transfert'\r\n" + 
				"WHEN nat_maj like 'M' AND cyc_vie like 'T' AND typ_maj_icb like 'S' THEN 'Suppression'\r\n" + 
				"END AS Nature_mise_A_jour,\r\n" + 
				"cyc_vie AS CycleVie ,CASE WHEN typ_maj_icb IS NULL THEN 'pas de mise a jour icb' END AS type_maj_icb,\r\n" + 
				"CASE WHEN typ_prd like 'CON' THEN 'Convergence ou Assurance'\r\n" + 
				"WHEN typ_prd like 'CPT' THEN 'Comptes'\r\n" + 
				"WHEN typ_prd like 'MON' THEN 'Monetique'\r\n" + 
				"WHEN typ_prd like 'CRE' THEN 'Credit'\r\n" + 
				"END AS Produit \r\n" + 
				"FROM icx_delta_ano_motif_his");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			array.add(new ReadAllreasonshis(rs.getDate(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7), rs.getString(8)) );
		}
		
		return array;
	}
	
	
	

}
