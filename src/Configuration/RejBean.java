package Configuration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="rej")
@SessionScoped
public class RejBean implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private ArrayList<ReadAllRejections> rejection;
    private ReadAllRejections selectedrejection;
    private ArrayList<Options> op;
    private ArrayList<Options> OP;
    
    
    
    
    

    
	public ArrayList<Options> getOP() {

		return OP;
	}

	public void setOP(ArrayList<Options> oP) {
		OP = oP;
	}

	public ArrayList<Options> getOp() {

		return op;
	}

	public void setOp(ArrayList<Options> op) {
		this.op = op;
	}

	public ReadAllRejections getSelectedrejection() {
		return selectedrejection;
	}

	public void setSelectedrejection(ReadAllRejections selectedrejection) {
		this.selectedrejection = selectedrejection;
	}
	


	@PostConstruct
	public void init() {
		
		try {
			
			OP=ReadAllRejectionshis.fun();
		
			rejection=ReadAllRejections.RejectionsFunc();
			op=ReadAllRejections.fun();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<ReadAllRejections> getRejection() {
		
		return rejection;
		
	}
	
	

	
	
	
	
}
