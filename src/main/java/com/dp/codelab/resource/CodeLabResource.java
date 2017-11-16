package com.dp.codelab.resource;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;





import com.dp.codelab.annotaion.SecurityChecked;

@Path("/resource")
public class CodeLabResource {
	
	
	
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
	    public Response add(String input) { 
		 System.out.println("<<<<<>>>>>"+input);
		 return Response.ok("success").build();
		 
	 }
}
