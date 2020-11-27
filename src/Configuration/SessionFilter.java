package Configuration;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter(filterName = "SessionFilter", urlPatterns = {"/*"})
public class SessionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req1=(HttpServletRequest)request;
        HttpServletResponse res1=(HttpServletResponse)response;
        
        String sessionUser=(String)req1.getSession().getAttribute("username");
        String currentPath=req1.getRequestURL().toString();
        
        if(sessionUser!=null){
            if(currentPath.contains("ICNJSF/faces/login.xhtml")){
                res1.sendRedirect(req1.getContextPath()+"/faces/viewMainPage.xhtml");
            }else{
                chain.doFilter(request, response);
            }
        }else{
            if(currentPath.contains("viewMainPage") || currentPath.contains("Dashboard") || currentPath.contains("DayTransactions") || currentPath.contains("Motif") || currentPath.contains("MotifHis") || currentPath.contains("Pops") || currentPath.contains("RejTrans") || currentPath.contains("RejTransHis") || currentPath.contains("Reussies") || currentPath.contains("TransactionsHistory") || currentPath.contains("mystyle") || currentPath.contains("loginStyle.css") ){
                res1.sendRedirect(req1.getContextPath()+"/faces/login.xhtml");
            }else{
                chain.doFilter(request, response);
            }
        }
        
       
    }

    @Override
    public void destroy() {
        
    }
    
 
   
    
}