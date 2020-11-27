package Configuration;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;

public class ReadAllRejectionshis {
	
	private String libelle_ano;
	private String fonTie;
	private Date dateFraicheur;
	private String ref_ext;
	
	public ReadAllRejectionshis(String libelle_ano, String fonTie, Date dateFraicheur, String ref_ext) {
		
		this.libelle_ano = libelle_ano;
		this.fonTie = fonTie;
		this.dateFraicheur = dateFraicheur;
		this.ref_ext = ref_ext;
		
	}

	public String getLibelle_ano() {
		
		return libelle_ano;
		
	}

	public void setLibelle_ano(String libelle_ano) {
		
		this.libelle_ano = libelle_ano;
		
	}

	public String getFonTie() {
		
		return fonTie;
		
	}

	public void setFonTie(String fonTie) {
		
		this.fonTie = fonTie;
		
	}

	public Date getDateFraicheur() {
		
		return dateFraicheur;
		
	}

	public void setDateFraicheur(Date dateFraicheur) {
		
		this.dateFraicheur = dateFraicheur;
		
	}

	public String getRef_ext() {
		
		return ref_ext;
		
	}

	public void setRef_ext(String ref_ext) {
		
		this.ref_ext = ref_ext;
		
	}
	
	
public static ArrayList<ReadAllRejectionshis> RejectionsFunc()throws Exception{
		
		ArrayList<ReadAllRejectionshis> tab=new ArrayList<>();
		
		Connection conn=ConnectionPsql.PsqlConnexion();
		
		PreparedStatement ps=conn.prepareStatement("SELECT libelle_ano,\r\n" + 
				"CASE WHEN \"typ_fon_tie\" like 'MAJ-ICB' THEN 'mise a jour'\r\n" + 
				"WHEN \"typ_fon_tie\" like 'SUP-ICB' THEN 'suppression'\r\n" + 
				"WHEN \"typ_fon_tie\" like 'CRE-ICB-LTC' THEN 'creation'\r\n" + 
				"END AS TYP_FON_Tie,\"dat_fraicheur\"::DATE ,\"ref_ext\"\r\n" + 
				"FROM grc_ic_rejete_his");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			tab.add(new ReadAllRejectionshis(rs.getString(1),rs.getString(2),rs.getDate(3),rs.getString(4)));
		}
		return tab;
	}


public static ArrayList<LibAno> FuncOp() throws Exception{
	
	 ArrayList<LibAno> cat = new ArrayList<>();
	 
	 Connection conn=ConnectionPsql.PsqlConnexion();
	 //7
	 PreparedStatement ps =conn.prepareStatement( "SELECT count ( CASE WHEN \"typ_fon_tie\" like 'MAJ-ICB' THEN 'mise a jour' END ) FROM grc_ic_rejete_his" );


	 ResultSet rs=ps.executeQuery();
	 rs.next();
	 //5
    PreparedStatement ps1 =conn.prepareStatement( "SELECT count ( CASE WHEN \"typ_fon_tie\" like 'SUP-ICB' THEN 'suppression' END ) FROM grc_ic_rejete_his " );

	 
	 ResultSet rs1=ps1.executeQuery();
	 rs1.next();
	 //0
    PreparedStatement ps2 =conn.prepareStatement( "SELECT count ( CASE WHEN \"typ_fon_tie\" like 'CRE-ICB-LTC' THEN 'creation' END ) FROM grc_ic_rejete_his" );
	
	 ResultSet rs2=ps2.executeQuery();
	 rs2.next();
	 
	 cat.add(new LibAno(rs.getInt(1), "Mise a jours"));
	 cat.add(new LibAno(rs1.getInt(1), "Suppressions"));
	 cat.add(new LibAno(rs2.getInt(1), "Creations"));

		
		return cat;
	}
	
	
	public static ArrayList<LibAno> FuncOp2() throws Exception{
		
		ArrayList<String> S1 = new ArrayList<String>();
		ArrayList<LibAno> S2 = new ArrayList<LibAno>();
		ArrayList<String> S3 = new ArrayList<String>();
		
		Connection conn=ConnectionPsql.PsqlConnexion();
		
		PreparedStatement ps = conn.prepareStatement(" SELECT libelle_ano FROM grc_ic_rejete_his");

		ResultSet rs =ps.executeQuery();
		
		while(rs.next()) {
			
			S1.add(rs.getString(1));
			
			
		}
		
	    PreparedStatement ps1 = conn.prepareStatement(" SELECT DISTINCT libelle_ano FROM grc_ic_rejete_his");

		
		ResultSet rs1 =ps1.executeQuery();
		
		while(rs1.next()) {
			
			S3.add(rs1.getString(1));
						
		}
		
		
		for (int i = 0; i < S3.size(); i++) {
			
			PreparedStatement ps2 = conn.prepareStatement(" SELECT count( libelle_ano ) FROM grc_ic_rejete_his WHERE libelle_ano LIKE ?");
			
			ps2.setString(1, S3.get(i));
	
			ResultSet rs2 =ps2.executeQuery();
			
			rs2.next();
			
		
			
			
			S2.add(new LibAno(rs2.getInt(1), S3.get(i)));
			
		
			
			
		}
		
		
		return S2;
		
		
	}
	
	
	public static ArrayList<Options> fun() throws Exception{
		
		ArrayList<LibAno> cat = ReadAllRejectionshis.FuncOp2();
		ArrayList<Options> opt = new ArrayList<>();
		String a;
		for (int i = 0; i < cat.size(); i++) {
			
			a="A"+(i+1);
			opt.add(new Options(cat.get(i).getLibelle(), cat.get(i).getNbre(), a));
			
			
		}
		
		return opt;
		
	}



}
