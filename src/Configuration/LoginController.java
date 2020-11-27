package Configuration;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@SessionScoped
@ManagedBean
public class LoginController implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
    private String password;
    private UserDataManager dataManager;
    private User sessionUser;
    
    @PostConstruct
    public void init(){
        if(dataManager==null){
            dataManager=new UserDataManager();
        }
    }
    
  
    
    
    public String login(){
        sessionUser=dataManager.findUser(username, password);
        
        if(sessionUser!=null){
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("username", username);
            return "viewMainPage.xhtml?faces-redirect=true";
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Username or Password is invalid"));
        }
        
        return "login.xhtml";
    }
    
    public void logout() {
    	FacesContext context = FacesContext.getCurrentInstance();
    	context.getExternalContext().invalidateSession();
        try {
			context.getExternalContext().redirect("./login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(User sessionUser) {
        this.sessionUser = sessionUser;
    }
    
    
    
}