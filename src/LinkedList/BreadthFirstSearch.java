package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {
	private int V; //No. of vertices
	private LinkedList<Integer> adj[]; //adjecency list
	
	public BreadthFirstSearch(int v){
		this.V = v;
		adj = new LinkedList[V]; //define the size of an array
		for(int i=0;i<V;++i){
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdge(int src, int dest){
		adj[src].add(dest);
	}
	
	public void printGraph(BreadthFirstSearch graph){
		for (int i=0; i<this.V; i++){
			System.out.println("List of Vertex: " + i);
			System.out.println("head");
			for(Integer p: graph.adj[i]){
				System.out.print("->" + p);
			}
			System.out.println("\n");
		}
	}
	
	
	public void BFS(int s){
		//Mark all the vertices as not visited
		//By Default set as false
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		while(queue.size() != 0){
			//dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s + " ");
			//Get all adjcent vertices of the dequeued vertex s
			//if a adjacent has not been visited, then marked it
			//visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	public void DFSUtil(int v,boolean visited[]){
		//Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");
		
		//Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()){
			int n =i.next();
			if(!visited[n]){
				DFSUtil(n,visited);
			}
		}
	}
	
	public void DFS(int v){
		boolean visited[] = new boolean[V];
		DFSUtil(v,visited);
	}
	
	public static void main(String[] args){
		int V = 5;
		BreadthFirstSearch graph = new BreadthFirstSearch(V);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		graph.printGraph(graph);
		System.out.println("Following is Breadth First Traversal "+ "(starting from vertex 2)");

		graph.BFS(2);
		System.out.println("\n");
		System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

		graph.DFS(2);
		
		
	}
}
