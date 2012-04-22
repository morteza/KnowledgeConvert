package ontology;

public class OntologyManager {
	
	protected static OntologyManager _instance = null;
	
	public OntologyManager() {
		
	}
	
	public void loadOntology(String filePath) {
		
	}
	
	public static OntologyManager getInstance() {
		if (_instance == null )
			_instance = new OntologyManager();
		return _instance;
	}
	
}
