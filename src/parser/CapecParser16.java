// $ANTLR 3.4 C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g 2012-04-22 11:03:00

    package parser;
    
    import ontology.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/** CAPEC/XML Taxonomy (version 1.3.2) Parser by Morteza Ansarinia February 28, 2012 */
@SuppressWarnings({"all", "warnings", "unchecked"})
public class CapecParser16 extends Lexer {
    public static final int EOF=-1;
    public static final int ATTRIBUTE=4;
    public static final int CAPEC_ID=5;
    public static final int COMMENT=6;
    public static final int DOCTYPE=7;
    public static final int DOCUMENT=8;
    public static final int GENERIC_ID=9;
    public static final int INTERNAL_DTD=10;
    public static final int NODE_ATTRIBUTE=11;
    public static final int NODE_DATA=12;
    public static final int NODE_ID=13;
    public static final int NODE_NAME=14;
    public static final int NODE_PATTERN_ABSTRACTION=15;
    public static final int NODE_TYPE=16;
    public static final int NUMBER=17;
    public static final int RELATED_NODE_TAG=18;
    public static final int RELATIONSHIP_TYPE_TAG=19;
    public static final int TAXONOMY=20;
    public static final int TAXONOMY_NODE=21;
    public static final int TAXONOMY_START_TAG=22;
    public static final int VALUE=23;
    public static final int WS=24;
    public static final int XMLDECL=25;

    private Graph graph = new Graph();

    public static void main(String[] args) {
    	try {
    		//CharStream input = new ANTLRFileStream("res/attack_taxonomy_v1.3.2.xml");
    		//CapecParser132 parser = new CapecParser132(input);
    		//while (parser.nextToken() != Token.EOF_TOKEN)
    			;
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CapecParser16() {} 
    public CapecParser16(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CapecParser16(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g"; }

    // $ANTLR start "DOCUMENT"
    public final void mDOCUMENT() throws RecognitionException {
        try {
            int _type = DOCUMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:31:3: ( ( XMLDECL )? ( DOCTYPE )? TAXONOMY )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:32:3: ( XMLDECL )? ( DOCTYPE )? TAXONOMY
            {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:32:3: ( XMLDECL )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='<') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='?') ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:32:3: XMLDECL
                    {
                    mXMLDECL(); 


                    }
                    break;

            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:32:12: ( DOCTYPE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='<') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='!') ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:32:12: DOCTYPE
                    {
                    mDOCTYPE(); 


                    }
                    break;

            }


            mTAXONOMY(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOCUMENT"

    // $ANTLR start "DOCTYPE"
    public final void mDOCTYPE() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:37:3: ( '<!DOCTYPE' WS GENERIC_ID WS ( ( 'SYSTEM' WS VALUE | 'PUBLIC' WS VALUE WS VALUE ) ( WS )? )? ( INTERNAL_DTD )? '>' )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:38:3: '<!DOCTYPE' WS GENERIC_ID WS ( ( 'SYSTEM' WS VALUE | 'PUBLIC' WS VALUE WS VALUE ) ( WS )? )? ( INTERNAL_DTD )? '>'
            {
            match("<!DOCTYPE"); 



            mWS(); 


            mGENERIC_ID(); 


            mWS(); 


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:39:3: ( ( 'SYSTEM' WS VALUE | 'PUBLIC' WS VALUE WS VALUE ) ( WS )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='P'||LA5_0=='S') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:40:5: ( 'SYSTEM' WS VALUE | 'PUBLIC' WS VALUE WS VALUE ) ( WS )?
                    {
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:40:5: ( 'SYSTEM' WS VALUE | 'PUBLIC' WS VALUE WS VALUE )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='S') ) {
                        alt3=1;
                    }
                    else if ( (LA3_0=='P') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;

                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:41:7: 'SYSTEM' WS VALUE
                            {
                            match("SYSTEM"); 



                            mWS(); 


                            mVALUE(); 


                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:42:9: 'PUBLIC' WS VALUE WS VALUE
                            {
                            match("PUBLIC"); 



                            mWS(); 


                            mVALUE(); 


                            mWS(); 


                            mVALUE(); 


                            }
                            break;

                    }


                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:44:5: ( WS )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:44:6: WS
                            {
                            mWS(); 


                            }
                            break;

                    }


                    }
                    break;

            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:46:3: ( INTERNAL_DTD )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='[') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:46:4: INTERNAL_DTD
                    {
                    mINTERNAL_DTD(); 


                    }
                    break;

            }


            match('>'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOCTYPE"

    // $ANTLR start "INTERNAL_DTD"
    public final void mINTERNAL_DTD() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:51:3: ( '[' ( options {greedy=false; } : . )* ']' )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:52:3: '[' ( options {greedy=false; } : . )* ']'
            {
            match('['); 

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:52:7: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==']') ) {
                    alt7=2;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\\')||(LA7_0 >= '^' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:52:33: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(']'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERNAL_DTD"

    // $ANTLR start "XMLDECL"
    public final void mXMLDECL() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:57:3: ( '<?' ( 'x' | 'X' ) ( 'm' | 'M' ) ( 'l' | 'L' ) ( WS )? ( ATTRIBUTE ( WS )? )* '?>' )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:58:3: '<?' ( 'x' | 'X' ) ( 'm' | 'M' ) ( 'l' | 'L' ) ( WS )? ( ATTRIBUTE ( WS )? )* '?>'
            {
            match("<?"); 



            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:62:3: ( WS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||(LA8_0 >= '\f' && LA8_0 <= '\r')||LA8_0==' ') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:62:3: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:62:7: ( ATTRIBUTE ( WS )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==':'||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:62:8: ATTRIBUTE ( WS )?
            	    {
            	    mATTRIBUTE(); 


            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:62:18: ( WS )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||(LA9_0 >= '\f' && LA9_0 <= '\r')||LA9_0==' ') ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:62:18: WS
            	            {
            	            mWS(); 


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match("?>"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XMLDECL"

    // $ANTLR start "TAXONOMY"
    public final void mTAXONOMY() throws RecognitionException {
        try {
            CommonToken tt=null;

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:67:3: ( TAXONOMY_START_TAG (tt= TAXONOMY_NODE )* '</Attack_Taxonomy>' )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:68:3: TAXONOMY_START_TAG (tt= TAXONOMY_NODE )* '</Attack_Taxonomy>'
            {
            mTAXONOMY_START_TAG(); 


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:68:22: (tt= TAXONOMY_NODE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='<') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='T') ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||(LA11_0 >= '\f' && LA11_0 <= '\r')||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:68:23: tt= TAXONOMY_NODE
            	    {
            	    int ttStart266 = getCharIndex();
            	    int ttStartLine266 = getLine();
            	    int ttStartCharPos266 = getCharPositionInLine();
            	    mTAXONOMY_NODE(); 
            	    tt = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ttStart266, getCharIndex()-1);
            	    tt.setLine(ttStartLine266);
            	    tt.setCharPositionInLine(ttStartCharPos266);



            	                                            System.out.println(tt);
            	                                           

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match("</Attack_Taxonomy>"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TAXONOMY"

    // $ANTLR start "TAXONOMY_START_TAG"
    public final void mTAXONOMY_START_TAG() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:76:3: ( '<Attack_Taxonomy' (~ '>' )* '>' )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:77:3: '<Attack_Taxonomy' (~ '>' )* '>'
            {
            match("<Attack_Taxonomy"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:77:22: (~ '>' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\u0000' && LA12_0 <= '=')||(LA12_0 >= '?' && LA12_0 <= '\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '=')||(input.LA(1) >= '?' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match('>'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TAXONOMY_START_TAG"

    // $ANTLR start "TAXONOMY_NODE"
    public final void mTAXONOMY_NODE() throws RecognitionException {
        GraphNode node = null;


        try {
            CommonToken data=null;

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:82:3: ( ( WS )? '<Taxonomy_Node' ( WS )? ( NODE_ATTRIBUTE ( WS )? )* '>' ( (data= NODE_DATA )* | COMMENT ) ( WS )? '</Taxonomy_Node>' ( WS )? )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:84:4: ( WS )? '<Taxonomy_Node' ( WS )? ( NODE_ATTRIBUTE ( WS )? )* '>' ( (data= NODE_DATA )* | COMMENT ) ( WS )? '</Taxonomy_Node>' ( WS )?
            {

                node = new GraphNode();
               

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:87:3: ( WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||(LA13_0 >= '\f' && LA13_0 <= '\r')||LA13_0==' ') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:87:3: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match("<Taxonomy_Node"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:87:24: ( WS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||(LA14_0 >= '\f' && LA14_0 <= '\r')||LA14_0==' ') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:87:24: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:87:28: ( NODE_ATTRIBUTE ( WS )? )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='C'||LA16_0=='N'||LA16_0=='P'||LA16_0=='T') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:87:29: NODE_ATTRIBUTE ( WS )?
            	    {
            	    mNODE_ATTRIBUTE(); 


            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:87:44: ( WS )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( ((LA15_0 >= '\t' && LA15_0 <= '\n')||(LA15_0 >= '\f' && LA15_0 <= '\r')||LA15_0==' ') ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:87:44: WS
            	            {
            	            mWS(); 


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match('>'); 

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:88:3: ( (data= NODE_DATA )* | COMMENT )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0 >= '\t' && LA18_0 <= '\n')||(LA18_0 >= '\f' && LA18_0 <= '\r')||LA18_0==' ') ) {
                alt18=1;
            }
            else if ( (LA18_0=='<') ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2=='/'||LA18_2=='N') ) {
                    alt18=1;
                }
                else if ( (LA18_2=='!') ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:89:5: (data= NODE_DATA )*
                    {
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:89:5: (data= NODE_DATA )*
                    loop17:
                    do {
                        int alt17=2;
                        alt17 = dfa17.predict(input);
                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:89:6: data= NODE_DATA
                    	    {
                    	    int dataStart396 = getCharIndex();
                    	    int dataStartLine396 = getLine();
                    	    int dataStartCharPos396 = getCharPositionInLine();
                    	    mNODE_DATA(); 
                    	    data = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dataStart396, getCharIndex()-1);
                    	    data.setLine(dataStartLine396);
                    	    data.setCharPositionInLine(dataStartCharPos396);



                    	                         node.data = "test";
                    	                        

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:93:7: COMMENT
                    {
                    mCOMMENT(); 


                    }
                    break;

            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:95:3: ( WS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0 >= '\t' && LA19_0 <= '\n')||(LA19_0 >= '\f' && LA19_0 <= '\r')||LA19_0==' ') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:95:3: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match("</Taxonomy_Node>"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:95:26: ( WS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0 >= '\t' && LA20_0 <= '\n')||(LA20_0 >= '\f' && LA20_0 <= '\r')||LA20_0==' ') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:95:26: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TAXONOMY_NODE"

    // $ANTLR start "ATTRIBUTE"
    public final void mATTRIBUTE() throws RecognitionException {
        try {
            CommonToken name=null;
            CommonToken value=null;

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:100:3: (name= GENERIC_ID ( WS )? '=' ( WS )? value= VALUE )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:101:3: name= GENERIC_ID ( WS )? '=' ( WS )? value= VALUE
            {
            int nameStart462 = getCharIndex();
            int nameStartLine462 = getLine();
            int nameStartCharPos462 = getCharPositionInLine();
            mGENERIC_ID(); 
            name = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nameStart462, getCharIndex()-1);
            name.setLine(nameStartLine462);
            name.setCharPositionInLine(nameStartCharPos462);


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:101:19: ( WS )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0 >= '\t' && LA21_0 <= '\n')||(LA21_0 >= '\f' && LA21_0 <= '\r')||LA21_0==' ') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:101:19: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match('='); 

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:101:27: ( WS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0 >= '\t' && LA22_0 <= '\n')||(LA22_0 >= '\f' && LA22_0 <= '\r')||LA22_0==' ') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:101:27: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            int valueStart474 = getCharIndex();
            int valueStartLine474 = getLine();
            int valueStartCharPos474 = getCharPositionInLine();
            mVALUE(); 
            value = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, valueStart474, getCharIndex()-1);
            value.setLine(valueStartLine474);
            value.setCharPositionInLine(valueStartCharPos474);



                                                       
                                                      

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATTRIBUTE"

    // $ANTLR start "NODE_ATTRIBUTE"
    public final void mNODE_ATTRIBUTE() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:109:3: ( CAPEC_ID | NODE_ID | NODE_PATTERN_ABSTRACTION | NODE_TYPE | NODE_NAME )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 'C':
                {
                alt23=1;
                }
                break;
            case 'N':
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2=='o') ) {
                    alt23=2;
                }
                else if ( (LA23_2=='a') ) {
                    alt23=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'P':
                {
                alt23=3;
                }
                break;
            case 'T':
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:110:3: CAPEC_ID
                    {
                    mCAPEC_ID(); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:111:5: NODE_ID
                    {
                    mNODE_ID(); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:112:5: NODE_PATTERN_ABSTRACTION
                    {
                    mNODE_PATTERN_ABSTRACTION(); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:113:5: NODE_TYPE
                    {
                    mNODE_TYPE(); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:114:5: NODE_NAME
                    {
                    mNODE_NAME(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODE_ATTRIBUTE"

    // $ANTLR start "CAPEC_ID"
    public final void mCAPEC_ID() throws RecognitionException {
        try {
            CommonToken value=null;

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:119:3: ( 'CAPEC_ID' ( WS )? '=' ( WS )? value= VALUE )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:120:3: 'CAPEC_ID' ( WS )? '=' ( WS )? value= VALUE
            {
            match("CAPEC_ID"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:120:14: ( WS )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0 >= '\t' && LA24_0 <= '\n')||(LA24_0 >= '\f' && LA24_0 <= '\r')||LA24_0==' ') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:120:14: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match('='); 

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:120:22: ( WS )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0 >= '\t' && LA25_0 <= '\n')||(LA25_0 >= '\f' && LA25_0 <= '\r')||LA25_0==' ') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:120:22: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            int valueStart589 = getCharIndex();
            int valueStartLine589 = getLine();
            int valueStartCharPos589 = getCharPositionInLine();
            mVALUE(); 
            value = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, valueStart589, getCharIndex()-1);
            value.setLine(valueStartLine589);
            value.setCharPositionInLine(valueStartCharPos589);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CAPEC_ID"

    // $ANTLR start "NODE_ID"
    public final void mNODE_ID() throws RecognitionException {
        try {
            CommonToken value=null;

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:125:3: ( 'Node_ID' ( WS )? '=' ( WS )? value= VALUE )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:126:3: 'Node_ID' ( WS )? '=' ( WS )? value= VALUE
            {
            match("Node_ID"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:126:13: ( WS )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0 >= '\t' && LA26_0 <= '\n')||(LA26_0 >= '\f' && LA26_0 <= '\r')||LA26_0==' ') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:126:13: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match('='); 

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:126:21: ( WS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0 >= '\t' && LA27_0 <= '\n')||(LA27_0 >= '\f' && LA27_0 <= '\r')||LA27_0==' ') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:126:21: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            int valueStart618 = getCharIndex();
            int valueStartLine618 = getLine();
            int valueStartCharPos618 = getCharPositionInLine();
            mVALUE(); 
            value = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, valueStart618, getCharIndex()-1);
            value.setLine(valueStartLine618);
            value.setCharPositionInLine(valueStartCharPos618);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODE_ID"

    // $ANTLR start "NODE_PATTERN_ABSTRACTION"
    public final void mNODE_PATTERN_ABSTRACTION() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:131:3: ( 'Pattern_Abstraction' ( WS )? '=' ( WS )? ( '\"Meta\"' | '\"Standard\"' | '\"Detailed\"' ) )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:132:3: 'Pattern_Abstraction' ( WS )? '=' ( WS )? ( '\"Meta\"' | '\"Standard\"' | '\"Detailed\"' )
            {
            match("Pattern_Abstraction"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:132:25: ( WS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0 >= '\t' && LA28_0 <= '\n')||(LA28_0 >= '\f' && LA28_0 <= '\r')||LA28_0==' ') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:132:25: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match('='); 

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:132:33: ( WS )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0 >= '\t' && LA29_0 <= '\n')||(LA29_0 >= '\f' && LA29_0 <= '\r')||LA29_0==' ') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:132:33: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:133:3: ( '\"Meta\"' | '\"Standard\"' | '\"Detailed\"' )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\"') ) {
                switch ( input.LA(2) ) {
                case 'M':
                    {
                    alt30=1;
                    }
                    break;
                case 'S':
                    {
                    alt30=2;
                    }
                    break;
                case 'D':
                    {
                    alt30=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:134:5: '\"Meta\"'
                    {
                    match("\"Meta\""); 



                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:135:7: '\"Standard\"'
                    {
                    match("\"Standard\""); 



                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:136:7: '\"Detailed\"'
                    {
                    match("\"Detailed\""); 



                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODE_PATTERN_ABSTRACTION"

    // $ANTLR start "NODE_TYPE"
    public final void mNODE_TYPE() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:142:3: ( 'Type' ( WS )? '=' ( WS )? ( '\"Attack_Category\"' | '\"Attack_Pattern\"' | '\"Metadata_Field\"' | '\"Node_Alias\"' ) )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:143:3: 'Type' ( WS )? '=' ( WS )? ( '\"Attack_Category\"' | '\"Attack_Pattern\"' | '\"Metadata_Field\"' | '\"Node_Alias\"' )
            {
            match("Type"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:143:10: ( WS )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0 >= '\t' && LA31_0 <= '\n')||(LA31_0 >= '\f' && LA31_0 <= '\r')||LA31_0==' ') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:143:10: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match('='); 

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:143:18: ( WS )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= '\t' && LA32_0 <= '\n')||(LA32_0 >= '\f' && LA32_0 <= '\r')||LA32_0==' ') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:143:18: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:144:3: ( '\"Attack_Category\"' | '\"Attack_Pattern\"' | '\"Metadata_Field\"' | '\"Node_Alias\"' )
            int alt33=4;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\"') ) {
                switch ( input.LA(2) ) {
                case 'A':
                    {
                    int LA33_2 = input.LA(3);

                    if ( (LA33_2=='t') ) {
                        int LA33_5 = input.LA(4);

                        if ( (LA33_5=='t') ) {
                            int LA33_6 = input.LA(5);

                            if ( (LA33_6=='a') ) {
                                int LA33_7 = input.LA(6);

                                if ( (LA33_7=='c') ) {
                                    int LA33_8 = input.LA(7);

                                    if ( (LA33_8=='k') ) {
                                        int LA33_9 = input.LA(8);

                                        if ( (LA33_9=='_') ) {
                                            int LA33_10 = input.LA(9);

                                            if ( (LA33_10=='C') ) {
                                                alt33=1;
                                            }
                                            else if ( (LA33_10=='P') ) {
                                                alt33=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 33, 10, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 33, 9, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 33, 8, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 33, 7, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 33, 6, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 2, input);

                        throw nvae;

                    }
                    }
                    break;
                case 'M':
                    {
                    alt33=3;
                    }
                    break;
                case 'N':
                    {
                    alt33=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:145:5: '\"Attack_Category\"'
                    {
                    match("\"Attack_Category\""); 



                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:146:7: '\"Attack_Pattern\"'
                    {
                    match("\"Attack_Pattern\""); 



                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:147:7: '\"Metadata_Field\"'
                    {
                    match("\"Metadata_Field\""); 



                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:148:7: '\"Node_Alias\"'
                    {
                    match("\"Node_Alias\""); 



                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODE_TYPE"

    // $ANTLR start "NODE_NAME"
    public final void mNODE_NAME() throws RecognitionException {
        try {
            CommonToken value=null;

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:154:3: ( 'Name' ( WS )? '=' ( WS )? value= VALUE )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:155:3: 'Name' ( WS )? '=' ( WS )? value= VALUE
            {
            match("Name"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:155:10: ( WS )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0 >= '\t' && LA34_0 <= '\n')||(LA34_0 >= '\f' && LA34_0 <= '\r')||LA34_0==' ') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:155:10: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match('='); 

            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:155:18: ( WS )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0 >= '\t' && LA35_0 <= '\n')||(LA35_0 >= '\f' && LA35_0 <= '\r')||LA35_0==' ') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:155:18: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            int valueStart765 = getCharIndex();
            int valueStartLine765 = getLine();
            int valueStartCharPos765 = getCharPositionInLine();
            mVALUE(); 
            value = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, valueStart765, getCharIndex()-1);
            value.setLine(valueStartLine765);
            value.setCharPositionInLine(valueStartCharPos765);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODE_NAME"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:160:3: ( '<!--' ( options {greedy=false; } : . )* '-->' )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:161:3: '<!--' ( options {greedy=false; } : . )* '-->'
            {
            match("<!--"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:161:10: ( options {greedy=false; } : . )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='-') ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1=='-') ) {
                        int LA36_3 = input.LA(3);

                        if ( (LA36_3=='>') ) {
                            alt36=2;
                        }
                        else if ( ((LA36_3 >= '\u0000' && LA36_3 <= '=')||(LA36_3 >= '?' && LA36_3 <= '\uFFFF')) ) {
                            alt36=1;
                        }


                    }
                    else if ( ((LA36_1 >= '\u0000' && LA36_1 <= ',')||(LA36_1 >= '.' && LA36_1 <= '\uFFFF')) ) {
                        alt36=1;
                    }


                }
                else if ( ((LA36_0 >= '\u0000' && LA36_0 <= ',')||(LA36_0 >= '.' && LA36_0 <= '\uFFFF')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:161:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            match("-->"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NODE_DATA"
    public final void mNODE_DATA() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:166:3: ( ( WS )? '<Node_Relationship>' ( ( WS )? RELATIONSHIP_TYPE_TAG ( WS )? RELATED_NODE_TAG ( WS )? ) '</Node_Relationship>' ( WS )? )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:3: ( WS )? '<Node_Relationship>' ( ( WS )? RELATIONSHIP_TYPE_TAG ( WS )? RELATED_NODE_TAG ( WS )? ) '</Node_Relationship>' ( WS )?
            {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:3: ( WS )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0 >= '\t' && LA37_0 <= '\n')||(LA37_0 >= '\f' && LA37_0 <= '\r')||LA37_0==' ') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:3: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match("<Node_Relationship>"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:29: ( ( WS )? RELATIONSHIP_TYPE_TAG ( WS )? RELATED_NODE_TAG ( WS )? )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:30: ( WS )? RELATIONSHIP_TYPE_TAG ( WS )? RELATED_NODE_TAG ( WS )?
            {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:30: ( WS )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0 >= '\t' && LA38_0 <= '\n')||(LA38_0 >= '\f' && LA38_0 <= '\r')||LA38_0==' ') ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:30: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            mRELATIONSHIP_TYPE_TAG(); 


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:56: ( WS )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0 >= '\t' && LA39_0 <= '\n')||(LA39_0 >= '\f' && LA39_0 <= '\r')||LA39_0==' ') ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:56: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            mRELATED_NODE_TAG(); 


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:77: ( WS )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0 >= '\t' && LA40_0 <= '\n')||(LA40_0 >= '\f' && LA40_0 <= '\r')||LA40_0==' ') ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:77: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            }


            match("</Node_Relationship>"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:105: ( WS )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0 >= '\t' && LA41_0 <= '\n')||(LA41_0 >= '\f' && LA41_0 <= '\r')||LA41_0==' ') ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:167:105: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODE_DATA"

    // $ANTLR start "RELATIONSHIP_TYPE_TAG"
    public final void mRELATIONSHIP_TYPE_TAG() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:172:3: ( '<Relationship_Type>' ( WS )? ( 'Peer' | 'ResultantFrom' | 'ResultsIn' | 'CanAlsoBe' | 'ChildOf' | 'ParentOf' ) ( WS )? '</Relationship_Type>' )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:172:5: '<Relationship_Type>' ( WS )? ( 'Peer' | 'ResultantFrom' | 'ResultsIn' | 'CanAlsoBe' | 'ChildOf' | 'ParentOf' ) ( WS )? '</Relationship_Type>'
            {
            match("<Relationship_Type>"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:172:27: ( WS )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0 >= '\t' && LA42_0 <= '\n')||(LA42_0 >= '\f' && LA42_0 <= '\r')||LA42_0==' ') ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:172:27: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:173:3: ( 'Peer' | 'ResultantFrom' | 'ResultsIn' | 'CanAlsoBe' | 'ChildOf' | 'ParentOf' )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 'P':
                {
                int LA43_1 = input.LA(2);

                if ( (LA43_1=='e') ) {
                    alt43=1;
                }
                else if ( (LA43_1=='a') ) {
                    alt43=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'R':
                {
                int LA43_2 = input.LA(2);

                if ( (LA43_2=='e') ) {
                    int LA43_6 = input.LA(3);

                    if ( (LA43_6=='s') ) {
                        int LA43_9 = input.LA(4);

                        if ( (LA43_9=='u') ) {
                            int LA43_10 = input.LA(5);

                            if ( (LA43_10=='l') ) {
                                int LA43_11 = input.LA(6);

                                if ( (LA43_11=='t') ) {
                                    int LA43_12 = input.LA(7);

                                    if ( (LA43_12=='a') ) {
                                        alt43=2;
                                    }
                                    else if ( (LA43_12=='s') ) {
                                        alt43=3;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 43, 12, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 43, 11, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 43, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 43, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'C':
                {
                int LA43_3 = input.LA(2);

                if ( (LA43_3=='a') ) {
                    alt43=4;
                }
                else if ( (LA43_3=='h') ) {
                    alt43=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:173:5: 'Peer'
                    {
                    match("Peer"); 



                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:174:5: 'ResultantFrom'
                    {
                    match("ResultantFrom"); 



                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:175:5: 'ResultsIn'
                    {
                    match("ResultsIn"); 



                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:176:5: 'CanAlsoBe'
                    {
                    match("CanAlsoBe"); 



                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:177:5: 'ChildOf'
                    {
                    match("ChildOf"); 



                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:178:5: 'ParentOf'
                    {
                    match("ParentOf"); 



                    }
                    break;

            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:179:5: ( WS )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0 >= '\t' && LA44_0 <= '\n')||(LA44_0 >= '\f' && LA44_0 <= '\r')||LA44_0==' ') ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:179:5: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match("</Relationship_Type>"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RELATIONSHIP_TYPE_TAG"

    // $ANTLR start "RELATED_NODE_TAG"
    public final void mRELATED_NODE_TAG() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:184:3: ( '<Related_Node>' ( WS )? NUMBER ( WS )? '</Related_Node>' )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:185:3: '<Related_Node>' ( WS )? NUMBER ( WS )? '</Related_Node>'
            {
            match("<Related_Node>"); 



            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:185:20: ( WS )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0 >= '\t' && LA45_0 <= '\n')||(LA45_0 >= '\f' && LA45_0 <= '\r')||LA45_0==' ') ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:185:20: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            mNUMBER(); 


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:185:31: ( WS )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0 >= '\t' && LA46_0 <= '\n')||(LA46_0 >= '\f' && LA46_0 <= '\r')||LA46_0==' ') ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:185:31: WS
                    {
                    mWS(); 


                    }
                    break;

            }


            match("</Related_Node>"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RELATED_NODE_TAG"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:190:3: ( ( '-' | '+' )? ( '0' .. '9' )+ )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:191:3: ( '-' | '+' )? ( '0' .. '9' )+
            {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:191:3: ( '-' | '+' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0=='+'||LA47_0=='-') ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:192:3: ( '0' .. '9' )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0 >= '0' && LA48_0 <= '9')) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:197:3: ( ( '\\\"' (~ '\\\"' )* '\\\"' | '\\'' (~ '\\'' )* '\\'' ) )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:198:3: ( '\\\"' (~ '\\\"' )* '\\\"' | '\\'' (~ '\\'' )* '\\'' )
            {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:198:3: ( '\\\"' (~ '\\\"' )* '\\\"' | '\\'' (~ '\\'' )* '\\'' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0=='\"') ) {
                alt51=1;
            }
            else if ( (LA51_0=='\'') ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:199:5: '\\\"' (~ '\\\"' )* '\\\"'
                    {
                    match('\"'); 

                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:199:10: (~ '\\\"' )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0 >= '\u0000' && LA49_0 <= '!')||(LA49_0 >= '#' && LA49_0 <= '\uFFFF')) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:200:7: '\\'' (~ '\\'' )* '\\''
                    {
                    match('\''); 

                    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:200:12: (~ '\\'' )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0 >= '\u0000' && LA50_0 <= '&')||(LA50_0 >= '(' && LA50_0 <= '\uFFFF')) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    match('\''); 

                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUE"

    // $ANTLR start "GENERIC_ID"
    public final void mGENERIC_ID() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:206:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ':' ) ( options {greedy=true; } : 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '-' | '_' | ':' )* )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:207:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ':' ) ( options {greedy=true; } : 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '-' | '_' | ':' )*
            {
            if ( input.LA(1)==':'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:213:3: ( options {greedy=true; } : 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '-' | '_' | ':' )*
            loop52:
            do {
                int alt52=8;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt52=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt52=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt52=3;
                    }
                    break;
                case '.':
                    {
                    alt52=4;
                    }
                    break;
                case '-':
                    {
                    alt52=5;
                    }
                    break;
                case '_':
                    {
                    alt52=6;
                    }
                    break;
                case ':':
                    {
                    alt52=7;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:213:29: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:214:7: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:215:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 4 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:216:7: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 5 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:217:7: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 6 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:218:7: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 7 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:219:7: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GENERIC_ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:224:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:225:3: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:225:3: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0 >= '\t' && LA53_0 <= '\n')||(LA53_0 >= '\f' && LA53_0 <= '\r')||LA53_0==' ') ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);



                _channel = HIDDEN;
               

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:1:8: ( DOCUMENT | WS )
        int alt54=2;
        int LA54_0 = input.LA(1);

        if ( (LA54_0=='<') ) {
            alt54=1;
        }
        else if ( ((LA54_0 >= '\t' && LA54_0 <= '\n')||(LA54_0 >= '\f' && LA54_0 <= '\r')||LA54_0==' ') ) {
            alt54=2;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 54, 0, input);

            throw nvae;

        }
        switch (alt54) {
            case 1 :
                // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:1:10: DOCUMENT
                {
                mDOCUMENT(); 


                }
                break;
            case 2 :
                // C:\\Documents and Settings\\user\\Desktop\\eclipse\\workspace\\KnowledgeConvert\\src\\parser\\CapecParser16.g:1:19: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\2\11\1\57\2\uffff";
    static final String DFA17_maxS =
        "\2\74\1\116\2\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\1\1\uffff\2\1\22\uffff\1\1\33\uffff\1\2",
            "\2\1\1\uffff\2\1\22\uffff\1\1\33\uffff\1\2",
            "\1\3\36\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 89:5: (data= NODE_DATA )*";
        }
    }
 

}