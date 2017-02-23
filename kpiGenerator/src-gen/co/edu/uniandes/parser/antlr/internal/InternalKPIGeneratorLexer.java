package co.edu.uniandes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKPIGeneratorLexer extends Lexer {
    public static final int RULE_NEWLINE=11;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_DATEHOUR=9;
    public static final int RULE_ID=10;
    public static final int RULE_WS=14;
    public static final int RULE_CADENA=6;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_DATE=7;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=12;
    public static final int RULE_SEMICOLON=5;

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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:664:16: ( ';' )
            // InternalKPIGenerator.g:664:18: ';'
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

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:666:14: ( ( '\\n' | EOF ) )
            // InternalKPIGenerator.g:666:16: ( '\\n' | EOF )
            {
            // InternalKPIGenerator.g:666:16: ( '\\n' | EOF )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\n') ) {
                alt1=1;
            }
            else {
                alt1=2;}
            switch (alt1) {
                case 1 :
                    // InternalKPIGenerator.g:666:17: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:666:22: EOF
                    {
                    match(EOF); 

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
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_CADENA"
    public final void mRULE_CADENA() throws RecognitionException {
        try {
            int _type = RULE_CADENA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:668:13: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' )+ ( '0' .. '9' )* )+ )
            // InternalKPIGenerator.g:668:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' )+ ( '0' .. '9' )* )+
            {
            // InternalKPIGenerator.g:668:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' )+ ( '0' .. '9' )* )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==' '||(LA4_0>='-' && LA4_0<='.')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')||LA4_0=='|'||LA4_0=='\u00C1'||LA4_0=='\u00C9'||LA4_0=='\u00CD'||LA4_0=='\u00D3'||LA4_0=='\u00DA'||LA4_0=='\u00E1'||LA4_0=='\u00E9'||LA4_0=='\u00ED'||LA4_0=='\u00F3'||LA4_0=='\u00FA') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKPIGenerator.g:668:16: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' )+ ( '0' .. '9' )*
            	    {
            	    // InternalKPIGenerator.g:668:16: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==' '||(LA2_0>='-' && LA2_0<='.')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')||LA2_0=='|'||LA2_0=='\u00C1'||LA2_0=='\u00C9'||LA2_0=='\u00CD'||LA2_0=='\u00D3'||LA2_0=='\u00DA'||LA2_0=='\u00E1'||LA2_0=='\u00E9'||LA2_0=='\u00ED'||LA2_0=='\u00F3'||LA2_0=='\u00FA') ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalKPIGenerator.g:
            	    	    {
            	    	    if ( input.LA(1)==' '||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='\u00C1'||input.LA(1)=='\u00C9'||input.LA(1)=='\u00CD'||input.LA(1)=='\u00D3'||input.LA(1)=='\u00DA'||input.LA(1)=='\u00E1'||input.LA(1)=='\u00E9'||input.LA(1)=='\u00ED'||input.LA(1)=='\u00F3'||input.LA(1)=='\u00FA' ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    // InternalKPIGenerator.g:668:143: ( '0' .. '9' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalKPIGenerator.g:668:144: '0' .. '9'
            	    	    {
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


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
    // $ANTLR end "RULE_CADENA"

    // $ANTLR start "RULE_DATEHOUR"
    public final void mRULE_DATEHOUR() throws RecognitionException {
        try {
            int _type = RULE_DATEHOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:670:15: ( '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ' ' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' ' ' ( 'AM' | 'PM' ) )
            // InternalKPIGenerator.g:670:17: '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ' ' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' ' ' ( 'AM' | 'PM' )
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
            match(' '); 
            // InternalKPIGenerator.g:670:145: ( 'AM' | 'PM' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='A') ) {
                alt5=1;
            }
            else if ( (LA5_0=='P') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:670:146: 'AM'
                    {
                    match("AM"); 


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:670:151: 'PM'
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

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:672:11: ( '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalKPIGenerator.g:672:13: '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:674:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKPIGenerator.g:674:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKPIGenerator.g:674:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:674:11: '^'
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

            // InternalKPIGenerator.g:674:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
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
            	    break loop7;
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
            // InternalKPIGenerator.g:676:10: ( ( '0' .. '9' )+ )
            // InternalKPIGenerator.g:676:12: ( '0' .. '9' )+
            {
            // InternalKPIGenerator.g:676:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKPIGenerator.g:676:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // InternalKPIGenerator.g:678:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKPIGenerator.g:678:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKPIGenerator.g:678:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalKPIGenerator.g:678:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKPIGenerator.g:678:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalKPIGenerator.g:678:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIGenerator.g:678:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:678:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKPIGenerator.g:678:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalKPIGenerator.g:678:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIGenerator.g:678:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // InternalKPIGenerator.g:680:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKPIGenerator.g:680:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKPIGenerator.g:680:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKPIGenerator.g:680:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalKPIGenerator.g:682:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKPIGenerator.g:682:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKPIGenerator.g:682:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKPIGenerator.g:682:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalKPIGenerator.g:682:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKPIGenerator.g:682:41: ( '\\r' )? '\\n'
                    {
                    // InternalKPIGenerator.g:682:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalKPIGenerator.g:682:41: '\\r'
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
            // InternalKPIGenerator.g:684:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKPIGenerator.g:684:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKPIGenerator.g:684:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalKPIGenerator.g:686:16: ( . )
            // InternalKPIGenerator.g:686:18: .
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
        // InternalKPIGenerator.g:1:8: ( T__16 | T__17 | T__18 | T__19 | RULE_SEMICOLON | RULE_NEWLINE | RULE_CADENA | RULE_DATEHOUR | RULE_DATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=16;
        alt17 = dfa17.predict(input);
        switch (alt17) {
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
                // InternalKPIGenerator.g:1:34: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 6 :
                // InternalKPIGenerator.g:1:49: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 7 :
                // InternalKPIGenerator.g:1:62: RULE_CADENA
                {
                mRULE_CADENA(); 

                }
                break;
            case 8 :
                // InternalKPIGenerator.g:1:74: RULE_DATEHOUR
                {
                mRULE_DATEHOUR(); 

                }
                break;
            case 9 :
                // InternalKPIGenerator.g:1:88: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 10 :
                // InternalKPIGenerator.g:1:98: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // InternalKPIGenerator.g:1:106: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // InternalKPIGenerator.g:1:115: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalKPIGenerator.g:1:127: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // InternalKPIGenerator.g:1:143: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalKPIGenerator.g:1:159: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // InternalKPIGenerator.g:1:167: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\7\4\25\1\uffff\1\7\1\uffff\1\25\1\36\1\22\1\25\1\uffff\3\22\3\uffff\2\25\1\uffff\1\25\1\uffff\3\25\2\uffff\1\36\1\uffff\1\25\3\uffff\1\25\1\51\2\25\1\uffff\1\25\1\uffff\2\25\1\uffff\1\25\1\62\1\25\1\uffff\1\25\1\uffff\1\25\1\uffff\2\25\1\uffff\2\25\1\uffff\1\76\1\77\3\uffff\1\102\2\uffff";
    static final String DFA17_eofS =
        "\103\uffff";
    static final String DFA17_minS =
        "\1\0\4\60\1\uffff\1\11\1\uffff\2\60\1\101\1\11\1\uffff\2\0\1\52\3\uffff\2\60\1\uffff\1\60\1\uffff\3\60\2\uffff\1\57\1\uffff\1\11\3\uffff\1\60\1\40\4\60\1\uffff\4\60\1\40\1\60\1\57\1\60\1\uffff\10\60\2\40\1\60\2\uffff\1\40\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\4\172\1\uffff\1\40\1\uffff\1\172\1\71\1\172\1\40\1\uffff\2\uffff\1\57\3\uffff\2\172\1\uffff\1\172\1\uffff\3\172\2\uffff\1\57\1\uffff\1\40\3\uffff\1\172\1\u00fa\2\172\1\71\1\172\1\uffff\2\172\1\71\1\172\1\u00fa\1\172\1\57\1\172\1\uffff\1\172\1\71\2\172\1\71\2\172\1\71\2\u00fa\1\71\2\uffff\1\40\2\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\5\1\uffff\1\6\4\uffff\1\12\3\uffff\1\7\1\17\1\20\2\uffff\1\7\1\uffff\1\12\3\uffff\1\5\1\17\1\uffff\1\13\1\uffff\1\14\1\15\1\16\6\uffff\1\2\10\uffff\1\3\13\uffff\1\1\1\4\1\uffff\1\10\1\11";
    static final String DFA17_specialS =
        "\1\1\14\uffff\1\0\1\2\64\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\22\1\21\1\6\2\22\1\21\22\22\1\13\1\22\1\15\4\22\1\16\5\22\2\20\1\17\12\11\1\22\1\5\5\22\5\10\1\3\17\10\1\4\4\10\3\22\1\12\1\14\1\22\2\10\1\1\12\10\1\2\14\10\1\22\1\20\104\22\1\20\7\22\1\20\3\22\1\20\5\22\1\20\6\22\1\20\6\22\1\20\7\22\1\20\3\22\1\20\5\22\1\20\6\22\1\20\uff05\22",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\16\26\1\23\13\26",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\4\26\1\30\25\26",
            "\12\24\7\uffff\1\31\31\26\4\uffff\1\27\1\uffff\32\26",
            "\12\24\7\uffff\4\26\1\32\25\26\4\uffff\1\27\1\uffff\32\26",
            "",
            "\2\34\2\uffff\1\34\22\uffff\1\34",
            "",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\32\26",
            "\12\35",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "\2\34\2\uffff\1\34\22\uffff\1\37",
            "",
            "\0\40",
            "\0\40",
            "\1\41\4\uffff\1\42",
            "",
            "",
            "",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\14\26\1\43\15\26",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\32\26",
            "",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\32\26",
            "",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\26\26\1\44\3\26",
            "\12\24\7\uffff\13\26\1\45\16\26\4\uffff\1\27\1\uffff\32\26",
            "\12\24\7\uffff\21\26\1\46\10\26\4\uffff\1\27\1\uffff\32\26",
            "",
            "",
            "\1\47",
            "",
            "\2\34\2\uffff\1\34\22\uffff\1\37",
            "",
            "",
            "",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\17\26\1\50\12\26",
            "\1\25\14\uffff\2\25\1\uffff\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\32\26\1\uffff\1\25\104\uffff\1\25\7\uffff\1\25\3\uffff\1\25\5\uffff\1\25\6\uffff\1\25\6\uffff\1\25\7\uffff\1\25\3\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
            "\12\24\7\uffff\22\26\1\52\7\26\4\uffff\1\27\1\uffff\32\26",
            "\12\24\7\uffff\3\26\1\53\26\26\4\uffff\1\27\1\uffff\32\26",
            "\12\54",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\13\26\1\55\16\26",
            "",
            "\12\24\7\uffff\16\26\1\56\13\26\4\uffff\1\27\1\uffff\32\26",
            "\12\24\7\uffff\1\57\31\26\4\uffff\1\27\1\uffff\32\26",
            "\12\60",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\4\26\1\61\25\26",
            "\1\25\14\uffff\2\25\1\uffff\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\32\26\1\uffff\1\25\104\uffff\1\25\7\uffff\1\25\3\uffff\1\25\5\uffff\1\25\6\uffff\1\25\6\uffff\1\25\7\uffff\1\25\3\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
            "\12\24\7\uffff\3\26\1\63\26\26\4\uffff\1\27\1\uffff\32\26",
            "\1\64",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\23\26\1\65\6\26",
            "",
            "\12\24\7\uffff\4\26\1\66\25\26\4\uffff\1\27\1\uffff\32\26",
            "\12\67",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\4\26\1\70\25\26",
            "\12\24\7\uffff\21\26\1\71\10\26\4\uffff\1\27\1\uffff\32\26",
            "\12\72",
            "\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\3\26\1\73\26\26",
            "\12\24\7\uffff\16\26\1\74\13\26\4\uffff\1\27\1\uffff\32\26",
            "\12\75",
            "\1\25\14\uffff\2\25\1\uffff\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\32\26\1\uffff\1\25\104\uffff\1\25\7\uffff\1\25\3\uffff\1\25\5\uffff\1\25\6\uffff\1\25\6\uffff\1\25\7\uffff\1\25\3\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
            "\1\25\14\uffff\2\25\1\uffff\12\24\7\uffff\32\26\4\uffff\1\27\1\uffff\32\26\1\uffff\1\25\104\uffff\1\25\7\uffff\1\25\3\uffff\1\25\5\uffff\1\25\6\uffff\1\25\6\uffff\1\25\7\uffff\1\25\3\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
            "\12\100",
            "",
            "",
            "\1\101",
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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | RULE_SEMICOLON | RULE_NEWLINE | RULE_CADENA | RULE_DATEHOUR | RULE_DATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_13 = input.LA(1);

                        s = -1;
                        if ( ((LA17_13>='\u0000' && LA17_13<='\uFFFF')) ) {s = 32;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='c') ) {s = 1;}

                        else if ( (LA17_0=='n') ) {s = 2;}

                        else if ( (LA17_0=='F') ) {s = 3;}

                        else if ( (LA17_0=='V') ) {s = 4;}

                        else if ( (LA17_0==';') ) {s = 5;}

                        else if ( (LA17_0=='\n') ) {s = 6;}

                        else if ( ((LA17_0>='A' && LA17_0<='E')||(LA17_0>='G' && LA17_0<='U')||(LA17_0>='W' && LA17_0<='Z')||(LA17_0>='a' && LA17_0<='b')||(LA17_0>='d' && LA17_0<='m')||(LA17_0>='o' && LA17_0<='z')) ) {s = 8;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 9;}

                        else if ( (LA17_0=='^') ) {s = 10;}

                        else if ( (LA17_0==' ') ) {s = 11;}

                        else if ( (LA17_0=='_') ) {s = 12;}

                        else if ( (LA17_0=='\"') ) {s = 13;}

                        else if ( (LA17_0=='\'') ) {s = 14;}

                        else if ( (LA17_0=='/') ) {s = 15;}

                        else if ( ((LA17_0>='-' && LA17_0<='.')||LA17_0=='|'||LA17_0=='\u00C1'||LA17_0=='\u00C9'||LA17_0=='\u00CD'||LA17_0=='\u00D3'||LA17_0=='\u00DA'||LA17_0=='\u00E1'||LA17_0=='\u00E9'||LA17_0=='\u00ED'||LA17_0=='\u00F3'||LA17_0=='\u00FA') ) {s = 16;}

                        else if ( (LA17_0=='\t'||LA17_0=='\r') ) {s = 17;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<=',')||LA17_0==':'||(LA17_0>='<' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||LA17_0=='{'||(LA17_0>='}' && LA17_0<='\u00C0')||(LA17_0>='\u00C2' && LA17_0<='\u00C8')||(LA17_0>='\u00CA' && LA17_0<='\u00CC')||(LA17_0>='\u00CE' && LA17_0<='\u00D2')||(LA17_0>='\u00D4' && LA17_0<='\u00D9')||(LA17_0>='\u00DB' && LA17_0<='\u00E0')||(LA17_0>='\u00E2' && LA17_0<='\u00E8')||(LA17_0>='\u00EA' && LA17_0<='\u00EC')||(LA17_0>='\u00EE' && LA17_0<='\u00F2')||(LA17_0>='\u00F4' && LA17_0<='\u00F9')||(LA17_0>='\u00FB' && LA17_0<='\uFFFF')) ) {s = 18;}

                        else s = 7;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_14 = input.LA(1);

                        s = -1;
                        if ( ((LA17_14>='\u0000' && LA17_14<='\uFFFF')) ) {s = 32;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}