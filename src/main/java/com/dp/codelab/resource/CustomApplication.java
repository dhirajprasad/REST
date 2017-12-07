package com.dp.codelab.resource;

import org.glassfish.jersey.server.ResourceConfig;

import com.dp.codelab.interceptor.AddInterceptor;
import com.dp.codelab.interceptor.AuthenticationFilter;
import com.dp.codelab.interceptor.ValidationException;

public class CustomApplication extends ResourceConfig{
	public CustomApplication()
    {
        packages("com.dp.codelab.resource");
        
 
        //Register Auth Filter here
        register(AuthenticationFilter.class);
        register(ValidationException.class);
        register(AddInterceptor.class);
    }
}
