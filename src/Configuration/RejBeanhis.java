package Configuration;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="rejHis")
@SessionScoped
public class RejBeanhis implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	private ArrayList<ReadAllRejectionshis> rejection;
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
		
			rejection=ReadAllRejectionshis.RejectionsFunc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<ReadAllRejectionshis> getRejection() {
		
		return rejection;
		
	}
	

	

}
