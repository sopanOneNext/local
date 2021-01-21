package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello() {
		String resources="<? xml version='1.0'?>"+"<hello> Hi Phonon, hello from Sopan</hello>";
		return resources;
		
	}

}
