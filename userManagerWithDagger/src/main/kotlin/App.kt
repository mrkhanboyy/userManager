import com.usermanager.di.component.DaggerAppComponent
import com.usermanager.resources.UserResources
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import java.net.URI
import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.core.UriBuilder




fun main() {

    val component = DaggerAppComponent.builder().build()
    val httpServer = component.server()
    httpServer.start()
}

