package parser;

import java.util.ArrayList;

import ontology.GraphNode;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

public class Capec17Worker extends Thread {
	
	public Capec17Worker(String path) {
		setResourcePath(path);
	}
	
	public void setResourcePath(String path) {
		if (path.endsWith("/"))
			this.path = path + "attack_taxonomy_v1.7.xml";
		else this.path = path + "/attack_taxonomy_v1.7.xml";
	}
	
	public void run() {
    	try {
    		CharStream input = new ANTLRFileStream(path);
    		CapecParser17 parser = new CapecParser17(input);
    		while (parser.nextToken() != Token.EOF_TOKEN)
    			;
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
		
	}
	
	private String path = null;
    private ArrayList<GraphNode> nodes = new ArrayList<GraphNode>();

}
