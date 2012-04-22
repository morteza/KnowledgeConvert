/** CAPEC/CVE/CWE Parser, by Morteza Ansarinia February 27, 2012 */

import ui.MainAppWindow;

public class Main {
    public static void main(String[] args) {
    	
    	for (int i = 0 ; i < args.length ; ) {
    		String arg = args[i++];
    		if (arg.equalsIgnoreCase("-ui")) {
    			break;
    		}else if (arg.equalsIgnoreCase("-cmd")) {
    			arg = args[i++];
        		if (arg.equalsIgnoreCase("translate")) {
        			String capecXML = args[i++];
        			String cveXML = args[i++];
        			String cweXML = args[i++];
        			String output = args[i++];
        			System.out.println("Translating the following file into ontology:");
        			System.out.println("Capec: " + capecXML);
        			System.out.println("CVE: " + cveXML);
        			System.out.println("CWE: " + cweXML);
        			System.out.println("Output: " + output);
        			//TODO: call default convert function for capecXML file (no XSD)
        		} else if (arg.equalsIgnoreCase("reason")) {
        			String ontologyPath = args[i++];
        			String query = args[i++];
        			System.out.println("Reasoning..." + ontologyPath + " " + query);
        			//TODO: call Jena reasoning function for query over ontologyPath (IRI)
        		}else if (arg.equalsIgnoreCase("owl")) {
        			String input = args[i++];
        			String output = args[i++];
        			System.out.println("Converting mid-level ontology to owl: ");
        			System.out.println(input + " " + output);
        			//TODO: call owl-convert function for input
        		}else if (arg.equalsIgnoreCase("rdf")) {
        			String input = args[i++];
        			String output = args[i++];
        			System.out.println("Converting mid-level ontology to rdf: ");
        			System.out.println(input + " " + output);
        			//TODO: call rdf-convert function for input
        		}
    		}
    	}
    	
    	MainAppWindow window = new MainAppWindow();
    	window.open();

    }
}
