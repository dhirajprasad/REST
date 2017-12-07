package com.dp.codelab.interceptor;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

import com.dp.codelab.annotaion.SecurityChecked;
import com.dp.codelab.util.Util;



@Provider
@SecurityChecked
public class AddInterceptor implements  ReaderInterceptor, WriterInterceptor{

	  @Context ServletContext ctxx;
	public void aroundWriteTo(WriterInterceptorContext context)
			throws IOException, WebApplicationException {

		System.out.println("Intercepted response");
        
		context.proceed();
	}

	public Object aroundReadFrom(ReaderInterceptorContext context)
			throws IOException, WebApplicationException {
		System.out.println("Intercepted request");
		System.out.println(ctxx.getRealPath("/WEB-INF/"));
		Util util =new Util();util.read(ctxx.getRealPath("/WEB-INF/resources/amdocs_order.json"));
		/*InputStream is = context.getInputStream();
	      @SuppressWarnings("resource")
		String body = new Scanner(is, "UTF-8").useDelimiter("\\A").next();
	      System.out.println(body+"body>>>>>>>");
	      context.setInputStream(new ByteArrayInputStream(
	              (body+"\nMy appended message in request body.\n").getBytes()));*/
        return context.proceed();
	}

}
