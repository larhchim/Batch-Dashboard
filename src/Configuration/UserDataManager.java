package Configuration;

public class UserDataManager {
    
    
    public User findUser(String username,String password){
        if("ahmed-erramhi-eurafric@gmail.com".equalsIgnoreCase(username) && "Ahmed123".equalsIgnoreCase(password)){
            return new User("Ahmed","Erramhi");
        }else if("ismaillarhchim864@gmail.com".equalsIgnoreCase(username) && "ismail123".equalsIgnoreCase(password)){
            return new User("larhchim","ismail");
        }else if("contact-eurafric@gmail.com".equalsIgnoreCase(username) && "eurafric123".equalsIgnoreCase(password)){
            return new User("eurafric","information");
        }
        return null;
    }
}