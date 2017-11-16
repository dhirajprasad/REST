package com.dp.codelab.interceptor;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@com.dp.codelab.annotaion.SecurityChecked
public class CodeLabInterceptor {

	
	 @AroundInvoke
	    public Object checkSecurity(InvocationContext context) throws Exception {
	        /* check the parameters or do a generic security check before invoking the
	           original method */
		 System.out.println("===========================");
	        Object[] params = context.getParameters();
	        System.out.println("==========================="+params);
	        /* if security validation fails, you can throw an exception */

	        /* invoke the proceed() method to call the original method */
	        Object ret = context.proceed();

	        /* perform any post method call work */
	        return ret;
	    }
}
