package example.action;

import com.opensymphony.xwork2.ActionSupport;
import example.service.UserService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;

/**
 * Created by MOMO on 2017/2/7.
 */
public class UserAction extends ActionSupport {
    private UserService service=new UserService();
    private HttpServletRequest request= ServletActionContext.getRequest();

    @Override
    public String execute() throws Exception {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        service.add(username,password);
        return "success";
    }
}
