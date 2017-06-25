package graph;

import java.util.LinkedList;

public class AdjacencyList {

	private final int defaultVertex =10;
	private final LinkedList<Integer>[] graph;
	public AdjacencyList(){
		graph = (LinkedList<Integer>[]) new LinkedList[defaultVertex];
		addLists(graph, defaultVertex);
	}
	public AdjacencyList(int v){
		graph = (LinkedList<Integer>[])new LinkedList[v];
		addLists(graph, v);
	}
	
	private void addLists(LinkedList<Integer>[] graph, int num){
		for(int i=0; i <num;i++){
			graph[i] = new LinkedList<Integer>();
		}
	}
	
	 public void addEdge(int from, int to){
		graph[from-1].add(to-1);
	}
	 
	 
	 public void printAdjacencyList(){
		 int num =0;
		 for (LinkedList<Integer> i : graph){
			 System.out.println("AdjacencyList for"+ ++num +"  -->");
			 for(Integer j : i){
				 System.out.print(j+1 + ", ");
			 }
			 //num++;
		 }
	 }
	 
	 public int numberOfVertices(/*LinkedList<Integer>[] graph*/){
		 return graph.length;
	 }
	 
	 public int numberOfEdgesForAVertex(int vertex){
		 
		 return graph[vertex-1].size();
		 //return 0;
		 
	 }
	 
	 public LinkedList<Integer> getEdgesFromVertex(int vertex){
		 return graph[vertex];
	 }
	 
	 
	public static void main(String[] args){
		AdjacencyList graph = new AdjacencyList(5);
		graph.addEdge(1, 5);
		graph.addEdge(1, 2);
		graph.addEdge(5, 1);
		graph.addEdge(2, 1);
		graph.addEdge(5, 2);
		graph.addEdge(2, 5);
		graph.addEdge(2, 3);
		graph.addEdge(3, 2);
		graph.addEdge(3, 4);
		graph.addEdge(4, 3);
		graph.addEdge(4, 5);
		graph.addEdge(5, 4);
		System.out.println("Number of Vertices " + graph.numberOfVertices());
		System.out.println("Edges for vertex" + 2   + graph.numberOfEdgesForAVertex(2));
		System.out.println("The edges are" + graph.getEdgesFromVertex(2).toString());
		
		graph.printAdjacencyList();
	}
	
}
