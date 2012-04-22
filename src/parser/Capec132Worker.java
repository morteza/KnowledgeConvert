package parser;

import java.util.ArrayList;

import ontology.GraphNode;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

public class Capec132Worker extends Thread {
	
	public Capec132Worker(String path) {
		setResourcePath(path);
	}
	
	public void setResourcePath(String path) {
		if (path.endsWith("/"))
			this.path = path + "attack_taxonomy_v1.3.2.xml";
		else this.path = path + "/attack_taxonomy_v1.3.2.xml";
	}
	
	public void run() {
    	try {
    		CharStream input = new ANTLRFileStream(path);
    		CapecParser132 parser = new CapecParser132(input);
    		while (parser.nextToken() != Token.EOF_TOKEN)
    			;
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
		
	}
	
	private String path = null;
    private ArrayList<GraphNode> nodes = new ArrayList<GraphNode>();

}
