package Configuration;

public class Options {
	
	private String lib;
	private int num;
	private String nn;
	
	
	public Options(String lib, int num, String nn) {
		
		this.lib = lib;
		this.num = num;
		this.nn = nn;
	}


	public String getLib() {
		return lib;
	}


	public void setLib(String lib) {
		this.lib = lib;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getNn() {
		return nn;
	}


	public void setNn(String nn) {
		this.nn = nn;
	}
	
	
	

}
