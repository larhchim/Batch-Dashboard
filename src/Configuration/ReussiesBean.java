package Configuration;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@SuppressWarnings("deprecation")
@ManagedBean(name="reussies")
@SessionScoped
public class ReussiesBean implements Serializable {
	
	private ArrayList<Reussies> success;
	
	 private ReadAllRejectionshis selectedrejection;

	    
		public ReadAllRejectionshis getSelectedrejection() {
			return selectedrejection;
		}

		public void setSelectedrejection(ReadAllRejectionshis selectedrejection) {
			this.selectedrejection = selectedrejection;
		}
		
	@PostConstruct
	public void init() {
		
		try {
			success=Reussies.SuccededFunc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Reussies> getSuccess() {
		return success;
	}
	
	

}
