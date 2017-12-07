package com.dp.codelab.resource;

import java.io.File;

import javax.enterprise.context.RequestScoped;
import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dp.codelab.annotaion.SecurityChecked;
import com.dp.codelab.util.Util;

@Path("/resource")
public class CodeLabResource {
	@Context ServletContext ctxx;
	private static final String text = "Message from Server :\n%s";
	
		@GET
		@SecurityChecked
		@RequestScoped 
		@Path("/check")
	    public Response notifyOrders(String input) {
		 
		 return Response.ok("Codelab is working properly").build();
		 
	 }
		@SecurityChecked
		@POST
		@Path("/add")
	    @Consumes(MediaType.APPLICATION_JSON)
	    public Response add(String  input) { 
		 System.out.println("<<<<<input>>>>>"+input);
		 Util util = new Util();
		String path= ctxx.getRealPath("/temp");
		System.out.println(path);
		 File dir = new File(path);
		 dir.mkdir();
		 System.out.println(dir.exists());

//		 util.write(ctxx.getRealPath("/amdocs_order.json"), input);
		 util.write(path+"/amdocs_order.json", input);
		 
		 String response = String.format(text, input);
		 return Response.status(Response.Status.OK).entity(response).type(MediaType.TEXT_PLAIN).build();
		 
	 }
}
