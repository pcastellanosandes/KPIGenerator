package co.edu.uniandes.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKPIGeneratorLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=9;
    public static final int RULE_DATE=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_DATEHOUR=5;
    public static final int RULE_WS=13;
    public static final int RULE_CADENA=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalKPIGeneratorLexer() {;} 
    public InternalKPIGeneratorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKPIGeneratorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKPIGenerator.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:11:7: ( '\"\"' )
            // InternalKPIGenerator.g:11:9: '\"\"'
            {
            match("\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:12:7: ( '\"' )
            // InternalKPIGenerator.g:12:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:13:7: ( '[' )
            // InternalKPIGenerator.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:14:7: ( ']' )
            // InternalKPIGenerator.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:15:7: ( '{\"name\":\"' )
            // InternalKPIGenerator.g:15:9: '{\"name\":\"'
            {
            match("{\"name\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:16:7: ( '\",\"phases\":[' )
            // InternalKPIGenerator.g:16:9: '\",\"phases\":['
            {
            match("\",\"phases\":["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:17:7: ( ']}' )
            // InternalKPIGenerator.g:17:9: ']}'
            {
            match("]}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:18:7: ( ',' )
            // InternalKPIGenerator.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:19:7: ( '\",\"tasks\":[' )
            // InternalKPIGenerator.g:19:9: '\",\"tasks\":['
            {
            match("\",\"tasks\":["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:20:7: ( '{\"id\":' )
            // InternalKPIGenerator.g:20:9: '{\"id\":'
            {
            match("{\"id\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:21:7: ( ',\"name\":\"' )
            // InternalKPIGenerator.g:21:9: ',\"name\":\"'
            {
            match(",\"name\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:22:7: ( '\",\"useCase\":\"' )
            // InternalKPIGenerator.g:22:9: '\",\"useCase\":\"'
            {
            match("\",\"useCase\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:23:7: ( ',\"sequenceNumber\":' )
            // InternalKPIGenerator.g:23:9: ',\"sequenceNumber\":'
            {
            match(",\"sequenceNumber\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:24:7: ( ',\"description\":\"' )
            // InternalKPIGenerator.g:24:9: ',\"description\":\"'
            {
            match(",\"description\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:25:7: ( ',\"startDate\":\"' )
            // InternalKPIGenerator.g:25:9: ',\"startDate\":\"'
            {
            match(",\"startDate\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:26:7: ( '\",\"dueDate\":\"' )
            // InternalKPIGenerator.g:26:9: '\",\"dueDate\":\"'
            {
            match("\",\"dueDate\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:27:7: ( '\",\"priority\":\"' )
            // InternalKPIGenerator.g:27:9: '\",\"priority\":\"'
            {
            match("\",\"priority\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:28:7: ( '\",\"isPrivate\":' )
            // InternalKPIGenerator.g:28:9: '\",\"isPrivate\":'
            {
            match("\",\"isPrivate\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:29:7: ( ',\"progress\":' )
            // InternalKPIGenerator.g:29:9: ',\"progress\":'
            {
            match(",\"progress\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:30:7: ( ',\"status\":' )
            // InternalKPIGenerator.g:30:9: ',\"status\":'
            {
            match(",\"status\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:31:7: ( ',\"assignedTo\":\"' )
            // InternalKPIGenerator.g:31:9: ',\"assignedTo\":\"'
            {
            match(",\"assignedTo\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:32:7: ( '\",\"createdDate\":\"' )
            // InternalKPIGenerator.g:32:9: '\",\"createdDate\":\"'
            {
            match("\",\"createdDate\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:33:7: ( '\",\"completedDate\":\"' )
            // InternalKPIGenerator.g:33:9: '\",\"completedDate\":\"'
            {
            match("\",\"completedDate\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:34:7: ( '\",\"timeLoggedMin\":' )
            // InternalKPIGenerator.g:34:9: '\",\"timeLoggedMin\":'
            {
            match("\",\"timeLoggedMin\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:35:7: ( ',\"billableTime\":' )
            // InternalKPIGenerator.g:35:9: ',\"billableTime\":'
            {
            match(",\"billableTime\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:36:7: ( ',\"completedOnTime\":' )
            // InternalKPIGenerator.g:36:9: ',\"completedOnTime\":'
            {
            match(",\"completedOnTime\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:37:7: ( ',\"timeEstimated\":' )
            // InternalKPIGenerator.g:37:9: ',\"timeEstimated\":'
            {
            match(",\"timeEstimated\":"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:38:7: ( ',\"tags\":\"' )
            // InternalKPIGenerator.g:38:9: ',\"tags\":\"'
            {
            match(",\"tags\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:39:7: ( '}' )
            // InternalKPIGenerator.g:39:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:40:7: ( '{\"type\":\"' )
            // InternalKPIGenerator.g:40:9: '{\"type\":\"'
            {
            match("{\"type\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:41:7: ( '\",\"text\":\"' )
            // InternalKPIGenerator.g:41:9: '\",\"text\":\"'
            {
            match("\",\"text\":\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:42:7: ( '\"}' )
            // InternalKPIGenerator.g:42:9: '\"}'
            {
            match("\"}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2358:13: ( RULE_INT '.' RULE_INT )
            // InternalKPIGenerator.g:2358:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_CADENA"
    public final void mRULE_CADENA() throws RecognitionException {
        try {
            int _type = RULE_CADENA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2360:13: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' | '\"' )+ ( '0' .. '9' )* )+ )
            // InternalKPIGenerator.g:2360:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' | '\"' )+ ( '0' .. '9' )* )+
            {
            // InternalKPIGenerator.g:2360:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' | '\"' )+ ( '0' .. '9' )* )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==' '||LA3_0=='\"'||(LA3_0>='-' && LA3_0<='.')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')||LA3_0=='|'||LA3_0=='\u00C1'||LA3_0=='\u00C9'||LA3_0=='\u00CD'||LA3_0=='\u00D3'||LA3_0=='\u00DA'||LA3_0=='\u00E1'||LA3_0=='\u00E9'||LA3_0=='\u00ED'||LA3_0=='\u00F3'||LA3_0=='\u00FA') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKPIGenerator.g:2360:16: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' | '\"' )+ ( '0' .. '9' )*
            	    {
            	    // InternalKPIGenerator.g:2360:16: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' | '\"' )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==' '||LA1_0=='\"'||(LA1_0>='-' && LA1_0<='.')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')||LA1_0=='|'||LA1_0=='\u00C1'||LA1_0=='\u00C9'||LA1_0=='\u00CD'||LA1_0=='\u00D3'||LA1_0=='\u00DA'||LA1_0=='\u00E1'||LA1_0=='\u00E9'||LA1_0=='\u00ED'||LA1_0=='\u00F3'||LA1_0=='\u00FA') ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalKPIGenerator.g:
            	    	    {
            	    	    if ( input.LA(1)==' '||input.LA(1)=='\"'||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='\u00C1'||input.LA(1)=='\u00C9'||input.LA(1)=='\u00CD'||input.LA(1)=='\u00D3'||input.LA(1)=='\u00DA'||input.LA(1)=='\u00E1'||input.LA(1)=='\u00E9'||input.LA(1)=='\u00ED'||input.LA(1)=='\u00F3'||input.LA(1)=='\u00FA' ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	    // InternalKPIGenerator.g:2360:147: ( '0' .. '9' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalKPIGenerator.g:2360:148: '0' .. '9'
            	    	    {
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CADENA"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2362:11: ( '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalKPIGenerator.g:2362:13: '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('/'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('/'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_DATEHOUR"
    public final void mRULE_DATEHOUR() throws RecognitionException {
        try {
            int _type = RULE_DATEHOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2364:15: ( '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ' ' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' ( ' AM' | ' PM' ) )
            // InternalKPIGenerator.g:2364:17: '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ' ' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' ( ' AM' | ' PM' )
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('/'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('/'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match(' '); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match(':'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            // InternalKPIGenerator.g:2364:141: ( ' AM' | ' PM' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==' ') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='A') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='P') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:2364:142: ' AM'
                    {
                    match(" AM"); 


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:2364:148: ' PM'
                    {
                    match(" PM"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATEHOUR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2366:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKPIGenerator.g:2366:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKPIGenerator.g:2366:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:2366:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKPIGenerator.g:2366:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKPIGenerator.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2368:10: ( ( '0' .. '9' )+ )
            // InternalKPIGenerator.g:2368:12: ( '0' .. '9' )+
            {
            // InternalKPIGenerator.g:2368:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKPIGenerator.g:2368:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2370:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKPIGenerator.g:2370:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKPIGenerator.g:2370:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalKPIGenerator.g:2370:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKPIGenerator.g:2370:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalKPIGenerator.g:2370:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIGenerator.g:2370:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:2370:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKPIGenerator.g:2370:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalKPIGenerator.g:2370:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIGenerator.g:2370:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2372:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKPIGenerator.g:2372:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKPIGenerator.g:2372:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKPIGenerator.g:2372:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2374:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKPIGenerator.g:2374:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKPIGenerator.g:2374:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKPIGenerator.g:2374:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalKPIGenerator.g:2374:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKPIGenerator.g:2374:41: ( '\\r' )? '\\n'
                    {
                    // InternalKPIGenerator.g:2374:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalKPIGenerator.g:2374:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2376:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKPIGenerator.g:2376:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKPIGenerator.g:2376:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKPIGenerator.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2378:16: ( . )
            // InternalKPIGenerator.g:2378:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalKPIGenerator.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_DOUBLE | RULE_CADENA | RULE_DATE | RULE_DATEHOUR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=43;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalKPIGenerator.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalKPIGenerator.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalKPIGenerator.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalKPIGenerator.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalKPIGenerator.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalKPIGenerator.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalKPIGenerator.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalKPIGenerator.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalKPIGenerator.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalKPIGenerator.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalKPIGenerator.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalKPIGenerator.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalKPIGenerator.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalKPIGenerator.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalKPIGenerator.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalKPIGenerator.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalKPIGenerator.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalKPIGenerator.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalKPIGenerator.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalKPIGenerator.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalKPIGenerator.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalKPIGenerator.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalKPIGenerator.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalKPIGenerator.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalKPIGenerator.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalKPIGenerator.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalKPIGenerator.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalKPIGenerator.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalKPIGenerator.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalKPIGenerator.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalKPIGenerator.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalKPIGenerator.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalKPIGenerator.g:1:202: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 34 :
                // InternalKPIGenerator.g:1:214: RULE_CADENA
                {
                mRULE_CADENA(); 

                }
                break;
            case 35 :
                // InternalKPIGenerator.g:1:226: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 36 :
                // InternalKPIGenerator.g:1:236: RULE_DATEHOUR
                {
                mRULE_DATEHOUR(); 

                }
                break;
            case 37 :
                // InternalKPIGenerator.g:1:250: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalKPIGenerator.g:1:258: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // InternalKPIGenerator.g:1:267: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalKPIGenerator.g:1:279: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // InternalKPIGenerator.g:1:295: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalKPIGenerator.g:1:311: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalKPIGenerator.g:1:319: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\24\1\uffff\1\32\1\20\1\35\1\uffff\1\40\1\43\1\20\1\43\1\uffff\2\20\3\uffff\1\52\1\uffff\1\54\2\uffff\2\43\7\uffff\1\40\2\uffff\1\43\1\uffff\1\43\1\uffff\1\43\4\uffff\1\25\16\uffff\1\40\32\uffff\1\127\2\uffff";
    static final String DFA16_eofS =
        "\130\uffff";
    static final String DFA16_minS =
        "\2\0\1\uffff\1\175\2\42\1\uffff\1\56\1\60\1\101\1\11\1\uffff\1\0\1\52\3\uffff\1\40\2\0\2\uffff\2\0\3\uffff\1\151\1\141\2\uffff\1\56\2\uffff\1\60\1\uffff\1\60\1\uffff\1\11\4\uffff\1\143\6\uffff\1\145\5\uffff\1\141\1\60\1\56\1\150\1\141\3\uffff\1\157\1\uffff\1\141\2\uffff\1\60\7\uffff\1\162\1\57\2\uffff\4\60\1\40\2\uffff";
    static final String DFA16_maxS =
        "\2\uffff\1\uffff\1\175\2\42\1\uffff\1\71\2\172\1\40\1\uffff\1\uffff\1\57\3\uffff\1\u00fa\2\uffff\2\uffff\2\uffff\3\uffff\2\164\2\uffff\1\71\2\uffff\1\172\1\uffff\1\172\1\uffff\1\40\4\uffff\1\165\6\uffff\1\164\5\uffff\1\151\2\71\1\162\1\151\3\uffff\1\162\1\uffff\1\141\2\uffff\1\71\7\uffff\1\164\1\57\2\uffff\4\71\1\40\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\3\3\uffff\1\35\4\uffff\1\45\2\uffff\1\42\1\52\1\53\3\uffff\1\2\1\47\2\uffff\1\3\1\7\1\4\2\uffff\1\10\1\35\1\uffff\1\46\1\41\1\uffff\1\42\1\uffff\1\45\1\uffff\1\52\1\50\1\51\1\1\1\uffff\1\40\1\42\1\5\1\12\1\36\1\13\1\uffff\1\16\1\23\1\25\1\31\1\32\5\uffff\1\14\1\20\1\22\1\uffff\1\15\1\uffff\1\33\1\34\1\uffff\1\6\1\21\1\11\1\30\1\37\1\26\1\27\2\uffff\1\17\1\24\5\uffff\1\44\1\43";
    static final String DFA16_specialS =
        "\1\4\1\2\12\uffff\1\5\5\uffff\1\3\1\0\2\uffff\1\6\1\1\100\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\12\1\20\1\1\4\20\1\14\4\20\1\5\2\16\1\15\12\7\7\20\32\10\1\2\1\20\1\3\1\11\1\13\1\20\32\10\1\4\1\16\1\6\103\20\1\16\7\20\1\16\3\20\1\16\5\20\1\16\6\20\1\16\6\20\1\16\7\20\1\16\3\20\1\16\5\20\1\16\6\20\1\16\uff05\20",
            "\40\25\1\27\1\25\1\21\11\25\1\22\2\27\1\25\12\26\7\25\32\27\6\25\32\27\1\25\1\27\1\23\103\25\1\27\7\25\1\27\3\25\1\27\5\25\1\27\6\25\1\27\6\25\1\27\7\25\1\27\3\25\1\27\5\25\1\27\6\25\1\27\uff05\25",
            "",
            "\1\31",
            "\1\33",
            "\1\34",
            "",
            "\1\41\1\uffff\12\37",
            "\12\42\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "\2\47\2\uffff\1\47\22\uffff\1\46",
            "",
            "\0\25",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "",
            "\1\43\1\uffff\1\43\12\uffff\2\43\1\uffff\12\43\7\uffff\32\43\6\uffff\32\43\1\uffff\1\43\104\uffff\1\43\7\uffff\1\43\3\uffff\1\43\5\uffff\1\43\6\uffff\1\43\6\uffff\1\43\7\uffff\1\43\3\uffff\1\43\5\uffff\1\43\6\uffff\1\43",
            "\42\25\1\53\uffdd\25",
            "\0\25",
            "",
            "",
            "\40\25\1\27\1\25\1\55\12\25\2\27\1\25\12\26\7\25\32\27\6\25\32\27\1\25\1\27\104\25\1\27\7\25\1\27\3\25\1\27\5\25\1\27\6\25\1\27\6\25\1\27\7\25\1\27\3\25\1\27\5\25\1\27\6\25\1\27\uff05\25",
            "\40\25\1\27\1\25\1\55\12\25\2\27\1\25\12\26\7\25\32\27\6\25\32\27\1\25\1\27\104\25\1\27\7\25\1\27\3\25\1\27\5\25\1\27\6\25\1\27\6\25\1\27\7\25\1\27\3\25\1\27\5\25\1\27\6\25\1\27\uff05\25",
            "",
            "",
            "",
            "\1\57\4\uffff\1\56\5\uffff\1\60",
            "\1\65\1\66\1\67\1\63\11\uffff\1\61\1\uffff\1\64\2\uffff\1\62\1\70",
            "",
            "",
            "\1\41\1\71\12\72",
            "",
            "",
            "\12\42\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "\12\42\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "\2\47\2\uffff\1\47\22\uffff\1\46",
            "",
            "",
            "",
            "",
            "\1\100\1\76\4\uffff\1\77\6\uffff\1\73\3\uffff\1\74\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101\16\uffff\1\102",
            "",
            "",
            "",
            "",
            "",
            "\1\104\7\uffff\1\103",
            "\12\105",
            "\1\41\1\uffff\12\72",
            "\1\106\11\uffff\1\107",
            "\1\110\3\uffff\1\112\3\uffff\1\111",
            "",
            "",
            "",
            "\1\114\2\uffff\1\113",
            "",
            "\1\115",
            "",
            "",
            "\12\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117\1\uffff\1\120",
            "\1\121",
            "",
            "",
            "\12\122",
            "\12\123",
            "\12\124",
            "\12\125",
            "\1\126",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_DOUBLE | RULE_CADENA | RULE_DATE | RULE_DATEHOUR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_19 = input.LA(1);

                        s = -1;
                        if ( ((LA16_19>='\u0000' && LA16_19<='\uFFFF')) ) {s = 21;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_23 = input.LA(1);

                        s = -1;
                        if ( (LA16_23=='\"') ) {s = 45;}

                        else if ( ((LA16_23>='\u0000' && LA16_23<='\u001F')||LA16_23=='!'||(LA16_23>='#' && LA16_23<=',')||LA16_23=='/'||(LA16_23>=':' && LA16_23<='@')||(LA16_23>='[' && LA16_23<='`')||LA16_23=='{'||(LA16_23>='}' && LA16_23<='\u00C0')||(LA16_23>='\u00C2' && LA16_23<='\u00C8')||(LA16_23>='\u00CA' && LA16_23<='\u00CC')||(LA16_23>='\u00CE' && LA16_23<='\u00D2')||(LA16_23>='\u00D4' && LA16_23<='\u00D9')||(LA16_23>='\u00DB' && LA16_23<='\u00E0')||(LA16_23>='\u00E2' && LA16_23<='\u00E8')||(LA16_23>='\u00EA' && LA16_23<='\u00EC')||(LA16_23>='\u00EE' && LA16_23<='\u00F2')||(LA16_23>='\u00F4' && LA16_23<='\u00F9')||(LA16_23>='\u00FB' && LA16_23<='\uFFFF')) ) {s = 21;}

                        else if ( ((LA16_23>='0' && LA16_23<='9')) ) {s = 22;}

                        else if ( (LA16_23==' '||(LA16_23>='-' && LA16_23<='.')||(LA16_23>='A' && LA16_23<='Z')||(LA16_23>='a' && LA16_23<='z')||LA16_23=='|'||LA16_23=='\u00C1'||LA16_23=='\u00C9'||LA16_23=='\u00CD'||LA16_23=='\u00D3'||LA16_23=='\u00DA'||LA16_23=='\u00E1'||LA16_23=='\u00E9'||LA16_23=='\u00ED'||LA16_23=='\u00F3'||LA16_23=='\u00FA') ) {s = 23;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_1 = input.LA(1);

                        s = -1;
                        if ( (LA16_1=='\"') ) {s = 17;}

                        else if ( (LA16_1==',') ) {s = 18;}

                        else if ( (LA16_1=='}') ) {s = 19;}

                        else if ( ((LA16_1>='\u0000' && LA16_1<='\u001F')||LA16_1=='!'||(LA16_1>='#' && LA16_1<='+')||LA16_1=='/'||(LA16_1>=':' && LA16_1<='@')||(LA16_1>='[' && LA16_1<='`')||LA16_1=='{'||(LA16_1>='~' && LA16_1<='\u00C0')||(LA16_1>='\u00C2' && LA16_1<='\u00C8')||(LA16_1>='\u00CA' && LA16_1<='\u00CC')||(LA16_1>='\u00CE' && LA16_1<='\u00D2')||(LA16_1>='\u00D4' && LA16_1<='\u00D9')||(LA16_1>='\u00DB' && LA16_1<='\u00E0')||(LA16_1>='\u00E2' && LA16_1<='\u00E8')||(LA16_1>='\u00EA' && LA16_1<='\u00EC')||(LA16_1>='\u00EE' && LA16_1<='\u00F2')||(LA16_1>='\u00F4' && LA16_1<='\u00F9')||(LA16_1>='\u00FB' && LA16_1<='\uFFFF')) ) {s = 21;}

                        else if ( ((LA16_1>='0' && LA16_1<='9')) ) {s = 22;}

                        else if ( (LA16_1==' '||(LA16_1>='-' && LA16_1<='.')||(LA16_1>='A' && LA16_1<='Z')||(LA16_1>='a' && LA16_1<='z')||LA16_1=='|'||LA16_1=='\u00C1'||LA16_1=='\u00C9'||LA16_1=='\u00CD'||LA16_1=='\u00D3'||LA16_1=='\u00DA'||LA16_1=='\u00E1'||LA16_1=='\u00E9'||LA16_1=='\u00ED'||LA16_1=='\u00F3'||LA16_1=='\u00FA') ) {s = 23;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_18 = input.LA(1);

                        s = -1;
                        if ( (LA16_18=='\"') ) {s = 43;}

                        else if ( ((LA16_18>='\u0000' && LA16_18<='!')||(LA16_18>='#' && LA16_18<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='\"') ) {s = 1;}

                        else if ( (LA16_0=='[') ) {s = 2;}

                        else if ( (LA16_0==']') ) {s = 3;}

                        else if ( (LA16_0=='{') ) {s = 4;}

                        else if ( (LA16_0==',') ) {s = 5;}

                        else if ( (LA16_0=='}') ) {s = 6;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 7;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||(LA16_0>='a' && LA16_0<='z')) ) {s = 8;}

                        else if ( (LA16_0=='^') ) {s = 9;}

                        else if ( (LA16_0==' ') ) {s = 10;}

                        else if ( (LA16_0=='_') ) {s = 11;}

                        else if ( (LA16_0=='\'') ) {s = 12;}

                        else if ( (LA16_0=='/') ) {s = 13;}

                        else if ( ((LA16_0>='-' && LA16_0<='.')||LA16_0=='|'||LA16_0=='\u00C1'||LA16_0=='\u00C9'||LA16_0=='\u00CD'||LA16_0=='\u00D3'||LA16_0=='\u00DA'||LA16_0=='\u00E1'||LA16_0=='\u00E9'||LA16_0=='\u00ED'||LA16_0=='\u00F3'||LA16_0=='\u00FA') ) {s = 14;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r') ) {s = 15;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='+')||(LA16_0>=':' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||(LA16_0>='~' && LA16_0<='\u00C0')||(LA16_0>='\u00C2' && LA16_0<='\u00C8')||(LA16_0>='\u00CA' && LA16_0<='\u00CC')||(LA16_0>='\u00CE' && LA16_0<='\u00D2')||(LA16_0>='\u00D4' && LA16_0<='\u00D9')||(LA16_0>='\u00DB' && LA16_0<='\u00E0')||(LA16_0>='\u00E2' && LA16_0<='\u00E8')||(LA16_0>='\u00EA' && LA16_0<='\u00EC')||(LA16_0>='\u00EE' && LA16_0<='\u00F2')||(LA16_0>='\u00F4' && LA16_0<='\u00F9')||(LA16_0>='\u00FB' && LA16_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_12 = input.LA(1);

                        s = -1;
                        if ( ((LA16_12>='\u0000' && LA16_12<='\uFFFF')) ) {s = 21;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_22 = input.LA(1);

                        s = -1;
                        if ( (LA16_22=='\"') ) {s = 45;}

                        else if ( ((LA16_22>='\u0000' && LA16_22<='\u001F')||LA16_22=='!'||(LA16_22>='#' && LA16_22<=',')||LA16_22=='/'||(LA16_22>=':' && LA16_22<='@')||(LA16_22>='[' && LA16_22<='`')||LA16_22=='{'||(LA16_22>='}' && LA16_22<='\u00C0')||(LA16_22>='\u00C2' && LA16_22<='\u00C8')||(LA16_22>='\u00CA' && LA16_22<='\u00CC')||(LA16_22>='\u00CE' && LA16_22<='\u00D2')||(LA16_22>='\u00D4' && LA16_22<='\u00D9')||(LA16_22>='\u00DB' && LA16_22<='\u00E0')||(LA16_22>='\u00E2' && LA16_22<='\u00E8')||(LA16_22>='\u00EA' && LA16_22<='\u00EC')||(LA16_22>='\u00EE' && LA16_22<='\u00F2')||(LA16_22>='\u00F4' && LA16_22<='\u00F9')||(LA16_22>='\u00FB' && LA16_22<='\uFFFF')) ) {s = 21;}

                        else if ( (LA16_22==' '||(LA16_22>='-' && LA16_22<='.')||(LA16_22>='A' && LA16_22<='Z')||(LA16_22>='a' && LA16_22<='z')||LA16_22=='|'||LA16_22=='\u00C1'||LA16_22=='\u00C9'||LA16_22=='\u00CD'||LA16_22=='\u00D3'||LA16_22=='\u00DA'||LA16_22=='\u00E1'||LA16_22=='\u00E9'||LA16_22=='\u00ED'||LA16_22=='\u00F3'||LA16_22=='\u00FA') ) {s = 23;}

                        else if ( ((LA16_22>='0' && LA16_22<='9')) ) {s = 22;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}