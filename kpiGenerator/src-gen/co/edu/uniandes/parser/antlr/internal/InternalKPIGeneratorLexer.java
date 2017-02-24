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
    public static final int RULE_ENDLINE=11;
    public static final int RULE_STRING=12;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_HOUR=9;
    public static final int RULE_ID=10;
    public static final int RULE_WS=15;
    public static final int RULE_CADENA=7;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_HEADER=4;
    public static final int RULE_DATE=8;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_SEMICOLON=6;
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

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:11:7: ( '\\r\\n' )
            // InternalKPIGenerator.g:11:9: '\\r\\n'
            {
            match("\r\n"); 


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
            // InternalKPIGenerator.g:12:7: ( 'completed' )
            // InternalKPIGenerator.g:12:9: 'completed'
            {
            match("completed"); 


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
            // InternalKPIGenerator.g:13:7: ( 'new' )
            // InternalKPIGenerator.g:13:9: 'new'
            {
            match("new"); 


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
            // InternalKPIGenerator.g:14:7: ( 'FALSO' )
            // InternalKPIGenerator.g:14:9: 'FALSO'
            {
            match("FALSO"); 


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
            // InternalKPIGenerator.g:15:7: ( 'VERDADERO' )
            // InternalKPIGenerator.g:15:9: 'VERDADERO'
            {
            match("VERDADERO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:773:16: ( ';' )
            // InternalKPIGenerator.g:773:18: ';'
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

    // $ANTLR start "RULE_ENDLINE"
    public final void mRULE_ENDLINE() throws RecognitionException {
        try {
            int _type = RULE_ENDLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:775:14: ( ( '\\r\\n' | EOF ) )
            // InternalKPIGenerator.g:775:16: ( '\\r\\n' | EOF )
            {
            // InternalKPIGenerator.g:775:16: ( '\\r\\n' | EOF )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            else {
                alt1=2;}
            switch (alt1) {
                case 1 :
                    // InternalKPIGenerator.g:775:17: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:775:24: EOF
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
    // $ANTLR end "RULE_ENDLINE"

    // $ANTLR start "RULE_CADENA"
    public final void mRULE_CADENA() throws RecognitionException {
        try {
            int _type = RULE_CADENA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:777:13: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' )+ ( '0' .. '9' )* )+ )
            // InternalKPIGenerator.g:777:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' )+ ( '0' .. '9' )* )+
            {
            // InternalKPIGenerator.g:777:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' )+ ( '0' .. '9' )* )+
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
            	    // InternalKPIGenerator.g:777:16: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' )+ ( '0' .. '9' )*
            	    {
            	    // InternalKPIGenerator.g:777:16: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00C1' | '\\u00E1' | '\\u00C9' | '\\u00E9' | '\\u00CD' | '\\u00ED' | '\\u00D3' | '\\u00F3' | '\\u00DA' | '\\u00FA' | '-' | ' ' | '|' | '.' )+
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

            	    // InternalKPIGenerator.g:777:143: ( '0' .. '9' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalKPIGenerator.g:777:144: '0' .. '9'
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

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:779:11: ( '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalKPIGenerator.g:779:13: '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
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

    // $ANTLR start "RULE_HOUR"
    public final void mRULE_HOUR() throws RecognitionException {
        try {
            int _type = RULE_HOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:781:11: ( ' ' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' ( ' AM' | ' PM' ) )
            // InternalKPIGenerator.g:781:13: ' ' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' ( ' AM' | ' PM' )
            {
            match(' '); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match(':'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            // InternalKPIGenerator.g:781:57: ( ' AM' | ' PM' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==' ') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='A') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='P') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:781:58: ' AM'
                    {
                    match(" AM"); 


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:781:64: ' PM'
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
    // $ANTLR end "RULE_HOUR"

    // $ANTLR start "RULE_HEADER"
    public final void mRULE_HEADER() throws RecognitionException {
        try {
            int _type = RULE_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:783:13: ( 'Task ID;Task List;Milestone;Task Name;Task Description;Start Date;Due Date;Priority;Private;Progress;Status;Status Text;Assigned To;Date Created;Created By Firstname;Created By Lastname;Completed Date;Completed By Firstname;Completed By Lastname;Time Logged Minutes;Billable Minutes;Parent Task;Completed On Time;Time Estimate;Tags' )
            // InternalKPIGenerator.g:783:15: 'Task ID;Task List;Milestone;Task Name;Task Description;Start Date;Due Date;Priority;Private;Progress;Status;Status Text;Assigned To;Date Created;Created By Firstname;Created By Lastname;Completed Date;Completed By Firstname;Completed By Lastname;Time Logged Minutes;Billable Minutes;Parent Task;Completed On Time;Time Estimate;Tags'
            {
            match("Task ID;Task List;Milestone;Task Name;Task Description;Start Date;Due Date;Priority;Private;Progress;Status;Status Text;Assigned To;Date Created;Created By Firstname;Created By Lastname;Completed Date;Completed By Firstname;Completed By Lastname;Time Logged Minutes;Billable Minutes;Parent Task;Completed On Time;Time Estimate;Tags"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEADER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIGenerator.g:785:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKPIGenerator.g:785:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKPIGenerator.g:785:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:785:11: '^'
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

            // InternalKPIGenerator.g:785:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalKPIGenerator.g:787:10: ( ( '0' .. '9' )+ )
            // InternalKPIGenerator.g:787:12: ( '0' .. '9' )+
            {
            // InternalKPIGenerator.g:787:12: ( '0' .. '9' )+
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
            	    // InternalKPIGenerator.g:787:13: '0' .. '9'
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
            // InternalKPIGenerator.g:789:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKPIGenerator.g:789:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKPIGenerator.g:789:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalKPIGenerator.g:789:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKPIGenerator.g:789:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalKPIGenerator.g:789:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIGenerator.g:789:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalKPIGenerator.g:789:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKPIGenerator.g:789:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalKPIGenerator.g:789:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIGenerator.g:789:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalKPIGenerator.g:791:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKPIGenerator.g:791:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKPIGenerator.g:791:24: ( options {greedy=false; } : . )*
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
            	    // InternalKPIGenerator.g:791:52: .
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
            // InternalKPIGenerator.g:793:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKPIGenerator.g:793:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKPIGenerator.g:793:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKPIGenerator.g:793:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKPIGenerator.g:793:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKPIGenerator.g:793:41: ( '\\r' )? '\\n'
                    {
                    // InternalKPIGenerator.g:793:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalKPIGenerator.g:793:41: '\\r'
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
            // InternalKPIGenerator.g:795:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKPIGenerator.g:795:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKPIGenerator.g:795:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalKPIGenerator.g:797:16: ( . )
            // InternalKPIGenerator.g:797:18: .
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
        // InternalKPIGenerator.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | RULE_SEMICOLON | RULE_ENDLINE | RULE_CADENA | RULE_DATE | RULE_HOUR | RULE_HEADER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=18;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalKPIGenerator.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalKPIGenerator.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalKPIGenerator.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalKPIGenerator.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalKPIGenerator.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalKPIGenerator.g:1:40: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 7 :
                // InternalKPIGenerator.g:1:55: RULE_ENDLINE
                {
                mRULE_ENDLINE(); 

                }
                break;
            case 8 :
                // InternalKPIGenerator.g:1:68: RULE_CADENA
                {
                mRULE_CADENA(); 

                }
                break;
            case 9 :
                // InternalKPIGenerator.g:1:80: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 10 :
                // InternalKPIGenerator.g:1:90: RULE_HOUR
                {
                mRULE_HOUR(); 

                }
                break;
            case 11 :
                // InternalKPIGenerator.g:1:100: RULE_HEADER
                {
                mRULE_HEADER(); 

                }
                break;
            case 12 :
                // InternalKPIGenerator.g:1:112: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // InternalKPIGenerator.g:1:120: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // InternalKPIGenerator.g:1:129: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // InternalKPIGenerator.g:1:141: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalKPIGenerator.g:1:157: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalKPIGenerator.g:1:173: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalKPIGenerator.g:1:181: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\7\1\25\4\27\2\uffff\1\27\1\42\2\27\1\23\2\uffff\3\23\2\uffff\1\47\1\uffff\1\27\1\uffff\2\27\1\uffff\3\27\1\uffff\2\27\1\42\1\uffff\1\27\4\uffff\1\27\1\60\3\27\1\uffff\2\27\1\uffff\2\27\1\uffff\2\27\1\72\3\27\1\uffff\7\27\1\uffff\1\105\1\106\2\uffff";
    static final String DFA17_eofS =
        "\107\uffff";
    static final String DFA17_minS =
        "\1\0\1\12\4\60\2\uffff\1\11\3\60\1\101\2\uffff\2\0\1\52\2\uffff\1\11\1\uffff\1\60\1\uffff\2\60\1\uffff\3\60\1\uffff\1\60\1\11\1\57\1\uffff\1\60\4\uffff\1\60\1\40\2\60\1\72\1\uffff\2\60\1\uffff\2\60\1\uffff\1\40\1\60\1\40\1\60\1\111\1\60\1\uffff\1\60\1\104\2\60\1\73\2\60\1\uffff\2\40\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\12\4\172\2\uffff\2\71\3\172\2\uffff\2\uffff\1\57\2\uffff\1\40\1\uffff\1\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\71\1\40\1\57\1\uffff\1\172\4\uffff\1\172\1\u00fa\2\172\1\72\1\uffff\2\172\1\uffff\2\172\1\uffff\2\172\1\u00fa\1\172\1\111\1\172\1\uffff\1\172\1\104\2\172\1\73\2\172\1\uffff\2\u00fa\2\uffff";
    static final String DFA17_acceptS =
        "\6\uffff\1\6\1\7\5\uffff\1\10\1\14\3\uffff\1\21\1\22\1\uffff\1\21\1\uffff\1\10\2\uffff\1\14\3\uffff\1\6\3\uffff\1\15\1\uffff\1\16\1\17\1\20\1\1\5\uffff\1\11\2\uffff\1\3\2\uffff\1\12\6\uffff\1\4\7\uffff\1\13\2\uffff\1\2\1\5";
    static final String DFA17_specialS =
        "\1\2\16\uffff\1\0\1\1\66\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\23\2\22\2\23\1\1\22\23\1\10\1\23\1\17\4\23\1\20\5\23\2\15\1\21\12\11\1\23\1\6\5\23\5\13\1\4\15\13\1\12\1\13\1\5\4\13\3\23\1\14\1\16\1\23\2\13\1\2\12\13\1\3\14\13\1\23\1\15\104\23\1\15\7\23\1\15\3\23\1\15\5\23\1\15\6\23\1\15\6\23\1\15\7\23\1\15\3\23\1\15\5\23\1\15\6\23\1\15\uff05\23",
            "\1\24",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\16\31\1\26\13\31",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\4\31\1\33\25\31",
            "\12\30\7\uffff\1\34\31\31\4\uffff\1\32\1\uffff\32\31",
            "\12\30\7\uffff\4\31\1\35\25\31\4\uffff\1\32\1\uffff\32\31",
            "",
            "",
            "\2\25\2\uffff\1\25\22\uffff\1\40\17\uffff\12\37",
            "\12\41",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\1\43\31\31",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\32\31",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\0\44",
            "\0\44",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "\2\25\2\uffff\1\25\22\uffff\1\25",
            "",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\14\31\1\50\15\31",
            "",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\32\31",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\32\31",
            "",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\26\31\1\51\3\31",
            "\12\30\7\uffff\13\31\1\52\16\31\4\uffff\1\32\1\uffff\32\31",
            "\12\30\7\uffff\21\31\1\53\10\31\4\uffff\1\32\1\uffff\32\31",
            "",
            "\12\54",
            "\2\25\2\uffff\1\25\22\uffff\1\40",
            "\1\55",
            "",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\22\31\1\56\7\31",
            "",
            "",
            "",
            "",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\17\31\1\57\12\31",
            "\1\27\14\uffff\2\27\1\uffff\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\32\31\1\uffff\1\27\104\uffff\1\27\7\uffff\1\27\3\uffff\1\27\5\uffff\1\27\6\uffff\1\27\6\uffff\1\27\7\uffff\1\27\3\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
            "\12\30\7\uffff\22\31\1\61\7\31\4\uffff\1\32\1\uffff\32\31",
            "\12\30\7\uffff\3\31\1\62\26\31\4\uffff\1\32\1\uffff\32\31",
            "\1\63",
            "",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\12\31\1\64\17\31",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\13\31\1\65\16\31",
            "",
            "\12\30\7\uffff\16\31\1\66\13\31\4\uffff\1\32\1\uffff\32\31",
            "\12\30\7\uffff\1\67\31\31\4\uffff\1\32\1\uffff\32\31",
            "",
            "\1\70\17\uffff\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\32\31",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\4\31\1\71\25\31",
            "\1\27\14\uffff\2\27\1\uffff\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\32\31\1\uffff\1\27\104\uffff\1\27\7\uffff\1\27\3\uffff\1\27\5\uffff\1\27\6\uffff\1\27\6\uffff\1\27\7\uffff\1\27\3\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
            "\12\30\7\uffff\3\31\1\73\26\31\4\uffff\1\32\1\uffff\32\31",
            "\1\74",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\23\31\1\75\6\31",
            "",
            "\12\30\7\uffff\4\31\1\76\25\31\4\uffff\1\32\1\uffff\32\31",
            "\1\77",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\4\31\1\100\25\31",
            "\12\30\7\uffff\21\31\1\101\10\31\4\uffff\1\32\1\uffff\32\31",
            "\1\102",
            "\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\3\31\1\103\26\31",
            "\12\30\7\uffff\16\31\1\104\13\31\4\uffff\1\32\1\uffff\32\31",
            "",
            "\1\27\14\uffff\2\27\1\uffff\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\32\31\1\uffff\1\27\104\uffff\1\27\7\uffff\1\27\3\uffff\1\27\5\uffff\1\27\6\uffff\1\27\6\uffff\1\27\7\uffff\1\27\3\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
            "\1\27\14\uffff\2\27\1\uffff\12\30\7\uffff\32\31\4\uffff\1\32\1\uffff\32\31\1\uffff\1\27\104\uffff\1\27\7\uffff\1\27\3\uffff\1\27\5\uffff\1\27\6\uffff\1\27\6\uffff\1\27\7\uffff\1\27\3\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | RULE_SEMICOLON | RULE_ENDLINE | RULE_CADENA | RULE_DATE | RULE_HOUR | RULE_HEADER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_15 = input.LA(1);

                        s = -1;
                        if ( ((LA17_15>='\u0000' && LA17_15<='\uFFFF')) ) {s = 36;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_16 = input.LA(1);

                        s = -1;
                        if ( ((LA17_16>='\u0000' && LA17_16<='\uFFFF')) ) {s = 36;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='\r') ) {s = 1;}

                        else if ( (LA17_0=='c') ) {s = 2;}

                        else if ( (LA17_0=='n') ) {s = 3;}

                        else if ( (LA17_0=='F') ) {s = 4;}

                        else if ( (LA17_0=='V') ) {s = 5;}

                        else if ( (LA17_0==';') ) {s = 6;}

                        else if ( (LA17_0==' ') ) {s = 8;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 9;}

                        else if ( (LA17_0=='T') ) {s = 10;}

                        else if ( ((LA17_0>='A' && LA17_0<='E')||(LA17_0>='G' && LA17_0<='S')||LA17_0=='U'||(LA17_0>='W' && LA17_0<='Z')||(LA17_0>='a' && LA17_0<='b')||(LA17_0>='d' && LA17_0<='m')||(LA17_0>='o' && LA17_0<='z')) ) {s = 11;}

                        else if ( (LA17_0=='^') ) {s = 12;}

                        else if ( ((LA17_0>='-' && LA17_0<='.')||LA17_0=='|'||LA17_0=='\u00C1'||LA17_0=='\u00C9'||LA17_0=='\u00CD'||LA17_0=='\u00D3'||LA17_0=='\u00DA'||LA17_0=='\u00E1'||LA17_0=='\u00E9'||LA17_0=='\u00ED'||LA17_0=='\u00F3'||LA17_0=='\u00FA') ) {s = 13;}

                        else if ( (LA17_0=='_') ) {s = 14;}

                        else if ( (LA17_0=='\"') ) {s = 15;}

                        else if ( (LA17_0=='\'') ) {s = 16;}

                        else if ( (LA17_0=='/') ) {s = 17;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')) ) {s = 18;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<=',')||LA17_0==':'||(LA17_0>='<' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||LA17_0=='{'||(LA17_0>='}' && LA17_0<='\u00C0')||(LA17_0>='\u00C2' && LA17_0<='\u00C8')||(LA17_0>='\u00CA' && LA17_0<='\u00CC')||(LA17_0>='\u00CE' && LA17_0<='\u00D2')||(LA17_0>='\u00D4' && LA17_0<='\u00D9')||(LA17_0>='\u00DB' && LA17_0<='\u00E0')||(LA17_0>='\u00E2' && LA17_0<='\u00E8')||(LA17_0>='\u00EA' && LA17_0<='\u00EC')||(LA17_0>='\u00EE' && LA17_0<='\u00F2')||(LA17_0>='\u00F4' && LA17_0<='\u00F9')||(LA17_0>='\u00FB' && LA17_0<='\uFFFF')) ) {s = 19;}

                        else s = 7;

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