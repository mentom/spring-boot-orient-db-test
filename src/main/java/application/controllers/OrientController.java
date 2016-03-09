package application.controllers;

import application.components.OrientDBConnection;
import application.components.StartingDBConfig;
import com.tinkerpop.blueprints.Vertex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrientController {

    @Autowired
    OrientDBConnection orientDBConnection;

    @Autowired
    private StartingDBConfig startingDBConfig;

    @RequestMapping("/")
    public String home() {
        String response = "";
        response = "Homepage";
        return response;
    }

    @RequestMapping("/orient")
    public String callOrientTest() {

//        String response = orientDBConnection.testAutowiring();
        String response = "";
        for (Vertex v : orientDBConnection.getGraph().query().has("Nome", "Tommaso").vertices()) {
            System.out.println("Selected node: " + v.getProperty("Nome") + v.getProperty("Cognome"));
            response += v.getProperty("Cognome") + "\n";
        }

        for (Vertex v : orientDBConnection.getGraph().query().has("Cap", 61032).vertices()) {
            System.out.println("Selected node: " + v.getProperty("Via") + v.getProperty("Provincia"));
            response += v.getProperty("Via") + "\n";
        }


        return response;
    }
}
