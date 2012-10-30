package hm.moe.heignamerican.jerseysandbox;

import javax.servlet.annotation.WebServlet;

import com.sun.jersey.spi.container.servlet.ServletContainer;

@WebServlet(value = { "/api/*" }, loadOnStartup = 1)
public class Application extends ServletContainer {
	private static final long serialVersionUID = 1L;
}
