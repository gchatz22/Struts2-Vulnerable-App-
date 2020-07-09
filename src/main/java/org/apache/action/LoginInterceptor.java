package org.apache.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.config.entities.ActionConfig;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

public class LoginInterceptor implements Interceptor {

    private String some;

    public String getSome(){
        return this.some;
    }

    public void setSome(String hey){
        this.some = hey;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionContext context = invocation.getInvocationContext();
        HttpServletRequest request = (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);

        ActionConfig test = invocation.getProxy().getConfig();
        System.out.println(test.getParams());
//        Enumeration en = request.getHeaderNames();
//
//        while (en.hasMoreElements() == true){
//            String header = (String) en.nextElement();
//            System.out.println(header);
//            System.out.println(request.getHeader(header));
//            System.out.println("\n");
//        }
//
//        System.out.println(context.getParameters());
//        System.out.println(request.getContextPath());
//        System.out.println(some);

        String resp = invocation.invoke();
//        System.out.println(resp.getClass());
        return resp;
    }
}
