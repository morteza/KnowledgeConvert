package ontology;

import java.util.HashMap;
import java.util.Map;

public class Graph {
	Map<String,GraphNode> nodes;
	Map<String,GraphRelation> relations;
	
	public Graph() {
		nodes = new HashMap<String, GraphNode>();
		relations = new HashMap<String, GraphRelation>();
	}
}
