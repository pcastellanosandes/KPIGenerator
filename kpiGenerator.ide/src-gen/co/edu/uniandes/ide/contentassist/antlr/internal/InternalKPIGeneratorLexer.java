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
    public static final int RULE_NEWLINE=5;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=9;
    public static final int RULE_WS=13;
    public static final int RULE_CADENA=8;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_PIPE=6;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_SEMICOLON=4;

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
            // InternalKPIGenerator.g:11:7: ( 'completed' )
            // InternalKPIGenerator.g:11:9: 'completed'
            {
            match("completed"); 


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
            // InternalKPIGenerator.g:12:7: ( 'new' )
            // InternalKPIGenerator.g:12:9: 'new'
            {
            match("new"); 


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
            // InternalKPIGenerator.g:13:7: ( 'FALSO' )
            // InternalKPIGenerator.g:13:9: 'FALSO'
            {
            match("FALSO"); 


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
            // InternalKPIGenerator.g:14:7: ( 'VERDADERO' )
            // InternalKPIGenerator.g:14:9: 'VERDADERO'
            {
            match("VERDADERO"); 


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
            // InternalKPIGenerator.g:15:7: ( '.' )
            // InternalKPIGenerator.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2142:16: ( ';' )
            // InternalKPIGenerator.g:2142:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_PIPE"
    public final void mRULE_PIPE() throws RecognitionException {
        try {
            int _type = RULE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2144:11: ( '|' )
            // InternalKPIGenerator.g:2144:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2146:14: ( '/n' )
            // InternalKPIGenerator.g:2146:16: '/n'
            {
            match("/n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_CADENA"
    public final void mRULE_CADENA() throws RecognitionException {
        try {
            int _type = RULE_CADENA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2148:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' )+ )
            // InternalKPIGenerator.g:2148:15: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' )+
            {
            // InternalKPIGenerator.g:2148:15: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==' '||LA1_0=='-'||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')||LA1_0=='\u00C1'||LA1_0=='\u00C9'||LA1_0=='\u00CD'||LA1_0=='\u00D3'||LA1_0=='\u00DA'||LA1_0=='\u00E1'||LA1_0=='\u00E9'||LA1_0=='\u00ED'||LA1_0=='\u00F3'||LA1_0=='\u00FA') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKPIGenerator.g:
            	    {
            	    if ( input.LA(1)==' '||input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00C1'||input.LA(1)=='\u00C9'||input.LA(1)=='\u00CD'||input.LA(1)=='\u00D3'||input.LA(1)=='\u00DA'||input.LA(1)=='\u00E1'||input.LA(1)=='\u00E9'||input.LA(1)=='\u00ED'||input.LA(1)=='\u00F3'||input.LA(1)=='\u00FA' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CADENA"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:2150:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKPIGenerator.g:2150:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKPIGenerator.g:2150:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:2150:11: '^'
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

            // InternalKPIGenerator.g:2150:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // InternalKPIGenerator.g:2152:10: ( ( '0' .. '9' )+ )
            // InternalKPIGenerator.g:2152:12: ( '0' .. '9' )+
            {
            // InternalKPIGenerator.g:2152:12: ( '0' .. '9' )+
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
            	    // InternalKPIGenerator.g:2152:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalKPIGenerator.g:2154:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKPIGenerator.g:2154:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKPIGenerator.g:2154:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:2154:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKPIGenerator.g:2154:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKPIGenerator.g:2154:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIGenerator.g:2154:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:2154:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKPIGenerator.g:2154:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKPIGenerator.g:2154:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIGenerator.g:2154:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalKPIGenerator.g:2156:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKPIGenerator.g:2156:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKPIGenerator.g:2156:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKPIGenerator.g:2156:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalKPIGenerator.g:2158:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKPIGenerator.g:2158:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKPIGenerator.g:2158:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKPIGenerator.g:2158:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalKPIGenerator.g:2158:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKPIGenerator.g:2158:41: ( '\\r' )? '\\n'
                    {
                    // InternalKPIGenerator.g:2158:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalKPIGenerator.g:2158:41: '\\r'
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
            // InternalKPIGenerator.g:2160:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKPIGenerator.g:2160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKPIGenerator.g:2160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalKPIGenerator.g:2162:16: ( . )
            // InternalKPIGenerator.g:2162:18: .
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
        // InternalKPIGenerator.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | RULE_SEMICOLON | RULE_PIPE | RULE_NEWLINE | RULE_CADENA | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=16;
        alt13 = dfa13.predict(input);
        switch (alt13) {
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
                // InternalKPIGenerator.g:1:40: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 7 :
                // InternalKPIGenerator.g:1:55: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 8 :
                // InternalKPIGenerator.g:1:65: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 9 :
                // InternalKPIGenerator.g:1:78: RULE_CADENA
                {
                mRULE_CADENA(); 

                }
                break;
            case 10 :
                // InternalKPIGenerator.g:1:90: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // InternalKPIGenerator.g:1:98: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // InternalKPIGenerator.g:1:107: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalKPIGenerator.g:1:119: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // InternalKPIGenerator.g:1:135: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalKPIGenerator.g:1:151: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // InternalKPIGenerator.g:1:159: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\4\24\3\uffff\1\22\1\24\1\22\1\24\2\uffff\2\22\3\uffff\1\24\1\uffff\1\24\1\uffff\3\24\6\uffff\1\24\3\uffff\1\24\1\51\3\24\1\uffff\3\24\1\60\2\24\1\uffff\5\24\1\70\1\71\2\uffff";
    static final String DFA13_eofS =
        "\72\uffff";
    static final String DFA13_minS =
        "\1\0\4\60\3\uffff\1\52\1\60\1\101\1\11\2\uffff\2\0\3\uffff\1\60\1\uffff\1\60\1\uffff\3\60\6\uffff\1\11\3\uffff\1\60\1\40\3\60\1\uffff\3\60\1\40\2\60\1\uffff\5\60\2\40\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\4\172\3\uffff\1\156\2\172\1\40\2\uffff\2\uffff\3\uffff\1\172\1\uffff\1\172\1\uffff\3\172\6\uffff\1\40\3\uffff\1\172\1\u00fa\3\172\1\uffff\3\172\1\u00fa\2\172\1\uffff\5\172\2\u00fa\2\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\5\1\6\1\7\4\uffff\1\12\1\13\2\uffff\1\11\1\17\1\20\1\uffff\1\11\1\uffff\1\12\3\uffff\1\5\1\6\1\7\1\10\1\15\1\16\1\uffff\1\17\1\13\1\14\5\uffff\1\2\6\uffff\1\3\7\uffff\1\1\1\4";
    static final String DFA13_specialS =
        "\1\1\15\uffff\1\0\1\2\52\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\13\1\22\1\16\4\22\1\17\5\22\1\20\1\5\1\10\12\15\1\22\1\6\5\22\5\11\1\3\17\11\1\4\4\11\3\22\1\12\1\14\1\22\2\11\1\1\12\11\1\2\14\11\1\22\1\7\104\22\1\20\7\22\1\20\3\22\1\20\5\22\1\20\6\22\1\20\6\22\1\20\7\22\1\20\3\22\1\20\5\22\1\20\6\22\1\20\uff05\22",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\16\25\1\23\13\25",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\4\25\1\27\25\25",
            "\12\26\7\uffff\1\30\31\25\4\uffff\1\26\1\uffff\32\25",
            "\12\26\7\uffff\4\25\1\31\25\25\4\uffff\1\26\1\uffff\32\25",
            "",
            "",
            "",
            "\1\36\4\uffff\1\37\76\uffff\1\35",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\32\25",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "\2\41\2\uffff\1\41\22\uffff\1\40",
            "",
            "",
            "\0\43",
            "\0\43",
            "",
            "",
            "",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\14\25\1\44\15\25",
            "",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\32\25",
            "",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\26\25\1\45\3\25",
            "\12\26\7\uffff\13\25\1\46\16\25\4\uffff\1\26\1\uffff\32\25",
            "\12\26\7\uffff\21\25\1\47\10\25\4\uffff\1\26\1\uffff\32\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\41\2\uffff\1\41\22\uffff\1\40",
            "",
            "",
            "",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\17\25\1\50\12\25",
            "\1\24\14\uffff\1\24\2\uffff\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\32\25\106\uffff\1\24\7\uffff\1\24\3\uffff\1\24\5\uffff\1\24\6\uffff\1\24\6\uffff\1\24\7\uffff\1\24\3\uffff\1\24\5\uffff\1\24\6\uffff\1\24",
            "\12\26\7\uffff\22\25\1\52\7\25\4\uffff\1\26\1\uffff\32\25",
            "\12\26\7\uffff\3\25\1\53\26\25\4\uffff\1\26\1\uffff\32\25",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\13\25\1\54\16\25",
            "",
            "\12\26\7\uffff\16\25\1\55\13\25\4\uffff\1\26\1\uffff\32\25",
            "\12\26\7\uffff\1\56\31\25\4\uffff\1\26\1\uffff\32\25",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\4\25\1\57\25\25",
            "\1\24\14\uffff\1\24\2\uffff\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\32\25\106\uffff\1\24\7\uffff\1\24\3\uffff\1\24\5\uffff\1\24\6\uffff\1\24\6\uffff\1\24\7\uffff\1\24\3\uffff\1\24\5\uffff\1\24\6\uffff\1\24",
            "\12\26\7\uffff\3\25\1\61\26\25\4\uffff\1\26\1\uffff\32\25",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\23\25\1\62\6\25",
            "",
            "\12\26\7\uffff\4\25\1\63\25\25\4\uffff\1\26\1\uffff\32\25",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\4\25\1\64\25\25",
            "\12\26\7\uffff\21\25\1\65\10\25\4\uffff\1\26\1\uffff\32\25",
            "\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\3\25\1\66\26\25",
            "\12\26\7\uffff\16\25\1\67\13\25\4\uffff\1\26\1\uffff\32\25",
            "\1\24\14\uffff\1\24\2\uffff\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\32\25\106\uffff\1\24\7\uffff\1\24\3\uffff\1\24\5\uffff\1\24\6\uffff\1\24\6\uffff\1\24\7\uffff\1\24\3\uffff\1\24\5\uffff\1\24\6\uffff\1\24",
            "\1\24\14\uffff\1\24\2\uffff\12\26\7\uffff\32\25\4\uffff\1\26\1\uffff\32\25\106\uffff\1\24\7\uffff\1\24\3\uffff\1\24\5\uffff\1\24\6\uffff\1\24\6\uffff\1\24\7\uffff\1\24\3\uffff\1\24\5\uffff\1\24\6\uffff\1\24",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | RULE_SEMICOLON | RULE_PIPE | RULE_NEWLINE | RULE_CADENA | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_14 = input.LA(1);

                        s = -1;
                        if ( ((LA13_14>='\u0000' && LA13_14<='\uFFFF')) ) {s = 35;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='c') ) {s = 1;}

                        else if ( (LA13_0=='n') ) {s = 2;}

                        else if ( (LA13_0=='F') ) {s = 3;}

                        else if ( (LA13_0=='V') ) {s = 4;}

                        else if ( (LA13_0=='.') ) {s = 5;}

                        else if ( (LA13_0==';') ) {s = 6;}

                        else if ( (LA13_0=='|') ) {s = 7;}

                        else if ( (LA13_0=='/') ) {s = 8;}

                        else if ( ((LA13_0>='A' && LA13_0<='E')||(LA13_0>='G' && LA13_0<='U')||(LA13_0>='W' && LA13_0<='Z')||(LA13_0>='a' && LA13_0<='b')||(LA13_0>='d' && LA13_0<='m')||(LA13_0>='o' && LA13_0<='z')) ) {s = 9;}

                        else if ( (LA13_0=='^') ) {s = 10;}

                        else if ( (LA13_0==' ') ) {s = 11;}

                        else if ( (LA13_0=='_') ) {s = 12;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 13;}

                        else if ( (LA13_0=='\"') ) {s = 14;}

                        else if ( (LA13_0=='\'') ) {s = 15;}

                        else if ( (LA13_0=='-'||LA13_0=='\u00C1'||LA13_0=='\u00C9'||LA13_0=='\u00CD'||LA13_0=='\u00D3'||LA13_0=='\u00DA'||LA13_0=='\u00E1'||LA13_0=='\u00E9'||LA13_0=='\u00ED'||LA13_0=='\u00F3'||LA13_0=='\u00FA') ) {s = 16;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r') ) {s = 17;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=',')||LA13_0==':'||(LA13_0>='<' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='{'||(LA13_0>='}' && LA13_0<='\u00C0')||(LA13_0>='\u00C2' && LA13_0<='\u00C8')||(LA13_0>='\u00CA' && LA13_0<='\u00CC')||(LA13_0>='\u00CE' && LA13_0<='\u00D2')||(LA13_0>='\u00D4' && LA13_0<='\u00D9')||(LA13_0>='\u00DB' && LA13_0<='\u00E0')||(LA13_0>='\u00E2' && LA13_0<='\u00E8')||(LA13_0>='\u00EA' && LA13_0<='\u00EC')||(LA13_0>='\u00EE' && LA13_0<='\u00F2')||(LA13_0>='\u00F4' && LA13_0<='\u00F9')||(LA13_0>='\u00FB' && LA13_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_15 = input.LA(1);

                        s = -1;
                        if ( ((LA13_15>='\u0000' && LA13_15<='\uFFFF')) ) {s = 35;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}