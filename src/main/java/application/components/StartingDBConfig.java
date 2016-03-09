package application.components;

import com.tinkerpop.blueprints.TransactionalGraph;
import com.tinkerpop.blueprints.Vertex;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StartingDBConfig {


    public StartingDBConfig(){
    }


    @Bean
    public boolean initDB(TransactionalGraph graph){

        Vertex indirizzo1 = graph.addVertex("class:Indirizzo");
        indirizzo1.setProperty("Via", "Guarnieri");
        indirizzo1.setProperty("Civico", "14");
        indirizzo1.setProperty("Cap", 61032);
        indirizzo1.setProperty("Provincia", "PU");
        indirizzo1.setProperty("Nazione", "Italia");

        return true;
    }

}
