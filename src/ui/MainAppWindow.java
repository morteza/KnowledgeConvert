package ui;

import ontology.OntologyManager;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.wb.swt.SWTResourceManager;

import parser.CapecParser132;
import parser.CapecParser16;
import parser.CapecParser17;

public class MainAppWindow {

	protected Shell shlNetworkAttackOntology;
	private Text txtContentXSD;
	private Text txtContentXML;
	private Text txtOutputOWL;
	private Text txtOntologyFile;
	private Text txtTestSparqlQuery;
	private Text txtCVEXML;
	private Text txtCWEXML;
	private Table table;
	private Table table_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainAppWindow window = new MainAppWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlNetworkAttackOntology.open();
		shlNetworkAttackOntology.layout();
		while (!shlNetworkAttackOntology.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlNetworkAttackOntology = new Shell();
		shlNetworkAttackOntology.setSize(500, 406);
		shlNetworkAttackOntology.setText("ITRC Network Attack Ontology Tool");

		
		FormLayout formLayout = new FormLayout ();
		formLayout.marginWidth = 5;
		formLayout.marginHeight = 5;
		shlNetworkAttackOntology.setLayout(new GridLayout(1, false));
		
		
		TabFolder tabFolder = new TabFolder(shlNetworkAttackOntology, SWT.NONE);
		tabFolder.setSelection(0);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		ProgressBar progressBar = new ProgressBar(shlNetworkAttackOntology, SWT.NONE);
		progressBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Capec Convertor");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite);
		composite.setLayout(new GridLayout(3, false));
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Capec Version:");
		
		final Combo cmboCapecVersion = new Combo(composite, SWT.READ_ONLY);
		cmboCapecVersion.setVisibleItemCount(3);
		cmboCapecVersion.setItems(new String[] {"1.3.2", "1.6", "1.7"});
		cmboCapecVersion.select(2);
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("Content XSD:");
		
		txtContentXSD = new Text(composite, SWT.BORDER);
		txtContentXSD.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnBrowse1 = new Button(composite, SWT.NONE);
		btnBrowse1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				try{
					FileDialog dialog = new FileDialog (shlNetworkAttackOntology, SWT.OPEN);
					dialog.setText("Select content XSD File");
					String [] filterNames = new String [] {"XSD Files", "All Files (*)"};
					String [] filterExtensions = new String [] {"*.xsd", "*"};
					String filterPath = "/";
					String platform = SWT.getPlatform();
					
					// Change default values for Windows platform
					if (platform.equals("win32") || platform.equals("wpf")) {
						filterNames = new String [] {"XSD Files", "All Files (*.*)"};
						filterExtensions = new String [] {"*.xsd", "*.*"};
						filterPath = "c:\\";
					}
					
					dialog.setFilterNames (filterNames);
					dialog.setFilterExtensions (filterExtensions);
					dialog.setFilterPath (filterPath);
					txtContentXSD.setText(dialog.open());					
				} catch (Exception e) {
					
				}
			}
		});
		btnBrowse1.setText("...");
		
		Label lblInputXmlFile = new Label(composite, SWT.NONE);
		lblInputXmlFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblInputXmlFile.setText("Content XML:");
		
		txtContentXML = new Text(composite, SWT.BORDER);
		txtContentXML.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnBrowse2 = new Button(composite, SWT.NONE);
		btnBrowse2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				try{
					FileDialog dialog = new FileDialog (shlNetworkAttackOntology, SWT.OPEN);
					dialog.setText("Select content XML File");
					String [] filterNames = new String [] {"XML Files", "All Files (*)"};
					String [] filterExtensions = new String [] {"*.xml", "*"};
					String filterPath = "/";
					String platform = SWT.getPlatform();
					
					// Change default values for Windows platform
					if (platform.equals("win32") || platform.equals("wpf")) {
						filterNames = new String [] {"XML Files", "All Files (*.*)"};
						filterExtensions = new String [] {"*.xml", "*.*"};
						filterPath = "c:\\";
					}
					
					dialog.setFilterNames (filterNames);
					dialog.setFilterExtensions (filterExtensions);
					dialog.setFilterPath (filterPath);
					txtContentXML.setText(dialog.open());					
				} catch (Exception e) {
					
				}
			}
		});
		btnBrowse2.setText("...");
		
		Label lblCveXmlFile = new Label(composite, SWT.NONE);
		lblCveXmlFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCveXmlFile.setText("CVE XML File:");
		
		txtCVEXML = new Text(composite, SWT.BORDER);
		txtCVEXML.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnBrowse3 = new Button(composite, SWT.NONE);
		btnBrowse3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				try{
					FileDialog dialog = new FileDialog (shlNetworkAttackOntology, SWT.OPEN);
					dialog.setText("Select CVE XML File");
					String [] filterNames = new String [] {"XML Files", "All Files (*)"};
					String [] filterExtensions = new String [] {"*.xml", "*"};
					String filterPath = "/";
					String platform = SWT.getPlatform();
					
					// Change default values for Windows platform
					if (platform.equals("win32") || platform.equals("wpf")) {
						filterNames = new String [] {"XML Files", "All Files (*.*)"};
						filterExtensions = new String [] {"*.xml", "*.*"};
						filterPath = "c:\\";
					}
					
					dialog.setFilterNames (filterNames);
					dialog.setFilterExtensions (filterExtensions);
					dialog.setFilterPath (filterPath);
					txtCVEXML.setText(dialog.open());					
				} catch (Exception e) {
					
				}
			}
		});
		btnBrowse3.setText("...");
		
		Label lblCweXmlFile = new Label(composite, SWT.NONE);
		lblCweXmlFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCweXmlFile.setText("CWE XML File:");
		
		txtCWEXML = new Text(composite, SWT.BORDER);
		txtCWEXML.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnBrowse4 = new Button(composite, SWT.NONE);
		btnBrowse4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				try{
					FileDialog dialog = new FileDialog (shlNetworkAttackOntology, SWT.OPEN);
					dialog.setText("Select CXE XML File");
					String [] filterNames = new String [] {"XML Files", "All Files (*)"};
					String [] filterExtensions = new String [] {"*.xml", "*"};
					String filterPath = "/";
					String platform = SWT.getPlatform();
					
					// Change default values for Windows platform
					if (platform.equals("win32") || platform.equals("wpf")) {
						filterNames = new String [] {"XML Files", "All Files (*.*)"};
						filterExtensions = new String [] {"*.xml", "*.*"};
						filterPath = "c:\\";
					}
					
					dialog.setFilterNames (filterNames);
					dialog.setFilterExtensions (filterExtensions);
					dialog.setFilterPath (filterPath);
					txtCWEXML.setText(dialog.open());					
				} catch (Exception e) {
					
				}
			}
		});
		btnBrowse4.setText("...");
		
		Label label_1 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Label lblInputOwlFile = new Label(composite, SWT.NONE);
		lblInputOwlFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblInputOwlFile.setText("Output File:");
		
		txtOutputOWL = new Text(composite, SWT.BORDER);
		txtOutputOWL.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnBrowse5 = new Button(composite, SWT.NONE);
		btnBrowse5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				try{
					FileDialog dialog = new FileDialog (shlNetworkAttackOntology, SWT.SAVE);
					dialog.setText("Save Generated Ontology As ...");
					String [] filterNames = new String [] {"Ontology Files", "All Files (*)"};
					String [] filterExtensions = new String [] {"*.owl;*.rdf;*.xml", "*"};
					String filterPath = "/";
					String platform = SWT.getPlatform();
					
					// Change default values for Windows platform
					if (platform.equals("win32") || platform.equals("wpf")) {
						filterNames = new String [] {"Ontology Files", "All Files (*.*)"};
						filterExtensions = new String [] {"*.owl;*.rdf;*.xml", "*.*"};
						filterPath = "c:\\";
					}
					
					dialog.setFilterNames (filterNames);
					dialog.setFilterExtensions (filterExtensions);
					dialog.setFilterPath (filterPath);
					dialog.setFileName ("network_ontology");
					txtOutputOWL.setText(dialog.open());					
				} catch (Exception e) {
					
				}
			}
		});
		btnBrowse5.setText("...");
		new Label(composite, SWT.NONE);
		
		Button btnTranslateCapec = new Button(composite, SWT.NONE);
		btnTranslateCapec.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String capecVersion = cmboCapecVersion.getItem(cmboCapecVersion.getSelectionIndex());
				try {
					if (capecVersion.equalsIgnoreCase("1.3.2")) {
					    CharStream input = new ANTLRFileStream(txtContentXML.getText());
					    CapecParser132 parser = new CapecParser132(input);
					    while (parser.nextToken() != Token.EOF_TOKEN);						
					} else if (capecVersion.equalsIgnoreCase("1.6")) {
						    CharStream input = new ANTLRFileStream(txtContentXML.getText());
						    CapecParser16 parser = new CapecParser16(input);
						    while (parser.nextToken() != Token.EOF_TOKEN);						
					} else if (capecVersion.equalsIgnoreCase("1.7")) {
					    CharStream input = new ANTLRFileStream(txtContentXML.getText());
					    CapecParser17 parser = new CapecParser17(input);
					    while (parser.nextToken() != Token.EOF_TOKEN);						
				}
				} catch(Exception e) {
				    e.printStackTrace();
				}
			}
		});
		btnTranslateCapec.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 2, 1));
		btnTranslateCapec.setText("Translate");
		
		// Create Ontology Tab
		TabItem tbtmOntology = new TabItem(tabFolder, SWT.NONE);
		tbtmOntology.setText("Ontology");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmOntology.setControl(composite_1);
		composite_1.setLayout(new GridLayout(3, false));
		
		Label lblOntologyFile = new Label(composite_1, SWT.NONE);
		lblOntologyFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOntologyFile.setText("Ontology File:");
		
		txtOntologyFile = new Text(composite_1, SWT.BORDER);
		txtOntologyFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnBrowse6 = new Button(composite_1, SWT.NONE);
		btnBrowse6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				try{
					FileDialog dialog = new FileDialog (shlNetworkAttackOntology, SWT.OPEN);
					dialog.setText("Save Generated Ontology As ...");
					String [] filterNames = new String [] {"Ontology Files (*.owl)", "All Files (*)"};
					String [] filterExtensions = new String [] {"*.owl", "*"};
					String filterPath = "/";
					String platform = SWT.getPlatform();
					
					// Change default values for Windows platform
					if (platform.equals("win32") || platform.equals("wpf")) {
						filterNames = new String [] {"Ontology Files (*.owl)", "All Files (*.*)"};
						filterExtensions = new String [] {"*.owl", "*.*"};
						filterPath = "c:\\";
					}
					
					dialog.setFilterNames (filterNames);
					dialog.setFilterExtensions (filterExtensions);
					dialog.setFilterPath (filterPath);
					txtOntologyFile.setText(dialog.open());					
				} catch (Exception e) {
					
				}
			}
		});
		btnBrowse6.setText("...");
		new Label(composite_1, SWT.NONE);
		
		Button btnLoadOntology = new Button(composite_1, SWT.NONE);
		btnLoadOntology.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				OntologyManager.getInstance().loadOntology(txtOntologyFile.getText());
			}
		});
		btnLoadOntology.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 2, 1));
		btnLoadOntology.setText("Load Ontology");
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		
		// Create Query Tab (SPARQL)
		TabItem tbtmQuery = new TabItem(tabFolder, SWT.NONE);
		tbtmQuery.setText("Query");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmQuery.setControl(composite_2);
		composite_2.setLayout(new GridLayout(1, false));
		
		Label lblPrefix = new Label(composite_2, SWT.NONE);
		lblPrefix.setText("Prefixes:");
		
		table_1 = new Table(composite_2, SWT.BORDER | SWT.FULL_SELECTION);
		GridData gd_table_1 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_table_1.heightHint = 100;
		table_1.setLayoutData(gd_table_1);
		table_1.setHeaderVisible(true);
		table_1.setLinesVisible(true);
		
		TableColumn tblclmnUri = new TableColumn(table_1, SWT.NONE);
		tblclmnUri.setResizable(false);
		tblclmnUri.setMoveable(true);
		tblclmnUri.setWidth(45);
		tblclmnUri.setText("Prefix");
		
		TableColumn tblclmnUri_1 = new TableColumn(table_1, SWT.NONE);
		tblclmnUri_1.setMoveable(true);
		tblclmnUri_1.setWidth(387);
		tblclmnUri_1.setText("Value");
		
		TableItem rdfPrefixItem = new TableItem(table_1, SWT.NONE);
		rdfPrefixItem.setText(new String[] {"rdf:", "<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"});
		
		TableItem owlPrefixItem = new TableItem(table_1, SWT.NONE);
		owlPrefixItem.setText(new String[] {"owl", "<http://www.w3.org/2002/07/owl#>"});
		
		TableItem xsdPrefixItem = new TableItem(table_1, SWT.NONE);
		xsdPrefixItem.setText(new String[] {"xsd", "<http://www.w3.org/2001/XMLSchema#>"});
		
		TableItem rdfsPrefixItem = new TableItem(table_1, SWT.NONE);
		rdfsPrefixItem.setText(new String[] {"rdfs", "<http://www.w3.org/2000/01/rdf-schema#>"});
		
		Label lblSparqlQuery = new Label(composite_2, SWT.NONE);
		lblSparqlQuery.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblSparqlQuery.setText("SPARQL Query:");
		lblSparqlQuery.setBounds(0, 0, 34, 13);
		
		txtTestSparqlQuery = new Text(composite_2, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
		txtTestSparqlQuery.setText("SELECT ?attack WHERE { ?attack sao:relatedTo swo:CWE-311 }");
		txtTestSparqlQuery.setFont(SWTResourceManager.getFont("Courier New", 9, SWT.NORMAL));
		txtTestSparqlQuery.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		txtTestSparqlQuery.setBounds(0, 0, 414, 92);
		
		Button btnExecute = new Button(composite_2, SWT.NONE);
		btnExecute.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
		btnExecute.setText("Execute");
		btnExecute.setBounds(0, 0, 51, 23);
		
		TabItem tbtmResult = new TabItem(tabFolder, SWT.NONE);
		tbtmResult.setText("Result");
		
		Composite composite_3 = new Composite(tabFolder, SWT.NONE);
		tbtmResult.setControl(composite_3);
		composite_3.setLayout(new GridLayout(1, false));
		
		Label lblResult = new Label(composite_3, SWT.NONE);
		lblResult.setText("Results:");
		
		table = new Table(composite_3, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnSubject = new TableColumn(table, SWT.NONE);
		tblclmnSubject.setWidth(100);
		tblclmnSubject.setText("Subject");
		
		TableColumn tblclmnPredicate = new TableColumn(table, SWT.NONE);
		tblclmnPredicate.setWidth(100);
		tblclmnPredicate.setText("Predicate");
		
		TableColumn tblclmnObject = new TableColumn(table, SWT.NONE);
		tblclmnObject.setWidth(100);
		tblclmnObject.setText("Object");

	}
}
