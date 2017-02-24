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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CADENA", "RULE_DATEHOUR", "RULE_INT", "RULE_DATE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\"\"'", "'['", "']'", "'{'", "'\"name\":\"'", "'\",\"phases\":['", "'}'", "','", "'\",\"tasks\":['", "'\"id\":'", "'\",'", "'\"useCase\":\"'", "'\"sequenceNumber\":'", "'.'", "'\"description\":\"'", "'\"startDate\":\"'", "'\"dueDate\":\"'", "'\"priority\":\"'", "'\"isPrivate\":'", "'\"progress\":'", "'\"status\":'", "'\"assignedTo\":\"'", "'\"createdDate\":\"'", "'\"completedDate\":\"'", "'\"timeLoggedMin\":'", "'\"billableTime\":'", "'\"completedOnTime\":'", "'\"timeEstimated\":'", "'\"tags\":\"'", "'\"type\":\"'", "'\"text\":\"'", "'\"'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int RULE_DATE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
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
    public static final int RULE_WS=12;
    public static final int RULE_CADENA=4;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__44=44;
    public static final int T__45=45;
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


    // $ANTLR start "rule__Task__DescriptionAlternatives_17_0"
    // InternalKPIGenerator.g:177:1: rule__Task__DescriptionAlternatives_17_0 : ( ( RULE_CADENA ) | ( '\"\"' ) );
    public final void rule__Task__DescriptionAlternatives_17_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:181:1: ( ( RULE_CADENA ) | ( '\"\"' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_CADENA) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
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
                     before(grammarAccess.getTaskAccess().getDescriptionCADENATerminalRuleCall_17_0_0()); 
                    match(input,RULE_CADENA,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getDescriptionCADENATerminalRuleCall_17_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:188:2: ( '\"\"' )
                    {
                    // InternalKPIGenerator.g:188:2: ( '\"\"' )
                    // InternalKPIGenerator.g:189:3: '\"\"'
                    {
                     before(grammarAccess.getTaskAccess().getDescriptionQuotationMarkQuotationMarkKeyword_17_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getDescriptionQuotationMarkQuotationMarkKeyword_17_0_1()); 

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
    // $ANTLR end "rule__Task__DescriptionAlternatives_17_0"


    // $ANTLR start "rule__Task__PriorityAlternatives_26_0"
    // InternalKPIGenerator.g:198:1: rule__Task__PriorityAlternatives_26_0 : ( ( RULE_CADENA ) | ( '\"\"' ) );
    public final void rule__Task__PriorityAlternatives_26_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:202:1: ( ( RULE_CADENA ) | ( '\"\"' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_CADENA) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:203:2: ( RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:203:2: ( RULE_CADENA )
                    // InternalKPIGenerator.g:204:3: RULE_CADENA
                    {
                     before(grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_26_0_0()); 
                    match(input,RULE_CADENA,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_26_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:209:2: ( '\"\"' )
                    {
                    // InternalKPIGenerator.g:209:2: ( '\"\"' )
                    // InternalKPIGenerator.g:210:3: '\"\"'
                    {
                     before(grammarAccess.getTaskAccess().getPriorityQuotationMarkQuotationMarkKeyword_26_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getPriorityQuotationMarkQuotationMarkKeyword_26_0_1()); 

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
    // $ANTLR end "rule__Task__PriorityAlternatives_26_0"


    // $ANTLR start "rule__Task__CompletedDateAlternatives_44_0"
    // InternalKPIGenerator.g:219:1: rule__Task__CompletedDateAlternatives_44_0 : ( ( RULE_DATEHOUR ) | ( '\"\"' ) );
    public final void rule__Task__CompletedDateAlternatives_44_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:223:1: ( ( RULE_DATEHOUR ) | ( '\"\"' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DATEHOUR) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:224:2: ( RULE_DATEHOUR )
                    {
                    // InternalKPIGenerator.g:224:2: ( RULE_DATEHOUR )
                    // InternalKPIGenerator.g:225:3: RULE_DATEHOUR
                    {
                     before(grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_44_0_0()); 
                    match(input,RULE_DATEHOUR,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_44_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:230:2: ( '\"\"' )
                    {
                    // InternalKPIGenerator.g:230:2: ( '\"\"' )
                    // InternalKPIGenerator.g:231:3: '\"\"'
                    {
                     before(grammarAccess.getTaskAccess().getCompletedDateQuotationMarkQuotationMarkKeyword_44_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getCompletedDateQuotationMarkQuotationMarkKeyword_44_0_1()); 

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
    // $ANTLR end "rule__Task__CompletedDateAlternatives_44_0"


    // $ANTLR start "rule__Task__TagsAlternatives_59_0"
    // InternalKPIGenerator.g:240:1: rule__Task__TagsAlternatives_59_0 : ( ( RULE_CADENA ) | ( '\"\"' ) );
    public final void rule__Task__TagsAlternatives_59_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:244:1: ( ( RULE_CADENA ) | ( '\"\"' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CADENA) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:245:2: ( RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:245:2: ( RULE_CADENA )
                    // InternalKPIGenerator.g:246:3: RULE_CADENA
                    {
                     before(grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_59_0_0()); 
                    match(input,RULE_CADENA,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_59_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:251:2: ( '\"\"' )
                    {
                    // InternalKPIGenerator.g:251:2: ( '\"\"' )
                    // InternalKPIGenerator.g:252:3: '\"\"'
                    {
                     before(grammarAccess.getTaskAccess().getTagsQuotationMarkQuotationMarkKeyword_59_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getTagsQuotationMarkQuotationMarkKeyword_59_0_1()); 

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
    // $ANTLR end "rule__Task__TagsAlternatives_59_0"


    // $ANTLR start "rule__Root__Group__0"
    // InternalKPIGenerator.g:261:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:265:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalKPIGenerator.g:266:2: rule__Root__Group__0__Impl rule__Root__Group__1
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
    // InternalKPIGenerator.g:273:1: rule__Root__Group__0__Impl : ( '[' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:277:1: ( ( '[' ) )
            // InternalKPIGenerator.g:278:1: ( '[' )
            {
            // InternalKPIGenerator.g:278:1: ( '[' )
            // InternalKPIGenerator.g:279:2: '['
            {
             before(grammarAccess.getRootAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalKPIGenerator.g:288:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:292:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalKPIGenerator.g:293:2: rule__Root__Group__1__Impl rule__Root__Group__2
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
    // InternalKPIGenerator.g:300:1: rule__Root__Group__1__Impl : ( ( rule__Root__ProjectsAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:304:1: ( ( ( rule__Root__ProjectsAssignment_1 ) ) )
            // InternalKPIGenerator.g:305:1: ( ( rule__Root__ProjectsAssignment_1 ) )
            {
            // InternalKPIGenerator.g:305:1: ( ( rule__Root__ProjectsAssignment_1 ) )
            // InternalKPIGenerator.g:306:2: ( rule__Root__ProjectsAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getProjectsAssignment_1()); 
            // InternalKPIGenerator.g:307:2: ( rule__Root__ProjectsAssignment_1 )
            // InternalKPIGenerator.g:307:3: rule__Root__ProjectsAssignment_1
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
    // InternalKPIGenerator.g:315:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:319:1: ( rule__Root__Group__2__Impl )
            // InternalKPIGenerator.g:320:2: rule__Root__Group__2__Impl
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
    // InternalKPIGenerator.g:326:1: rule__Root__Group__2__Impl : ( ']' ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:330:1: ( ( ']' ) )
            // InternalKPIGenerator.g:331:1: ( ']' )
            {
            // InternalKPIGenerator.g:331:1: ( ']' )
            // InternalKPIGenerator.g:332:2: ']'
            {
             before(grammarAccess.getRootAccess().getRightSquareBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalKPIGenerator.g:342:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:346:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalKPIGenerator.g:347:2: rule__Project__Group__0__Impl rule__Project__Group__1
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
    // InternalKPIGenerator.g:354:1: rule__Project__Group__0__Impl : ( () ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:358:1: ( ( () ) )
            // InternalKPIGenerator.g:359:1: ( () )
            {
            // InternalKPIGenerator.g:359:1: ( () )
            // InternalKPIGenerator.g:360:2: ()
            {
             before(grammarAccess.getProjectAccess().getProjectAction_0()); 
            // InternalKPIGenerator.g:361:2: ()
            // InternalKPIGenerator.g:361:3: 
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
    // InternalKPIGenerator.g:369:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:373:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalKPIGenerator.g:374:2: rule__Project__Group__1__Impl rule__Project__Group__2
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
    // InternalKPIGenerator.g:381:1: rule__Project__Group__1__Impl : ( '{' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:385:1: ( ( '{' ) )
            // InternalKPIGenerator.g:386:1: ( '{' )
            {
            // InternalKPIGenerator.g:386:1: ( '{' )
            // InternalKPIGenerator.g:387:2: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:396:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:400:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalKPIGenerator.g:401:2: rule__Project__Group__2__Impl rule__Project__Group__3
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
    // InternalKPIGenerator.g:408:1: rule__Project__Group__2__Impl : ( '\"name\":\"' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:412:1: ( ( '\"name\":\"' ) )
            // InternalKPIGenerator.g:413:1: ( '\"name\":\"' )
            {
            // InternalKPIGenerator.g:413:1: ( '\"name\":\"' )
            // InternalKPIGenerator.g:414:2: '\"name\":\"'
            {
             before(grammarAccess.getProjectAccess().getNameKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameKeyword_2()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:423:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:427:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalKPIGenerator.g:428:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalKPIGenerator.g:435:1: rule__Project__Group__3__Impl : ( ( rule__Project__ProjectNameAssignment_3 ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:439:1: ( ( ( rule__Project__ProjectNameAssignment_3 ) ) )
            // InternalKPIGenerator.g:440:1: ( ( rule__Project__ProjectNameAssignment_3 ) )
            {
            // InternalKPIGenerator.g:440:1: ( ( rule__Project__ProjectNameAssignment_3 ) )
            // InternalKPIGenerator.g:441:2: ( rule__Project__ProjectNameAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getProjectNameAssignment_3()); 
            // InternalKPIGenerator.g:442:2: ( rule__Project__ProjectNameAssignment_3 )
            // InternalKPIGenerator.g:442:3: rule__Project__ProjectNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Project__ProjectNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getProjectNameAssignment_3()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:450:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:454:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalKPIGenerator.g:455:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:462:1: rule__Project__Group__4__Impl : ( '\",\"phases\":[' ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:466:1: ( ( '\",\"phases\":[' ) )
            // InternalKPIGenerator.g:467:1: ( '\",\"phases\":[' )
            {
            // InternalKPIGenerator.g:467:1: ( '\",\"phases\":[' )
            // InternalKPIGenerator.g:468:2: '\",\"phases\":['
            {
             before(grammarAccess.getProjectAccess().getPhasesKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getPhasesKeyword_4()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:477:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:481:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalKPIGenerator.g:482:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:489:1: rule__Project__Group__5__Impl : ( ( rule__Project__PhasesAssignment_5 ) ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:493:1: ( ( ( rule__Project__PhasesAssignment_5 ) ) )
            // InternalKPIGenerator.g:494:1: ( ( rule__Project__PhasesAssignment_5 ) )
            {
            // InternalKPIGenerator.g:494:1: ( ( rule__Project__PhasesAssignment_5 ) )
            // InternalKPIGenerator.g:495:2: ( rule__Project__PhasesAssignment_5 )
            {
             before(grammarAccess.getProjectAccess().getPhasesAssignment_5()); 
            // InternalKPIGenerator.g:496:2: ( rule__Project__PhasesAssignment_5 )
            // InternalKPIGenerator.g:496:3: rule__Project__PhasesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Project__PhasesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getPhasesAssignment_5()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:504:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:508:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // InternalKPIGenerator.g:509:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__7();

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
    // InternalKPIGenerator.g:516:1: rule__Project__Group__6__Impl : ( ']' ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:520:1: ( ( ']' ) )
            // InternalKPIGenerator.g:521:1: ( ']' )
            {
            // InternalKPIGenerator.g:521:1: ( ']' )
            // InternalKPIGenerator.g:522:2: ']'
            {
             before(grammarAccess.getProjectAccess().getRightSquareBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Project__Group__7"
    // InternalKPIGenerator.g:531:1: rule__Project__Group__7 : rule__Project__Group__7__Impl rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:535:1: ( rule__Project__Group__7__Impl rule__Project__Group__8 )
            // InternalKPIGenerator.g:536:2: rule__Project__Group__7__Impl rule__Project__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Project__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__8();

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
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // InternalKPIGenerator.g:543:1: rule__Project__Group__7__Impl : ( '}' ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:547:1: ( ( '}' ) )
            // InternalKPIGenerator.g:548:1: ( '}' )
            {
            // InternalKPIGenerator.g:548:1: ( '}' )
            // InternalKPIGenerator.g:549:2: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__Project__Group__8"
    // InternalKPIGenerator.g:558:1: rule__Project__Group__8 : rule__Project__Group__8__Impl ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:562:1: ( rule__Project__Group__8__Impl )
            // InternalKPIGenerator.g:563:2: rule__Project__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__8__Impl();

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
    // $ANTLR end "rule__Project__Group__8"


    // $ANTLR start "rule__Project__Group__8__Impl"
    // InternalKPIGenerator.g:569:1: rule__Project__Group__8__Impl : ( ( ',' )? ) ;
    public final void rule__Project__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:573:1: ( ( ( ',' )? ) )
            // InternalKPIGenerator.g:574:1: ( ( ',' )? )
            {
            // InternalKPIGenerator.g:574:1: ( ( ',' )? )
            // InternalKPIGenerator.g:575:2: ( ',' )?
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_8()); 
            // InternalKPIGenerator.g:576:2: ( ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:576:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__8__Impl"


    // $ANTLR start "rule__Phase__Group__0"
    // InternalKPIGenerator.g:585:1: rule__Phase__Group__0 : rule__Phase__Group__0__Impl rule__Phase__Group__1 ;
    public final void rule__Phase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:589:1: ( rule__Phase__Group__0__Impl rule__Phase__Group__1 )
            // InternalKPIGenerator.g:590:2: rule__Phase__Group__0__Impl rule__Phase__Group__1
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
    // InternalKPIGenerator.g:597:1: rule__Phase__Group__0__Impl : ( () ) ;
    public final void rule__Phase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:601:1: ( ( () ) )
            // InternalKPIGenerator.g:602:1: ( () )
            {
            // InternalKPIGenerator.g:602:1: ( () )
            // InternalKPIGenerator.g:603:2: ()
            {
             before(grammarAccess.getPhaseAccess().getPhaseAction_0()); 
            // InternalKPIGenerator.g:604:2: ()
            // InternalKPIGenerator.g:604:3: 
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
    // InternalKPIGenerator.g:612:1: rule__Phase__Group__1 : rule__Phase__Group__1__Impl rule__Phase__Group__2 ;
    public final void rule__Phase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:616:1: ( rule__Phase__Group__1__Impl rule__Phase__Group__2 )
            // InternalKPIGenerator.g:617:2: rule__Phase__Group__1__Impl rule__Phase__Group__2
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
    // InternalKPIGenerator.g:624:1: rule__Phase__Group__1__Impl : ( '{' ) ;
    public final void rule__Phase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:628:1: ( ( '{' ) )
            // InternalKPIGenerator.g:629:1: ( '{' )
            {
            // InternalKPIGenerator.g:629:1: ( '{' )
            // InternalKPIGenerator.g:630:2: '{'
            {
             before(grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:639:1: rule__Phase__Group__2 : rule__Phase__Group__2__Impl rule__Phase__Group__3 ;
    public final void rule__Phase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:643:1: ( rule__Phase__Group__2__Impl rule__Phase__Group__3 )
            // InternalKPIGenerator.g:644:2: rule__Phase__Group__2__Impl rule__Phase__Group__3
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
    // InternalKPIGenerator.g:651:1: rule__Phase__Group__2__Impl : ( '\"name\":\"' ) ;
    public final void rule__Phase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:655:1: ( ( '\"name\":\"' ) )
            // InternalKPIGenerator.g:656:1: ( '\"name\":\"' )
            {
            // InternalKPIGenerator.g:656:1: ( '\"name\":\"' )
            // InternalKPIGenerator.g:657:2: '\"name\":\"'
            {
             before(grammarAccess.getPhaseAccess().getNameKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKPIGenerator.g:666:1: rule__Phase__Group__3 : rule__Phase__Group__3__Impl rule__Phase__Group__4 ;
    public final void rule__Phase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:670:1: ( rule__Phase__Group__3__Impl rule__Phase__Group__4 )
            // InternalKPIGenerator.g:671:2: rule__Phase__Group__3__Impl rule__Phase__Group__4
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
    // InternalKPIGenerator.g:678:1: rule__Phase__Group__3__Impl : ( ( rule__Phase__PhaseNameAssignment_3 ) ) ;
    public final void rule__Phase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:682:1: ( ( ( rule__Phase__PhaseNameAssignment_3 ) ) )
            // InternalKPIGenerator.g:683:1: ( ( rule__Phase__PhaseNameAssignment_3 ) )
            {
            // InternalKPIGenerator.g:683:1: ( ( rule__Phase__PhaseNameAssignment_3 ) )
            // InternalKPIGenerator.g:684:2: ( rule__Phase__PhaseNameAssignment_3 )
            {
             before(grammarAccess.getPhaseAccess().getPhaseNameAssignment_3()); 
            // InternalKPIGenerator.g:685:2: ( rule__Phase__PhaseNameAssignment_3 )
            // InternalKPIGenerator.g:685:3: rule__Phase__PhaseNameAssignment_3
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
    // InternalKPIGenerator.g:693:1: rule__Phase__Group__4 : rule__Phase__Group__4__Impl rule__Phase__Group__5 ;
    public final void rule__Phase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:697:1: ( rule__Phase__Group__4__Impl rule__Phase__Group__5 )
            // InternalKPIGenerator.g:698:2: rule__Phase__Group__4__Impl rule__Phase__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:705:1: rule__Phase__Group__4__Impl : ( '\",\"tasks\":[' ) ;
    public final void rule__Phase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:709:1: ( ( '\",\"tasks\":[' ) )
            // InternalKPIGenerator.g:710:1: ( '\",\"tasks\":[' )
            {
            // InternalKPIGenerator.g:710:1: ( '\",\"tasks\":[' )
            // InternalKPIGenerator.g:711:2: '\",\"tasks\":['
            {
             before(grammarAccess.getPhaseAccess().getTasksKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalKPIGenerator.g:720:1: rule__Phase__Group__5 : rule__Phase__Group__5__Impl rule__Phase__Group__6 ;
    public final void rule__Phase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:724:1: ( rule__Phase__Group__5__Impl rule__Phase__Group__6 )
            // InternalKPIGenerator.g:725:2: rule__Phase__Group__5__Impl rule__Phase__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:732:1: rule__Phase__Group__5__Impl : ( ( rule__Phase__TasksAssignment_5 ) ) ;
    public final void rule__Phase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:736:1: ( ( ( rule__Phase__TasksAssignment_5 ) ) )
            // InternalKPIGenerator.g:737:1: ( ( rule__Phase__TasksAssignment_5 ) )
            {
            // InternalKPIGenerator.g:737:1: ( ( rule__Phase__TasksAssignment_5 ) )
            // InternalKPIGenerator.g:738:2: ( rule__Phase__TasksAssignment_5 )
            {
             before(grammarAccess.getPhaseAccess().getTasksAssignment_5()); 
            // InternalKPIGenerator.g:739:2: ( rule__Phase__TasksAssignment_5 )
            // InternalKPIGenerator.g:739:3: rule__Phase__TasksAssignment_5
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
    // InternalKPIGenerator.g:747:1: rule__Phase__Group__6 : rule__Phase__Group__6__Impl rule__Phase__Group__7 ;
    public final void rule__Phase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:751:1: ( rule__Phase__Group__6__Impl rule__Phase__Group__7 )
            // InternalKPIGenerator.g:752:2: rule__Phase__Group__6__Impl rule__Phase__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:759:1: rule__Phase__Group__6__Impl : ( ']' ) ;
    public final void rule__Phase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:763:1: ( ( ']' ) )
            // InternalKPIGenerator.g:764:1: ( ']' )
            {
            // InternalKPIGenerator.g:764:1: ( ']' )
            // InternalKPIGenerator.g:765:2: ']'
            {
             before(grammarAccess.getPhaseAccess().getRightSquareBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:774:1: rule__Phase__Group__7 : rule__Phase__Group__7__Impl rule__Phase__Group__8 ;
    public final void rule__Phase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:778:1: ( rule__Phase__Group__7__Impl rule__Phase__Group__8 )
            // InternalKPIGenerator.g:779:2: rule__Phase__Group__7__Impl rule__Phase__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Phase__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__8();

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
    // InternalKPIGenerator.g:786:1: rule__Phase__Group__7__Impl : ( '}' ) ;
    public final void rule__Phase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:790:1: ( ( '}' ) )
            // InternalKPIGenerator.g:791:1: ( '}' )
            {
            // InternalKPIGenerator.g:791:1: ( '}' )
            // InternalKPIGenerator.g:792:2: '}'
            {
             before(grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Phase__Group__8"
    // InternalKPIGenerator.g:801:1: rule__Phase__Group__8 : rule__Phase__Group__8__Impl ;
    public final void rule__Phase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:805:1: ( rule__Phase__Group__8__Impl )
            // InternalKPIGenerator.g:806:2: rule__Phase__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Group__8__Impl();

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
    // $ANTLR end "rule__Phase__Group__8"


    // $ANTLR start "rule__Phase__Group__8__Impl"
    // InternalKPIGenerator.g:812:1: rule__Phase__Group__8__Impl : ( ( ',' )? ) ;
    public final void rule__Phase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:816:1: ( ( ( ',' )? ) )
            // InternalKPIGenerator.g:817:1: ( ( ',' )? )
            {
            // InternalKPIGenerator.g:817:1: ( ( ',' )? )
            // InternalKPIGenerator.g:818:2: ( ',' )?
            {
             before(grammarAccess.getPhaseAccess().getCommaKeyword_8()); 
            // InternalKPIGenerator.g:819:2: ( ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:819:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPhaseAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__8__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalKPIGenerator.g:828:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:832:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalKPIGenerator.g:833:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:840:1: rule__Task__Group__0__Impl : ( () ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:844:1: ( ( () ) )
            // InternalKPIGenerator.g:845:1: ( () )
            {
            // InternalKPIGenerator.g:845:1: ( () )
            // InternalKPIGenerator.g:846:2: ()
            {
             before(grammarAccess.getTaskAccess().getTaskAction_0()); 
            // InternalKPIGenerator.g:847:2: ()
            // InternalKPIGenerator.g:847:3: 
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
    // InternalKPIGenerator.g:855:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:859:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalKPIGenerator.g:860:2: rule__Task__Group__1__Impl rule__Task__Group__2
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
    // InternalKPIGenerator.g:867:1: rule__Task__Group__1__Impl : ( '{' ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:871:1: ( ( '{' ) )
            // InternalKPIGenerator.g:872:1: ( '{' )
            {
            // InternalKPIGenerator.g:872:1: ( '{' )
            // InternalKPIGenerator.g:873:2: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:882:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:886:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalKPIGenerator.g:887:2: rule__Task__Group__2__Impl rule__Task__Group__3
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
    // InternalKPIGenerator.g:894:1: rule__Task__Group__2__Impl : ( '\"id\":' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:898:1: ( ( '\"id\":' ) )
            // InternalKPIGenerator.g:899:1: ( '\"id\":' )
            {
            // InternalKPIGenerator.g:899:1: ( '\"id\":' )
            // InternalKPIGenerator.g:900:2: '\"id\":'
            {
             before(grammarAccess.getTaskAccess().getIdKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIdKeyword_2()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:909:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:913:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalKPIGenerator.g:914:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIGenerator.g:921:1: rule__Task__Group__3__Impl : ( ( rule__Task__TaskIdAssignment_3 ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:925:1: ( ( ( rule__Task__TaskIdAssignment_3 ) ) )
            // InternalKPIGenerator.g:926:1: ( ( rule__Task__TaskIdAssignment_3 ) )
            {
            // InternalKPIGenerator.g:926:1: ( ( rule__Task__TaskIdAssignment_3 ) )
            // InternalKPIGenerator.g:927:2: ( rule__Task__TaskIdAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getTaskIdAssignment_3()); 
            // InternalKPIGenerator.g:928:2: ( rule__Task__TaskIdAssignment_3 )
            // InternalKPIGenerator.g:928:3: rule__Task__TaskIdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Task__TaskIdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTaskIdAssignment_3()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:936:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:940:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalKPIGenerator.g:941:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:948:1: rule__Task__Group__4__Impl : ( ',' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:952:1: ( ( ',' ) )
            // InternalKPIGenerator.g:953:1: ( ',' )
            {
            // InternalKPIGenerator.g:953:1: ( ',' )
            // InternalKPIGenerator.g:954:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCommaKeyword_4()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:963:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:967:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalKPIGenerator.g:968:2: rule__Task__Group__5__Impl rule__Task__Group__6
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
    // InternalKPIGenerator.g:975:1: rule__Task__Group__5__Impl : ( '\"name\":\"' ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:979:1: ( ( '\"name\":\"' ) )
            // InternalKPIGenerator.g:980:1: ( '\"name\":\"' )
            {
            // InternalKPIGenerator.g:980:1: ( '\"name\":\"' )
            // InternalKPIGenerator.g:981:2: '\"name\":\"'
            {
             before(grammarAccess.getTaskAccess().getNameKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameKeyword_5()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:990:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:994:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalKPIGenerator.g:995:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1002:1: rule__Task__Group__6__Impl : ( ( rule__Task__TaskNameAssignment_6 ) ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1006:1: ( ( ( rule__Task__TaskNameAssignment_6 ) ) )
            // InternalKPIGenerator.g:1007:1: ( ( rule__Task__TaskNameAssignment_6 ) )
            {
            // InternalKPIGenerator.g:1007:1: ( ( rule__Task__TaskNameAssignment_6 ) )
            // InternalKPIGenerator.g:1008:2: ( rule__Task__TaskNameAssignment_6 )
            {
             before(grammarAccess.getTaskAccess().getTaskNameAssignment_6()); 
            // InternalKPIGenerator.g:1009:2: ( rule__Task__TaskNameAssignment_6 )
            // InternalKPIGenerator.g:1009:3: rule__Task__TaskNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Task__TaskNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTaskNameAssignment_6()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1017:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1021:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalKPIGenerator.g:1022:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalKPIGenerator.g:1029:1: rule__Task__Group__7__Impl : ( '\",' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1033:1: ( ( '\",' ) )
            // InternalKPIGenerator.g:1034:1: ( '\",' )
            {
            // InternalKPIGenerator.g:1034:1: ( '\",' )
            // InternalKPIGenerator.g:1035:2: '\",'
            {
             before(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_7()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1044:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1048:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalKPIGenerator.g:1049:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:1056:1: rule__Task__Group__8__Impl : ( '\"useCase\":\"' ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1060:1: ( ( '\"useCase\":\"' ) )
            // InternalKPIGenerator.g:1061:1: ( '\"useCase\":\"' )
            {
            // InternalKPIGenerator.g:1061:1: ( '\"useCase\":\"' )
            // InternalKPIGenerator.g:1062:2: '\"useCase\":\"'
            {
             before(grammarAccess.getTaskAccess().getUseCaseKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getUseCaseKeyword_8()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1071:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1075:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalKPIGenerator.g:1076:2: rule__Task__Group__9__Impl rule__Task__Group__10
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1083:1: rule__Task__Group__9__Impl : ( ( rule__Task__UseCaseAssignment_9 ) ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1087:1: ( ( ( rule__Task__UseCaseAssignment_9 ) ) )
            // InternalKPIGenerator.g:1088:1: ( ( rule__Task__UseCaseAssignment_9 ) )
            {
            // InternalKPIGenerator.g:1088:1: ( ( rule__Task__UseCaseAssignment_9 ) )
            // InternalKPIGenerator.g:1089:2: ( rule__Task__UseCaseAssignment_9 )
            {
             before(grammarAccess.getTaskAccess().getUseCaseAssignment_9()); 
            // InternalKPIGenerator.g:1090:2: ( rule__Task__UseCaseAssignment_9 )
            // InternalKPIGenerator.g:1090:3: rule__Task__UseCaseAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Task__UseCaseAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getUseCaseAssignment_9()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1098:1: rule__Task__Group__10 : rule__Task__Group__10__Impl rule__Task__Group__11 ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1102:1: ( rule__Task__Group__10__Impl rule__Task__Group__11 )
            // InternalKPIGenerator.g:1103:2: rule__Task__Group__10__Impl rule__Task__Group__11
            {
            pushFollow(FOLLOW_15);
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
    // InternalKPIGenerator.g:1110:1: rule__Task__Group__10__Impl : ( '\",' ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1114:1: ( ( '\",' ) )
            // InternalKPIGenerator.g:1115:1: ( '\",' )
            {
            // InternalKPIGenerator.g:1115:1: ( '\",' )
            // InternalKPIGenerator.g:1116:2: '\",'
            {
             before(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_10()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1125:1: rule__Task__Group__11 : rule__Task__Group__11__Impl rule__Task__Group__12 ;
    public final void rule__Task__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1129:1: ( rule__Task__Group__11__Impl rule__Task__Group__12 )
            // InternalKPIGenerator.g:1130:2: rule__Task__Group__11__Impl rule__Task__Group__12
            {
            pushFollow(FOLLOW_12);
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
    // InternalKPIGenerator.g:1137:1: rule__Task__Group__11__Impl : ( '\"sequenceNumber\":' ) ;
    public final void rule__Task__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1141:1: ( ( '\"sequenceNumber\":' ) )
            // InternalKPIGenerator.g:1142:1: ( '\"sequenceNumber\":' )
            {
            // InternalKPIGenerator.g:1142:1: ( '\"sequenceNumber\":' )
            // InternalKPIGenerator.g:1143:2: '\"sequenceNumber\":'
            {
             before(grammarAccess.getTaskAccess().getSequenceNumberKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSequenceNumberKeyword_11()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1152:1: rule__Task__Group__12 : rule__Task__Group__12__Impl rule__Task__Group__13 ;
    public final void rule__Task__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1156:1: ( rule__Task__Group__12__Impl rule__Task__Group__13 )
            // InternalKPIGenerator.g:1157:2: rule__Task__Group__12__Impl rule__Task__Group__13
            {
            pushFollow(FOLLOW_16);
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
    // InternalKPIGenerator.g:1164:1: rule__Task__Group__12__Impl : ( ( rule__Task__SequenceNumberAssignment_12 ) ) ;
    public final void rule__Task__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1168:1: ( ( ( rule__Task__SequenceNumberAssignment_12 ) ) )
            // InternalKPIGenerator.g:1169:1: ( ( rule__Task__SequenceNumberAssignment_12 ) )
            {
            // InternalKPIGenerator.g:1169:1: ( ( rule__Task__SequenceNumberAssignment_12 ) )
            // InternalKPIGenerator.g:1170:2: ( rule__Task__SequenceNumberAssignment_12 )
            {
             before(grammarAccess.getTaskAccess().getSequenceNumberAssignment_12()); 
            // InternalKPIGenerator.g:1171:2: ( rule__Task__SequenceNumberAssignment_12 )
            // InternalKPIGenerator.g:1171:3: rule__Task__SequenceNumberAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Task__SequenceNumberAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSequenceNumberAssignment_12()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1179:1: rule__Task__Group__13 : rule__Task__Group__13__Impl rule__Task__Group__14 ;
    public final void rule__Task__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1183:1: ( rule__Task__Group__13__Impl rule__Task__Group__14 )
            // InternalKPIGenerator.g:1184:2: rule__Task__Group__13__Impl rule__Task__Group__14
            {
            pushFollow(FOLLOW_12);
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
    // InternalKPIGenerator.g:1191:1: rule__Task__Group__13__Impl : ( '.' ) ;
    public final void rule__Task__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1195:1: ( ( '.' ) )
            // InternalKPIGenerator.g:1196:1: ( '.' )
            {
            // InternalKPIGenerator.g:1196:1: ( '.' )
            // InternalKPIGenerator.g:1197:2: '.'
            {
             before(grammarAccess.getTaskAccess().getFullStopKeyword_13()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getFullStopKeyword_13()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1206:1: rule__Task__Group__14 : rule__Task__Group__14__Impl rule__Task__Group__15 ;
    public final void rule__Task__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1210:1: ( rule__Task__Group__14__Impl rule__Task__Group__15 )
            // InternalKPIGenerator.g:1211:2: rule__Task__Group__14__Impl rule__Task__Group__15
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIGenerator.g:1218:1: rule__Task__Group__14__Impl : ( RULE_INT ) ;
    public final void rule__Task__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1222:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1223:1: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1223:1: ( RULE_INT )
            // InternalKPIGenerator.g:1224:2: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getINTTerminalRuleCall_14()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getINTTerminalRuleCall_14()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1233:1: rule__Task__Group__15 : rule__Task__Group__15__Impl rule__Task__Group__16 ;
    public final void rule__Task__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1237:1: ( rule__Task__Group__15__Impl rule__Task__Group__16 )
            // InternalKPIGenerator.g:1238:2: rule__Task__Group__15__Impl rule__Task__Group__16
            {
            pushFollow(FOLLOW_17);
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
    // InternalKPIGenerator.g:1245:1: rule__Task__Group__15__Impl : ( ',' ) ;
    public final void rule__Task__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1249:1: ( ( ',' ) )
            // InternalKPIGenerator.g:1250:1: ( ',' )
            {
            // InternalKPIGenerator.g:1250:1: ( ',' )
            // InternalKPIGenerator.g:1251:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_15()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCommaKeyword_15()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1260:1: rule__Task__Group__16 : rule__Task__Group__16__Impl rule__Task__Group__17 ;
    public final void rule__Task__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1264:1: ( rule__Task__Group__16__Impl rule__Task__Group__17 )
            // InternalKPIGenerator.g:1265:2: rule__Task__Group__16__Impl rule__Task__Group__17
            {
            pushFollow(FOLLOW_18);
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
    // InternalKPIGenerator.g:1272:1: rule__Task__Group__16__Impl : ( '\"description\":\"' ) ;
    public final void rule__Task__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1276:1: ( ( '\"description\":\"' ) )
            // InternalKPIGenerator.g:1277:1: ( '\"description\":\"' )
            {
            // InternalKPIGenerator.g:1277:1: ( '\"description\":\"' )
            // InternalKPIGenerator.g:1278:2: '\"description\":\"'
            {
             before(grammarAccess.getTaskAccess().getDescriptionKeyword_16()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDescriptionKeyword_16()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1287:1: rule__Task__Group__17 : rule__Task__Group__17__Impl rule__Task__Group__18 ;
    public final void rule__Task__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1291:1: ( rule__Task__Group__17__Impl rule__Task__Group__18 )
            // InternalKPIGenerator.g:1292:2: rule__Task__Group__17__Impl rule__Task__Group__18
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1299:1: rule__Task__Group__17__Impl : ( ( rule__Task__DescriptionAssignment_17 ) ) ;
    public final void rule__Task__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1303:1: ( ( ( rule__Task__DescriptionAssignment_17 ) ) )
            // InternalKPIGenerator.g:1304:1: ( ( rule__Task__DescriptionAssignment_17 ) )
            {
            // InternalKPIGenerator.g:1304:1: ( ( rule__Task__DescriptionAssignment_17 ) )
            // InternalKPIGenerator.g:1305:2: ( rule__Task__DescriptionAssignment_17 )
            {
             before(grammarAccess.getTaskAccess().getDescriptionAssignment_17()); 
            // InternalKPIGenerator.g:1306:2: ( rule__Task__DescriptionAssignment_17 )
            // InternalKPIGenerator.g:1306:3: rule__Task__DescriptionAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Task__DescriptionAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDescriptionAssignment_17()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1314:1: rule__Task__Group__18 : rule__Task__Group__18__Impl rule__Task__Group__19 ;
    public final void rule__Task__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1318:1: ( rule__Task__Group__18__Impl rule__Task__Group__19 )
            // InternalKPIGenerator.g:1319:2: rule__Task__Group__18__Impl rule__Task__Group__19
            {
            pushFollow(FOLLOW_19);
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
    // InternalKPIGenerator.g:1326:1: rule__Task__Group__18__Impl : ( '\",' ) ;
    public final void rule__Task__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1330:1: ( ( '\",' ) )
            // InternalKPIGenerator.g:1331:1: ( '\",' )
            {
            // InternalKPIGenerator.g:1331:1: ( '\",' )
            // InternalKPIGenerator.g:1332:2: '\",'
            {
             before(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_18()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_18()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1341:1: rule__Task__Group__19 : rule__Task__Group__19__Impl rule__Task__Group__20 ;
    public final void rule__Task__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1345:1: ( rule__Task__Group__19__Impl rule__Task__Group__20 )
            // InternalKPIGenerator.g:1346:2: rule__Task__Group__19__Impl rule__Task__Group__20
            {
            pushFollow(FOLLOW_20);
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
    // InternalKPIGenerator.g:1353:1: rule__Task__Group__19__Impl : ( '\"startDate\":\"' ) ;
    public final void rule__Task__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1357:1: ( ( '\"startDate\":\"' ) )
            // InternalKPIGenerator.g:1358:1: ( '\"startDate\":\"' )
            {
            // InternalKPIGenerator.g:1358:1: ( '\"startDate\":\"' )
            // InternalKPIGenerator.g:1359:2: '\"startDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getStartDateKeyword_19()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStartDateKeyword_19()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1368:1: rule__Task__Group__20 : rule__Task__Group__20__Impl rule__Task__Group__21 ;
    public final void rule__Task__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1372:1: ( rule__Task__Group__20__Impl rule__Task__Group__21 )
            // InternalKPIGenerator.g:1373:2: rule__Task__Group__20__Impl rule__Task__Group__21
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1380:1: rule__Task__Group__20__Impl : ( ( rule__Task__StartDateAssignment_20 ) ) ;
    public final void rule__Task__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1384:1: ( ( ( rule__Task__StartDateAssignment_20 ) ) )
            // InternalKPIGenerator.g:1385:1: ( ( rule__Task__StartDateAssignment_20 ) )
            {
            // InternalKPIGenerator.g:1385:1: ( ( rule__Task__StartDateAssignment_20 ) )
            // InternalKPIGenerator.g:1386:2: ( rule__Task__StartDateAssignment_20 )
            {
             before(grammarAccess.getTaskAccess().getStartDateAssignment_20()); 
            // InternalKPIGenerator.g:1387:2: ( rule__Task__StartDateAssignment_20 )
            // InternalKPIGenerator.g:1387:3: rule__Task__StartDateAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__Task__StartDateAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStartDateAssignment_20()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1395:1: rule__Task__Group__21 : rule__Task__Group__21__Impl rule__Task__Group__22 ;
    public final void rule__Task__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1399:1: ( rule__Task__Group__21__Impl rule__Task__Group__22 )
            // InternalKPIGenerator.g:1400:2: rule__Task__Group__21__Impl rule__Task__Group__22
            {
            pushFollow(FOLLOW_21);
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
    // InternalKPIGenerator.g:1407:1: rule__Task__Group__21__Impl : ( '\",' ) ;
    public final void rule__Task__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1411:1: ( ( '\",' ) )
            // InternalKPIGenerator.g:1412:1: ( '\",' )
            {
            // InternalKPIGenerator.g:1412:1: ( '\",' )
            // InternalKPIGenerator.g:1413:2: '\",'
            {
             before(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_21()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_21()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1422:1: rule__Task__Group__22 : rule__Task__Group__22__Impl rule__Task__Group__23 ;
    public final void rule__Task__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1426:1: ( rule__Task__Group__22__Impl rule__Task__Group__23 )
            // InternalKPIGenerator.g:1427:2: rule__Task__Group__22__Impl rule__Task__Group__23
            {
            pushFollow(FOLLOW_20);
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
    // InternalKPIGenerator.g:1434:1: rule__Task__Group__22__Impl : ( '\"dueDate\":\"' ) ;
    public final void rule__Task__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1438:1: ( ( '\"dueDate\":\"' ) )
            // InternalKPIGenerator.g:1439:1: ( '\"dueDate\":\"' )
            {
            // InternalKPIGenerator.g:1439:1: ( '\"dueDate\":\"' )
            // InternalKPIGenerator.g:1440:2: '\"dueDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getDueDateKeyword_22()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDueDateKeyword_22()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1449:1: rule__Task__Group__23 : rule__Task__Group__23__Impl rule__Task__Group__24 ;
    public final void rule__Task__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1453:1: ( rule__Task__Group__23__Impl rule__Task__Group__24 )
            // InternalKPIGenerator.g:1454:2: rule__Task__Group__23__Impl rule__Task__Group__24
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1461:1: rule__Task__Group__23__Impl : ( ( rule__Task__DueDateAssignment_23 ) ) ;
    public final void rule__Task__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1465:1: ( ( ( rule__Task__DueDateAssignment_23 ) ) )
            // InternalKPIGenerator.g:1466:1: ( ( rule__Task__DueDateAssignment_23 ) )
            {
            // InternalKPIGenerator.g:1466:1: ( ( rule__Task__DueDateAssignment_23 ) )
            // InternalKPIGenerator.g:1467:2: ( rule__Task__DueDateAssignment_23 )
            {
             before(grammarAccess.getTaskAccess().getDueDateAssignment_23()); 
            // InternalKPIGenerator.g:1468:2: ( rule__Task__DueDateAssignment_23 )
            // InternalKPIGenerator.g:1468:3: rule__Task__DueDateAssignment_23
            {
            pushFollow(FOLLOW_2);
            rule__Task__DueDateAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDueDateAssignment_23()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1476:1: rule__Task__Group__24 : rule__Task__Group__24__Impl rule__Task__Group__25 ;
    public final void rule__Task__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1480:1: ( rule__Task__Group__24__Impl rule__Task__Group__25 )
            // InternalKPIGenerator.g:1481:2: rule__Task__Group__24__Impl rule__Task__Group__25
            {
            pushFollow(FOLLOW_22);
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
    // InternalKPIGenerator.g:1488:1: rule__Task__Group__24__Impl : ( '\",' ) ;
    public final void rule__Task__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1492:1: ( ( '\",' ) )
            // InternalKPIGenerator.g:1493:1: ( '\",' )
            {
            // InternalKPIGenerator.g:1493:1: ( '\",' )
            // InternalKPIGenerator.g:1494:2: '\",'
            {
             before(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_24()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_24()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1503:1: rule__Task__Group__25 : rule__Task__Group__25__Impl rule__Task__Group__26 ;
    public final void rule__Task__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1507:1: ( rule__Task__Group__25__Impl rule__Task__Group__26 )
            // InternalKPIGenerator.g:1508:2: rule__Task__Group__25__Impl rule__Task__Group__26
            {
            pushFollow(FOLLOW_18);
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
    // InternalKPIGenerator.g:1515:1: rule__Task__Group__25__Impl : ( '\"priority\":\"' ) ;
    public final void rule__Task__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1519:1: ( ( '\"priority\":\"' ) )
            // InternalKPIGenerator.g:1520:1: ( '\"priority\":\"' )
            {
            // InternalKPIGenerator.g:1520:1: ( '\"priority\":\"' )
            // InternalKPIGenerator.g:1521:2: '\"priority\":\"'
            {
             before(grammarAccess.getTaskAccess().getPriorityKeyword_25()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPriorityKeyword_25()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1530:1: rule__Task__Group__26 : rule__Task__Group__26__Impl rule__Task__Group__27 ;
    public final void rule__Task__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1534:1: ( rule__Task__Group__26__Impl rule__Task__Group__27 )
            // InternalKPIGenerator.g:1535:2: rule__Task__Group__26__Impl rule__Task__Group__27
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1542:1: rule__Task__Group__26__Impl : ( ( rule__Task__PriorityAssignment_26 ) ) ;
    public final void rule__Task__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1546:1: ( ( ( rule__Task__PriorityAssignment_26 ) ) )
            // InternalKPIGenerator.g:1547:1: ( ( rule__Task__PriorityAssignment_26 ) )
            {
            // InternalKPIGenerator.g:1547:1: ( ( rule__Task__PriorityAssignment_26 ) )
            // InternalKPIGenerator.g:1548:2: ( rule__Task__PriorityAssignment_26 )
            {
             before(grammarAccess.getTaskAccess().getPriorityAssignment_26()); 
            // InternalKPIGenerator.g:1549:2: ( rule__Task__PriorityAssignment_26 )
            // InternalKPIGenerator.g:1549:3: rule__Task__PriorityAssignment_26
            {
            pushFollow(FOLLOW_2);
            rule__Task__PriorityAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPriorityAssignment_26()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1557:1: rule__Task__Group__27 : rule__Task__Group__27__Impl rule__Task__Group__28 ;
    public final void rule__Task__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1561:1: ( rule__Task__Group__27__Impl rule__Task__Group__28 )
            // InternalKPIGenerator.g:1562:2: rule__Task__Group__27__Impl rule__Task__Group__28
            {
            pushFollow(FOLLOW_23);
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
    // InternalKPIGenerator.g:1569:1: rule__Task__Group__27__Impl : ( '\",' ) ;
    public final void rule__Task__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1573:1: ( ( '\",' ) )
            // InternalKPIGenerator.g:1574:1: ( '\",' )
            {
            // InternalKPIGenerator.g:1574:1: ( '\",' )
            // InternalKPIGenerator.g:1575:2: '\",'
            {
             before(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_27()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_27()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1584:1: rule__Task__Group__28 : rule__Task__Group__28__Impl rule__Task__Group__29 ;
    public final void rule__Task__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1588:1: ( rule__Task__Group__28__Impl rule__Task__Group__29 )
            // InternalKPIGenerator.g:1589:2: rule__Task__Group__28__Impl rule__Task__Group__29
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:1596:1: rule__Task__Group__28__Impl : ( '\"isPrivate\":' ) ;
    public final void rule__Task__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1600:1: ( ( '\"isPrivate\":' ) )
            // InternalKPIGenerator.g:1601:1: ( '\"isPrivate\":' )
            {
            // InternalKPIGenerator.g:1601:1: ( '\"isPrivate\":' )
            // InternalKPIGenerator.g:1602:2: '\"isPrivate\":'
            {
             before(grammarAccess.getTaskAccess().getIsPrivateKeyword_28()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIsPrivateKeyword_28()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1611:1: rule__Task__Group__29 : rule__Task__Group__29__Impl rule__Task__Group__30 ;
    public final void rule__Task__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1615:1: ( rule__Task__Group__29__Impl rule__Task__Group__30 )
            // InternalKPIGenerator.g:1616:2: rule__Task__Group__29__Impl rule__Task__Group__30
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIGenerator.g:1623:1: rule__Task__Group__29__Impl : ( ( rule__Task__IsPrivateAssignment_29 ) ) ;
    public final void rule__Task__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1627:1: ( ( ( rule__Task__IsPrivateAssignment_29 ) ) )
            // InternalKPIGenerator.g:1628:1: ( ( rule__Task__IsPrivateAssignment_29 ) )
            {
            // InternalKPIGenerator.g:1628:1: ( ( rule__Task__IsPrivateAssignment_29 ) )
            // InternalKPIGenerator.g:1629:2: ( rule__Task__IsPrivateAssignment_29 )
            {
             before(grammarAccess.getTaskAccess().getIsPrivateAssignment_29()); 
            // InternalKPIGenerator.g:1630:2: ( rule__Task__IsPrivateAssignment_29 )
            // InternalKPIGenerator.g:1630:3: rule__Task__IsPrivateAssignment_29
            {
            pushFollow(FOLLOW_2);
            rule__Task__IsPrivateAssignment_29();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIsPrivateAssignment_29()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1638:1: rule__Task__Group__30 : rule__Task__Group__30__Impl rule__Task__Group__31 ;
    public final void rule__Task__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1642:1: ( rule__Task__Group__30__Impl rule__Task__Group__31 )
            // InternalKPIGenerator.g:1643:2: rule__Task__Group__30__Impl rule__Task__Group__31
            {
            pushFollow(FOLLOW_24);
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
    // InternalKPIGenerator.g:1650:1: rule__Task__Group__30__Impl : ( ',' ) ;
    public final void rule__Task__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1654:1: ( ( ',' ) )
            // InternalKPIGenerator.g:1655:1: ( ',' )
            {
            // InternalKPIGenerator.g:1655:1: ( ',' )
            // InternalKPIGenerator.g:1656:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_30()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCommaKeyword_30()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1665:1: rule__Task__Group__31 : rule__Task__Group__31__Impl rule__Task__Group__32 ;
    public final void rule__Task__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1669:1: ( rule__Task__Group__31__Impl rule__Task__Group__32 )
            // InternalKPIGenerator.g:1670:2: rule__Task__Group__31__Impl rule__Task__Group__32
            {
            pushFollow(FOLLOW_12);
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
    // InternalKPIGenerator.g:1677:1: rule__Task__Group__31__Impl : ( '\"progress\":' ) ;
    public final void rule__Task__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1681:1: ( ( '\"progress\":' ) )
            // InternalKPIGenerator.g:1682:1: ( '\"progress\":' )
            {
            // InternalKPIGenerator.g:1682:1: ( '\"progress\":' )
            // InternalKPIGenerator.g:1683:2: '\"progress\":'
            {
             before(grammarAccess.getTaskAccess().getProgressKeyword_31()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getProgressKeyword_31()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1692:1: rule__Task__Group__32 : rule__Task__Group__32__Impl rule__Task__Group__33 ;
    public final void rule__Task__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1696:1: ( rule__Task__Group__32__Impl rule__Task__Group__33 )
            // InternalKPIGenerator.g:1697:2: rule__Task__Group__32__Impl rule__Task__Group__33
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIGenerator.g:1704:1: rule__Task__Group__32__Impl : ( ( rule__Task__ProgressAssignment_32 ) ) ;
    public final void rule__Task__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1708:1: ( ( ( rule__Task__ProgressAssignment_32 ) ) )
            // InternalKPIGenerator.g:1709:1: ( ( rule__Task__ProgressAssignment_32 ) )
            {
            // InternalKPIGenerator.g:1709:1: ( ( rule__Task__ProgressAssignment_32 ) )
            // InternalKPIGenerator.g:1710:2: ( rule__Task__ProgressAssignment_32 )
            {
             before(grammarAccess.getTaskAccess().getProgressAssignment_32()); 
            // InternalKPIGenerator.g:1711:2: ( rule__Task__ProgressAssignment_32 )
            // InternalKPIGenerator.g:1711:3: rule__Task__ProgressAssignment_32
            {
            pushFollow(FOLLOW_2);
            rule__Task__ProgressAssignment_32();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getProgressAssignment_32()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1719:1: rule__Task__Group__33 : rule__Task__Group__33__Impl rule__Task__Group__34 ;
    public final void rule__Task__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1723:1: ( rule__Task__Group__33__Impl rule__Task__Group__34 )
            // InternalKPIGenerator.g:1724:2: rule__Task__Group__33__Impl rule__Task__Group__34
            {
            pushFollow(FOLLOW_25);
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
    // InternalKPIGenerator.g:1731:1: rule__Task__Group__33__Impl : ( ',' ) ;
    public final void rule__Task__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1735:1: ( ( ',' ) )
            // InternalKPIGenerator.g:1736:1: ( ',' )
            {
            // InternalKPIGenerator.g:1736:1: ( ',' )
            // InternalKPIGenerator.g:1737:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_33()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCommaKeyword_33()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1746:1: rule__Task__Group__34 : rule__Task__Group__34__Impl rule__Task__Group__35 ;
    public final void rule__Task__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1750:1: ( rule__Task__Group__34__Impl rule__Task__Group__35 )
            // InternalKPIGenerator.g:1751:2: rule__Task__Group__34__Impl rule__Task__Group__35
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:1758:1: rule__Task__Group__34__Impl : ( '\"status\":' ) ;
    public final void rule__Task__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1762:1: ( ( '\"status\":' ) )
            // InternalKPIGenerator.g:1763:1: ( '\"status\":' )
            {
            // InternalKPIGenerator.g:1763:1: ( '\"status\":' )
            // InternalKPIGenerator.g:1764:2: '\"status\":'
            {
             before(grammarAccess.getTaskAccess().getStatusKeyword_34()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStatusKeyword_34()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1773:1: rule__Task__Group__35 : rule__Task__Group__35__Impl rule__Task__Group__36 ;
    public final void rule__Task__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1777:1: ( rule__Task__Group__35__Impl rule__Task__Group__36 )
            // InternalKPIGenerator.g:1778:2: rule__Task__Group__35__Impl rule__Task__Group__36
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIGenerator.g:1785:1: rule__Task__Group__35__Impl : ( ( rule__Task__StatusAssignment_35 ) ) ;
    public final void rule__Task__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1789:1: ( ( ( rule__Task__StatusAssignment_35 ) ) )
            // InternalKPIGenerator.g:1790:1: ( ( rule__Task__StatusAssignment_35 ) )
            {
            // InternalKPIGenerator.g:1790:1: ( ( rule__Task__StatusAssignment_35 ) )
            // InternalKPIGenerator.g:1791:2: ( rule__Task__StatusAssignment_35 )
            {
             before(grammarAccess.getTaskAccess().getStatusAssignment_35()); 
            // InternalKPIGenerator.g:1792:2: ( rule__Task__StatusAssignment_35 )
            // InternalKPIGenerator.g:1792:3: rule__Task__StatusAssignment_35
            {
            pushFollow(FOLLOW_2);
            rule__Task__StatusAssignment_35();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStatusAssignment_35()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1800:1: rule__Task__Group__36 : rule__Task__Group__36__Impl rule__Task__Group__37 ;
    public final void rule__Task__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1804:1: ( rule__Task__Group__36__Impl rule__Task__Group__37 )
            // InternalKPIGenerator.g:1805:2: rule__Task__Group__36__Impl rule__Task__Group__37
            {
            pushFollow(FOLLOW_26);
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
    // InternalKPIGenerator.g:1812:1: rule__Task__Group__36__Impl : ( ',' ) ;
    public final void rule__Task__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1816:1: ( ( ',' ) )
            // InternalKPIGenerator.g:1817:1: ( ',' )
            {
            // InternalKPIGenerator.g:1817:1: ( ',' )
            // InternalKPIGenerator.g:1818:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_36()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCommaKeyword_36()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1827:1: rule__Task__Group__37 : rule__Task__Group__37__Impl rule__Task__Group__38 ;
    public final void rule__Task__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1831:1: ( rule__Task__Group__37__Impl rule__Task__Group__38 )
            // InternalKPIGenerator.g:1832:2: rule__Task__Group__37__Impl rule__Task__Group__38
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:1839:1: rule__Task__Group__37__Impl : ( '\"assignedTo\":\"' ) ;
    public final void rule__Task__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1843:1: ( ( '\"assignedTo\":\"' ) )
            // InternalKPIGenerator.g:1844:1: ( '\"assignedTo\":\"' )
            {
            // InternalKPIGenerator.g:1844:1: ( '\"assignedTo\":\"' )
            // InternalKPIGenerator.g:1845:2: '\"assignedTo\":\"'
            {
             before(grammarAccess.getTaskAccess().getAssignedToKeyword_37()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAssignedToKeyword_37()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1854:1: rule__Task__Group__38 : rule__Task__Group__38__Impl rule__Task__Group__39 ;
    public final void rule__Task__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1858:1: ( rule__Task__Group__38__Impl rule__Task__Group__39 )
            // InternalKPIGenerator.g:1859:2: rule__Task__Group__38__Impl rule__Task__Group__39
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1866:1: rule__Task__Group__38__Impl : ( ( rule__Task__AssignedToAssignment_38 ) ) ;
    public final void rule__Task__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1870:1: ( ( ( rule__Task__AssignedToAssignment_38 ) ) )
            // InternalKPIGenerator.g:1871:1: ( ( rule__Task__AssignedToAssignment_38 ) )
            {
            // InternalKPIGenerator.g:1871:1: ( ( rule__Task__AssignedToAssignment_38 ) )
            // InternalKPIGenerator.g:1872:2: ( rule__Task__AssignedToAssignment_38 )
            {
             before(grammarAccess.getTaskAccess().getAssignedToAssignment_38()); 
            // InternalKPIGenerator.g:1873:2: ( rule__Task__AssignedToAssignment_38 )
            // InternalKPIGenerator.g:1873:3: rule__Task__AssignedToAssignment_38
            {
            pushFollow(FOLLOW_2);
            rule__Task__AssignedToAssignment_38();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAssignedToAssignment_38()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1881:1: rule__Task__Group__39 : rule__Task__Group__39__Impl rule__Task__Group__40 ;
    public final void rule__Task__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1885:1: ( rule__Task__Group__39__Impl rule__Task__Group__40 )
            // InternalKPIGenerator.g:1886:2: rule__Task__Group__39__Impl rule__Task__Group__40
            {
            pushFollow(FOLLOW_27);
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
    // InternalKPIGenerator.g:1893:1: rule__Task__Group__39__Impl : ( '\",' ) ;
    public final void rule__Task__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1897:1: ( ( '\",' ) )
            // InternalKPIGenerator.g:1898:1: ( '\",' )
            {
            // InternalKPIGenerator.g:1898:1: ( '\",' )
            // InternalKPIGenerator.g:1899:2: '\",'
            {
             before(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_39()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_39()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1908:1: rule__Task__Group__40 : rule__Task__Group__40__Impl rule__Task__Group__41 ;
    public final void rule__Task__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1912:1: ( rule__Task__Group__40__Impl rule__Task__Group__41 )
            // InternalKPIGenerator.g:1913:2: rule__Task__Group__40__Impl rule__Task__Group__41
            {
            pushFollow(FOLLOW_28);
            rule__Task__Group__40__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__41();

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
    // InternalKPIGenerator.g:1920:1: rule__Task__Group__40__Impl : ( '\"createdDate\":\"' ) ;
    public final void rule__Task__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1924:1: ( ( '\"createdDate\":\"' ) )
            // InternalKPIGenerator.g:1925:1: ( '\"createdDate\":\"' )
            {
            // InternalKPIGenerator.g:1925:1: ( '\"createdDate\":\"' )
            // InternalKPIGenerator.g:1926:2: '\"createdDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getCreatedDateKeyword_40()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateKeyword_40()); 

            }


            }

        }
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


    // $ANTLR start "rule__Task__Group__41"
    // InternalKPIGenerator.g:1935:1: rule__Task__Group__41 : rule__Task__Group__41__Impl rule__Task__Group__42 ;
    public final void rule__Task__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1939:1: ( rule__Task__Group__41__Impl rule__Task__Group__42 )
            // InternalKPIGenerator.g:1940:2: rule__Task__Group__41__Impl rule__Task__Group__42
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group__41__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__42();

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
    // $ANTLR end "rule__Task__Group__41"


    // $ANTLR start "rule__Task__Group__41__Impl"
    // InternalKPIGenerator.g:1947:1: rule__Task__Group__41__Impl : ( ( rule__Task__CreatedDateAssignment_41 ) ) ;
    public final void rule__Task__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1951:1: ( ( ( rule__Task__CreatedDateAssignment_41 ) ) )
            // InternalKPIGenerator.g:1952:1: ( ( rule__Task__CreatedDateAssignment_41 ) )
            {
            // InternalKPIGenerator.g:1952:1: ( ( rule__Task__CreatedDateAssignment_41 ) )
            // InternalKPIGenerator.g:1953:2: ( rule__Task__CreatedDateAssignment_41 )
            {
             before(grammarAccess.getTaskAccess().getCreatedDateAssignment_41()); 
            // InternalKPIGenerator.g:1954:2: ( rule__Task__CreatedDateAssignment_41 )
            // InternalKPIGenerator.g:1954:3: rule__Task__CreatedDateAssignment_41
            {
            pushFollow(FOLLOW_2);
            rule__Task__CreatedDateAssignment_41();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCreatedDateAssignment_41()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__41__Impl"


    // $ANTLR start "rule__Task__Group__42"
    // InternalKPIGenerator.g:1962:1: rule__Task__Group__42 : rule__Task__Group__42__Impl rule__Task__Group__43 ;
    public final void rule__Task__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1966:1: ( rule__Task__Group__42__Impl rule__Task__Group__43 )
            // InternalKPIGenerator.g:1967:2: rule__Task__Group__42__Impl rule__Task__Group__43
            {
            pushFollow(FOLLOW_29);
            rule__Task__Group__42__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__43();

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
    // $ANTLR end "rule__Task__Group__42"


    // $ANTLR start "rule__Task__Group__42__Impl"
    // InternalKPIGenerator.g:1974:1: rule__Task__Group__42__Impl : ( '\",' ) ;
    public final void rule__Task__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1978:1: ( ( '\",' ) )
            // InternalKPIGenerator.g:1979:1: ( '\",' )
            {
            // InternalKPIGenerator.g:1979:1: ( '\",' )
            // InternalKPIGenerator.g:1980:2: '\",'
            {
             before(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_42()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_42()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__42__Impl"


    // $ANTLR start "rule__Task__Group__43"
    // InternalKPIGenerator.g:1989:1: rule__Task__Group__43 : rule__Task__Group__43__Impl rule__Task__Group__44 ;
    public final void rule__Task__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1993:1: ( rule__Task__Group__43__Impl rule__Task__Group__44 )
            // InternalKPIGenerator.g:1994:2: rule__Task__Group__43__Impl rule__Task__Group__44
            {
            pushFollow(FOLLOW_30);
            rule__Task__Group__43__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__44();

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
    // $ANTLR end "rule__Task__Group__43"


    // $ANTLR start "rule__Task__Group__43__Impl"
    // InternalKPIGenerator.g:2001:1: rule__Task__Group__43__Impl : ( '\"completedDate\":\"' ) ;
    public final void rule__Task__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2005:1: ( ( '\"completedDate\":\"' ) )
            // InternalKPIGenerator.g:2006:1: ( '\"completedDate\":\"' )
            {
            // InternalKPIGenerator.g:2006:1: ( '\"completedDate\":\"' )
            // InternalKPIGenerator.g:2007:2: '\"completedDate\":\"'
            {
             before(grammarAccess.getTaskAccess().getCompletedDateKeyword_43()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedDateKeyword_43()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__43__Impl"


    // $ANTLR start "rule__Task__Group__44"
    // InternalKPIGenerator.g:2016:1: rule__Task__Group__44 : rule__Task__Group__44__Impl rule__Task__Group__45 ;
    public final void rule__Task__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2020:1: ( rule__Task__Group__44__Impl rule__Task__Group__45 )
            // InternalKPIGenerator.g:2021:2: rule__Task__Group__44__Impl rule__Task__Group__45
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group__44__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__45();

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
    // $ANTLR end "rule__Task__Group__44"


    // $ANTLR start "rule__Task__Group__44__Impl"
    // InternalKPIGenerator.g:2028:1: rule__Task__Group__44__Impl : ( ( rule__Task__CompletedDateAssignment_44 ) ) ;
    public final void rule__Task__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2032:1: ( ( ( rule__Task__CompletedDateAssignment_44 ) ) )
            // InternalKPIGenerator.g:2033:1: ( ( rule__Task__CompletedDateAssignment_44 ) )
            {
            // InternalKPIGenerator.g:2033:1: ( ( rule__Task__CompletedDateAssignment_44 ) )
            // InternalKPIGenerator.g:2034:2: ( rule__Task__CompletedDateAssignment_44 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAssignment_44()); 
            // InternalKPIGenerator.g:2035:2: ( rule__Task__CompletedDateAssignment_44 )
            // InternalKPIGenerator.g:2035:3: rule__Task__CompletedDateAssignment_44
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAssignment_44();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAssignment_44()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__44__Impl"


    // $ANTLR start "rule__Task__Group__45"
    // InternalKPIGenerator.g:2043:1: rule__Task__Group__45 : rule__Task__Group__45__Impl rule__Task__Group__46 ;
    public final void rule__Task__Group__45() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2047:1: ( rule__Task__Group__45__Impl rule__Task__Group__46 )
            // InternalKPIGenerator.g:2048:2: rule__Task__Group__45__Impl rule__Task__Group__46
            {
            pushFollow(FOLLOW_31);
            rule__Task__Group__45__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__46();

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
    // $ANTLR end "rule__Task__Group__45"


    // $ANTLR start "rule__Task__Group__45__Impl"
    // InternalKPIGenerator.g:2055:1: rule__Task__Group__45__Impl : ( '\",' ) ;
    public final void rule__Task__Group__45__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2059:1: ( ( '\",' ) )
            // InternalKPIGenerator.g:2060:1: ( '\",' )
            {
            // InternalKPIGenerator.g:2060:1: ( '\",' )
            // InternalKPIGenerator.g:2061:2: '\",'
            {
             before(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_45()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_45()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__45__Impl"


    // $ANTLR start "rule__Task__Group__46"
    // InternalKPIGenerator.g:2070:1: rule__Task__Group__46 : rule__Task__Group__46__Impl rule__Task__Group__47 ;
    public final void rule__Task__Group__46() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2074:1: ( rule__Task__Group__46__Impl rule__Task__Group__47 )
            // InternalKPIGenerator.g:2075:2: rule__Task__Group__46__Impl rule__Task__Group__47
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__46__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__47();

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
    // $ANTLR end "rule__Task__Group__46"


    // $ANTLR start "rule__Task__Group__46__Impl"
    // InternalKPIGenerator.g:2082:1: rule__Task__Group__46__Impl : ( '\"timeLoggedMin\":' ) ;
    public final void rule__Task__Group__46__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2086:1: ( ( '\"timeLoggedMin\":' ) )
            // InternalKPIGenerator.g:2087:1: ( '\"timeLoggedMin\":' )
            {
            // InternalKPIGenerator.g:2087:1: ( '\"timeLoggedMin\":' )
            // InternalKPIGenerator.g:2088:2: '\"timeLoggedMin\":'
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_46()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_46()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__46__Impl"


    // $ANTLR start "rule__Task__Group__47"
    // InternalKPIGenerator.g:2097:1: rule__Task__Group__47 : rule__Task__Group__47__Impl rule__Task__Group__48 ;
    public final void rule__Task__Group__47() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2101:1: ( rule__Task__Group__47__Impl rule__Task__Group__48 )
            // InternalKPIGenerator.g:2102:2: rule__Task__Group__47__Impl rule__Task__Group__48
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__47__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__48();

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
    // $ANTLR end "rule__Task__Group__47"


    // $ANTLR start "rule__Task__Group__47__Impl"
    // InternalKPIGenerator.g:2109:1: rule__Task__Group__47__Impl : ( ( rule__Task__TimeLoggedMinAssignment_47 ) ) ;
    public final void rule__Task__Group__47__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2113:1: ( ( ( rule__Task__TimeLoggedMinAssignment_47 ) ) )
            // InternalKPIGenerator.g:2114:1: ( ( rule__Task__TimeLoggedMinAssignment_47 ) )
            {
            // InternalKPIGenerator.g:2114:1: ( ( rule__Task__TimeLoggedMinAssignment_47 ) )
            // InternalKPIGenerator.g:2115:2: ( rule__Task__TimeLoggedMinAssignment_47 )
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinAssignment_47()); 
            // InternalKPIGenerator.g:2116:2: ( rule__Task__TimeLoggedMinAssignment_47 )
            // InternalKPIGenerator.g:2116:3: rule__Task__TimeLoggedMinAssignment_47
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeLoggedMinAssignment_47();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeLoggedMinAssignment_47()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__47__Impl"


    // $ANTLR start "rule__Task__Group__48"
    // InternalKPIGenerator.g:2124:1: rule__Task__Group__48 : rule__Task__Group__48__Impl rule__Task__Group__49 ;
    public final void rule__Task__Group__48() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2128:1: ( rule__Task__Group__48__Impl rule__Task__Group__49 )
            // InternalKPIGenerator.g:2129:2: rule__Task__Group__48__Impl rule__Task__Group__49
            {
            pushFollow(FOLLOW_32);
            rule__Task__Group__48__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__49();

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
    // $ANTLR end "rule__Task__Group__48"


    // $ANTLR start "rule__Task__Group__48__Impl"
    // InternalKPIGenerator.g:2136:1: rule__Task__Group__48__Impl : ( ',' ) ;
    public final void rule__Task__Group__48__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2140:1: ( ( ',' ) )
            // InternalKPIGenerator.g:2141:1: ( ',' )
            {
            // InternalKPIGenerator.g:2141:1: ( ',' )
            // InternalKPIGenerator.g:2142:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_48()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCommaKeyword_48()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__48__Impl"


    // $ANTLR start "rule__Task__Group__49"
    // InternalKPIGenerator.g:2151:1: rule__Task__Group__49 : rule__Task__Group__49__Impl rule__Task__Group__50 ;
    public final void rule__Task__Group__49() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2155:1: ( rule__Task__Group__49__Impl rule__Task__Group__50 )
            // InternalKPIGenerator.g:2156:2: rule__Task__Group__49__Impl rule__Task__Group__50
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__49__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__50();

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
    // $ANTLR end "rule__Task__Group__49"


    // $ANTLR start "rule__Task__Group__49__Impl"
    // InternalKPIGenerator.g:2163:1: rule__Task__Group__49__Impl : ( '\"billableTime\":' ) ;
    public final void rule__Task__Group__49__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2167:1: ( ( '\"billableTime\":' ) )
            // InternalKPIGenerator.g:2168:1: ( '\"billableTime\":' )
            {
            // InternalKPIGenerator.g:2168:1: ( '\"billableTime\":' )
            // InternalKPIGenerator.g:2169:2: '\"billableTime\":'
            {
             before(grammarAccess.getTaskAccess().getBillableTimeKeyword_49()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableTimeKeyword_49()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__49__Impl"


    // $ANTLR start "rule__Task__Group__50"
    // InternalKPIGenerator.g:2178:1: rule__Task__Group__50 : rule__Task__Group__50__Impl rule__Task__Group__51 ;
    public final void rule__Task__Group__50() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2182:1: ( rule__Task__Group__50__Impl rule__Task__Group__51 )
            // InternalKPIGenerator.g:2183:2: rule__Task__Group__50__Impl rule__Task__Group__51
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__50__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__51();

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
    // $ANTLR end "rule__Task__Group__50"


    // $ANTLR start "rule__Task__Group__50__Impl"
    // InternalKPIGenerator.g:2190:1: rule__Task__Group__50__Impl : ( ( rule__Task__BillableTimeAssignment_50 ) ) ;
    public final void rule__Task__Group__50__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2194:1: ( ( ( rule__Task__BillableTimeAssignment_50 ) ) )
            // InternalKPIGenerator.g:2195:1: ( ( rule__Task__BillableTimeAssignment_50 ) )
            {
            // InternalKPIGenerator.g:2195:1: ( ( rule__Task__BillableTimeAssignment_50 ) )
            // InternalKPIGenerator.g:2196:2: ( rule__Task__BillableTimeAssignment_50 )
            {
             before(grammarAccess.getTaskAccess().getBillableTimeAssignment_50()); 
            // InternalKPIGenerator.g:2197:2: ( rule__Task__BillableTimeAssignment_50 )
            // InternalKPIGenerator.g:2197:3: rule__Task__BillableTimeAssignment_50
            {
            pushFollow(FOLLOW_2);
            rule__Task__BillableTimeAssignment_50();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getBillableTimeAssignment_50()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__50__Impl"


    // $ANTLR start "rule__Task__Group__51"
    // InternalKPIGenerator.g:2205:1: rule__Task__Group__51 : rule__Task__Group__51__Impl rule__Task__Group__52 ;
    public final void rule__Task__Group__51() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2209:1: ( rule__Task__Group__51__Impl rule__Task__Group__52 )
            // InternalKPIGenerator.g:2210:2: rule__Task__Group__51__Impl rule__Task__Group__52
            {
            pushFollow(FOLLOW_33);
            rule__Task__Group__51__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__52();

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
    // $ANTLR end "rule__Task__Group__51"


    // $ANTLR start "rule__Task__Group__51__Impl"
    // InternalKPIGenerator.g:2217:1: rule__Task__Group__51__Impl : ( ',' ) ;
    public final void rule__Task__Group__51__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2221:1: ( ( ',' ) )
            // InternalKPIGenerator.g:2222:1: ( ',' )
            {
            // InternalKPIGenerator.g:2222:1: ( ',' )
            // InternalKPIGenerator.g:2223:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_51()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCommaKeyword_51()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__51__Impl"


    // $ANTLR start "rule__Task__Group__52"
    // InternalKPIGenerator.g:2232:1: rule__Task__Group__52 : rule__Task__Group__52__Impl rule__Task__Group__53 ;
    public final void rule__Task__Group__52() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2236:1: ( rule__Task__Group__52__Impl rule__Task__Group__53 )
            // InternalKPIGenerator.g:2237:2: rule__Task__Group__52__Impl rule__Task__Group__53
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__52__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__53();

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
    // $ANTLR end "rule__Task__Group__52"


    // $ANTLR start "rule__Task__Group__52__Impl"
    // InternalKPIGenerator.g:2244:1: rule__Task__Group__52__Impl : ( '\"completedOnTime\":' ) ;
    public final void rule__Task__Group__52__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2248:1: ( ( '\"completedOnTime\":' ) )
            // InternalKPIGenerator.g:2249:1: ( '\"completedOnTime\":' )
            {
            // InternalKPIGenerator.g:2249:1: ( '\"completedOnTime\":' )
            // InternalKPIGenerator.g:2250:2: '\"completedOnTime\":'
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_52()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_52()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__52__Impl"


    // $ANTLR start "rule__Task__Group__53"
    // InternalKPIGenerator.g:2259:1: rule__Task__Group__53 : rule__Task__Group__53__Impl rule__Task__Group__54 ;
    public final void rule__Task__Group__53() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2263:1: ( rule__Task__Group__53__Impl rule__Task__Group__54 )
            // InternalKPIGenerator.g:2264:2: rule__Task__Group__53__Impl rule__Task__Group__54
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__53__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__54();

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
    // $ANTLR end "rule__Task__Group__53"


    // $ANTLR start "rule__Task__Group__53__Impl"
    // InternalKPIGenerator.g:2271:1: rule__Task__Group__53__Impl : ( ( rule__Task__CompletedOnTimeAssignment_53 ) ) ;
    public final void rule__Task__Group__53__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2275:1: ( ( ( rule__Task__CompletedOnTimeAssignment_53 ) ) )
            // InternalKPIGenerator.g:2276:1: ( ( rule__Task__CompletedOnTimeAssignment_53 ) )
            {
            // InternalKPIGenerator.g:2276:1: ( ( rule__Task__CompletedOnTimeAssignment_53 ) )
            // InternalKPIGenerator.g:2277:2: ( rule__Task__CompletedOnTimeAssignment_53 )
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_53()); 
            // InternalKPIGenerator.g:2278:2: ( rule__Task__CompletedOnTimeAssignment_53 )
            // InternalKPIGenerator.g:2278:3: rule__Task__CompletedOnTimeAssignment_53
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedOnTimeAssignment_53();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_53()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__53__Impl"


    // $ANTLR start "rule__Task__Group__54"
    // InternalKPIGenerator.g:2286:1: rule__Task__Group__54 : rule__Task__Group__54__Impl rule__Task__Group__55 ;
    public final void rule__Task__Group__54() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2290:1: ( rule__Task__Group__54__Impl rule__Task__Group__55 )
            // InternalKPIGenerator.g:2291:2: rule__Task__Group__54__Impl rule__Task__Group__55
            {
            pushFollow(FOLLOW_34);
            rule__Task__Group__54__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__55();

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
    // $ANTLR end "rule__Task__Group__54"


    // $ANTLR start "rule__Task__Group__54__Impl"
    // InternalKPIGenerator.g:2298:1: rule__Task__Group__54__Impl : ( ',' ) ;
    public final void rule__Task__Group__54__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2302:1: ( ( ',' ) )
            // InternalKPIGenerator.g:2303:1: ( ',' )
            {
            // InternalKPIGenerator.g:2303:1: ( ',' )
            // InternalKPIGenerator.g:2304:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_54()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCommaKeyword_54()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__54__Impl"


    // $ANTLR start "rule__Task__Group__55"
    // InternalKPIGenerator.g:2313:1: rule__Task__Group__55 : rule__Task__Group__55__Impl rule__Task__Group__56 ;
    public final void rule__Task__Group__55() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2317:1: ( rule__Task__Group__55__Impl rule__Task__Group__56 )
            // InternalKPIGenerator.g:2318:2: rule__Task__Group__55__Impl rule__Task__Group__56
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__55__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__56();

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
    // $ANTLR end "rule__Task__Group__55"


    // $ANTLR start "rule__Task__Group__55__Impl"
    // InternalKPIGenerator.g:2325:1: rule__Task__Group__55__Impl : ( '\"timeEstimated\":' ) ;
    public final void rule__Task__Group__55__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2329:1: ( ( '\"timeEstimated\":' ) )
            // InternalKPIGenerator.g:2330:1: ( '\"timeEstimated\":' )
            {
            // InternalKPIGenerator.g:2330:1: ( '\"timeEstimated\":' )
            // InternalKPIGenerator.g:2331:2: '\"timeEstimated\":'
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedKeyword_55()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedKeyword_55()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__55__Impl"


    // $ANTLR start "rule__Task__Group__56"
    // InternalKPIGenerator.g:2340:1: rule__Task__Group__56 : rule__Task__Group__56__Impl rule__Task__Group__57 ;
    public final void rule__Task__Group__56() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2344:1: ( rule__Task__Group__56__Impl rule__Task__Group__57 )
            // InternalKPIGenerator.g:2345:2: rule__Task__Group__56__Impl rule__Task__Group__57
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__56__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__57();

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
    // $ANTLR end "rule__Task__Group__56"


    // $ANTLR start "rule__Task__Group__56__Impl"
    // InternalKPIGenerator.g:2352:1: rule__Task__Group__56__Impl : ( ( rule__Task__TimeEstimatedAssignment_56 ) ) ;
    public final void rule__Task__Group__56__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2356:1: ( ( ( rule__Task__TimeEstimatedAssignment_56 ) ) )
            // InternalKPIGenerator.g:2357:1: ( ( rule__Task__TimeEstimatedAssignment_56 ) )
            {
            // InternalKPIGenerator.g:2357:1: ( ( rule__Task__TimeEstimatedAssignment_56 ) )
            // InternalKPIGenerator.g:2358:2: ( rule__Task__TimeEstimatedAssignment_56 )
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_56()); 
            // InternalKPIGenerator.g:2359:2: ( rule__Task__TimeEstimatedAssignment_56 )
            // InternalKPIGenerator.g:2359:3: rule__Task__TimeEstimatedAssignment_56
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeEstimatedAssignment_56();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_56()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__56__Impl"


    // $ANTLR start "rule__Task__Group__57"
    // InternalKPIGenerator.g:2367:1: rule__Task__Group__57 : rule__Task__Group__57__Impl rule__Task__Group__58 ;
    public final void rule__Task__Group__57() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2371:1: ( rule__Task__Group__57__Impl rule__Task__Group__58 )
            // InternalKPIGenerator.g:2372:2: rule__Task__Group__57__Impl rule__Task__Group__58
            {
            pushFollow(FOLLOW_35);
            rule__Task__Group__57__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__58();

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
    // $ANTLR end "rule__Task__Group__57"


    // $ANTLR start "rule__Task__Group__57__Impl"
    // InternalKPIGenerator.g:2379:1: rule__Task__Group__57__Impl : ( ',' ) ;
    public final void rule__Task__Group__57__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2383:1: ( ( ',' ) )
            // InternalKPIGenerator.g:2384:1: ( ',' )
            {
            // InternalKPIGenerator.g:2384:1: ( ',' )
            // InternalKPIGenerator.g:2385:2: ','
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_57()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCommaKeyword_57()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__57__Impl"


    // $ANTLR start "rule__Task__Group__58"
    // InternalKPIGenerator.g:2394:1: rule__Task__Group__58 : rule__Task__Group__58__Impl rule__Task__Group__59 ;
    public final void rule__Task__Group__58() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2398:1: ( rule__Task__Group__58__Impl rule__Task__Group__59 )
            // InternalKPIGenerator.g:2399:2: rule__Task__Group__58__Impl rule__Task__Group__59
            {
            pushFollow(FOLLOW_18);
            rule__Task__Group__58__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__59();

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
    // $ANTLR end "rule__Task__Group__58"


    // $ANTLR start "rule__Task__Group__58__Impl"
    // InternalKPIGenerator.g:2406:1: rule__Task__Group__58__Impl : ( '\"tags\":\"' ) ;
    public final void rule__Task__Group__58__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2410:1: ( ( '\"tags\":\"' ) )
            // InternalKPIGenerator.g:2411:1: ( '\"tags\":\"' )
            {
            // InternalKPIGenerator.g:2411:1: ( '\"tags\":\"' )
            // InternalKPIGenerator.g:2412:2: '\"tags\":\"'
            {
             before(grammarAccess.getTaskAccess().getTagsKeyword_58()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTagsKeyword_58()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__58__Impl"


    // $ANTLR start "rule__Task__Group__59"
    // InternalKPIGenerator.g:2421:1: rule__Task__Group__59 : rule__Task__Group__59__Impl rule__Task__Group__60 ;
    public final void rule__Task__Group__59() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2425:1: ( rule__Task__Group__59__Impl rule__Task__Group__60 )
            // InternalKPIGenerator.g:2426:2: rule__Task__Group__59__Impl rule__Task__Group__60
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group__59__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__60();

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
    // $ANTLR end "rule__Task__Group__59"


    // $ANTLR start "rule__Task__Group__59__Impl"
    // InternalKPIGenerator.g:2433:1: rule__Task__Group__59__Impl : ( ( rule__Task__TagsAssignment_59 ) ) ;
    public final void rule__Task__Group__59__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2437:1: ( ( ( rule__Task__TagsAssignment_59 ) ) )
            // InternalKPIGenerator.g:2438:1: ( ( rule__Task__TagsAssignment_59 ) )
            {
            // InternalKPIGenerator.g:2438:1: ( ( rule__Task__TagsAssignment_59 ) )
            // InternalKPIGenerator.g:2439:2: ( rule__Task__TagsAssignment_59 )
            {
             before(grammarAccess.getTaskAccess().getTagsAssignment_59()); 
            // InternalKPIGenerator.g:2440:2: ( rule__Task__TagsAssignment_59 )
            // InternalKPIGenerator.g:2440:3: rule__Task__TagsAssignment_59
            {
            pushFollow(FOLLOW_2);
            rule__Task__TagsAssignment_59();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTagsAssignment_59()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__59__Impl"


    // $ANTLR start "rule__Task__Group__60"
    // InternalKPIGenerator.g:2448:1: rule__Task__Group__60 : rule__Task__Group__60__Impl rule__Task__Group__61 ;
    public final void rule__Task__Group__60() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2452:1: ( rule__Task__Group__60__Impl rule__Task__Group__61 )
            // InternalKPIGenerator.g:2453:2: rule__Task__Group__60__Impl rule__Task__Group__61
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__60__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__61();

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
    // $ANTLR end "rule__Task__Group__60"


    // $ANTLR start "rule__Task__Group__60__Impl"
    // InternalKPIGenerator.g:2460:1: rule__Task__Group__60__Impl : ( '}' ) ;
    public final void rule__Task__Group__60__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2464:1: ( ( '}' ) )
            // InternalKPIGenerator.g:2465:1: ( '}' )
            {
            // InternalKPIGenerator.g:2465:1: ( '}' )
            // InternalKPIGenerator.g:2466:2: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_60()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_60()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__60__Impl"


    // $ANTLR start "rule__Task__Group__61"
    // InternalKPIGenerator.g:2475:1: rule__Task__Group__61 : rule__Task__Group__61__Impl ;
    public final void rule__Task__Group__61() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2479:1: ( rule__Task__Group__61__Impl )
            // InternalKPIGenerator.g:2480:2: rule__Task__Group__61__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__61__Impl();

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
    // $ANTLR end "rule__Task__Group__61"


    // $ANTLR start "rule__Task__Group__61__Impl"
    // InternalKPIGenerator.g:2486:1: rule__Task__Group__61__Impl : ( ( ',' )? ) ;
    public final void rule__Task__Group__61__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2490:1: ( ( ( ',' )? ) )
            // InternalKPIGenerator.g:2491:1: ( ( ',' )? )
            {
            // InternalKPIGenerator.g:2491:1: ( ( ',' )? )
            // InternalKPIGenerator.g:2492:2: ( ',' )?
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_61()); 
            // InternalKPIGenerator.g:2493:2: ( ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:2493:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getCommaKeyword_61()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__61__Impl"


    // $ANTLR start "rule__Status__Group__0"
    // InternalKPIGenerator.g:2502:1: rule__Status__Group__0 : rule__Status__Group__0__Impl rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2506:1: ( rule__Status__Group__0__Impl rule__Status__Group__1 )
            // InternalKPIGenerator.g:2507:2: rule__Status__Group__0__Impl rule__Status__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:2514:1: rule__Status__Group__0__Impl : ( () ) ;
    public final void rule__Status__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2518:1: ( ( () ) )
            // InternalKPIGenerator.g:2519:1: ( () )
            {
            // InternalKPIGenerator.g:2519:1: ( () )
            // InternalKPIGenerator.g:2520:2: ()
            {
             before(grammarAccess.getStatusAccess().getStatusAction_0()); 
            // InternalKPIGenerator.g:2521:2: ()
            // InternalKPIGenerator.g:2521:3: 
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
    // InternalKPIGenerator.g:2529:1: rule__Status__Group__1 : rule__Status__Group__1__Impl rule__Status__Group__2 ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2533:1: ( rule__Status__Group__1__Impl rule__Status__Group__2 )
            // InternalKPIGenerator.g:2534:2: rule__Status__Group__1__Impl rule__Status__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalKPIGenerator.g:2541:1: rule__Status__Group__1__Impl : ( '{' ) ;
    public final void rule__Status__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2545:1: ( ( '{' ) )
            // InternalKPIGenerator.g:2546:1: ( '{' )
            {
            // InternalKPIGenerator.g:2546:1: ( '{' )
            // InternalKPIGenerator.g:2547:2: '{'
            {
             before(grammarAccess.getStatusAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:2556:1: rule__Status__Group__2 : rule__Status__Group__2__Impl rule__Status__Group__3 ;
    public final void rule__Status__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2560:1: ( rule__Status__Group__2__Impl rule__Status__Group__3 )
            // InternalKPIGenerator.g:2561:2: rule__Status__Group__2__Impl rule__Status__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:2568:1: rule__Status__Group__2__Impl : ( '\"type\":\"' ) ;
    public final void rule__Status__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2572:1: ( ( '\"type\":\"' ) )
            // InternalKPIGenerator.g:2573:1: ( '\"type\":\"' )
            {
            // InternalKPIGenerator.g:2573:1: ( '\"type\":\"' )
            // InternalKPIGenerator.g:2574:2: '\"type\":\"'
            {
             before(grammarAccess.getStatusAccess().getTypeKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getTypeKeyword_2()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:2583:1: rule__Status__Group__3 : rule__Status__Group__3__Impl rule__Status__Group__4 ;
    public final void rule__Status__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2587:1: ( rule__Status__Group__3__Impl rule__Status__Group__4 )
            // InternalKPIGenerator.g:2588:2: rule__Status__Group__3__Impl rule__Status__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:2595:1: rule__Status__Group__3__Impl : ( ( rule__Status__StatusNameAssignment_3 ) ) ;
    public final void rule__Status__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2599:1: ( ( ( rule__Status__StatusNameAssignment_3 ) ) )
            // InternalKPIGenerator.g:2600:1: ( ( rule__Status__StatusNameAssignment_3 ) )
            {
            // InternalKPIGenerator.g:2600:1: ( ( rule__Status__StatusNameAssignment_3 ) )
            // InternalKPIGenerator.g:2601:2: ( rule__Status__StatusNameAssignment_3 )
            {
             before(grammarAccess.getStatusAccess().getStatusNameAssignment_3()); 
            // InternalKPIGenerator.g:2602:2: ( rule__Status__StatusNameAssignment_3 )
            // InternalKPIGenerator.g:2602:3: rule__Status__StatusNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Status__StatusNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getStatusNameAssignment_3()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:2610:1: rule__Status__Group__4 : rule__Status__Group__4__Impl rule__Status__Group__5 ;
    public final void rule__Status__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2614:1: ( rule__Status__Group__4__Impl rule__Status__Group__5 )
            // InternalKPIGenerator.g:2615:2: rule__Status__Group__4__Impl rule__Status__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalKPIGenerator.g:2622:1: rule__Status__Group__4__Impl : ( '\",' ) ;
    public final void rule__Status__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2626:1: ( ( '\",' ) )
            // InternalKPIGenerator.g:2627:1: ( '\",' )
            {
            // InternalKPIGenerator.g:2627:1: ( '\",' )
            // InternalKPIGenerator.g:2628:2: '\",'
            {
             before(grammarAccess.getStatusAccess().getQuotationMarkCommaKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getQuotationMarkCommaKeyword_4()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:2637:1: rule__Status__Group__5 : rule__Status__Group__5__Impl rule__Status__Group__6 ;
    public final void rule__Status__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2641:1: ( rule__Status__Group__5__Impl rule__Status__Group__6 )
            // InternalKPIGenerator.g:2642:2: rule__Status__Group__5__Impl rule__Status__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Status__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Status__Group__6();

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
    // InternalKPIGenerator.g:2649:1: rule__Status__Group__5__Impl : ( '\"text\":\"' ) ;
    public final void rule__Status__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2653:1: ( ( '\"text\":\"' ) )
            // InternalKPIGenerator.g:2654:1: ( '\"text\":\"' )
            {
            // InternalKPIGenerator.g:2654:1: ( '\"text\":\"' )
            // InternalKPIGenerator.g:2655:2: '\"text\":\"'
            {
             before(grammarAccess.getStatusAccess().getTextKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getTextKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Status__Group__6"
    // InternalKPIGenerator.g:2664:1: rule__Status__Group__6 : rule__Status__Group__6__Impl rule__Status__Group__7 ;
    public final void rule__Status__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2668:1: ( rule__Status__Group__6__Impl rule__Status__Group__7 )
            // InternalKPIGenerator.g:2669:2: rule__Status__Group__6__Impl rule__Status__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__Status__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Status__Group__7();

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
    // $ANTLR end "rule__Status__Group__6"


    // $ANTLR start "rule__Status__Group__6__Impl"
    // InternalKPIGenerator.g:2676:1: rule__Status__Group__6__Impl : ( ( rule__Status__TextAssignment_6 ) ) ;
    public final void rule__Status__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2680:1: ( ( ( rule__Status__TextAssignment_6 ) ) )
            // InternalKPIGenerator.g:2681:1: ( ( rule__Status__TextAssignment_6 ) )
            {
            // InternalKPIGenerator.g:2681:1: ( ( rule__Status__TextAssignment_6 ) )
            // InternalKPIGenerator.g:2682:2: ( rule__Status__TextAssignment_6 )
            {
             before(grammarAccess.getStatusAccess().getTextAssignment_6()); 
            // InternalKPIGenerator.g:2683:2: ( rule__Status__TextAssignment_6 )
            // InternalKPIGenerator.g:2683:3: rule__Status__TextAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Status__TextAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getTextAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__6__Impl"


    // $ANTLR start "rule__Status__Group__7"
    // InternalKPIGenerator.g:2691:1: rule__Status__Group__7 : rule__Status__Group__7__Impl rule__Status__Group__8 ;
    public final void rule__Status__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2695:1: ( rule__Status__Group__7__Impl rule__Status__Group__8 )
            // InternalKPIGenerator.g:2696:2: rule__Status__Group__7__Impl rule__Status__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Status__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Status__Group__8();

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
    // $ANTLR end "rule__Status__Group__7"


    // $ANTLR start "rule__Status__Group__7__Impl"
    // InternalKPIGenerator.g:2703:1: rule__Status__Group__7__Impl : ( '\"' ) ;
    public final void rule__Status__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2707:1: ( ( '\"' ) )
            // InternalKPIGenerator.g:2708:1: ( '\"' )
            {
            // InternalKPIGenerator.g:2708:1: ( '\"' )
            // InternalKPIGenerator.g:2709:2: '\"'
            {
             before(grammarAccess.getStatusAccess().getQuotationMarkKeyword_7()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getQuotationMarkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__7__Impl"


    // $ANTLR start "rule__Status__Group__8"
    // InternalKPIGenerator.g:2718:1: rule__Status__Group__8 : rule__Status__Group__8__Impl ;
    public final void rule__Status__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2722:1: ( rule__Status__Group__8__Impl )
            // InternalKPIGenerator.g:2723:2: rule__Status__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Status__Group__8__Impl();

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
    // $ANTLR end "rule__Status__Group__8"


    // $ANTLR start "rule__Status__Group__8__Impl"
    // InternalKPIGenerator.g:2729:1: rule__Status__Group__8__Impl : ( '}' ) ;
    public final void rule__Status__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2733:1: ( ( '}' ) )
            // InternalKPIGenerator.g:2734:1: ( '}' )
            {
            // InternalKPIGenerator.g:2734:1: ( '}' )
            // InternalKPIGenerator.g:2735:2: '}'
            {
             before(grammarAccess.getStatusAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__8__Impl"


    // $ANTLR start "rule__Root__ProjectsAssignment_1"
    // InternalKPIGenerator.g:2745:1: rule__Root__ProjectsAssignment_1 : ( ruleProject ) ;
    public final void rule__Root__ProjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2749:1: ( ( ruleProject ) )
            // InternalKPIGenerator.g:2750:2: ( ruleProject )
            {
            // InternalKPIGenerator.g:2750:2: ( ruleProject )
            // InternalKPIGenerator.g:2751:3: ruleProject
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


    // $ANTLR start "rule__Project__ProjectNameAssignment_3"
    // InternalKPIGenerator.g:2760:1: rule__Project__ProjectNameAssignment_3 : ( RULE_CADENA ) ;
    public final void rule__Project__ProjectNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2764:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2765:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2765:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2766:3: RULE_CADENA
            {
             before(grammarAccess.getProjectAccess().getProjectNameCADENATerminalRuleCall_3_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectNameCADENATerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__ProjectNameAssignment_3"


    // $ANTLR start "rule__Project__PhasesAssignment_5"
    // InternalKPIGenerator.g:2775:1: rule__Project__PhasesAssignment_5 : ( rulePhase ) ;
    public final void rule__Project__PhasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2779:1: ( ( rulePhase ) )
            // InternalKPIGenerator.g:2780:2: ( rulePhase )
            {
            // InternalKPIGenerator.g:2780:2: ( rulePhase )
            // InternalKPIGenerator.g:2781:3: rulePhase
            {
             before(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__PhasesAssignment_5"


    // $ANTLR start "rule__Phase__PhaseNameAssignment_3"
    // InternalKPIGenerator.g:2790:1: rule__Phase__PhaseNameAssignment_3 : ( RULE_CADENA ) ;
    public final void rule__Phase__PhaseNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2794:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2795:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2795:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2796:3: RULE_CADENA
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
    // InternalKPIGenerator.g:2805:1: rule__Phase__TasksAssignment_5 : ( ruleTask ) ;
    public final void rule__Phase__TasksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2809:1: ( ( ruleTask ) )
            // InternalKPIGenerator.g:2810:2: ( ruleTask )
            {
            // InternalKPIGenerator.g:2810:2: ( ruleTask )
            // InternalKPIGenerator.g:2811:3: ruleTask
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


    // $ANTLR start "rule__Task__TaskIdAssignment_3"
    // InternalKPIGenerator.g:2820:1: rule__Task__TaskIdAssignment_3 : ( RULE_INT ) ;
    public final void rule__Task__TaskIdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2824:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2825:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2825:2: ( RULE_INT )
            // InternalKPIGenerator.g:2826:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTaskIdINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskIdINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskIdAssignment_3"


    // $ANTLR start "rule__Task__TaskNameAssignment_6"
    // InternalKPIGenerator.g:2835:1: rule__Task__TaskNameAssignment_6 : ( RULE_CADENA ) ;
    public final void rule__Task__TaskNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2839:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2840:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2840:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2841:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getTaskNameCADENATerminalRuleCall_6_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskNameCADENATerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskNameAssignment_6"


    // $ANTLR start "rule__Task__UseCaseAssignment_9"
    // InternalKPIGenerator.g:2850:1: rule__Task__UseCaseAssignment_9 : ( RULE_CADENA ) ;
    public final void rule__Task__UseCaseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2854:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2855:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2855:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2856:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getUseCaseCADENATerminalRuleCall_9_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getUseCaseCADENATerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__UseCaseAssignment_9"


    // $ANTLR start "rule__Task__SequenceNumberAssignment_12"
    // InternalKPIGenerator.g:2865:1: rule__Task__SequenceNumberAssignment_12 : ( RULE_INT ) ;
    public final void rule__Task__SequenceNumberAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2869:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2870:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2870:2: ( RULE_INT )
            // InternalKPIGenerator.g:2871:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getSequenceNumberINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSequenceNumberINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__SequenceNumberAssignment_12"


    // $ANTLR start "rule__Task__DescriptionAssignment_17"
    // InternalKPIGenerator.g:2880:1: rule__Task__DescriptionAssignment_17 : ( ( rule__Task__DescriptionAlternatives_17_0 ) ) ;
    public final void rule__Task__DescriptionAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2884:1: ( ( ( rule__Task__DescriptionAlternatives_17_0 ) ) )
            // InternalKPIGenerator.g:2885:2: ( ( rule__Task__DescriptionAlternatives_17_0 ) )
            {
            // InternalKPIGenerator.g:2885:2: ( ( rule__Task__DescriptionAlternatives_17_0 ) )
            // InternalKPIGenerator.g:2886:3: ( rule__Task__DescriptionAlternatives_17_0 )
            {
             before(grammarAccess.getTaskAccess().getDescriptionAlternatives_17_0()); 
            // InternalKPIGenerator.g:2887:3: ( rule__Task__DescriptionAlternatives_17_0 )
            // InternalKPIGenerator.g:2887:4: rule__Task__DescriptionAlternatives_17_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__DescriptionAlternatives_17_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDescriptionAlternatives_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DescriptionAssignment_17"


    // $ANTLR start "rule__Task__StartDateAssignment_20"
    // InternalKPIGenerator.g:2895:1: rule__Task__StartDateAssignment_20 : ( RULE_DATE ) ;
    public final void rule__Task__StartDateAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2899:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:2900:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:2900:2: ( RULE_DATE )
            // InternalKPIGenerator.g:2901:3: RULE_DATE
            {
             before(grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_20_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__StartDateAssignment_20"


    // $ANTLR start "rule__Task__DueDateAssignment_23"
    // InternalKPIGenerator.g:2910:1: rule__Task__DueDateAssignment_23 : ( RULE_DATE ) ;
    public final void rule__Task__DueDateAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2914:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:2915:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:2915:2: ( RULE_DATE )
            // InternalKPIGenerator.g:2916:3: RULE_DATE
            {
             before(grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_23_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DueDateAssignment_23"


    // $ANTLR start "rule__Task__PriorityAssignment_26"
    // InternalKPIGenerator.g:2925:1: rule__Task__PriorityAssignment_26 : ( ( rule__Task__PriorityAlternatives_26_0 ) ) ;
    public final void rule__Task__PriorityAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2929:1: ( ( ( rule__Task__PriorityAlternatives_26_0 ) ) )
            // InternalKPIGenerator.g:2930:2: ( ( rule__Task__PriorityAlternatives_26_0 ) )
            {
            // InternalKPIGenerator.g:2930:2: ( ( rule__Task__PriorityAlternatives_26_0 ) )
            // InternalKPIGenerator.g:2931:3: ( rule__Task__PriorityAlternatives_26_0 )
            {
             before(grammarAccess.getTaskAccess().getPriorityAlternatives_26_0()); 
            // InternalKPIGenerator.g:2932:3: ( rule__Task__PriorityAlternatives_26_0 )
            // InternalKPIGenerator.g:2932:4: rule__Task__PriorityAlternatives_26_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__PriorityAlternatives_26_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPriorityAlternatives_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PriorityAssignment_26"


    // $ANTLR start "rule__Task__IsPrivateAssignment_29"
    // InternalKPIGenerator.g:2940:1: rule__Task__IsPrivateAssignment_29 : ( RULE_CADENA ) ;
    public final void rule__Task__IsPrivateAssignment_29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2944:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2945:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2945:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2946:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getIsPrivateCADENATerminalRuleCall_29_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIsPrivateCADENATerminalRuleCall_29_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__IsPrivateAssignment_29"


    // $ANTLR start "rule__Task__ProgressAssignment_32"
    // InternalKPIGenerator.g:2955:1: rule__Task__ProgressAssignment_32 : ( RULE_INT ) ;
    public final void rule__Task__ProgressAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2959:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2960:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2960:2: ( RULE_INT )
            // InternalKPIGenerator.g:2961:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_32_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_32_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ProgressAssignment_32"


    // $ANTLR start "rule__Task__StatusAssignment_35"
    // InternalKPIGenerator.g:2970:1: rule__Task__StatusAssignment_35 : ( ruleStatus ) ;
    public final void rule__Task__StatusAssignment_35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2974:1: ( ( ruleStatus ) )
            // InternalKPIGenerator.g:2975:2: ( ruleStatus )
            {
            // InternalKPIGenerator.g:2975:2: ( ruleStatus )
            // InternalKPIGenerator.g:2976:3: ruleStatus
            {
             before(grammarAccess.getTaskAccess().getStatusStatusParserRuleCall_35_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getStatusStatusParserRuleCall_35_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__StatusAssignment_35"


    // $ANTLR start "rule__Task__AssignedToAssignment_38"
    // InternalKPIGenerator.g:2985:1: rule__Task__AssignedToAssignment_38 : ( RULE_CADENA ) ;
    public final void rule__Task__AssignedToAssignment_38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2989:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2990:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2990:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2991:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_38_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_38_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__AssignedToAssignment_38"


    // $ANTLR start "rule__Task__CreatedDateAssignment_41"
    // InternalKPIGenerator.g:3000:1: rule__Task__CreatedDateAssignment_41 : ( RULE_DATEHOUR ) ;
    public final void rule__Task__CreatedDateAssignment_41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:3004:1: ( ( RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:3005:2: ( RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:3005:2: ( RULE_DATEHOUR )
            // InternalKPIGenerator.g:3006:3: RULE_DATEHOUR
            {
             before(grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_41_0()); 
            match(input,RULE_DATEHOUR,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_41_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CreatedDateAssignment_41"


    // $ANTLR start "rule__Task__CompletedDateAssignment_44"
    // InternalKPIGenerator.g:3015:1: rule__Task__CompletedDateAssignment_44 : ( ( rule__Task__CompletedDateAlternatives_44_0 ) ) ;
    public final void rule__Task__CompletedDateAssignment_44() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:3019:1: ( ( ( rule__Task__CompletedDateAlternatives_44_0 ) ) )
            // InternalKPIGenerator.g:3020:2: ( ( rule__Task__CompletedDateAlternatives_44_0 ) )
            {
            // InternalKPIGenerator.g:3020:2: ( ( rule__Task__CompletedDateAlternatives_44_0 ) )
            // InternalKPIGenerator.g:3021:3: ( rule__Task__CompletedDateAlternatives_44_0 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAlternatives_44_0()); 
            // InternalKPIGenerator.g:3022:3: ( rule__Task__CompletedDateAlternatives_44_0 )
            // InternalKPIGenerator.g:3022:4: rule__Task__CompletedDateAlternatives_44_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAlternatives_44_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAlternatives_44_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedDateAssignment_44"


    // $ANTLR start "rule__Task__TimeLoggedMinAssignment_47"
    // InternalKPIGenerator.g:3030:1: rule__Task__TimeLoggedMinAssignment_47 : ( RULE_INT ) ;
    public final void rule__Task__TimeLoggedMinAssignment_47() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:3034:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:3035:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:3035:2: ( RULE_INT )
            // InternalKPIGenerator.g:3036:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_47_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_47_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeLoggedMinAssignment_47"


    // $ANTLR start "rule__Task__BillableTimeAssignment_50"
    // InternalKPIGenerator.g:3045:1: rule__Task__BillableTimeAssignment_50 : ( RULE_INT ) ;
    public final void rule__Task__BillableTimeAssignment_50() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:3049:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:3050:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:3050:2: ( RULE_INT )
            // InternalKPIGenerator.g:3051:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_50_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_50_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__BillableTimeAssignment_50"


    // $ANTLR start "rule__Task__CompletedOnTimeAssignment_53"
    // InternalKPIGenerator.g:3060:1: rule__Task__CompletedOnTimeAssignment_53 : ( RULE_CADENA ) ;
    public final void rule__Task__CompletedOnTimeAssignment_53() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:3064:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:3065:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:3065:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:3066:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_53_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_53_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedOnTimeAssignment_53"


    // $ANTLR start "rule__Task__TimeEstimatedAssignment_56"
    // InternalKPIGenerator.g:3075:1: rule__Task__TimeEstimatedAssignment_56 : ( RULE_INT ) ;
    public final void rule__Task__TimeEstimatedAssignment_56() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:3079:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:3080:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:3080:2: ( RULE_INT )
            // InternalKPIGenerator.g:3081:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_56_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_56_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeEstimatedAssignment_56"


    // $ANTLR start "rule__Task__TagsAssignment_59"
    // InternalKPIGenerator.g:3090:1: rule__Task__TagsAssignment_59 : ( ( rule__Task__TagsAlternatives_59_0 ) ) ;
    public final void rule__Task__TagsAssignment_59() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:3094:1: ( ( ( rule__Task__TagsAlternatives_59_0 ) ) )
            // InternalKPIGenerator.g:3095:2: ( ( rule__Task__TagsAlternatives_59_0 ) )
            {
            // InternalKPIGenerator.g:3095:2: ( ( rule__Task__TagsAlternatives_59_0 ) )
            // InternalKPIGenerator.g:3096:3: ( rule__Task__TagsAlternatives_59_0 )
            {
             before(grammarAccess.getTaskAccess().getTagsAlternatives_59_0()); 
            // InternalKPIGenerator.g:3097:3: ( rule__Task__TagsAlternatives_59_0 )
            // InternalKPIGenerator.g:3097:4: rule__Task__TagsAlternatives_59_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__TagsAlternatives_59_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTagsAlternatives_59_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TagsAssignment_59"


    // $ANTLR start "rule__Status__StatusNameAssignment_3"
    // InternalKPIGenerator.g:3105:1: rule__Status__StatusNameAssignment_3 : ( RULE_CADENA ) ;
    public final void rule__Status__StatusNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:3109:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:3110:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:3110:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:3111:3: RULE_CADENA
            {
             before(grammarAccess.getStatusAccess().getStatusNameCADENATerminalRuleCall_3_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getStatusNameCADENATerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__StatusNameAssignment_3"


    // $ANTLR start "rule__Status__TextAssignment_6"
    // InternalKPIGenerator.g:3120:1: rule__Status__TextAssignment_6 : ( RULE_CADENA ) ;
    public final void rule__Status__TextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:3124:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:3125:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:3125:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:3126:3: RULE_CADENA
            {
             before(grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_6_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__TextAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});

}