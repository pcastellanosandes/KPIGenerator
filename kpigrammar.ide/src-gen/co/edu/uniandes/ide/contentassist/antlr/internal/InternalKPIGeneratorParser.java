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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CADENA", "RULE_DATEHOUR", "RULE_INT", "RULE_DOUBLE", "RULE_DATE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\"\"'", "'\"'", "'['", "']'", "'{\"name\":\"'", "'\",\"phases\":['", "']}'", "','", "'\",\"tasks\":['", "'{\"id\":'", "',\"name\":\"'", "'\",\"useCase\":\"'", "',\"sequenceNumber\":'", "',\"description\":\"'", "',\"startDate\":\"'", "'\",\"dueDate\":\"'", "'\",\"priority\":\"'", "'\",\"isPrivate\":'", "',\"progress\":'", "',\"status\":'", "',\"assignedTo\":\"'", "'\",\"createdDate\":\"'", "'\",\"completedDate\":\"'", "'\",\"timeLoggedMin\":'", "',\"billableTime\":'", "',\"completedOnTime\":'", "',\"timeEstimated\":'", "',\"tags\":\"'", "'}'", "'{\"type\":\"'", "'\",\"text\":\"'", "'\"}'"
    };
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


    // $ANTLR start "entryRuleStatus"
    // InternalKPIGenerator.g:153:1: entryRuleStatus : ruleStatus EOF ;
    public final void entryRuleStatus() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:154:1: ( ruleStatus EOF )
            // InternalKPIGenerator.g:155:1: ruleStatus EOF
            {
             before(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_1);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getStatusRule()); 
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
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // InternalKPIGenerator.g:162:1: ruleStatus : ( ( rule__Status__Group__0 ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:166:2: ( ( ( rule__Status__Group__0 ) ) )
            // InternalKPIGenerator.g:167:2: ( ( rule__Status__Group__0 ) )
            {
            // InternalKPIGenerator.g:167:2: ( ( rule__Status__Group__0 ) )
            // InternalKPIGenerator.g:168:3: ( rule__Status__Group__0 )
            {
             before(grammarAccess.getStatusAccess().getGroup()); 
            // InternalKPIGenerator.g:169:3: ( rule__Status__Group__0 )
            // InternalKPIGenerator.g:169:4: rule__Status__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Status__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getGroup()); 

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
    // $ANTLR end "ruleStatus"


    // $ANTLR start "rule__Task__PriorityAlternatives_16_0"
    // InternalKPIGenerator.g:177:1: rule__Task__PriorityAlternatives_16_0 : ( ( RULE_CADENA ) | ( '\"\"' ) );
    public final void rule__Task__PriorityAlternatives_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:181:1: ( ( RULE_CADENA ) | ( '\"\"' ) )
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
                    // InternalKPIGenerator.g:182:2: ( RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:182:2: ( RULE_CADENA )
                    // InternalKPIGenerator.g:183:3: RULE_CADENA
                    {
                     before(grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_16_0_0()); 
                    match(input,RULE_CADENA,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_16_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:188:2: ( '\"\"' )
                    {
                    // InternalKPIGenerator.g:188:2: ( '\"\"' )
                    // InternalKPIGenerator.g:189:3: '\"\"'
                    {
                     before(grammarAccess.getTaskAccess().getPriorityQuotationMarkQuotationMarkKeyword_16_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getPriorityQuotationMarkQuotationMarkKeyword_16_0_1()); 

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


    // $ANTLR start "rule__Task__CompletedDateAlternatives_28_0"
    // InternalKPIGenerator.g:198:1: rule__Task__CompletedDateAlternatives_28_0 : ( ( RULE_DATEHOUR ) | ( '\"\"' ) );
    public final void rule__Task__CompletedDateAlternatives_28_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:202:1: ( ( RULE_DATEHOUR ) | ( '\"\"' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DATEHOUR) ) {
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
                    // InternalKPIGenerator.g:203:2: ( RULE_DATEHOUR )
                    {
                    // InternalKPIGenerator.g:203:2: ( RULE_DATEHOUR )
                    // InternalKPIGenerator.g:204:3: RULE_DATEHOUR
                    {
                     before(grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_28_0_0()); 
                    match(input,RULE_DATEHOUR,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_28_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:209:2: ( '\"\"' )
                    {
                    // InternalKPIGenerator.g:209:2: ( '\"\"' )
                    // InternalKPIGenerator.g:210:3: '\"\"'
                    {
                     before(grammarAccess.getTaskAccess().getCompletedDateQuotationMarkQuotationMarkKeyword_28_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getCompletedDateQuotationMarkQuotationMarkKeyword_28_0_1()); 

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
    // $ANTLR end "rule__Task__CompletedDateAlternatives_28_0"


    // $ANTLR start "rule__Task__TagsAlternatives_38_0"
    // InternalKPIGenerator.g:219:1: rule__Task__TagsAlternatives_38_0 : ( ( RULE_CADENA ) | ( '\"' ) );
    public final void rule__Task__TagsAlternatives_38_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:223:1: ( ( RULE_CADENA ) | ( '\"' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_CADENA) ) {
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
                    // InternalKPIGenerator.g:224:2: ( RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:224:2: ( RULE_CADENA )
                    // InternalKPIGenerator.g:225:3: RULE_CADENA
                    {
                     before(grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_38_0_0()); 
                    match(input,RULE_CADENA,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_38_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:230:2: ( '\"' )
                    {
                    // InternalKPIGenerator.g:230:2: ( '\"' )
                    // InternalKPIGenerator.g:231:3: '\"'
                    {
                     before(grammarAccess.getTaskAccess().getTagsQuotationMarkKeyword_38_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getTagsQuotationMarkKeyword_38_0_1()); 

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
    // $ANTLR end "rule__Task__TagsAlternatives_38_0"


    // $ANTLR start "rule__Root__Group__0"
    // InternalKPIGenerator.g:240:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:244:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalKPIGenerator.g:245:2: rule__Root__Group__0__Impl rule__Root__Group__1
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
    // InternalKPIGenerator.g:252:1: rule__Root__Group__0__Impl : ( '[' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:256:1: ( ( '[' ) )
            // InternalKPIGenerator.g:257:1: ( '[' )
            {
            // InternalKPIGenerator.g:257:1: ( '[' )
            // InternalKPIGenerator.g:258:2: '['
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
    // InternalKPIGenerator.g:267:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:271:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalKPIGenerator.g:272:2: rule__Root__Group__1__Impl rule__Root__Group__2
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
    // InternalKPIGenerator.g:279:1: rule__Root__Group__1__Impl : ( ( rule__Root__ProjectsAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:283:1: ( ( ( rule__Root__ProjectsAssignment_1 ) ) )
            // InternalKPIGenerator.g:284:1: ( ( rule__Root__ProjectsAssignment_1 ) )
            {
            // InternalKPIGenerator.g:284:1: ( ( rule__Root__ProjectsAssignment_1 ) )
            // InternalKPIGenerator.g:285:2: ( rule__Root__ProjectsAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getProjectsAssignment_1()); 
            // InternalKPIGenerator.g:286:2: ( rule__Root__ProjectsAssignment_1 )
            // InternalKPIGenerator.g:286:3: rule__Root__ProjectsAssignment_1
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
    // InternalKPIGenerator.g:294:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:298:1: ( rule__Root__Group__2__Impl )
            // InternalKPIGenerator.g:299:2: rule__Root__Group__2__Impl
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
    // InternalKPIGenerator.g:305:1: rule__Root__Group__2__Impl : ( ']' ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:309:1: ( ( ']' ) )
            // InternalKPIGenerator.g:310:1: ( ']' )
            {
            // InternalKPIGenerator.g:310:1: ( ']' )
            // InternalKPIGenerator.g:311:2: ']'
            {
             before(grammarAccess.getRootAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKPIGenerator.g:321:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:325:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalKPIGenerator.g:326:2: rule__Project__Group__0__Impl rule__Project__Group__1
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
    // InternalKPIGenerator.g:333:1: rule__Project__Group__0__Impl : ( () ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:337:1: ( ( () ) )
            // InternalKPIGenerator.g:338:1: ( () )
            {
            // InternalKPIGenerator.g:338:1: ( () )
            // InternalKPIGenerator.g:339:2: ()
            {
             before(grammarAccess.getProjectAccess().getProjectAction_0()); 
            // InternalKPIGenerator.g:340:2: ()
            // InternalKPIGenerator.g:340:3: 
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
    // InternalKPIGenerator.g:348:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:352:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalKPIGenerator.g:353:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:360:1: rule__Project__Group__1__Impl : ( '{\"name\":\"' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:364:1: ( ( '{\"name\":\"' ) )
            // InternalKPIGenerator.g:365:1: ( '{\"name\":\"' )
            {
            // InternalKPIGenerator.g:365:1: ( '{\"name\":\"' )
            // InternalKPIGenerator.g:366:2: '{\"name\":\"'
            {
             before(grammarAccess.getProjectAccess().getNameKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalKPIGenerator.g:375:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:379:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalKPIGenerator.g:380:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:387:1: rule__Project__Group__2__Impl : ( ( rule__Project__ProjectNameAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:391:1: ( ( ( rule__Project__ProjectNameAssignment_2 ) ) )
            // InternalKPIGenerator.g:392:1: ( ( rule__Project__ProjectNameAssignment_2 ) )
            {
            // InternalKPIGenerator.g:392:1: ( ( rule__Project__ProjectNameAssignment_2 ) )
            // InternalKPIGenerator.g:393:2: ( rule__Project__ProjectNameAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getProjectNameAssignment_2()); 
            // InternalKPIGenerator.g:394:2: ( rule__Project__ProjectNameAssignment_2 )
            // InternalKPIGenerator.g:394:3: rule__Project__ProjectNameAssignment_2
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
    // InternalKPIGenerator.g:402:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:406:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalKPIGenerator.g:407:2: rule__Project__Group__3__Impl rule__Project__Group__4
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
    // InternalKPIGenerator.g:414:1: rule__Project__Group__3__Impl : ( '\",\"phases\":[' ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:418:1: ( ( '\",\"phases\":[' ) )
            // InternalKPIGenerator.g:419:1: ( '\",\"phases\":[' )
            {
            // InternalKPIGenerator.g:419:1: ( '\",\"phases\":[' )
            // InternalKPIGenerator.g:420:2: '\",\"phases\":['
            {
             before(grammarAccess.getProjectAccess().getPhasesKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalKPIGenerator.g:429:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:433:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalKPIGenerator.g:434:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalKPIGenerator.g:441:1: rule__Project__Group__4__Impl : ( ( rule__Project__PhasesAssignment_4 ) ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:445:1: ( ( ( rule__Project__PhasesAssignment_4 ) ) )
            // InternalKPIGenerator.g:446:1: ( ( rule__Project__PhasesAssignment_4 ) )
            {
            // InternalKPIGenerator.g:446:1: ( ( rule__Project__PhasesAssignment_4 ) )
            // InternalKPIGenerator.g:447:2: ( rule__Project__PhasesAssignment_4 )
            {
             before(grammarAccess.getProjectAccess().getPhasesAssignment_4()); 
            // InternalKPIGenerator.g:448:2: ( rule__Project__PhasesAssignment_4 )
            // InternalKPIGenerator.g:448:3: rule__Project__PhasesAssignment_4
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
    // InternalKPIGenerator.g:456:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:460:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalKPIGenerator.g:461:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:468:1: rule__Project__Group__5__Impl : ( ']}' ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:472:1: ( ( ']}' ) )
            // InternalKPIGenerator.g:473:1: ( ']}' )
            {
            // InternalKPIGenerator.g:473:1: ( ']}' )
            // InternalKPIGenerator.g:474:2: ']}'
            {
             before(grammarAccess.getProjectAccess().getRightSquareBracketRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalKPIGenerator.g:483:1: rule__Project__Group__6 : rule__Project__Group__6__Impl ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:487:1: ( rule__Project__Group__6__Impl )
            // InternalKPIGenerator.g:488:2: rule__Project__Group__6__Impl
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
    // InternalKPIGenerator.g:494:1: rule__Project__Group__6__Impl : ( ( ',' )? ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:498:1: ( ( ( ',' )? ) )
            // InternalKPIGenerator.g:499:1: ( ( ',' )? )
            {
            // InternalKPIGenerator.g:499:1: ( ( ',' )? )
            // InternalKPIGenerator.g:500:2: ( ',' )?
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_6()); 
            // InternalKPIGenerator.g:501:2: ( ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:501:3: ','
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalKPIGenerator.g:510:1: rule__Phase__Group__0 : rule__Phase__Group__0__Impl rule__Phase__Group__1 ;
    public final void rule__Phase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:514:1: ( rule__Phase__Group__0__Impl rule__Phase__Group__1 )
            // InternalKPIGenerator.g:515:2: rule__Phase__Group__0__Impl rule__Phase__Group__1
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
    // InternalKPIGenerator.g:522:1: rule__Phase__Group__0__Impl : ( () ) ;
    public final void rule__Phase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:526:1: ( ( () ) )
            // InternalKPIGenerator.g:527:1: ( () )
            {
            // InternalKPIGenerator.g:527:1: ( () )
            // InternalKPIGenerator.g:528:2: ()
            {
             before(grammarAccess.getPhaseAccess().getPhaseAction_0()); 
            // InternalKPIGenerator.g:529:2: ()
            // InternalKPIGenerator.g:529:3: 
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
    // InternalKPIGenerator.g:537:1: rule__Phase__Group__1 : rule__Phase__Group__1__Impl rule__Phase__Group__2 ;
    public final void rule__Phase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:541:1: ( rule__Phase__Group__1__Impl rule__Phase__Group__2 )
            // InternalKPIGenerator.g:542:2: rule__Phase__Group__1__Impl rule__Phase__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:549:1: rule__Phase__Group__1__Impl : ( '{\"name\":\"' ) ;
    public final void rule__Phase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:553:1: ( ( '{\"name\":\"' ) )
            // InternalKPIGenerator.g:554:1: ( '{\"name\":\"' )
            {
            // InternalKPIGenerator.g:554:1: ( '{\"name\":\"' )
            // InternalKPIGenerator.g:555:2: '{\"name\":\"'
            {
             before(grammarAccess.getPhaseAccess().getNameKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalKPIGenerator.g:564:1: rule__Phase__Group__2 : rule__Phase__Group__2__Impl rule__Phase__Group__3 ;
    public final void rule__Phase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:568:1: ( rule__Phase__Group__2__Impl rule__Phase__Group__3 )
            // InternalKPIGenerator.g:569:2: rule__Phase__Group__2__Impl rule__Phase__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIGenerator.g:576:1: rule__Phase__Group__2__Impl : ( ( rule__Phase__PhaseNameAssignment_2 ) ) ;
    public final void rule__Phase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:580:1: ( ( ( rule__Phase__PhaseNameAssignment_2 ) ) )
            // InternalKPIGenerator.g:581:1: ( ( rule__Phase__PhaseNameAssignment_2 ) )
            {
            // InternalKPIGenerator.g:581:1: ( ( rule__Phase__PhaseNameAssignment_2 ) )
            // InternalKPIGenerator.g:582:2: ( rule__Phase__PhaseNameAssignment_2 )
            {
             before(grammarAccess.getPhaseAccess().getPhaseNameAssignment_2()); 
            // InternalKPIGenerator.g:583:2: ( rule__Phase__PhaseNameAssignment_2 )
            // InternalKPIGenerator.g:583:3: rule__Phase__PhaseNameAssignment_2
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
    // InternalKPIGenerator.g:591:1: rule__Phase__Group__3 : rule__Phase__Group__3__Impl rule__Phase__Group__4 ;
    public final void rule__Phase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:595:1: ( rule__Phase__Group__3__Impl rule__Phase__Group__4 )
            // InternalKPIGenerator.g:596:2: rule__Phase__Group__3__Impl rule__Phase__Group__4
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
    // InternalKPIGenerator.g:603:1: rule__Phase__Group__3__Impl : ( '\",\"tasks\":[' ) ;
    public final void rule__Phase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:607:1: ( ( '\",\"tasks\":[' ) )
            // InternalKPIGenerator.g:608:1: ( '\",\"tasks\":[' )
            {
            // InternalKPIGenerator.g:608:1: ( '\",\"tasks\":[' )
            // InternalKPIGenerator.g:609:2: '\",\"tasks\":['
            {
             before(grammarAccess.getPhaseAccess().getTasksKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalKPIGenerator.g:618:1: rule__Phase__Group__4 : rule__Phase__Group__4__Impl rule__Phase__Group__5 ;
    public final void rule__Phase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:622:1: ( rule__Phase__Group__4__Impl rule__Phase__Group__5 )
            // InternalKPIGenerator.g:623:2: rule__Phase__Group__4__Impl rule__Phase__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalKPIGenerator.g:630:1: rule__Phase__Group__4__Impl : ( ( rule__Phase__TasksAssignment_4 ) ) ;
    public final void rule__Phase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:634:1: ( ( ( rule__Phase__TasksAssignment_4 ) ) )
            // InternalKPIGenerator.g:635:1: ( ( rule__Phase__TasksAssignment_4 ) )
            {
            // InternalKPIGenerator.g:635:1: ( ( rule__Phase__TasksAssignment_4 ) )
            // InternalKPIGenerator.g:636:2: ( rule__Phase__TasksAssignment_4 )
            {
             before(grammarAccess.getPhaseAccess().getTasksAssignment_4()); 
            // InternalKPIGenerator.g:637:2: ( rule__Phase__TasksAssignment_4 )
            // InternalKPIGenerator.g:637:3: rule__Phase__TasksAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Phase__TasksAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getTasksAssignment_4()); 

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
    // InternalKPIGenerator.g:645:1: rule__Phase__Group__5 : rule__Phase__Group__5__Impl rule__Phase__Group__6 ;
    public final void rule__Phase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:649:1: ( rule__Phase__Group__5__Impl rule__Phase__Group__6 )
            // InternalKPIGenerator.g:650:2: rule__Phase__Group__5__Impl rule__Phase__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:657:1: rule__Phase__Group__5__Impl : ( ']}' ) ;
    public final void rule__Phase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:661:1: ( ( ']}' ) )
            // InternalKPIGenerator.g:662:1: ( ']}' )
            {
            // InternalKPIGenerator.g:662:1: ( ']}' )
            // InternalKPIGenerator.g:663:2: ']}'
            {
             before(grammarAccess.getPhaseAccess().getRightSquareBracketRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalKPIGenerator.g:672:1: rule__Phase__Group__6 : rule__Phase__Group__6__Impl ;
    public final void rule__Phase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:676:1: ( rule__Phase__Group__6__Impl )
            // InternalKPIGenerator.g:677:2: rule__Phase__Group__6__Impl
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
    // InternalKPIGenerator.g:683:1: rule__Phase__Group__6__Impl : ( ( ',' )? ) ;
    public final void rule__Phase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:687:1: ( ( ( ',' )? ) )
            // InternalKPIGenerator.g:688:1: ( ( ',' )? )
            {
            // InternalKPIGenerator.g:688:1: ( ( ',' )? )
            // InternalKPIGenerator.g:689:2: ( ',' )?
            {
             before(grammarAccess.getPhaseAccess().getCommaKeyword_6()); 
            // InternalKPIGenerator.g:690:2: ( ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:690:3: ','
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalKPIGenerator.g:699:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:703:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalKPIGenerator.g:704:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalKPIGenerator.g:711:1: rule__Task__Group__0__Impl : ( () ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:715:1: ( ( () ) )
            // InternalKPIGenerator.g:716:1: ( () )
            {
            // InternalKPIGenerator.g:716:1: ( () )
            // InternalKPIGenerator.g:717:2: ()
            {
             before(grammarAccess.getTaskAccess().getTaskAction_0()); 
            // InternalKPIGenerator.g:718:2: ()
            // InternalKPIGenerator.g:718:3: 
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
    // InternalKPIGenerator.g:726:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:730:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalKPIGenerator.g:731:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:738:1: rule__Task__Group__1__Impl : ( '{\"id\":' ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:742:1: ( ( '{\"id\":' ) )
            // InternalKPIGenerator.g:743:1: ( '{\"id\":' )
            {
            // InternalKPIGenerator.g:743:1: ( '{\"id\":' )
            // InternalKPIGenerator.g:744:2: '{\"id\":'
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
    // InternalKPIGenerator.g:753:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:757:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalKPIGenerator.g:758:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalKPIGenerator.g:765:1: rule__Task__Group__2__Impl : ( ( rule__Task__TaskIdAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:769:1: ( ( ( rule__Task__TaskIdAssignment_2 ) ) )
            // InternalKPIGenerator.g:770:1: ( ( rule__Task__TaskIdAssignment_2 ) )
            {
            // InternalKPIGenerator.g:770:1: ( ( rule__Task__TaskIdAssignment_2 ) )
            // InternalKPIGenerator.g:771:2: ( rule__Task__TaskIdAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getTaskIdAssignment_2()); 
            // InternalKPIGenerator.g:772:2: ( rule__Task__TaskIdAssignment_2 )
            // InternalKPIGenerator.g:772:3: rule__Task__TaskIdAssignment_2
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
    // InternalKPIGenerator.g:780:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:784:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalKPIGenerator.g:785:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:792:1: rule__Task__Group__3__Impl : ( ',\"name\":\"' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:796:1: ( ( ',\"name\":\"' ) )
            // InternalKPIGenerator.g:797:1: ( ',\"name\":\"' )
            {
            // InternalKPIGenerator.g:797:1: ( ',\"name\":\"' )
            // InternalKPIGenerator.g:798:2: ',\"name\":\"'
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
    // InternalKPIGenerator.g:807:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:811:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalKPIGenerator.g:812:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:819:1: rule__Task__Group__4__Impl : ( ( rule__Task__TaskNameAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:823:1: ( ( ( rule__Task__TaskNameAssignment_4 ) ) )
            // InternalKPIGenerator.g:824:1: ( ( rule__Task__TaskNameAssignment_4 ) )
            {
            // InternalKPIGenerator.g:824:1: ( ( rule__Task__TaskNameAssignment_4 ) )
            // InternalKPIGenerator.g:825:2: ( rule__Task__TaskNameAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getTaskNameAssignment_4()); 
            // InternalKPIGenerator.g:826:2: ( rule__Task__TaskNameAssignment_4 )
            // InternalKPIGenerator.g:826:3: rule__Task__TaskNameAssignment_4
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
    // InternalKPIGenerator.g:834:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:838:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalKPIGenerator.g:839:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:846:1: rule__Task__Group__5__Impl : ( '\",\"useCase\":\"' ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:850:1: ( ( '\",\"useCase\":\"' ) )
            // InternalKPIGenerator.g:851:1: ( '\",\"useCase\":\"' )
            {
            // InternalKPIGenerator.g:851:1: ( '\",\"useCase\":\"' )
            // InternalKPIGenerator.g:852:2: '\",\"useCase\":\"'
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
    // InternalKPIGenerator.g:861:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:865:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalKPIGenerator.g:866:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalKPIGenerator.g:873:1: rule__Task__Group__6__Impl : ( ( rule__Task__UseCaseAssignment_6 ) ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:877:1: ( ( ( rule__Task__UseCaseAssignment_6 ) ) )
            // InternalKPIGenerator.g:878:1: ( ( rule__Task__UseCaseAssignment_6 ) )
            {
            // InternalKPIGenerator.g:878:1: ( ( rule__Task__UseCaseAssignment_6 ) )
            // InternalKPIGenerator.g:879:2: ( rule__Task__UseCaseAssignment_6 )
            {
             before(grammarAccess.getTaskAccess().getUseCaseAssignment_6()); 
            // InternalKPIGenerator.g:880:2: ( rule__Task__UseCaseAssignment_6 )
            // InternalKPIGenerator.g:880:3: rule__Task__UseCaseAssignment_6
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
    // InternalKPIGenerator.g:888:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:892:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalKPIGenerator.g:893:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalKPIGenerator.g:900:1: rule__Task__Group__7__Impl : ( ',\"sequenceNumber\":' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:904:1: ( ( ',\"sequenceNumber\":' ) )
            // InternalKPIGenerator.g:905:1: ( ',\"sequenceNumber\":' )
            {
            // InternalKPIGenerator.g:905:1: ( ',\"sequenceNumber\":' )
            // InternalKPIGenerator.g:906:2: ',\"sequenceNumber\":'
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
    // InternalKPIGenerator.g:915:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:919:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalKPIGenerator.g:920:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalKPIGenerator.g:927:1: rule__Task__Group__8__Impl : ( ( rule__Task__SequenceNumberAssignment_8 ) ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:931:1: ( ( ( rule__Task__SequenceNumberAssignment_8 ) ) )
            // InternalKPIGenerator.g:932:1: ( ( rule__Task__SequenceNumberAssignment_8 ) )
            {
            // InternalKPIGenerator.g:932:1: ( ( rule__Task__SequenceNumberAssignment_8 ) )
            // InternalKPIGenerator.g:933:2: ( rule__Task__SequenceNumberAssignment_8 )
            {
             before(grammarAccess.getTaskAccess().getSequenceNumberAssignment_8()); 
            // InternalKPIGenerator.g:934:2: ( rule__Task__SequenceNumberAssignment_8 )
            // InternalKPIGenerator.g:934:3: rule__Task__SequenceNumberAssignment_8
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
    // InternalKPIGenerator.g:942:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:946:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalKPIGenerator.g:947:2: rule__Task__Group__9__Impl rule__Task__Group__10
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:954:1: rule__Task__Group__9__Impl : ( ',\"description\":\"' ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:958:1: ( ( ',\"description\":\"' ) )
            // InternalKPIGenerator.g:959:1: ( ',\"description\":\"' )
            {
            // InternalKPIGenerator.g:959:1: ( ',\"description\":\"' )
            // InternalKPIGenerator.g:960:2: ',\"description\":\"'
            {
             before(grammarAccess.getTaskAccess().getDescriptionKeyword_9()); 
            match(input,28,FOLLOW_2); 
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
    // InternalKPIGenerator.g:969:1: rule__Task__Group__10 : rule__Task__Group__10__Impl rule__Task__Group__11 ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:973:1: ( rule__Task__Group__10__Impl rule__Task__Group__11 )
            // InternalKPIGenerator.g:974:2: rule__Task__Group__10__Impl rule__Task__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalKPIGenerator.g:981:1: rule__Task__Group__10__Impl : ( ( rule__Task__DescriptionAssignment_10 ) ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:985:1: ( ( ( rule__Task__DescriptionAssignment_10 ) ) )
            // InternalKPIGenerator.g:986:1: ( ( rule__Task__DescriptionAssignment_10 ) )
            {
            // InternalKPIGenerator.g:986:1: ( ( rule__Task__DescriptionAssignment_10 ) )
            // InternalKPIGenerator.g:987:2: ( rule__Task__DescriptionAssignment_10 )
            {
             before(grammarAccess.getTaskAccess().getDescriptionAssignment_10()); 
            // InternalKPIGenerator.g:988:2: ( rule__Task__DescriptionAssignment_10 )
            // InternalKPIGenerator.g:988:3: rule__Task__DescriptionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Task__DescriptionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDescriptionAssignment_10()); 

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
    // InternalKPIGenerator.g:996:1: rule__Task__Group__11 : rule__Task__Group__11__Impl rule__Task__Group__12 ;
    public final void rule__Task__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1000:1: ( rule__Task__Group__11__Impl rule__Task__Group__12 )
            // InternalKPIGenerator.g:1001:2: rule__Task__Group__11__Impl rule__Task__Group__12
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
    // InternalKPIGenerator.g:1008:1: rule__Task__Group__11__Impl : ( ',\"startDate\":\"' ) ;
    public final void rule__Task__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1012:1: ( ( ',\"startDate\":\"' ) )
            // InternalKPIGenerator.g:1013:1: ( ',\"startDate\":\"' )
            {
            // InternalKPIGenerator.g:1013:1: ( ',\"startDate\":\"' )
            // InternalKPIGenerator.g:1014:2: ',\"startDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getStartDateKeyword_11()); 
            match(input,29,FOLLOW_2); 
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
    // InternalKPIGenerator.g:1023:1: rule__Task__Group__12 : rule__Task__Group__12__Impl rule__Task__Group__13 ;
    public final void rule__Task__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1027:1: ( rule__Task__Group__12__Impl rule__Task__Group__13 )
            // InternalKPIGenerator.g:1028:2: rule__Task__Group__12__Impl rule__Task__Group__13
            {
            pushFollow(FOLLOW_19);
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
    // InternalKPIGenerator.g:1035:1: rule__Task__Group__12__Impl : ( ( rule__Task__StartDateAssignment_12 ) ) ;
    public final void rule__Task__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1039:1: ( ( ( rule__Task__StartDateAssignment_12 ) ) )
            // InternalKPIGenerator.g:1040:1: ( ( rule__Task__StartDateAssignment_12 ) )
            {
            // InternalKPIGenerator.g:1040:1: ( ( rule__Task__StartDateAssignment_12 ) )
            // InternalKPIGenerator.g:1041:2: ( rule__Task__StartDateAssignment_12 )
            {
             before(grammarAccess.getTaskAccess().getStartDateAssignment_12()); 
            // InternalKPIGenerator.g:1042:2: ( rule__Task__StartDateAssignment_12 )
            // InternalKPIGenerator.g:1042:3: rule__Task__StartDateAssignment_12
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
    // InternalKPIGenerator.g:1050:1: rule__Task__Group__13 : rule__Task__Group__13__Impl rule__Task__Group__14 ;
    public final void rule__Task__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1054:1: ( rule__Task__Group__13__Impl rule__Task__Group__14 )
            // InternalKPIGenerator.g:1055:2: rule__Task__Group__13__Impl rule__Task__Group__14
            {
            pushFollow(FOLLOW_18);
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
    // InternalKPIGenerator.g:1062:1: rule__Task__Group__13__Impl : ( '\",\"dueDate\":\"' ) ;
    public final void rule__Task__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1066:1: ( ( '\",\"dueDate\":\"' ) )
            // InternalKPIGenerator.g:1067:1: ( '\",\"dueDate\":\"' )
            {
            // InternalKPIGenerator.g:1067:1: ( '\",\"dueDate\":\"' )
            // InternalKPIGenerator.g:1068:2: '\",\"dueDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getDueDateKeyword_13()); 
            match(input,30,FOLLOW_2); 
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
    // InternalKPIGenerator.g:1077:1: rule__Task__Group__14 : rule__Task__Group__14__Impl rule__Task__Group__15 ;
    public final void rule__Task__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1081:1: ( rule__Task__Group__14__Impl rule__Task__Group__15 )
            // InternalKPIGenerator.g:1082:2: rule__Task__Group__14__Impl rule__Task__Group__15
            {
            pushFollow(FOLLOW_20);
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
    // InternalKPIGenerator.g:1089:1: rule__Task__Group__14__Impl : ( ( rule__Task__DueDateAssignment_14 ) ) ;
    public final void rule__Task__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1093:1: ( ( ( rule__Task__DueDateAssignment_14 ) ) )
            // InternalKPIGenerator.g:1094:1: ( ( rule__Task__DueDateAssignment_14 ) )
            {
            // InternalKPIGenerator.g:1094:1: ( ( rule__Task__DueDateAssignment_14 ) )
            // InternalKPIGenerator.g:1095:2: ( rule__Task__DueDateAssignment_14 )
            {
             before(grammarAccess.getTaskAccess().getDueDateAssignment_14()); 
            // InternalKPIGenerator.g:1096:2: ( rule__Task__DueDateAssignment_14 )
            // InternalKPIGenerator.g:1096:3: rule__Task__DueDateAssignment_14
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
    // InternalKPIGenerator.g:1104:1: rule__Task__Group__15 : rule__Task__Group__15__Impl rule__Task__Group__16 ;
    public final void rule__Task__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1108:1: ( rule__Task__Group__15__Impl rule__Task__Group__16 )
            // InternalKPIGenerator.g:1109:2: rule__Task__Group__15__Impl rule__Task__Group__16
            {
            pushFollow(FOLLOW_21);
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
    // InternalKPIGenerator.g:1116:1: rule__Task__Group__15__Impl : ( '\",\"priority\":\"' ) ;
    public final void rule__Task__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1120:1: ( ( '\",\"priority\":\"' ) )
            // InternalKPIGenerator.g:1121:1: ( '\",\"priority\":\"' )
            {
            // InternalKPIGenerator.g:1121:1: ( '\",\"priority\":\"' )
            // InternalKPIGenerator.g:1122:2: '\",\"priority\":\"'
            {
             before(grammarAccess.getTaskAccess().getPriorityKeyword_15()); 
            match(input,31,FOLLOW_2); 
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
    // InternalKPIGenerator.g:1131:1: rule__Task__Group__16 : rule__Task__Group__16__Impl rule__Task__Group__17 ;
    public final void rule__Task__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1135:1: ( rule__Task__Group__16__Impl rule__Task__Group__17 )
            // InternalKPIGenerator.g:1136:2: rule__Task__Group__16__Impl rule__Task__Group__17
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
    // InternalKPIGenerator.g:1143:1: rule__Task__Group__16__Impl : ( ( rule__Task__PriorityAssignment_16 ) ) ;
    public final void rule__Task__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1147:1: ( ( ( rule__Task__PriorityAssignment_16 ) ) )
            // InternalKPIGenerator.g:1148:1: ( ( rule__Task__PriorityAssignment_16 ) )
            {
            // InternalKPIGenerator.g:1148:1: ( ( rule__Task__PriorityAssignment_16 ) )
            // InternalKPIGenerator.g:1149:2: ( rule__Task__PriorityAssignment_16 )
            {
             before(grammarAccess.getTaskAccess().getPriorityAssignment_16()); 
            // InternalKPIGenerator.g:1150:2: ( rule__Task__PriorityAssignment_16 )
            // InternalKPIGenerator.g:1150:3: rule__Task__PriorityAssignment_16
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
    // InternalKPIGenerator.g:1158:1: rule__Task__Group__17 : rule__Task__Group__17__Impl rule__Task__Group__18 ;
    public final void rule__Task__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1162:1: ( rule__Task__Group__17__Impl rule__Task__Group__18 )
            // InternalKPIGenerator.g:1163:2: rule__Task__Group__17__Impl rule__Task__Group__18
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:1170:1: rule__Task__Group__17__Impl : ( '\",\"isPrivate\":' ) ;
    public final void rule__Task__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1174:1: ( ( '\",\"isPrivate\":' ) )
            // InternalKPIGenerator.g:1175:1: ( '\",\"isPrivate\":' )
            {
            // InternalKPIGenerator.g:1175:1: ( '\",\"isPrivate\":' )
            // InternalKPIGenerator.g:1176:2: '\",\"isPrivate\":'
            {
             before(grammarAccess.getTaskAccess().getIsPrivateKeyword_17()); 
            match(input,32,FOLLOW_2); 
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
    // InternalKPIGenerator.g:1185:1: rule__Task__Group__18 : rule__Task__Group__18__Impl rule__Task__Group__19 ;
    public final void rule__Task__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1189:1: ( rule__Task__Group__18__Impl rule__Task__Group__19 )
            // InternalKPIGenerator.g:1190:2: rule__Task__Group__18__Impl rule__Task__Group__19
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
    // InternalKPIGenerator.g:1197:1: rule__Task__Group__18__Impl : ( ( rule__Task__IsPrivateAssignment_18 ) ) ;
    public final void rule__Task__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1201:1: ( ( ( rule__Task__IsPrivateAssignment_18 ) ) )
            // InternalKPIGenerator.g:1202:1: ( ( rule__Task__IsPrivateAssignment_18 ) )
            {
            // InternalKPIGenerator.g:1202:1: ( ( rule__Task__IsPrivateAssignment_18 ) )
            // InternalKPIGenerator.g:1203:2: ( rule__Task__IsPrivateAssignment_18 )
            {
             before(grammarAccess.getTaskAccess().getIsPrivateAssignment_18()); 
            // InternalKPIGenerator.g:1204:2: ( rule__Task__IsPrivateAssignment_18 )
            // InternalKPIGenerator.g:1204:3: rule__Task__IsPrivateAssignment_18
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
    // InternalKPIGenerator.g:1212:1: rule__Task__Group__19 : rule__Task__Group__19__Impl rule__Task__Group__20 ;
    public final void rule__Task__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1216:1: ( rule__Task__Group__19__Impl rule__Task__Group__20 )
            // InternalKPIGenerator.g:1217:2: rule__Task__Group__19__Impl rule__Task__Group__20
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:1224:1: rule__Task__Group__19__Impl : ( ',\"progress\":' ) ;
    public final void rule__Task__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1228:1: ( ( ',\"progress\":' ) )
            // InternalKPIGenerator.g:1229:1: ( ',\"progress\":' )
            {
            // InternalKPIGenerator.g:1229:1: ( ',\"progress\":' )
            // InternalKPIGenerator.g:1230:2: ',\"progress\":'
            {
             before(grammarAccess.getTaskAccess().getProgressKeyword_19()); 
            match(input,33,FOLLOW_2); 
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
    // InternalKPIGenerator.g:1239:1: rule__Task__Group__20 : rule__Task__Group__20__Impl rule__Task__Group__21 ;
    public final void rule__Task__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1243:1: ( rule__Task__Group__20__Impl rule__Task__Group__21 )
            // InternalKPIGenerator.g:1244:2: rule__Task__Group__20__Impl rule__Task__Group__21
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
    // InternalKPIGenerator.g:1251:1: rule__Task__Group__20__Impl : ( ( rule__Task__ProgressAssignment_20 ) ) ;
    public final void rule__Task__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1255:1: ( ( ( rule__Task__ProgressAssignment_20 ) ) )
            // InternalKPIGenerator.g:1256:1: ( ( rule__Task__ProgressAssignment_20 ) )
            {
            // InternalKPIGenerator.g:1256:1: ( ( rule__Task__ProgressAssignment_20 ) )
            // InternalKPIGenerator.g:1257:2: ( rule__Task__ProgressAssignment_20 )
            {
             before(grammarAccess.getTaskAccess().getProgressAssignment_20()); 
            // InternalKPIGenerator.g:1258:2: ( rule__Task__ProgressAssignment_20 )
            // InternalKPIGenerator.g:1258:3: rule__Task__ProgressAssignment_20
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
    // InternalKPIGenerator.g:1266:1: rule__Task__Group__21 : rule__Task__Group__21__Impl rule__Task__Group__22 ;
    public final void rule__Task__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1270:1: ( rule__Task__Group__21__Impl rule__Task__Group__22 )
            // InternalKPIGenerator.g:1271:2: rule__Task__Group__21__Impl rule__Task__Group__22
            {
            pushFollow(FOLLOW_25);
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
    // InternalKPIGenerator.g:1278:1: rule__Task__Group__21__Impl : ( ',\"status\":' ) ;
    public final void rule__Task__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1282:1: ( ( ',\"status\":' ) )
            // InternalKPIGenerator.g:1283:1: ( ',\"status\":' )
            {
            // InternalKPIGenerator.g:1283:1: ( ',\"status\":' )
            // InternalKPIGenerator.g:1284:2: ',\"status\":'
            {
             before(grammarAccess.getTaskAccess().getStatusKeyword_21()); 
            match(input,34,FOLLOW_2); 
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
    // InternalKPIGenerator.g:1293:1: rule__Task__Group__22 : rule__Task__Group__22__Impl rule__Task__Group__23 ;
    public final void rule__Task__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1297:1: ( rule__Task__Group__22__Impl rule__Task__Group__23 )
            // InternalKPIGenerator.g:1298:2: rule__Task__Group__22__Impl rule__Task__Group__23
            {
            pushFollow(FOLLOW_26);
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
    // InternalKPIGenerator.g:1305:1: rule__Task__Group__22__Impl : ( ( rule__Task__StatusAssignment_22 ) ) ;
    public final void rule__Task__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1309:1: ( ( ( rule__Task__StatusAssignment_22 ) ) )
            // InternalKPIGenerator.g:1310:1: ( ( rule__Task__StatusAssignment_22 ) )
            {
            // InternalKPIGenerator.g:1310:1: ( ( rule__Task__StatusAssignment_22 ) )
            // InternalKPIGenerator.g:1311:2: ( rule__Task__StatusAssignment_22 )
            {
             before(grammarAccess.getTaskAccess().getStatusAssignment_22()); 
            // InternalKPIGenerator.g:1312:2: ( rule__Task__StatusAssignment_22 )
            // InternalKPIGenerator.g:1312:3: rule__Task__StatusAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Task__StatusAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStatusAssignment_22()); 

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
    // InternalKPIGenerator.g:1320:1: rule__Task__Group__23 : rule__Task__Group__23__Impl rule__Task__Group__24 ;
    public final void rule__Task__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1324:1: ( rule__Task__Group__23__Impl rule__Task__Group__24 )
            // InternalKPIGenerator.g:1325:2: rule__Task__Group__23__Impl rule__Task__Group__24
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:1332:1: rule__Task__Group__23__Impl : ( ',\"assignedTo\":\"' ) ;
    public final void rule__Task__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1336:1: ( ( ',\"assignedTo\":\"' ) )
            // InternalKPIGenerator.g:1337:1: ( ',\"assignedTo\":\"' )
            {
            // InternalKPIGenerator.g:1337:1: ( ',\"assignedTo\":\"' )
            // InternalKPIGenerator.g:1338:2: ',\"assignedTo\":\"'
            {
             before(grammarAccess.getTaskAccess().getAssignedToKeyword_23()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAssignedToKeyword_23()); 

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
    // InternalKPIGenerator.g:1347:1: rule__Task__Group__24 : rule__Task__Group__24__Impl rule__Task__Group__25 ;
    public final void rule__Task__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1351:1: ( rule__Task__Group__24__Impl rule__Task__Group__25 )
            // InternalKPIGenerator.g:1352:2: rule__Task__Group__24__Impl rule__Task__Group__25
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
    // InternalKPIGenerator.g:1359:1: rule__Task__Group__24__Impl : ( ( rule__Task__AssignedToAssignment_24 ) ) ;
    public final void rule__Task__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1363:1: ( ( ( rule__Task__AssignedToAssignment_24 ) ) )
            // InternalKPIGenerator.g:1364:1: ( ( rule__Task__AssignedToAssignment_24 ) )
            {
            // InternalKPIGenerator.g:1364:1: ( ( rule__Task__AssignedToAssignment_24 ) )
            // InternalKPIGenerator.g:1365:2: ( rule__Task__AssignedToAssignment_24 )
            {
             before(grammarAccess.getTaskAccess().getAssignedToAssignment_24()); 
            // InternalKPIGenerator.g:1366:2: ( rule__Task__AssignedToAssignment_24 )
            // InternalKPIGenerator.g:1366:3: rule__Task__AssignedToAssignment_24
            {
            pushFollow(FOLLOW_2);
            rule__Task__AssignedToAssignment_24();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAssignedToAssignment_24()); 

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
    // InternalKPIGenerator.g:1374:1: rule__Task__Group__25 : rule__Task__Group__25__Impl rule__Task__Group__26 ;
    public final void rule__Task__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1378:1: ( rule__Task__Group__25__Impl rule__Task__Group__26 )
            // InternalKPIGenerator.g:1379:2: rule__Task__Group__25__Impl rule__Task__Group__26
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
    // InternalKPIGenerator.g:1386:1: rule__Task__Group__25__Impl : ( '\",\"createdDate\":\"' ) ;
    public final void rule__Task__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1390:1: ( ( '\",\"createdDate\":\"' ) )
            // InternalKPIGenerator.g:1391:1: ( '\",\"createdDate\":\"' )
            {
            // InternalKPIGenerator.g:1391:1: ( '\",\"createdDate\":\"' )
            // InternalKPIGenerator.g:1392:2: '\",\"createdDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getCreatedDateKeyword_25()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateKeyword_25()); 

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
    // InternalKPIGenerator.g:1401:1: rule__Task__Group__26 : rule__Task__Group__26__Impl rule__Task__Group__27 ;
    public final void rule__Task__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1405:1: ( rule__Task__Group__26__Impl rule__Task__Group__27 )
            // InternalKPIGenerator.g:1406:2: rule__Task__Group__26__Impl rule__Task__Group__27
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
    // InternalKPIGenerator.g:1413:1: rule__Task__Group__26__Impl : ( ( rule__Task__CreatedDateAssignment_26 ) ) ;
    public final void rule__Task__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1417:1: ( ( ( rule__Task__CreatedDateAssignment_26 ) ) )
            // InternalKPIGenerator.g:1418:1: ( ( rule__Task__CreatedDateAssignment_26 ) )
            {
            // InternalKPIGenerator.g:1418:1: ( ( rule__Task__CreatedDateAssignment_26 ) )
            // InternalKPIGenerator.g:1419:2: ( rule__Task__CreatedDateAssignment_26 )
            {
             before(grammarAccess.getTaskAccess().getCreatedDateAssignment_26()); 
            // InternalKPIGenerator.g:1420:2: ( rule__Task__CreatedDateAssignment_26 )
            // InternalKPIGenerator.g:1420:3: rule__Task__CreatedDateAssignment_26
            {
            pushFollow(FOLLOW_2);
            rule__Task__CreatedDateAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCreatedDateAssignment_26()); 

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
    // InternalKPIGenerator.g:1428:1: rule__Task__Group__27 : rule__Task__Group__27__Impl rule__Task__Group__28 ;
    public final void rule__Task__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1432:1: ( rule__Task__Group__27__Impl rule__Task__Group__28 )
            // InternalKPIGenerator.g:1433:2: rule__Task__Group__27__Impl rule__Task__Group__28
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
    // InternalKPIGenerator.g:1440:1: rule__Task__Group__27__Impl : ( '\",\"completedDate\":\"' ) ;
    public final void rule__Task__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1444:1: ( ( '\",\"completedDate\":\"' ) )
            // InternalKPIGenerator.g:1445:1: ( '\",\"completedDate\":\"' )
            {
            // InternalKPIGenerator.g:1445:1: ( '\",\"completedDate\":\"' )
            // InternalKPIGenerator.g:1446:2: '\",\"completedDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getCompletedDateKeyword_27()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedDateKeyword_27()); 

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
    // InternalKPIGenerator.g:1455:1: rule__Task__Group__28 : rule__Task__Group__28__Impl rule__Task__Group__29 ;
    public final void rule__Task__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1459:1: ( rule__Task__Group__28__Impl rule__Task__Group__29 )
            // InternalKPIGenerator.g:1460:2: rule__Task__Group__28__Impl rule__Task__Group__29
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
    // InternalKPIGenerator.g:1467:1: rule__Task__Group__28__Impl : ( ( rule__Task__CompletedDateAssignment_28 ) ) ;
    public final void rule__Task__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1471:1: ( ( ( rule__Task__CompletedDateAssignment_28 ) ) )
            // InternalKPIGenerator.g:1472:1: ( ( rule__Task__CompletedDateAssignment_28 ) )
            {
            // InternalKPIGenerator.g:1472:1: ( ( rule__Task__CompletedDateAssignment_28 ) )
            // InternalKPIGenerator.g:1473:2: ( rule__Task__CompletedDateAssignment_28 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAssignment_28()); 
            // InternalKPIGenerator.g:1474:2: ( rule__Task__CompletedDateAssignment_28 )
            // InternalKPIGenerator.g:1474:3: rule__Task__CompletedDateAssignment_28
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAssignment_28();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAssignment_28()); 

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
    // InternalKPIGenerator.g:1482:1: rule__Task__Group__29 : rule__Task__Group__29__Impl rule__Task__Group__30 ;
    public final void rule__Task__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1486:1: ( rule__Task__Group__29__Impl rule__Task__Group__30 )
            // InternalKPIGenerator.g:1487:2: rule__Task__Group__29__Impl rule__Task__Group__30
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:1494:1: rule__Task__Group__29__Impl : ( '\",\"timeLoggedMin\":' ) ;
    public final void rule__Task__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1498:1: ( ( '\",\"timeLoggedMin\":' ) )
            // InternalKPIGenerator.g:1499:1: ( '\",\"timeLoggedMin\":' )
            {
            // InternalKPIGenerator.g:1499:1: ( '\",\"timeLoggedMin\":' )
            // InternalKPIGenerator.g:1500:2: '\",\"timeLoggedMin\":'
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_29()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_29()); 

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
    // InternalKPIGenerator.g:1509:1: rule__Task__Group__30 : rule__Task__Group__30__Impl rule__Task__Group__31 ;
    public final void rule__Task__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1513:1: ( rule__Task__Group__30__Impl rule__Task__Group__31 )
            // InternalKPIGenerator.g:1514:2: rule__Task__Group__30__Impl rule__Task__Group__31
            {
            pushFollow(FOLLOW_32);
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
    // InternalKPIGenerator.g:1521:1: rule__Task__Group__30__Impl : ( ( rule__Task__TimeLoggedMinAssignment_30 ) ) ;
    public final void rule__Task__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1525:1: ( ( ( rule__Task__TimeLoggedMinAssignment_30 ) ) )
            // InternalKPIGenerator.g:1526:1: ( ( rule__Task__TimeLoggedMinAssignment_30 ) )
            {
            // InternalKPIGenerator.g:1526:1: ( ( rule__Task__TimeLoggedMinAssignment_30 ) )
            // InternalKPIGenerator.g:1527:2: ( rule__Task__TimeLoggedMinAssignment_30 )
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinAssignment_30()); 
            // InternalKPIGenerator.g:1528:2: ( rule__Task__TimeLoggedMinAssignment_30 )
            // InternalKPIGenerator.g:1528:3: rule__Task__TimeLoggedMinAssignment_30
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeLoggedMinAssignment_30();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeLoggedMinAssignment_30()); 

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
    // InternalKPIGenerator.g:1536:1: rule__Task__Group__31 : rule__Task__Group__31__Impl rule__Task__Group__32 ;
    public final void rule__Task__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1540:1: ( rule__Task__Group__31__Impl rule__Task__Group__32 )
            // InternalKPIGenerator.g:1541:2: rule__Task__Group__31__Impl rule__Task__Group__32
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:1548:1: rule__Task__Group__31__Impl : ( ',\"billableTime\":' ) ;
    public final void rule__Task__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1552:1: ( ( ',\"billableTime\":' ) )
            // InternalKPIGenerator.g:1553:1: ( ',\"billableTime\":' )
            {
            // InternalKPIGenerator.g:1553:1: ( ',\"billableTime\":' )
            // InternalKPIGenerator.g:1554:2: ',\"billableTime\":'
            {
             before(grammarAccess.getTaskAccess().getBillableTimeKeyword_31()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableTimeKeyword_31()); 

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
    // InternalKPIGenerator.g:1563:1: rule__Task__Group__32 : rule__Task__Group__32__Impl rule__Task__Group__33 ;
    public final void rule__Task__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1567:1: ( rule__Task__Group__32__Impl rule__Task__Group__33 )
            // InternalKPIGenerator.g:1568:2: rule__Task__Group__32__Impl rule__Task__Group__33
            {
            pushFollow(FOLLOW_33);
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
    // InternalKPIGenerator.g:1575:1: rule__Task__Group__32__Impl : ( ( rule__Task__BillableTimeAssignment_32 ) ) ;
    public final void rule__Task__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1579:1: ( ( ( rule__Task__BillableTimeAssignment_32 ) ) )
            // InternalKPIGenerator.g:1580:1: ( ( rule__Task__BillableTimeAssignment_32 ) )
            {
            // InternalKPIGenerator.g:1580:1: ( ( rule__Task__BillableTimeAssignment_32 ) )
            // InternalKPIGenerator.g:1581:2: ( rule__Task__BillableTimeAssignment_32 )
            {
             before(grammarAccess.getTaskAccess().getBillableTimeAssignment_32()); 
            // InternalKPIGenerator.g:1582:2: ( rule__Task__BillableTimeAssignment_32 )
            // InternalKPIGenerator.g:1582:3: rule__Task__BillableTimeAssignment_32
            {
            pushFollow(FOLLOW_2);
            rule__Task__BillableTimeAssignment_32();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getBillableTimeAssignment_32()); 

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
    // InternalKPIGenerator.g:1590:1: rule__Task__Group__33 : rule__Task__Group__33__Impl rule__Task__Group__34 ;
    public final void rule__Task__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1594:1: ( rule__Task__Group__33__Impl rule__Task__Group__34 )
            // InternalKPIGenerator.g:1595:2: rule__Task__Group__33__Impl rule__Task__Group__34
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:1602:1: rule__Task__Group__33__Impl : ( ',\"completedOnTime\":' ) ;
    public final void rule__Task__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1606:1: ( ( ',\"completedOnTime\":' ) )
            // InternalKPIGenerator.g:1607:1: ( ',\"completedOnTime\":' )
            {
            // InternalKPIGenerator.g:1607:1: ( ',\"completedOnTime\":' )
            // InternalKPIGenerator.g:1608:2: ',\"completedOnTime\":'
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_33()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_33()); 

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
    // InternalKPIGenerator.g:1617:1: rule__Task__Group__34 : rule__Task__Group__34__Impl rule__Task__Group__35 ;
    public final void rule__Task__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1621:1: ( rule__Task__Group__34__Impl rule__Task__Group__35 )
            // InternalKPIGenerator.g:1622:2: rule__Task__Group__34__Impl rule__Task__Group__35
            {
            pushFollow(FOLLOW_34);
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
    // InternalKPIGenerator.g:1629:1: rule__Task__Group__34__Impl : ( ( rule__Task__CompletedOnTimeAssignment_34 ) ) ;
    public final void rule__Task__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1633:1: ( ( ( rule__Task__CompletedOnTimeAssignment_34 ) ) )
            // InternalKPIGenerator.g:1634:1: ( ( rule__Task__CompletedOnTimeAssignment_34 ) )
            {
            // InternalKPIGenerator.g:1634:1: ( ( rule__Task__CompletedOnTimeAssignment_34 ) )
            // InternalKPIGenerator.g:1635:2: ( rule__Task__CompletedOnTimeAssignment_34 )
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_34()); 
            // InternalKPIGenerator.g:1636:2: ( rule__Task__CompletedOnTimeAssignment_34 )
            // InternalKPIGenerator.g:1636:3: rule__Task__CompletedOnTimeAssignment_34
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedOnTimeAssignment_34();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_34()); 

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
    // InternalKPIGenerator.g:1644:1: rule__Task__Group__35 : rule__Task__Group__35__Impl rule__Task__Group__36 ;
    public final void rule__Task__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1648:1: ( rule__Task__Group__35__Impl rule__Task__Group__36 )
            // InternalKPIGenerator.g:1649:2: rule__Task__Group__35__Impl rule__Task__Group__36
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:1656:1: rule__Task__Group__35__Impl : ( ',\"timeEstimated\":' ) ;
    public final void rule__Task__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1660:1: ( ( ',\"timeEstimated\":' ) )
            // InternalKPIGenerator.g:1661:1: ( ',\"timeEstimated\":' )
            {
            // InternalKPIGenerator.g:1661:1: ( ',\"timeEstimated\":' )
            // InternalKPIGenerator.g:1662:2: ',\"timeEstimated\":'
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedKeyword_35()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedKeyword_35()); 

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
    // InternalKPIGenerator.g:1671:1: rule__Task__Group__36 : rule__Task__Group__36__Impl rule__Task__Group__37 ;
    public final void rule__Task__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1675:1: ( rule__Task__Group__36__Impl rule__Task__Group__37 )
            // InternalKPIGenerator.g:1676:2: rule__Task__Group__36__Impl rule__Task__Group__37
            {
            pushFollow(FOLLOW_35);
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
    // InternalKPIGenerator.g:1683:1: rule__Task__Group__36__Impl : ( ( rule__Task__TimeEstimatedAssignment_36 ) ) ;
    public final void rule__Task__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1687:1: ( ( ( rule__Task__TimeEstimatedAssignment_36 ) ) )
            // InternalKPIGenerator.g:1688:1: ( ( rule__Task__TimeEstimatedAssignment_36 ) )
            {
            // InternalKPIGenerator.g:1688:1: ( ( rule__Task__TimeEstimatedAssignment_36 ) )
            // InternalKPIGenerator.g:1689:2: ( rule__Task__TimeEstimatedAssignment_36 )
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_36()); 
            // InternalKPIGenerator.g:1690:2: ( rule__Task__TimeEstimatedAssignment_36 )
            // InternalKPIGenerator.g:1690:3: rule__Task__TimeEstimatedAssignment_36
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeEstimatedAssignment_36();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_36()); 

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
    // InternalKPIGenerator.g:1698:1: rule__Task__Group__37 : rule__Task__Group__37__Impl rule__Task__Group__38 ;
    public final void rule__Task__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1702:1: ( rule__Task__Group__37__Impl rule__Task__Group__38 )
            // InternalKPIGenerator.g:1703:2: rule__Task__Group__37__Impl rule__Task__Group__38
            {
            pushFollow(FOLLOW_36);
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
    // InternalKPIGenerator.g:1710:1: rule__Task__Group__37__Impl : ( ',\"tags\":\"' ) ;
    public final void rule__Task__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1714:1: ( ( ',\"tags\":\"' ) )
            // InternalKPIGenerator.g:1715:1: ( ',\"tags\":\"' )
            {
            // InternalKPIGenerator.g:1715:1: ( ',\"tags\":\"' )
            // InternalKPIGenerator.g:1716:2: ',\"tags\":\"'
            {
             before(grammarAccess.getTaskAccess().getTagsKeyword_37()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTagsKeyword_37()); 

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
    // InternalKPIGenerator.g:1725:1: rule__Task__Group__38 : rule__Task__Group__38__Impl rule__Task__Group__39 ;
    public final void rule__Task__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1729:1: ( rule__Task__Group__38__Impl rule__Task__Group__39 )
            // InternalKPIGenerator.g:1730:2: rule__Task__Group__38__Impl rule__Task__Group__39
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
    // InternalKPIGenerator.g:1737:1: rule__Task__Group__38__Impl : ( ( rule__Task__TagsAssignment_38 ) ) ;
    public final void rule__Task__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1741:1: ( ( ( rule__Task__TagsAssignment_38 ) ) )
            // InternalKPIGenerator.g:1742:1: ( ( rule__Task__TagsAssignment_38 ) )
            {
            // InternalKPIGenerator.g:1742:1: ( ( rule__Task__TagsAssignment_38 ) )
            // InternalKPIGenerator.g:1743:2: ( rule__Task__TagsAssignment_38 )
            {
             before(grammarAccess.getTaskAccess().getTagsAssignment_38()); 
            // InternalKPIGenerator.g:1744:2: ( rule__Task__TagsAssignment_38 )
            // InternalKPIGenerator.g:1744:3: rule__Task__TagsAssignment_38
            {
            pushFollow(FOLLOW_2);
            rule__Task__TagsAssignment_38();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTagsAssignment_38()); 

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
    // InternalKPIGenerator.g:1752:1: rule__Task__Group__39 : rule__Task__Group__39__Impl rule__Task__Group__40 ;
    public final void rule__Task__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1756:1: ( rule__Task__Group__39__Impl rule__Task__Group__40 )
            // InternalKPIGenerator.g:1757:2: rule__Task__Group__39__Impl rule__Task__Group__40
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:1764:1: rule__Task__Group__39__Impl : ( '}' ) ;
    public final void rule__Task__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1768:1: ( ( '}' ) )
            // InternalKPIGenerator.g:1769:1: ( '}' )
            {
            // InternalKPIGenerator.g:1769:1: ( '}' )
            // InternalKPIGenerator.g:1770:2: '}'
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


    // $ANTLR start "rule__Task__Group__40"
    // InternalKPIGenerator.g:1779:1: rule__Task__Group__40 : rule__Task__Group__40__Impl ;
    public final void rule__Task__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1783:1: ( rule__Task__Group__40__Impl )
            // InternalKPIGenerator.g:1784:2: rule__Task__Group__40__Impl
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
    // InternalKPIGenerator.g:1790:1: rule__Task__Group__40__Impl : ( ( ',' )? ) ;
    public final void rule__Task__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1794:1: ( ( ( ',' )? ) )
            // InternalKPIGenerator.g:1795:1: ( ( ',' )? )
            {
            // InternalKPIGenerator.g:1795:1: ( ( ',' )? )
            // InternalKPIGenerator.g:1796:2: ( ',' )?
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_40()); 
            // InternalKPIGenerator.g:1797:2: ( ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:1797:3: ','
                    {
                    match(input,22,FOLLOW_2); 

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


    // $ANTLR start "rule__Status__Group__0"
    // InternalKPIGenerator.g:1806:1: rule__Status__Group__0 : rule__Status__Group__0__Impl rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1810:1: ( rule__Status__Group__0__Impl rule__Status__Group__1 )
            // InternalKPIGenerator.g:1811:2: rule__Status__Group__0__Impl rule__Status__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Status__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Status__Group__1();

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
    // $ANTLR end "rule__Status__Group__0"


    // $ANTLR start "rule__Status__Group__0__Impl"
    // InternalKPIGenerator.g:1818:1: rule__Status__Group__0__Impl : ( () ) ;
    public final void rule__Status__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1822:1: ( ( () ) )
            // InternalKPIGenerator.g:1823:1: ( () )
            {
            // InternalKPIGenerator.g:1823:1: ( () )
            // InternalKPIGenerator.g:1824:2: ()
            {
             before(grammarAccess.getStatusAccess().getStatusAction_0()); 
            // InternalKPIGenerator.g:1825:2: ()
            // InternalKPIGenerator.g:1825:3: 
            {
            }

             after(grammarAccess.getStatusAccess().getStatusAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__0__Impl"


    // $ANTLR start "rule__Status__Group__1"
    // InternalKPIGenerator.g:1833:1: rule__Status__Group__1 : rule__Status__Group__1__Impl rule__Status__Group__2 ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1837:1: ( rule__Status__Group__1__Impl rule__Status__Group__2 )
            // InternalKPIGenerator.g:1838:2: rule__Status__Group__1__Impl rule__Status__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Status__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Status__Group__2();

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
    // $ANTLR end "rule__Status__Group__1"


    // $ANTLR start "rule__Status__Group__1__Impl"
    // InternalKPIGenerator.g:1845:1: rule__Status__Group__1__Impl : ( '{\"type\":\"' ) ;
    public final void rule__Status__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1849:1: ( ( '{\"type\":\"' ) )
            // InternalKPIGenerator.g:1850:1: ( '{\"type\":\"' )
            {
            // InternalKPIGenerator.g:1850:1: ( '{\"type\":\"' )
            // InternalKPIGenerator.g:1851:2: '{\"type\":\"'
            {
             before(grammarAccess.getStatusAccess().getTypeKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getTypeKeyword_1()); 

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
    // $ANTLR end "rule__Status__Group__1__Impl"


    // $ANTLR start "rule__Status__Group__2"
    // InternalKPIGenerator.g:1860:1: rule__Status__Group__2 : rule__Status__Group__2__Impl rule__Status__Group__3 ;
    public final void rule__Status__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1864:1: ( rule__Status__Group__2__Impl rule__Status__Group__3 )
            // InternalKPIGenerator.g:1865:2: rule__Status__Group__2__Impl rule__Status__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Status__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Status__Group__3();

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
    // $ANTLR end "rule__Status__Group__2"


    // $ANTLR start "rule__Status__Group__2__Impl"
    // InternalKPIGenerator.g:1872:1: rule__Status__Group__2__Impl : ( ( rule__Status__StatusNameAssignment_2 ) ) ;
    public final void rule__Status__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1876:1: ( ( ( rule__Status__StatusNameAssignment_2 ) ) )
            // InternalKPIGenerator.g:1877:1: ( ( rule__Status__StatusNameAssignment_2 ) )
            {
            // InternalKPIGenerator.g:1877:1: ( ( rule__Status__StatusNameAssignment_2 ) )
            // InternalKPIGenerator.g:1878:2: ( rule__Status__StatusNameAssignment_2 )
            {
             before(grammarAccess.getStatusAccess().getStatusNameAssignment_2()); 
            // InternalKPIGenerator.g:1879:2: ( rule__Status__StatusNameAssignment_2 )
            // InternalKPIGenerator.g:1879:3: rule__Status__StatusNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Status__StatusNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getStatusNameAssignment_2()); 

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
    // $ANTLR end "rule__Status__Group__2__Impl"


    // $ANTLR start "rule__Status__Group__3"
    // InternalKPIGenerator.g:1887:1: rule__Status__Group__3 : rule__Status__Group__3__Impl rule__Status__Group__4 ;
    public final void rule__Status__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1891:1: ( rule__Status__Group__3__Impl rule__Status__Group__4 )
            // InternalKPIGenerator.g:1892:2: rule__Status__Group__3__Impl rule__Status__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Status__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Status__Group__4();

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
    // $ANTLR end "rule__Status__Group__3"


    // $ANTLR start "rule__Status__Group__3__Impl"
    // InternalKPIGenerator.g:1899:1: rule__Status__Group__3__Impl : ( '\",\"text\":\"' ) ;
    public final void rule__Status__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1903:1: ( ( '\",\"text\":\"' ) )
            // InternalKPIGenerator.g:1904:1: ( '\",\"text\":\"' )
            {
            // InternalKPIGenerator.g:1904:1: ( '\",\"text\":\"' )
            // InternalKPIGenerator.g:1905:2: '\",\"text\":\"'
            {
             before(grammarAccess.getStatusAccess().getTextKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getTextKeyword_3()); 

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
    // $ANTLR end "rule__Status__Group__3__Impl"


    // $ANTLR start "rule__Status__Group__4"
    // InternalKPIGenerator.g:1914:1: rule__Status__Group__4 : rule__Status__Group__4__Impl rule__Status__Group__5 ;
    public final void rule__Status__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1918:1: ( rule__Status__Group__4__Impl rule__Status__Group__5 )
            // InternalKPIGenerator.g:1919:2: rule__Status__Group__4__Impl rule__Status__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__Status__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Status__Group__5();

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
    // $ANTLR end "rule__Status__Group__4"


    // $ANTLR start "rule__Status__Group__4__Impl"
    // InternalKPIGenerator.g:1926:1: rule__Status__Group__4__Impl : ( ( rule__Status__TextAssignment_4 ) ) ;
    public final void rule__Status__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1930:1: ( ( ( rule__Status__TextAssignment_4 ) ) )
            // InternalKPIGenerator.g:1931:1: ( ( rule__Status__TextAssignment_4 ) )
            {
            // InternalKPIGenerator.g:1931:1: ( ( rule__Status__TextAssignment_4 ) )
            // InternalKPIGenerator.g:1932:2: ( rule__Status__TextAssignment_4 )
            {
             before(grammarAccess.getStatusAccess().getTextAssignment_4()); 
            // InternalKPIGenerator.g:1933:2: ( rule__Status__TextAssignment_4 )
            // InternalKPIGenerator.g:1933:3: rule__Status__TextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Status__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getTextAssignment_4()); 

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
    // $ANTLR end "rule__Status__Group__4__Impl"


    // $ANTLR start "rule__Status__Group__5"
    // InternalKPIGenerator.g:1941:1: rule__Status__Group__5 : rule__Status__Group__5__Impl ;
    public final void rule__Status__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1945:1: ( rule__Status__Group__5__Impl )
            // InternalKPIGenerator.g:1946:2: rule__Status__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Status__Group__5__Impl();

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
    // $ANTLR end "rule__Status__Group__5"


    // $ANTLR start "rule__Status__Group__5__Impl"
    // InternalKPIGenerator.g:1952:1: rule__Status__Group__5__Impl : ( '\"}' ) ;
    public final void rule__Status__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1956:1: ( ( '\"}' ) )
            // InternalKPIGenerator.g:1957:1: ( '\"}' )
            {
            // InternalKPIGenerator.g:1957:1: ( '\"}' )
            // InternalKPIGenerator.g:1958:2: '\"}'
            {
             before(grammarAccess.getStatusAccess().getQuotationMarkRightCurlyBracketKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getQuotationMarkRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Status__Group__5__Impl"


    // $ANTLR start "rule__Root__ProjectsAssignment_1"
    // InternalKPIGenerator.g:1968:1: rule__Root__ProjectsAssignment_1 : ( ruleProject ) ;
    public final void rule__Root__ProjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1972:1: ( ( ruleProject ) )
            // InternalKPIGenerator.g:1973:2: ( ruleProject )
            {
            // InternalKPIGenerator.g:1973:2: ( ruleProject )
            // InternalKPIGenerator.g:1974:3: ruleProject
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
    // InternalKPIGenerator.g:1983:1: rule__Project__ProjectNameAssignment_2 : ( RULE_CADENA ) ;
    public final void rule__Project__ProjectNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1987:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1988:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1988:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1989:3: RULE_CADENA
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
    // InternalKPIGenerator.g:1998:1: rule__Project__PhasesAssignment_4 : ( rulePhase ) ;
    public final void rule__Project__PhasesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2002:1: ( ( rulePhase ) )
            // InternalKPIGenerator.g:2003:2: ( rulePhase )
            {
            // InternalKPIGenerator.g:2003:2: ( rulePhase )
            // InternalKPIGenerator.g:2004:3: rulePhase
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
    // InternalKPIGenerator.g:2013:1: rule__Phase__PhaseNameAssignment_2 : ( RULE_CADENA ) ;
    public final void rule__Phase__PhaseNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2017:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2018:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2018:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2019:3: RULE_CADENA
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
    // InternalKPIGenerator.g:2028:1: rule__Phase__TasksAssignment_4 : ( ruleTask ) ;
    public final void rule__Phase__TasksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2032:1: ( ( ruleTask ) )
            // InternalKPIGenerator.g:2033:2: ( ruleTask )
            {
            // InternalKPIGenerator.g:2033:2: ( ruleTask )
            // InternalKPIGenerator.g:2034:3: ruleTask
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
    // InternalKPIGenerator.g:2043:1: rule__Task__TaskIdAssignment_2 : ( RULE_INT ) ;
    public final void rule__Task__TaskIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2047:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2048:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2048:2: ( RULE_INT )
            // InternalKPIGenerator.g:2049:3: RULE_INT
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
    // InternalKPIGenerator.g:2058:1: rule__Task__TaskNameAssignment_4 : ( RULE_CADENA ) ;
    public final void rule__Task__TaskNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2062:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2063:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2063:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2064:3: RULE_CADENA
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
    // InternalKPIGenerator.g:2073:1: rule__Task__UseCaseAssignment_6 : ( RULE_CADENA ) ;
    public final void rule__Task__UseCaseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2077:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2078:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2078:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2079:3: RULE_CADENA
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
    // InternalKPIGenerator.g:2088:1: rule__Task__SequenceNumberAssignment_8 : ( RULE_DOUBLE ) ;
    public final void rule__Task__SequenceNumberAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2092:1: ( ( RULE_DOUBLE ) )
            // InternalKPIGenerator.g:2093:2: ( RULE_DOUBLE )
            {
            // InternalKPIGenerator.g:2093:2: ( RULE_DOUBLE )
            // InternalKPIGenerator.g:2094:3: RULE_DOUBLE
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


    // $ANTLR start "rule__Task__DescriptionAssignment_10"
    // InternalKPIGenerator.g:2103:1: rule__Task__DescriptionAssignment_10 : ( RULE_CADENA ) ;
    public final void rule__Task__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2107:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2108:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2108:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2109:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getDescriptionCADENATerminalRuleCall_10_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDescriptionCADENATerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Task__DescriptionAssignment_10"


    // $ANTLR start "rule__Task__StartDateAssignment_12"
    // InternalKPIGenerator.g:2118:1: rule__Task__StartDateAssignment_12 : ( RULE_DATE ) ;
    public final void rule__Task__StartDateAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2122:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:2123:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:2123:2: ( RULE_DATE )
            // InternalKPIGenerator.g:2124:3: RULE_DATE
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
    // InternalKPIGenerator.g:2133:1: rule__Task__DueDateAssignment_14 : ( RULE_DATE ) ;
    public final void rule__Task__DueDateAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2137:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:2138:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:2138:2: ( RULE_DATE )
            // InternalKPIGenerator.g:2139:3: RULE_DATE
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
    // InternalKPIGenerator.g:2148:1: rule__Task__PriorityAssignment_16 : ( ( rule__Task__PriorityAlternatives_16_0 ) ) ;
    public final void rule__Task__PriorityAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2152:1: ( ( ( rule__Task__PriorityAlternatives_16_0 ) ) )
            // InternalKPIGenerator.g:2153:2: ( ( rule__Task__PriorityAlternatives_16_0 ) )
            {
            // InternalKPIGenerator.g:2153:2: ( ( rule__Task__PriorityAlternatives_16_0 ) )
            // InternalKPIGenerator.g:2154:3: ( rule__Task__PriorityAlternatives_16_0 )
            {
             before(grammarAccess.getTaskAccess().getPriorityAlternatives_16_0()); 
            // InternalKPIGenerator.g:2155:3: ( rule__Task__PriorityAlternatives_16_0 )
            // InternalKPIGenerator.g:2155:4: rule__Task__PriorityAlternatives_16_0
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
    // InternalKPIGenerator.g:2163:1: rule__Task__IsPrivateAssignment_18 : ( RULE_CADENA ) ;
    public final void rule__Task__IsPrivateAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2167:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2168:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2168:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2169:3: RULE_CADENA
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
    // InternalKPIGenerator.g:2178:1: rule__Task__ProgressAssignment_20 : ( RULE_INT ) ;
    public final void rule__Task__ProgressAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2182:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2183:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2183:2: ( RULE_INT )
            // InternalKPIGenerator.g:2184:3: RULE_INT
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


    // $ANTLR start "rule__Task__StatusAssignment_22"
    // InternalKPIGenerator.g:2193:1: rule__Task__StatusAssignment_22 : ( ruleStatus ) ;
    public final void rule__Task__StatusAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2197:1: ( ( ruleStatus ) )
            // InternalKPIGenerator.g:2198:2: ( ruleStatus )
            {
            // InternalKPIGenerator.g:2198:2: ( ruleStatus )
            // InternalKPIGenerator.g:2199:3: ruleStatus
            {
             before(grammarAccess.getTaskAccess().getStatusStatusParserRuleCall_22_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getStatusStatusParserRuleCall_22_0()); 

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
    // $ANTLR end "rule__Task__StatusAssignment_22"


    // $ANTLR start "rule__Task__AssignedToAssignment_24"
    // InternalKPIGenerator.g:2208:1: rule__Task__AssignedToAssignment_24 : ( RULE_CADENA ) ;
    public final void rule__Task__AssignedToAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2212:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2213:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2213:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2214:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_24_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_24_0()); 

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
    // $ANTLR end "rule__Task__AssignedToAssignment_24"


    // $ANTLR start "rule__Task__CreatedDateAssignment_26"
    // InternalKPIGenerator.g:2223:1: rule__Task__CreatedDateAssignment_26 : ( RULE_DATEHOUR ) ;
    public final void rule__Task__CreatedDateAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2227:1: ( ( RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:2228:2: ( RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:2228:2: ( RULE_DATEHOUR )
            // InternalKPIGenerator.g:2229:3: RULE_DATEHOUR
            {
             before(grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_26_0()); 
            match(input,RULE_DATEHOUR,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_26_0()); 

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
    // $ANTLR end "rule__Task__CreatedDateAssignment_26"


    // $ANTLR start "rule__Task__CompletedDateAssignment_28"
    // InternalKPIGenerator.g:2238:1: rule__Task__CompletedDateAssignment_28 : ( ( rule__Task__CompletedDateAlternatives_28_0 ) ) ;
    public final void rule__Task__CompletedDateAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2242:1: ( ( ( rule__Task__CompletedDateAlternatives_28_0 ) ) )
            // InternalKPIGenerator.g:2243:2: ( ( rule__Task__CompletedDateAlternatives_28_0 ) )
            {
            // InternalKPIGenerator.g:2243:2: ( ( rule__Task__CompletedDateAlternatives_28_0 ) )
            // InternalKPIGenerator.g:2244:3: ( rule__Task__CompletedDateAlternatives_28_0 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAlternatives_28_0()); 
            // InternalKPIGenerator.g:2245:3: ( rule__Task__CompletedDateAlternatives_28_0 )
            // InternalKPIGenerator.g:2245:4: rule__Task__CompletedDateAlternatives_28_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAlternatives_28_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAlternatives_28_0()); 

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
    // $ANTLR end "rule__Task__CompletedDateAssignment_28"


    // $ANTLR start "rule__Task__TimeLoggedMinAssignment_30"
    // InternalKPIGenerator.g:2253:1: rule__Task__TimeLoggedMinAssignment_30 : ( RULE_INT ) ;
    public final void rule__Task__TimeLoggedMinAssignment_30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2257:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2258:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2258:2: ( RULE_INT )
            // InternalKPIGenerator.g:2259:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_30_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_30_0()); 

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
    // $ANTLR end "rule__Task__TimeLoggedMinAssignment_30"


    // $ANTLR start "rule__Task__BillableTimeAssignment_32"
    // InternalKPIGenerator.g:2268:1: rule__Task__BillableTimeAssignment_32 : ( RULE_INT ) ;
    public final void rule__Task__BillableTimeAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2272:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2273:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2273:2: ( RULE_INT )
            // InternalKPIGenerator.g:2274:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_32_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_32_0()); 

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
    // $ANTLR end "rule__Task__BillableTimeAssignment_32"


    // $ANTLR start "rule__Task__CompletedOnTimeAssignment_34"
    // InternalKPIGenerator.g:2283:1: rule__Task__CompletedOnTimeAssignment_34 : ( RULE_CADENA ) ;
    public final void rule__Task__CompletedOnTimeAssignment_34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2287:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2288:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2288:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2289:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_34_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_34_0()); 

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
    // $ANTLR end "rule__Task__CompletedOnTimeAssignment_34"


    // $ANTLR start "rule__Task__TimeEstimatedAssignment_36"
    // InternalKPIGenerator.g:2298:1: rule__Task__TimeEstimatedAssignment_36 : ( RULE_INT ) ;
    public final void rule__Task__TimeEstimatedAssignment_36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2302:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2303:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2303:2: ( RULE_INT )
            // InternalKPIGenerator.g:2304:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_36_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_36_0()); 

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
    // $ANTLR end "rule__Task__TimeEstimatedAssignment_36"


    // $ANTLR start "rule__Task__TagsAssignment_38"
    // InternalKPIGenerator.g:2313:1: rule__Task__TagsAssignment_38 : ( ( rule__Task__TagsAlternatives_38_0 ) ) ;
    public final void rule__Task__TagsAssignment_38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2317:1: ( ( ( rule__Task__TagsAlternatives_38_0 ) ) )
            // InternalKPIGenerator.g:2318:2: ( ( rule__Task__TagsAlternatives_38_0 ) )
            {
            // InternalKPIGenerator.g:2318:2: ( ( rule__Task__TagsAlternatives_38_0 ) )
            // InternalKPIGenerator.g:2319:3: ( rule__Task__TagsAlternatives_38_0 )
            {
             before(grammarAccess.getTaskAccess().getTagsAlternatives_38_0()); 
            // InternalKPIGenerator.g:2320:3: ( rule__Task__TagsAlternatives_38_0 )
            // InternalKPIGenerator.g:2320:4: rule__Task__TagsAlternatives_38_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__TagsAlternatives_38_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTagsAlternatives_38_0()); 

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
    // $ANTLR end "rule__Task__TagsAssignment_38"


    // $ANTLR start "rule__Status__StatusNameAssignment_2"
    // InternalKPIGenerator.g:2328:1: rule__Status__StatusNameAssignment_2 : ( RULE_CADENA ) ;
    public final void rule__Status__StatusNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2332:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2333:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2333:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2334:3: RULE_CADENA
            {
             before(grammarAccess.getStatusAccess().getStatusNameCADENATerminalRuleCall_2_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getStatusNameCADENATerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Status__StatusNameAssignment_2"


    // $ANTLR start "rule__Status__TextAssignment_4"
    // InternalKPIGenerator.g:2343:1: rule__Status__TextAssignment_4 : ( RULE_CADENA ) ;
    public final void rule__Status__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2347:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2348:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2348:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2349:3: RULE_CADENA
            {
             before(grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_4_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Status__TextAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});

}