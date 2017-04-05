package example.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

/**
 * Created by MOMO on 2017/2/7.
 */
@ParentPackage(value = "struts-default")
@Namespace(value = "/")
@Actions({
        @Action(value = "product", results= {
                @Result(name = "success",location = "/success.jsp"),
                @Result(name = "error",location = "/error.jsp")
        })
})

/**
 * 零配置
 * 去掉11-15行
 * form的Action写products
 * 注解加上
 *  @Results({
    @Result(name = "success",location = "/success.jsp")
    })
 */
public class ProductsAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return "success";
    }
}
