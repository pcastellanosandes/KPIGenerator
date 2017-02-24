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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEADER", "RULE_INT", "RULE_SEMICOLON", "RULE_CADENA", "RULE_DATE", "RULE_HOUR", "RULE_ID", "RULE_ENDLINE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'completed'", "'new'", "'FALSO'", "'VERDADERO'", "'\\r\\n'"
    };
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


    // $ANTLR start "entryRuleTask"
    // InternalKPIGenerator.g:78:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:79:1: ( ruleTask EOF )
            // InternalKPIGenerator.g:80:1: ruleTask EOF
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
    // InternalKPIGenerator.g:87:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:91:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalKPIGenerator.g:92:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalKPIGenerator.g:92:2: ( ( rule__Task__Group__0 ) )
            // InternalKPIGenerator.g:93:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalKPIGenerator.g:94:3: ( rule__Task__Group__0 )
            // InternalKPIGenerator.g:94:4: rule__Task__Group__0
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


    // $ANTLR start "entryRuleProject"
    // InternalKPIGenerator.g:103:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:104:1: ( ruleProject EOF )
            // InternalKPIGenerator.g:105:1: ruleProject EOF
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
    // InternalKPIGenerator.g:112:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:116:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalKPIGenerator.g:117:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalKPIGenerator.g:117:2: ( ( rule__Project__Group__0 ) )
            // InternalKPIGenerator.g:118:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalKPIGenerator.g:119:3: ( rule__Project__Group__0 )
            // InternalKPIGenerator.g:119:4: rule__Project__Group__0
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


    // $ANTLR start "entryRuleStatus"
    // InternalKPIGenerator.g:128:1: entryRuleStatus : ruleStatus EOF ;
    public final void entryRuleStatus() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:129:1: ( ruleStatus EOF )
            // InternalKPIGenerator.g:130:1: ruleStatus EOF
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
    // InternalKPIGenerator.g:137:1: ruleStatus : ( ( rule__Status__Group__0 ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:141:2: ( ( ( rule__Status__Group__0 ) ) )
            // InternalKPIGenerator.g:142:2: ( ( rule__Status__Group__0 ) )
            {
            // InternalKPIGenerator.g:142:2: ( ( rule__Status__Group__0 ) )
            // InternalKPIGenerator.g:143:3: ( rule__Status__Group__0 )
            {
             before(grammarAccess.getStatusAccess().getGroup()); 
            // InternalKPIGenerator.g:144:3: ( rule__Status__Group__0 )
            // InternalKPIGenerator.g:144:4: rule__Status__Group__0
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
    // InternalKPIGenerator.g:153:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // InternalKPIGenerator.g:154:1: ( ruleBOOL EOF )
            // InternalKPIGenerator.g:155:1: ruleBOOL EOF
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
    // InternalKPIGenerator.g:162:1: ruleBOOL : ( ( rule__BOOL__Group__0 ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:166:2: ( ( ( rule__BOOL__Group__0 ) ) )
            // InternalKPIGenerator.g:167:2: ( ( rule__BOOL__Group__0 ) )
            {
            // InternalKPIGenerator.g:167:2: ( ( rule__BOOL__Group__0 ) )
            // InternalKPIGenerator.g:168:3: ( rule__BOOL__Group__0 )
            {
             before(grammarAccess.getBOOLAccess().getGroup()); 
            // InternalKPIGenerator.g:169:3: ( rule__BOOL__Group__0 )
            // InternalKPIGenerator.g:169:4: rule__BOOL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BOOL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBOOLAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__Status__StatusNameAlternatives_0_0"
    // InternalKPIGenerator.g:177:1: rule__Status__StatusNameAlternatives_0_0 : ( ( 'completed' ) | ( 'new' ) );
    public final void rule__Status__StatusNameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:181:1: ( ( 'completed' ) | ( 'new' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
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
                    match(input,17,FOLLOW_2); 
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
                    match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__BOOL__Alternatives_1"
    // InternalKPIGenerator.g:198:1: rule__BOOL__Alternatives_1 : ( ( 'FALSO' ) | ( 'VERDADERO' ) );
    public final void rule__BOOL__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:202:1: ( ( 'FALSO' ) | ( 'VERDADERO' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
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
                     before(grammarAccess.getBOOLAccess().getFALSOKeyword_1_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBOOLAccess().getFALSOKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:209:2: ( 'VERDADERO' )
                    {
                    // InternalKPIGenerator.g:209:2: ( 'VERDADERO' )
                    // InternalKPIGenerator.g:210:3: 'VERDADERO'
                    {
                     before(grammarAccess.getBOOLAccess().getVERDADEROKeyword_1_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBOOLAccess().getVERDADEROKeyword_1_1()); 

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
    // $ANTLR end "rule__BOOL__Alternatives_1"


    // $ANTLR start "rule__Root__Group__0"
    // InternalKPIGenerator.g:219:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:223:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalKPIGenerator.g:224:2: rule__Root__Group__0__Impl rule__Root__Group__1
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
    // InternalKPIGenerator.g:231:1: rule__Root__Group__0__Impl : ( RULE_HEADER ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:235:1: ( ( RULE_HEADER ) )
            // InternalKPIGenerator.g:236:1: ( RULE_HEADER )
            {
            // InternalKPIGenerator.g:236:1: ( RULE_HEADER )
            // InternalKPIGenerator.g:237:2: RULE_HEADER
            {
             before(grammarAccess.getRootAccess().getHEADERTerminalRuleCall_0()); 
            match(input,RULE_HEADER,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getHEADERTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:246:1: rule__Root__Group__1 : rule__Root__Group__1__Impl ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:250:1: ( rule__Root__Group__1__Impl )
            // InternalKPIGenerator.g:251:2: rule__Root__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKPIGenerator.g:257:1: rule__Root__Group__1__Impl : ( ( rule__Root__TasksAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:261:1: ( ( ( rule__Root__TasksAssignment_1 ) ) )
            // InternalKPIGenerator.g:262:1: ( ( rule__Root__TasksAssignment_1 ) )
            {
            // InternalKPIGenerator.g:262:1: ( ( rule__Root__TasksAssignment_1 ) )
            // InternalKPIGenerator.g:263:2: ( rule__Root__TasksAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getTasksAssignment_1()); 
            // InternalKPIGenerator.g:264:2: ( rule__Root__TasksAssignment_1 )
            // InternalKPIGenerator.g:264:3: rule__Root__TasksAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Root__TasksAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getTasksAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Task__Group__0"
    // InternalKPIGenerator.g:273:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:277:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalKPIGenerator.g:278:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalKPIGenerator.g:285:1: rule__Task__Group__0__Impl : ( () ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:289:1: ( ( () ) )
            // InternalKPIGenerator.g:290:1: ( () )
            {
            // InternalKPIGenerator.g:290:1: ( () )
            // InternalKPIGenerator.g:291:2: ()
            {
             before(grammarAccess.getTaskAccess().getTaskAction_0()); 
            // InternalKPIGenerator.g:292:2: ()
            // InternalKPIGenerator.g:292:3: 
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
    // InternalKPIGenerator.g:300:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:304:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalKPIGenerator.g:305:2: rule__Task__Group__1__Impl rule__Task__Group__2
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
    // InternalKPIGenerator.g:312:1: rule__Task__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:316:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:317:1: ( RULE_INT )
            {
            // InternalKPIGenerator.g:317:1: ( RULE_INT )
            // InternalKPIGenerator.g:318:2: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:327:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:331:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalKPIGenerator.g:332:2: rule__Task__Group__2__Impl rule__Task__Group__3
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
    // InternalKPIGenerator.g:339:1: rule__Task__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:343:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:344:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:344:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:345:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:354:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:358:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalKPIGenerator.g:359:2: rule__Task__Group__3__Impl rule__Task__Group__4
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
    // InternalKPIGenerator.g:366:1: rule__Task__Group__3__Impl : ( ( rule__Task__ProjectAssignment_3 ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:370:1: ( ( ( rule__Task__ProjectAssignment_3 ) ) )
            // InternalKPIGenerator.g:371:1: ( ( rule__Task__ProjectAssignment_3 ) )
            {
            // InternalKPIGenerator.g:371:1: ( ( rule__Task__ProjectAssignment_3 ) )
            // InternalKPIGenerator.g:372:2: ( rule__Task__ProjectAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getProjectAssignment_3()); 
            // InternalKPIGenerator.g:373:2: ( rule__Task__ProjectAssignment_3 )
            // InternalKPIGenerator.g:373:3: rule__Task__ProjectAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Task__ProjectAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getProjectAssignment_3()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:381:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:385:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalKPIGenerator.g:386:2: rule__Task__Group__4__Impl rule__Task__Group__5
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
    // InternalKPIGenerator.g:393:1: rule__Task__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:397:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:398:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:398:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:399:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:408:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:412:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalKPIGenerator.g:413:2: rule__Task__Group__5__Impl rule__Task__Group__6
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
    // InternalKPIGenerator.g:420:1: rule__Task__Group__5__Impl : ( ( rule__Task__MilestoneAssignment_5 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:424:1: ( ( ( rule__Task__MilestoneAssignment_5 )? ) )
            // InternalKPIGenerator.g:425:1: ( ( rule__Task__MilestoneAssignment_5 )? )
            {
            // InternalKPIGenerator.g:425:1: ( ( rule__Task__MilestoneAssignment_5 )? )
            // InternalKPIGenerator.g:426:2: ( rule__Task__MilestoneAssignment_5 )?
            {
             before(grammarAccess.getTaskAccess().getMilestoneAssignment_5()); 
            // InternalKPIGenerator.g:427:2: ( rule__Task__MilestoneAssignment_5 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_CADENA) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:427:3: rule__Task__MilestoneAssignment_5
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
    // InternalKPIGenerator.g:435:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:439:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalKPIGenerator.g:440:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:447:1: rule__Task__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:451:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:452:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:452:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:453:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:462:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:466:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalKPIGenerator.g:467:2: rule__Task__Group__7__Impl rule__Task__Group__8
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
    // InternalKPIGenerator.g:474:1: rule__Task__Group__7__Impl : ( ( rule__Task__NameAssignment_7 ) ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:478:1: ( ( ( rule__Task__NameAssignment_7 ) ) )
            // InternalKPIGenerator.g:479:1: ( ( rule__Task__NameAssignment_7 ) )
            {
            // InternalKPIGenerator.g:479:1: ( ( rule__Task__NameAssignment_7 ) )
            // InternalKPIGenerator.g:480:2: ( rule__Task__NameAssignment_7 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_7()); 
            // InternalKPIGenerator.g:481:2: ( rule__Task__NameAssignment_7 )
            // InternalKPIGenerator.g:481:3: rule__Task__NameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_7()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:489:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:493:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalKPIGenerator.g:494:2: rule__Task__Group__8__Impl rule__Task__Group__9
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
    // InternalKPIGenerator.g:501:1: rule__Task__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:505:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:506:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:506:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:507:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:516:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:520:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalKPIGenerator.g:521:2: rule__Task__Group__9__Impl rule__Task__Group__10
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
    // InternalKPIGenerator.g:528:1: rule__Task__Group__9__Impl : ( ( rule__Task__TaskDescriptionAssignment_9 )? ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:532:1: ( ( ( rule__Task__TaskDescriptionAssignment_9 )? ) )
            // InternalKPIGenerator.g:533:1: ( ( rule__Task__TaskDescriptionAssignment_9 )? )
            {
            // InternalKPIGenerator.g:533:1: ( ( rule__Task__TaskDescriptionAssignment_9 )? )
            // InternalKPIGenerator.g:534:2: ( rule__Task__TaskDescriptionAssignment_9 )?
            {
             before(grammarAccess.getTaskAccess().getTaskDescriptionAssignment_9()); 
            // InternalKPIGenerator.g:535:2: ( rule__Task__TaskDescriptionAssignment_9 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CADENA) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:535:3: rule__Task__TaskDescriptionAssignment_9
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
    // InternalKPIGenerator.g:543:1: rule__Task__Group__10 : rule__Task__Group__10__Impl rule__Task__Group__11 ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:547:1: ( rule__Task__Group__10__Impl rule__Task__Group__11 )
            // InternalKPIGenerator.g:548:2: rule__Task__Group__10__Impl rule__Task__Group__11
            {
            pushFollow(FOLLOW_7);
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
    // InternalKPIGenerator.g:555:1: rule__Task__Group__10__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:559:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:560:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:560:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:561:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:570:1: rule__Task__Group__11 : rule__Task__Group__11__Impl rule__Task__Group__12 ;
    public final void rule__Task__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:574:1: ( rule__Task__Group__11__Impl rule__Task__Group__12 )
            // InternalKPIGenerator.g:575:2: rule__Task__Group__11__Impl rule__Task__Group__12
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
    // InternalKPIGenerator.g:582:1: rule__Task__Group__11__Impl : ( ( rule__Task__StartDateAssignment_11 ) ) ;
    public final void rule__Task__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:586:1: ( ( ( rule__Task__StartDateAssignment_11 ) ) )
            // InternalKPIGenerator.g:587:1: ( ( rule__Task__StartDateAssignment_11 ) )
            {
            // InternalKPIGenerator.g:587:1: ( ( rule__Task__StartDateAssignment_11 ) )
            // InternalKPIGenerator.g:588:2: ( rule__Task__StartDateAssignment_11 )
            {
             before(grammarAccess.getTaskAccess().getStartDateAssignment_11()); 
            // InternalKPIGenerator.g:589:2: ( rule__Task__StartDateAssignment_11 )
            // InternalKPIGenerator.g:589:3: rule__Task__StartDateAssignment_11
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
    // InternalKPIGenerator.g:597:1: rule__Task__Group__12 : rule__Task__Group__12__Impl rule__Task__Group__13 ;
    public final void rule__Task__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:601:1: ( rule__Task__Group__12__Impl rule__Task__Group__13 )
            // InternalKPIGenerator.g:602:2: rule__Task__Group__12__Impl rule__Task__Group__13
            {
            pushFollow(FOLLOW_7);
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
    // InternalKPIGenerator.g:609:1: rule__Task__Group__12__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:613:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:614:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:614:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:615:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:624:1: rule__Task__Group__13 : rule__Task__Group__13__Impl rule__Task__Group__14 ;
    public final void rule__Task__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:628:1: ( rule__Task__Group__13__Impl rule__Task__Group__14 )
            // InternalKPIGenerator.g:629:2: rule__Task__Group__13__Impl rule__Task__Group__14
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
    // InternalKPIGenerator.g:636:1: rule__Task__Group__13__Impl : ( ( rule__Task__DueDateAssignment_13 ) ) ;
    public final void rule__Task__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:640:1: ( ( ( rule__Task__DueDateAssignment_13 ) ) )
            // InternalKPIGenerator.g:641:1: ( ( rule__Task__DueDateAssignment_13 ) )
            {
            // InternalKPIGenerator.g:641:1: ( ( rule__Task__DueDateAssignment_13 ) )
            // InternalKPIGenerator.g:642:2: ( rule__Task__DueDateAssignment_13 )
            {
             before(grammarAccess.getTaskAccess().getDueDateAssignment_13()); 
            // InternalKPIGenerator.g:643:2: ( rule__Task__DueDateAssignment_13 )
            // InternalKPIGenerator.g:643:3: rule__Task__DueDateAssignment_13
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
    // InternalKPIGenerator.g:651:1: rule__Task__Group__14 : rule__Task__Group__14__Impl rule__Task__Group__15 ;
    public final void rule__Task__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:655:1: ( rule__Task__Group__14__Impl rule__Task__Group__15 )
            // InternalKPIGenerator.g:656:2: rule__Task__Group__14__Impl rule__Task__Group__15
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
    // InternalKPIGenerator.g:663:1: rule__Task__Group__14__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:667:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:668:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:668:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:669:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:678:1: rule__Task__Group__15 : rule__Task__Group__15__Impl rule__Task__Group__16 ;
    public final void rule__Task__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:682:1: ( rule__Task__Group__15__Impl rule__Task__Group__16 )
            // InternalKPIGenerator.g:683:2: rule__Task__Group__15__Impl rule__Task__Group__16
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
    // InternalKPIGenerator.g:690:1: rule__Task__Group__15__Impl : ( ( rule__Task__PriorityAssignment_15 )? ) ;
    public final void rule__Task__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:694:1: ( ( ( rule__Task__PriorityAssignment_15 )? ) )
            // InternalKPIGenerator.g:695:1: ( ( rule__Task__PriorityAssignment_15 )? )
            {
            // InternalKPIGenerator.g:695:1: ( ( rule__Task__PriorityAssignment_15 )? )
            // InternalKPIGenerator.g:696:2: ( rule__Task__PriorityAssignment_15 )?
            {
             before(grammarAccess.getTaskAccess().getPriorityAssignment_15()); 
            // InternalKPIGenerator.g:697:2: ( rule__Task__PriorityAssignment_15 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_CADENA) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:697:3: rule__Task__PriorityAssignment_15
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
    // InternalKPIGenerator.g:705:1: rule__Task__Group__16 : rule__Task__Group__16__Impl rule__Task__Group__17 ;
    public final void rule__Task__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:709:1: ( rule__Task__Group__16__Impl rule__Task__Group__17 )
            // InternalKPIGenerator.g:710:2: rule__Task__Group__16__Impl rule__Task__Group__17
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
    // InternalKPIGenerator.g:717:1: rule__Task__Group__16__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:721:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:722:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:722:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:723:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:732:1: rule__Task__Group__17 : rule__Task__Group__17__Impl rule__Task__Group__18 ;
    public final void rule__Task__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:736:1: ( rule__Task__Group__17__Impl rule__Task__Group__18 )
            // InternalKPIGenerator.g:737:2: rule__Task__Group__17__Impl rule__Task__Group__18
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
    // InternalKPIGenerator.g:744:1: rule__Task__Group__17__Impl : ( ( rule__Task__PrivateAssignment_17 ) ) ;
    public final void rule__Task__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:748:1: ( ( ( rule__Task__PrivateAssignment_17 ) ) )
            // InternalKPIGenerator.g:749:1: ( ( rule__Task__PrivateAssignment_17 ) )
            {
            // InternalKPIGenerator.g:749:1: ( ( rule__Task__PrivateAssignment_17 ) )
            // InternalKPIGenerator.g:750:2: ( rule__Task__PrivateAssignment_17 )
            {
             before(grammarAccess.getTaskAccess().getPrivateAssignment_17()); 
            // InternalKPIGenerator.g:751:2: ( rule__Task__PrivateAssignment_17 )
            // InternalKPIGenerator.g:751:3: rule__Task__PrivateAssignment_17
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
    // InternalKPIGenerator.g:759:1: rule__Task__Group__18 : rule__Task__Group__18__Impl rule__Task__Group__19 ;
    public final void rule__Task__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:763:1: ( rule__Task__Group__18__Impl rule__Task__Group__19 )
            // InternalKPIGenerator.g:764:2: rule__Task__Group__18__Impl rule__Task__Group__19
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
    // InternalKPIGenerator.g:771:1: rule__Task__Group__18__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:775:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:776:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:776:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:777:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:786:1: rule__Task__Group__19 : rule__Task__Group__19__Impl rule__Task__Group__20 ;
    public final void rule__Task__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:790:1: ( rule__Task__Group__19__Impl rule__Task__Group__20 )
            // InternalKPIGenerator.g:791:2: rule__Task__Group__19__Impl rule__Task__Group__20
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
    // InternalKPIGenerator.g:798:1: rule__Task__Group__19__Impl : ( ( rule__Task__ProgressAssignment_19 ) ) ;
    public final void rule__Task__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:802:1: ( ( ( rule__Task__ProgressAssignment_19 ) ) )
            // InternalKPIGenerator.g:803:1: ( ( rule__Task__ProgressAssignment_19 ) )
            {
            // InternalKPIGenerator.g:803:1: ( ( rule__Task__ProgressAssignment_19 ) )
            // InternalKPIGenerator.g:804:2: ( rule__Task__ProgressAssignment_19 )
            {
             before(grammarAccess.getTaskAccess().getProgressAssignment_19()); 
            // InternalKPIGenerator.g:805:2: ( rule__Task__ProgressAssignment_19 )
            // InternalKPIGenerator.g:805:3: rule__Task__ProgressAssignment_19
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
    // InternalKPIGenerator.g:813:1: rule__Task__Group__20 : rule__Task__Group__20__Impl rule__Task__Group__21 ;
    public final void rule__Task__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:817:1: ( rule__Task__Group__20__Impl rule__Task__Group__21 )
            // InternalKPIGenerator.g:818:2: rule__Task__Group__20__Impl rule__Task__Group__21
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
    // InternalKPIGenerator.g:825:1: rule__Task__Group__20__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:829:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:830:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:830:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:831:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:840:1: rule__Task__Group__21 : rule__Task__Group__21__Impl rule__Task__Group__22 ;
    public final void rule__Task__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:844:1: ( rule__Task__Group__21__Impl rule__Task__Group__22 )
            // InternalKPIGenerator.g:845:2: rule__Task__Group__21__Impl rule__Task__Group__22
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
    // InternalKPIGenerator.g:852:1: rule__Task__Group__21__Impl : ( ( rule__Task__StatusAssignment_21 ) ) ;
    public final void rule__Task__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:856:1: ( ( ( rule__Task__StatusAssignment_21 ) ) )
            // InternalKPIGenerator.g:857:1: ( ( rule__Task__StatusAssignment_21 ) )
            {
            // InternalKPIGenerator.g:857:1: ( ( rule__Task__StatusAssignment_21 ) )
            // InternalKPIGenerator.g:858:2: ( rule__Task__StatusAssignment_21 )
            {
             before(grammarAccess.getTaskAccess().getStatusAssignment_21()); 
            // InternalKPIGenerator.g:859:2: ( rule__Task__StatusAssignment_21 )
            // InternalKPIGenerator.g:859:3: rule__Task__StatusAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Task__StatusAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStatusAssignment_21()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:867:1: rule__Task__Group__22 : rule__Task__Group__22__Impl rule__Task__Group__23 ;
    public final void rule__Task__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:871:1: ( rule__Task__Group__22__Impl rule__Task__Group__23 )
            // InternalKPIGenerator.g:872:2: rule__Task__Group__22__Impl rule__Task__Group__23
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
    // InternalKPIGenerator.g:879:1: rule__Task__Group__22__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:883:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:884:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:884:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:885:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:894:1: rule__Task__Group__23 : rule__Task__Group__23__Impl rule__Task__Group__24 ;
    public final void rule__Task__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:898:1: ( rule__Task__Group__23__Impl rule__Task__Group__24 )
            // InternalKPIGenerator.g:899:2: rule__Task__Group__23__Impl rule__Task__Group__24
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
    // InternalKPIGenerator.g:906:1: rule__Task__Group__23__Impl : ( ( rule__Task__AssignedToAssignment_23 ) ) ;
    public final void rule__Task__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:910:1: ( ( ( rule__Task__AssignedToAssignment_23 ) ) )
            // InternalKPIGenerator.g:911:1: ( ( rule__Task__AssignedToAssignment_23 ) )
            {
            // InternalKPIGenerator.g:911:1: ( ( rule__Task__AssignedToAssignment_23 ) )
            // InternalKPIGenerator.g:912:2: ( rule__Task__AssignedToAssignment_23 )
            {
             before(grammarAccess.getTaskAccess().getAssignedToAssignment_23()); 
            // InternalKPIGenerator.g:913:2: ( rule__Task__AssignedToAssignment_23 )
            // InternalKPIGenerator.g:913:3: rule__Task__AssignedToAssignment_23
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
    // InternalKPIGenerator.g:921:1: rule__Task__Group__24 : rule__Task__Group__24__Impl rule__Task__Group__25 ;
    public final void rule__Task__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:925:1: ( rule__Task__Group__24__Impl rule__Task__Group__25 )
            // InternalKPIGenerator.g:926:2: rule__Task__Group__24__Impl rule__Task__Group__25
            {
            pushFollow(FOLLOW_7);
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
    // InternalKPIGenerator.g:933:1: rule__Task__Group__24__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:937:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:938:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:938:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:939:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:948:1: rule__Task__Group__25 : rule__Task__Group__25__Impl rule__Task__Group__26 ;
    public final void rule__Task__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:952:1: ( rule__Task__Group__25__Impl rule__Task__Group__26 )
            // InternalKPIGenerator.g:953:2: rule__Task__Group__25__Impl rule__Task__Group__26
            {
            pushFollow(FOLLOW_10);
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
    // InternalKPIGenerator.g:960:1: rule__Task__Group__25__Impl : ( ( rule__Task__CreatedDateAssignment_25 ) ) ;
    public final void rule__Task__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:964:1: ( ( ( rule__Task__CreatedDateAssignment_25 ) ) )
            // InternalKPIGenerator.g:965:1: ( ( rule__Task__CreatedDateAssignment_25 ) )
            {
            // InternalKPIGenerator.g:965:1: ( ( rule__Task__CreatedDateAssignment_25 ) )
            // InternalKPIGenerator.g:966:2: ( rule__Task__CreatedDateAssignment_25 )
            {
             before(grammarAccess.getTaskAccess().getCreatedDateAssignment_25()); 
            // InternalKPIGenerator.g:967:2: ( rule__Task__CreatedDateAssignment_25 )
            // InternalKPIGenerator.g:967:3: rule__Task__CreatedDateAssignment_25
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
    // InternalKPIGenerator.g:975:1: rule__Task__Group__26 : rule__Task__Group__26__Impl rule__Task__Group__27 ;
    public final void rule__Task__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:979:1: ( rule__Task__Group__26__Impl rule__Task__Group__27 )
            // InternalKPIGenerator.g:980:2: rule__Task__Group__26__Impl rule__Task__Group__27
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:987:1: rule__Task__Group__26__Impl : ( ( rule__Task__CreatedHourAssignment_26 ) ) ;
    public final void rule__Task__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:991:1: ( ( ( rule__Task__CreatedHourAssignment_26 ) ) )
            // InternalKPIGenerator.g:992:1: ( ( rule__Task__CreatedHourAssignment_26 ) )
            {
            // InternalKPIGenerator.g:992:1: ( ( rule__Task__CreatedHourAssignment_26 ) )
            // InternalKPIGenerator.g:993:2: ( rule__Task__CreatedHourAssignment_26 )
            {
             before(grammarAccess.getTaskAccess().getCreatedHourAssignment_26()); 
            // InternalKPIGenerator.g:994:2: ( rule__Task__CreatedHourAssignment_26 )
            // InternalKPIGenerator.g:994:3: rule__Task__CreatedHourAssignment_26
            {
            pushFollow(FOLLOW_2);
            rule__Task__CreatedHourAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCreatedHourAssignment_26()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1002:1: rule__Task__Group__27 : rule__Task__Group__27__Impl rule__Task__Group__28 ;
    public final void rule__Task__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1006:1: ( rule__Task__Group__27__Impl rule__Task__Group__28 )
            // InternalKPIGenerator.g:1007:2: rule__Task__Group__27__Impl rule__Task__Group__28
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:1014:1: rule__Task__Group__27__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1018:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1019:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1019:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1020:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_27()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_27()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1029:1: rule__Task__Group__28 : rule__Task__Group__28__Impl rule__Task__Group__29 ;
    public final void rule__Task__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1033:1: ( rule__Task__Group__28__Impl rule__Task__Group__29 )
            // InternalKPIGenerator.g:1034:2: rule__Task__Group__28__Impl rule__Task__Group__29
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:1041:1: rule__Task__Group__28__Impl : ( RULE_CADENA ) ;
    public final void rule__Task__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1045:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1046:1: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1046:1: ( RULE_CADENA )
            // InternalKPIGenerator.g:1047:2: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_28()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_28()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1056:1: rule__Task__Group__29 : rule__Task__Group__29__Impl rule__Task__Group__30 ;
    public final void rule__Task__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1060:1: ( rule__Task__Group__29__Impl rule__Task__Group__30 )
            // InternalKPIGenerator.g:1061:2: rule__Task__Group__29__Impl rule__Task__Group__30
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:1068:1: rule__Task__Group__29__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1072:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1073:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1073:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1074:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_29()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_29()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1083:1: rule__Task__Group__30 : rule__Task__Group__30__Impl rule__Task__Group__31 ;
    public final void rule__Task__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1087:1: ( rule__Task__Group__30__Impl rule__Task__Group__31 )
            // InternalKPIGenerator.g:1088:2: rule__Task__Group__30__Impl rule__Task__Group__31
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:1095:1: rule__Task__Group__30__Impl : ( RULE_CADENA ) ;
    public final void rule__Task__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1099:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1100:1: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1100:1: ( RULE_CADENA )
            // InternalKPIGenerator.g:1101:2: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_30()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_30()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1110:1: rule__Task__Group__31 : rule__Task__Group__31__Impl rule__Task__Group__32 ;
    public final void rule__Task__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1114:1: ( rule__Task__Group__31__Impl rule__Task__Group__32 )
            // InternalKPIGenerator.g:1115:2: rule__Task__Group__31__Impl rule__Task__Group__32
            {
            pushFollow(FOLLOW_7);
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
    // InternalKPIGenerator.g:1122:1: rule__Task__Group__31__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1126:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1127:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1127:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1128:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_31()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_31()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1137:1: rule__Task__Group__32 : rule__Task__Group__32__Impl rule__Task__Group__33 ;
    public final void rule__Task__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1141:1: ( rule__Task__Group__32__Impl rule__Task__Group__33 )
            // InternalKPIGenerator.g:1142:2: rule__Task__Group__32__Impl rule__Task__Group__33
            {
            pushFollow(FOLLOW_10);
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
    // InternalKPIGenerator.g:1149:1: rule__Task__Group__32__Impl : ( ( rule__Task__CompletedDateAssignment_32 ) ) ;
    public final void rule__Task__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1153:1: ( ( ( rule__Task__CompletedDateAssignment_32 ) ) )
            // InternalKPIGenerator.g:1154:1: ( ( rule__Task__CompletedDateAssignment_32 ) )
            {
            // InternalKPIGenerator.g:1154:1: ( ( rule__Task__CompletedDateAssignment_32 ) )
            // InternalKPIGenerator.g:1155:2: ( rule__Task__CompletedDateAssignment_32 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAssignment_32()); 
            // InternalKPIGenerator.g:1156:2: ( rule__Task__CompletedDateAssignment_32 )
            // InternalKPIGenerator.g:1156:3: rule__Task__CompletedDateAssignment_32
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAssignment_32();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAssignment_32()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1164:1: rule__Task__Group__33 : rule__Task__Group__33__Impl rule__Task__Group__34 ;
    public final void rule__Task__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1168:1: ( rule__Task__Group__33__Impl rule__Task__Group__34 )
            // InternalKPIGenerator.g:1169:2: rule__Task__Group__33__Impl rule__Task__Group__34
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
    // InternalKPIGenerator.g:1176:1: rule__Task__Group__33__Impl : ( ( rule__Task__CompletedHourAssignment_33 ) ) ;
    public final void rule__Task__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1180:1: ( ( ( rule__Task__CompletedHourAssignment_33 ) ) )
            // InternalKPIGenerator.g:1181:1: ( ( rule__Task__CompletedHourAssignment_33 ) )
            {
            // InternalKPIGenerator.g:1181:1: ( ( rule__Task__CompletedHourAssignment_33 ) )
            // InternalKPIGenerator.g:1182:2: ( rule__Task__CompletedHourAssignment_33 )
            {
             before(grammarAccess.getTaskAccess().getCompletedHourAssignment_33()); 
            // InternalKPIGenerator.g:1183:2: ( rule__Task__CompletedHourAssignment_33 )
            // InternalKPIGenerator.g:1183:3: rule__Task__CompletedHourAssignment_33
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedHourAssignment_33();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedHourAssignment_33()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1191:1: rule__Task__Group__34 : rule__Task__Group__34__Impl rule__Task__Group__35 ;
    public final void rule__Task__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1195:1: ( rule__Task__Group__34__Impl rule__Task__Group__35 )
            // InternalKPIGenerator.g:1196:2: rule__Task__Group__34__Impl rule__Task__Group__35
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:1203:1: rule__Task__Group__34__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1207:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1208:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1208:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1209:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1218:1: rule__Task__Group__35 : rule__Task__Group__35__Impl rule__Task__Group__36 ;
    public final void rule__Task__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1222:1: ( rule__Task__Group__35__Impl rule__Task__Group__36 )
            // InternalKPIGenerator.g:1223:2: rule__Task__Group__35__Impl rule__Task__Group__36
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
    // InternalKPIGenerator.g:1230:1: rule__Task__Group__35__Impl : ( RULE_CADENA ) ;
    public final void rule__Task__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1234:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1235:1: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1235:1: ( RULE_CADENA )
            // InternalKPIGenerator.g:1236:2: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_35()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_35()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1245:1: rule__Task__Group__36 : rule__Task__Group__36__Impl rule__Task__Group__37 ;
    public final void rule__Task__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1249:1: ( rule__Task__Group__36__Impl rule__Task__Group__37 )
            // InternalKPIGenerator.g:1250:2: rule__Task__Group__36__Impl rule__Task__Group__37
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:1257:1: rule__Task__Group__36__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1261:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1262:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1262:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1263:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1272:1: rule__Task__Group__37 : rule__Task__Group__37__Impl rule__Task__Group__38 ;
    public final void rule__Task__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1276:1: ( rule__Task__Group__37__Impl rule__Task__Group__38 )
            // InternalKPIGenerator.g:1277:2: rule__Task__Group__37__Impl rule__Task__Group__38
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
    // InternalKPIGenerator.g:1284:1: rule__Task__Group__37__Impl : ( RULE_CADENA ) ;
    public final void rule__Task__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1288:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1289:1: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1289:1: ( RULE_CADENA )
            // InternalKPIGenerator.g:1290:2: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_37()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_37()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1299:1: rule__Task__Group__38 : rule__Task__Group__38__Impl rule__Task__Group__39 ;
    public final void rule__Task__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1303:1: ( rule__Task__Group__38__Impl rule__Task__Group__39 )
            // InternalKPIGenerator.g:1304:2: rule__Task__Group__38__Impl rule__Task__Group__39
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
    // InternalKPIGenerator.g:1311:1: rule__Task__Group__38__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1315:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1316:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1316:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1317:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1326:1: rule__Task__Group__39 : rule__Task__Group__39__Impl rule__Task__Group__40 ;
    public final void rule__Task__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1330:1: ( rule__Task__Group__39__Impl rule__Task__Group__40 )
            // InternalKPIGenerator.g:1331:2: rule__Task__Group__39__Impl rule__Task__Group__40
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
    // InternalKPIGenerator.g:1338:1: rule__Task__Group__39__Impl : ( ( rule__Task__TimeLoggedAssignment_39 )? ) ;
    public final void rule__Task__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1342:1: ( ( ( rule__Task__TimeLoggedAssignment_39 )? ) )
            // InternalKPIGenerator.g:1343:1: ( ( rule__Task__TimeLoggedAssignment_39 )? )
            {
            // InternalKPIGenerator.g:1343:1: ( ( rule__Task__TimeLoggedAssignment_39 )? )
            // InternalKPIGenerator.g:1344:2: ( rule__Task__TimeLoggedAssignment_39 )?
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedAssignment_39()); 
            // InternalKPIGenerator.g:1345:2: ( rule__Task__TimeLoggedAssignment_39 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:1345:3: rule__Task__TimeLoggedAssignment_39
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__TimeLoggedAssignment_39();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getTimeLoggedAssignment_39()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1353:1: rule__Task__Group__40 : rule__Task__Group__40__Impl rule__Task__Group__41 ;
    public final void rule__Task__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1357:1: ( rule__Task__Group__40__Impl rule__Task__Group__41 )
            // InternalKPIGenerator.g:1358:2: rule__Task__Group__40__Impl rule__Task__Group__41
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:1365:1: rule__Task__Group__40__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1369:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1370:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1370:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1371:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_40()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_40()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1380:1: rule__Task__Group__41 : rule__Task__Group__41__Impl rule__Task__Group__42 ;
    public final void rule__Task__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1384:1: ( rule__Task__Group__41__Impl rule__Task__Group__42 )
            // InternalKPIGenerator.g:1385:2: rule__Task__Group__41__Impl rule__Task__Group__42
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:1392:1: rule__Task__Group__41__Impl : ( ( rule__Task__BillableMinutesAssignment_41 )? ) ;
    public final void rule__Task__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1396:1: ( ( ( rule__Task__BillableMinutesAssignment_41 )? ) )
            // InternalKPIGenerator.g:1397:1: ( ( rule__Task__BillableMinutesAssignment_41 )? )
            {
            // InternalKPIGenerator.g:1397:1: ( ( rule__Task__BillableMinutesAssignment_41 )? )
            // InternalKPIGenerator.g:1398:2: ( rule__Task__BillableMinutesAssignment_41 )?
            {
             before(grammarAccess.getTaskAccess().getBillableMinutesAssignment_41()); 
            // InternalKPIGenerator.g:1399:2: ( rule__Task__BillableMinutesAssignment_41 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:1399:3: rule__Task__BillableMinutesAssignment_41
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__BillableMinutesAssignment_41();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getBillableMinutesAssignment_41()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1407:1: rule__Task__Group__42 : rule__Task__Group__42__Impl rule__Task__Group__43 ;
    public final void rule__Task__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1411:1: ( rule__Task__Group__42__Impl rule__Task__Group__43 )
            // InternalKPIGenerator.g:1412:2: rule__Task__Group__42__Impl rule__Task__Group__43
            {
            pushFollow(FOLLOW_12);
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
    // InternalKPIGenerator.g:1419:1: rule__Task__Group__42__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1423:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1424:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1424:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1425:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_42()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_42()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1434:1: rule__Task__Group__43 : rule__Task__Group__43__Impl rule__Task__Group__44 ;
    public final void rule__Task__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1438:1: ( rule__Task__Group__43__Impl rule__Task__Group__44 )
            // InternalKPIGenerator.g:1439:2: rule__Task__Group__43__Impl rule__Task__Group__44
            {
            pushFollow(FOLLOW_12);
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
    // InternalKPIGenerator.g:1446:1: rule__Task__Group__43__Impl : ( ( rule__Task__ParentTaskAssignment_43 )? ) ;
    public final void rule__Task__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1450:1: ( ( ( rule__Task__ParentTaskAssignment_43 )? ) )
            // InternalKPIGenerator.g:1451:1: ( ( rule__Task__ParentTaskAssignment_43 )? )
            {
            // InternalKPIGenerator.g:1451:1: ( ( rule__Task__ParentTaskAssignment_43 )? )
            // InternalKPIGenerator.g:1452:2: ( rule__Task__ParentTaskAssignment_43 )?
            {
             before(grammarAccess.getTaskAccess().getParentTaskAssignment_43()); 
            // InternalKPIGenerator.g:1453:2: ( rule__Task__ParentTaskAssignment_43 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKPIGenerator.g:1453:3: rule__Task__ParentTaskAssignment_43
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__ParentTaskAssignment_43();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getParentTaskAssignment_43()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1461:1: rule__Task__Group__44 : rule__Task__Group__44__Impl rule__Task__Group__45 ;
    public final void rule__Task__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1465:1: ( rule__Task__Group__44__Impl rule__Task__Group__45 )
            // InternalKPIGenerator.g:1466:2: rule__Task__Group__44__Impl rule__Task__Group__45
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:1473:1: rule__Task__Group__44__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1477:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1478:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1478:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1479:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_44()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_44()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1488:1: rule__Task__Group__45 : rule__Task__Group__45__Impl rule__Task__Group__46 ;
    public final void rule__Task__Group__45() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1492:1: ( rule__Task__Group__45__Impl rule__Task__Group__46 )
            // InternalKPIGenerator.g:1493:2: rule__Task__Group__45__Impl rule__Task__Group__46
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:1500:1: rule__Task__Group__45__Impl : ( ( rule__Task__CompletedOnTimeAssignment_45 ) ) ;
    public final void rule__Task__Group__45__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1504:1: ( ( ( rule__Task__CompletedOnTimeAssignment_45 ) ) )
            // InternalKPIGenerator.g:1505:1: ( ( rule__Task__CompletedOnTimeAssignment_45 ) )
            {
            // InternalKPIGenerator.g:1505:1: ( ( rule__Task__CompletedOnTimeAssignment_45 ) )
            // InternalKPIGenerator.g:1506:2: ( rule__Task__CompletedOnTimeAssignment_45 )
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_45()); 
            // InternalKPIGenerator.g:1507:2: ( rule__Task__CompletedOnTimeAssignment_45 )
            // InternalKPIGenerator.g:1507:3: rule__Task__CompletedOnTimeAssignment_45
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedOnTimeAssignment_45();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_45()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1515:1: rule__Task__Group__46 : rule__Task__Group__46__Impl rule__Task__Group__47 ;
    public final void rule__Task__Group__46() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1519:1: ( rule__Task__Group__46__Impl rule__Task__Group__47 )
            // InternalKPIGenerator.g:1520:2: rule__Task__Group__46__Impl rule__Task__Group__47
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:1527:1: rule__Task__Group__46__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__46__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1531:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1532:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1532:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1533:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_46()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_46()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1542:1: rule__Task__Group__47 : rule__Task__Group__47__Impl rule__Task__Group__48 ;
    public final void rule__Task__Group__47() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1546:1: ( rule__Task__Group__47__Impl rule__Task__Group__48 )
            // InternalKPIGenerator.g:1547:2: rule__Task__Group__47__Impl rule__Task__Group__48
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:1554:1: rule__Task__Group__47__Impl : ( ( rule__Task__TimeEstimatedAssignment_47 ) ) ;
    public final void rule__Task__Group__47__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1558:1: ( ( ( rule__Task__TimeEstimatedAssignment_47 ) ) )
            // InternalKPIGenerator.g:1559:1: ( ( rule__Task__TimeEstimatedAssignment_47 ) )
            {
            // InternalKPIGenerator.g:1559:1: ( ( rule__Task__TimeEstimatedAssignment_47 ) )
            // InternalKPIGenerator.g:1560:2: ( rule__Task__TimeEstimatedAssignment_47 )
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_47()); 
            // InternalKPIGenerator.g:1561:2: ( rule__Task__TimeEstimatedAssignment_47 )
            // InternalKPIGenerator.g:1561:3: rule__Task__TimeEstimatedAssignment_47
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeEstimatedAssignment_47();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_47()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1569:1: rule__Task__Group__48 : rule__Task__Group__48__Impl rule__Task__Group__49 ;
    public final void rule__Task__Group__48() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1573:1: ( rule__Task__Group__48__Impl rule__Task__Group__49 )
            // InternalKPIGenerator.g:1574:2: rule__Task__Group__48__Impl rule__Task__Group__49
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1581:1: rule__Task__Group__48__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__48__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1585:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1586:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1586:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1587:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_48()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_48()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1596:1: rule__Task__Group__49 : rule__Task__Group__49__Impl rule__Task__Group__50 ;
    public final void rule__Task__Group__49() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1600:1: ( rule__Task__Group__49__Impl rule__Task__Group__50 )
            // InternalKPIGenerator.g:1601:2: rule__Task__Group__49__Impl rule__Task__Group__50
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1608:1: rule__Task__Group__49__Impl : ( ( rule__Task__TagsAssignment_49 )? ) ;
    public final void rule__Task__Group__49__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1612:1: ( ( ( rule__Task__TagsAssignment_49 )? ) )
            // InternalKPIGenerator.g:1613:1: ( ( rule__Task__TagsAssignment_49 )? )
            {
            // InternalKPIGenerator.g:1613:1: ( ( rule__Task__TagsAssignment_49 )? )
            // InternalKPIGenerator.g:1614:2: ( rule__Task__TagsAssignment_49 )?
            {
             before(grammarAccess.getTaskAccess().getTagsAssignment_49()); 
            // InternalKPIGenerator.g:1615:2: ( rule__Task__TagsAssignment_49 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CADENA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKPIGenerator.g:1615:3: rule__Task__TagsAssignment_49
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__TagsAssignment_49();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getTagsAssignment_49()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1623:1: rule__Task__Group__50 : rule__Task__Group__50__Impl ;
    public final void rule__Task__Group__50() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1627:1: ( rule__Task__Group__50__Impl )
            // InternalKPIGenerator.g:1628:2: rule__Task__Group__50__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__50__Impl();

            state._fsp--;


            }

        }
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
    // InternalKPIGenerator.g:1634:1: rule__Task__Group__50__Impl : ( '\\r\\n' ) ;
    public final void rule__Task__Group__50__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1638:1: ( ( '\\r\\n' ) )
            // InternalKPIGenerator.g:1639:1: ( '\\r\\n' )
            {
            // InternalKPIGenerator.g:1639:1: ( '\\r\\n' )
            // InternalKPIGenerator.g:1640:2: '\\r\\n'
            {
             before(grammarAccess.getTaskAccess().getControl000dControl000aKeyword_50()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getControl000dControl000aKeyword_50()); 

            }


            }

        }
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


    // $ANTLR start "rule__Project__Group__0"
    // InternalKPIGenerator.g:1650:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1654:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalKPIGenerator.g:1655:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:1662:1: rule__Project__Group__0__Impl : ( () ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1666:1: ( ( () ) )
            // InternalKPIGenerator.g:1667:1: ( () )
            {
            // InternalKPIGenerator.g:1667:1: ( () )
            // InternalKPIGenerator.g:1668:2: ()
            {
             before(grammarAccess.getProjectAccess().getProjectAction_0()); 
            // InternalKPIGenerator.g:1669:2: ()
            // InternalKPIGenerator.g:1669:3: 
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
    // InternalKPIGenerator.g:1677:1: rule__Project__Group__1 : rule__Project__Group__1__Impl ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1681:1: ( rule__Project__Group__1__Impl )
            // InternalKPIGenerator.g:1682:2: rule__Project__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalKPIGenerator.g:1688:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1692:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // InternalKPIGenerator.g:1693:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // InternalKPIGenerator.g:1693:1: ( ( rule__Project__NameAssignment_1 ) )
            // InternalKPIGenerator.g:1694:2: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // InternalKPIGenerator.g:1695:2: ( rule__Project__NameAssignment_1 )
            // InternalKPIGenerator.g:1695:3: rule__Project__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Status__Group__0"
    // InternalKPIGenerator.g:1704:1: rule__Status__Group__0 : rule__Status__Group__0__Impl rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1708:1: ( rule__Status__Group__0__Impl rule__Status__Group__1 )
            // InternalKPIGenerator.g:1709:2: rule__Status__Group__0__Impl rule__Status__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:1716:1: rule__Status__Group__0__Impl : ( ( rule__Status__StatusNameAssignment_0 ) ) ;
    public final void rule__Status__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1720:1: ( ( ( rule__Status__StatusNameAssignment_0 ) ) )
            // InternalKPIGenerator.g:1721:1: ( ( rule__Status__StatusNameAssignment_0 ) )
            {
            // InternalKPIGenerator.g:1721:1: ( ( rule__Status__StatusNameAssignment_0 ) )
            // InternalKPIGenerator.g:1722:2: ( rule__Status__StatusNameAssignment_0 )
            {
             before(grammarAccess.getStatusAccess().getStatusNameAssignment_0()); 
            // InternalKPIGenerator.g:1723:2: ( rule__Status__StatusNameAssignment_0 )
            // InternalKPIGenerator.g:1723:3: rule__Status__StatusNameAssignment_0
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
    // InternalKPIGenerator.g:1731:1: rule__Status__Group__1 : rule__Status__Group__1__Impl rule__Status__Group__2 ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1735:1: ( rule__Status__Group__1__Impl rule__Status__Group__2 )
            // InternalKPIGenerator.g:1736:2: rule__Status__Group__1__Impl rule__Status__Group__2
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
    // InternalKPIGenerator.g:1743:1: rule__Status__Group__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Status__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1747:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1748:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1748:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1749:2: RULE_SEMICOLON
            {
             before(grammarAccess.getStatusAccess().getSEMICOLONTerminalRuleCall_1()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getSEMICOLONTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1758:1: rule__Status__Group__2 : rule__Status__Group__2__Impl ;
    public final void rule__Status__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1762:1: ( rule__Status__Group__2__Impl )
            // InternalKPIGenerator.g:1763:2: rule__Status__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Status__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalKPIGenerator.g:1769:1: rule__Status__Group__2__Impl : ( ( rule__Status__TextAssignment_2 ) ) ;
    public final void rule__Status__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1773:1: ( ( ( rule__Status__TextAssignment_2 ) ) )
            // InternalKPIGenerator.g:1774:1: ( ( rule__Status__TextAssignment_2 ) )
            {
            // InternalKPIGenerator.g:1774:1: ( ( rule__Status__TextAssignment_2 ) )
            // InternalKPIGenerator.g:1775:2: ( rule__Status__TextAssignment_2 )
            {
             before(grammarAccess.getStatusAccess().getTextAssignment_2()); 
            // InternalKPIGenerator.g:1776:2: ( rule__Status__TextAssignment_2 )
            // InternalKPIGenerator.g:1776:3: rule__Status__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Status__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getTextAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__BOOL__Group__0"
    // InternalKPIGenerator.g:1785:1: rule__BOOL__Group__0 : rule__BOOL__Group__0__Impl rule__BOOL__Group__1 ;
    public final void rule__BOOL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1789:1: ( rule__BOOL__Group__0__Impl rule__BOOL__Group__1 )
            // InternalKPIGenerator.g:1790:2: rule__BOOL__Group__0__Impl rule__BOOL__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BOOL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BOOL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__Group__0"


    // $ANTLR start "rule__BOOL__Group__0__Impl"
    // InternalKPIGenerator.g:1797:1: rule__BOOL__Group__0__Impl : ( () ) ;
    public final void rule__BOOL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1801:1: ( ( () ) )
            // InternalKPIGenerator.g:1802:1: ( () )
            {
            // InternalKPIGenerator.g:1802:1: ( () )
            // InternalKPIGenerator.g:1803:2: ()
            {
             before(grammarAccess.getBOOLAccess().getBOOLAction_0()); 
            // InternalKPIGenerator.g:1804:2: ()
            // InternalKPIGenerator.g:1804:3: 
            {
            }

             after(grammarAccess.getBOOLAccess().getBOOLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__Group__0__Impl"


    // $ANTLR start "rule__BOOL__Group__1"
    // InternalKPIGenerator.g:1812:1: rule__BOOL__Group__1 : rule__BOOL__Group__1__Impl ;
    public final void rule__BOOL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1816:1: ( rule__BOOL__Group__1__Impl )
            // InternalKPIGenerator.g:1817:2: rule__BOOL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BOOL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__Group__1"


    // $ANTLR start "rule__BOOL__Group__1__Impl"
    // InternalKPIGenerator.g:1823:1: rule__BOOL__Group__1__Impl : ( ( rule__BOOL__Alternatives_1 ) ) ;
    public final void rule__BOOL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1827:1: ( ( ( rule__BOOL__Alternatives_1 ) ) )
            // InternalKPIGenerator.g:1828:1: ( ( rule__BOOL__Alternatives_1 ) )
            {
            // InternalKPIGenerator.g:1828:1: ( ( rule__BOOL__Alternatives_1 ) )
            // InternalKPIGenerator.g:1829:2: ( rule__BOOL__Alternatives_1 )
            {
             before(grammarAccess.getBOOLAccess().getAlternatives_1()); 
            // InternalKPIGenerator.g:1830:2: ( rule__BOOL__Alternatives_1 )
            // InternalKPIGenerator.g:1830:3: rule__BOOL__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__BOOL__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBOOLAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__Group__1__Impl"


    // $ANTLR start "rule__Root__TasksAssignment_1"
    // InternalKPIGenerator.g:1839:1: rule__Root__TasksAssignment_1 : ( ruleTask ) ;
    public final void rule__Root__TasksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1843:1: ( ( ruleTask ) )
            // InternalKPIGenerator.g:1844:2: ( ruleTask )
            {
            // InternalKPIGenerator.g:1844:2: ( ruleTask )
            // InternalKPIGenerator.g:1845:3: ruleTask
            {
             before(grammarAccess.getRootAccess().getTasksTaskParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getRootAccess().getTasksTaskParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__TasksAssignment_1"


    // $ANTLR start "rule__Task__ProjectAssignment_3"
    // InternalKPIGenerator.g:1854:1: rule__Task__ProjectAssignment_3 : ( ruleProject ) ;
    public final void rule__Task__ProjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1858:1: ( ( ruleProject ) )
            // InternalKPIGenerator.g:1859:2: ( ruleProject )
            {
            // InternalKPIGenerator.g:1859:2: ( ruleProject )
            // InternalKPIGenerator.g:1860:3: ruleProject
            {
             before(grammarAccess.getTaskAccess().getProjectProjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getProjectProjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ProjectAssignment_3"


    // $ANTLR start "rule__Task__MilestoneAssignment_5"
    // InternalKPIGenerator.g:1869:1: rule__Task__MilestoneAssignment_5 : ( RULE_CADENA ) ;
    public final void rule__Task__MilestoneAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1873:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1874:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1874:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1875:3: RULE_CADENA
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


    // $ANTLR start "rule__Task__NameAssignment_7"
    // InternalKPIGenerator.g:1884:1: rule__Task__NameAssignment_7 : ( RULE_CADENA ) ;
    public final void rule__Task__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1888:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1889:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1889:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1890:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getNameCADENATerminalRuleCall_7_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameCADENATerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_7"


    // $ANTLR start "rule__Task__TaskDescriptionAssignment_9"
    // InternalKPIGenerator.g:1899:1: rule__Task__TaskDescriptionAssignment_9 : ( RULE_CADENA ) ;
    public final void rule__Task__TaskDescriptionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1903:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1904:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1904:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1905:3: RULE_CADENA
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
    // InternalKPIGenerator.g:1914:1: rule__Task__StartDateAssignment_11 : ( RULE_DATE ) ;
    public final void rule__Task__StartDateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1918:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:1919:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:1919:2: ( RULE_DATE )
            // InternalKPIGenerator.g:1920:3: RULE_DATE
            {
             before(grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_11_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_11_0()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1929:1: rule__Task__DueDateAssignment_13 : ( RULE_DATE ) ;
    public final void rule__Task__DueDateAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1933:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:1934:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:1934:2: ( RULE_DATE )
            // InternalKPIGenerator.g:1935:3: RULE_DATE
            {
             before(grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_13_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_13_0()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1944:1: rule__Task__PriorityAssignment_15 : ( RULE_CADENA ) ;
    public final void rule__Task__PriorityAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1948:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1949:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1949:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1950:3: RULE_CADENA
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
    // InternalKPIGenerator.g:1959:1: rule__Task__PrivateAssignment_17 : ( ruleBOOL ) ;
    public final void rule__Task__PrivateAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1963:1: ( ( ruleBOOL ) )
            // InternalKPIGenerator.g:1964:2: ( ruleBOOL )
            {
            // InternalKPIGenerator.g:1964:2: ( ruleBOOL )
            // InternalKPIGenerator.g:1965:3: ruleBOOL
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
    // InternalKPIGenerator.g:1974:1: rule__Task__ProgressAssignment_19 : ( RULE_INT ) ;
    public final void rule__Task__ProgressAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1978:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1979:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1979:2: ( RULE_INT )
            // InternalKPIGenerator.g:1980:3: RULE_INT
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


    // $ANTLR start "rule__Task__StatusAssignment_21"
    // InternalKPIGenerator.g:1989:1: rule__Task__StatusAssignment_21 : ( ruleStatus ) ;
    public final void rule__Task__StatusAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1993:1: ( ( ruleStatus ) )
            // InternalKPIGenerator.g:1994:2: ( ruleStatus )
            {
            // InternalKPIGenerator.g:1994:2: ( ruleStatus )
            // InternalKPIGenerator.g:1995:3: ruleStatus
            {
             before(grammarAccess.getTaskAccess().getStatusStatusParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getStatusStatusParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__StatusAssignment_21"


    // $ANTLR start "rule__Task__AssignedToAssignment_23"
    // InternalKPIGenerator.g:2004:1: rule__Task__AssignedToAssignment_23 : ( RULE_CADENA ) ;
    public final void rule__Task__AssignedToAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2008:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2009:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2009:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2010:3: RULE_CADENA
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
    // InternalKPIGenerator.g:2019:1: rule__Task__CreatedDateAssignment_25 : ( RULE_DATE ) ;
    public final void rule__Task__CreatedDateAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2023:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:2024:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:2024:2: ( RULE_DATE )
            // InternalKPIGenerator.g:2025:3: RULE_DATE
            {
             before(grammarAccess.getTaskAccess().getCreatedDateDATETerminalRuleCall_25_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateDATETerminalRuleCall_25_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Task__CreatedHourAssignment_26"
    // InternalKPIGenerator.g:2034:1: rule__Task__CreatedHourAssignment_26 : ( RULE_HOUR ) ;
    public final void rule__Task__CreatedHourAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2038:1: ( ( RULE_HOUR ) )
            // InternalKPIGenerator.g:2039:2: ( RULE_HOUR )
            {
            // InternalKPIGenerator.g:2039:2: ( RULE_HOUR )
            // InternalKPIGenerator.g:2040:3: RULE_HOUR
            {
             before(grammarAccess.getTaskAccess().getCreatedHourHOURTerminalRuleCall_26_0()); 
            match(input,RULE_HOUR,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedHourHOURTerminalRuleCall_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CreatedHourAssignment_26"


    // $ANTLR start "rule__Task__CompletedDateAssignment_32"
    // InternalKPIGenerator.g:2049:1: rule__Task__CompletedDateAssignment_32 : ( RULE_DATE ) ;
    public final void rule__Task__CompletedDateAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2053:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:2054:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:2054:2: ( RULE_DATE )
            // InternalKPIGenerator.g:2055:3: RULE_DATE
            {
             before(grammarAccess.getTaskAccess().getCompletedDateDATETerminalRuleCall_32_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedDateDATETerminalRuleCall_32_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedDateAssignment_32"


    // $ANTLR start "rule__Task__CompletedHourAssignment_33"
    // InternalKPIGenerator.g:2064:1: rule__Task__CompletedHourAssignment_33 : ( RULE_HOUR ) ;
    public final void rule__Task__CompletedHourAssignment_33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2068:1: ( ( RULE_HOUR ) )
            // InternalKPIGenerator.g:2069:2: ( RULE_HOUR )
            {
            // InternalKPIGenerator.g:2069:2: ( RULE_HOUR )
            // InternalKPIGenerator.g:2070:3: RULE_HOUR
            {
             before(grammarAccess.getTaskAccess().getCompletedHourHOURTerminalRuleCall_33_0()); 
            match(input,RULE_HOUR,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedHourHOURTerminalRuleCall_33_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedHourAssignment_33"


    // $ANTLR start "rule__Task__TimeLoggedAssignment_39"
    // InternalKPIGenerator.g:2079:1: rule__Task__TimeLoggedAssignment_39 : ( RULE_INT ) ;
    public final void rule__Task__TimeLoggedAssignment_39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2083:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2084:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2084:2: ( RULE_INT )
            // InternalKPIGenerator.g:2085:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedINTTerminalRuleCall_39_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedINTTerminalRuleCall_39_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeLoggedAssignment_39"


    // $ANTLR start "rule__Task__BillableMinutesAssignment_41"
    // InternalKPIGenerator.g:2094:1: rule__Task__BillableMinutesAssignment_41 : ( RULE_INT ) ;
    public final void rule__Task__BillableMinutesAssignment_41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2098:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2099:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2099:2: ( RULE_INT )
            // InternalKPIGenerator.g:2100:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getBillableMinutesINTTerminalRuleCall_41_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableMinutesINTTerminalRuleCall_41_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__BillableMinutesAssignment_41"


    // $ANTLR start "rule__Task__ParentTaskAssignment_43"
    // InternalKPIGenerator.g:2109:1: rule__Task__ParentTaskAssignment_43 : ( ( RULE_ID ) ) ;
    public final void rule__Task__ParentTaskAssignment_43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2113:1: ( ( ( RULE_ID ) ) )
            // InternalKPIGenerator.g:2114:2: ( ( RULE_ID ) )
            {
            // InternalKPIGenerator.g:2114:2: ( ( RULE_ID ) )
            // InternalKPIGenerator.g:2115:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getParentTaskTaskCrossReference_43_0()); 
            // InternalKPIGenerator.g:2116:3: ( RULE_ID )
            // InternalKPIGenerator.g:2117:4: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getParentTaskTaskIDTerminalRuleCall_43_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getParentTaskTaskIDTerminalRuleCall_43_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getParentTaskTaskCrossReference_43_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ParentTaskAssignment_43"


    // $ANTLR start "rule__Task__CompletedOnTimeAssignment_45"
    // InternalKPIGenerator.g:2128:1: rule__Task__CompletedOnTimeAssignment_45 : ( ruleBOOL ) ;
    public final void rule__Task__CompletedOnTimeAssignment_45() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2132:1: ( ( ruleBOOL ) )
            // InternalKPIGenerator.g:2133:2: ( ruleBOOL )
            {
            // InternalKPIGenerator.g:2133:2: ( ruleBOOL )
            // InternalKPIGenerator.g:2134:3: ruleBOOL
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeBOOLParserRuleCall_45_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getCompletedOnTimeBOOLParserRuleCall_45_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedOnTimeAssignment_45"


    // $ANTLR start "rule__Task__TimeEstimatedAssignment_47"
    // InternalKPIGenerator.g:2143:1: rule__Task__TimeEstimatedAssignment_47 : ( RULE_INT ) ;
    public final void rule__Task__TimeEstimatedAssignment_47() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2147:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:2148:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:2148:2: ( RULE_INT )
            // InternalKPIGenerator.g:2149:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_47_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_47_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeEstimatedAssignment_47"


    // $ANTLR start "rule__Task__TagsAssignment_49"
    // InternalKPIGenerator.g:2158:1: rule__Task__TagsAssignment_49 : ( RULE_CADENA ) ;
    public final void rule__Task__TagsAssignment_49() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2162:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2163:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2163:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2164:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_49_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_49_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TagsAssignment_49"


    // $ANTLR start "rule__Project__NameAssignment_1"
    // InternalKPIGenerator.g:2173:1: rule__Project__NameAssignment_1 : ( RULE_CADENA ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2177:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2178:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2178:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2179:3: RULE_CADENA
            {
             before(grammarAccess.getProjectAccess().getNameCADENATerminalRuleCall_1_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameCADENATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment_1"


    // $ANTLR start "rule__Status__StatusNameAssignment_0"
    // InternalKPIGenerator.g:2188:1: rule__Status__StatusNameAssignment_0 : ( ( rule__Status__StatusNameAlternatives_0_0 ) ) ;
    public final void rule__Status__StatusNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2192:1: ( ( ( rule__Status__StatusNameAlternatives_0_0 ) ) )
            // InternalKPIGenerator.g:2193:2: ( ( rule__Status__StatusNameAlternatives_0_0 ) )
            {
            // InternalKPIGenerator.g:2193:2: ( ( rule__Status__StatusNameAlternatives_0_0 ) )
            // InternalKPIGenerator.g:2194:3: ( rule__Status__StatusNameAlternatives_0_0 )
            {
             before(grammarAccess.getStatusAccess().getStatusNameAlternatives_0_0()); 
            // InternalKPIGenerator.g:2195:3: ( rule__Status__StatusNameAlternatives_0_0 )
            // InternalKPIGenerator.g:2195:4: rule__Status__StatusNameAlternatives_0_0
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


    // $ANTLR start "rule__Status__TextAssignment_2"
    // InternalKPIGenerator.g:2203:1: rule__Status__TextAssignment_2 : ( RULE_CADENA ) ;
    public final void rule__Status__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:2207:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:2208:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:2208:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:2209:3: RULE_CADENA
            {
             before(grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_2_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__TextAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200080L});

}