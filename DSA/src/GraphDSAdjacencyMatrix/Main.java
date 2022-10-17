/**
 * 
 */
package GraphDSAdjacencyMatrix;

import java.util.ArrayList;

/**
 * @author Rohit
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		
		Graph g = new Graph(nodeList);
		g.addUndirectEdge(0, 1);
		g.addUndirectEdge(0, 2);
		g.addUndirectEdge(0, 3);
		g.addUndirectEdge(1, 4);
		g.addUndirectEdge(2, 3);
		g.addUndirectEdge(3, 4);
		System.out.print(g.toString());
		
	}

}
