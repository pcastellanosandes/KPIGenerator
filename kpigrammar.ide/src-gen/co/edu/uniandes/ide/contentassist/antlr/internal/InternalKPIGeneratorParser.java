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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CADENA", "RULE_DATEHOUR", "RULE_INT", "RULE_DOUBLE", "RULE_DATE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'['", "']'", "'{\"name\":\"'", "'\",\"phases\":['", "']}'", "','", "'\",\"tasks\":['", "'{\"id\":'", "',\"name\":\"'", "'\",\"useCase\":\"'", "'\",\"sequenceNumber\":'", "',\"description\":\"'", "'\",\"startDate\":\"'", "'\",\"dueDate\":\"'", "'\",\"priority\":\"'", "'\",\"isPrivate\":'", "',\"progress\":'", "',\"status\":\"'", "'\",\"statusText\":\"'", "'\",\"assignedTo\":\"'", "'\",\"createdDate\":\"'", "'\",\"completedDate\":\"'", "'\",\"timeLoggedMin\":'", "',\"billableTime\":'", "',\"completedOnTime\":'", "',\"timeEstimated\":'", "'}'"
    };
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_DATEHOUR=5;
    public static final int RULE_ID=9;
    public static final int RULE_WS=13;
    public static final int RULE_CADENA=4;
    public static final int RULE_ANY_OTHER=14;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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


    // $ANTLR start "rule__Task__Alternatives_10"
    // InternalKPIGenerator.g:152:1: rule__Task__Alternatives_10 : ( ( RULE_CADENA ) | ( '-' ) );
    public final void rule__Task__Alternatives_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:156:1: ( ( RULE_CADENA ) | ( '-' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_CADENA) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKPIGenerator.g:157:2: ( RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:157:2: ( RULE_CADENA )
                    // InternalKPIGenerator.g:158:3: RULE_CADENA
                    {
                     before(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_10_0()); 
                    match(input,RULE_CADENA,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_10_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:163:2: ( '-' )
                    {
                    // InternalKPIGenerator.g:163:2: ( '-' )
                    // InternalKPIGenerator.g:164:3: '-'
                    {
                     before(grammarAccess.getTaskAccess().getHyphenMinusKeyword_10_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getHyphenMinusKeyword_10_1()); 

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
    // $ANTLR end "rule__Task__Alternatives_10"


    // $ANTLR start "rule__Task__PriorityAlternatives_16_0"
    // InternalKPIGenerator.g:173:1: rule__Task__PriorityAlternatives_16_0 : ( ( RULE_CADENA ) | ( '-' ) );
    public final void rule__Task__PriorityAlternatives_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:177:1: ( ( RULE_CADENA ) | ( '-' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_CADENA) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:178:2: ( RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:178:2: ( RULE_CADENA )
                    // InternalKPIGenerator.g:179:3: RULE_CADENA
                    {
                     before(grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_16_0_0()); 
                    match(input,RULE_CADENA,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_16_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:184:2: ( '-' )
                    {
                    // InternalKPIGenerator.g:184:2: ( '-' )
                    // InternalKPIGenerator.g:185:3: '-'
                    {
                     before(grammarAccess.getTaskAccess().getPriorityHyphenMinusKeyword_16_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getPriorityHyphenMinusKeyword_16_0_1()); 

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
    // $ANTLR end "rule__Task__PriorityAlternatives_16_0"


    // $ANTLR start "rule__Task__CompletedDateAlternatives_30_0"
    // InternalKPIGenerator.g:194:1: rule__Task__CompletedDateAlternatives_30_0 : ( ( RULE_DATEHOUR ) | ( '-' ) );
    public final void rule__Task__CompletedDateAlternatives_30_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:198:1: ( ( RULE_DATEHOUR ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DATEHOUR) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
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
                     before(grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_30_0_0()); 
                    match(input,RULE_DATEHOUR,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_30_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:205:2: ( '-' )
                    {
                    // InternalKPIGenerator.g:205:2: ( '-' )
                    // InternalKPIGenerator.g:206:3: '-'
                    {
                     before(grammarAccess.getTaskAccess().getCompletedDateHyphenMinusKeyword_30_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getCompletedDateHyphenMinusKeyword_30_0_1()); 

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
    // $ANTLR end "rule__Task__CompletedDateAlternatives_30_0"


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
            match(input,16,FOLLOW_2); 
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
    // InternalKPIGenerator.g:254:1: rule__Root__Group__1__Impl : ( ( ( rule__Root__ProjectsAssignment_1 ) ) ( ( rule__Root__ProjectsAssignment_1 )* ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:258:1: ( ( ( ( rule__Root__ProjectsAssignment_1 ) ) ( ( rule__Root__ProjectsAssignment_1 )* ) ) )
            // InternalKPIGenerator.g:259:1: ( ( ( rule__Root__ProjectsAssignment_1 ) ) ( ( rule__Root__ProjectsAssignment_1 )* ) )
            {
            // InternalKPIGenerator.g:259:1: ( ( ( rule__Root__ProjectsAssignment_1 ) ) ( ( rule__Root__ProjectsAssignment_1 )* ) )
            // InternalKPIGenerator.g:260:2: ( ( rule__Root__ProjectsAssignment_1 ) ) ( ( rule__Root__ProjectsAssignment_1 )* )
            {
            // InternalKPIGenerator.g:260:2: ( ( rule__Root__ProjectsAssignment_1 ) )
            // InternalKPIGenerator.g:261:3: ( rule__Root__ProjectsAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getProjectsAssignment_1()); 
            // InternalKPIGenerator.g:262:3: ( rule__Root__ProjectsAssignment_1 )
            // InternalKPIGenerator.g:262:4: rule__Root__ProjectsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Root__ProjectsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getProjectsAssignment_1()); 

            }

            // InternalKPIGenerator.g:265:2: ( ( rule__Root__ProjectsAssignment_1 )* )
            // InternalKPIGenerator.g:266:3: ( rule__Root__ProjectsAssignment_1 )*
            {
             before(grammarAccess.getRootAccess().getProjectsAssignment_1()); 
            // InternalKPIGenerator.g:267:3: ( rule__Root__ProjectsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKPIGenerator.g:267:4: rule__Root__ProjectsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Root__ProjectsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getProjectsAssignment_1()); 

            }


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
    // InternalKPIGenerator.g:276:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:280:1: ( rule__Root__Group__2__Impl )
            // InternalKPIGenerator.g:281:2: rule__Root__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__2__Impl();

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
    // InternalKPIGenerator.g:287:1: rule__Root__Group__2__Impl : ( ']' ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:291:1: ( ( ']' ) )
            // InternalKPIGenerator.g:292:1: ( ']' )
            {
            // InternalKPIGenerator.g:292:1: ( ']' )
            // InternalKPIGenerator.g:293:2: ']'
            {
             before(grammarAccess.getRootAccess().getRightSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRightSquareBracketKeyword_2()); 

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


    // $ANTLR start "rule__Project__Group__0"
    // InternalKPIGenerator.g:303:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:307:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalKPIGenerator.g:308:2: rule__Project__Group__0__Impl rule__Project__Group__1
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
    // InternalKPIGenerator.g:315:1: rule__Project__Group__0__Impl : ( () ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:319:1: ( ( () ) )
            // InternalKPIGenerator.g:320:1: ( () )
            {
            // InternalKPIGenerator.g:320:1: ( () )
            // InternalKPIGenerator.g:321:2: ()
            {
             before(grammarAccess.getProjectAccess().getProjectAction_0()); 
            // InternalKPIGenerator.g:322:2: ()
            // InternalKPIGenerator.g:322:3: 
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
    // InternalKPIGenerator.g:330:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:334:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalKPIGenerator.g:335:2: rule__Project__Group__1__Impl rule__Project__Group__2
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
    // InternalKPIGenerator.g:342:1: rule__Project__Group__1__Impl : ( '{\"name\":\"' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:346:1: ( ( '{\"name\":\"' ) )
            // InternalKPIGenerator.g:347:1: ( '{\"name\":\"' )
            {
            // InternalKPIGenerator.g:347:1: ( '{\"name\":\"' )
            // InternalKPIGenerator.g:348:2: '{\"name\":\"'
            {
             before(grammarAccess.getProjectAccess().getNameKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKPIGenerator.g:357:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:361:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalKPIGenerator.g:362:2: rule__Project__Group__2__Impl rule__Project__Group__3
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
    // InternalKPIGenerator.g:369:1: rule__Project__Group__2__Impl : ( ( rule__Project__ProjectNameAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:373:1: ( ( ( rule__Project__ProjectNameAssignment_2 ) ) )
            // InternalKPIGenerator.g:374:1: ( ( rule__Project__ProjectNameAssignment_2 ) )
            {
            // InternalKPIGenerator.g:374:1: ( ( rule__Project__ProjectNameAssignment_2 ) )
            // InternalKPIGenerator.g:375:2: ( rule__Project__ProjectNameAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getProjectNameAssignment_2()); 
            // InternalKPIGenerator.g:376:2: ( rule__Project__ProjectNameAssignment_2 )
            // InternalKPIGenerator.g:376:3: rule__Project__ProjectNameAssignment_2
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
    // InternalKPIGenerator.g:384:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:388:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalKPIGenerator.g:389:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:396:1: rule__Project__Group__3__Impl : ( '\",\"phases\":[' ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:400:1: ( ( '\",\"phases\":[' ) )
            // InternalKPIGenerator.g:401:1: ( '\",\"phases\":[' )
            {
            // InternalKPIGenerator.g:401:1: ( '\",\"phases\":[' )
            // InternalKPIGenerator.g:402:2: '\",\"phases\":['
            {
             before(grammarAccess.getProjectAccess().getPhasesKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalKPIGenerator.g:411:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:415:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalKPIGenerator.g:416:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:423:1: rule__Project__Group__4__Impl : ( ( ( rule__Project__PhasesAssignment_4 ) ) ( ( rule__Project__PhasesAssignment_4 )* ) ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:427:1: ( ( ( ( rule__Project__PhasesAssignment_4 ) ) ( ( rule__Project__PhasesAssignment_4 )* ) ) )
            // InternalKPIGenerator.g:428:1: ( ( ( rule__Project__PhasesAssignment_4 ) ) ( ( rule__Project__PhasesAssignment_4 )* ) )
            {
            // InternalKPIGenerator.g:428:1: ( ( ( rule__Project__PhasesAssignment_4 ) ) ( ( rule__Project__PhasesAssignment_4 )* ) )
            // InternalKPIGenerator.g:429:2: ( ( rule__Project__PhasesAssignment_4 ) ) ( ( rule__Project__PhasesAssignment_4 )* )
            {
            // InternalKPIGenerator.g:429:2: ( ( rule__Project__PhasesAssignment_4 ) )
            // InternalKPIGenerator.g:430:3: ( rule__Project__PhasesAssignment_4 )
            {
             before(grammarAccess.getProjectAccess().getPhasesAssignment_4()); 
            // InternalKPIGenerator.g:431:3: ( rule__Project__PhasesAssignment_4 )
            // InternalKPIGenerator.g:431:4: rule__Project__PhasesAssignment_4
            {
            pushFollow(FOLLOW_5);
            rule__Project__PhasesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getPhasesAssignment_4()); 

            }

            // InternalKPIGenerator.g:434:2: ( ( rule__Project__PhasesAssignment_4 )* )
            // InternalKPIGenerator.g:435:3: ( rule__Project__PhasesAssignment_4 )*
            {
             before(grammarAccess.getProjectAccess().getPhasesAssignment_4()); 
            // InternalKPIGenerator.g:436:3: ( rule__Project__PhasesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKPIGenerator.g:436:4: rule__Project__PhasesAssignment_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Project__PhasesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getPhasesAssignment_4()); 

            }


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
    // InternalKPIGenerator.g:445:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:449:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalKPIGenerator.g:450:2: rule__Project__Group__5__Impl rule__Project__Group__6
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
    // InternalKPIGenerator.g:457:1: rule__Project__Group__5__Impl : ( ']}' ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:461:1: ( ( ']}' ) )
            // InternalKPIGenerator.g:462:1: ( ']}' )
            {
            // InternalKPIGenerator.g:462:1: ( ']}' )
            // InternalKPIGenerator.g:463:2: ']}'
            {
             before(grammarAccess.getProjectAccess().getRightSquareBracketRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightSquareBracketRightCurlyBracketKeyword_5()); 

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
    // InternalKPIGenerator.g:472:1: rule__Project__Group__6 : rule__Project__Group__6__Impl ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:476:1: ( rule__Project__Group__6__Impl )
            // InternalKPIGenerator.g:477:2: rule__Project__Group__6__Impl
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
    // InternalKPIGenerator.g:483:1: rule__Project__Group__6__Impl : ( ( ',' )? ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:487:1: ( ( ( ',' )? ) )
            // InternalKPIGenerator.g:488:1: ( ( ',' )? )
            {
            // InternalKPIGenerator.g:488:1: ( ( ',' )? )
            // InternalKPIGenerator.g:489:2: ( ',' )?
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_6()); 
            // InternalKPIGenerator.g:490:2: ( ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:490:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getCommaKeyword_6()); 

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


    // $ANTLR start "rule__Phase__Group__0"
    // InternalKPIGenerator.g:499:1: rule__Phase__Group__0 : rule__Phase__Group__0__Impl rule__Phase__Group__1 ;
    public final void rule__Phase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:503:1: ( rule__Phase__Group__0__Impl rule__Phase__Group__1 )
            // InternalKPIGenerator.g:504:2: rule__Phase__Group__0__Impl rule__Phase__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:511:1: rule__Phase__Group__0__Impl : ( () ) ;
    public final void rule__Phase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:515:1: ( ( () ) )
            // InternalKPIGenerator.g:516:1: ( () )
            {
            // InternalKPIGenerator.g:516:1: ( () )
            // InternalKPIGenerator.g:517:2: ()
            {
             before(grammarAccess.getPhaseAccess().getPhaseAction_0()); 
            // InternalKPIGenerator.g:518:2: ()
            // InternalKPIGenerator.g:518:3: 
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
    // InternalKPIGenerator.g:526:1: rule__Phase__Group__1 : rule__Phase__Group__1__Impl rule__Phase__Group__2 ;
    public final void rule__Phase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:530:1: ( rule__Phase__Group__1__Impl rule__Phase__Group__2 )
            // InternalKPIGenerator.g:531:2: rule__Phase__Group__1__Impl rule__Phase__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:538:1: rule__Phase__Group__1__Impl : ( '{\"name\":\"' ) ;
    public final void rule__Phase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:542:1: ( ( '{\"name\":\"' ) )
            // InternalKPIGenerator.g:543:1: ( '{\"name\":\"' )
            {
            // InternalKPIGenerator.g:543:1: ( '{\"name\":\"' )
            // InternalKPIGenerator.g:544:2: '{\"name\":\"'
            {
             before(grammarAccess.getPhaseAccess().getNameKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getNameKeyword_1()); 

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
    // InternalKPIGenerator.g:553:1: rule__Phase__Group__2 : rule__Phase__Group__2__Impl rule__Phase__Group__3 ;
    public final void rule__Phase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:557:1: ( rule__Phase__Group__2__Impl rule__Phase__Group__3 )
            // InternalKPIGenerator.g:558:2: rule__Phase__Group__2__Impl rule__Phase__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalKPIGenerator.g:565:1: rule__Phase__Group__2__Impl : ( ( rule__Phase__PhaseNameAssignment_2 ) ) ;
    public final void rule__Phase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:569:1: ( ( ( rule__Phase__PhaseNameAssignment_2 ) ) )
            // InternalKPIGenerator.g:570:1: ( ( rule__Phase__PhaseNameAssignment_2 ) )
            {
            // InternalKPIGenerator.g:570:1: ( ( rule__Phase__PhaseNameAssignment_2 ) )
            // InternalKPIGenerator.g:571:2: ( rule__Phase__PhaseNameAssignment_2 )
            {
             before(grammarAccess.getPhaseAccess().getPhaseNameAssignment_2()); 
            // InternalKPIGenerator.g:572:2: ( rule__Phase__PhaseNameAssignment_2 )
            // InternalKPIGenerator.g:572:3: rule__Phase__PhaseNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Phase__PhaseNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getPhaseNameAssignment_2()); 

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
    // InternalKPIGenerator.g:580:1: rule__Phase__Group__3 : rule__Phase__Group__3__Impl rule__Phase__Group__4 ;
    public final void rule__Phase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:584:1: ( rule__Phase__Group__3__Impl rule__Phase__Group__4 )
            // InternalKPIGenerator.g:585:2: rule__Phase__Group__3__Impl rule__Phase__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:592:1: rule__Phase__Group__3__Impl : ( '\",\"tasks\":[' ) ;
    public final void rule__Phase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:596:1: ( ( '\",\"tasks\":[' ) )
            // InternalKPIGenerator.g:597:1: ( '\",\"tasks\":[' )
            {
            // InternalKPIGenerator.g:597:1: ( '\",\"tasks\":[' )
            // InternalKPIGenerator.g:598:2: '\",\"tasks\":['
            {
             before(grammarAccess.getPhaseAccess().getTasksKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getTasksKeyword_3()); 

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
    // InternalKPIGenerator.g:607:1: rule__Phase__Group__4 : rule__Phase__Group__4__Impl rule__Phase__Group__5 ;
    public final void rule__Phase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:611:1: ( rule__Phase__Group__4__Impl rule__Phase__Group__5 )
            // InternalKPIGenerator.g:612:2: rule__Phase__Group__4__Impl rule__Phase__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:619:1: rule__Phase__Group__4__Impl : ( ( ( rule__Phase__TasksAssignment_4 ) ) ( ( rule__Phase__TasksAssignment_4 )* ) ) ;
    public final void rule__Phase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:623:1: ( ( ( ( rule__Phase__TasksAssignment_4 ) ) ( ( rule__Phase__TasksAssignment_4 )* ) ) )
            // InternalKPIGenerator.g:624:1: ( ( ( rule__Phase__TasksAssignment_4 ) ) ( ( rule__Phase__TasksAssignment_4 )* ) )
            {
            // InternalKPIGenerator.g:624:1: ( ( ( rule__Phase__TasksAssignment_4 ) ) ( ( rule__Phase__TasksAssignment_4 )* ) )
            // InternalKPIGenerator.g:625:2: ( ( rule__Phase__TasksAssignment_4 ) ) ( ( rule__Phase__TasksAssignment_4 )* )
            {
            // InternalKPIGenerator.g:625:2: ( ( rule__Phase__TasksAssignment_4 ) )
            // InternalKPIGenerator.g:626:3: ( rule__Phase__TasksAssignment_4 )
            {
             before(grammarAccess.getPhaseAccess().getTasksAssignment_4()); 
            // InternalKPIGenerator.g:627:3: ( rule__Phase__TasksAssignment_4 )
            // InternalKPIGenerator.g:627:4: rule__Phase__TasksAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__Phase__TasksAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getTasksAssignment_4()); 

            }

            // InternalKPIGenerator.g:630:2: ( ( rule__Phase__TasksAssignment_4 )* )
            // InternalKPIGenerator.g:631:3: ( rule__Phase__TasksAssignment_4 )*
            {
             before(grammarAccess.getPhaseAccess().getTasksAssignment_4()); 
            // InternalKPIGenerator.g:632:3: ( rule__Phase__TasksAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKPIGenerator.g:632:4: rule__Phase__TasksAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Phase__TasksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPhaseAccess().getTasksAssignment_4()); 

            }


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
    // InternalKPIGenerator.g:641:1: rule__Phase__Group__5 : rule__Phase__Group__5__Impl rule__Phase__Group__6 ;
    public final void rule__Phase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:645:1: ( rule__Phase__Group__5__Impl rule__Phase__Group__6 )
            // InternalKPIGenerator.g:646:2: rule__Phase__Group__5__Impl rule__Phase__Group__6
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
    // InternalKPIGenerator.g:653:1: rule__Phase__Group__5__Impl : ( ']}' ) ;
    public final void rule__Phase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:657:1: ( ( ']}' ) )
            // InternalKPIGenerator.g:658:1: ( ']}' )
            {
            // InternalKPIGenerator.g:658:1: ( ']}' )
            // InternalKPIGenerator.g:659:2: ']}'
            {
             before(grammarAccess.getPhaseAccess().getRightSquareBracketRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getRightSquareBracketRightCurlyBracketKeyword_5()); 

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
    // InternalKPIGenerator.g:668:1: rule__Phase__Group__6 : rule__Phase__Group__6__Impl ;
    public final void rule__Phase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:672:1: ( rule__Phase__Group__6__Impl )
            // InternalKPIGenerator.g:673:2: rule__Phase__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Group__6__Impl();

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
    // InternalKPIGenerator.g:679:1: rule__Phase__Group__6__Impl : ( ( ',' )? ) ;
    public final void rule__Phase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:683:1: ( ( ( ',' )? ) )
            // InternalKPIGenerator.g:684:1: ( ( ',' )? )
            {
            // InternalKPIGenerator.g:684:1: ( ( ',' )? )
            // InternalKPIGenerator.g:685:2: ( ',' )?
            {
             before(grammarAccess.getPhaseAccess().getCommaKeyword_6()); 
            // InternalKPIGenerator.g:686:2: ( ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKPIGenerator.g:686:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPhaseAccess().getCommaKeyword_6()); 

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


    // $ANTLR start "rule__Task__Group__0"
    // InternalKPIGenerator.g:695:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:699:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalKPIGenerator.g:700:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalKPIGenerator.g:707:1: rule__Task__Group__0__Impl : ( () ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:711:1: ( ( () ) )
            // InternalKPIGenerator.g:712:1: ( () )
            {
            // InternalKPIGenerator.g:712:1: ( () )
            // InternalKPIGenerator.g:713:2: ()
            {
             before(grammarAccess.getTaskAccess().getTaskAction_0()); 
            // InternalKPIGenerator.g:714:2: ()
            // InternalKPIGenerator.g:714:3: 
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
    // InternalKPIGenerator.g:722:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:726:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalKPIGenerator.g:727:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:734:1: rule__Task__Group__1__Impl : ( '{\"id\":' ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:738:1: ( ( '{\"id\":' ) )
            // InternalKPIGenerator.g:739:1: ( '{\"id\":' )
            {
            // InternalKPIGenerator.g:739:1: ( '{\"id\":' )
            // InternalKPIGenerator.g:740:2: '{\"id\":'
            {
             before(grammarAccess.getTaskAccess().getIdKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalKPIGenerator.g:749:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:753:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalKPIGenerator.g:754:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalKPIGenerator.g:761:1: rule__Task__Group__2__Impl : ( ( rule__Task__TaskIdAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:765:1: ( ( ( rule__Task__TaskIdAssignment_2 ) ) )
            // InternalKPIGenerator.g:766:1: ( ( rule__Task__TaskIdAssignment_2 ) )
            {
            // InternalKPIGenerator.g:766:1: ( ( rule__Task__TaskIdAssignment_2 ) )
            // InternalKPIGenerator.g:767:2: ( rule__Task__TaskIdAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getTaskIdAssignment_2()); 
            // InternalKPIGenerator.g:768:2: ( rule__Task__TaskIdAssignment_2 )
            // InternalKPIGenerator.g:768:3: rule__Task__TaskIdAssignment_2
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
    // InternalKPIGenerator.g:776:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:780:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalKPIGenerator.g:781:2: rule__Task__Group__3__Impl rule__Task__Group__4
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
    // InternalKPIGenerator.g:788:1: rule__Task__Group__3__Impl : ( ',\"name\":\"' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:792:1: ( ( ',\"name\":\"' ) )
            // InternalKPIGenerator.g:793:1: ( ',\"name\":\"' )
            {
            // InternalKPIGenerator.g:793:1: ( ',\"name\":\"' )
            // InternalKPIGenerator.g:794:2: ',\"name\":\"'
            {
             before(grammarAccess.getTaskAccess().getNameKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalKPIGenerator.g:803:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:807:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalKPIGenerator.g:808:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalKPIGenerator.g:815:1: rule__Task__Group__4__Impl : ( ( rule__Task__TaskNameAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:819:1: ( ( ( rule__Task__TaskNameAssignment_4 ) ) )
            // InternalKPIGenerator.g:820:1: ( ( rule__Task__TaskNameAssignment_4 ) )
            {
            // InternalKPIGenerator.g:820:1: ( ( rule__Task__TaskNameAssignment_4 ) )
            // InternalKPIGenerator.g:821:2: ( rule__Task__TaskNameAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getTaskNameAssignment_4()); 
            // InternalKPIGenerator.g:822:2: ( rule__Task__TaskNameAssignment_4 )
            // InternalKPIGenerator.g:822:3: rule__Task__TaskNameAssignment_4
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
    // InternalKPIGenerator.g:830:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:834:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalKPIGenerator.g:835:2: rule__Task__Group__5__Impl rule__Task__Group__6
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
    // InternalKPIGenerator.g:842:1: rule__Task__Group__5__Impl : ( '\",\"useCase\":\"' ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:846:1: ( ( '\",\"useCase\":\"' ) )
            // InternalKPIGenerator.g:847:1: ( '\",\"useCase\":\"' )
            {
            // InternalKPIGenerator.g:847:1: ( '\",\"useCase\":\"' )
            // InternalKPIGenerator.g:848:2: '\",\"useCase\":\"'
            {
             before(grammarAccess.getTaskAccess().getUseCaseKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalKPIGenerator.g:857:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:861:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalKPIGenerator.g:862:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalKPIGenerator.g:869:1: rule__Task__Group__6__Impl : ( ( rule__Task__UseCaseAssignment_6 ) ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:873:1: ( ( ( rule__Task__UseCaseAssignment_6 ) ) )
            // InternalKPIGenerator.g:874:1: ( ( rule__Task__UseCaseAssignment_6 ) )
            {
            // InternalKPIGenerator.g:874:1: ( ( rule__Task__UseCaseAssignment_6 ) )
            // InternalKPIGenerator.g:875:2: ( rule__Task__UseCaseAssignment_6 )
            {
             before(grammarAccess.getTaskAccess().getUseCaseAssignment_6()); 
            // InternalKPIGenerator.g:876:2: ( rule__Task__UseCaseAssignment_6 )
            // InternalKPIGenerator.g:876:3: rule__Task__UseCaseAssignment_6
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
    // InternalKPIGenerator.g:884:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:888:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalKPIGenerator.g:889:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalKPIGenerator.g:896:1: rule__Task__Group__7__Impl : ( '\",\"sequenceNumber\":' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:900:1: ( ( '\",\"sequenceNumber\":' ) )
            // InternalKPIGenerator.g:901:1: ( '\",\"sequenceNumber\":' )
            {
            // InternalKPIGenerator.g:901:1: ( '\",\"sequenceNumber\":' )
            // InternalKPIGenerator.g:902:2: '\",\"sequenceNumber\":'
            {
             before(grammarAccess.getTaskAccess().getSequenceNumberKeyword_7()); 
            match(input,26,FOLLOW_2); 
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
    // InternalKPIGenerator.g:911:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:915:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalKPIGenerator.g:916:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalKPIGenerator.g:923:1: rule__Task__Group__8__Impl : ( ( rule__Task__SequenceNumberAssignment_8 ) ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:927:1: ( ( ( rule__Task__SequenceNumberAssignment_8 ) ) )
            // InternalKPIGenerator.g:928:1: ( ( rule__Task__SequenceNumberAssignment_8 ) )
            {
            // InternalKPIGenerator.g:928:1: ( ( rule__Task__SequenceNumberAssignment_8 ) )
            // InternalKPIGenerator.g:929:2: ( rule__Task__SequenceNumberAssignment_8 )
            {
             before(grammarAccess.getTaskAccess().getSequenceNumberAssignment_8()); 
            // InternalKPIGenerator.g:930:2: ( rule__Task__SequenceNumberAssignment_8 )
            // InternalKPIGenerator.g:930:3: rule__Task__SequenceNumberAssignment_8
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
    // InternalKPIGenerator.g:938:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:942:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalKPIGenerator.g:943:2: rule__Task__Group__9__Impl rule__Task__Group__10
            {
            pushFollow(FOLLOW_19);
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
    // InternalKPIGenerator.g:950:1: rule__Task__Group__9__Impl : ( ',\"description\":\"' ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:954:1: ( ( ',\"description\":\"' ) )
            // InternalKPIGenerator.g:955:1: ( ',\"description\":\"' )
            {
            // InternalKPIGenerator.g:955:1: ( ',\"description\":\"' )
            // InternalKPIGenerator.g:956:2: ',\"description\":\"'
            {
             before(grammarAccess.getTaskAccess().getDescriptionKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDescriptionKeyword_9()); 

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
    // InternalKPIGenerator.g:965:1: rule__Task__Group__10 : rule__Task__Group__10__Impl rule__Task__Group__11 ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:969:1: ( rule__Task__Group__10__Impl rule__Task__Group__11 )
            // InternalKPIGenerator.g:970:2: rule__Task__Group__10__Impl rule__Task__Group__11
            {
            pushFollow(FOLLOW_20);
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
    // InternalKPIGenerator.g:977:1: rule__Task__Group__10__Impl : ( ( rule__Task__Alternatives_10 ) ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:981:1: ( ( ( rule__Task__Alternatives_10 ) ) )
            // InternalKPIGenerator.g:982:1: ( ( rule__Task__Alternatives_10 ) )
            {
            // InternalKPIGenerator.g:982:1: ( ( rule__Task__Alternatives_10 ) )
            // InternalKPIGenerator.g:983:2: ( rule__Task__Alternatives_10 )
            {
             before(grammarAccess.getTaskAccess().getAlternatives_10()); 
            // InternalKPIGenerator.g:984:2: ( rule__Task__Alternatives_10 )
            // InternalKPIGenerator.g:984:3: rule__Task__Alternatives_10
            {
            pushFollow(FOLLOW_2);
            rule__Task__Alternatives_10();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAlternatives_10()); 

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
    // InternalKPIGenerator.g:992:1: rule__Task__Group__11 : rule__Task__Group__11__Impl rule__Task__Group__12 ;
    public final void rule__Task__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:996:1: ( rule__Task__Group__11__Impl rule__Task__Group__12 )
            // InternalKPIGenerator.g:997:2: rule__Task__Group__11__Impl rule__Task__Group__12
            {
            pushFollow(FOLLOW_21);
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
    // InternalKPIGenerator.g:1004:1: rule__Task__Group__11__Impl : ( '\",\"startDate\":\"' ) ;
    public final void rule__Task__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1008:1: ( ( '\",\"startDate\":\"' ) )
            // InternalKPIGenerator.g:1009:1: ( '\",\"startDate\":\"' )
            {
            // InternalKPIGenerator.g:1009:1: ( '\",\"startDate\":\"' )
            // InternalKPIGenerator.g:1010:2: '\",\"startDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getStartDateKeyword_11()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStartDateKeyword_11()); 

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
    // InternalKPIGenerator.g:1019:1: rule__Task__Group__12 : rule__Task__Group__12__Impl rule__Task__Group__13 ;
    public final void rule__Task__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1023:1: ( rule__Task__Group__12__Impl rule__Task__Group__13 )
            // InternalKPIGenerator.g:1024:2: rule__Task__Group__12__Impl rule__Task__Group__13
            {
            pushFollow(FOLLOW_22);
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
    // InternalKPIGenerator.g:1031:1: rule__Task__Group__12__Impl : ( ( rule__Task__StartDateAssignment_12 ) ) ;
    public final void rule__Task__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1035:1: ( ( ( rule__Task__StartDateAssignment_12 ) ) )
            // InternalKPIGenerator.g:1036:1: ( ( rule__Task__StartDateAssignment_12 ) )
            {
            // InternalKPIGenerator.g:1036:1: ( ( rule__Task__StartDateAssignment_12 ) )
            // InternalKPIGenerator.g:1037:2: ( rule__Task__StartDateAssignment_12 )
            {
             before(grammarAccess.getTaskAccess().getStartDateAssignment_12()); 
            // InternalKPIGenerator.g:1038:2: ( rule__Task__StartDateAssignment_12 )
            // InternalKPIGenerator.g:1038:3: rule__Task__StartDateAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Task__StartDateAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStartDateAssignment_12()); 

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
    // InternalKPIGenerator.g:1046:1: rule__Task__Group__13 : rule__Task__Group__13__Impl rule__Task__Group__14 ;
    public final void rule__Task__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1050:1: ( rule__Task__Group__13__Impl rule__Task__Group__14 )
            // InternalKPIGenerator.g:1051:2: rule__Task__Group__13__Impl rule__Task__Group__14
            {
            pushFollow(FOLLOW_21);
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
    // InternalKPIGenerator.g:1058:1: rule__Task__Group__13__Impl : ( '\",\"dueDate\":\"' ) ;
    public final void rule__Task__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1062:1: ( ( '\",\"dueDate\":\"' ) )
            // InternalKPIGenerator.g:1063:1: ( '\",\"dueDate\":\"' )
            {
            // InternalKPIGenerator.g:1063:1: ( '\",\"dueDate\":\"' )
            // InternalKPIGenerator.g:1064:2: '\",\"dueDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getDueDateKeyword_13()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDueDateKeyword_13()); 

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
    // InternalKPIGenerator.g:1073:1: rule__Task__Group__14 : rule__Task__Group__14__Impl rule__Task__Group__15 ;
    public final void rule__Task__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1077:1: ( rule__Task__Group__14__Impl rule__Task__Group__15 )
            // InternalKPIGenerator.g:1078:2: rule__Task__Group__14__Impl rule__Task__Group__15
            {
            pushFollow(FOLLOW_23);
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
    // InternalKPIGenerator.g:1085:1: rule__Task__Group__14__Impl : ( ( rule__Task__DueDateAssignment_14 ) ) ;
    public final void rule__Task__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1089:1: ( ( ( rule__Task__DueDateAssignment_14 ) ) )
            // InternalKPIGenerator.g:1090:1: ( ( rule__Task__DueDateAssignment_14 ) )
            {
            // InternalKPIGenerator.g:1090:1: ( ( rule__Task__DueDateAssignment_14 ) )
            // InternalKPIGenerator.g:1091:2: ( rule__Task__DueDateAssignment_14 )
            {
             before(grammarAccess.getTaskAccess().getDueDateAssignment_14()); 
            // InternalKPIGenerator.g:1092:2: ( rule__Task__DueDateAssignment_14 )
            // InternalKPIGenerator.g:1092:3: rule__Task__DueDateAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Task__DueDateAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDueDateAssignment_14()); 

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
    // InternalKPIGenerator.g:1100:1: rule__Task__Group__15 : rule__Task__Group__15__Impl rule__Task__Group__16 ;
    public final void rule__Task__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1104:1: ( rule__Task__Group__15__Impl rule__Task__Group__16 )
            // InternalKPIGenerator.g:1105:2: rule__Task__Group__15__Impl rule__Task__Group__16
            {
            pushFollow(FOLLOW_19);
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
    // InternalKPIGenerator.g:1112:1: rule__Task__Group__15__Impl : ( '\",\"priority\":\"' ) ;
    public final void rule__Task__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1116:1: ( ( '\",\"priority\":\"' ) )
            // InternalKPIGenerator.g:1117:1: ( '\",\"priority\":\"' )
            {
            // InternalKPIGenerator.g:1117:1: ( '\",\"priority\":\"' )
            // InternalKPIGenerator.g:1118:2: '\",\"priority\":\"'
            {
             before(grammarAccess.getTaskAccess().getPriorityKeyword_15()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPriorityKeyword_15()); 

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
    // InternalKPIGenerator.g:1127:1: rule__Task__Group__16 : rule__Task__Group__16__Impl rule__Task__Group__17 ;
    public final void rule__Task__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1131:1: ( rule__Task__Group__16__Impl rule__Task__Group__17 )
            // InternalKPIGenerator.g:1132:2: rule__Task__Group__16__Impl rule__Task__Group__17
            {
            pushFollow(FOLLOW_24);
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
    // InternalKPIGenerator.g:1139:1: rule__Task__Group__16__Impl : ( ( rule__Task__PriorityAssignment_16 ) ) ;
    public final void rule__Task__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1143:1: ( ( ( rule__Task__PriorityAssignment_16 ) ) )
            // InternalKPIGenerator.g:1144:1: ( ( rule__Task__PriorityAssignment_16 ) )
            {
            // InternalKPIGenerator.g:1144:1: ( ( rule__Task__PriorityAssignment_16 ) )
            // InternalKPIGenerator.g:1145:2: ( rule__Task__PriorityAssignment_16 )
            {
             before(grammarAccess.getTaskAccess().getPriorityAssignment_16()); 
            // InternalKPIGenerator.g:1146:2: ( rule__Task__PriorityAssignment_16 )
            // InternalKPIGenerator.g:1146:3: rule__Task__PriorityAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Task__PriorityAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPriorityAssignment_16()); 

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
    // InternalKPIGenerator.g:1154:1: rule__Task__Group__17 : rule__Task__Group__17__Impl rule__Task__Group__18 ;
    public final void rule__Task__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1158:1: ( rule__Task__Group__17__Impl rule__Task__Group__18 )
            // InternalKPIGenerator.g:1159:2: rule__Task__Group__17__Impl rule__Task__Group__18
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
    // InternalKPIGenerator.g:1166:1: rule__Task__Group__17__Impl : ( '\",\"isPrivate\":' ) ;
    public final void rule__Task__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1170:1: ( ( '\",\"isPrivate\":' ) )
            // InternalKPIGenerator.g:1171:1: ( '\",\"isPrivate\":' )
            {
            // InternalKPIGenerator.g:1171:1: ( '\",\"isPrivate\":' )
            // InternalKPIGenerator.g:1172:2: '\",\"isPrivate\":'
            {
             before(grammarAccess.getTaskAccess().getIsPrivateKeyword_17()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIsPrivateKeyword_17()); 

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
    // InternalKPIGenerator.g:1181:1: rule__Task__Group__18 : rule__Task__Group__18__Impl rule__Task__Group__19 ;
    public final void rule__Task__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1185:1: ( rule__Task__Group__18__Impl rule__Task__Group__19 )
            // InternalKPIGenerator.g:1186:2: rule__Task__Group__18__Impl rule__Task__Group__19
            {
            pushFollow(FOLLOW_25);
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
    // InternalKPIGenerator.g:1193:1: rule__Task__Group__18__Impl : ( ( rule__Task__IsPrivateAssignment_18 ) ) ;
    public final void rule__Task__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1197:1: ( ( ( rule__Task__IsPrivateAssignment_18 ) ) )
            // InternalKPIGenerator.g:1198:1: ( ( rule__Task__IsPrivateAssignment_18 ) )
            {
            // InternalKPIGenerator.g:1198:1: ( ( rule__Task__IsPrivateAssignment_18 ) )
            // InternalKPIGenerator.g:1199:2: ( rule__Task__IsPrivateAssignment_18 )
            {
             before(grammarAccess.getTaskAccess().getIsPrivateAssignment_18()); 
            // InternalKPIGenerator.g:1200:2: ( rule__Task__IsPrivateAssignment_18 )
            // InternalKPIGenerator.g:1200:3: rule__Task__IsPrivateAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Task__IsPrivateAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIsPrivateAssignment_18()); 

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
    // InternalKPIGenerator.g:1208:1: rule__Task__Group__19 : rule__Task__Group__19__Impl rule__Task__Group__20 ;
    public final void rule__Task__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1212:1: ( rule__Task__Group__19__Impl rule__Task__Group__20 )
            // InternalKPIGenerator.g:1213:2: rule__Task__Group__19__Impl rule__Task__Group__20
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1220:1: rule__Task__Group__19__Impl : ( ',\"progress\":' ) ;
    public final void rule__Task__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1224:1: ( ( ',\"progress\":' ) )
            // InternalKPIGenerator.g:1225:1: ( ',\"progress\":' )
            {
            // InternalKPIGenerator.g:1225:1: ( ',\"progress\":' )
            // InternalKPIGenerator.g:1226:2: ',\"progress\":'
            {
             before(grammarAccess.getTaskAccess().getProgressKeyword_19()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getProgressKeyword_19()); 

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
    // InternalKPIGenerator.g:1235:1: rule__Task__Group__20 : rule__Task__Group__20__Impl rule__Task__Group__21 ;
    public final void rule__Task__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1239:1: ( rule__Task__Group__20__Impl rule__Task__Group__21 )
            // InternalKPIGenerator.g:1240:2: rule__Task__Group__20__Impl rule__Task__Group__21
            {
            pushFollow(FOLLOW_26);
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
    // InternalKPIGenerator.g:1247:1: rule__Task__Group__20__Impl : ( ( rule__Task__ProgressAssignment_20 ) ) ;
    public final void rule__Task__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1251:1: ( ( ( rule__Task__ProgressAssignment_20 ) ) )
            // InternalKPIGenerator.g:1252:1: ( ( rule__Task__ProgressAssignment_20 ) )
            {
            // InternalKPIGenerator.g:1252:1: ( ( rule__Task__ProgressAssignment_20 ) )
            // InternalKPIGenerator.g:1253:2: ( rule__Task__ProgressAssignment_20 )
            {
             before(grammarAccess.getTaskAccess().getProgressAssignment_20()); 
            // InternalKPIGenerator.g:1254:2: ( rule__Task__ProgressAssignment_20 )
            // InternalKPIGenerator.g:1254:3: rule__Task__ProgressAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__Task__ProgressAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getProgressAssignment_20()); 

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
    // InternalKPIGenerator.g:1262:1: rule__Task__Group__21 : rule__Task__Group__21__Impl rule__Task__Group__22 ;
    public final void rule__Task__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1266:1: ( rule__Task__Group__21__Impl rule__Task__Group__22 )
            // InternalKPIGenerator.g:1267:2: rule__Task__Group__21__Impl rule__Task__Group__22
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
    // InternalKPIGenerator.g:1274:1: rule__Task__Group__21__Impl : ( ',\"status\":\"' ) ;
    public final void rule__Task__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1278:1: ( ( ',\"status\":\"' ) )
            // InternalKPIGenerator.g:1279:1: ( ',\"status\":\"' )
            {
            // InternalKPIGenerator.g:1279:1: ( ',\"status\":\"' )
            // InternalKPIGenerator.g:1280:2: ',\"status\":\"'
            {
             before(grammarAccess.getTaskAccess().getStatusKeyword_21()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStatusKeyword_21()); 

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
    // InternalKPIGenerator.g:1289:1: rule__Task__Group__22 : rule__Task__Group__22__Impl rule__Task__Group__23 ;
    public final void rule__Task__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1293:1: ( rule__Task__Group__22__Impl rule__Task__Group__23 )
            // InternalKPIGenerator.g:1294:2: rule__Task__Group__22__Impl rule__Task__Group__23
            {
            pushFollow(FOLLOW_27);
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
    // InternalKPIGenerator.g:1301:1: rule__Task__Group__22__Impl : ( ( rule__Task__StatusNameAssignment_22 ) ) ;
    public final void rule__Task__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1305:1: ( ( ( rule__Task__StatusNameAssignment_22 ) ) )
            // InternalKPIGenerator.g:1306:1: ( ( rule__Task__StatusNameAssignment_22 ) )
            {
            // InternalKPIGenerator.g:1306:1: ( ( rule__Task__StatusNameAssignment_22 ) )
            // InternalKPIGenerator.g:1307:2: ( rule__Task__StatusNameAssignment_22 )
            {
             before(grammarAccess.getTaskAccess().getStatusNameAssignment_22()); 
            // InternalKPIGenerator.g:1308:2: ( rule__Task__StatusNameAssignment_22 )
            // InternalKPIGenerator.g:1308:3: rule__Task__StatusNameAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Task__StatusNameAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStatusNameAssignment_22()); 

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
    // InternalKPIGenerator.g:1316:1: rule__Task__Group__23 : rule__Task__Group__23__Impl rule__Task__Group__24 ;
    public final void rule__Task__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1320:1: ( rule__Task__Group__23__Impl rule__Task__Group__24 )
            // InternalKPIGenerator.g:1321:2: rule__Task__Group__23__Impl rule__Task__Group__24
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:1328:1: rule__Task__Group__23__Impl : ( '\",\"statusText\":\"' ) ;
    public final void rule__Task__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1332:1: ( ( '\",\"statusText\":\"' ) )
            // InternalKPIGenerator.g:1333:1: ( '\",\"statusText\":\"' )
            {
            // InternalKPIGenerator.g:1333:1: ( '\",\"statusText\":\"' )
            // InternalKPIGenerator.g:1334:2: '\",\"statusText\":\"'
            {
             before(grammarAccess.getTaskAccess().getStatusTextKeyword_23()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStatusTextKeyword_23()); 

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
    // InternalKPIGenerator.g:1343:1: rule__Task__Group__24 : rule__Task__Group__24__Impl rule__Task__Group__25 ;
    public final void rule__Task__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1347:1: ( rule__Task__Group__24__Impl rule__Task__Group__25 )
            // InternalKPIGenerator.g:1348:2: rule__Task__Group__24__Impl rule__Task__Group__25
            {
            pushFollow(FOLLOW_28);
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
    // InternalKPIGenerator.g:1355:1: rule__Task__Group__24__Impl : ( ( rule__Task__StatusTextAssignment_24 ) ) ;
    public final void rule__Task__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1359:1: ( ( ( rule__Task__StatusTextAssignment_24 ) ) )
            // InternalKPIGenerator.g:1360:1: ( ( rule__Task__StatusTextAssignment_24 ) )
            {
            // InternalKPIGenerator.g:1360:1: ( ( rule__Task__StatusTextAssignment_24 ) )
            // InternalKPIGenerator.g:1361:2: ( rule__Task__StatusTextAssignment_24 )
            {
             before(grammarAccess.getTaskAccess().getStatusTextAssignment_24()); 
            // InternalKPIGenerator.g:1362:2: ( rule__Task__StatusTextAssignment_24 )
            // InternalKPIGenerator.g:1362:3: rule__Task__StatusTextAssignment_24
            {
            pushFollow(FOLLOW_2);
            rule__Task__StatusTextAssignment_24();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStatusTextAssignment_24()); 

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
    // InternalKPIGenerator.g:1370:1: rule__Task__Group__25 : rule__Task__Group__25__Impl rule__Task__Group__26 ;
    public final void rule__Task__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1374:1: ( rule__Task__Group__25__Impl rule__Task__Group__26 )
            // InternalKPIGenerator.g:1375:2: rule__Task__Group__25__Impl rule__Task__Group__26
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:1382:1: rule__Task__Group__25__Impl : ( '\",\"assignedTo\":\"' ) ;
    public final void rule__Task__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1386:1: ( ( '\",\"assignedTo\":\"' ) )
            // InternalKPIGenerator.g:1387:1: ( '\",\"assignedTo\":\"' )
            {
            // InternalKPIGenerator.g:1387:1: ( '\",\"assignedTo\":\"' )
            // InternalKPIGenerator.g:1388:2: '\",\"assignedTo\":\"'
            {
             before(grammarAccess.getTaskAccess().getAssignedToKeyword_25()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAssignedToKeyword_25()); 

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
    // InternalKPIGenerator.g:1397:1: rule__Task__Group__26 : rule__Task__Group__26__Impl rule__Task__Group__27 ;
    public final void rule__Task__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1401:1: ( rule__Task__Group__26__Impl rule__Task__Group__27 )
            // InternalKPIGenerator.g:1402:2: rule__Task__Group__26__Impl rule__Task__Group__27
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
    // InternalKPIGenerator.g:1409:1: rule__Task__Group__26__Impl : ( ( rule__Task__AssignedToAssignment_26 ) ) ;
    public final void rule__Task__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1413:1: ( ( ( rule__Task__AssignedToAssignment_26 ) ) )
            // InternalKPIGenerator.g:1414:1: ( ( rule__Task__AssignedToAssignment_26 ) )
            {
            // InternalKPIGenerator.g:1414:1: ( ( rule__Task__AssignedToAssignment_26 ) )
            // InternalKPIGenerator.g:1415:2: ( rule__Task__AssignedToAssignment_26 )
            {
             before(grammarAccess.getTaskAccess().getAssignedToAssignment_26()); 
            // InternalKPIGenerator.g:1416:2: ( rule__Task__AssignedToAssignment_26 )
            // InternalKPIGenerator.g:1416:3: rule__Task__AssignedToAssignment_26
            {
            pushFollow(FOLLOW_2);
            rule__Task__AssignedToAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAssignedToAssignment_26()); 

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
    // InternalKPIGenerator.g:1424:1: rule__Task__Group__27 : rule__Task__Group__27__Impl rule__Task__Group__28 ;
    public final void rule__Task__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1428:1: ( rule__Task__Group__27__Impl rule__Task__Group__28 )
            // InternalKPIGenerator.g:1429:2: rule__Task__Group__27__Impl rule__Task__Group__28
            {
            pushFollow(FOLLOW_30);
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
    // InternalKPIGenerator.g:1436:1: rule__Task__Group__27__Impl : ( '\",\"createdDate\":\"' ) ;
    public final void rule__Task__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1440:1: ( ( '\",\"createdDate\":\"' ) )
            // InternalKPIGenerator.g:1441:1: ( '\",\"createdDate\":\"' )
            {
            // InternalKPIGenerator.g:1441:1: ( '\",\"createdDate\":\"' )
            // InternalKPIGenerator.g:1442:2: '\",\"createdDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getCreatedDateKeyword_27()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateKeyword_27()); 

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
    // InternalKPIGenerator.g:1451:1: rule__Task__Group__28 : rule__Task__Group__28__Impl rule__Task__Group__29 ;
    public final void rule__Task__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1455:1: ( rule__Task__Group__28__Impl rule__Task__Group__29 )
            // InternalKPIGenerator.g:1456:2: rule__Task__Group__28__Impl rule__Task__Group__29
            {
            pushFollow(FOLLOW_31);
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
    // InternalKPIGenerator.g:1463:1: rule__Task__Group__28__Impl : ( ( rule__Task__CreatedDateAssignment_28 ) ) ;
    public final void rule__Task__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1467:1: ( ( ( rule__Task__CreatedDateAssignment_28 ) ) )
            // InternalKPIGenerator.g:1468:1: ( ( rule__Task__CreatedDateAssignment_28 ) )
            {
            // InternalKPIGenerator.g:1468:1: ( ( rule__Task__CreatedDateAssignment_28 ) )
            // InternalKPIGenerator.g:1469:2: ( rule__Task__CreatedDateAssignment_28 )
            {
             before(grammarAccess.getTaskAccess().getCreatedDateAssignment_28()); 
            // InternalKPIGenerator.g:1470:2: ( rule__Task__CreatedDateAssignment_28 )
            // InternalKPIGenerator.g:1470:3: rule__Task__CreatedDateAssignment_28
            {
            pushFollow(FOLLOW_2);
            rule__Task__CreatedDateAssignment_28();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCreatedDateAssignment_28()); 

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
    // InternalKPIGenerator.g:1478:1: rule__Task__Group__29 : rule__Task__Group__29__Impl rule__Task__Group__30 ;
    public final void rule__Task__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1482:1: ( rule__Task__Group__29__Impl rule__Task__Group__30 )
            // InternalKPIGenerator.g:1483:2: rule__Task__Group__29__Impl rule__Task__Group__30
            {
            pushFollow(FOLLOW_32);
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
    // InternalKPIGenerator.g:1490:1: rule__Task__Group__29__Impl : ( '\",\"completedDate\":\"' ) ;
    public final void rule__Task__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1494:1: ( ( '\",\"completedDate\":\"' ) )
            // InternalKPIGenerator.g:1495:1: ( '\",\"completedDate\":\"' )
            {
            // InternalKPIGenerator.g:1495:1: ( '\",\"completedDate\":\"' )
            // InternalKPIGenerator.g:1496:2: '\",\"completedDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getCompletedDateKeyword_29()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedDateKeyword_29()); 

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
    // InternalKPIGenerator.g:1505:1: rule__Task__Group__30 : rule__Task__Group__30__Impl rule__Task__Group__31 ;
    public final void rule__Task__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1509:1: ( rule__Task__Group__30__Impl rule__Task__Group__31 )
            // InternalKPIGenerator.g:1510:2: rule__Task__Group__30__Impl rule__Task__Group__31
            {
            pushFollow(FOLLOW_33);
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
    // InternalKPIGenerator.g:1517:1: rule__Task__Group__30__Impl : ( ( rule__Task__CompletedDateAssignment_30 ) ) ;
    public final void rule__Task__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1521:1: ( ( ( rule__Task__CompletedDateAssignment_30 ) ) )
            // InternalKPIGenerator.g:1522:1: ( ( rule__Task__CompletedDateAssignment_30 ) )
            {
            // InternalKPIGenerator.g:1522:1: ( ( rule__Task__CompletedDateAssignment_30 ) )
            // InternalKPIGenerator.g:1523:2: ( rule__Task__CompletedDateAssignment_30 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAssignment_30()); 
            // InternalKPIGenerator.g:1524:2: ( rule__Task__CompletedDateAssignment_30 )
            // InternalKPIGenerator.g:1524:3: rule__Task__CompletedDateAssignment_30
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAssignment_30();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAssignment_30()); 

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
    // InternalKPIGenerator.g:1532:1: rule__Task__Group__31 : rule__Task__Group__31__Impl rule__Task__Group__32 ;
    public final void rule__Task__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1536:1: ( rule__Task__Group__31__Impl rule__Task__Group__32 )
            // InternalKPIGenerator.g:1537:2: rule__Task__Group__31__Impl rule__Task__Group__32
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1544:1: rule__Task__Group__31__Impl : ( '\",\"timeLoggedMin\":' ) ;
    public final void rule__Task__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1548:1: ( ( '\",\"timeLoggedMin\":' ) )
            // InternalKPIGenerator.g:1549:1: ( '\",\"timeLoggedMin\":' )
            {
            // InternalKPIGenerator.g:1549:1: ( '\",\"timeLoggedMin\":' )
            // InternalKPIGenerator.g:1550:2: '\",\"timeLoggedMin\":'
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_31()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_31()); 

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
    // InternalKPIGenerator.g:1559:1: rule__Task__Group__32 : rule__Task__Group__32__Impl rule__Task__Group__33 ;
    public final void rule__Task__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1563:1: ( rule__Task__Group__32__Impl rule__Task__Group__33 )
            // InternalKPIGenerator.g:1564:2: rule__Task__Group__32__Impl rule__Task__Group__33
            {
            pushFollow(FOLLOW_34);
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
    // InternalKPIGenerator.g:1571:1: rule__Task__Group__32__Impl : ( ( rule__Task__TimeLoggedMinAssignment_32 ) ) ;
    public final void rule__Task__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1575:1: ( ( ( rule__Task__TimeLoggedMinAssignment_32 ) ) )
            // InternalKPIGenerator.g:1576:1: ( ( rule__Task__TimeLoggedMinAssignment_32 ) )
            {
            // InternalKPIGenerator.g:1576:1: ( ( rule__Task__TimeLoggedMinAssignment_32 ) )
            // InternalKPIGenerator.g:1577:2: ( rule__Task__TimeLoggedMinAssignment_32 )
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinAssignment_32()); 
            // InternalKPIGenerator.g:1578:2: ( rule__Task__TimeLoggedMinAssignment_32 )
            // InternalKPIGenerator.g:1578:3: rule__Task__TimeLoggedMinAssignment_32
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeLoggedMinAssignment_32();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeLoggedMinAssignment_32()); 

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
    // InternalKPIGenerator.g:1586:1: rule__Task__Group__33 : rule__Task__Group__33__Impl rule__Task__Group__34 ;
    public final void rule__Task__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1590:1: ( rule__Task__Group__33__Impl rule__Task__Group__34 )
            // InternalKPIGenerator.g:1591:2: rule__Task__Group__33__Impl rule__Task__Group__34
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1598:1: rule__Task__Group__33__Impl : ( ',\"billableTime\":' ) ;
    public final void rule__Task__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1602:1: ( ( ',\"billableTime\":' ) )
            // InternalKPIGenerator.g:1603:1: ( ',\"billableTime\":' )
            {
            // InternalKPIGenerator.g:1603:1: ( ',\"billableTime\":' )
            // InternalKPIGenerator.g:1604:2: ',\"billableTime\":'
            {
             before(grammarAccess.getTaskAccess().getBillableTimeKeyword_33()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableTimeKeyword_33()); 

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
    // InternalKPIGenerator.g:1613:1: rule__Task__Group__34 : rule__Task__Group__34__Impl rule__Task__Group__35 ;
    public final void rule__Task__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1617:1: ( rule__Task__Group__34__Impl rule__Task__Group__35 )
            // InternalKPIGenerator.g:1618:2: rule__Task__Group__34__Impl rule__Task__Group__35
            {
            pushFollow(FOLLOW_35);
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
    // InternalKPIGenerator.g:1625:1: rule__Task__Group__34__Impl : ( ( rule__Task__BillableTimeAssignment_34 ) ) ;
    public final void rule__Task__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1629:1: ( ( ( rule__Task__BillableTimeAssignment_34 ) ) )
            // InternalKPIGenerator.g:1630:1: ( ( rule__Task__BillableTimeAssignment_34 ) )
            {
            // InternalKPIGenerator.g:1630:1: ( ( rule__Task__BillableTimeAssignment_34 ) )
            // InternalKPIGenerator.g:1631:2: ( rule__Task__BillableTimeAssignment_34 )
            {
             before(grammarAccess.getTaskAccess().getBillableTimeAssignment_34()); 
            // InternalKPIGenerator.g:1632:2: ( rule__Task__BillableTimeAssignment_34 )
            // InternalKPIGenerator.g:1632:3: rule__Task__BillableTimeAssignment_34
            {
            pushFollow(FOLLOW_2);
            rule__Task__BillableTimeAssignment_34();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getBillableTimeAssignment_34()); 

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
    // InternalKPIGenerator.g:1640:1: rule__Task__Group__35 : rule__Task__Group__35__Impl rule__Task__Group__36 ;
    public final void rule__Task__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1644:1: ( rule__Task__Group__35__Impl rule__Task__Group__36 )
            // InternalKPIGenerator.g:1645:2: rule__Task__Group__35__Impl rule__Task__Group__36
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
    // InternalKPIGenerator.g:1652:1: rule__Task__Group__35__Impl : ( ',\"completedOnTime\":' ) ;
    public final void rule__Task__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1656:1: ( ( ',\"completedOnTime\":' ) )
            // InternalKPIGenerator.g:1657:1: ( ',\"completedOnTime\":' )
            {
            // InternalKPIGenerator.g:1657:1: ( ',\"completedOnTime\":' )
            // InternalKPIGenerator.g:1658:2: ',\"completedOnTime\":'
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_35()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_35()); 

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
    // InternalKPIGenerator.g:1667:1: rule__Task__Group__36 : rule__Task__Group__36__Impl rule__Task__Group__37 ;
    public final void rule__Task__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1671:1: ( rule__Task__Group__36__Impl rule__Task__Group__37 )
            // InternalKPIGenerator.g:1672:2: rule__Task__Group__36__Impl rule__Task__Group__37
            {
            pushFollow(FOLLOW_36);
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
    // InternalKPIGenerator.g:1679:1: rule__Task__Group__36__Impl : ( ( rule__Task__CompletedOnTimeAssignment_36 ) ) ;
    public final void rule__Task__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1683:1: ( ( ( rule__Task__CompletedOnTimeAssignment_36 ) ) )
            // InternalKPIGenerator.g:1684:1: ( ( rule__Task__CompletedOnTimeAssignment_36 ) )
            {
            // InternalKPIGenerator.g:1684:1: ( ( rule__Task__CompletedOnTimeAssignment_36 ) )
            // InternalKPIGenerator.g:1685:2: ( rule__Task__CompletedOnTimeAssignment_36 )
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_36()); 
            // InternalKPIGenerator.g:1686:2: ( rule__Task__CompletedOnTimeAssignment_36 )
            // InternalKPIGenerator.g:1686:3: rule__Task__CompletedOnTimeAssignment_36
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedOnTimeAssignment_36();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_36()); 

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
    // InternalKPIGenerator.g:1694:1: rule__Task__Group__37 : rule__Task__Group__37__Impl rule__Task__Group__38 ;
    public final void rule__Task__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1698:1: ( rule__Task__Group__37__Impl rule__Task__Group__38 )
            // InternalKPIGenerator.g:1699:2: rule__Task__Group__37__Impl rule__Task__Group__38
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1706:1: rule__Task__Group__37__Impl : ( ',\"timeEstimated\":' ) ;
    public final void rule__Task__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1710:1: ( ( ',\"timeEstimated\":' ) )
            // InternalKPIGenerator.g:1711:1: ( ',\"timeEstimated\":' )
            {
            // InternalKPIGenerator.g:1711:1: ( ',\"timeEstimated\":' )
            // InternalKPIGenerator.g:1712:2: ',\"timeEstimated\":'
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedKeyword_37()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedKeyword_37()); 

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
    // InternalKPIGenerator.g:1721:1: rule__Task__Group__38 : rule__Task__Group__38__Impl rule__Task__Group__39 ;
    public final void rule__Task__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1725:1: ( rule__Task__Group__38__Impl rule__Task__Group__39 )
            // InternalKPIGenerator.g:1726:2: rule__Task__Group__38__Impl rule__Task__Group__39
            {
            pushFollow(FOLLOW_37);
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
    // InternalKPIGenerator.g:1733:1: rule__Task__Group__38__Impl : ( ( rule__Task__TimeEstimatedAssignment_38 ) ) ;
    public final void rule__Task__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1737:1: ( ( ( rule__Task__TimeEstimatedAssignment_38 ) ) )
            // InternalKPIGenerator.g:1738:1: ( ( rule__Task__TimeEstimatedAssignment_38 ) )
            {
            // InternalKPIGenerator.g:1738:1: ( ( rule__Task__TimeEstimatedAssignment_38 ) )
            // InternalKPIGenerator.g:1739:2: ( rule__Task__TimeEstimatedAssignment_38 )
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_38()); 
            // InternalKPIGenerator.g:1740:2: ( rule__Task__TimeEstimatedAssignment_38 )
            // InternalKPIGenerator.g:1740:3: rule__Task__TimeEstimatedAssignment_38
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeEstimatedAssignment_38();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_38()); 

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
    // InternalKPIGenerator.g:1748:1: rule__Task__Group__39 : rule__Task__Group__39__Impl rule__Task__Group__40 ;
    public final void rule__Task__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1752:1: ( rule__Task__Group__39__Impl rule__Task__Group__40 )
            // InternalKPIGenerator.g:1753:2: rule__Task__Group__39__Impl rule__Task__Group__40
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__39__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__40();

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
    // InternalKPIGenerator.g:1760:1: rule__Task__Group__39__Impl : ( '}' ) ;
    public final void rule__Task__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1764:1: ( ( '}' ) )
            // InternalKPIGenerator.g:1765:1: ( '}' )
            {
            // InternalKPIGenerator.g:1765:1: ( '}' )
            // InternalKPIGenerator.g:1766:2: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_39()); 
            match(input,42,FOLLOW_2); 
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


    // $ANTLR start "rule__Task__Group__40"
    // InternalKPIGenerator.g:1775:1: rule__Task__Group__40 : rule__Task__Group__40__Impl ;
    public final void rule__Task__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1779:1: ( rule__Task__Group__40__Impl )
            // InternalKPIGenerator.g:1780:2: rule__Task__Group__40__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__40__Impl();

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
    // $ANTLR end "rule__Task__Group__40"


    // $ANTLR start "rule__Task__Group__40__Impl"
    // InternalKPIGenerator.g:1786:1: rule__Task__Group__40__Impl : ( ( ',' )? ) ;
    public final void rule__Task__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1790:1: ( ( ( ',' )? ) )
            // InternalKPIGenerator.g:1791:1: ( ( ',' )? )
            {
            // InternalKPIGenerator.g:1791:1: ( ( ',' )? )
            // InternalKPIGenerator.g:1792:2: ( ',' )?
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_40()); 
            // InternalKPIGenerator.g:1793:2: ( ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKPIGenerator.g:1793:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getCommaKeyword_40()); 

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
    // $ANTLR end "rule__Task__Group__40__Impl"


    // $ANTLR start "rule__Root__ProjectsAssignment_1"
    // InternalKPIGenerator.g:1802:1: rule__Root__ProjectsAssignment_1 : ( ruleProject ) ;
    public final void rule__Root__ProjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1806:1: ( ( ruleProject ) )
            // InternalKPIGenerator.g:1807:2: ( ruleProject )
            {
            // InternalKPIGenerator.g:1807:2: ( ruleProject )
            // InternalKPIGenerator.g:1808:3: ruleProject
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


    // $ANTLR start "rule__Project__ProjectNameAssignment_2"
    // InternalKPIGenerator.g:1817:1: rule__Project__ProjectNameAssignment_2 : ( RULE_CADENA ) ;
    public final void rule__Project__ProjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1821:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1822:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1822:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1823:3: RULE_CADENA
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
    // InternalKPIGenerator.g:1832:1: rule__Project__PhasesAssignment_4 : ( rulePhase ) ;
    public final void rule__Project__PhasesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1836:1: ( ( rulePhase ) )
            // InternalKPIGenerator.g:1837:2: ( rulePhase )
            {
            // InternalKPIGenerator.g:1837:2: ( rulePhase )
            // InternalKPIGenerator.g:1838:3: rulePhase
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


    // $ANTLR start "rule__Phase__PhaseNameAssignment_2"
    // InternalKPIGenerator.g:1847:1: rule__Phase__PhaseNameAssignment_2 : ( RULE_CADENA ) ;
    public final void rule__Phase__PhaseNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1851:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1852:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1852:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1853:3: RULE_CADENA
            {
             before(grammarAccess.getPhaseAccess().getPhaseNameCADENATerminalRuleCall_2_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getPhaseNameCADENATerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Phase__PhaseNameAssignment_2"


    // $ANTLR start "rule__Phase__TasksAssignment_4"
    // InternalKPIGenerator.g:1862:1: rule__Phase__TasksAssignment_4 : ( ruleTask ) ;
    public final void rule__Phase__TasksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1866:1: ( ( ruleTask ) )
            // InternalKPIGenerator.g:1867:2: ( ruleTask )
            {
            // InternalKPIGenerator.g:1867:2: ( ruleTask )
            // InternalKPIGenerator.g:1868:3: ruleTask
            {
             before(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Phase__TasksAssignment_4"


    // $ANTLR start "rule__Task__TaskIdAssignment_2"
    // InternalKPIGenerator.g:1877:1: rule__Task__TaskIdAssignment_2 : ( RULE_INT ) ;
    public final void rule__Task__TaskIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1881:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1882:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1882:2: ( RULE_INT )
            // InternalKPIGenerator.g:1883:3: RULE_INT
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
    // InternalKPIGenerator.g:1892:1: rule__Task__TaskNameAssignment_4 : ( RULE_CADENA ) ;
    public final void rule__Task__TaskNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1896:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1897:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1897:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1898:3: RULE_CADENA
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
    // InternalKPIGenerator.g:1907:1: rule__Task__UseCaseAssignment_6 : ( RULE_CADENA ) ;
    public final void rule__Task__UseCaseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1911:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1912:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1912:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1913:3: RULE_CADENA
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
    // InternalKPIGenerator.g:1922:1: rule__Task__SequenceNumberAssignment_8 : ( RULE_DOUBLE ) ;
    public final void rule__Task__SequenceNumberAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1926:1: ( ( RULE_DOUBLE ) )
            // InternalKPIGenerator.g:1927:2: ( RULE_DOUBLE )
            {
            // InternalKPIGenerator.g:1927:2: ( RULE_DOUBLE )
            // InternalKPIGenerator.g:1928:3: RULE_DOUBLE
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


    // $ANTLR start "rule__Task__StartDateAssignment_12"
    // InternalKPIGenerator.g:1937:1: rule__Task__StartDateAssignment_12 : ( RULE_DATE ) ;
    public final void rule__Task__StartDateAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1941:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:1942:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:1942:2: ( RULE_DATE )
            // InternalKPIGenerator.g:1943:3: RULE_DATE
            {
             before(grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_12_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__Task__StartDateAssignment_12"


    // $ANTLR start "rule__Task__DueDateAssignment_14"
    // InternalKPIGenerator.g:1952:1: rule__Task__DueDateAssignment_14 : ( RULE_DATE ) ;
    public final void rule__Task__DueDateAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1956:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:1957:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:1957:2: ( RULE_DATE )
            // InternalKPIGenerator.g:1958:3: RULE_DATE
            {
             before(grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_14_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__Task__DueDateAssignment_14"


    // $ANTLR start "rule__Task__PriorityAssignment_16"
    // InternalKPIGenerator.g:1967:1: rule__Task__PriorityAssignment_16 : ( ( rule__Task__PriorityAlternatives_16_0 ) ) ;
    public final void rule__Task__PriorityAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1971:1: ( ( ( rule__Task__PriorityAlternatives_16_0 ) ) )
            // InternalKPIGenerator.g:1972:2: ( ( rule__Task__PriorityAlternatives_16_0 ) )
            {
            // InternalKPIGenerator.g:1972:2: ( ( rule__Task__PriorityAlternatives_16_0 ) )
            // InternalKPIGenerator.g:1973:3: ( rule__Task__PriorityAlternatives_16_0 )
            {
             before(grammarAccess.getTaskAccess().getPriorityAlternatives_16_0()); 
            // InternalKPIGenerator.g:1974:3: ( rule__Task__PriorityAlternatives_16_0 )
            // InternalKPIGenerator.g:1974:4: rule__Task__PriorityAlternatives_16_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__PriorityAlternatives_16_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPriorityAlternatives_16_0()); 

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
    // $ANTLR end "rule__Task__PriorityAssignment_16"


    // $ANTLR start "rule__Task__IsPrivateAssignment_18"
    // InternalKPIGenerator.g:1982:1: rule__Task__IsPrivateAssignment_18 : ( RULE_CADENA ) ;
    public final void rule__Task__IsPrivateAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1986:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1987:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1987:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1988:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getIsPrivateCADENATerminalRuleCall_18_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIsPrivateCADENATerminalRuleCall_18_0()); 

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
    // $ANTLR end "rule__Task__IsPrivateAssignment_18"


    // $ANTLR start "rule__Task__ProgressAssignment_20"
    // InternalKPIGenerator.g:1997:1: rule__Task__ProgressAssignment_20 : ( RULE_INT ) ;
    public final void rule__Task__ProgressAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2001:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2002:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2002:2: ( RULE_INT )
            // InternalKPIGenerator.g:2003:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_20_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_20_0()); 

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
    // $ANTLR end "rule__Task__ProgressAssignment_20"


    // $ANTLR start "rule__Task__StatusNameAssignment_22"
    // InternalKPIGenerator.g:2012:1: rule__Task__StatusNameAssignment_22 : ( RULE_CADENA ) ;
    public final void rule__Task__StatusNameAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2016:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2017:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2017:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2018:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getStatusNameCADENATerminalRuleCall_22_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStatusNameCADENATerminalRuleCall_22_0()); 

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
    // $ANTLR end "rule__Task__StatusNameAssignment_22"


    // $ANTLR start "rule__Task__StatusTextAssignment_24"
    // InternalKPIGenerator.g:2027:1: rule__Task__StatusTextAssignment_24 : ( RULE_CADENA ) ;
    public final void rule__Task__StatusTextAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2031:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2032:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2032:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2033:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getStatusTextCADENATerminalRuleCall_24_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStatusTextCADENATerminalRuleCall_24_0()); 

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
    // $ANTLR end "rule__Task__StatusTextAssignment_24"


    // $ANTLR start "rule__Task__AssignedToAssignment_26"
    // InternalKPIGenerator.g:2042:1: rule__Task__AssignedToAssignment_26 : ( RULE_CADENA ) ;
    public final void rule__Task__AssignedToAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2046:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2047:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2047:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2048:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_26_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_26_0()); 

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
    // $ANTLR end "rule__Task__AssignedToAssignment_26"


    // $ANTLR start "rule__Task__CreatedDateAssignment_28"
    // InternalKPIGenerator.g:2057:1: rule__Task__CreatedDateAssignment_28 : ( RULE_DATEHOUR ) ;
    public final void rule__Task__CreatedDateAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2061:1: ( ( RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:2062:2: ( RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:2062:2: ( RULE_DATEHOUR )
            // InternalKPIGenerator.g:2063:3: RULE_DATEHOUR
            {
             before(grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_28_0()); 
            match(input,RULE_DATEHOUR,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_28_0()); 

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
    // $ANTLR end "rule__Task__CreatedDateAssignment_28"


    // $ANTLR start "rule__Task__CompletedDateAssignment_30"
    // InternalKPIGenerator.g:2072:1: rule__Task__CompletedDateAssignment_30 : ( ( rule__Task__CompletedDateAlternatives_30_0 ) ) ;
    public final void rule__Task__CompletedDateAssignment_30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2076:1: ( ( ( rule__Task__CompletedDateAlternatives_30_0 ) ) )
            // InternalKPIGenerator.g:2077:2: ( ( rule__Task__CompletedDateAlternatives_30_0 ) )
            {
            // InternalKPIGenerator.g:2077:2: ( ( rule__Task__CompletedDateAlternatives_30_0 ) )
            // InternalKPIGenerator.g:2078:3: ( rule__Task__CompletedDateAlternatives_30_0 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAlternatives_30_0()); 
            // InternalKPIGenerator.g:2079:3: ( rule__Task__CompletedDateAlternatives_30_0 )
            // InternalKPIGenerator.g:2079:4: rule__Task__CompletedDateAlternatives_30_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAlternatives_30_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAlternatives_30_0()); 

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
    // $ANTLR end "rule__Task__CompletedDateAssignment_30"


    // $ANTLR start "rule__Task__TimeLoggedMinAssignment_32"
    // InternalKPIGenerator.g:2087:1: rule__Task__TimeLoggedMinAssignment_32 : ( RULE_INT ) ;
    public final void rule__Task__TimeLoggedMinAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2091:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2092:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2092:2: ( RULE_INT )
            // InternalKPIGenerator.g:2093:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_32_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_32_0()); 

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
    // $ANTLR end "rule__Task__TimeLoggedMinAssignment_32"


    // $ANTLR start "rule__Task__BillableTimeAssignment_34"
    // InternalKPIGenerator.g:2102:1: rule__Task__BillableTimeAssignment_34 : ( RULE_INT ) ;
    public final void rule__Task__BillableTimeAssignment_34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2106:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2107:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2107:2: ( RULE_INT )
            // InternalKPIGenerator.g:2108:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_34_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_34_0()); 

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
    // $ANTLR end "rule__Task__BillableTimeAssignment_34"


    // $ANTLR start "rule__Task__CompletedOnTimeAssignment_36"
    // InternalKPIGenerator.g:2117:1: rule__Task__CompletedOnTimeAssignment_36 : ( RULE_CADENA ) ;
    public final void rule__Task__CompletedOnTimeAssignment_36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2121:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2122:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2122:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2123:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_36_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_36_0()); 

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
    // $ANTLR end "rule__Task__CompletedOnTimeAssignment_36"


    // $ANTLR start "rule__Task__TimeEstimatedAssignment_38"
    // InternalKPIGenerator.g:2132:1: rule__Task__TimeEstimatedAssignment_38 : ( RULE_INT ) ;
    public final void rule__Task__TimeEstimatedAssignment_38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2136:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2137:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2137:2: ( RULE_INT )
            // InternalKPIGenerator.g:2138:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_38_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_38_0()); 

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
    // $ANTLR end "rule__Task__TimeEstimatedAssignment_38"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});

}