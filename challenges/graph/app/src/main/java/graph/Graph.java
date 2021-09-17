package graph;

import java.util.*;

public class Graph <T>{
    private Map<Node, List<Node>> map = new HashMap<>();
    public Node<T> addVertex(T value ){

        Node vertex = new Node( value);
        map.put(vertex,new ArrayList<>());
        return vertex;

    }
//    Map<Node <T>,
//            ArrayList<Node<T>>> map = new HashMap<>();
    public void addEdge(Node node1 , Node node2){
        map.get(node1).add(node2);
        map.get(node2).add(node1);
    }

    public ArrayList<Node> getNodes(){

        if (map.isEmpty()){
            return null;
        }

        ArrayList<Node> list = new ArrayList<>();
        list.addAll(map.keySet());
        return list;

    }

    public List<Node> getNeighbors(Node node){
        return map.get(node);
    }

    public int getSize(){
        return map.size();
    }

    public Node<T> addNode(String a) {
        return null;














    }
    public ArrayList<Node> breadthFirst( Node vertex){
        ArrayList<Node> array  =new ArrayList<>();
        ArrayList<Node> vertexArray = new ArrayList<>();
        List<Node> allNode = map.get(vertexArray.get(0));
        vertexArray.add(vertex);
        for(Node vertex2: allNode){
            if(!array.contains(vertex2)){
                vertexArray.add(vertex2);
        while (vertexArray.size() != 0){
            array.add(vertexArray.get(0));

            vertexArray.remove(0);

            }
        }

    }
        return array;

}



    private void tripPrice(String city1, String city2, Graph graph){
        Node vertex= new Node(city1);
        if (graph.getNeighbors(vertex) == null){
            return;
        }

        for (Node vertex1: graph.getNeighbors(vertex)) {
            if (Objects.equals(city2, vertex1)){
                cost ++;
                break;
            }

        }

}
     int cost = 0;
    public int citiesTrip(Graph graph, ArrayList<String> cities){
        cost = 0;
        if (cities.size() <= 1  ){
            return 0;
        }
        if(graph == null){
            return 0;
        }
        for (int i = 0; i < cities.size()-1; i ++){
            tripPrice(cities.get(i), cities.get(i + 1), graph);
        }

        return cost;
    }
   ArrayList  newList= new ArrayList();
    public List<Node> depthFirst(Node vertex){
        if(vertex == null){
            return newList;
        }
        newList.add(vertex);
        List<Node> neighborsList = getNeighbors(vertex);
        if (neighborsList.size()==0){
            return newList;
        }
        for ( Node v: neighborsList) {
            if(!newList.contains(v))
                depthFirst(v);
        }

        return newList;
    }
}
