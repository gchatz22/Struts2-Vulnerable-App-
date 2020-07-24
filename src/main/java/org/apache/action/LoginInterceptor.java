package org.apache.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.PreResultListener;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class LoginInterceptor extends BodyTagSupport implements Interceptor, PreResultListener {

    private String[] some;

    public String[] getSome(){
        return this.some;
    }

    public void setSome(String[] param){
        this.some = param;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public void beforeResult(ActionInvocation invocation, String resultCode) {
        HttpServletResponse response = (HttpServletResponse) invocation.getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
        System.out.println(getBodyContent());
        System.out.println("hey");

    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {

        invocation.addPreResultListener(this);

        return invocation.invoke();
    }
}
