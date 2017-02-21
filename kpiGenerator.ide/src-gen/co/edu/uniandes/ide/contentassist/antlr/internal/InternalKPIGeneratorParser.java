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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEMICOLON", "RULE_NEWLINE", "RULE_PIPE", "RULE_INT", "RULE_CADENA", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'completed'", "'new'", "'FALSO'", "'VERDADERO'", "'.'"
    };
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



    // $ANTLR start "entryRuleTask"
    // InternalKPIGenerator.g:53:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:54:1: ( ruleTask EOF )
            // InternalKPIGenerator.g:55:1: ruleTask EOF
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
    // InternalKPIGenerator.g:62:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:66:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalKPIGenerator.g:67:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalKPIGenerator.g:67:2: ( ( rule__Task__Group__0 ) )
            // InternalKPIGenerator.g:68:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalKPIGenerator.g:69:3: ( rule__Task__Group__0 )
            // InternalKPIGenerator.g:69:4: rule__Task__Group__0
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
    // InternalKPIGenerator.g:78:1: entryRuleStatus : ruleStatus EOF ;
    public final void entryRuleStatus() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:79:1: ( ruleStatus EOF )
            // InternalKPIGenerator.g:80:1: ruleStatus EOF
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
    // InternalKPIGenerator.g:87:1: ruleStatus : ( ( rule__Status__Group__0 ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:91:2: ( ( ( rule__Status__Group__0 ) ) )
            // InternalKPIGenerator.g:92:2: ( ( rule__Status__Group__0 ) )
            {
            // InternalKPIGenerator.g:92:2: ( ( rule__Status__Group__0 ) )
            // InternalKPIGenerator.g:93:3: ( rule__Status__Group__0 )
            {
             before(grammarAccess.getStatusAccess().getGroup()); 
            // InternalKPIGenerator.g:94:3: ( rule__Status__Group__0 )
            // InternalKPIGenerator.g:94:4: rule__Status__Group__0
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


    // $ANTLR start "entryRuleBOOL"
    // InternalKPIGenerator.g:103:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:104:1: ( ruleBOOL EOF )
            // InternalKPIGenerator.g:105:1: ruleBOOL EOF
            {
             before(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_1);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getBOOLRule()); 
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
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // InternalKPIGenerator.g:112:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:116:2: ( ( ( rule__BOOL__Alternatives ) ) )
            // InternalKPIGenerator.g:117:2: ( ( rule__BOOL__Alternatives ) )
            {
            // InternalKPIGenerator.g:117:2: ( ( rule__BOOL__Alternatives ) )
            // InternalKPIGenerator.g:118:3: ( rule__BOOL__Alternatives )
            {
             before(grammarAccess.getBOOLAccess().getAlternatives()); 
            // InternalKPIGenerator.g:119:3: ( rule__BOOL__Alternatives )
            // InternalKPIGenerator.g:119:4: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleTaskName"
    // InternalKPIGenerator.g:128:1: entryRuleTaskName : ruleTaskName EOF ;
    public final void entryRuleTaskName() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:129:1: ( ruleTaskName EOF )
            // InternalKPIGenerator.g:130:1: ruleTaskName EOF
            {
             before(grammarAccess.getTaskNameRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskName();

            state._fsp--;

             after(grammarAccess.getTaskNameRule()); 
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
    // $ANTLR end "entryRuleTaskName"


    // $ANTLR start "ruleTaskName"
    // InternalKPIGenerator.g:137:1: ruleTaskName : ( ( rule__TaskName__Alternatives ) ) ;
    public final void ruleTaskName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:141:2: ( ( ( rule__TaskName__Alternatives ) ) )
            // InternalKPIGenerator.g:142:2: ( ( rule__TaskName__Alternatives ) )
            {
            // InternalKPIGenerator.g:142:2: ( ( rule__TaskName__Alternatives ) )
            // InternalKPIGenerator.g:143:3: ( rule__TaskName__Alternatives )
            {
             before(grammarAccess.getTaskNameAccess().getAlternatives()); 
            // InternalKPIGenerator.g:144:3: ( rule__TaskName__Alternatives )
            // InternalKPIGenerator.g:144:4: rule__TaskName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TaskName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskName"


    // $ANTLR start "entryRuleEDouble"
    // InternalKPIGenerator.g:153:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:154:1: ( ruleEDouble EOF )
            // InternalKPIGenerator.g:155:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalKPIGenerator.g:162:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:166:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalKPIGenerator.g:167:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalKPIGenerator.g:167:2: ( ( rule__EDouble__Group__0 ) )
            // InternalKPIGenerator.g:168:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalKPIGenerator.g:169:3: ( rule__EDouble__Group__0 )
            // InternalKPIGenerator.g:169:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "rule__Status__StatusNameAlternatives_0_0"
    // InternalKPIGenerator.g:177:1: rule__Status__StatusNameAlternatives_0_0 : ( ( 'completed' ) | ( 'new' ) );
    public final void rule__Status__StatusNameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:181:1: ( ( 'completed' ) | ( 'new' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
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
                    // InternalKPIGenerator.g:182:2: ( 'completed' )
                    {
                    // InternalKPIGenerator.g:182:2: ( 'completed' )
                    // InternalKPIGenerator.g:183:3: 'completed'
                    {
                     before(grammarAccess.getStatusAccess().getStatusNameCompletedKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStatusAccess().getStatusNameCompletedKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:188:2: ( 'new' )
                    {
                    // InternalKPIGenerator.g:188:2: ( 'new' )
                    // InternalKPIGenerator.g:189:3: 'new'
                    {
                     before(grammarAccess.getStatusAccess().getStatusNameNewKeyword_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getStatusAccess().getStatusNameNewKeyword_0_0_1()); 

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
    // $ANTLR end "rule__Status__StatusNameAlternatives_0_0"


    // $ANTLR start "rule__BOOL__Alternatives"
    // InternalKPIGenerator.g:198:1: rule__BOOL__Alternatives : ( ( 'FALSO' ) | ( 'VERDADERO' ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:202:1: ( ( 'FALSO' ) | ( 'VERDADERO' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:203:2: ( 'FALSO' )
                    {
                    // InternalKPIGenerator.g:203:2: ( 'FALSO' )
                    // InternalKPIGenerator.g:204:3: 'FALSO'
                    {
                     before(grammarAccess.getBOOLAccess().getFALSOKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBOOLAccess().getFALSOKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:209:2: ( 'VERDADERO' )
                    {
                    // InternalKPIGenerator.g:209:2: ( 'VERDADERO' )
                    // InternalKPIGenerator.g:210:3: 'VERDADERO'
                    {
                     before(grammarAccess.getBOOLAccess().getVERDADEROKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBOOLAccess().getVERDADEROKeyword_1()); 

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
    // $ANTLR end "rule__BOOL__Alternatives"


    // $ANTLR start "rule__TaskName__Alternatives"
    // InternalKPIGenerator.g:219:1: rule__TaskName__Alternatives : ( ( ( rule__TaskName__Group_0__0 ) ) | ( ruleEDouble ) );
    public final void rule__TaskName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:223:1: ( ( ( rule__TaskName__Group_0__0 ) ) | ( ruleEDouble ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_PIPE) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:224:2: ( ( rule__TaskName__Group_0__0 ) )
                    {
                    // InternalKPIGenerator.g:224:2: ( ( rule__TaskName__Group_0__0 ) )
                    // InternalKPIGenerator.g:225:3: ( rule__TaskName__Group_0__0 )
                    {
                     before(grammarAccess.getTaskNameAccess().getGroup_0()); 
                    // InternalKPIGenerator.g:226:3: ( rule__TaskName__Group_0__0 )
                    // InternalKPIGenerator.g:226:4: rule__TaskName__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskName__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskNameAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:230:2: ( ruleEDouble )
                    {
                    // InternalKPIGenerator.g:230:2: ( ruleEDouble )
                    // InternalKPIGenerator.g:231:3: ruleEDouble
                    {
                     before(grammarAccess.getTaskNameAccess().getEDoubleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEDouble();

                    state._fsp--;

                     after(grammarAccess.getTaskNameAccess().getEDoubleParserRuleCall_1()); 

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
    // $ANTLR end "rule__TaskName__Alternatives"


    // $ANTLR start "rule__Task__Group__0"
    // InternalKPIGenerator.g:240:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:244:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalKPIGenerator.g:245:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalKPIGenerator.g:252:1: rule__Task__Group__0__Impl : ( () ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:256:1: ( ( () ) )
            // InternalKPIGenerator.g:257:1: ( () )
            {
            // InternalKPIGenerator.g:257:1: ( () )
            // InternalKPIGenerator.g:258:2: ()
            {
             before(grammarAccess.getTaskAccess().getTaskAction_0()); 
            // InternalKPIGenerator.g:259:2: ()
            // InternalKPIGenerator.g:259:3: 
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
    // InternalKPIGenerator.g:267:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:271:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalKPIGenerator.g:272:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:279:1: rule__Task__Group__1__Impl : ( ( rule__Task__TaskIdAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:283:1: ( ( ( rule__Task__TaskIdAssignment_1 ) ) )
            // InternalKPIGenerator.g:284:1: ( ( rule__Task__TaskIdAssignment_1 ) )
            {
            // InternalKPIGenerator.g:284:1: ( ( rule__Task__TaskIdAssignment_1 ) )
            // InternalKPIGenerator.g:285:2: ( rule__Task__TaskIdAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getTaskIdAssignment_1()); 
            // InternalKPIGenerator.g:286:2: ( rule__Task__TaskIdAssignment_1 )
            // InternalKPIGenerator.g:286:3: rule__Task__TaskIdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__TaskIdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTaskIdAssignment_1()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:294:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:298:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalKPIGenerator.g:299:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:306:1: rule__Task__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:310:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:311:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:311:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:312:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_2()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:321:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:325:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalKPIGenerator.g:326:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:333:1: rule__Task__Group__3__Impl : ( ( rule__Task__TaskListAssignment_3 ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:337:1: ( ( ( rule__Task__TaskListAssignment_3 ) ) )
            // InternalKPIGenerator.g:338:1: ( ( rule__Task__TaskListAssignment_3 ) )
            {
            // InternalKPIGenerator.g:338:1: ( ( rule__Task__TaskListAssignment_3 ) )
            // InternalKPIGenerator.g:339:2: ( rule__Task__TaskListAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getTaskListAssignment_3()); 
            // InternalKPIGenerator.g:340:2: ( rule__Task__TaskListAssignment_3 )
            // InternalKPIGenerator.g:340:3: rule__Task__TaskListAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Task__TaskListAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTaskListAssignment_3()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:348:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:352:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalKPIGenerator.g:353:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:360:1: rule__Task__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:364:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:365:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:365:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:366:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_4()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:375:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:379:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalKPIGenerator.g:380:2: rule__Task__Group__5__Impl rule__Task__Group__6
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
    // InternalKPIGenerator.g:387:1: rule__Task__Group__5__Impl : ( ( rule__Task__MilestoneAssignment_5 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:391:1: ( ( ( rule__Task__MilestoneAssignment_5 )? ) )
            // InternalKPIGenerator.g:392:1: ( ( rule__Task__MilestoneAssignment_5 )? )
            {
            // InternalKPIGenerator.g:392:1: ( ( rule__Task__MilestoneAssignment_5 )? )
            // InternalKPIGenerator.g:393:2: ( rule__Task__MilestoneAssignment_5 )?
            {
             before(grammarAccess.getTaskAccess().getMilestoneAssignment_5()); 
            // InternalKPIGenerator.g:394:2: ( rule__Task__MilestoneAssignment_5 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CADENA) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:394:3: rule__Task__MilestoneAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__MilestoneAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getMilestoneAssignment_5()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:402:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:406:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalKPIGenerator.g:407:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalKPIGenerator.g:414:1: rule__Task__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:418:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:419:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:419:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:420:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_6()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:429:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:433:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalKPIGenerator.g:434:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:441:1: rule__Task__Group__7__Impl : ( ( rule__Task__TaskAssignment_7 ) ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:445:1: ( ( ( rule__Task__TaskAssignment_7 ) ) )
            // InternalKPIGenerator.g:446:1: ( ( rule__Task__TaskAssignment_7 ) )
            {
            // InternalKPIGenerator.g:446:1: ( ( rule__Task__TaskAssignment_7 ) )
            // InternalKPIGenerator.g:447:2: ( rule__Task__TaskAssignment_7 )
            {
             before(grammarAccess.getTaskAccess().getTaskAssignment_7()); 
            // InternalKPIGenerator.g:448:2: ( rule__Task__TaskAssignment_7 )
            // InternalKPIGenerator.g:448:3: rule__Task__TaskAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Task__TaskAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTaskAssignment_7()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:456:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:460:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalKPIGenerator.g:461:2: rule__Task__Group__8__Impl rule__Task__Group__9
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
    // InternalKPIGenerator.g:468:1: rule__Task__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:472:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:473:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:473:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:474:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_8()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_8()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:483:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:487:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalKPIGenerator.g:488:2: rule__Task__Group__9__Impl rule__Task__Group__10
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:495:1: rule__Task__Group__9__Impl : ( ( rule__Task__TaskDescriptionAssignment_9 )? ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:499:1: ( ( ( rule__Task__TaskDescriptionAssignment_9 )? ) )
            // InternalKPIGenerator.g:500:1: ( ( rule__Task__TaskDescriptionAssignment_9 )? )
            {
            // InternalKPIGenerator.g:500:1: ( ( rule__Task__TaskDescriptionAssignment_9 )? )
            // InternalKPIGenerator.g:501:2: ( rule__Task__TaskDescriptionAssignment_9 )?
            {
             before(grammarAccess.getTaskAccess().getTaskDescriptionAssignment_9()); 
            // InternalKPIGenerator.g:502:2: ( rule__Task__TaskDescriptionAssignment_9 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_CADENA) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:502:3: rule__Task__TaskDescriptionAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__TaskDescriptionAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getTaskDescriptionAssignment_9()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:510:1: rule__Task__Group__10 : rule__Task__Group__10__Impl rule__Task__Group__11 ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:514:1: ( rule__Task__Group__10__Impl rule__Task__Group__11 )
            // InternalKPIGenerator.g:515:2: rule__Task__Group__10__Impl rule__Task__Group__11
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:522:1: rule__Task__Group__10__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:526:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:527:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:527:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:528:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_10()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_10()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:537:1: rule__Task__Group__11 : rule__Task__Group__11__Impl rule__Task__Group__12 ;
    public final void rule__Task__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:541:1: ( rule__Task__Group__11__Impl rule__Task__Group__12 )
            // InternalKPIGenerator.g:542:2: rule__Task__Group__11__Impl rule__Task__Group__12
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:549:1: rule__Task__Group__11__Impl : ( ( rule__Task__StartDateAssignment_11 ) ) ;
    public final void rule__Task__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:553:1: ( ( ( rule__Task__StartDateAssignment_11 ) ) )
            // InternalKPIGenerator.g:554:1: ( ( rule__Task__StartDateAssignment_11 ) )
            {
            // InternalKPIGenerator.g:554:1: ( ( rule__Task__StartDateAssignment_11 ) )
            // InternalKPIGenerator.g:555:2: ( rule__Task__StartDateAssignment_11 )
            {
             before(grammarAccess.getTaskAccess().getStartDateAssignment_11()); 
            // InternalKPIGenerator.g:556:2: ( rule__Task__StartDateAssignment_11 )
            // InternalKPIGenerator.g:556:3: rule__Task__StartDateAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Task__StartDateAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStartDateAssignment_11()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:564:1: rule__Task__Group__12 : rule__Task__Group__12__Impl rule__Task__Group__13 ;
    public final void rule__Task__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:568:1: ( rule__Task__Group__12__Impl rule__Task__Group__13 )
            // InternalKPIGenerator.g:569:2: rule__Task__Group__12__Impl rule__Task__Group__13
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:576:1: rule__Task__Group__12__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:580:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:581:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:581:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:582:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_12()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_12()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:591:1: rule__Task__Group__13 : rule__Task__Group__13__Impl rule__Task__Group__14 ;
    public final void rule__Task__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:595:1: ( rule__Task__Group__13__Impl rule__Task__Group__14 )
            // InternalKPIGenerator.g:596:2: rule__Task__Group__13__Impl rule__Task__Group__14
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:603:1: rule__Task__Group__13__Impl : ( ( rule__Task__DueDateAssignment_13 ) ) ;
    public final void rule__Task__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:607:1: ( ( ( rule__Task__DueDateAssignment_13 ) ) )
            // InternalKPIGenerator.g:608:1: ( ( rule__Task__DueDateAssignment_13 ) )
            {
            // InternalKPIGenerator.g:608:1: ( ( rule__Task__DueDateAssignment_13 ) )
            // InternalKPIGenerator.g:609:2: ( rule__Task__DueDateAssignment_13 )
            {
             before(grammarAccess.getTaskAccess().getDueDateAssignment_13()); 
            // InternalKPIGenerator.g:610:2: ( rule__Task__DueDateAssignment_13 )
            // InternalKPIGenerator.g:610:3: rule__Task__DueDateAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Task__DueDateAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDueDateAssignment_13()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:618:1: rule__Task__Group__14 : rule__Task__Group__14__Impl rule__Task__Group__15 ;
    public final void rule__Task__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:622:1: ( rule__Task__Group__14__Impl rule__Task__Group__15 )
            // InternalKPIGenerator.g:623:2: rule__Task__Group__14__Impl rule__Task__Group__15
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:630:1: rule__Task__Group__14__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:634:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:635:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:635:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:636:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_14()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_14()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:645:1: rule__Task__Group__15 : rule__Task__Group__15__Impl rule__Task__Group__16 ;
    public final void rule__Task__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:649:1: ( rule__Task__Group__15__Impl rule__Task__Group__16 )
            // InternalKPIGenerator.g:650:2: rule__Task__Group__15__Impl rule__Task__Group__16
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIGenerator.g:657:1: rule__Task__Group__15__Impl : ( ( rule__Task__PriorityAssignment_15 )? ) ;
    public final void rule__Task__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:661:1: ( ( ( rule__Task__PriorityAssignment_15 )? ) )
            // InternalKPIGenerator.g:662:1: ( ( rule__Task__PriorityAssignment_15 )? )
            {
            // InternalKPIGenerator.g:662:1: ( ( rule__Task__PriorityAssignment_15 )? )
            // InternalKPIGenerator.g:663:2: ( rule__Task__PriorityAssignment_15 )?
            {
             before(grammarAccess.getTaskAccess().getPriorityAssignment_15()); 
            // InternalKPIGenerator.g:664:2: ( rule__Task__PriorityAssignment_15 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CADENA) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:664:3: rule__Task__PriorityAssignment_15
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__PriorityAssignment_15();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getPriorityAssignment_15()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:672:1: rule__Task__Group__16 : rule__Task__Group__16__Impl rule__Task__Group__17 ;
    public final void rule__Task__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:676:1: ( rule__Task__Group__16__Impl rule__Task__Group__17 )
            // InternalKPIGenerator.g:677:2: rule__Task__Group__16__Impl rule__Task__Group__17
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:684:1: rule__Task__Group__16__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:688:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:689:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:689:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:690:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_16()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_16()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:699:1: rule__Task__Group__17 : rule__Task__Group__17__Impl rule__Task__Group__18 ;
    public final void rule__Task__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:703:1: ( rule__Task__Group__17__Impl rule__Task__Group__18 )
            // InternalKPIGenerator.g:704:2: rule__Task__Group__17__Impl rule__Task__Group__18
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:711:1: rule__Task__Group__17__Impl : ( ( rule__Task__PrivateAssignment_17 ) ) ;
    public final void rule__Task__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:715:1: ( ( ( rule__Task__PrivateAssignment_17 ) ) )
            // InternalKPIGenerator.g:716:1: ( ( rule__Task__PrivateAssignment_17 ) )
            {
            // InternalKPIGenerator.g:716:1: ( ( rule__Task__PrivateAssignment_17 ) )
            // InternalKPIGenerator.g:717:2: ( rule__Task__PrivateAssignment_17 )
            {
             before(grammarAccess.getTaskAccess().getPrivateAssignment_17()); 
            // InternalKPIGenerator.g:718:2: ( rule__Task__PrivateAssignment_17 )
            // InternalKPIGenerator.g:718:3: rule__Task__PrivateAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Task__PrivateAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPrivateAssignment_17()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:726:1: rule__Task__Group__18 : rule__Task__Group__18__Impl rule__Task__Group__19 ;
    public final void rule__Task__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:730:1: ( rule__Task__Group__18__Impl rule__Task__Group__19 )
            // InternalKPIGenerator.g:731:2: rule__Task__Group__18__Impl rule__Task__Group__19
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:738:1: rule__Task__Group__18__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:742:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:743:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:743:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:744:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_18()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_18()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:753:1: rule__Task__Group__19 : rule__Task__Group__19__Impl rule__Task__Group__20 ;
    public final void rule__Task__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:757:1: ( rule__Task__Group__19__Impl rule__Task__Group__20 )
            // InternalKPIGenerator.g:758:2: rule__Task__Group__19__Impl rule__Task__Group__20
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:765:1: rule__Task__Group__19__Impl : ( ( rule__Task__ProgressAssignment_19 ) ) ;
    public final void rule__Task__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:769:1: ( ( ( rule__Task__ProgressAssignment_19 ) ) )
            // InternalKPIGenerator.g:770:1: ( ( rule__Task__ProgressAssignment_19 ) )
            {
            // InternalKPIGenerator.g:770:1: ( ( rule__Task__ProgressAssignment_19 ) )
            // InternalKPIGenerator.g:771:2: ( rule__Task__ProgressAssignment_19 )
            {
             before(grammarAccess.getTaskAccess().getProgressAssignment_19()); 
            // InternalKPIGenerator.g:772:2: ( rule__Task__ProgressAssignment_19 )
            // InternalKPIGenerator.g:772:3: rule__Task__ProgressAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__Task__ProgressAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getProgressAssignment_19()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:780:1: rule__Task__Group__20 : rule__Task__Group__20__Impl rule__Task__Group__21 ;
    public final void rule__Task__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:784:1: ( rule__Task__Group__20__Impl rule__Task__Group__21 )
            // InternalKPIGenerator.g:785:2: rule__Task__Group__20__Impl rule__Task__Group__21
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIGenerator.g:792:1: rule__Task__Group__20__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:796:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:797:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:797:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:798:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_20()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_20()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:807:1: rule__Task__Group__21 : rule__Task__Group__21__Impl rule__Task__Group__22 ;
    public final void rule__Task__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:811:1: ( rule__Task__Group__21__Impl rule__Task__Group__22 )
            // InternalKPIGenerator.g:812:2: rule__Task__Group__21__Impl rule__Task__Group__22
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:819:1: rule__Task__Group__21__Impl : ( ( rule__Task__TaskAssignment_21 ) ) ;
    public final void rule__Task__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:823:1: ( ( ( rule__Task__TaskAssignment_21 ) ) )
            // InternalKPIGenerator.g:824:1: ( ( rule__Task__TaskAssignment_21 ) )
            {
            // InternalKPIGenerator.g:824:1: ( ( rule__Task__TaskAssignment_21 ) )
            // InternalKPIGenerator.g:825:2: ( rule__Task__TaskAssignment_21 )
            {
             before(grammarAccess.getTaskAccess().getTaskAssignment_21()); 
            // InternalKPIGenerator.g:826:2: ( rule__Task__TaskAssignment_21 )
            // InternalKPIGenerator.g:826:3: rule__Task__TaskAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Task__TaskAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTaskAssignment_21()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:834:1: rule__Task__Group__22 : rule__Task__Group__22__Impl rule__Task__Group__23 ;
    public final void rule__Task__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:838:1: ( rule__Task__Group__22__Impl rule__Task__Group__23 )
            // InternalKPIGenerator.g:839:2: rule__Task__Group__22__Impl rule__Task__Group__23
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:846:1: rule__Task__Group__22__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:850:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:851:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:851:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:852:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_22()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_22()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:861:1: rule__Task__Group__23 : rule__Task__Group__23__Impl rule__Task__Group__24 ;
    public final void rule__Task__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:865:1: ( rule__Task__Group__23__Impl rule__Task__Group__24 )
            // InternalKPIGenerator.g:866:2: rule__Task__Group__23__Impl rule__Task__Group__24
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:873:1: rule__Task__Group__23__Impl : ( ( rule__Task__AssignedToAssignment_23 ) ) ;
    public final void rule__Task__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:877:1: ( ( ( rule__Task__AssignedToAssignment_23 ) ) )
            // InternalKPIGenerator.g:878:1: ( ( rule__Task__AssignedToAssignment_23 ) )
            {
            // InternalKPIGenerator.g:878:1: ( ( rule__Task__AssignedToAssignment_23 ) )
            // InternalKPIGenerator.g:879:2: ( rule__Task__AssignedToAssignment_23 )
            {
             before(grammarAccess.getTaskAccess().getAssignedToAssignment_23()); 
            // InternalKPIGenerator.g:880:2: ( rule__Task__AssignedToAssignment_23 )
            // InternalKPIGenerator.g:880:3: rule__Task__AssignedToAssignment_23
            {
            pushFollow(FOLLOW_2);
            rule__Task__AssignedToAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAssignedToAssignment_23()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:888:1: rule__Task__Group__24 : rule__Task__Group__24__Impl rule__Task__Group__25 ;
    public final void rule__Task__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:892:1: ( rule__Task__Group__24__Impl rule__Task__Group__25 )
            // InternalKPIGenerator.g:893:2: rule__Task__Group__24__Impl rule__Task__Group__25
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:900:1: rule__Task__Group__24__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:904:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:905:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:905:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:906:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_24()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_24()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:915:1: rule__Task__Group__25 : rule__Task__Group__25__Impl rule__Task__Group__26 ;
    public final void rule__Task__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:919:1: ( rule__Task__Group__25__Impl rule__Task__Group__26 )
            // InternalKPIGenerator.g:920:2: rule__Task__Group__25__Impl rule__Task__Group__26
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:927:1: rule__Task__Group__25__Impl : ( ( rule__Task__CreatedDateAssignment_25 ) ) ;
    public final void rule__Task__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:931:1: ( ( ( rule__Task__CreatedDateAssignment_25 ) ) )
            // InternalKPIGenerator.g:932:1: ( ( rule__Task__CreatedDateAssignment_25 ) )
            {
            // InternalKPIGenerator.g:932:1: ( ( rule__Task__CreatedDateAssignment_25 ) )
            // InternalKPIGenerator.g:933:2: ( rule__Task__CreatedDateAssignment_25 )
            {
             before(grammarAccess.getTaskAccess().getCreatedDateAssignment_25()); 
            // InternalKPIGenerator.g:934:2: ( rule__Task__CreatedDateAssignment_25 )
            // InternalKPIGenerator.g:934:3: rule__Task__CreatedDateAssignment_25
            {
            pushFollow(FOLLOW_2);
            rule__Task__CreatedDateAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCreatedDateAssignment_25()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:942:1: rule__Task__Group__26 : rule__Task__Group__26__Impl rule__Task__Group__27 ;
    public final void rule__Task__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:946:1: ( rule__Task__Group__26__Impl rule__Task__Group__27 )
            // InternalKPIGenerator.g:947:2: rule__Task__Group__26__Impl rule__Task__Group__27
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:954:1: rule__Task__Group__26__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:958:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:959:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:959:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:960:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_26()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_26()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:969:1: rule__Task__Group__27 : rule__Task__Group__27__Impl rule__Task__Group__28 ;
    public final void rule__Task__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:973:1: ( rule__Task__Group__27__Impl rule__Task__Group__28 )
            // InternalKPIGenerator.g:974:2: rule__Task__Group__27__Impl rule__Task__Group__28
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:981:1: rule__Task__Group__27__Impl : ( ( rule__Task__CompletedDateAssignment_27 ) ) ;
    public final void rule__Task__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:985:1: ( ( ( rule__Task__CompletedDateAssignment_27 ) ) )
            // InternalKPIGenerator.g:986:1: ( ( rule__Task__CompletedDateAssignment_27 ) )
            {
            // InternalKPIGenerator.g:986:1: ( ( rule__Task__CompletedDateAssignment_27 ) )
            // InternalKPIGenerator.g:987:2: ( rule__Task__CompletedDateAssignment_27 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAssignment_27()); 
            // InternalKPIGenerator.g:988:2: ( rule__Task__CompletedDateAssignment_27 )
            // InternalKPIGenerator.g:988:3: rule__Task__CompletedDateAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAssignment_27()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:996:1: rule__Task__Group__28 : rule__Task__Group__28__Impl rule__Task__Group__29 ;
    public final void rule__Task__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1000:1: ( rule__Task__Group__28__Impl rule__Task__Group__29 )
            // InternalKPIGenerator.g:1001:2: rule__Task__Group__28__Impl rule__Task__Group__29
            {
            pushFollow(FOLLOW_10);
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
    // InternalKPIGenerator.g:1008:1: rule__Task__Group__28__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1012:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1013:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1013:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1014:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_28()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_28()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1023:1: rule__Task__Group__29 : rule__Task__Group__29__Impl rule__Task__Group__30 ;
    public final void rule__Task__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1027:1: ( rule__Task__Group__29__Impl rule__Task__Group__30 )
            // InternalKPIGenerator.g:1028:2: rule__Task__Group__29__Impl rule__Task__Group__30
            {
            pushFollow(FOLLOW_10);
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
    // InternalKPIGenerator.g:1035:1: rule__Task__Group__29__Impl : ( ( rule__Task__TimeLoggedAssignment_29 )? ) ;
    public final void rule__Task__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1039:1: ( ( ( rule__Task__TimeLoggedAssignment_29 )? ) )
            // InternalKPIGenerator.g:1040:1: ( ( rule__Task__TimeLoggedAssignment_29 )? )
            {
            // InternalKPIGenerator.g:1040:1: ( ( rule__Task__TimeLoggedAssignment_29 )? )
            // InternalKPIGenerator.g:1041:2: ( rule__Task__TimeLoggedAssignment_29 )?
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedAssignment_29()); 
            // InternalKPIGenerator.g:1042:2: ( rule__Task__TimeLoggedAssignment_29 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:1042:3: rule__Task__TimeLoggedAssignment_29
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__TimeLoggedAssignment_29();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getTimeLoggedAssignment_29()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1050:1: rule__Task__Group__30 : rule__Task__Group__30__Impl rule__Task__Group__31 ;
    public final void rule__Task__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1054:1: ( rule__Task__Group__30__Impl rule__Task__Group__31 )
            // InternalKPIGenerator.g:1055:2: rule__Task__Group__30__Impl rule__Task__Group__31
            {
            pushFollow(FOLLOW_10);
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
    // InternalKPIGenerator.g:1062:1: rule__Task__Group__30__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1066:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1067:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1067:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1068:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_30()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_30()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1077:1: rule__Task__Group__31 : rule__Task__Group__31__Impl rule__Task__Group__32 ;
    public final void rule__Task__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1081:1: ( rule__Task__Group__31__Impl rule__Task__Group__32 )
            // InternalKPIGenerator.g:1082:2: rule__Task__Group__31__Impl rule__Task__Group__32
            {
            pushFollow(FOLLOW_10);
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
    // InternalKPIGenerator.g:1089:1: rule__Task__Group__31__Impl : ( ( rule__Task__BillableMinutesAssignment_31 )? ) ;
    public final void rule__Task__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1093:1: ( ( ( rule__Task__BillableMinutesAssignment_31 )? ) )
            // InternalKPIGenerator.g:1094:1: ( ( rule__Task__BillableMinutesAssignment_31 )? )
            {
            // InternalKPIGenerator.g:1094:1: ( ( rule__Task__BillableMinutesAssignment_31 )? )
            // InternalKPIGenerator.g:1095:2: ( rule__Task__BillableMinutesAssignment_31 )?
            {
             before(grammarAccess.getTaskAccess().getBillableMinutesAssignment_31()); 
            // InternalKPIGenerator.g:1096:2: ( rule__Task__BillableMinutesAssignment_31 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKPIGenerator.g:1096:3: rule__Task__BillableMinutesAssignment_31
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__BillableMinutesAssignment_31();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getBillableMinutesAssignment_31()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1104:1: rule__Task__Group__32 : rule__Task__Group__32__Impl rule__Task__Group__33 ;
    public final void rule__Task__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1108:1: ( rule__Task__Group__32__Impl rule__Task__Group__33 )
            // InternalKPIGenerator.g:1109:2: rule__Task__Group__32__Impl rule__Task__Group__33
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:1116:1: rule__Task__Group__32__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1120:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1121:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1121:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1122:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_32()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_32()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1131:1: rule__Task__Group__33 : rule__Task__Group__33__Impl rule__Task__Group__34 ;
    public final void rule__Task__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1135:1: ( rule__Task__Group__33__Impl rule__Task__Group__34 )
            // InternalKPIGenerator.g:1136:2: rule__Task__Group__33__Impl rule__Task__Group__34
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:1143:1: rule__Task__Group__33__Impl : ( ( rule__Task__TaskParentAssignment_33 ) ) ;
    public final void rule__Task__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1147:1: ( ( ( rule__Task__TaskParentAssignment_33 ) ) )
            // InternalKPIGenerator.g:1148:1: ( ( rule__Task__TaskParentAssignment_33 ) )
            {
            // InternalKPIGenerator.g:1148:1: ( ( rule__Task__TaskParentAssignment_33 ) )
            // InternalKPIGenerator.g:1149:2: ( rule__Task__TaskParentAssignment_33 )
            {
             before(grammarAccess.getTaskAccess().getTaskParentAssignment_33()); 
            // InternalKPIGenerator.g:1150:2: ( rule__Task__TaskParentAssignment_33 )
            // InternalKPIGenerator.g:1150:3: rule__Task__TaskParentAssignment_33
            {
            pushFollow(FOLLOW_2);
            rule__Task__TaskParentAssignment_33();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTaskParentAssignment_33()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1158:1: rule__Task__Group__34 : rule__Task__Group__34__Impl rule__Task__Group__35 ;
    public final void rule__Task__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1162:1: ( rule__Task__Group__34__Impl rule__Task__Group__35 )
            // InternalKPIGenerator.g:1163:2: rule__Task__Group__34__Impl rule__Task__Group__35
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:1170:1: rule__Task__Group__34__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1174:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1175:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1175:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1176:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_34()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_34()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1185:1: rule__Task__Group__35 : rule__Task__Group__35__Impl rule__Task__Group__36 ;
    public final void rule__Task__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1189:1: ( rule__Task__Group__35__Impl rule__Task__Group__36 )
            // InternalKPIGenerator.g:1190:2: rule__Task__Group__35__Impl rule__Task__Group__36
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:1197:1: rule__Task__Group__35__Impl : ( ( rule__Task__CompletedOnTimeAssignment_35 ) ) ;
    public final void rule__Task__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1201:1: ( ( ( rule__Task__CompletedOnTimeAssignment_35 ) ) )
            // InternalKPIGenerator.g:1202:1: ( ( rule__Task__CompletedOnTimeAssignment_35 ) )
            {
            // InternalKPIGenerator.g:1202:1: ( ( rule__Task__CompletedOnTimeAssignment_35 ) )
            // InternalKPIGenerator.g:1203:2: ( rule__Task__CompletedOnTimeAssignment_35 )
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_35()); 
            // InternalKPIGenerator.g:1204:2: ( rule__Task__CompletedOnTimeAssignment_35 )
            // InternalKPIGenerator.g:1204:3: rule__Task__CompletedOnTimeAssignment_35
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedOnTimeAssignment_35();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_35()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1212:1: rule__Task__Group__36 : rule__Task__Group__36__Impl rule__Task__Group__37 ;
    public final void rule__Task__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1216:1: ( rule__Task__Group__36__Impl rule__Task__Group__37 )
            // InternalKPIGenerator.g:1217:2: rule__Task__Group__36__Impl rule__Task__Group__37
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:1224:1: rule__Task__Group__36__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1228:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1229:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1229:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1230:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_36()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_36()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1239:1: rule__Task__Group__37 : rule__Task__Group__37__Impl rule__Task__Group__38 ;
    public final void rule__Task__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1243:1: ( rule__Task__Group__37__Impl rule__Task__Group__38 )
            // InternalKPIGenerator.g:1244:2: rule__Task__Group__37__Impl rule__Task__Group__38
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:1251:1: rule__Task__Group__37__Impl : ( ( rule__Task__TimeEstimatedAssignment_37 ) ) ;
    public final void rule__Task__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1255:1: ( ( ( rule__Task__TimeEstimatedAssignment_37 ) ) )
            // InternalKPIGenerator.g:1256:1: ( ( rule__Task__TimeEstimatedAssignment_37 ) )
            {
            // InternalKPIGenerator.g:1256:1: ( ( rule__Task__TimeEstimatedAssignment_37 ) )
            // InternalKPIGenerator.g:1257:2: ( rule__Task__TimeEstimatedAssignment_37 )
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_37()); 
            // InternalKPIGenerator.g:1258:2: ( rule__Task__TimeEstimatedAssignment_37 )
            // InternalKPIGenerator.g:1258:3: rule__Task__TimeEstimatedAssignment_37
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeEstimatedAssignment_37();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_37()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1266:1: rule__Task__Group__38 : rule__Task__Group__38__Impl rule__Task__Group__39 ;
    public final void rule__Task__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1270:1: ( rule__Task__Group__38__Impl rule__Task__Group__39 )
            // InternalKPIGenerator.g:1271:2: rule__Task__Group__38__Impl rule__Task__Group__39
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:1278:1: rule__Task__Group__38__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1282:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1283:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1283:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1284:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_38()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_38()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1293:1: rule__Task__Group__39 : rule__Task__Group__39__Impl rule__Task__Group__40 ;
    public final void rule__Task__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1297:1: ( rule__Task__Group__39__Impl rule__Task__Group__40 )
            // InternalKPIGenerator.g:1298:2: rule__Task__Group__39__Impl rule__Task__Group__40
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:1305:1: rule__Task__Group__39__Impl : ( ( rule__Task__TagsAssignment_39 )? ) ;
    public final void rule__Task__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1309:1: ( ( ( rule__Task__TagsAssignment_39 )? ) )
            // InternalKPIGenerator.g:1310:1: ( ( rule__Task__TagsAssignment_39 )? )
            {
            // InternalKPIGenerator.g:1310:1: ( ( rule__Task__TagsAssignment_39 )? )
            // InternalKPIGenerator.g:1311:2: ( rule__Task__TagsAssignment_39 )?
            {
             before(grammarAccess.getTaskAccess().getTagsAssignment_39()); 
            // InternalKPIGenerator.g:1312:2: ( rule__Task__TagsAssignment_39 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CADENA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKPIGenerator.g:1312:3: rule__Task__TagsAssignment_39
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__TagsAssignment_39();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getTagsAssignment_39()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1320:1: rule__Task__Group__40 : rule__Task__Group__40__Impl ;
    public final void rule__Task__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1324:1: ( rule__Task__Group__40__Impl )
            // InternalKPIGenerator.g:1325:2: rule__Task__Group__40__Impl
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
    // InternalKPIGenerator.g:1331:1: rule__Task__Group__40__Impl : ( RULE_NEWLINE ) ;
    public final void rule__Task__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1335:1: ( ( RULE_NEWLINE ) )
            // InternalKPIGenerator.g:1336:1: ( RULE_NEWLINE )
            {
            // InternalKPIGenerator.g:1336:1: ( RULE_NEWLINE )
            // InternalKPIGenerator.g:1337:2: RULE_NEWLINE
            {
             before(grammarAccess.getTaskAccess().getNEWLINETerminalRuleCall_40()); 
            match(input,RULE_NEWLINE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNEWLINETerminalRuleCall_40()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1347:1: rule__Status__Group__0 : rule__Status__Group__0__Impl rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1351:1: ( rule__Status__Group__0__Impl rule__Status__Group__1 )
            // InternalKPIGenerator.g:1352:2: rule__Status__Group__0__Impl rule__Status__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:1359:1: rule__Status__Group__0__Impl : ( ( rule__Status__StatusNameAssignment_0 ) ) ;
    public final void rule__Status__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1363:1: ( ( ( rule__Status__StatusNameAssignment_0 ) ) )
            // InternalKPIGenerator.g:1364:1: ( ( rule__Status__StatusNameAssignment_0 ) )
            {
            // InternalKPIGenerator.g:1364:1: ( ( rule__Status__StatusNameAssignment_0 ) )
            // InternalKPIGenerator.g:1365:2: ( rule__Status__StatusNameAssignment_0 )
            {
             before(grammarAccess.getStatusAccess().getStatusNameAssignment_0()); 
            // InternalKPIGenerator.g:1366:2: ( rule__Status__StatusNameAssignment_0 )
            // InternalKPIGenerator.g:1366:3: rule__Status__StatusNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Status__StatusNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getStatusNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__0__Impl"


    // $ANTLR start "rule__Status__Group__1"
    // InternalKPIGenerator.g:1374:1: rule__Status__Group__1 : rule__Status__Group__1__Impl ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1378:1: ( rule__Status__Group__1__Impl )
            // InternalKPIGenerator.g:1379:2: rule__Status__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Status__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKPIGenerator.g:1385:1: rule__Status__Group__1__Impl : ( ( rule__Status__TextAssignment_1 ) ) ;
    public final void rule__Status__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1389:1: ( ( ( rule__Status__TextAssignment_1 ) ) )
            // InternalKPIGenerator.g:1390:1: ( ( rule__Status__TextAssignment_1 ) )
            {
            // InternalKPIGenerator.g:1390:1: ( ( rule__Status__TextAssignment_1 ) )
            // InternalKPIGenerator.g:1391:2: ( rule__Status__TextAssignment_1 )
            {
             before(grammarAccess.getStatusAccess().getTextAssignment_1()); 
            // InternalKPIGenerator.g:1392:2: ( rule__Status__TextAssignment_1 )
            // InternalKPIGenerator.g:1392:3: rule__Status__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Status__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getTextAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TaskName__Group_0__0"
    // InternalKPIGenerator.g:1401:1: rule__TaskName__Group_0__0 : rule__TaskName__Group_0__0__Impl rule__TaskName__Group_0__1 ;
    public final void rule__TaskName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1405:1: ( rule__TaskName__Group_0__0__Impl rule__TaskName__Group_0__1 )
            // InternalKPIGenerator.g:1406:2: rule__TaskName__Group_0__0__Impl rule__TaskName__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__TaskName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskName__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__0"


    // $ANTLR start "rule__TaskName__Group_0__0__Impl"
    // InternalKPIGenerator.g:1413:1: rule__TaskName__Group_0__0__Impl : ( RULE_PIPE ) ;
    public final void rule__TaskName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1417:1: ( ( RULE_PIPE ) )
            // InternalKPIGenerator.g:1418:1: ( RULE_PIPE )
            {
            // InternalKPIGenerator.g:1418:1: ( RULE_PIPE )
            // InternalKPIGenerator.g:1419:2: RULE_PIPE
            {
             before(grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_0()); 
            match(input,RULE_PIPE,FOLLOW_2); 
             after(grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__0__Impl"


    // $ANTLR start "rule__TaskName__Group_0__1"
    // InternalKPIGenerator.g:1428:1: rule__TaskName__Group_0__1 : rule__TaskName__Group_0__1__Impl rule__TaskName__Group_0__2 ;
    public final void rule__TaskName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1432:1: ( rule__TaskName__Group_0__1__Impl rule__TaskName__Group_0__2 )
            // InternalKPIGenerator.g:1433:2: rule__TaskName__Group_0__1__Impl rule__TaskName__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__TaskName__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskName__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__1"


    // $ANTLR start "rule__TaskName__Group_0__1__Impl"
    // InternalKPIGenerator.g:1440:1: rule__TaskName__Group_0__1__Impl : ( ( rule__TaskName__PhaseAssignment_0_1 ) ) ;
    public final void rule__TaskName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1444:1: ( ( ( rule__TaskName__PhaseAssignment_0_1 ) ) )
            // InternalKPIGenerator.g:1445:1: ( ( rule__TaskName__PhaseAssignment_0_1 ) )
            {
            // InternalKPIGenerator.g:1445:1: ( ( rule__TaskName__PhaseAssignment_0_1 ) )
            // InternalKPIGenerator.g:1446:2: ( rule__TaskName__PhaseAssignment_0_1 )
            {
             before(grammarAccess.getTaskNameAccess().getPhaseAssignment_0_1()); 
            // InternalKPIGenerator.g:1447:2: ( rule__TaskName__PhaseAssignment_0_1 )
            // InternalKPIGenerator.g:1447:3: rule__TaskName__PhaseAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskName__PhaseAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskNameAccess().getPhaseAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__1__Impl"


    // $ANTLR start "rule__TaskName__Group_0__2"
    // InternalKPIGenerator.g:1455:1: rule__TaskName__Group_0__2 : rule__TaskName__Group_0__2__Impl rule__TaskName__Group_0__3 ;
    public final void rule__TaskName__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1459:1: ( rule__TaskName__Group_0__2__Impl rule__TaskName__Group_0__3 )
            // InternalKPIGenerator.g:1460:2: rule__TaskName__Group_0__2__Impl rule__TaskName__Group_0__3
            {
            pushFollow(FOLLOW_12);
            rule__TaskName__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskName__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__2"


    // $ANTLR start "rule__TaskName__Group_0__2__Impl"
    // InternalKPIGenerator.g:1467:1: rule__TaskName__Group_0__2__Impl : ( ( rule__TaskName__Group_0_2__0 )? ) ;
    public final void rule__TaskName__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1471:1: ( ( ( rule__TaskName__Group_0_2__0 )? ) )
            // InternalKPIGenerator.g:1472:1: ( ( rule__TaskName__Group_0_2__0 )? )
            {
            // InternalKPIGenerator.g:1472:1: ( ( rule__TaskName__Group_0_2__0 )? )
            // InternalKPIGenerator.g:1473:2: ( rule__TaskName__Group_0_2__0 )?
            {
             before(grammarAccess.getTaskNameAccess().getGroup_0_2()); 
            // InternalKPIGenerator.g:1474:2: ( rule__TaskName__Group_0_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_PIPE) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_CADENA) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==RULE_PIPE) ) {
                        int LA10_3 = input.LA(4);

                        if ( (LA10_3==RULE_CADENA) ) {
                            alt10=1;
                        }
                    }
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalKPIGenerator.g:1474:3: rule__TaskName__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskName__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskNameAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__2__Impl"


    // $ANTLR start "rule__TaskName__Group_0__3"
    // InternalKPIGenerator.g:1482:1: rule__TaskName__Group_0__3 : rule__TaskName__Group_0__3__Impl rule__TaskName__Group_0__4 ;
    public final void rule__TaskName__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1486:1: ( rule__TaskName__Group_0__3__Impl rule__TaskName__Group_0__4 )
            // InternalKPIGenerator.g:1487:2: rule__TaskName__Group_0__3__Impl rule__TaskName__Group_0__4
            {
            pushFollow(FOLLOW_5);
            rule__TaskName__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskName__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__3"


    // $ANTLR start "rule__TaskName__Group_0__3__Impl"
    // InternalKPIGenerator.g:1494:1: rule__TaskName__Group_0__3__Impl : ( RULE_PIPE ) ;
    public final void rule__TaskName__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1498:1: ( ( RULE_PIPE ) )
            // InternalKPIGenerator.g:1499:1: ( RULE_PIPE )
            {
            // InternalKPIGenerator.g:1499:1: ( RULE_PIPE )
            // InternalKPIGenerator.g:1500:2: RULE_PIPE
            {
             before(grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_3()); 
            match(input,RULE_PIPE,FOLLOW_2); 
             after(grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__3__Impl"


    // $ANTLR start "rule__TaskName__Group_0__4"
    // InternalKPIGenerator.g:1509:1: rule__TaskName__Group_0__4 : rule__TaskName__Group_0__4__Impl rule__TaskName__Group_0__5 ;
    public final void rule__TaskName__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1513:1: ( rule__TaskName__Group_0__4__Impl rule__TaskName__Group_0__5 )
            // InternalKPIGenerator.g:1514:2: rule__TaskName__Group_0__4__Impl rule__TaskName__Group_0__5
            {
            pushFollow(FOLLOW_12);
            rule__TaskName__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskName__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__4"


    // $ANTLR start "rule__TaskName__Group_0__4__Impl"
    // InternalKPIGenerator.g:1521:1: rule__TaskName__Group_0__4__Impl : ( ( rule__TaskName__UseCaseAssignment_0_4 ) ) ;
    public final void rule__TaskName__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1525:1: ( ( ( rule__TaskName__UseCaseAssignment_0_4 ) ) )
            // InternalKPIGenerator.g:1526:1: ( ( rule__TaskName__UseCaseAssignment_0_4 ) )
            {
            // InternalKPIGenerator.g:1526:1: ( ( rule__TaskName__UseCaseAssignment_0_4 ) )
            // InternalKPIGenerator.g:1527:2: ( rule__TaskName__UseCaseAssignment_0_4 )
            {
             before(grammarAccess.getTaskNameAccess().getUseCaseAssignment_0_4()); 
            // InternalKPIGenerator.g:1528:2: ( rule__TaskName__UseCaseAssignment_0_4 )
            // InternalKPIGenerator.g:1528:3: rule__TaskName__UseCaseAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__TaskName__UseCaseAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getTaskNameAccess().getUseCaseAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__4__Impl"


    // $ANTLR start "rule__TaskName__Group_0__5"
    // InternalKPIGenerator.g:1536:1: rule__TaskName__Group_0__5 : rule__TaskName__Group_0__5__Impl rule__TaskName__Group_0__6 ;
    public final void rule__TaskName__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1540:1: ( rule__TaskName__Group_0__5__Impl rule__TaskName__Group_0__6 )
            // InternalKPIGenerator.g:1541:2: rule__TaskName__Group_0__5__Impl rule__TaskName__Group_0__6
            {
            pushFollow(FOLLOW_3);
            rule__TaskName__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskName__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__5"


    // $ANTLR start "rule__TaskName__Group_0__5__Impl"
    // InternalKPIGenerator.g:1548:1: rule__TaskName__Group_0__5__Impl : ( RULE_PIPE ) ;
    public final void rule__TaskName__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1552:1: ( ( RULE_PIPE ) )
            // InternalKPIGenerator.g:1553:1: ( RULE_PIPE )
            {
            // InternalKPIGenerator.g:1553:1: ( RULE_PIPE )
            // InternalKPIGenerator.g:1554:2: RULE_PIPE
            {
             before(grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_5()); 
            match(input,RULE_PIPE,FOLLOW_2); 
             after(grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__5__Impl"


    // $ANTLR start "rule__TaskName__Group_0__6"
    // InternalKPIGenerator.g:1563:1: rule__TaskName__Group_0__6 : rule__TaskName__Group_0__6__Impl ;
    public final void rule__TaskName__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1567:1: ( rule__TaskName__Group_0__6__Impl )
            // InternalKPIGenerator.g:1568:2: rule__TaskName__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskName__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__6"


    // $ANTLR start "rule__TaskName__Group_0__6__Impl"
    // InternalKPIGenerator.g:1574:1: rule__TaskName__Group_0__6__Impl : ( ( rule__TaskName__VersionAssignment_0_6 ) ) ;
    public final void rule__TaskName__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1578:1: ( ( ( rule__TaskName__VersionAssignment_0_6 ) ) )
            // InternalKPIGenerator.g:1579:1: ( ( rule__TaskName__VersionAssignment_0_6 ) )
            {
            // InternalKPIGenerator.g:1579:1: ( ( rule__TaskName__VersionAssignment_0_6 ) )
            // InternalKPIGenerator.g:1580:2: ( rule__TaskName__VersionAssignment_0_6 )
            {
             before(grammarAccess.getTaskNameAccess().getVersionAssignment_0_6()); 
            // InternalKPIGenerator.g:1581:2: ( rule__TaskName__VersionAssignment_0_6 )
            // InternalKPIGenerator.g:1581:3: rule__TaskName__VersionAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__TaskName__VersionAssignment_0_6();

            state._fsp--;


            }

             after(grammarAccess.getTaskNameAccess().getVersionAssignment_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0__6__Impl"


    // $ANTLR start "rule__TaskName__Group_0_2__0"
    // InternalKPIGenerator.g:1590:1: rule__TaskName__Group_0_2__0 : rule__TaskName__Group_0_2__0__Impl rule__TaskName__Group_0_2__1 ;
    public final void rule__TaskName__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1594:1: ( rule__TaskName__Group_0_2__0__Impl rule__TaskName__Group_0_2__1 )
            // InternalKPIGenerator.g:1595:2: rule__TaskName__Group_0_2__0__Impl rule__TaskName__Group_0_2__1
            {
            pushFollow(FOLLOW_5);
            rule__TaskName__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskName__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0_2__0"


    // $ANTLR start "rule__TaskName__Group_0_2__0__Impl"
    // InternalKPIGenerator.g:1602:1: rule__TaskName__Group_0_2__0__Impl : ( RULE_PIPE ) ;
    public final void rule__TaskName__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1606:1: ( ( RULE_PIPE ) )
            // InternalKPIGenerator.g:1607:1: ( RULE_PIPE )
            {
            // InternalKPIGenerator.g:1607:1: ( RULE_PIPE )
            // InternalKPIGenerator.g:1608:2: RULE_PIPE
            {
             before(grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_2_0()); 
            match(input,RULE_PIPE,FOLLOW_2); 
             after(grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0_2__0__Impl"


    // $ANTLR start "rule__TaskName__Group_0_2__1"
    // InternalKPIGenerator.g:1617:1: rule__TaskName__Group_0_2__1 : rule__TaskName__Group_0_2__1__Impl ;
    public final void rule__TaskName__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1621:1: ( rule__TaskName__Group_0_2__1__Impl )
            // InternalKPIGenerator.g:1622:2: rule__TaskName__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskName__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0_2__1"


    // $ANTLR start "rule__TaskName__Group_0_2__1__Impl"
    // InternalKPIGenerator.g:1628:1: rule__TaskName__Group_0_2__1__Impl : ( ( rule__TaskName__SubphaseAssignment_0_2_1 ) ) ;
    public final void rule__TaskName__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1632:1: ( ( ( rule__TaskName__SubphaseAssignment_0_2_1 ) ) )
            // InternalKPIGenerator.g:1633:1: ( ( rule__TaskName__SubphaseAssignment_0_2_1 ) )
            {
            // InternalKPIGenerator.g:1633:1: ( ( rule__TaskName__SubphaseAssignment_0_2_1 ) )
            // InternalKPIGenerator.g:1634:2: ( rule__TaskName__SubphaseAssignment_0_2_1 )
            {
             before(grammarAccess.getTaskNameAccess().getSubphaseAssignment_0_2_1()); 
            // InternalKPIGenerator.g:1635:2: ( rule__TaskName__SubphaseAssignment_0_2_1 )
            // InternalKPIGenerator.g:1635:3: rule__TaskName__SubphaseAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskName__SubphaseAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskNameAccess().getSubphaseAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__Group_0_2__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalKPIGenerator.g:1644:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1648:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalKPIGenerator.g:1649:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalKPIGenerator.g:1656:1: rule__EDouble__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1660:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1661:1: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1661:1: ( RULE_INT )
            // InternalKPIGenerator.g:1662:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalKPIGenerator.g:1671:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1675:1: ( rule__EDouble__Group__1__Impl )
            // InternalKPIGenerator.g:1676:2: rule__EDouble__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalKPIGenerator.g:1682:1: rule__EDouble__Group__1__Impl : ( ( rule__EDouble__Group_1__0 )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1686:1: ( ( ( rule__EDouble__Group_1__0 )? ) )
            // InternalKPIGenerator.g:1687:1: ( ( rule__EDouble__Group_1__0 )? )
            {
            // InternalKPIGenerator.g:1687:1: ( ( rule__EDouble__Group_1__0 )? )
            // InternalKPIGenerator.g:1688:2: ( rule__EDouble__Group_1__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_1()); 
            // InternalKPIGenerator.g:1689:2: ( rule__EDouble__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKPIGenerator.g:1689:3: rule__EDouble__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group_1__0"
    // InternalKPIGenerator.g:1698:1: rule__EDouble__Group_1__0 : rule__EDouble__Group_1__0__Impl rule__EDouble__Group_1__1 ;
    public final void rule__EDouble__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1702:1: ( rule__EDouble__Group_1__0__Impl rule__EDouble__Group_1__1 )
            // InternalKPIGenerator.g:1703:2: rule__EDouble__Group_1__0__Impl rule__EDouble__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__EDouble__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_1__0"


    // $ANTLR start "rule__EDouble__Group_1__0__Impl"
    // InternalKPIGenerator.g:1710:1: rule__EDouble__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EDouble__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1714:1: ( ( '.' ) )
            // InternalKPIGenerator.g:1715:1: ( '.' )
            {
            // InternalKPIGenerator.g:1715:1: ( '.' )
            // InternalKPIGenerator.g:1716:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_1__0__Impl"


    // $ANTLR start "rule__EDouble__Group_1__1"
    // InternalKPIGenerator.g:1725:1: rule__EDouble__Group_1__1 : rule__EDouble__Group_1__1__Impl ;
    public final void rule__EDouble__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1729:1: ( rule__EDouble__Group_1__1__Impl )
            // InternalKPIGenerator.g:1730:2: rule__EDouble__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_1__1"


    // $ANTLR start "rule__EDouble__Group_1__1__Impl"
    // InternalKPIGenerator.g:1736:1: rule__EDouble__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1740:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1741:1: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1741:1: ( RULE_INT )
            // InternalKPIGenerator.g:1742:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_1__1__Impl"


    // $ANTLR start "rule__Task__TaskIdAssignment_1"
    // InternalKPIGenerator.g:1752:1: rule__Task__TaskIdAssignment_1 : ( RULE_INT ) ;
    public final void rule__Task__TaskIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1756:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1757:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1757:2: ( RULE_INT )
            // InternalKPIGenerator.g:1758:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTaskIdINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskIdINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskIdAssignment_1"


    // $ANTLR start "rule__Task__TaskListAssignment_3"
    // InternalKPIGenerator.g:1767:1: rule__Task__TaskListAssignment_3 : ( RULE_CADENA ) ;
    public final void rule__Task__TaskListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1771:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1772:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1772:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1773:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getTaskListCADENATerminalRuleCall_3_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskListCADENATerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskListAssignment_3"


    // $ANTLR start "rule__Task__MilestoneAssignment_5"
    // InternalKPIGenerator.g:1782:1: rule__Task__MilestoneAssignment_5 : ( RULE_CADENA ) ;
    public final void rule__Task__MilestoneAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1786:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1787:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1787:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1788:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getMilestoneCADENATerminalRuleCall_5_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getMilestoneCADENATerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__MilestoneAssignment_5"


    // $ANTLR start "rule__Task__TaskAssignment_7"
    // InternalKPIGenerator.g:1797:1: rule__Task__TaskAssignment_7 : ( ruleTaskName ) ;
    public final void rule__Task__TaskAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1801:1: ( ( ruleTaskName ) )
            // InternalKPIGenerator.g:1802:2: ( ruleTaskName )
            {
            // InternalKPIGenerator.g:1802:2: ( ruleTaskName )
            // InternalKPIGenerator.g:1803:3: ruleTaskName
            {
             before(grammarAccess.getTaskAccess().getTaskTaskNameParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskName();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getTaskTaskNameParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskAssignment_7"


    // $ANTLR start "rule__Task__TaskDescriptionAssignment_9"
    // InternalKPIGenerator.g:1812:1: rule__Task__TaskDescriptionAssignment_9 : ( RULE_CADENA ) ;
    public final void rule__Task__TaskDescriptionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1816:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1817:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1817:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1818:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getTaskDescriptionCADENATerminalRuleCall_9_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskDescriptionCADENATerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskDescriptionAssignment_9"


    // $ANTLR start "rule__Task__StartDateAssignment_11"
    // InternalKPIGenerator.g:1827:1: rule__Task__StartDateAssignment_11 : ( RULE_CADENA ) ;
    public final void rule__Task__StartDateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1831:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1832:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1832:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1833:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getStartDateCADENATerminalRuleCall_11_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStartDateCADENATerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__StartDateAssignment_11"


    // $ANTLR start "rule__Task__DueDateAssignment_13"
    // InternalKPIGenerator.g:1842:1: rule__Task__DueDateAssignment_13 : ( RULE_CADENA ) ;
    public final void rule__Task__DueDateAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1846:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1847:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1847:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1848:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getDueDateCADENATerminalRuleCall_13_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDueDateCADENATerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DueDateAssignment_13"


    // $ANTLR start "rule__Task__PriorityAssignment_15"
    // InternalKPIGenerator.g:1857:1: rule__Task__PriorityAssignment_15 : ( RULE_CADENA ) ;
    public final void rule__Task__PriorityAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1861:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1862:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1862:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1863:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_15_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PriorityAssignment_15"


    // $ANTLR start "rule__Task__PrivateAssignment_17"
    // InternalKPIGenerator.g:1872:1: rule__Task__PrivateAssignment_17 : ( ruleBOOL ) ;
    public final void rule__Task__PrivateAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1876:1: ( ( ruleBOOL ) )
            // InternalKPIGenerator.g:1877:2: ( ruleBOOL )
            {
            // InternalKPIGenerator.g:1877:2: ( ruleBOOL )
            // InternalKPIGenerator.g:1878:3: ruleBOOL
            {
             before(grammarAccess.getTaskAccess().getPrivateBOOLParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getPrivateBOOLParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PrivateAssignment_17"


    // $ANTLR start "rule__Task__ProgressAssignment_19"
    // InternalKPIGenerator.g:1887:1: rule__Task__ProgressAssignment_19 : ( RULE_INT ) ;
    public final void rule__Task__ProgressAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1891:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1892:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1892:2: ( RULE_INT )
            // InternalKPIGenerator.g:1893:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_19_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ProgressAssignment_19"


    // $ANTLR start "rule__Task__TaskAssignment_21"
    // InternalKPIGenerator.g:1902:1: rule__Task__TaskAssignment_21 : ( ruleStatus ) ;
    public final void rule__Task__TaskAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1906:1: ( ( ruleStatus ) )
            // InternalKPIGenerator.g:1907:2: ( ruleStatus )
            {
            // InternalKPIGenerator.g:1907:2: ( ruleStatus )
            // InternalKPIGenerator.g:1908:3: ruleStatus
            {
             before(grammarAccess.getTaskAccess().getTaskStatusParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getTaskStatusParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskAssignment_21"


    // $ANTLR start "rule__Task__AssignedToAssignment_23"
    // InternalKPIGenerator.g:1917:1: rule__Task__AssignedToAssignment_23 : ( RULE_CADENA ) ;
    public final void rule__Task__AssignedToAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1921:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1922:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1922:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1923:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_23_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__AssignedToAssignment_23"


    // $ANTLR start "rule__Task__CreatedDateAssignment_25"
    // InternalKPIGenerator.g:1932:1: rule__Task__CreatedDateAssignment_25 : ( RULE_CADENA ) ;
    public final void rule__Task__CreatedDateAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1936:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1937:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1937:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1938:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCreatedDateCADENATerminalRuleCall_25_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateCADENATerminalRuleCall_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CreatedDateAssignment_25"


    // $ANTLR start "rule__Task__CompletedDateAssignment_27"
    // InternalKPIGenerator.g:1947:1: rule__Task__CompletedDateAssignment_27 : ( RULE_CADENA ) ;
    public final void rule__Task__CompletedDateAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1951:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1952:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1952:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1953:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCompletedDateCADENATerminalRuleCall_27_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedDateCADENATerminalRuleCall_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedDateAssignment_27"


    // $ANTLR start "rule__Task__TimeLoggedAssignment_29"
    // InternalKPIGenerator.g:1962:1: rule__Task__TimeLoggedAssignment_29 : ( RULE_INT ) ;
    public final void rule__Task__TimeLoggedAssignment_29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1966:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1967:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1967:2: ( RULE_INT )
            // InternalKPIGenerator.g:1968:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedINTTerminalRuleCall_29_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedINTTerminalRuleCall_29_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeLoggedAssignment_29"


    // $ANTLR start "rule__Task__BillableMinutesAssignment_31"
    // InternalKPIGenerator.g:1977:1: rule__Task__BillableMinutesAssignment_31 : ( RULE_INT ) ;
    public final void rule__Task__BillableMinutesAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1981:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1982:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1982:2: ( RULE_INT )
            // InternalKPIGenerator.g:1983:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getBillableMinutesINTTerminalRuleCall_31_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableMinutesINTTerminalRuleCall_31_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__BillableMinutesAssignment_31"


    // $ANTLR start "rule__Task__TaskParentAssignment_33"
    // InternalKPIGenerator.g:1992:1: rule__Task__TaskParentAssignment_33 : ( RULE_INT ) ;
    public final void rule__Task__TaskParentAssignment_33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1996:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1997:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1997:2: ( RULE_INT )
            // InternalKPIGenerator.g:1998:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTaskParentINTTerminalRuleCall_33_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskParentINTTerminalRuleCall_33_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TaskParentAssignment_33"


    // $ANTLR start "rule__Task__CompletedOnTimeAssignment_35"
    // InternalKPIGenerator.g:2007:1: rule__Task__CompletedOnTimeAssignment_35 : ( ruleBOOL ) ;
    public final void rule__Task__CompletedOnTimeAssignment_35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2011:1: ( ( ruleBOOL ) )
            // InternalKPIGenerator.g:2012:2: ( ruleBOOL )
            {
            // InternalKPIGenerator.g:2012:2: ( ruleBOOL )
            // InternalKPIGenerator.g:2013:3: ruleBOOL
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeBOOLParserRuleCall_35_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getCompletedOnTimeBOOLParserRuleCall_35_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedOnTimeAssignment_35"


    // $ANTLR start "rule__Task__TimeEstimatedAssignment_37"
    // InternalKPIGenerator.g:2022:1: rule__Task__TimeEstimatedAssignment_37 : ( RULE_INT ) ;
    public final void rule__Task__TimeEstimatedAssignment_37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2026:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2027:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2027:2: ( RULE_INT )
            // InternalKPIGenerator.g:2028:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_37_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_37_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeEstimatedAssignment_37"


    // $ANTLR start "rule__Task__TagsAssignment_39"
    // InternalKPIGenerator.g:2037:1: rule__Task__TagsAssignment_39 : ( RULE_CADENA ) ;
    public final void rule__Task__TagsAssignment_39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2041:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2042:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2042:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2043:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_39_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_39_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TagsAssignment_39"


    // $ANTLR start "rule__Status__StatusNameAssignment_0"
    // InternalKPIGenerator.g:2052:1: rule__Status__StatusNameAssignment_0 : ( ( rule__Status__StatusNameAlternatives_0_0 ) ) ;
    public final void rule__Status__StatusNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2056:1: ( ( ( rule__Status__StatusNameAlternatives_0_0 ) ) )
            // InternalKPIGenerator.g:2057:2: ( ( rule__Status__StatusNameAlternatives_0_0 ) )
            {
            // InternalKPIGenerator.g:2057:2: ( ( rule__Status__StatusNameAlternatives_0_0 ) )
            // InternalKPIGenerator.g:2058:3: ( rule__Status__StatusNameAlternatives_0_0 )
            {
             before(grammarAccess.getStatusAccess().getStatusNameAlternatives_0_0()); 
            // InternalKPIGenerator.g:2059:3: ( rule__Status__StatusNameAlternatives_0_0 )
            // InternalKPIGenerator.g:2059:4: rule__Status__StatusNameAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Status__StatusNameAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getStatusNameAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__StatusNameAssignment_0"


    // $ANTLR start "rule__Status__TextAssignment_1"
    // InternalKPIGenerator.g:2067:1: rule__Status__TextAssignment_1 : ( RULE_CADENA ) ;
    public final void rule__Status__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2071:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2072:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2072:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2073:3: RULE_CADENA
            {
             before(grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_1_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__TextAssignment_1"


    // $ANTLR start "rule__TaskName__PhaseAssignment_0_1"
    // InternalKPIGenerator.g:2082:1: rule__TaskName__PhaseAssignment_0_1 : ( RULE_CADENA ) ;
    public final void rule__TaskName__PhaseAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2086:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2087:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2087:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2088:3: RULE_CADENA
            {
             before(grammarAccess.getTaskNameAccess().getPhaseCADENATerminalRuleCall_0_1_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskNameAccess().getPhaseCADENATerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__PhaseAssignment_0_1"


    // $ANTLR start "rule__TaskName__SubphaseAssignment_0_2_1"
    // InternalKPIGenerator.g:2097:1: rule__TaskName__SubphaseAssignment_0_2_1 : ( RULE_CADENA ) ;
    public final void rule__TaskName__SubphaseAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2101:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2102:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2102:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2103:3: RULE_CADENA
            {
             before(grammarAccess.getTaskNameAccess().getSubphaseCADENATerminalRuleCall_0_2_1_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskNameAccess().getSubphaseCADENATerminalRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__SubphaseAssignment_0_2_1"


    // $ANTLR start "rule__TaskName__UseCaseAssignment_0_4"
    // InternalKPIGenerator.g:2112:1: rule__TaskName__UseCaseAssignment_0_4 : ( RULE_CADENA ) ;
    public final void rule__TaskName__UseCaseAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2116:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2117:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2117:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2118:3: RULE_CADENA
            {
             before(grammarAccess.getTaskNameAccess().getUseCaseCADENATerminalRuleCall_0_4_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskNameAccess().getUseCaseCADENATerminalRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__UseCaseAssignment_0_4"


    // $ANTLR start "rule__TaskName__VersionAssignment_0_6"
    // InternalKPIGenerator.g:2127:1: rule__TaskName__VersionAssignment_0_6 : ( RULE_INT ) ;
    public final void rule__TaskName__VersionAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2131:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2132:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2132:2: ( RULE_INT )
            // InternalKPIGenerator.g:2133:3: RULE_INT
            {
             before(grammarAccess.getTaskNameAccess().getVersionINTTerminalRuleCall_0_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskNameAccess().getVersionINTTerminalRuleCall_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskName__VersionAssignment_0_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});

}