package hm.moe.heignamerican.jerseysandbox;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.multipart.FormDataParam;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN + ";charset=UTF-8")
public class HelloAPI {
	@GET
	public Response helloByGet() {
		return Response.ok("こんにちは西園寺世界\n").build();
	}

	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response helloByPost(@FormDataParam("name") String aName) {
		return Response.ok("こんにちは" + aName + "\n").build();
	}
}
