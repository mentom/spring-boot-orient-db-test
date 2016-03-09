package application.components;


import com.tinkerpop.blueprints.TransactionalGraph;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OrientDBConnection {

//    @Autowired
//    private StartingDBConfig startingDBConfig;

    private TransactionalGraph graph;
//
    public OrientDBConnection () {
        this.graph = new OrientGraph("remote:localhost/RubricaTelefonica", "admin", "admin");
//        boolean dbConfig = startingDBConfig.initDB(graph);
    }
//
    @Bean
    public String testAutowiring(){
        return "It Worked!";
    }
//
    @Bean
    public TransactionalGraph getGraph() {
        return graph;
    }
}
