import com.usermanager.resources.UserResources
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import java.net.URI
import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.core.UriBuilder


class App {
    fun server(): HttpServer {
        val config = ResourceConfig().register(UserResources::class.java)
        return GrizzlyHttpServerFactory.createHttpServer(baseUri(), config)

    }

    private fun baseUri(): URI {
        return UriBuilder.fromUri("http://localhost/").port(9090).build()
    }
}


fun main() {
    println("Starting HTTP Server...")
    var server = App().server()
    server.start()
    print("server started successfully")
}