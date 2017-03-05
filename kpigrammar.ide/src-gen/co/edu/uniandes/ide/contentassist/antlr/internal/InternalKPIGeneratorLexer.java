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
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_SPACE=9;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_DATEHOUR=5;
    public static final int RULE_ID=10;
    public static final int RULE_WS=14;
    public static final int RULE_CADENA=6;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_DATE=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:11:7: ( '-' )
            // InternalKPIGenerator.g:11:9: '-'
            {
            match('-'); 

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
            // InternalKPIGenerator.g:12:7: ( '[' )
            // InternalKPIGenerator.g:12:9: '['
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
            // InternalKPIGenerator.g:13:7: ( ']' )
            // InternalKPIGenerator.g:13:9: ']'
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
            // InternalKPIGenerator.g:14:7: ( ',' )
            // InternalKPIGenerator.g:14:9: ','
            {
            match(','); 

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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:18:7: ( '\",\"tasks\":[' )
            // InternalKPIGenerator.g:18:9: '\",\"tasks\":['
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
            // InternalKPIGenerator.g:19:7: ( '{\"id\":' )
            // InternalKPIGenerator.g:19:9: '{\"id\":'
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
            // InternalKPIGenerator.g:20:7: ( ',\"name\":\"' )
            // InternalKPIGenerator.g:20:9: ',\"name\":\"'
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
            // InternalKPIGenerator.g:21:7: ( '\",\"useCase\":\"' )
            // InternalKPIGenerator.g:21:9: '\",\"useCase\":\"'
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
            // InternalKPIGenerator.g:22:7: ( '\",\"sequenceNumber\":' )
            // InternalKPIGenerator.g:22:9: '\",\"sequenceNumber\":'
            {
            match("\",\"sequenceNumber\":"); 


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
            // InternalKPIGenerator.g:23:7: ( ',\"startDate\":\"' )
            // InternalKPIGenerator.g:23:9: ',\"startDate\":\"'
            {
            match(",\"startDate\":\""); 


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
            // InternalKPIGenerator.g:24:7: ( '\",\"dueDate\":\"' )
            // InternalKPIGenerator.g:24:9: '\",\"dueDate\":\"'
            {
            match("\",\"dueDate\":\""); 


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
            // InternalKPIGenerator.g:25:7: ( '\",\"isPrivate\":' )
            // InternalKPIGenerator.g:25:9: '\",\"isPrivate\":'
            {
            match("\",\"isPrivate\":"); 


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
            // InternalKPIGenerator.g:26:7: ( ',\"progress\":' )
            // InternalKPIGenerator.g:26:9: ',\"progress\":'
            {
            match(",\"progress\":"); 


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
            // InternalKPIGenerator.g:27:7: ( ',\"status\":\"' )
            // InternalKPIGenerator.g:27:9: ',\"status\":\"'
            {
            match(",\"status\":\""); 


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
            // InternalKPIGenerator.g:28:7: ( '\",\"statusText\":\"' )
            // InternalKPIGenerator.g:28:9: '\",\"statusText\":\"'
            {
            match("\",\"statusText\":\""); 


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
            // InternalKPIGenerator.g:29:7: ( '\",\"assignedTo\":\"' )
            // InternalKPIGenerator.g:29:9: '\",\"assignedTo\":\"'
            {
            match("\",\"assignedTo\":\""); 


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
            // InternalKPIGenerator.g:30:7: ( '\",\"createdDate\":\"' )
            // InternalKPIGenerator.g:30:9: '\",\"createdDate\":\"'
            {
            match("\",\"createdDate\":\""); 


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
            // InternalKPIGenerator.g:31:7: ( '\",\"completedDate\":\"' )
            // InternalKPIGenerator.g:31:9: '\",\"completedDate\":\"'
            {
            match("\",\"completedDate\":\""); 


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
            // InternalKPIGenerator.g:32:7: ( '\",\"timeLoggedMin\":' )
            // InternalKPIGenerator.g:32:9: '\",\"timeLoggedMin\":'
            {
            match("\",\"timeLoggedMin\":"); 


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
            // InternalKPIGenerator.g:33:7: ( ',\"billableTime\":' )
            // InternalKPIGenerator.g:33:9: ',\"billableTime\":'
            {
            match(",\"billableTime\":"); 


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
            // InternalKPIGenerator.g:34:7: ( ',\"completedOnTime\":' )
            // InternalKPIGenerator.g:34:9: ',\"completedOnTime\":'
            {
            match(",\"completedOnTime\":"); 


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
            // InternalKPIGenerator.g:35:7: ( ',\"timeEstimated\":' )
            // InternalKPIGenerator.g:35:9: ',\"timeEstimated\":'
            {
            match(",\"timeEstimated\":"); 


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
            // InternalKPIGenerator.g:36:7: ( '}' )
            // InternalKPIGenerator.g:36:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_CADENA"
    public final void mRULE_CADENA() throws RecognitionException {
        try {
            int _type = RULE_CADENA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2237:13: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' | '(' | ')' | '/' | ':' )+ ( '0' .. '9' )* )+ )
            // InternalKPIGenerator.g:2237:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' | '(' | ')' | '/' | ':' )+ ( '0' .. '9' )* )+
            {
            // InternalKPIGenerator.g:2237:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' | '(' | ')' | '/' | ':' )+ ( '0' .. '9' )* )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==' '||(LA3_0>='(' && LA3_0<=')')||(LA3_0>='-' && LA3_0<='/')||LA3_0==':'||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')||LA3_0=='|'||LA3_0=='\u00C1'||LA3_0=='\u00C9'||LA3_0=='\u00CD'||LA3_0=='\u00D3'||LA3_0=='\u00DA'||LA3_0=='\u00E1'||LA3_0=='\u00E9'||LA3_0=='\u00ED'||LA3_0=='\u00F3'||LA3_0=='\u00FA') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKPIGenerator.g:2237:16: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' | '(' | ')' | '/' | ':' )+ ( '0' .. '9' )*
            	    {
            	    // InternalKPIGenerator.g:2237:16: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' | '(' | ')' | '/' | ':' )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==' '||(LA1_0>='(' && LA1_0<=')')||(LA1_0>='-' && LA1_0<='/')||LA1_0==':'||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')||LA1_0=='|'||LA1_0=='\u00C1'||LA1_0=='\u00C9'||LA1_0=='\u00CD'||LA1_0=='\u00D3'||LA1_0=='\u00DA'||LA1_0=='\u00E1'||LA1_0=='\u00E9'||LA1_0=='\u00ED'||LA1_0=='\u00F3'||LA1_0=='\u00FA') ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalKPIGenerator.g:
            	    	    {
            	    	    if ( input.LA(1)==' '||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>='-' && input.LA(1)<='/')||input.LA(1)==':'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='\u00C1'||input.LA(1)=='\u00C9'||input.LA(1)=='\u00CD'||input.LA(1)=='\u00D3'||input.LA(1)=='\u00DA'||input.LA(1)=='\u00E1'||input.LA(1)=='\u00E9'||input.LA(1)=='\u00ED'||input.LA(1)=='\u00F3'||input.LA(1)=='\u00FA' ) {
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

            	    // InternalKPIGenerator.g:2237:159: ( '0' .. '9' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalKPIGenerator.g:2237:160: '0' .. '9'
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

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2239:13: ( RULE_INT '.' RULE_INT )
            // InternalKPIGenerator.g:2239:15: RULE_INT '.' RULE_INT
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

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2241:11: ( ( RULE_INT )+ '/' ( RULE_INT )+ '/' ( RULE_INT )+ )
            // InternalKPIGenerator.g:2241:13: ( RULE_INT )+ '/' ( RULE_INT )+ '/' ( RULE_INT )+
            {
            // InternalKPIGenerator.g:2241:13: ( RULE_INT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKPIGenerator.g:2241:13: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('/'); 
            // InternalKPIGenerator.g:2241:27: ( RULE_INT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKPIGenerator.g:2241:27: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match('/'); 
            // InternalKPIGenerator.g:2241:41: ( RULE_INT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKPIGenerator.g:2241:41: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


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
            // InternalKPIGenerator.g:2243:15: ( RULE_DATE RULE_SPACE RULE_INT ':' RULE_INT RULE_SPACE ( 'AM' | 'PM' ) )
            // InternalKPIGenerator.g:2243:17: RULE_DATE RULE_SPACE RULE_INT ':' RULE_INT RULE_SPACE ( 'AM' | 'PM' )
            {
            mRULE_DATE(); 
            mRULE_SPACE(); 
            mRULE_INT(); 
            match(':'); 
            mRULE_INT(); 
            mRULE_SPACE(); 
            // InternalKPIGenerator.g:2243:71: ( 'AM' | 'PM' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='A') ) {
                alt7=1;
            }
            else if ( (LA7_0=='P') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:2243:72: 'AM'
                    {
                    match("AM"); 


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:2243:77: 'PM'
                    {
                    match("PM"); 


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

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:2245:21: ( ' ' )
            // InternalKPIGenerator.g:2245:23: ' '
            {
            match(' '); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2247:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKPIGenerator.g:2247:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKPIGenerator.g:2247:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKPIGenerator.g:2247:11: '^'
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

            // InternalKPIGenerator.g:2247:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
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
            // InternalKPIGenerator.g:2249:10: ( ( '0' .. '9' )+ )
            // InternalKPIGenerator.g:2249:12: ( '0' .. '9' )+
            {
            // InternalKPIGenerator.g:2249:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKPIGenerator.g:2249:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // InternalKPIGenerator.g:2251:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKPIGenerator.g:2251:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKPIGenerator.g:2251:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalKPIGenerator.g:2251:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKPIGenerator.g:2251:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalKPIGenerator.g:2251:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIGenerator.g:2251:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:2251:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKPIGenerator.g:2251:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalKPIGenerator.g:2251:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIGenerator.g:2251:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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
            // InternalKPIGenerator.g:2253:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKPIGenerator.g:2253:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKPIGenerator.g:2253:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKPIGenerator.g:2253:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // InternalKPIGenerator.g:2255:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKPIGenerator.g:2255:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKPIGenerator.g:2255:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKPIGenerator.g:2255:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // InternalKPIGenerator.g:2255:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKPIGenerator.g:2255:41: ( '\\r' )? '\\n'
                    {
                    // InternalKPIGenerator.g:2255:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalKPIGenerator.g:2255:41: '\\r'
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
            // InternalKPIGenerator.g:2257:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKPIGenerator.g:2257:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKPIGenerator.g:2257:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // InternalKPIGenerator.g:2259:16: ( . )
            // InternalKPIGenerator.g:2259:18: .
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
        // InternalKPIGenerator.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_CADENA | RULE_DOUBLE | RULE_DATE | RULE_DATEHOUR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=37;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalKPIGenerator.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalKPIGenerator.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalKPIGenerator.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalKPIGenerator.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalKPIGenerator.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalKPIGenerator.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalKPIGenerator.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalKPIGenerator.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalKPIGenerator.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalKPIGenerator.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalKPIGenerator.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalKPIGenerator.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalKPIGenerator.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalKPIGenerator.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalKPIGenerator.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalKPIGenerator.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalKPIGenerator.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalKPIGenerator.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalKPIGenerator.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalKPIGenerator.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalKPIGenerator.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalKPIGenerator.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalKPIGenerator.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalKPIGenerator.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalKPIGenerator.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalKPIGenerator.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalKPIGenerator.g:1:166: RULE_CADENA
                {
                mRULE_CADENA(); 

                }
                break;
            case 28 :
                // InternalKPIGenerator.g:1:178: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 29 :
                // InternalKPIGenerator.g:1:190: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 30 :
                // InternalKPIGenerator.g:1:200: RULE_DATEHOUR
                {
                mRULE_DATEHOUR(); 

                }
                break;
            case 31 :
                // InternalKPIGenerator.g:1:214: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // InternalKPIGenerator.g:1:222: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // InternalKPIGenerator.g:1:231: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // InternalKPIGenerator.g:1:243: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // InternalKPIGenerator.g:1:259: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // InternalKPIGenerator.g:1:275: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // InternalKPIGenerator.g:1:283: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\22\1\uffff\1\26\1\30\2\21\1\uffff\1\23\1\40\1\21\1\23\1\uffff\1\21\1\23\16\uffff\2\23\3\uffff\1\40\2\uffff\2\23\11\uffff\1\33\1\uffff\1\23\1\uffff\1\23\21\uffff\1\111\4\uffff";
    static final String DFA19_eofS =
        "\113\uffff";
    static final String DFA19_minS =
        "\1\0\1\40\1\uffff\1\175\2\42\1\0\1\uffff\1\60\1\56\1\101\1\52\1\uffff\1\0\1\11\10\uffff\1\142\1\uffff\1\151\1\0\2\uffff\2\60\2\uffff\1\60\1\56\2\uffff\1\0\1\11\2\uffff\1\164\6\uffff\1\141\1\57\1\0\1\uffff\1\0\1\141\1\uffff\1\141\1\uffff\1\145\3\uffff\1\157\1\60\1\162\6\uffff\1\40\4\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\u00fa\1\uffff\1\175\2\42\1\uffff\1\uffff\1\172\1\71\1\172\1\57\1\uffff\1\uffff\1\40\10\uffff\1\164\1\uffff\1\156\1\uffff\2\uffff\2\172\2\uffff\2\71\2\uffff\1\uffff\1\40\2\uffff\1\164\6\uffff\1\165\1\71\1\uffff\1\uffff\1\uffff\1\141\1\uffff\1\151\1\uffff\1\164\3\uffff\1\162\1\71\1\164\6\uffff\1\71\4\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\4\uffff\1\32\4\uffff\1\37\2\uffff\1\33\1\44\1\45\1\1\1\33\1\2\1\7\1\3\1\uffff\1\4\2\uffff\1\41\1\32\2\uffff\1\37\1\40\2\uffff\1\34\1\42\2\uffff\1\44\1\12\1\uffff\1\20\1\27\1\30\1\31\1\5\1\11\3\uffff\1\43\2\uffff\1\6\1\uffff\1\13\1\uffff\1\16\1\17\1\23\3\uffff\1\10\1\26\1\14\1\22\1\24\1\25\1\uffff\1\15\1\21\1\35\1\36";
    static final String DFA19_specialS =
        "\1\4\5\uffff\1\2\6\uffff\1\0\14\uffff\1\3\12\uffff\1\6\14\uffff\1\5\1\uffff\1\1\26\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\16\1\21\1\6\4\21\1\15\2\17\2\21\1\4\1\1\1\17\1\13\12\11\1\17\6\21\32\10\1\2\1\21\1\3\1\12\1\14\1\21\32\10\1\5\1\17\1\7\103\21\1\17\7\21\1\17\3\21\1\17\5\21\1\17\6\21\1\17\6\21\1\17\7\21\1\17\3\21\1\17\5\21\1\17\6\21\1\17\uff05\21",
            "\1\23\7\uffff\2\23\3\uffff\16\23\6\uffff\32\23\6\uffff\32\23\1\uffff\1\23\104\uffff\1\23\7\uffff\1\23\3\uffff\1\23\5\uffff\1\23\6\uffff\1\23\6\uffff\1\23\7\uffff\1\23\3\uffff\1\23\5\uffff\1\23\6\uffff\1\23",
            "",
            "\1\25",
            "\1\27",
            "\1\31",
            "\54\33\1\32\uffd3\33",
            "",
            "\12\35\7\uffff\32\36\4\uffff\1\37\1\uffff\32\36",
            "\1\43\1\41\12\42",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\44\4\uffff\1\45",
            "",
            "\0\33",
            "\2\47\2\uffff\1\47\22\uffff\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\1\54\12\uffff\1\50\1\uffff\1\52\2\uffff\1\51\1\55",
            "",
            "\1\57\4\uffff\1\56",
            "\42\33\1\60\uffdd\33",
            "",
            "",
            "\12\35\7\uffff\32\36\4\uffff\1\37\1\uffff\32\36",
            "\12\35\7\uffff\32\36\4\uffff\1\37\1\uffff\32\36",
            "",
            "",
            "\12\61",
            "\1\43\1\41\12\42",
            "",
            "",
            "\40\63\1\64\7\63\2\64\3\63\3\64\12\62\1\64\6\63\32\64\6\63\32\64\1\63\1\64\104\63\1\64\7\63\1\64\3\63\1\64\5\63\1\64\6\63\1\64\6\63\1\64\7\63\1\64\3\63\1\64\5\63\1\64\6\63\1\64\uff05\63",
            "\2\47\2\uffff\1\47\22\uffff\1\46",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\uffff\1\75\1\72\4\uffff\1\73\6\uffff\1\66\2\uffff\1\71\1\67\1\70",
            "\1\76\12\61",
            "\40\63\1\64\7\63\2\64\3\63\3\64\12\62\1\64\6\63\32\64\6\63\32\64\1\63\1\64\104\63\1\64\7\63\1\64\3\63\1\64\5\63\1\64\6\63\1\64\6\63\1\64\7\63\1\64\3\63\1\64\5\63\1\64\6\63\1\64\uff05\63",
            "",
            "\40\63\1\64\7\63\2\64\3\63\3\64\12\62\1\64\6\63\32\64\6\63\32\64\1\63\1\64\104\63\1\64\7\63\1\64\3\63\1\64\5\63\1\64\6\63\1\64\6\63\1\64\7\63\1\64\3\63\1\64\5\63\1\64\6\63\1\64\uff05\63",
            "\1\77",
            "",
            "\1\100\7\uffff\1\101",
            "",
            "\1\102\16\uffff\1\103",
            "",
            "",
            "",
            "\1\105\2\uffff\1\104",
            "\12\106",
            "\1\107\1\uffff\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112\17\uffff\12\106",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_CADENA | RULE_DOUBLE | RULE_DATE | RULE_DATEHOUR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_13 = input.LA(1);

                        s = -1;
                        if ( ((LA19_13>='\u0000' && LA19_13<='\uFFFF')) ) {s = 27;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_52 = input.LA(1);

                        s = -1;
                        if ( ((LA19_52>='\u0000' && LA19_52<='\u001F')||(LA19_52>='!' && LA19_52<='\'')||(LA19_52>='*' && LA19_52<=',')||(LA19_52>=';' && LA19_52<='@')||(LA19_52>='[' && LA19_52<='`')||LA19_52=='{'||(LA19_52>='}' && LA19_52<='\u00C0')||(LA19_52>='\u00C2' && LA19_52<='\u00C8')||(LA19_52>='\u00CA' && LA19_52<='\u00CC')||(LA19_52>='\u00CE' && LA19_52<='\u00D2')||(LA19_52>='\u00D4' && LA19_52<='\u00D9')||(LA19_52>='\u00DB' && LA19_52<='\u00E0')||(LA19_52>='\u00E2' && LA19_52<='\u00E8')||(LA19_52>='\u00EA' && LA19_52<='\u00EC')||(LA19_52>='\u00EE' && LA19_52<='\u00F2')||(LA19_52>='\u00F4' && LA19_52<='\u00F9')||(LA19_52>='\u00FB' && LA19_52<='\uFFFF')) ) {s = 51;}

                        else if ( ((LA19_52>='0' && LA19_52<='9')) ) {s = 50;}

                        else if ( (LA19_52==' '||(LA19_52>='(' && LA19_52<=')')||(LA19_52>='-' && LA19_52<='/')||LA19_52==':'||(LA19_52>='A' && LA19_52<='Z')||(LA19_52>='a' && LA19_52<='z')||LA19_52=='|'||LA19_52=='\u00C1'||LA19_52=='\u00C9'||LA19_52=='\u00CD'||LA19_52=='\u00D3'||LA19_52=='\u00DA'||LA19_52=='\u00E1'||LA19_52=='\u00E9'||LA19_52=='\u00ED'||LA19_52=='\u00F3'||LA19_52=='\u00FA') ) {s = 52;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_6 = input.LA(1);

                        s = -1;
                        if ( (LA19_6==',') ) {s = 26;}

                        else if ( ((LA19_6>='\u0000' && LA19_6<='+')||(LA19_6>='-' && LA19_6<='\uFFFF')) ) {s = 27;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_26 = input.LA(1);

                        s = -1;
                        if ( (LA19_26=='\"') ) {s = 48;}

                        else if ( ((LA19_26>='\u0000' && LA19_26<='!')||(LA19_26>='#' && LA19_26<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='-') ) {s = 1;}

                        else if ( (LA19_0=='[') ) {s = 2;}

                        else if ( (LA19_0==']') ) {s = 3;}

                        else if ( (LA19_0==',') ) {s = 4;}

                        else if ( (LA19_0=='{') ) {s = 5;}

                        else if ( (LA19_0=='\"') ) {s = 6;}

                        else if ( (LA19_0=='}') ) {s = 7;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||(LA19_0>='a' && LA19_0<='z')) ) {s = 8;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 9;}

                        else if ( (LA19_0=='^') ) {s = 10;}

                        else if ( (LA19_0=='/') ) {s = 11;}

                        else if ( (LA19_0=='_') ) {s = 12;}

                        else if ( (LA19_0=='\'') ) {s = 13;}

                        else if ( (LA19_0==' ') ) {s = 14;}

                        else if ( ((LA19_0>='(' && LA19_0<=')')||LA19_0=='.'||LA19_0==':'||LA19_0=='|'||LA19_0=='\u00C1'||LA19_0=='\u00C9'||LA19_0=='\u00CD'||LA19_0=='\u00D3'||LA19_0=='\u00DA'||LA19_0=='\u00E1'||LA19_0=='\u00E9'||LA19_0=='\u00ED'||LA19_0=='\u00F3'||LA19_0=='\u00FA') ) {s = 15;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r') ) {s = 16;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='#' && LA19_0<='&')||(LA19_0>='*' && LA19_0<='+')||(LA19_0>=';' && LA19_0<='@')||LA19_0=='\\'||LA19_0=='`'||(LA19_0>='~' && LA19_0<='\u00C0')||(LA19_0>='\u00C2' && LA19_0<='\u00C8')||(LA19_0>='\u00CA' && LA19_0<='\u00CC')||(LA19_0>='\u00CE' && LA19_0<='\u00D2')||(LA19_0>='\u00D4' && LA19_0<='\u00D9')||(LA19_0>='\u00DB' && LA19_0<='\u00E0')||(LA19_0>='\u00E2' && LA19_0<='\u00E8')||(LA19_0>='\u00EA' && LA19_0<='\u00EC')||(LA19_0>='\u00EE' && LA19_0<='\u00F2')||(LA19_0>='\u00F4' && LA19_0<='\u00F9')||(LA19_0>='\u00FB' && LA19_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_50 = input.LA(1);

                        s = -1;
                        if ( ((LA19_50>='\u0000' && LA19_50<='\u001F')||(LA19_50>='!' && LA19_50<='\'')||(LA19_50>='*' && LA19_50<=',')||(LA19_50>=';' && LA19_50<='@')||(LA19_50>='[' && LA19_50<='`')||LA19_50=='{'||(LA19_50>='}' && LA19_50<='\u00C0')||(LA19_50>='\u00C2' && LA19_50<='\u00C8')||(LA19_50>='\u00CA' && LA19_50<='\u00CC')||(LA19_50>='\u00CE' && LA19_50<='\u00D2')||(LA19_50>='\u00D4' && LA19_50<='\u00D9')||(LA19_50>='\u00DB' && LA19_50<='\u00E0')||(LA19_50>='\u00E2' && LA19_50<='\u00E8')||(LA19_50>='\u00EA' && LA19_50<='\u00EC')||(LA19_50>='\u00EE' && LA19_50<='\u00F2')||(LA19_50>='\u00F4' && LA19_50<='\u00F9')||(LA19_50>='\u00FB' && LA19_50<='\uFFFF')) ) {s = 51;}

                        else if ( (LA19_50==' '||(LA19_50>='(' && LA19_50<=')')||(LA19_50>='-' && LA19_50<='/')||LA19_50==':'||(LA19_50>='A' && LA19_50<='Z')||(LA19_50>='a' && LA19_50<='z')||LA19_50=='|'||LA19_50=='\u00C1'||LA19_50=='\u00C9'||LA19_50=='\u00CD'||LA19_50=='\u00D3'||LA19_50=='\u00DA'||LA19_50=='\u00E1'||LA19_50=='\u00E9'||LA19_50=='\u00ED'||LA19_50=='\u00F3'||LA19_50=='\u00FA') ) {s = 52;}

                        else if ( ((LA19_50>='0' && LA19_50<='9')) ) {s = 50;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_37 = input.LA(1);

                        s = -1;
                        if ( ((LA19_37>='0' && LA19_37<='9')) ) {s = 50;}

                        else if ( ((LA19_37>='\u0000' && LA19_37<='\u001F')||(LA19_37>='!' && LA19_37<='\'')||(LA19_37>='*' && LA19_37<=',')||(LA19_37>=';' && LA19_37<='@')||(LA19_37>='[' && LA19_37<='`')||LA19_37=='{'||(LA19_37>='}' && LA19_37<='\u00C0')||(LA19_37>='\u00C2' && LA19_37<='\u00C8')||(LA19_37>='\u00CA' && LA19_37<='\u00CC')||(LA19_37>='\u00CE' && LA19_37<='\u00D2')||(LA19_37>='\u00D4' && LA19_37<='\u00D9')||(LA19_37>='\u00DB' && LA19_37<='\u00E0')||(LA19_37>='\u00E2' && LA19_37<='\u00E8')||(LA19_37>='\u00EA' && LA19_37<='\u00EC')||(LA19_37>='\u00EE' && LA19_37<='\u00F2')||(LA19_37>='\u00F4' && LA19_37<='\u00F9')||(LA19_37>='\u00FB' && LA19_37<='\uFFFF')) ) {s = 51;}

                        else if ( (LA19_37==' '||(LA19_37>='(' && LA19_37<=')')||(LA19_37>='-' && LA19_37<='/')||LA19_37==':'||(LA19_37>='A' && LA19_37<='Z')||(LA19_37>='a' && LA19_37<='z')||LA19_37=='|'||LA19_37=='\u00C1'||LA19_37=='\u00C9'||LA19_37=='\u00CD'||LA19_37=='\u00D3'||LA19_37=='\u00DA'||LA19_37=='\u00E1'||LA19_37=='\u00E9'||LA19_37=='\u00ED'||LA19_37=='\u00F3'||LA19_37=='\u00FA') ) {s = 52;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}