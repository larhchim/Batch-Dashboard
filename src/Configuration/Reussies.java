package Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.sql.*;
public class Reussies {

	private String typFon;
	private Date date;
	private String ref;
	
	
	public Reussies(String typFon, Date date, String ref) {
		
		this.typFon = typFon;
		this.date = date;
		this.ref = ref;
		
	}


	public String getTypFon() {
		return typFon;
	}


	public void setTypFon(String typFon) {
		this.typFon = typFon;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getRef() {
		return ref;
	}


	public void setRef(String ref) {
		this.ref = ref;
	}
	
	
	public static ArrayList<Reussies> SuccededFunc() throws Exception{
		
		ArrayList<Reussies> tabRs= new ArrayList<Reussies>();
		
		Connection conn=ConnectionPsql.PsqlConnexion();
		
		PreparedStatement ps = conn.prepareStatement("\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"select \r\n" + 
				"CASE WHEN \"TYP-FON-TIE\" like 'MAJ-ICB' THEN 'Mise a jour'\r\n" + 
				"WHEN \"TYP-FON-TIE\" like 'CRE-ICB-LTC' THEN 'Creation'\r\n" + 
				"WHEN \"TYP-FON-TIE\" like 'SUP-ICB' THEN 'Suppression' END AS Typ_Fon_TIE\r\n" + 
				", \"DAT-FRAICHEUR\"::DATE ,\"REF-EXT\" from grc_ic_creees");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			tabRs.add(new Reussies(rs.getString(1),rs.getDate(2), rs.getString(3)));
		}
		
		return tabRs;
	}
	
	
}
