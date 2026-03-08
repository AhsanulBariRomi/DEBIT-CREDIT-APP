package interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import action.UserLoginAction;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy Called");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Init Called");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		Object user = ServletActionContext.getRequest().getSession().getAttribute("loggedinUser");
		if(user==null) {
			if(ai.getAction().getClass().equals(UserLoginAction.class)) {
				return ai.invoke();
			}
			return "input";
		}
		return ai.invoke();
	}
	
}
