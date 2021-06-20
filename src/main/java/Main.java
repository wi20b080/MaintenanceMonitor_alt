import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import java.io.IOException;
import java.net.URI;

public class Main {

    public static void main(String[] args){
        //taken from https://www.youtube.com/watch?v=xFzbE6Mys6Y&list=PLjUo6ZG1ouB6HjxgwftzyjPj0bd5SbCJ_
        System.out.println("Starting REST Service...");
        ResourceConfig rc = new ResourceConfig().packages("at.team");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
        System.out.println("Server started");
        try {
            System.in.read();
        } catch (IOException e){
            e.printStackTrace();
        }
        server.stop(0);
        System.out.println("Server stopped");

    }

}
