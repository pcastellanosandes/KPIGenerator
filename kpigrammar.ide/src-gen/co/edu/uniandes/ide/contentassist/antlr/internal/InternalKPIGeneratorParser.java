package co.edu.uniandes.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co.edu.uniandes.services.KPIGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKPIGeneratorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_DATEHOUR", "RULE_CADENA", "RULE_INT", "RULE_DOUBLE", "RULE_SPACE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'['", "']'", "','", "'{\"name\":\"'", "'\",\"phases\":['", "']}'", "'\",\"tasks\":['", "'{\"id\":'", "',\"name\":\"'", "'\",\"useCase\":\"'", "'\",\"sequenceNumber\":'", "',\"startDate\":\"'", "'\",\"dueDate\":\"'", "'\",\"isPrivate\":'", "',\"progress\":'", "',\"status\":\"'", "'\",\"statusText\":\"'", "'\",\"assignedTo\":\"'", "'\",\"createdDate\":\"'", "'\",\"completedDate\":\"'", "'\",\"timeLoggedMin\":'", "',\"billableTime\":'", "',\"completedOnTime\":'", "',\"timeEstimated\":'", "',\"isReprocessedTask\":'", "',\"idParentTask\":'", "'}'"
    };
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SPACE=9;
    public static final int RULE_ID=10;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
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
    public static final int RULE_WS=14;
    public static final int RULE_CADENA=6;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalKPIGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKPIGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKPIGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKPIGenerator.g"; }


    	private KPIGeneratorGrammarAccess grammarAccess;

    	public void setGrammarAccess(KPIGeneratorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRoot"
    // InternalKPIGenerator.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:54:1: ( ruleRoot EOF )
            // InternalKPIGenerator.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalKPIGenerator.g:62:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:66:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalKPIGenerator.g:67:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalKPIGenerator.g:67:2: ( ( rule__Root__Group__0 ) )
            // InternalKPIGenerator.g:68:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalKPIGenerator.g:69:3: ( rule__Root__Group__0 )
            // InternalKPIGenerator.g:69:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleProject"
    // InternalKPIGenerator.g:78:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:79:1: ( ruleProject EOF )
            // InternalKPIGenerator.g:80:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalKPIGenerator.g:87:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:91:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalKPIGenerator.g:92:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalKPIGenerator.g:92:2: ( ( rule__Project__Group__0 ) )
            // InternalKPIGenerator.g:93:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalKPIGenerator.g:94:3: ( rule__Project__Group__0 )
            // InternalKPIGenerator.g:94:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRulePhase"
    // InternalKPIGenerator.g:103:1: entryRulePhase : rulePhase EOF ;
    public final void entryRulePhase() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:104:1: ( rulePhase EOF )
            // InternalKPIGenerator.g:105:1: rulePhase EOF
            {
             before(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getPhaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalKPIGenerator.g:112:1: rulePhase : ( ( rule__Phase__Group__0 ) ) ;
    public final void rulePhase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:116:2: ( ( ( rule__Phase__Group__0 ) ) )
            // InternalKPIGenerator.g:117:2: ( ( rule__Phase__Group__0 ) )
            {
            // InternalKPIGenerator.g:117:2: ( ( rule__Phase__Group__0 ) )
            // InternalKPIGenerator.g:118:3: ( rule__Phase__Group__0 )
            {
             before(grammarAccess.getPhaseAccess().getGroup()); 
            // InternalKPIGenerator.g:119:3: ( rule__Phase__Group__0 )
            // InternalKPIGenerator.g:119:4: rule__Phase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleTask"
    // InternalKPIGenerator.g:128:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:129:1: ( ruleTask EOF )
            // InternalKPIGenerator.g:130:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalKPIGenerator.g:137:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:141:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalKPIGenerator.g:142:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalKPIGenerator.g:142:2: ( ( rule__Task__Group__0 ) )
            // InternalKPIGenerator.g:143:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalKPIGenerator.g:144:3: ( rule__Task__Group__0 )
            // InternalKPIGenerator.g:144:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "rule__Task__StartDateAlternatives_10_0"
    // InternalKPIGenerator.g:152:1: rule__Task__StartDateAlternatives_10_0 : ( ( RULE_DATE ) | ( '-' ) );
    public final void rule__Task__StartDateAlternatives_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:156:1: ( ( RULE_DATE ) | ( '-' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DATE) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKPIGenerator.g:157:2: ( RULE_DATE )
                    {
                    // InternalKPIGenerator.g:157:2: ( RULE_DATE )
                    // InternalKPIGenerator.g:158:3: RULE_DATE
                    {
                     before(grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_10_0_0()); 
                    match(input,RULE_DATE,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_10_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:163:2: ( '-' )
                    {
                    // InternalKPIGenerator.g:163:2: ( '-' )
                    // InternalKPIGenerator.g:164:3: '-'
                    {
                     before(grammarAccess.getTaskAccess().getStartDateHyphenMinusKeyword_10_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getStartDateHyphenMinusKeyword_10_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__StartDateAlternatives_10_0"


    // $ANTLR start "rule__Task__DueDateAlternatives_12_0"
    // InternalKPIGenerator.g:173:1: rule__Task__DueDateAlternatives_12_0 : ( ( RULE_DATE ) | ( '-' ) );
    public final void rule__Task__DueDateAlternatives_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:177:1: ( ( RULE_DATE ) | ( '-' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DATE) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:178:2: ( RULE_DATE )
                    {
                    // InternalKPIGenerator.g:178:2: ( RULE_DATE )
                    // InternalKPIGenerator.g:179:3: RULE_DATE
                    {
                     before(grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_12_0_0()); 
                    match(input,RULE_DATE,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_12_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:184:2: ( '-' )
                    {
                    // InternalKPIGenerator.g:184:2: ( '-' )
                    // InternalKPIGenerator.g:185:3: '-'
                    {
                     before(grammarAccess.getTaskAccess().getDueDateHyphenMinusKeyword_12_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getDueDateHyphenMinusKeyword_12_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DueDateAlternatives_12_0"


    // $ANTLR start "rule__Task__CompletedDateAlternatives_26_0"
    // InternalKPIGenerator.g:194:1: rule__Task__CompletedDateAlternatives_26_0 : ( ( RULE_DATEHOUR ) | ( '-' ) );
    public final void rule__Task__CompletedDateAlternatives_26_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:198:1: ( ( RULE_DATEHOUR ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DATEHOUR) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:199:2: ( RULE_DATEHOUR )
                    {
                    // InternalKPIGenerator.g:199:2: ( RULE_DATEHOUR )
                    // InternalKPIGenerator.g:200:3: RULE_DATEHOUR
                    {
                     before(grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_26_0_0()); 
                    match(input,RULE_DATEHOUR,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_26_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:205:2: ( '-' )
                    {
                    // InternalKPIGenerator.g:205:2: ( '-' )
                    // InternalKPIGenerator.g:206:3: '-'
                    {
                     before(grammarAccess.getTaskAccess().getCompletedDateHyphenMinusKeyword_26_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getCompletedDateHyphenMinusKeyword_26_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedDateAlternatives_26_0"


    // $ANTLR start "rule__Root__Group__0"
    // InternalKPIGenerator.g:215:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:219:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalKPIGenerator.g:220:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalKPIGenerator.g:227:1: rule__Root__Group__0__Impl : ( '[' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:231:1: ( ( '[' ) )
            // InternalKPIGenerator.g:232:1: ( '[' )
            {
            // InternalKPIGenerator.g:232:1: ( '[' )
            // InternalKPIGenerator.g:233:2: '['
            {
             before(grammarAccess.getRootAccess().getLeftSquareBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalKPIGenerator.g:242:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:246:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalKPIGenerator.g:247:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalKPIGenerator.g:254:1: rule__Root__Group__1__Impl : ( ( rule__Root__ProjectsAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:258:1: ( ( ( rule__Root__ProjectsAssignment_1 ) ) )
            // InternalKPIGenerator.g:259:1: ( ( rule__Root__ProjectsAssignment_1 ) )
            {
            // InternalKPIGenerator.g:259:1: ( ( rule__Root__ProjectsAssignment_1 ) )
            // InternalKPIGenerator.g:260:2: ( rule__Root__ProjectsAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getProjectsAssignment_1()); 
            // InternalKPIGenerator.g:261:2: ( rule__Root__ProjectsAssignment_1 )
            // InternalKPIGenerator.g:261:3: rule__Root__ProjectsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Root__ProjectsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getProjectsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalKPIGenerator.g:269:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:273:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalKPIGenerator.g:274:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalKPIGenerator.g:281:1: rule__Root__Group__2__Impl : ( ( rule__Root__Group_2__0 )* ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:285:1: ( ( ( rule__Root__Group_2__0 )* ) )
            // InternalKPIGenerator.g:286:1: ( ( rule__Root__Group_2__0 )* )
            {
            // InternalKPIGenerator.g:286:1: ( ( rule__Root__Group_2__0 )* )
            // InternalKPIGenerator.g:287:2: ( rule__Root__Group_2__0 )*
            {
             before(grammarAccess.getRootAccess().getGroup_2()); 
            // InternalKPIGenerator.g:288:2: ( rule__Root__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKPIGenerator.g:288:3: rule__Root__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Root__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // InternalKPIGenerator.g:296:1: rule__Root__Group__3 : rule__Root__Group__3__Impl ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:300:1: ( rule__Root__Group__3__Impl )
            // InternalKPIGenerator.g:301:2: rule__Root__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // InternalKPIGenerator.g:307:1: rule__Root__Group__3__Impl : ( ']' ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:311:1: ( ( ']' ) )
            // InternalKPIGenerator.g:312:1: ( ']' )
            {
            // InternalKPIGenerator.g:312:1: ( ']' )
            // InternalKPIGenerator.g:313:2: ']'
            {
             before(grammarAccess.getRootAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group_2__0"
    // InternalKPIGenerator.g:323:1: rule__Root__Group_2__0 : rule__Root__Group_2__0__Impl rule__Root__Group_2__1 ;
    public final void rule__Root__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:327:1: ( rule__Root__Group_2__0__Impl rule__Root__Group_2__1 )
            // InternalKPIGenerator.g:328:2: rule__Root__Group_2__0__Impl rule__Root__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_2__0"


    // $ANTLR start "rule__Root__Group_2__0__Impl"
    // InternalKPIGenerator.g:335:1: rule__Root__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Root__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:339:1: ( ( ',' ) )
            // InternalKPIGenerator.g:340:1: ( ',' )
            {
            // InternalKPIGenerator.g:340:1: ( ',' )
            // InternalKPIGenerator.g:341:2: ','
            {
             before(grammarAccess.getRootAccess().getCommaKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_2__0__Impl"


    // $ANTLR start "rule__Root__Group_2__1"
    // InternalKPIGenerator.g:350:1: rule__Root__Group_2__1 : rule__Root__Group_2__1__Impl ;
    public final void rule__Root__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:354:1: ( rule__Root__Group_2__1__Impl )
            // InternalKPIGenerator.g:355:2: rule__Root__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_2__1"


    // $ANTLR start "rule__Root__Group_2__1__Impl"
    // InternalKPIGenerator.g:361:1: rule__Root__Group_2__1__Impl : ( ( rule__Root__ProjectsAssignment_2_1 ) ) ;
    public final void rule__Root__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:365:1: ( ( ( rule__Root__ProjectsAssignment_2_1 ) ) )
            // InternalKPIGenerator.g:366:1: ( ( rule__Root__ProjectsAssignment_2_1 ) )
            {
            // InternalKPIGenerator.g:366:1: ( ( rule__Root__ProjectsAssignment_2_1 ) )
            // InternalKPIGenerator.g:367:2: ( rule__Root__ProjectsAssignment_2_1 )
            {
             before(grammarAccess.getRootAccess().getProjectsAssignment_2_1()); 
            // InternalKPIGenerator.g:368:2: ( rule__Root__ProjectsAssignment_2_1 )
            // InternalKPIGenerator.g:368:3: rule__Root__ProjectsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Root__ProjectsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getProjectsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_2__1__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // InternalKPIGenerator.g:377:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:381:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalKPIGenerator.g:382:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalKPIGenerator.g:389:1: rule__Project__Group__0__Impl : ( () ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:393:1: ( ( () ) )
            // InternalKPIGenerator.g:394:1: ( () )
            {
            // InternalKPIGenerator.g:394:1: ( () )
            // InternalKPIGenerator.g:395:2: ()
            {
             before(grammarAccess.getProjectAccess().getProjectAction_0()); 
            // InternalKPIGenerator.g:396:2: ()
            // InternalKPIGenerator.g:396:3: 
            {
            }

             after(grammarAccess.getProjectAccess().getProjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalKPIGenerator.g:404:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:408:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalKPIGenerator.g:409:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalKPIGenerator.g:416:1: rule__Project__Group__1__Impl : ( '{\"name\":\"' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:420:1: ( ( '{\"name\":\"' ) )
            // InternalKPIGenerator.g:421:1: ( '{\"name\":\"' )
            {
            // InternalKPIGenerator.g:421:1: ( '{\"name\":\"' )
            // InternalKPIGenerator.g:422:2: '{\"name\":\"'
            {
             before(grammarAccess.getProjectAccess().getNameKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalKPIGenerator.g:431:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:435:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalKPIGenerator.g:436:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalKPIGenerator.g:443:1: rule__Project__Group__2__Impl : ( ( rule__Project__ProjectNameAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:447:1: ( ( ( rule__Project__ProjectNameAssignment_2 ) ) )
            // InternalKPIGenerator.g:448:1: ( ( rule__Project__ProjectNameAssignment_2 ) )
            {
            // InternalKPIGenerator.g:448:1: ( ( rule__Project__ProjectNameAssignment_2 ) )
            // InternalKPIGenerator.g:449:2: ( rule__Project__ProjectNameAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getProjectNameAssignment_2()); 
            // InternalKPIGenerator.g:450:2: ( rule__Project__ProjectNameAssignment_2 )
            // InternalKPIGenerator.g:450:3: rule__Project__ProjectNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Project__ProjectNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getProjectNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalKPIGenerator.g:458:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:462:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalKPIGenerator.g:463:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalKPIGenerator.g:470:1: rule__Project__Group__3__Impl : ( '\",\"phases\":[' ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:474:1: ( ( '\",\"phases\":[' ) )
            // InternalKPIGenerator.g:475:1: ( '\",\"phases\":[' )
            {
            // InternalKPIGenerator.g:475:1: ( '\",\"phases\":[' )
            // InternalKPIGenerator.g:476:2: '\",\"phases\":['
            {
             before(grammarAccess.getProjectAccess().getPhasesKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getPhasesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalKPIGenerator.g:485:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:489:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalKPIGenerator.g:490:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalKPIGenerator.g:497:1: rule__Project__Group__4__Impl : ( ( rule__Project__PhasesAssignment_4 ) ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:501:1: ( ( ( rule__Project__PhasesAssignment_4 ) ) )
            // InternalKPIGenerator.g:502:1: ( ( rule__Project__PhasesAssignment_4 ) )
            {
            // InternalKPIGenerator.g:502:1: ( ( rule__Project__PhasesAssignment_4 ) )
            // InternalKPIGenerator.g:503:2: ( rule__Project__PhasesAssignment_4 )
            {
             before(grammarAccess.getProjectAccess().getPhasesAssignment_4()); 
            // InternalKPIGenerator.g:504:2: ( rule__Project__PhasesAssignment_4 )
            // InternalKPIGenerator.g:504:3: rule__Project__PhasesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Project__PhasesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getPhasesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // InternalKPIGenerator.g:512:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:516:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalKPIGenerator.g:517:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // InternalKPIGenerator.g:524:1: rule__Project__Group__5__Impl : ( ( rule__Project__Group_5__0 )* ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:528:1: ( ( ( rule__Project__Group_5__0 )* ) )
            // InternalKPIGenerator.g:529:1: ( ( rule__Project__Group_5__0 )* )
            {
            // InternalKPIGenerator.g:529:1: ( ( rule__Project__Group_5__0 )* )
            // InternalKPIGenerator.g:530:2: ( rule__Project__Group_5__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_5()); 
            // InternalKPIGenerator.g:531:2: ( rule__Project__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKPIGenerator.g:531:3: rule__Project__Group_5__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Project__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // InternalKPIGenerator.g:539:1: rule__Project__Group__6 : rule__Project__Group__6__Impl ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:543:1: ( rule__Project__Group__6__Impl )
            // InternalKPIGenerator.g:544:2: rule__Project__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // InternalKPIGenerator.g:550:1: rule__Project__Group__6__Impl : ( ']}' ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:554:1: ( ( ']}' ) )
            // InternalKPIGenerator.g:555:1: ( ']}' )
            {
            // InternalKPIGenerator.g:555:1: ( ']}' )
            // InternalKPIGenerator.g:556:2: ']}'
            {
             before(grammarAccess.getProjectAccess().getRightSquareBracketRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightSquareBracketRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group_5__0"
    // InternalKPIGenerator.g:566:1: rule__Project__Group_5__0 : rule__Project__Group_5__0__Impl rule__Project__Group_5__1 ;
    public final void rule__Project__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:570:1: ( rule__Project__Group_5__0__Impl rule__Project__Group_5__1 )
            // InternalKPIGenerator.g:571:2: rule__Project__Group_5__0__Impl rule__Project__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__0"


    // $ANTLR start "rule__Project__Group_5__0__Impl"
    // InternalKPIGenerator.g:578:1: rule__Project__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:582:1: ( ( ',' ) )
            // InternalKPIGenerator.g:583:1: ( ',' )
            {
            // InternalKPIGenerator.g:583:1: ( ',' )
            // InternalKPIGenerator.g:584:2: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__0__Impl"


    // $ANTLR start "rule__Project__Group_5__1"
    // InternalKPIGenerator.g:593:1: rule__Project__Group_5__1 : rule__Project__Group_5__1__Impl ;
    public final void rule__Project__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:597:1: ( rule__Project__Group_5__1__Impl )
            // InternalKPIGenerator.g:598:2: rule__Project__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__1"


    // $ANTLR start "rule__Project__Group_5__1__Impl"
    // InternalKPIGenerator.g:604:1: rule__Project__Group_5__1__Impl : ( ( rule__Project__PhasesAssignment_5_1 ) ) ;
    public final void rule__Project__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:608:1: ( ( ( rule__Project__PhasesAssignment_5_1 ) ) )
            // InternalKPIGenerator.g:609:1: ( ( rule__Project__PhasesAssignment_5_1 ) )
            {
            // InternalKPIGenerator.g:609:1: ( ( rule__Project__PhasesAssignment_5_1 ) )
            // InternalKPIGenerator.g:610:2: ( rule__Project__PhasesAssignment_5_1 )
            {
             before(grammarAccess.getProjectAccess().getPhasesAssignment_5_1()); 
            // InternalKPIGenerator.g:611:2: ( rule__Project__PhasesAssignment_5_1 )
            // InternalKPIGenerator.g:611:3: rule__Project__PhasesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__PhasesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getPhasesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__1__Impl"


    // $ANTLR start "rule__Phase__Group__0"
    // InternalKPIGenerator.g:620:1: rule__Phase__Group__0 : rule__Phase__Group__0__Impl rule__Phase__Group__1 ;
    public final void rule__Phase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:624:1: ( rule__Phase__Group__0__Impl rule__Phase__Group__1 )
            // InternalKPIGenerator.g:625:2: rule__Phase__Group__0__Impl rule__Phase__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Phase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__0"


    // $ANTLR start "rule__Phase__Group__0__Impl"
    // InternalKPIGenerator.g:632:1: rule__Phase__Group__0__Impl : ( () ) ;
    public final void rule__Phase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:636:1: ( ( () ) )
            // InternalKPIGenerator.g:637:1: ( () )
            {
            // InternalKPIGenerator.g:637:1: ( () )
            // InternalKPIGenerator.g:638:2: ()
            {
             before(grammarAccess.getPhaseAccess().getPhaseAction_0()); 
            // InternalKPIGenerator.g:639:2: ()
            // InternalKPIGenerator.g:639:3: 
            {
            }

             after(grammarAccess.getPhaseAccess().getPhaseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__0__Impl"


    // $ANTLR start "rule__Phase__Group__1"
    // InternalKPIGenerator.g:647:1: rule__Phase__Group__1 : rule__Phase__Group__1__Impl rule__Phase__Group__2 ;
    public final void rule__Phase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:651:1: ( rule__Phase__Group__1__Impl rule__Phase__Group__2 )
            // InternalKPIGenerator.g:652:2: rule__Phase__Group__1__Impl rule__Phase__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Phase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__1"


    // $ANTLR start "rule__Phase__Group__1__Impl"
    // InternalKPIGenerator.g:659:1: rule__Phase__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__Phase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:663:1: ( ( ( ',' )? ) )
            // InternalKPIGenerator.g:664:1: ( ( ',' )? )
            {
            // InternalKPIGenerator.g:664:1: ( ( ',' )? )
            // InternalKPIGenerator.g:665:2: ( ',' )?
            {
             before(grammarAccess.getPhaseAccess().getCommaKeyword_1()); 
            // InternalKPIGenerator.g:666:2: ( ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:666:3: ','
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPhaseAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__1__Impl"


    // $ANTLR start "rule__Phase__Group__2"
    // InternalKPIGenerator.g:674:1: rule__Phase__Group__2 : rule__Phase__Group__2__Impl rule__Phase__Group__3 ;
    public final void rule__Phase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:678:1: ( rule__Phase__Group__2__Impl rule__Phase__Group__3 )
            // InternalKPIGenerator.g:679:2: rule__Phase__Group__2__Impl rule__Phase__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Phase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__2"


    // $ANTLR start "rule__Phase__Group__2__Impl"
    // InternalKPIGenerator.g:686:1: rule__Phase__Group__2__Impl : ( '{\"name\":\"' ) ;
    public final void rule__Phase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:690:1: ( ( '{\"name\":\"' ) )
            // InternalKPIGenerator.g:691:1: ( '{\"name\":\"' )
            {
            // InternalKPIGenerator.g:691:1: ( '{\"name\":\"' )
            // InternalKPIGenerator.g:692:2: '{\"name\":\"'
            {
             before(grammarAccess.getPhaseAccess().getNameKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__2__Impl"


    // $ANTLR start "rule__Phase__Group__3"
    // InternalKPIGenerator.g:701:1: rule__Phase__Group__3 : rule__Phase__Group__3__Impl rule__Phase__Group__4 ;
    public final void rule__Phase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:705:1: ( rule__Phase__Group__3__Impl rule__Phase__Group__4 )
            // InternalKPIGenerator.g:706:2: rule__Phase__Group__3__Impl rule__Phase__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Phase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__3"


    // $ANTLR start "rule__Phase__Group__3__Impl"
    // InternalKPIGenerator.g:713:1: rule__Phase__Group__3__Impl : ( ( rule__Phase__PhaseNameAssignment_3 ) ) ;
    public final void rule__Phase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:717:1: ( ( ( rule__Phase__PhaseNameAssignment_3 ) ) )
            // InternalKPIGenerator.g:718:1: ( ( rule__Phase__PhaseNameAssignment_3 ) )
            {
            // InternalKPIGenerator.g:718:1: ( ( rule__Phase__PhaseNameAssignment_3 ) )
            // InternalKPIGenerator.g:719:2: ( rule__Phase__PhaseNameAssignment_3 )
            {
             before(grammarAccess.getPhaseAccess().getPhaseNameAssignment_3()); 
            // InternalKPIGenerator.g:720:2: ( rule__Phase__PhaseNameAssignment_3 )
            // InternalKPIGenerator.g:720:3: rule__Phase__PhaseNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Phase__PhaseNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getPhaseNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__3__Impl"


    // $ANTLR start "rule__Phase__Group__4"
    // InternalKPIGenerator.g:728:1: rule__Phase__Group__4 : rule__Phase__Group__4__Impl rule__Phase__Group__5 ;
    public final void rule__Phase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:732:1: ( rule__Phase__Group__4__Impl rule__Phase__Group__5 )
            // InternalKPIGenerator.g:733:2: rule__Phase__Group__4__Impl rule__Phase__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Phase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__4"


    // $ANTLR start "rule__Phase__Group__4__Impl"
    // InternalKPIGenerator.g:740:1: rule__Phase__Group__4__Impl : ( '\",\"tasks\":[' ) ;
    public final void rule__Phase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:744:1: ( ( '\",\"tasks\":[' ) )
            // InternalKPIGenerator.g:745:1: ( '\",\"tasks\":[' )
            {
            // InternalKPIGenerator.g:745:1: ( '\",\"tasks\":[' )
            // InternalKPIGenerator.g:746:2: '\",\"tasks\":['
            {
             before(grammarAccess.getPhaseAccess().getTasksKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getTasksKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__4__Impl"


    // $ANTLR start "rule__Phase__Group__5"
    // InternalKPIGenerator.g:755:1: rule__Phase__Group__5 : rule__Phase__Group__5__Impl rule__Phase__Group__6 ;
    public final void rule__Phase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:759:1: ( rule__Phase__Group__5__Impl rule__Phase__Group__6 )
            // InternalKPIGenerator.g:760:2: rule__Phase__Group__5__Impl rule__Phase__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Phase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__5"


    // $ANTLR start "rule__Phase__Group__5__Impl"
    // InternalKPIGenerator.g:767:1: rule__Phase__Group__5__Impl : ( ( rule__Phase__TasksAssignment_5 ) ) ;
    public final void rule__Phase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:771:1: ( ( ( rule__Phase__TasksAssignment_5 ) ) )
            // InternalKPIGenerator.g:772:1: ( ( rule__Phase__TasksAssignment_5 ) )
            {
            // InternalKPIGenerator.g:772:1: ( ( rule__Phase__TasksAssignment_5 ) )
            // InternalKPIGenerator.g:773:2: ( rule__Phase__TasksAssignment_5 )
            {
             before(grammarAccess.getPhaseAccess().getTasksAssignment_5()); 
            // InternalKPIGenerator.g:774:2: ( rule__Phase__TasksAssignment_5 )
            // InternalKPIGenerator.g:774:3: rule__Phase__TasksAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Phase__TasksAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getTasksAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__5__Impl"


    // $ANTLR start "rule__Phase__Group__6"
    // InternalKPIGenerator.g:782:1: rule__Phase__Group__6 : rule__Phase__Group__6__Impl rule__Phase__Group__7 ;
    public final void rule__Phase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:786:1: ( rule__Phase__Group__6__Impl rule__Phase__Group__7 )
            // InternalKPIGenerator.g:787:2: rule__Phase__Group__6__Impl rule__Phase__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Phase__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__6"


    // $ANTLR start "rule__Phase__Group__6__Impl"
    // InternalKPIGenerator.g:794:1: rule__Phase__Group__6__Impl : ( ( rule__Phase__Group_6__0 )* ) ;
    public final void rule__Phase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:798:1: ( ( ( rule__Phase__Group_6__0 )* ) )
            // InternalKPIGenerator.g:799:1: ( ( rule__Phase__Group_6__0 )* )
            {
            // InternalKPIGenerator.g:799:1: ( ( rule__Phase__Group_6__0 )* )
            // InternalKPIGenerator.g:800:2: ( rule__Phase__Group_6__0 )*
            {
             before(grammarAccess.getPhaseAccess().getGroup_6()); 
            // InternalKPIGenerator.g:801:2: ( rule__Phase__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKPIGenerator.g:801:3: rule__Phase__Group_6__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Phase__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPhaseAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__6__Impl"


    // $ANTLR start "rule__Phase__Group__7"
    // InternalKPIGenerator.g:809:1: rule__Phase__Group__7 : rule__Phase__Group__7__Impl ;
    public final void rule__Phase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:813:1: ( rule__Phase__Group__7__Impl )
            // InternalKPIGenerator.g:814:2: rule__Phase__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__7"


    // $ANTLR start "rule__Phase__Group__7__Impl"
    // InternalKPIGenerator.g:820:1: rule__Phase__Group__7__Impl : ( ']}' ) ;
    public final void rule__Phase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:824:1: ( ( ']}' ) )
            // InternalKPIGenerator.g:825:1: ( ']}' )
            {
            // InternalKPIGenerator.g:825:1: ( ']}' )
            // InternalKPIGenerator.g:826:2: ']}'
            {
             before(grammarAccess.getPhaseAccess().getRightSquareBracketRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getRightSquareBracketRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__7__Impl"


    // $ANTLR start "rule__Phase__Group_6__0"
    // InternalKPIGenerator.g:836:1: rule__Phase__Group_6__0 : rule__Phase__Group_6__0__Impl rule__Phase__Group_6__1 ;
    public final void rule__Phase__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:840:1: ( rule__Phase__Group_6__0__Impl rule__Phase__Group_6__1 )
            // InternalKPIGenerator.g:841:2: rule__Phase__Group_6__0__Impl rule__Phase__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Phase__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group_6__0"


    // $ANTLR start "rule__Phase__Group_6__0__Impl"
    // InternalKPIGenerator.g:848:1: rule__Phase__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Phase__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:852:1: ( ( ',' ) )
            // InternalKPIGenerator.g:853:1: ( ',' )
            {
            // InternalKPIGenerator.g:853:1: ( ',' )
            // InternalKPIGenerator.g:854:2: ','
            {
             before(grammarAccess.getPhaseAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group_6__0__Impl"


    // $ANTLR start "rule__Phase__Group_6__1"
    // InternalKPIGenerator.g:863:1: rule__Phase__Group_6__1 : rule__Phase__Group_6__1__Impl ;
    public final void rule__Phase__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:867:1: ( rule__Phase__Group_6__1__Impl )
            // InternalKPIGenerator.g:868:2: rule__Phase__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group_6__1"


    // $ANTLR start "rule__Phase__Group_6__1__Impl"
    // InternalKPIGenerator.g:874:1: rule__Phase__Group_6__1__Impl : ( ( rule__Phase__TasksAssignment_6_1 ) ) ;
    public final void rule__Phase__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:878:1: ( ( ( rule__Phase__TasksAssignment_6_1 ) ) )
            // InternalKPIGenerator.g:879:1: ( ( rule__Phase__TasksAssignment_6_1 ) )
            {
            // InternalKPIGenerator.g:879:1: ( ( rule__Phase__TasksAssignment_6_1 ) )
            // InternalKPIGenerator.g:880:2: ( rule__Phase__TasksAssignment_6_1 )
            {
             before(grammarAccess.getPhaseAccess().getTasksAssignment_6_1()); 
            // InternalKPIGenerator.g:881:2: ( rule__Phase__TasksAssignment_6_1 )
            // InternalKPIGenerator.g:881:3: rule__Phase__TasksAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Phase__TasksAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getTasksAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group_6__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalKPIGenerator.g:890:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:894:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalKPIGenerator.g:895:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalKPIGenerator.g:902:1: rule__Task__Group__0__Impl : ( () ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:906:1: ( ( () ) )
            // InternalKPIGenerator.g:907:1: ( () )
            {
            // InternalKPIGenerator.g:907:1: ( () )
            // InternalKPIGenerator.g:908:2: ()
            {
             before(grammarAccess.getTaskAccess().getTaskAction_0()); 
            // InternalKPIGenerator.g:909:2: ()
            // InternalKPIGenerator.g:909:3: 
            {
            }

             after(grammarAccess.getTaskAccess().getTaskAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalKPIGenerator.g:917:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:921:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalKPIGenerator.g:922:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalKPIGenerator.g:929:1: rule__Task__Group__1__Impl : ( '{\"id\":' ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:933:1: ( ( '{\"id\":' ) )
            // InternalKPIGenerator.g:934:1: ( '{\"id\":' )
            {
            // InternalKPIGenerator.g:934:1: ( '{\"id\":' )
            // InternalKPIGenerator.g:935:2: '{\"id\":'
            {
             before(grammarAccess.getTaskAccess().getIdKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalKPIGenerator.g:944:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:948:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalKPIGenerator.g:949:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalKPIGenerator.g:956:1: rule__Task__Group__2__Impl : ( ( rule__Task__TaskIdAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:960:1: ( ( ( rule__Task__TaskIdAssignment_2 ) ) )
            // InternalKPIGenerator.g:961:1: ( ( rule__Task__TaskIdAssignment_2 ) )
            {
            // InternalKPIGenerator.g:961:1: ( ( rule__Task__TaskIdAssignment_2 ) )
            // InternalKPIGenerator.g:962:2: ( rule__Task__TaskIdAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getTaskIdAssignment_2()); 
            // InternalKPIGenerator.g:963:2: ( rule__Task__TaskIdAssignment_2 )
            // InternalKPIGenerator.g:963:3: rule__Task__TaskIdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__TaskIdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTaskIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalKPIGenerator.g:971:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:975:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalKPIGenerator.g:976:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalKPIGenerator.g:983:1: rule__Task__Group__3__Impl : ( ',\"name\":\"' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:987:1: ( ( ',\"name\":\"' ) )
            // InternalKPIGenerator.g:988:1: ( ',\"name\":\"' )
            {
            // InternalKPIGenerator.g:988:1: ( ',\"name\":\"' )
            // InternalKPIGenerator.g:989:2: ',\"name\":\"'
            {
             before(grammarAccess.getTaskAccess().getNameKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalKPIGenerator.g:998:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1002:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalKPIGenerator.g:1003:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalKPIGenerator.g:1010:1: rule__Task__Group__4__Impl : ( ( rule__Task__TaskNameAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1014:1: ( ( ( rule__Task__TaskNameAssignment_4 ) ) )
            // InternalKPIGenerator.g:1015:1: ( ( rule__Task__TaskNameAssignment_4 ) )
            {
            // InternalKPIGenerator.g:1015:1: ( ( rule__Task__TaskNameAssignment_4 ) )
            // InternalKPIGenerator.g:1016:2: ( rule__Task__TaskNameAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getTaskNameAssignment_4()); 
            // InternalKPIGenerator.g:1017:2: ( rule__Task__TaskNameAssignment_4 )
            // InternalKPIGenerator.g:1017:3: rule__Task__TaskNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Task__TaskNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTaskNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalKPIGenerator.g:1025:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1029:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalKPIGenerator.g:1030:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalKPIGenerator.g:1037:1: rule__Task__Group__5__Impl : ( '\",\"useCase\":\"' ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1041:1: ( ( '\",\"useCase\":\"' ) )
            // InternalKPIGenerator.g:1042:1: ( '\",\"useCase\":\"' )
            {
            // InternalKPIGenerator.g:1042:1: ( '\",\"useCase\":\"' )
            // InternalKPIGenerator.g:1043:2: '\",\"useCase\":\"'
            {
             before(grammarAccess.getTaskAccess().getUseCaseKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getUseCaseKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalKPIGenerator.g:1052:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1056:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalKPIGenerator.g:1057:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalKPIGenerator.g:1064:1: rule__Task__Group__6__Impl : ( ( rule__Task__UseCaseAssignment_6 ) ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1068:1: ( ( ( rule__Task__UseCaseAssignment_6 ) ) )
            // InternalKPIGenerator.g:1069:1: ( ( rule__Task__UseCaseAssignment_6 ) )
            {
            // InternalKPIGenerator.g:1069:1: ( ( rule__Task__UseCaseAssignment_6 ) )
            // InternalKPIGenerator.g:1070:2: ( rule__Task__UseCaseAssignment_6 )
            {
             before(grammarAccess.getTaskAccess().getUseCaseAssignment_6()); 
            // InternalKPIGenerator.g:1071:2: ( rule__Task__UseCaseAssignment_6 )
            // InternalKPIGenerator.g:1071:3: rule__Task__UseCaseAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Task__UseCaseAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getUseCaseAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__7"
    // InternalKPIGenerator.g:1079:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1083:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalKPIGenerator.g:1084:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Task__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7"


    // $ANTLR start "rule__Task__Group__7__Impl"
    // InternalKPIGenerator.g:1091:1: rule__Task__Group__7__Impl : ( '\",\"sequenceNumber\":' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1095:1: ( ( '\",\"sequenceNumber\":' ) )
            // InternalKPIGenerator.g:1096:1: ( '\",\"sequenceNumber\":' )
            {
            // InternalKPIGenerator.g:1096:1: ( '\",\"sequenceNumber\":' )
            // InternalKPIGenerator.g:1097:2: '\",\"sequenceNumber\":'
            {
             before(grammarAccess.getTaskAccess().getSequenceNumberKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSequenceNumberKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7__Impl"


    // $ANTLR start "rule__Task__Group__8"
    // InternalKPIGenerator.g:1106:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1110:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalKPIGenerator.g:1111:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Task__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8"


    // $ANTLR start "rule__Task__Group__8__Impl"
    // InternalKPIGenerator.g:1118:1: rule__Task__Group__8__Impl : ( ( rule__Task__SequenceNumberAssignment_8 ) ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1122:1: ( ( ( rule__Task__SequenceNumberAssignment_8 ) ) )
            // InternalKPIGenerator.g:1123:1: ( ( rule__Task__SequenceNumberAssignment_8 ) )
            {
            // InternalKPIGenerator.g:1123:1: ( ( rule__Task__SequenceNumberAssignment_8 ) )
            // InternalKPIGenerator.g:1124:2: ( rule__Task__SequenceNumberAssignment_8 )
            {
             before(grammarAccess.getTaskAccess().getSequenceNumberAssignment_8()); 
            // InternalKPIGenerator.g:1125:2: ( rule__Task__SequenceNumberAssignment_8 )
            // InternalKPIGenerator.g:1125:3: rule__Task__SequenceNumberAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Task__SequenceNumberAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSequenceNumberAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8__Impl"


    // $ANTLR start "rule__Task__Group__9"
    // InternalKPIGenerator.g:1133:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1137:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalKPIGenerator.g:1138:2: rule__Task__Group__9__Impl rule__Task__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Task__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9"


    // $ANTLR start "rule__Task__Group__9__Impl"
    // InternalKPIGenerator.g:1145:1: rule__Task__Group__9__Impl : ( ',\"startDate\":\"' ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1149:1: ( ( ',\"startDate\":\"' ) )
            // InternalKPIGenerator.g:1150:1: ( ',\"startDate\":\"' )
            {
            // InternalKPIGenerator.g:1150:1: ( ',\"startDate\":\"' )
            // InternalKPIGenerator.g:1151:2: ',\"startDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getStartDateKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStartDateKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9__Impl"


    // $ANTLR start "rule__Task__Group__10"
    // InternalKPIGenerator.g:1160:1: rule__Task__Group__10 : rule__Task__Group__10__Impl rule__Task__Group__11 ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1164:1: ( rule__Task__Group__10__Impl rule__Task__Group__11 )
            // InternalKPIGenerator.g:1165:2: rule__Task__Group__10__Impl rule__Task__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Task__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__10"


    // $ANTLR start "rule__Task__Group__10__Impl"
    // InternalKPIGenerator.g:1172:1: rule__Task__Group__10__Impl : ( ( rule__Task__StartDateAssignment_10 ) ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1176:1: ( ( ( rule__Task__StartDateAssignment_10 ) ) )
            // InternalKPIGenerator.g:1177:1: ( ( rule__Task__StartDateAssignment_10 ) )
            {
            // InternalKPIGenerator.g:1177:1: ( ( rule__Task__StartDateAssignment_10 ) )
            // InternalKPIGenerator.g:1178:2: ( rule__Task__StartDateAssignment_10 )
            {
             before(grammarAccess.getTaskAccess().getStartDateAssignment_10()); 
            // InternalKPIGenerator.g:1179:2: ( rule__Task__StartDateAssignment_10 )
            // InternalKPIGenerator.g:1179:3: rule__Task__StartDateAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Task__StartDateAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStartDateAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__10__Impl"


    // $ANTLR start "rule__Task__Group__11"
    // InternalKPIGenerator.g:1187:1: rule__Task__Group__11 : rule__Task__Group__11__Impl rule__Task__Group__12 ;
    public final void rule__Task__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1191:1: ( rule__Task__Group__11__Impl rule__Task__Group__12 )
            // InternalKPIGenerator.g:1192:2: rule__Task__Group__11__Impl rule__Task__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Task__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__11"


    // $ANTLR start "rule__Task__Group__11__Impl"
    // InternalKPIGenerator.g:1199:1: rule__Task__Group__11__Impl : ( '\",\"dueDate\":\"' ) ;
    public final void rule__Task__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1203:1: ( ( '\",\"dueDate\":\"' ) )
            // InternalKPIGenerator.g:1204:1: ( '\",\"dueDate\":\"' )
            {
            // InternalKPIGenerator.g:1204:1: ( '\",\"dueDate\":\"' )
            // InternalKPIGenerator.g:1205:2: '\",\"dueDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getDueDateKeyword_11()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDueDateKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__11__Impl"


    // $ANTLR start "rule__Task__Group__12"
    // InternalKPIGenerator.g:1214:1: rule__Task__Group__12 : rule__Task__Group__12__Impl rule__Task__Group__13 ;
    public final void rule__Task__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1218:1: ( rule__Task__Group__12__Impl rule__Task__Group__13 )
            // InternalKPIGenerator.g:1219:2: rule__Task__Group__12__Impl rule__Task__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__Task__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__12"


    // $ANTLR start "rule__Task__Group__12__Impl"
    // InternalKPIGenerator.g:1226:1: rule__Task__Group__12__Impl : ( ( rule__Task__DueDateAssignment_12 ) ) ;
    public final void rule__Task__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1230:1: ( ( ( rule__Task__DueDateAssignment_12 ) ) )
            // InternalKPIGenerator.g:1231:1: ( ( rule__Task__DueDateAssignment_12 ) )
            {
            // InternalKPIGenerator.g:1231:1: ( ( rule__Task__DueDateAssignment_12 ) )
            // InternalKPIGenerator.g:1232:2: ( rule__Task__DueDateAssignment_12 )
            {
             before(grammarAccess.getTaskAccess().getDueDateAssignment_12()); 
            // InternalKPIGenerator.g:1233:2: ( rule__Task__DueDateAssignment_12 )
            // InternalKPIGenerator.g:1233:3: rule__Task__DueDateAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Task__DueDateAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDueDateAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__12__Impl"


    // $ANTLR start "rule__Task__Group__13"
    // InternalKPIGenerator.g:1241:1: rule__Task__Group__13 : rule__Task__Group__13__Impl rule__Task__Group__14 ;
    public final void rule__Task__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1245:1: ( rule__Task__Group__13__Impl rule__Task__Group__14 )
            // InternalKPIGenerator.g:1246:2: rule__Task__Group__13__Impl rule__Task__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__13"


    // $ANTLR start "rule__Task__Group__13__Impl"
    // InternalKPIGenerator.g:1253:1: rule__Task__Group__13__Impl : ( '\",\"isPrivate\":' ) ;
    public final void rule__Task__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1257:1: ( ( '\",\"isPrivate\":' ) )
            // InternalKPIGenerator.g:1258:1: ( '\",\"isPrivate\":' )
            {
            // InternalKPIGenerator.g:1258:1: ( '\",\"isPrivate\":' )
            // InternalKPIGenerator.g:1259:2: '\",\"isPrivate\":'
            {
             before(grammarAccess.getTaskAccess().getIsPrivateKeyword_13()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIsPrivateKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__13__Impl"


    // $ANTLR start "rule__Task__Group__14"
    // InternalKPIGenerator.g:1268:1: rule__Task__Group__14 : rule__Task__Group__14__Impl rule__Task__Group__15 ;
    public final void rule__Task__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1272:1: ( rule__Task__Group__14__Impl rule__Task__Group__15 )
            // InternalKPIGenerator.g:1273:2: rule__Task__Group__14__Impl rule__Task__Group__15
            {
            pushFollow(FOLLOW_21);
            rule__Task__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__14"


    // $ANTLR start "rule__Task__Group__14__Impl"
    // InternalKPIGenerator.g:1280:1: rule__Task__Group__14__Impl : ( ( rule__Task__IsPrivateAssignment_14 ) ) ;
    public final void rule__Task__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1284:1: ( ( ( rule__Task__IsPrivateAssignment_14 ) ) )
            // InternalKPIGenerator.g:1285:1: ( ( rule__Task__IsPrivateAssignment_14 ) )
            {
            // InternalKPIGenerator.g:1285:1: ( ( rule__Task__IsPrivateAssignment_14 ) )
            // InternalKPIGenerator.g:1286:2: ( rule__Task__IsPrivateAssignment_14 )
            {
             before(grammarAccess.getTaskAccess().getIsPrivateAssignment_14()); 
            // InternalKPIGenerator.g:1287:2: ( rule__Task__IsPrivateAssignment_14 )
            // InternalKPIGenerator.g:1287:3: rule__Task__IsPrivateAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Task__IsPrivateAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIsPrivateAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__14__Impl"


    // $ANTLR start "rule__Task__Group__15"
    // InternalKPIGenerator.g:1295:1: rule__Task__Group__15 : rule__Task__Group__15__Impl rule__Task__Group__16 ;
    public final void rule__Task__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1299:1: ( rule__Task__Group__15__Impl rule__Task__Group__16 )
            // InternalKPIGenerator.g:1300:2: rule__Task__Group__15__Impl rule__Task__Group__16
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__15"


    // $ANTLR start "rule__Task__Group__15__Impl"
    // InternalKPIGenerator.g:1307:1: rule__Task__Group__15__Impl : ( ',\"progress\":' ) ;
    public final void rule__Task__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1311:1: ( ( ',\"progress\":' ) )
            // InternalKPIGenerator.g:1312:1: ( ',\"progress\":' )
            {
            // InternalKPIGenerator.g:1312:1: ( ',\"progress\":' )
            // InternalKPIGenerator.g:1313:2: ',\"progress\":'
            {
             before(grammarAccess.getTaskAccess().getProgressKeyword_15()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getProgressKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__15__Impl"


    // $ANTLR start "rule__Task__Group__16"
    // InternalKPIGenerator.g:1322:1: rule__Task__Group__16 : rule__Task__Group__16__Impl rule__Task__Group__17 ;
    public final void rule__Task__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1326:1: ( rule__Task__Group__16__Impl rule__Task__Group__17 )
            // InternalKPIGenerator.g:1327:2: rule__Task__Group__16__Impl rule__Task__Group__17
            {
            pushFollow(FOLLOW_22);
            rule__Task__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__16"


    // $ANTLR start "rule__Task__Group__16__Impl"
    // InternalKPIGenerator.g:1334:1: rule__Task__Group__16__Impl : ( ( rule__Task__ProgressAssignment_16 ) ) ;
    public final void rule__Task__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1338:1: ( ( ( rule__Task__ProgressAssignment_16 ) ) )
            // InternalKPIGenerator.g:1339:1: ( ( rule__Task__ProgressAssignment_16 ) )
            {
            // InternalKPIGenerator.g:1339:1: ( ( rule__Task__ProgressAssignment_16 ) )
            // InternalKPIGenerator.g:1340:2: ( rule__Task__ProgressAssignment_16 )
            {
             before(grammarAccess.getTaskAccess().getProgressAssignment_16()); 
            // InternalKPIGenerator.g:1341:2: ( rule__Task__ProgressAssignment_16 )
            // InternalKPIGenerator.g:1341:3: rule__Task__ProgressAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Task__ProgressAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getProgressAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__16__Impl"


    // $ANTLR start "rule__Task__Group__17"
    // InternalKPIGenerator.g:1349:1: rule__Task__Group__17 : rule__Task__Group__17__Impl rule__Task__Group__18 ;
    public final void rule__Task__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1353:1: ( rule__Task__Group__17__Impl rule__Task__Group__18 )
            // InternalKPIGenerator.g:1354:2: rule__Task__Group__17__Impl rule__Task__Group__18
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__17"


    // $ANTLR start "rule__Task__Group__17__Impl"
    // InternalKPIGenerator.g:1361:1: rule__Task__Group__17__Impl : ( ',\"status\":\"' ) ;
    public final void rule__Task__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1365:1: ( ( ',\"status\":\"' ) )
            // InternalKPIGenerator.g:1366:1: ( ',\"status\":\"' )
            {
            // InternalKPIGenerator.g:1366:1: ( ',\"status\":\"' )
            // InternalKPIGenerator.g:1367:2: ',\"status\":\"'
            {
             before(grammarAccess.getTaskAccess().getStatusKeyword_17()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStatusKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__17__Impl"


    // $ANTLR start "rule__Task__Group__18"
    // InternalKPIGenerator.g:1376:1: rule__Task__Group__18 : rule__Task__Group__18__Impl rule__Task__Group__19 ;
    public final void rule__Task__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1380:1: ( rule__Task__Group__18__Impl rule__Task__Group__19 )
            // InternalKPIGenerator.g:1381:2: rule__Task__Group__18__Impl rule__Task__Group__19
            {
            pushFollow(FOLLOW_23);
            rule__Task__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__18"


    // $ANTLR start "rule__Task__Group__18__Impl"
    // InternalKPIGenerator.g:1388:1: rule__Task__Group__18__Impl : ( ( rule__Task__StatusNameAssignment_18 ) ) ;
    public final void rule__Task__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1392:1: ( ( ( rule__Task__StatusNameAssignment_18 ) ) )
            // InternalKPIGenerator.g:1393:1: ( ( rule__Task__StatusNameAssignment_18 ) )
            {
            // InternalKPIGenerator.g:1393:1: ( ( rule__Task__StatusNameAssignment_18 ) )
            // InternalKPIGenerator.g:1394:2: ( rule__Task__StatusNameAssignment_18 )
            {
             before(grammarAccess.getTaskAccess().getStatusNameAssignment_18()); 
            // InternalKPIGenerator.g:1395:2: ( rule__Task__StatusNameAssignment_18 )
            // InternalKPIGenerator.g:1395:3: rule__Task__StatusNameAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Task__StatusNameAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStatusNameAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__18__Impl"


    // $ANTLR start "rule__Task__Group__19"
    // InternalKPIGenerator.g:1403:1: rule__Task__Group__19 : rule__Task__Group__19__Impl rule__Task__Group__20 ;
    public final void rule__Task__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1407:1: ( rule__Task__Group__19__Impl rule__Task__Group__20 )
            // InternalKPIGenerator.g:1408:2: rule__Task__Group__19__Impl rule__Task__Group__20
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__19"


    // $ANTLR start "rule__Task__Group__19__Impl"
    // InternalKPIGenerator.g:1415:1: rule__Task__Group__19__Impl : ( '\",\"statusText\":\"' ) ;
    public final void rule__Task__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1419:1: ( ( '\",\"statusText\":\"' ) )
            // InternalKPIGenerator.g:1420:1: ( '\",\"statusText\":\"' )
            {
            // InternalKPIGenerator.g:1420:1: ( '\",\"statusText\":\"' )
            // InternalKPIGenerator.g:1421:2: '\",\"statusText\":\"'
            {
             before(grammarAccess.getTaskAccess().getStatusTextKeyword_19()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStatusTextKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__19__Impl"


    // $ANTLR start "rule__Task__Group__20"
    // InternalKPIGenerator.g:1430:1: rule__Task__Group__20 : rule__Task__Group__20__Impl rule__Task__Group__21 ;
    public final void rule__Task__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1434:1: ( rule__Task__Group__20__Impl rule__Task__Group__21 )
            // InternalKPIGenerator.g:1435:2: rule__Task__Group__20__Impl rule__Task__Group__21
            {
            pushFollow(FOLLOW_24);
            rule__Task__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__20"


    // $ANTLR start "rule__Task__Group__20__Impl"
    // InternalKPIGenerator.g:1442:1: rule__Task__Group__20__Impl : ( ( rule__Task__StatusTextAssignment_20 ) ) ;
    public final void rule__Task__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1446:1: ( ( ( rule__Task__StatusTextAssignment_20 ) ) )
            // InternalKPIGenerator.g:1447:1: ( ( rule__Task__StatusTextAssignment_20 ) )
            {
            // InternalKPIGenerator.g:1447:1: ( ( rule__Task__StatusTextAssignment_20 ) )
            // InternalKPIGenerator.g:1448:2: ( rule__Task__StatusTextAssignment_20 )
            {
             before(grammarAccess.getTaskAccess().getStatusTextAssignment_20()); 
            // InternalKPIGenerator.g:1449:2: ( rule__Task__StatusTextAssignment_20 )
            // InternalKPIGenerator.g:1449:3: rule__Task__StatusTextAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__Task__StatusTextAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStatusTextAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__20__Impl"


    // $ANTLR start "rule__Task__Group__21"
    // InternalKPIGenerator.g:1457:1: rule__Task__Group__21 : rule__Task__Group__21__Impl rule__Task__Group__22 ;
    public final void rule__Task__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1461:1: ( rule__Task__Group__21__Impl rule__Task__Group__22 )
            // InternalKPIGenerator.g:1462:2: rule__Task__Group__21__Impl rule__Task__Group__22
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__21"


    // $ANTLR start "rule__Task__Group__21__Impl"
    // InternalKPIGenerator.g:1469:1: rule__Task__Group__21__Impl : ( '\",\"assignedTo\":\"' ) ;
    public final void rule__Task__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1473:1: ( ( '\",\"assignedTo\":\"' ) )
            // InternalKPIGenerator.g:1474:1: ( '\",\"assignedTo\":\"' )
            {
            // InternalKPIGenerator.g:1474:1: ( '\",\"assignedTo\":\"' )
            // InternalKPIGenerator.g:1475:2: '\",\"assignedTo\":\"'
            {
             before(grammarAccess.getTaskAccess().getAssignedToKeyword_21()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAssignedToKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__21__Impl"


    // $ANTLR start "rule__Task__Group__22"
    // InternalKPIGenerator.g:1484:1: rule__Task__Group__22 : rule__Task__Group__22__Impl rule__Task__Group__23 ;
    public final void rule__Task__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1488:1: ( rule__Task__Group__22__Impl rule__Task__Group__23 )
            // InternalKPIGenerator.g:1489:2: rule__Task__Group__22__Impl rule__Task__Group__23
            {
            pushFollow(FOLLOW_25);
            rule__Task__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__22"


    // $ANTLR start "rule__Task__Group__22__Impl"
    // InternalKPIGenerator.g:1496:1: rule__Task__Group__22__Impl : ( ( rule__Task__AssignedToAssignment_22 ) ) ;
    public final void rule__Task__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1500:1: ( ( ( rule__Task__AssignedToAssignment_22 ) ) )
            // InternalKPIGenerator.g:1501:1: ( ( rule__Task__AssignedToAssignment_22 ) )
            {
            // InternalKPIGenerator.g:1501:1: ( ( rule__Task__AssignedToAssignment_22 ) )
            // InternalKPIGenerator.g:1502:2: ( rule__Task__AssignedToAssignment_22 )
            {
             before(grammarAccess.getTaskAccess().getAssignedToAssignment_22()); 
            // InternalKPIGenerator.g:1503:2: ( rule__Task__AssignedToAssignment_22 )
            // InternalKPIGenerator.g:1503:3: rule__Task__AssignedToAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Task__AssignedToAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAssignedToAssignment_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__22__Impl"


    // $ANTLR start "rule__Task__Group__23"
    // InternalKPIGenerator.g:1511:1: rule__Task__Group__23 : rule__Task__Group__23__Impl rule__Task__Group__24 ;
    public final void rule__Task__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1515:1: ( rule__Task__Group__23__Impl rule__Task__Group__24 )
            // InternalKPIGenerator.g:1516:2: rule__Task__Group__23__Impl rule__Task__Group__24
            {
            pushFollow(FOLLOW_26);
            rule__Task__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__23"


    // $ANTLR start "rule__Task__Group__23__Impl"
    // InternalKPIGenerator.g:1523:1: rule__Task__Group__23__Impl : ( '\",\"createdDate\":\"' ) ;
    public final void rule__Task__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1527:1: ( ( '\",\"createdDate\":\"' ) )
            // InternalKPIGenerator.g:1528:1: ( '\",\"createdDate\":\"' )
            {
            // InternalKPIGenerator.g:1528:1: ( '\",\"createdDate\":\"' )
            // InternalKPIGenerator.g:1529:2: '\",\"createdDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getCreatedDateKeyword_23()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__23__Impl"


    // $ANTLR start "rule__Task__Group__24"
    // InternalKPIGenerator.g:1538:1: rule__Task__Group__24 : rule__Task__Group__24__Impl rule__Task__Group__25 ;
    public final void rule__Task__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1542:1: ( rule__Task__Group__24__Impl rule__Task__Group__25 )
            // InternalKPIGenerator.g:1543:2: rule__Task__Group__24__Impl rule__Task__Group__25
            {
            pushFollow(FOLLOW_27);
            rule__Task__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__24"


    // $ANTLR start "rule__Task__Group__24__Impl"
    // InternalKPIGenerator.g:1550:1: rule__Task__Group__24__Impl : ( ( rule__Task__CreatedDateAssignment_24 ) ) ;
    public final void rule__Task__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1554:1: ( ( ( rule__Task__CreatedDateAssignment_24 ) ) )
            // InternalKPIGenerator.g:1555:1: ( ( rule__Task__CreatedDateAssignment_24 ) )
            {
            // InternalKPIGenerator.g:1555:1: ( ( rule__Task__CreatedDateAssignment_24 ) )
            // InternalKPIGenerator.g:1556:2: ( rule__Task__CreatedDateAssignment_24 )
            {
             before(grammarAccess.getTaskAccess().getCreatedDateAssignment_24()); 
            // InternalKPIGenerator.g:1557:2: ( rule__Task__CreatedDateAssignment_24 )
            // InternalKPIGenerator.g:1557:3: rule__Task__CreatedDateAssignment_24
            {
            pushFollow(FOLLOW_2);
            rule__Task__CreatedDateAssignment_24();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCreatedDateAssignment_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__24__Impl"


    // $ANTLR start "rule__Task__Group__25"
    // InternalKPIGenerator.g:1565:1: rule__Task__Group__25 : rule__Task__Group__25__Impl rule__Task__Group__26 ;
    public final void rule__Task__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1569:1: ( rule__Task__Group__25__Impl rule__Task__Group__26 )
            // InternalKPIGenerator.g:1570:2: rule__Task__Group__25__Impl rule__Task__Group__26
            {
            pushFollow(FOLLOW_28);
            rule__Task__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__25"


    // $ANTLR start "rule__Task__Group__25__Impl"
    // InternalKPIGenerator.g:1577:1: rule__Task__Group__25__Impl : ( '\",\"completedDate\":\"' ) ;
    public final void rule__Task__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1581:1: ( ( '\",\"completedDate\":\"' ) )
            // InternalKPIGenerator.g:1582:1: ( '\",\"completedDate\":\"' )
            {
            // InternalKPIGenerator.g:1582:1: ( '\",\"completedDate\":\"' )
            // InternalKPIGenerator.g:1583:2: '\",\"completedDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getCompletedDateKeyword_25()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedDateKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__25__Impl"


    // $ANTLR start "rule__Task__Group__26"
    // InternalKPIGenerator.g:1592:1: rule__Task__Group__26 : rule__Task__Group__26__Impl rule__Task__Group__27 ;
    public final void rule__Task__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1596:1: ( rule__Task__Group__26__Impl rule__Task__Group__27 )
            // InternalKPIGenerator.g:1597:2: rule__Task__Group__26__Impl rule__Task__Group__27
            {
            pushFollow(FOLLOW_29);
            rule__Task__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__26"


    // $ANTLR start "rule__Task__Group__26__Impl"
    // InternalKPIGenerator.g:1604:1: rule__Task__Group__26__Impl : ( ( rule__Task__CompletedDateAssignment_26 ) ) ;
    public final void rule__Task__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1608:1: ( ( ( rule__Task__CompletedDateAssignment_26 ) ) )
            // InternalKPIGenerator.g:1609:1: ( ( rule__Task__CompletedDateAssignment_26 ) )
            {
            // InternalKPIGenerator.g:1609:1: ( ( rule__Task__CompletedDateAssignment_26 ) )
            // InternalKPIGenerator.g:1610:2: ( rule__Task__CompletedDateAssignment_26 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAssignment_26()); 
            // InternalKPIGenerator.g:1611:2: ( rule__Task__CompletedDateAssignment_26 )
            // InternalKPIGenerator.g:1611:3: rule__Task__CompletedDateAssignment_26
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAssignment_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__26__Impl"


    // $ANTLR start "rule__Task__Group__27"
    // InternalKPIGenerator.g:1619:1: rule__Task__Group__27 : rule__Task__Group__27__Impl rule__Task__Group__28 ;
    public final void rule__Task__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1623:1: ( rule__Task__Group__27__Impl rule__Task__Group__28 )
            // InternalKPIGenerator.g:1624:2: rule__Task__Group__27__Impl rule__Task__Group__28
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__27"


    // $ANTLR start "rule__Task__Group__27__Impl"
    // InternalKPIGenerator.g:1631:1: rule__Task__Group__27__Impl : ( '\",\"timeLoggedMin\":' ) ;
    public final void rule__Task__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1635:1: ( ( '\",\"timeLoggedMin\":' ) )
            // InternalKPIGenerator.g:1636:1: ( '\",\"timeLoggedMin\":' )
            {
            // InternalKPIGenerator.g:1636:1: ( '\",\"timeLoggedMin\":' )
            // InternalKPIGenerator.g:1637:2: '\",\"timeLoggedMin\":'
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_27()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__27__Impl"


    // $ANTLR start "rule__Task__Group__28"
    // InternalKPIGenerator.g:1646:1: rule__Task__Group__28 : rule__Task__Group__28__Impl rule__Task__Group__29 ;
    public final void rule__Task__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1650:1: ( rule__Task__Group__28__Impl rule__Task__Group__29 )
            // InternalKPIGenerator.g:1651:2: rule__Task__Group__28__Impl rule__Task__Group__29
            {
            pushFollow(FOLLOW_30);
            rule__Task__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__28"


    // $ANTLR start "rule__Task__Group__28__Impl"
    // InternalKPIGenerator.g:1658:1: rule__Task__Group__28__Impl : ( ( rule__Task__TimeLoggedMinAssignment_28 ) ) ;
    public final void rule__Task__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1662:1: ( ( ( rule__Task__TimeLoggedMinAssignment_28 ) ) )
            // InternalKPIGenerator.g:1663:1: ( ( rule__Task__TimeLoggedMinAssignment_28 ) )
            {
            // InternalKPIGenerator.g:1663:1: ( ( rule__Task__TimeLoggedMinAssignment_28 ) )
            // InternalKPIGenerator.g:1664:2: ( rule__Task__TimeLoggedMinAssignment_28 )
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinAssignment_28()); 
            // InternalKPIGenerator.g:1665:2: ( rule__Task__TimeLoggedMinAssignment_28 )
            // InternalKPIGenerator.g:1665:3: rule__Task__TimeLoggedMinAssignment_28
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeLoggedMinAssignment_28();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeLoggedMinAssignment_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__28__Impl"


    // $ANTLR start "rule__Task__Group__29"
    // InternalKPIGenerator.g:1673:1: rule__Task__Group__29 : rule__Task__Group__29__Impl rule__Task__Group__30 ;
    public final void rule__Task__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1677:1: ( rule__Task__Group__29__Impl rule__Task__Group__30 )
            // InternalKPIGenerator.g:1678:2: rule__Task__Group__29__Impl rule__Task__Group__30
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__29"


    // $ANTLR start "rule__Task__Group__29__Impl"
    // InternalKPIGenerator.g:1685:1: rule__Task__Group__29__Impl : ( ',\"billableTime\":' ) ;
    public final void rule__Task__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1689:1: ( ( ',\"billableTime\":' ) )
            // InternalKPIGenerator.g:1690:1: ( ',\"billableTime\":' )
            {
            // InternalKPIGenerator.g:1690:1: ( ',\"billableTime\":' )
            // InternalKPIGenerator.g:1691:2: ',\"billableTime\":'
            {
             before(grammarAccess.getTaskAccess().getBillableTimeKeyword_29()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableTimeKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__29__Impl"


    // $ANTLR start "rule__Task__Group__30"
    // InternalKPIGenerator.g:1700:1: rule__Task__Group__30 : rule__Task__Group__30__Impl rule__Task__Group__31 ;
    public final void rule__Task__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1704:1: ( rule__Task__Group__30__Impl rule__Task__Group__31 )
            // InternalKPIGenerator.g:1705:2: rule__Task__Group__30__Impl rule__Task__Group__31
            {
            pushFollow(FOLLOW_31);
            rule__Task__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__31();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__30"


    // $ANTLR start "rule__Task__Group__30__Impl"
    // InternalKPIGenerator.g:1712:1: rule__Task__Group__30__Impl : ( ( rule__Task__BillableTimeAssignment_30 ) ) ;
    public final void rule__Task__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1716:1: ( ( ( rule__Task__BillableTimeAssignment_30 ) ) )
            // InternalKPIGenerator.g:1717:1: ( ( rule__Task__BillableTimeAssignment_30 ) )
            {
            // InternalKPIGenerator.g:1717:1: ( ( rule__Task__BillableTimeAssignment_30 ) )
            // InternalKPIGenerator.g:1718:2: ( rule__Task__BillableTimeAssignment_30 )
            {
             before(grammarAccess.getTaskAccess().getBillableTimeAssignment_30()); 
            // InternalKPIGenerator.g:1719:2: ( rule__Task__BillableTimeAssignment_30 )
            // InternalKPIGenerator.g:1719:3: rule__Task__BillableTimeAssignment_30
            {
            pushFollow(FOLLOW_2);
            rule__Task__BillableTimeAssignment_30();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getBillableTimeAssignment_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__30__Impl"


    // $ANTLR start "rule__Task__Group__31"
    // InternalKPIGenerator.g:1727:1: rule__Task__Group__31 : rule__Task__Group__31__Impl rule__Task__Group__32 ;
    public final void rule__Task__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1731:1: ( rule__Task__Group__31__Impl rule__Task__Group__32 )
            // InternalKPIGenerator.g:1732:2: rule__Task__Group__31__Impl rule__Task__Group__32
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__32();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__31"


    // $ANTLR start "rule__Task__Group__31__Impl"
    // InternalKPIGenerator.g:1739:1: rule__Task__Group__31__Impl : ( ',\"completedOnTime\":' ) ;
    public final void rule__Task__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1743:1: ( ( ',\"completedOnTime\":' ) )
            // InternalKPIGenerator.g:1744:1: ( ',\"completedOnTime\":' )
            {
            // InternalKPIGenerator.g:1744:1: ( ',\"completedOnTime\":' )
            // InternalKPIGenerator.g:1745:2: ',\"completedOnTime\":'
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_31()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__31__Impl"


    // $ANTLR start "rule__Task__Group__32"
    // InternalKPIGenerator.g:1754:1: rule__Task__Group__32 : rule__Task__Group__32__Impl rule__Task__Group__33 ;
    public final void rule__Task__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1758:1: ( rule__Task__Group__32__Impl rule__Task__Group__33 )
            // InternalKPIGenerator.g:1759:2: rule__Task__Group__32__Impl rule__Task__Group__33
            {
            pushFollow(FOLLOW_32);
            rule__Task__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__33();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__32"


    // $ANTLR start "rule__Task__Group__32__Impl"
    // InternalKPIGenerator.g:1766:1: rule__Task__Group__32__Impl : ( ( rule__Task__CompletedOnTimeAssignment_32 ) ) ;
    public final void rule__Task__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1770:1: ( ( ( rule__Task__CompletedOnTimeAssignment_32 ) ) )
            // InternalKPIGenerator.g:1771:1: ( ( rule__Task__CompletedOnTimeAssignment_32 ) )
            {
            // InternalKPIGenerator.g:1771:1: ( ( rule__Task__CompletedOnTimeAssignment_32 ) )
            // InternalKPIGenerator.g:1772:2: ( rule__Task__CompletedOnTimeAssignment_32 )
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_32()); 
            // InternalKPIGenerator.g:1773:2: ( rule__Task__CompletedOnTimeAssignment_32 )
            // InternalKPIGenerator.g:1773:3: rule__Task__CompletedOnTimeAssignment_32
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedOnTimeAssignment_32();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_32()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__32__Impl"


    // $ANTLR start "rule__Task__Group__33"
    // InternalKPIGenerator.g:1781:1: rule__Task__Group__33 : rule__Task__Group__33__Impl rule__Task__Group__34 ;
    public final void rule__Task__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1785:1: ( rule__Task__Group__33__Impl rule__Task__Group__34 )
            // InternalKPIGenerator.g:1786:2: rule__Task__Group__33__Impl rule__Task__Group__34
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__34();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__33"


    // $ANTLR start "rule__Task__Group__33__Impl"
    // InternalKPIGenerator.g:1793:1: rule__Task__Group__33__Impl : ( ',\"timeEstimated\":' ) ;
    public final void rule__Task__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1797:1: ( ( ',\"timeEstimated\":' ) )
            // InternalKPIGenerator.g:1798:1: ( ',\"timeEstimated\":' )
            {
            // InternalKPIGenerator.g:1798:1: ( ',\"timeEstimated\":' )
            // InternalKPIGenerator.g:1799:2: ',\"timeEstimated\":'
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedKeyword_33()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedKeyword_33()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__33__Impl"


    // $ANTLR start "rule__Task__Group__34"
    // InternalKPIGenerator.g:1808:1: rule__Task__Group__34 : rule__Task__Group__34__Impl rule__Task__Group__35 ;
    public final void rule__Task__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1812:1: ( rule__Task__Group__34__Impl rule__Task__Group__35 )
            // InternalKPIGenerator.g:1813:2: rule__Task__Group__34__Impl rule__Task__Group__35
            {
            pushFollow(FOLLOW_33);
            rule__Task__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__35();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__34"


    // $ANTLR start "rule__Task__Group__34__Impl"
    // InternalKPIGenerator.g:1820:1: rule__Task__Group__34__Impl : ( ( rule__Task__TimeEstimatedAssignment_34 ) ) ;
    public final void rule__Task__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1824:1: ( ( ( rule__Task__TimeEstimatedAssignment_34 ) ) )
            // InternalKPIGenerator.g:1825:1: ( ( rule__Task__TimeEstimatedAssignment_34 ) )
            {
            // InternalKPIGenerator.g:1825:1: ( ( rule__Task__TimeEstimatedAssignment_34 ) )
            // InternalKPIGenerator.g:1826:2: ( rule__Task__TimeEstimatedAssignment_34 )
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_34()); 
            // InternalKPIGenerator.g:1827:2: ( rule__Task__TimeEstimatedAssignment_34 )
            // InternalKPIGenerator.g:1827:3: rule__Task__TimeEstimatedAssignment_34
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeEstimatedAssignment_34();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_34()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__34__Impl"


    // $ANTLR start "rule__Task__Group__35"
    // InternalKPIGenerator.g:1835:1: rule__Task__Group__35 : rule__Task__Group__35__Impl rule__Task__Group__36 ;
    public final void rule__Task__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1839:1: ( rule__Task__Group__35__Impl rule__Task__Group__36 )
            // InternalKPIGenerator.g:1840:2: rule__Task__Group__35__Impl rule__Task__Group__36
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__36();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__35"


    // $ANTLR start "rule__Task__Group__35__Impl"
    // InternalKPIGenerator.g:1847:1: rule__Task__Group__35__Impl : ( ',\"isReprocessedTask\":' ) ;
    public final void rule__Task__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1851:1: ( ( ',\"isReprocessedTask\":' ) )
            // InternalKPIGenerator.g:1852:1: ( ',\"isReprocessedTask\":' )
            {
            // InternalKPIGenerator.g:1852:1: ( ',\"isReprocessedTask\":' )
            // InternalKPIGenerator.g:1853:2: ',\"isReprocessedTask\":'
            {
             before(grammarAccess.getTaskAccess().getIsReprocessedTaskKeyword_35()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIsReprocessedTaskKeyword_35()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__35__Impl"


    // $ANTLR start "rule__Task__Group__36"
    // InternalKPIGenerator.g:1862:1: rule__Task__Group__36 : rule__Task__Group__36__Impl rule__Task__Group__37 ;
    public final void rule__Task__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1866:1: ( rule__Task__Group__36__Impl rule__Task__Group__37 )
            // InternalKPIGenerator.g:1867:2: rule__Task__Group__36__Impl rule__Task__Group__37
            {
            pushFollow(FOLLOW_34);
            rule__Task__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__37();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__36"


    // $ANTLR start "rule__Task__Group__36__Impl"
    // InternalKPIGenerator.g:1874:1: rule__Task__Group__36__Impl : ( ( rule__Task__IsReprocessedTaskAssignment_36 ) ) ;
    public final void rule__Task__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1878:1: ( ( ( rule__Task__IsReprocessedTaskAssignment_36 ) ) )
            // InternalKPIGenerator.g:1879:1: ( ( rule__Task__IsReprocessedTaskAssignment_36 ) )
            {
            // InternalKPIGenerator.g:1879:1: ( ( rule__Task__IsReprocessedTaskAssignment_36 ) )
            // InternalKPIGenerator.g:1880:2: ( rule__Task__IsReprocessedTaskAssignment_36 )
            {
             before(grammarAccess.getTaskAccess().getIsReprocessedTaskAssignment_36()); 
            // InternalKPIGenerator.g:1881:2: ( rule__Task__IsReprocessedTaskAssignment_36 )
            // InternalKPIGenerator.g:1881:3: rule__Task__IsReprocessedTaskAssignment_36
            {
            pushFollow(FOLLOW_2);
            rule__Task__IsReprocessedTaskAssignment_36();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIsReprocessedTaskAssignment_36()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__36__Impl"


    // $ANTLR start "rule__Task__Group__37"
    // InternalKPIGenerator.g:1889:1: rule__Task__Group__37 : rule__Task__Group__37__Impl rule__Task__Group__38 ;
    public final void rule__Task__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1893:1: ( rule__Task__Group__37__Impl rule__Task__Group__38 )
            // InternalKPIGenerator.g:1894:2: rule__Task__Group__37__Impl rule__Task__Group__38
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__37__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__38();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__37"


    // $ANTLR start "rule__Task__Group__37__Impl"
    // InternalKPIGenerator.g:1901:1: rule__Task__Group__37__Impl : ( ',\"idParentTask\":' ) ;
    public final void rule__Task__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1905:1: ( ( ',\"idParentTask\":' ) )
            // InternalKPIGenerator.g:1906:1: ( ',\"idParentTask\":' )
            {
            // InternalKPIGenerator.g:1906:1: ( ',\"idParentTask\":' )
            // InternalKPIGenerator.g:1907:2: ',\"idParentTask\":'
            {
             before(grammarAccess.getTaskAccess().getIdParentTaskKeyword_37()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIdParentTaskKeyword_37()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__37__Impl"


    // $ANTLR start "rule__Task__Group__38"
    // InternalKPIGenerator.g:1916:1: rule__Task__Group__38 : rule__Task__Group__38__Impl rule__Task__Group__39 ;
    public final void rule__Task__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1920:1: ( rule__Task__Group__38__Impl rule__Task__Group__39 )
            // InternalKPIGenerator.g:1921:2: rule__Task__Group__38__Impl rule__Task__Group__39
            {
            pushFollow(FOLLOW_35);
            rule__Task__Group__38__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__39();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__38"


    // $ANTLR start "rule__Task__Group__38__Impl"
    // InternalKPIGenerator.g:1928:1: rule__Task__Group__38__Impl : ( ( rule__Task__IdParentTaskAssignment_38 ) ) ;
    public final void rule__Task__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1932:1: ( ( ( rule__Task__IdParentTaskAssignment_38 ) ) )
            // InternalKPIGenerator.g:1933:1: ( ( rule__Task__IdParentTaskAssignment_38 ) )
            {
            // InternalKPIGenerator.g:1933:1: ( ( rule__Task__IdParentTaskAssignment_38 ) )
            // InternalKPIGenerator.g:1934:2: ( rule__Task__IdParentTaskAssignment_38 )
            {
             before(grammarAccess.getTaskAccess().getIdParentTaskAssignment_38()); 
            // InternalKPIGenerator.g:1935:2: ( rule__Task__IdParentTaskAssignment_38 )
            // InternalKPIGenerator.g:1935:3: rule__Task__IdParentTaskAssignment_38
            {
            pushFollow(FOLLOW_2);
            rule__Task__IdParentTaskAssignment_38();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIdParentTaskAssignment_38()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__38__Impl"


    // $ANTLR start "rule__Task__Group__39"
    // InternalKPIGenerator.g:1943:1: rule__Task__Group__39 : rule__Task__Group__39__Impl ;
    public final void rule__Task__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1947:1: ( rule__Task__Group__39__Impl )
            // InternalKPIGenerator.g:1948:2: rule__Task__Group__39__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__39__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__39"


    // $ANTLR start "rule__Task__Group__39__Impl"
    // InternalKPIGenerator.g:1954:1: rule__Task__Group__39__Impl : ( '}' ) ;
    public final void rule__Task__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1958:1: ( ( '}' ) )
            // InternalKPIGenerator.g:1959:1: ( '}' )
            {
            // InternalKPIGenerator.g:1959:1: ( '}' )
            // InternalKPIGenerator.g:1960:2: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_39()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_39()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__39__Impl"


    // $ANTLR start "rule__Root__ProjectsAssignment_1"
    // InternalKPIGenerator.g:1970:1: rule__Root__ProjectsAssignment_1 : ( ruleProject ) ;
    public final void rule__Root__ProjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1974:1: ( ( ruleProject ) )
            // InternalKPIGenerator.g:1975:2: ( ruleProject )
            {
            // InternalKPIGenerator.g:1975:2: ( ruleProject )
            // InternalKPIGenerator.g:1976:3: ruleProject
            {
             before(grammarAccess.getRootAccess().getProjectsProjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getRootAccess().getProjectsProjectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ProjectsAssignment_1"


    // $ANTLR start "rule__Root__ProjectsAssignment_2_1"
    // InternalKPIGenerator.g:1985:1: rule__Root__ProjectsAssignment_2_1 : ( ruleProject ) ;
    public final void rule__Root__ProjectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1989:1: ( ( ruleProject ) )
            // InternalKPIGenerator.g:1990:2: ( ruleProject )
            {
            // InternalKPIGenerator.g:1990:2: ( ruleProject )
            // InternalKPIGenerator.g:1991:3: ruleProject
            {
             before(grammarAccess.getRootAccess().getProjectsProjectParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getRootAccess().getProjectsProjectParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ProjectsAssignment_2_1"


    // $ANTLR start "rule__Project__ProjectNameAssignment_2"
    // InternalKPIGenerator.g:2000:1: rule__Project__ProjectNameAssignment_2 : ( RULE_CADENA ) ;
    public final void rule__Project__ProjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2004:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2005:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2005:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2006:3: RULE_CADENA
            {
             before(grammarAccess.getProjectAccess().getProjectNameCADENATerminalRuleCall_2_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectNameCADENATerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__ProjectNameAssignment_2"


    // $ANTLR start "rule__Project__PhasesAssignment_4"
    // InternalKPIGenerator.g:2015:1: rule__Project__PhasesAssignment_4 : ( rulePhase ) ;
    public final void rule__Project__PhasesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2019:1: ( ( rulePhase ) )
            // InternalKPIGenerator.g:2020:2: ( rulePhase )
            {
            // InternalKPIGenerator.g:2020:2: ( rulePhase )
            // InternalKPIGenerator.g:2021:3: rulePhase
            {
             before(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__PhasesAssignment_4"


    // $ANTLR start "rule__Project__PhasesAssignment_5_1"
    // InternalKPIGenerator.g:2030:1: rule__Project__PhasesAssignment_5_1 : ( rulePhase ) ;
    public final void rule__Project__PhasesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2034:1: ( ( rulePhase ) )
            // InternalKPIGenerator.g:2035:2: ( rulePhase )
            {
            // InternalKPIGenerator.g:2035:2: ( rulePhase )
            // InternalKPIGenerator.g:2036:3: rulePhase
            {
             before(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__PhasesAssignment_5_1"


    // $ANTLR start "rule__Phase__PhaseNameAssignment_3"
    // InternalKPIGenerator.g:2045:1: rule__Phase__PhaseNameAssignment_3 : ( RULE_CADENA ) ;
    public final void rule__Phase__PhaseNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2049:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2050:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2050:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2051:3: RULE_CADENA
            {
             before(grammarAccess.getPhaseAccess().getPhaseNameCADENATerminalRuleCall_3_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getPhaseNameCADENATerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__PhaseNameAssignment_3"


    // $ANTLR start "rule__Phase__TasksAssignment_5"
    // InternalKPIGenerator.g:2060:1: rule__Phase__TasksAssignment_5 : ( ruleTask ) ;
    public final void rule__Phase__TasksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2064:1: ( ( ruleTask ) )
            // InternalKPIGenerator.g:2065:2: ( ruleTask )
            {
            // InternalKPIGenerator.g:2065:2: ( ruleTask )
            // InternalKPIGenerator.g:2066:3: ruleTask
            {
             before(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__TasksAssignment_5"


    // $ANTLR start "rule__Phase__TasksAssignment_6_1"
    // InternalKPIGenerator.g:2075:1: rule__Phase__TasksAssignment_6_1 : ( ruleTask ) ;
    public final void rule__Phase__TasksAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2079:1: ( ( ruleTask ) )
            // InternalKPIGenerator.g:2080:2: ( ruleTask )
            {
            // InternalKPIGenerator.g:2080:2: ( ruleTask )
            // InternalKPIGenerator.g:2081:3: ruleTask
            {
             before(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__TasksAssignment_6_1"


    // $ANTLR start "rule__Task__TaskIdAssignment_2"
    // InternalKPIGenerator.g:2090:1: rule__Task__TaskIdAssignment_2 : ( RULE_INT ) ;
    public final void rule__Task__TaskIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2094:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2095:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2095:2: ( RULE_INT )
            // InternalKPIGenerator.g:2096:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTaskIdINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskIdINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskIdAssignment_2"


    // $ANTLR start "rule__Task__TaskNameAssignment_4"
    // InternalKPIGenerator.g:2105:1: rule__Task__TaskNameAssignment_4 : ( RULE_CADENA ) ;
    public final void rule__Task__TaskNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2109:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2110:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2110:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2111:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getTaskNameCADENATerminalRuleCall_4_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskNameCADENATerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskNameAssignment_4"


    // $ANTLR start "rule__Task__UseCaseAssignment_6"
    // InternalKPIGenerator.g:2120:1: rule__Task__UseCaseAssignment_6 : ( RULE_CADENA ) ;
    public final void rule__Task__UseCaseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2124:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2125:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2125:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2126:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getUseCaseCADENATerminalRuleCall_6_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getUseCaseCADENATerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__UseCaseAssignment_6"


    // $ANTLR start "rule__Task__SequenceNumberAssignment_8"
    // InternalKPIGenerator.g:2135:1: rule__Task__SequenceNumberAssignment_8 : ( RULE_DOUBLE ) ;
    public final void rule__Task__SequenceNumberAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2139:1: ( ( RULE_DOUBLE ) )
            // InternalKPIGenerator.g:2140:2: ( RULE_DOUBLE )
            {
            // InternalKPIGenerator.g:2140:2: ( RULE_DOUBLE )
            // InternalKPIGenerator.g:2141:3: RULE_DOUBLE
            {
             before(grammarAccess.getTaskAccess().getSequenceNumberDOUBLETerminalRuleCall_8_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSequenceNumberDOUBLETerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__SequenceNumberAssignment_8"


    // $ANTLR start "rule__Task__StartDateAssignment_10"
    // InternalKPIGenerator.g:2150:1: rule__Task__StartDateAssignment_10 : ( ( rule__Task__StartDateAlternatives_10_0 ) ) ;
    public final void rule__Task__StartDateAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2154:1: ( ( ( rule__Task__StartDateAlternatives_10_0 ) ) )
            // InternalKPIGenerator.g:2155:2: ( ( rule__Task__StartDateAlternatives_10_0 ) )
            {
            // InternalKPIGenerator.g:2155:2: ( ( rule__Task__StartDateAlternatives_10_0 ) )
            // InternalKPIGenerator.g:2156:3: ( rule__Task__StartDateAlternatives_10_0 )
            {
             before(grammarAccess.getTaskAccess().getStartDateAlternatives_10_0()); 
            // InternalKPIGenerator.g:2157:3: ( rule__Task__StartDateAlternatives_10_0 )
            // InternalKPIGenerator.g:2157:4: rule__Task__StartDateAlternatives_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__StartDateAlternatives_10_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStartDateAlternatives_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__StartDateAssignment_10"


    // $ANTLR start "rule__Task__DueDateAssignment_12"
    // InternalKPIGenerator.g:2165:1: rule__Task__DueDateAssignment_12 : ( ( rule__Task__DueDateAlternatives_12_0 ) ) ;
    public final void rule__Task__DueDateAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2169:1: ( ( ( rule__Task__DueDateAlternatives_12_0 ) ) )
            // InternalKPIGenerator.g:2170:2: ( ( rule__Task__DueDateAlternatives_12_0 ) )
            {
            // InternalKPIGenerator.g:2170:2: ( ( rule__Task__DueDateAlternatives_12_0 ) )
            // InternalKPIGenerator.g:2171:3: ( rule__Task__DueDateAlternatives_12_0 )
            {
             before(grammarAccess.getTaskAccess().getDueDateAlternatives_12_0()); 
            // InternalKPIGenerator.g:2172:3: ( rule__Task__DueDateAlternatives_12_0 )
            // InternalKPIGenerator.g:2172:4: rule__Task__DueDateAlternatives_12_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__DueDateAlternatives_12_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDueDateAlternatives_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DueDateAssignment_12"


    // $ANTLR start "rule__Task__IsPrivateAssignment_14"
    // InternalKPIGenerator.g:2180:1: rule__Task__IsPrivateAssignment_14 : ( RULE_CADENA ) ;
    public final void rule__Task__IsPrivateAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2184:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2185:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2185:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2186:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getIsPrivateCADENATerminalRuleCall_14_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIsPrivateCADENATerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__IsPrivateAssignment_14"


    // $ANTLR start "rule__Task__ProgressAssignment_16"
    // InternalKPIGenerator.g:2195:1: rule__Task__ProgressAssignment_16 : ( RULE_INT ) ;
    public final void rule__Task__ProgressAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2199:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2200:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2200:2: ( RULE_INT )
            // InternalKPIGenerator.g:2201:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_16_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ProgressAssignment_16"


    // $ANTLR start "rule__Task__StatusNameAssignment_18"
    // InternalKPIGenerator.g:2210:1: rule__Task__StatusNameAssignment_18 : ( RULE_CADENA ) ;
    public final void rule__Task__StatusNameAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2214:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2215:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2215:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2216:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getStatusNameCADENATerminalRuleCall_18_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStatusNameCADENATerminalRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__StatusNameAssignment_18"


    // $ANTLR start "rule__Task__StatusTextAssignment_20"
    // InternalKPIGenerator.g:2225:1: rule__Task__StatusTextAssignment_20 : ( RULE_CADENA ) ;
    public final void rule__Task__StatusTextAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2229:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2230:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2230:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2231:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getStatusTextCADENATerminalRuleCall_20_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStatusTextCADENATerminalRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__StatusTextAssignment_20"


    // $ANTLR start "rule__Task__AssignedToAssignment_22"
    // InternalKPIGenerator.g:2240:1: rule__Task__AssignedToAssignment_22 : ( RULE_CADENA ) ;
    public final void rule__Task__AssignedToAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2244:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2245:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2245:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2246:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_22_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__AssignedToAssignment_22"


    // $ANTLR start "rule__Task__CreatedDateAssignment_24"
    // InternalKPIGenerator.g:2255:1: rule__Task__CreatedDateAssignment_24 : ( RULE_DATEHOUR ) ;
    public final void rule__Task__CreatedDateAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2259:1: ( ( RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:2260:2: ( RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:2260:2: ( RULE_DATEHOUR )
            // InternalKPIGenerator.g:2261:3: RULE_DATEHOUR
            {
             before(grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_24_0()); 
            match(input,RULE_DATEHOUR,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CreatedDateAssignment_24"


    // $ANTLR start "rule__Task__CompletedDateAssignment_26"
    // InternalKPIGenerator.g:2270:1: rule__Task__CompletedDateAssignment_26 : ( ( rule__Task__CompletedDateAlternatives_26_0 ) ) ;
    public final void rule__Task__CompletedDateAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2274:1: ( ( ( rule__Task__CompletedDateAlternatives_26_0 ) ) )
            // InternalKPIGenerator.g:2275:2: ( ( rule__Task__CompletedDateAlternatives_26_0 ) )
            {
            // InternalKPIGenerator.g:2275:2: ( ( rule__Task__CompletedDateAlternatives_26_0 ) )
            // InternalKPIGenerator.g:2276:3: ( rule__Task__CompletedDateAlternatives_26_0 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAlternatives_26_0()); 
            // InternalKPIGenerator.g:2277:3: ( rule__Task__CompletedDateAlternatives_26_0 )
            // InternalKPIGenerator.g:2277:4: rule__Task__CompletedDateAlternatives_26_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAlternatives_26_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAlternatives_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedDateAssignment_26"


    // $ANTLR start "rule__Task__TimeLoggedMinAssignment_28"
    // InternalKPIGenerator.g:2285:1: rule__Task__TimeLoggedMinAssignment_28 : ( RULE_INT ) ;
    public final void rule__Task__TimeLoggedMinAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2289:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2290:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2290:2: ( RULE_INT )
            // InternalKPIGenerator.g:2291:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_28_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_28_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeLoggedMinAssignment_28"


    // $ANTLR start "rule__Task__BillableTimeAssignment_30"
    // InternalKPIGenerator.g:2300:1: rule__Task__BillableTimeAssignment_30 : ( RULE_INT ) ;
    public final void rule__Task__BillableTimeAssignment_30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2304:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2305:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2305:2: ( RULE_INT )
            // InternalKPIGenerator.g:2306:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_30_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_30_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__BillableTimeAssignment_30"


    // $ANTLR start "rule__Task__CompletedOnTimeAssignment_32"
    // InternalKPIGenerator.g:2315:1: rule__Task__CompletedOnTimeAssignment_32 : ( RULE_CADENA ) ;
    public final void rule__Task__CompletedOnTimeAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2319:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2320:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2320:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2321:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_32_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_32_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedOnTimeAssignment_32"


    // $ANTLR start "rule__Task__TimeEstimatedAssignment_34"
    // InternalKPIGenerator.g:2330:1: rule__Task__TimeEstimatedAssignment_34 : ( RULE_INT ) ;
    public final void rule__Task__TimeEstimatedAssignment_34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2334:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2335:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2335:2: ( RULE_INT )
            // InternalKPIGenerator.g:2336:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_34_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_34_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeEstimatedAssignment_34"


    // $ANTLR start "rule__Task__IsReprocessedTaskAssignment_36"
    // InternalKPIGenerator.g:2345:1: rule__Task__IsReprocessedTaskAssignment_36 : ( RULE_CADENA ) ;
    public final void rule__Task__IsReprocessedTaskAssignment_36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2349:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2350:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2350:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2351:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getIsReprocessedTaskCADENATerminalRuleCall_36_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIsReprocessedTaskCADENATerminalRuleCall_36_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__IsReprocessedTaskAssignment_36"


    // $ANTLR start "rule__Task__IdParentTaskAssignment_38"
    // InternalKPIGenerator.g:2360:1: rule__Task__IdParentTaskAssignment_38 : ( RULE_INT ) ;
    public final void rule__Task__IdParentTaskAssignment_38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2364:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2365:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2365:2: ( RULE_INT )
            // InternalKPIGenerator.g:2366:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getIdParentTaskINTTerminalRuleCall_38_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIdParentTaskINTTerminalRuleCall_38_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__IdParentTaskAssignment_38"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});

}