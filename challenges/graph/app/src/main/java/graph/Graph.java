package graph;

import java.util.*;

public class Graph {

    private Map<Node, List<Node>> adjVertices = new HashMap<>();

    public void setAdjVertices(Map<Node, List<Node>> adjVertices) {
        this.adjVertices = adjVertices;
    }



    public List<Node> addEdge(String label1, String label2) {
        Node v1 = new Node(label1);
        Node v2 = new Node(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
        return adjVertices.get(v1);
    }
    public Node addVertex(String label) {
        Node vertex= new Node(label);
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
        return vertex;
    }


    public int getSize(){
//        System.out.println(adjVertices.size());
        return adjVertices.size();
    }
    public Map<Node, List<Node>> getAdjVertices() {
        return adjVertices;
    }

    public List<Node> getNeighbors(Node vertex){
        return (List<Node>) adjVertices.get(vertex);
    }


    public List<Node> breadthFirst( Node vertex){
        List<Node> visited  =new ArrayList<>();
        List<Node> listOfVertex = new ArrayList<>();

        listOfVertex.add(vertex);

        while (listOfVertex.size() != 0){
            visited.add(listOfVertex.get(0));
            List<Node> allNeighbors = adjVertices.get(listOfVertex.get(0));
            listOfVertex.remove(0);
            System.out.println("allNeighbors: "+allNeighbors);
            for(Node vertex2: allNeighbors){
                if(!visited.contains(vertex2)){
                    listOfVertex.add(vertex2);
                    System.out.println(vertex2);
                }
            }
        }
        return visited;
    }

    public void addEdge(String label1, String label2, int weight) {
        Node wVertex1 = new Node(label1, weight);
        Node wVertex2 = new Node(label2, weight);

        Node vertex1 = new Node(label1, weight);
        Node vertex2 = new Node(label2, weight);

        adjVertices.get(vertex1).add(wVertex2);
        adjVertices.get(vertex2).add(wVertex1);
    }


    private int totalCost = 0;
    public int citiesTrip(Graph graph, List<String> cities){
        totalCost = 0;
        if (cities.size() <= 1  ){
            return 0;
        }
        if(graph == null){
            return 0;
        }
        for (int i = 0; i < cities.size()-1; i ++){
            calculatePrice(cities.get(i), cities.get(i + 1), graph);
        }

        return totalCost;
    }

    private void calculatePrice(String city1, String city2, Graph graph){
        Node vertex= new Node(city1);
        if (graph.getNeighbors(vertex) == null){
            return;
        }

        for (Node vertex1: graph.getNeighbors(vertex)) {
            if (Objects.equals(city2, vertex1.label)){
                totalCost += vertex1.weight;
                break;
            }
        }
    }

    List list= new ArrayList();
    public List<Node> depthFirst(Node vertex){
        if(vertex == null){
            return list;
        }
        list.add(vertex.label);
        System.out.println(vertex);
        List<Node> neighborsList = getNeighbors(vertex);
        if (neighborsList.size()==0){
            return list;
        }
        for ( Node v: neighborsList) {
            if(!list.contains(v.label))
                depthFirst(v);
        }

        return list;
    }
}