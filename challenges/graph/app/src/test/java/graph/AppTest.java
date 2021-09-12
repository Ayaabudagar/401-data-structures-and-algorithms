/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {

//        Node can be successfully added to the graph
        Graph<String> graph = new Graph<>();
        Node<String> vertex = graph.addNode("A");

        assertTrue(graph.map.containsKey(vertex));
//        An edge can be successfully added to the graph
        Node<String> vertex2 = graph.addNode("B");
        graph.addEdge(vertex,vertex2);

        assertEquals(vertex2 , graph.getNeighbors(vertex).get(0));
//        A collection of all nodes can be properly retrieved from the graph
        ArrayList<Node<String>> finalResult = new ArrayList<>();
        finalResult.add(vertex);
        finalResult.add(vertex2);
        assertEquals(finalResult, graph.getNodes());
//        All appropriate neighbors can be retrieved from the graph
        List<Node<String>> resultTwo = new ArrayList<>();
        resultTwo.add(vertex2);
        assertEquals(resultTwo , graph.getNeighbors(vertex));
//        The proper size is returned, representing the number of nodes in the graph
        assertEquals(2,graph.getSize());
//        A graph with only one node and edge can be properly returned
        Graph<String> oneNodeGraph = new Graph<>();
        Node<String> vertex3 = oneNodeGraph.addNode("A");

        ArrayList<Node<String>> result3 = new ArrayList<>();
        result3.add(vertex3);
        assertEquals(result3, oneNodeGraph.getNodes());
//        An empty graph properly returns null
        Graph<String> emptyGraph = new Graph<>();
        assertNull(emptyGraph.getNodes());

    }
}