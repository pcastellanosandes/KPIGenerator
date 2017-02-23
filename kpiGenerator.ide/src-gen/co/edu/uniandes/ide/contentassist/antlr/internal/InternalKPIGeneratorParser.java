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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEMICOLON", "RULE_CADENA", "RULE_NEWLINE", "RULE_INT", "RULE_DATE", "RULE_STRING", "RULE_DATEHOUR", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'completed'", "'new'", "'FALSO'", "'VERDADERO'"
    };
    public static final int RULE_NEWLINE=6;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_DATEHOUR=10;
    public static final int RULE_ID=11;
    public static final int RULE_WS=14;
    public static final int RULE_CADENA=5;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_DATE=8;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=12;
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
    // InternalKPIGenerator.g:112:1: ruleBOOL : ( ( rule__BOOL__Group__0 ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:116:2: ( ( ( rule__BOOL__Group__0 ) ) )
            // InternalKPIGenerator.g:117:2: ( ( rule__BOOL__Group__0 ) )
            {
            // InternalKPIGenerator.g:117:2: ( ( rule__BOOL__Group__0 ) )
            // InternalKPIGenerator.g:118:3: ( rule__BOOL__Group__0 )
            {
             before(grammarAccess.getBOOLAccess().getGroup()); 
            // InternalKPIGenerator.g:119:3: ( rule__BOOL__Group__0 )
            // InternalKPIGenerator.g:119:4: rule__BOOL__Group__0
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
    // InternalKPIGenerator.g:127:1: rule__Status__StatusNameAlternatives_0_0 : ( ( 'completed' ) | ( 'new' ) );
    public final void rule__Status__StatusNameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:131:1: ( ( 'completed' ) | ( 'new' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKPIGenerator.g:132:2: ( 'completed' )
                    {
                    // InternalKPIGenerator.g:132:2: ( 'completed' )
                    // InternalKPIGenerator.g:133:3: 'completed'
                    {
                     before(grammarAccess.getStatusAccess().getStatusNameCompletedKeyword_0_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getStatusAccess().getStatusNameCompletedKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:138:2: ( 'new' )
                    {
                    // InternalKPIGenerator.g:138:2: ( 'new' )
                    // InternalKPIGenerator.g:139:3: 'new'
                    {
                     before(grammarAccess.getStatusAccess().getStatusNameNewKeyword_0_0_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalKPIGenerator.g:148:1: rule__BOOL__Alternatives_1 : ( ( 'FALSO' ) | ( 'VERDADERO' ) );
    public final void rule__BOOL__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:152:1: ( ( 'FALSO' ) | ( 'VERDADERO' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:153:2: ( 'FALSO' )
                    {
                    // InternalKPIGenerator.g:153:2: ( 'FALSO' )
                    // InternalKPIGenerator.g:154:3: 'FALSO'
                    {
                     before(grammarAccess.getBOOLAccess().getFALSOKeyword_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBOOLAccess().getFALSOKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:159:2: ( 'VERDADERO' )
                    {
                    // InternalKPIGenerator.g:159:2: ( 'VERDADERO' )
                    // InternalKPIGenerator.g:160:3: 'VERDADERO'
                    {
                     before(grammarAccess.getBOOLAccess().getVERDADEROKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__Task__Group__0"
    // InternalKPIGenerator.g:169:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:173:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalKPIGenerator.g:174:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalKPIGenerator.g:181:1: rule__Task__Group__0__Impl : ( () ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:185:1: ( ( () ) )
            // InternalKPIGenerator.g:186:1: ( () )
            {
            // InternalKPIGenerator.g:186:1: ( () )
            // InternalKPIGenerator.g:187:2: ()
            {
             before(grammarAccess.getTaskAccess().getTaskAction_0()); 
            // InternalKPIGenerator.g:188:2: ()
            // InternalKPIGenerator.g:188:3: 
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
    // InternalKPIGenerator.g:196:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:200:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalKPIGenerator.g:201:2: rule__Task__Group__1__Impl rule__Task__Group__2
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
    // InternalKPIGenerator.g:208:1: rule__Task__Group__1__Impl : ( ( rule__Task__IdAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:212:1: ( ( ( rule__Task__IdAssignment_1 ) ) )
            // InternalKPIGenerator.g:213:1: ( ( rule__Task__IdAssignment_1 ) )
            {
            // InternalKPIGenerator.g:213:1: ( ( rule__Task__IdAssignment_1 ) )
            // InternalKPIGenerator.g:214:2: ( rule__Task__IdAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getIdAssignment_1()); 
            // InternalKPIGenerator.g:215:2: ( rule__Task__IdAssignment_1 )
            // InternalKPIGenerator.g:215:3: rule__Task__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIdAssignment_1()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:223:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:227:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalKPIGenerator.g:228:2: rule__Task__Group__2__Impl rule__Task__Group__3
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
    // InternalKPIGenerator.g:235:1: rule__Task__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:239:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:240:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:240:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:241:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:250:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:254:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalKPIGenerator.g:255:2: rule__Task__Group__3__Impl rule__Task__Group__4
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
    // InternalKPIGenerator.g:262:1: rule__Task__Group__3__Impl : ( ( rule__Task__ProjectAssignment_3 ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:266:1: ( ( ( rule__Task__ProjectAssignment_3 ) ) )
            // InternalKPIGenerator.g:267:1: ( ( rule__Task__ProjectAssignment_3 ) )
            {
            // InternalKPIGenerator.g:267:1: ( ( rule__Task__ProjectAssignment_3 ) )
            // InternalKPIGenerator.g:268:2: ( rule__Task__ProjectAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getProjectAssignment_3()); 
            // InternalKPIGenerator.g:269:2: ( rule__Task__ProjectAssignment_3 )
            // InternalKPIGenerator.g:269:3: rule__Task__ProjectAssignment_3
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
    // InternalKPIGenerator.g:277:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:281:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalKPIGenerator.g:282:2: rule__Task__Group__4__Impl rule__Task__Group__5
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
    // InternalKPIGenerator.g:289:1: rule__Task__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:293:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:294:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:294:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:295:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:304:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:308:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalKPIGenerator.g:309:2: rule__Task__Group__5__Impl rule__Task__Group__6
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
    // InternalKPIGenerator.g:316:1: rule__Task__Group__5__Impl : ( ( rule__Task__MilestoneAssignment_5 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:320:1: ( ( ( rule__Task__MilestoneAssignment_5 )? ) )
            // InternalKPIGenerator.g:321:1: ( ( rule__Task__MilestoneAssignment_5 )? )
            {
            // InternalKPIGenerator.g:321:1: ( ( rule__Task__MilestoneAssignment_5 )? )
            // InternalKPIGenerator.g:322:2: ( rule__Task__MilestoneAssignment_5 )?
            {
             before(grammarAccess.getTaskAccess().getMilestoneAssignment_5()); 
            // InternalKPIGenerator.g:323:2: ( rule__Task__MilestoneAssignment_5 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_CADENA) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:323:3: rule__Task__MilestoneAssignment_5
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
    // InternalKPIGenerator.g:331:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:335:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalKPIGenerator.g:336:2: rule__Task__Group__6__Impl rule__Task__Group__7
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
    // InternalKPIGenerator.g:343:1: rule__Task__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:347:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:348:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:348:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:349:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:358:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:362:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalKPIGenerator.g:363:2: rule__Task__Group__7__Impl rule__Task__Group__8
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
    // InternalKPIGenerator.g:370:1: rule__Task__Group__7__Impl : ( ( rule__Task__NameAssignment_7 ) ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:374:1: ( ( ( rule__Task__NameAssignment_7 ) ) )
            // InternalKPIGenerator.g:375:1: ( ( rule__Task__NameAssignment_7 ) )
            {
            // InternalKPIGenerator.g:375:1: ( ( rule__Task__NameAssignment_7 ) )
            // InternalKPIGenerator.g:376:2: ( rule__Task__NameAssignment_7 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_7()); 
            // InternalKPIGenerator.g:377:2: ( rule__Task__NameAssignment_7 )
            // InternalKPIGenerator.g:377:3: rule__Task__NameAssignment_7
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
    // InternalKPIGenerator.g:385:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:389:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalKPIGenerator.g:390:2: rule__Task__Group__8__Impl rule__Task__Group__9
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
    // InternalKPIGenerator.g:397:1: rule__Task__Group__8__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:401:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:402:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:402:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:403:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:412:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:416:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalKPIGenerator.g:417:2: rule__Task__Group__9__Impl rule__Task__Group__10
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
    // InternalKPIGenerator.g:424:1: rule__Task__Group__9__Impl : ( ( rule__Task__TaskDescriptionAssignment_9 )? ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:428:1: ( ( ( rule__Task__TaskDescriptionAssignment_9 )? ) )
            // InternalKPIGenerator.g:429:1: ( ( rule__Task__TaskDescriptionAssignment_9 )? )
            {
            // InternalKPIGenerator.g:429:1: ( ( rule__Task__TaskDescriptionAssignment_9 )? )
            // InternalKPIGenerator.g:430:2: ( rule__Task__TaskDescriptionAssignment_9 )?
            {
             before(grammarAccess.getTaskAccess().getTaskDescriptionAssignment_9()); 
            // InternalKPIGenerator.g:431:2: ( rule__Task__TaskDescriptionAssignment_9 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CADENA) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:431:3: rule__Task__TaskDescriptionAssignment_9
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
    // InternalKPIGenerator.g:439:1: rule__Task__Group__10 : rule__Task__Group__10__Impl rule__Task__Group__11 ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:443:1: ( rule__Task__Group__10__Impl rule__Task__Group__11 )
            // InternalKPIGenerator.g:444:2: rule__Task__Group__10__Impl rule__Task__Group__11
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
    // InternalKPIGenerator.g:451:1: rule__Task__Group__10__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:455:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:456:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:456:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:457:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:466:1: rule__Task__Group__11 : rule__Task__Group__11__Impl rule__Task__Group__12 ;
    public final void rule__Task__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:470:1: ( rule__Task__Group__11__Impl rule__Task__Group__12 )
            // InternalKPIGenerator.g:471:2: rule__Task__Group__11__Impl rule__Task__Group__12
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
    // InternalKPIGenerator.g:478:1: rule__Task__Group__11__Impl : ( ( rule__Task__StartDateAssignment_11 ) ) ;
    public final void rule__Task__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:482:1: ( ( ( rule__Task__StartDateAssignment_11 ) ) )
            // InternalKPIGenerator.g:483:1: ( ( rule__Task__StartDateAssignment_11 ) )
            {
            // InternalKPIGenerator.g:483:1: ( ( rule__Task__StartDateAssignment_11 ) )
            // InternalKPIGenerator.g:484:2: ( rule__Task__StartDateAssignment_11 )
            {
             before(grammarAccess.getTaskAccess().getStartDateAssignment_11()); 
            // InternalKPIGenerator.g:485:2: ( rule__Task__StartDateAssignment_11 )
            // InternalKPIGenerator.g:485:3: rule__Task__StartDateAssignment_11
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
    // InternalKPIGenerator.g:493:1: rule__Task__Group__12 : rule__Task__Group__12__Impl rule__Task__Group__13 ;
    public final void rule__Task__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:497:1: ( rule__Task__Group__12__Impl rule__Task__Group__13 )
            // InternalKPIGenerator.g:498:2: rule__Task__Group__12__Impl rule__Task__Group__13
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
    // InternalKPIGenerator.g:505:1: rule__Task__Group__12__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:509:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:510:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:510:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:511:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:520:1: rule__Task__Group__13 : rule__Task__Group__13__Impl rule__Task__Group__14 ;
    public final void rule__Task__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:524:1: ( rule__Task__Group__13__Impl rule__Task__Group__14 )
            // InternalKPIGenerator.g:525:2: rule__Task__Group__13__Impl rule__Task__Group__14
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
    // InternalKPIGenerator.g:532:1: rule__Task__Group__13__Impl : ( ( rule__Task__DueDateAssignment_13 ) ) ;
    public final void rule__Task__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:536:1: ( ( ( rule__Task__DueDateAssignment_13 ) ) )
            // InternalKPIGenerator.g:537:1: ( ( rule__Task__DueDateAssignment_13 ) )
            {
            // InternalKPIGenerator.g:537:1: ( ( rule__Task__DueDateAssignment_13 ) )
            // InternalKPIGenerator.g:538:2: ( rule__Task__DueDateAssignment_13 )
            {
             before(grammarAccess.getTaskAccess().getDueDateAssignment_13()); 
            // InternalKPIGenerator.g:539:2: ( rule__Task__DueDateAssignment_13 )
            // InternalKPIGenerator.g:539:3: rule__Task__DueDateAssignment_13
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
    // InternalKPIGenerator.g:547:1: rule__Task__Group__14 : rule__Task__Group__14__Impl rule__Task__Group__15 ;
    public final void rule__Task__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:551:1: ( rule__Task__Group__14__Impl rule__Task__Group__15 )
            // InternalKPIGenerator.g:552:2: rule__Task__Group__14__Impl rule__Task__Group__15
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:559:1: rule__Task__Group__14__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:563:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:564:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:564:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:565:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:574:1: rule__Task__Group__15 : rule__Task__Group__15__Impl rule__Task__Group__16 ;
    public final void rule__Task__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:578:1: ( rule__Task__Group__15__Impl rule__Task__Group__16 )
            // InternalKPIGenerator.g:579:2: rule__Task__Group__15__Impl rule__Task__Group__16
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIGenerator.g:586:1: rule__Task__Group__15__Impl : ( ( rule__Task__PriorityAssignment_15 )? ) ;
    public final void rule__Task__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:590:1: ( ( ( rule__Task__PriorityAssignment_15 )? ) )
            // InternalKPIGenerator.g:591:1: ( ( rule__Task__PriorityAssignment_15 )? )
            {
            // InternalKPIGenerator.g:591:1: ( ( rule__Task__PriorityAssignment_15 )? )
            // InternalKPIGenerator.g:592:2: ( rule__Task__PriorityAssignment_15 )?
            {
             before(grammarAccess.getTaskAccess().getPriorityAssignment_15()); 
            // InternalKPIGenerator.g:593:2: ( rule__Task__PriorityAssignment_15 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:593:3: rule__Task__PriorityAssignment_15
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
    // InternalKPIGenerator.g:601:1: rule__Task__Group__16 : rule__Task__Group__16__Impl rule__Task__Group__17 ;
    public final void rule__Task__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:605:1: ( rule__Task__Group__16__Impl rule__Task__Group__17 )
            // InternalKPIGenerator.g:606:2: rule__Task__Group__16__Impl rule__Task__Group__17
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIGenerator.g:613:1: rule__Task__Group__16__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:617:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:618:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:618:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:619:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:628:1: rule__Task__Group__17 : rule__Task__Group__17__Impl rule__Task__Group__18 ;
    public final void rule__Task__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:632:1: ( rule__Task__Group__17__Impl rule__Task__Group__18 )
            // InternalKPIGenerator.g:633:2: rule__Task__Group__17__Impl rule__Task__Group__18
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
    // InternalKPIGenerator.g:640:1: rule__Task__Group__17__Impl : ( ( rule__Task__PrivateAssignment_17 ) ) ;
    public final void rule__Task__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:644:1: ( ( ( rule__Task__PrivateAssignment_17 ) ) )
            // InternalKPIGenerator.g:645:1: ( ( rule__Task__PrivateAssignment_17 ) )
            {
            // InternalKPIGenerator.g:645:1: ( ( rule__Task__PrivateAssignment_17 ) )
            // InternalKPIGenerator.g:646:2: ( rule__Task__PrivateAssignment_17 )
            {
             before(grammarAccess.getTaskAccess().getPrivateAssignment_17()); 
            // InternalKPIGenerator.g:647:2: ( rule__Task__PrivateAssignment_17 )
            // InternalKPIGenerator.g:647:3: rule__Task__PrivateAssignment_17
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
    // InternalKPIGenerator.g:655:1: rule__Task__Group__18 : rule__Task__Group__18__Impl rule__Task__Group__19 ;
    public final void rule__Task__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:659:1: ( rule__Task__Group__18__Impl rule__Task__Group__19 )
            // InternalKPIGenerator.g:660:2: rule__Task__Group__18__Impl rule__Task__Group__19
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
    // InternalKPIGenerator.g:667:1: rule__Task__Group__18__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:671:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:672:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:672:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:673:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:682:1: rule__Task__Group__19 : rule__Task__Group__19__Impl rule__Task__Group__20 ;
    public final void rule__Task__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:686:1: ( rule__Task__Group__19__Impl rule__Task__Group__20 )
            // InternalKPIGenerator.g:687:2: rule__Task__Group__19__Impl rule__Task__Group__20
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
    // InternalKPIGenerator.g:694:1: rule__Task__Group__19__Impl : ( ( rule__Task__ProgressAssignment_19 ) ) ;
    public final void rule__Task__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:698:1: ( ( ( rule__Task__ProgressAssignment_19 ) ) )
            // InternalKPIGenerator.g:699:1: ( ( rule__Task__ProgressAssignment_19 ) )
            {
            // InternalKPIGenerator.g:699:1: ( ( rule__Task__ProgressAssignment_19 ) )
            // InternalKPIGenerator.g:700:2: ( rule__Task__ProgressAssignment_19 )
            {
             before(grammarAccess.getTaskAccess().getProgressAssignment_19()); 
            // InternalKPIGenerator.g:701:2: ( rule__Task__ProgressAssignment_19 )
            // InternalKPIGenerator.g:701:3: rule__Task__ProgressAssignment_19
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
    // InternalKPIGenerator.g:709:1: rule__Task__Group__20 : rule__Task__Group__20__Impl rule__Task__Group__21 ;
    public final void rule__Task__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:713:1: ( rule__Task__Group__20__Impl rule__Task__Group__21 )
            // InternalKPIGenerator.g:714:2: rule__Task__Group__20__Impl rule__Task__Group__21
            {
            pushFollow(FOLLOW_10);
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
    // InternalKPIGenerator.g:721:1: rule__Task__Group__20__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:725:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:726:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:726:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:727:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:736:1: rule__Task__Group__21 : rule__Task__Group__21__Impl rule__Task__Group__22 ;
    public final void rule__Task__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:740:1: ( rule__Task__Group__21__Impl rule__Task__Group__22 )
            // InternalKPIGenerator.g:741:2: rule__Task__Group__21__Impl rule__Task__Group__22
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
    // InternalKPIGenerator.g:748:1: rule__Task__Group__21__Impl : ( ( rule__Task__TaskAssignment_21 ) ) ;
    public final void rule__Task__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:752:1: ( ( ( rule__Task__TaskAssignment_21 ) ) )
            // InternalKPIGenerator.g:753:1: ( ( rule__Task__TaskAssignment_21 ) )
            {
            // InternalKPIGenerator.g:753:1: ( ( rule__Task__TaskAssignment_21 ) )
            // InternalKPIGenerator.g:754:2: ( rule__Task__TaskAssignment_21 )
            {
             before(grammarAccess.getTaskAccess().getTaskAssignment_21()); 
            // InternalKPIGenerator.g:755:2: ( rule__Task__TaskAssignment_21 )
            // InternalKPIGenerator.g:755:3: rule__Task__TaskAssignment_21
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
    // InternalKPIGenerator.g:763:1: rule__Task__Group__22 : rule__Task__Group__22__Impl rule__Task__Group__23 ;
    public final void rule__Task__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:767:1: ( rule__Task__Group__22__Impl rule__Task__Group__23 )
            // InternalKPIGenerator.g:768:2: rule__Task__Group__22__Impl rule__Task__Group__23
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
    // InternalKPIGenerator.g:775:1: rule__Task__Group__22__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:779:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:780:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:780:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:781:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:790:1: rule__Task__Group__23 : rule__Task__Group__23__Impl rule__Task__Group__24 ;
    public final void rule__Task__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:794:1: ( rule__Task__Group__23__Impl rule__Task__Group__24 )
            // InternalKPIGenerator.g:795:2: rule__Task__Group__23__Impl rule__Task__Group__24
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
    // InternalKPIGenerator.g:802:1: rule__Task__Group__23__Impl : ( ( rule__Task__AssignedToAssignment_23 ) ) ;
    public final void rule__Task__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:806:1: ( ( ( rule__Task__AssignedToAssignment_23 ) ) )
            // InternalKPIGenerator.g:807:1: ( ( rule__Task__AssignedToAssignment_23 ) )
            {
            // InternalKPIGenerator.g:807:1: ( ( rule__Task__AssignedToAssignment_23 ) )
            // InternalKPIGenerator.g:808:2: ( rule__Task__AssignedToAssignment_23 )
            {
             before(grammarAccess.getTaskAccess().getAssignedToAssignment_23()); 
            // InternalKPIGenerator.g:809:2: ( rule__Task__AssignedToAssignment_23 )
            // InternalKPIGenerator.g:809:3: rule__Task__AssignedToAssignment_23
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
    // InternalKPIGenerator.g:817:1: rule__Task__Group__24 : rule__Task__Group__24__Impl rule__Task__Group__25 ;
    public final void rule__Task__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:821:1: ( rule__Task__Group__24__Impl rule__Task__Group__25 )
            // InternalKPIGenerator.g:822:2: rule__Task__Group__24__Impl rule__Task__Group__25
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:829:1: rule__Task__Group__24__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:833:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:834:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:834:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:835:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:844:1: rule__Task__Group__25 : rule__Task__Group__25__Impl rule__Task__Group__26 ;
    public final void rule__Task__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:848:1: ( rule__Task__Group__25__Impl rule__Task__Group__26 )
            // InternalKPIGenerator.g:849:2: rule__Task__Group__25__Impl rule__Task__Group__26
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
    // InternalKPIGenerator.g:856:1: rule__Task__Group__25__Impl : ( ( rule__Task__CreatedDateAssignment_25 ) ) ;
    public final void rule__Task__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:860:1: ( ( ( rule__Task__CreatedDateAssignment_25 ) ) )
            // InternalKPIGenerator.g:861:1: ( ( rule__Task__CreatedDateAssignment_25 ) )
            {
            // InternalKPIGenerator.g:861:1: ( ( rule__Task__CreatedDateAssignment_25 ) )
            // InternalKPIGenerator.g:862:2: ( rule__Task__CreatedDateAssignment_25 )
            {
             before(grammarAccess.getTaskAccess().getCreatedDateAssignment_25()); 
            // InternalKPIGenerator.g:863:2: ( rule__Task__CreatedDateAssignment_25 )
            // InternalKPIGenerator.g:863:3: rule__Task__CreatedDateAssignment_25
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
    // InternalKPIGenerator.g:871:1: rule__Task__Group__26 : rule__Task__Group__26__Impl rule__Task__Group__27 ;
    public final void rule__Task__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:875:1: ( rule__Task__Group__26__Impl rule__Task__Group__27 )
            // InternalKPIGenerator.g:876:2: rule__Task__Group__26__Impl rule__Task__Group__27
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
    // InternalKPIGenerator.g:883:1: rule__Task__Group__26__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:887:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:888:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:888:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:889:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:898:1: rule__Task__Group__27 : rule__Task__Group__27__Impl rule__Task__Group__28 ;
    public final void rule__Task__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:902:1: ( rule__Task__Group__27__Impl rule__Task__Group__28 )
            // InternalKPIGenerator.g:903:2: rule__Task__Group__27__Impl rule__Task__Group__28
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
    // InternalKPIGenerator.g:910:1: rule__Task__Group__27__Impl : ( RULE_CADENA ) ;
    public final void rule__Task__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:914:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:915:1: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:915:1: ( RULE_CADENA )
            // InternalKPIGenerator.g:916:2: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_27()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_27()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:925:1: rule__Task__Group__28 : rule__Task__Group__28__Impl rule__Task__Group__29 ;
    public final void rule__Task__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:929:1: ( rule__Task__Group__28__Impl rule__Task__Group__29 )
            // InternalKPIGenerator.g:930:2: rule__Task__Group__28__Impl rule__Task__Group__29
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:937:1: rule__Task__Group__28__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:941:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:942:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:942:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:943:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:952:1: rule__Task__Group__29 : rule__Task__Group__29__Impl rule__Task__Group__30 ;
    public final void rule__Task__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:956:1: ( rule__Task__Group__29__Impl rule__Task__Group__30 )
            // InternalKPIGenerator.g:957:2: rule__Task__Group__29__Impl rule__Task__Group__30
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:964:1: rule__Task__Group__29__Impl : ( RULE_CADENA ) ;
    public final void rule__Task__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:968:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:969:1: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:969:1: ( RULE_CADENA )
            // InternalKPIGenerator.g:970:2: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_29()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_29()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:979:1: rule__Task__Group__30 : rule__Task__Group__30__Impl rule__Task__Group__31 ;
    public final void rule__Task__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:983:1: ( rule__Task__Group__30__Impl rule__Task__Group__31 )
            // InternalKPIGenerator.g:984:2: rule__Task__Group__30__Impl rule__Task__Group__31
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIGenerator.g:991:1: rule__Task__Group__30__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:995:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:996:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:996:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:997:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1006:1: rule__Task__Group__31 : rule__Task__Group__31__Impl rule__Task__Group__32 ;
    public final void rule__Task__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1010:1: ( rule__Task__Group__31__Impl rule__Task__Group__32 )
            // InternalKPIGenerator.g:1011:2: rule__Task__Group__31__Impl rule__Task__Group__32
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:1018:1: rule__Task__Group__31__Impl : ( ( rule__Task__CompletedDateAssignment_31 ) ) ;
    public final void rule__Task__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1022:1: ( ( ( rule__Task__CompletedDateAssignment_31 ) ) )
            // InternalKPIGenerator.g:1023:1: ( ( rule__Task__CompletedDateAssignment_31 ) )
            {
            // InternalKPIGenerator.g:1023:1: ( ( rule__Task__CompletedDateAssignment_31 ) )
            // InternalKPIGenerator.g:1024:2: ( rule__Task__CompletedDateAssignment_31 )
            {
             before(grammarAccess.getTaskAccess().getCompletedDateAssignment_31()); 
            // InternalKPIGenerator.g:1025:2: ( rule__Task__CompletedDateAssignment_31 )
            // InternalKPIGenerator.g:1025:3: rule__Task__CompletedDateAssignment_31
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedDateAssignment_31();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedDateAssignment_31()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1033:1: rule__Task__Group__32 : rule__Task__Group__32__Impl rule__Task__Group__33 ;
    public final void rule__Task__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1037:1: ( rule__Task__Group__32__Impl rule__Task__Group__33 )
            // InternalKPIGenerator.g:1038:2: rule__Task__Group__32__Impl rule__Task__Group__33
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIGenerator.g:1045:1: rule__Task__Group__32__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1049:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1050:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1050:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1051:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1060:1: rule__Task__Group__33 : rule__Task__Group__33__Impl rule__Task__Group__34 ;
    public final void rule__Task__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1064:1: ( rule__Task__Group__33__Impl rule__Task__Group__34 )
            // InternalKPIGenerator.g:1065:2: rule__Task__Group__33__Impl rule__Task__Group__34
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
    // InternalKPIGenerator.g:1072:1: rule__Task__Group__33__Impl : ( RULE_CADENA ) ;
    public final void rule__Task__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1076:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1077:1: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1077:1: ( RULE_CADENA )
            // InternalKPIGenerator.g:1078:2: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_33()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCADENATerminalRuleCall_33()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1087:1: rule__Task__Group__34 : rule__Task__Group__34__Impl rule__Task__Group__35 ;
    public final void rule__Task__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1091:1: ( rule__Task__Group__34__Impl rule__Task__Group__35 )
            // InternalKPIGenerator.g:1092:2: rule__Task__Group__34__Impl rule__Task__Group__35
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
    // InternalKPIGenerator.g:1099:1: rule__Task__Group__34__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1103:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1104:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1104:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1105:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1114:1: rule__Task__Group__35 : rule__Task__Group__35__Impl rule__Task__Group__36 ;
    public final void rule__Task__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1118:1: ( rule__Task__Group__35__Impl rule__Task__Group__36 )
            // InternalKPIGenerator.g:1119:2: rule__Task__Group__35__Impl rule__Task__Group__36
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
    // InternalKPIGenerator.g:1126:1: rule__Task__Group__35__Impl : ( RULE_CADENA ) ;
    public final void rule__Task__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1130:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1131:1: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1131:1: ( RULE_CADENA )
            // InternalKPIGenerator.g:1132:2: RULE_CADENA
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
    // InternalKPIGenerator.g:1141:1: rule__Task__Group__36 : rule__Task__Group__36__Impl rule__Task__Group__37 ;
    public final void rule__Task__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1145:1: ( rule__Task__Group__36__Impl rule__Task__Group__37 )
            // InternalKPIGenerator.g:1146:2: rule__Task__Group__36__Impl rule__Task__Group__37
            {
            pushFollow(FOLLOW_12);
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
    // InternalKPIGenerator.g:1153:1: rule__Task__Group__36__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1157:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1158:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1158:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1159:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1168:1: rule__Task__Group__37 : rule__Task__Group__37__Impl rule__Task__Group__38 ;
    public final void rule__Task__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1172:1: ( rule__Task__Group__37__Impl rule__Task__Group__38 )
            // InternalKPIGenerator.g:1173:2: rule__Task__Group__37__Impl rule__Task__Group__38
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
    // InternalKPIGenerator.g:1180:1: rule__Task__Group__37__Impl : ( ( rule__Task__TimeLoggedAssignment_37 )? ) ;
    public final void rule__Task__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1184:1: ( ( ( rule__Task__TimeLoggedAssignment_37 )? ) )
            // InternalKPIGenerator.g:1185:1: ( ( rule__Task__TimeLoggedAssignment_37 )? )
            {
            // InternalKPIGenerator.g:1185:1: ( ( rule__Task__TimeLoggedAssignment_37 )? )
            // InternalKPIGenerator.g:1186:2: ( rule__Task__TimeLoggedAssignment_37 )?
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedAssignment_37()); 
            // InternalKPIGenerator.g:1187:2: ( rule__Task__TimeLoggedAssignment_37 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:1187:3: rule__Task__TimeLoggedAssignment_37
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__TimeLoggedAssignment_37();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getTimeLoggedAssignment_37()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1195:1: rule__Task__Group__38 : rule__Task__Group__38__Impl rule__Task__Group__39 ;
    public final void rule__Task__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1199:1: ( rule__Task__Group__38__Impl rule__Task__Group__39 )
            // InternalKPIGenerator.g:1200:2: rule__Task__Group__38__Impl rule__Task__Group__39
            {
            pushFollow(FOLLOW_12);
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
    // InternalKPIGenerator.g:1207:1: rule__Task__Group__38__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1211:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1212:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1212:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1213:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1222:1: rule__Task__Group__39 : rule__Task__Group__39__Impl rule__Task__Group__40 ;
    public final void rule__Task__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1226:1: ( rule__Task__Group__39__Impl rule__Task__Group__40 )
            // InternalKPIGenerator.g:1227:2: rule__Task__Group__39__Impl rule__Task__Group__40
            {
            pushFollow(FOLLOW_12);
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
    // InternalKPIGenerator.g:1234:1: rule__Task__Group__39__Impl : ( ( rule__Task__BillableMinutesAssignment_39 )? ) ;
    public final void rule__Task__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1238:1: ( ( ( rule__Task__BillableMinutesAssignment_39 )? ) )
            // InternalKPIGenerator.g:1239:1: ( ( rule__Task__BillableMinutesAssignment_39 )? )
            {
            // InternalKPIGenerator.g:1239:1: ( ( rule__Task__BillableMinutesAssignment_39 )? )
            // InternalKPIGenerator.g:1240:2: ( rule__Task__BillableMinutesAssignment_39 )?
            {
             before(grammarAccess.getTaskAccess().getBillableMinutesAssignment_39()); 
            // InternalKPIGenerator.g:1241:2: ( rule__Task__BillableMinutesAssignment_39 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:1241:3: rule__Task__BillableMinutesAssignment_39
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__BillableMinutesAssignment_39();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getBillableMinutesAssignment_39()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1249:1: rule__Task__Group__40 : rule__Task__Group__40__Impl rule__Task__Group__41 ;
    public final void rule__Task__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1253:1: ( rule__Task__Group__40__Impl rule__Task__Group__41 )
            // InternalKPIGenerator.g:1254:2: rule__Task__Group__40__Impl rule__Task__Group__41
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIGenerator.g:1261:1: rule__Task__Group__40__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1265:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1266:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1266:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1267:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1276:1: rule__Task__Group__41 : rule__Task__Group__41__Impl rule__Task__Group__42 ;
    public final void rule__Task__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1280:1: ( rule__Task__Group__41__Impl rule__Task__Group__42 )
            // InternalKPIGenerator.g:1281:2: rule__Task__Group__41__Impl rule__Task__Group__42
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
    // InternalKPIGenerator.g:1288:1: rule__Task__Group__41__Impl : ( ( rule__Task__ParentTaskAssignment_41 )? ) ;
    public final void rule__Task__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1292:1: ( ( ( rule__Task__ParentTaskAssignment_41 )? ) )
            // InternalKPIGenerator.g:1293:1: ( ( rule__Task__ParentTaskAssignment_41 )? )
            {
            // InternalKPIGenerator.g:1293:1: ( ( rule__Task__ParentTaskAssignment_41 )? )
            // InternalKPIGenerator.g:1294:2: ( rule__Task__ParentTaskAssignment_41 )?
            {
             before(grammarAccess.getTaskAccess().getParentTaskAssignment_41()); 
            // InternalKPIGenerator.g:1295:2: ( rule__Task__ParentTaskAssignment_41 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKPIGenerator.g:1295:3: rule__Task__ParentTaskAssignment_41
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__ParentTaskAssignment_41();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getParentTaskAssignment_41()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1303:1: rule__Task__Group__42 : rule__Task__Group__42__Impl rule__Task__Group__43 ;
    public final void rule__Task__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1307:1: ( rule__Task__Group__42__Impl rule__Task__Group__43 )
            // InternalKPIGenerator.g:1308:2: rule__Task__Group__42__Impl rule__Task__Group__43
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIGenerator.g:1315:1: rule__Task__Group__42__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1319:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1320:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1320:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1321:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1330:1: rule__Task__Group__43 : rule__Task__Group__43__Impl rule__Task__Group__44 ;
    public final void rule__Task__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1334:1: ( rule__Task__Group__43__Impl rule__Task__Group__44 )
            // InternalKPIGenerator.g:1335:2: rule__Task__Group__43__Impl rule__Task__Group__44
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIGenerator.g:1342:1: rule__Task__Group__43__Impl : ( ( rule__Task__CompletedOnTimeAssignment_43 ) ) ;
    public final void rule__Task__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1346:1: ( ( ( rule__Task__CompletedOnTimeAssignment_43 ) ) )
            // InternalKPIGenerator.g:1347:1: ( ( rule__Task__CompletedOnTimeAssignment_43 ) )
            {
            // InternalKPIGenerator.g:1347:1: ( ( rule__Task__CompletedOnTimeAssignment_43 ) )
            // InternalKPIGenerator.g:1348:2: ( rule__Task__CompletedOnTimeAssignment_43 )
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_43()); 
            // InternalKPIGenerator.g:1349:2: ( rule__Task__CompletedOnTimeAssignment_43 )
            // InternalKPIGenerator.g:1349:3: rule__Task__CompletedOnTimeAssignment_43
            {
            pushFollow(FOLLOW_2);
            rule__Task__CompletedOnTimeAssignment_43();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_43()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1357:1: rule__Task__Group__44 : rule__Task__Group__44__Impl rule__Task__Group__45 ;
    public final void rule__Task__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1361:1: ( rule__Task__Group__44__Impl rule__Task__Group__45 )
            // InternalKPIGenerator.g:1362:2: rule__Task__Group__44__Impl rule__Task__Group__45
            {
            pushFollow(FOLLOW_3);
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
    // InternalKPIGenerator.g:1369:1: rule__Task__Group__44__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1373:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1374:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1374:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1375:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1384:1: rule__Task__Group__45 : rule__Task__Group__45__Impl rule__Task__Group__46 ;
    public final void rule__Task__Group__45() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1388:1: ( rule__Task__Group__45__Impl rule__Task__Group__46 )
            // InternalKPIGenerator.g:1389:2: rule__Task__Group__45__Impl rule__Task__Group__46
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
    // InternalKPIGenerator.g:1396:1: rule__Task__Group__45__Impl : ( ( rule__Task__TimeEstimatedAssignment_45 ) ) ;
    public final void rule__Task__Group__45__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1400:1: ( ( ( rule__Task__TimeEstimatedAssignment_45 ) ) )
            // InternalKPIGenerator.g:1401:1: ( ( rule__Task__TimeEstimatedAssignment_45 ) )
            {
            // InternalKPIGenerator.g:1401:1: ( ( rule__Task__TimeEstimatedAssignment_45 ) )
            // InternalKPIGenerator.g:1402:2: ( rule__Task__TimeEstimatedAssignment_45 )
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_45()); 
            // InternalKPIGenerator.g:1403:2: ( rule__Task__TimeEstimatedAssignment_45 )
            // InternalKPIGenerator.g:1403:3: rule__Task__TimeEstimatedAssignment_45
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeEstimatedAssignment_45();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_45()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1411:1: rule__Task__Group__46 : rule__Task__Group__46__Impl rule__Task__Group__47 ;
    public final void rule__Task__Group__46() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1415:1: ( rule__Task__Group__46__Impl rule__Task__Group__47 )
            // InternalKPIGenerator.g:1416:2: rule__Task__Group__46__Impl rule__Task__Group__47
            {
            pushFollow(FOLLOW_14);
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
    // InternalKPIGenerator.g:1423:1: rule__Task__Group__46__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Task__Group__46__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1427:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1428:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1428:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1429:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1438:1: rule__Task__Group__47 : rule__Task__Group__47__Impl rule__Task__Group__48 ;
    public final void rule__Task__Group__47() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1442:1: ( rule__Task__Group__47__Impl rule__Task__Group__48 )
            // InternalKPIGenerator.g:1443:2: rule__Task__Group__47__Impl rule__Task__Group__48
            {
            pushFollow(FOLLOW_14);
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
    // InternalKPIGenerator.g:1450:1: rule__Task__Group__47__Impl : ( ( rule__Task__TagsAssignment_47 )? ) ;
    public final void rule__Task__Group__47__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1454:1: ( ( ( rule__Task__TagsAssignment_47 )? ) )
            // InternalKPIGenerator.g:1455:1: ( ( rule__Task__TagsAssignment_47 )? )
            {
            // InternalKPIGenerator.g:1455:1: ( ( rule__Task__TagsAssignment_47 )? )
            // InternalKPIGenerator.g:1456:2: ( rule__Task__TagsAssignment_47 )?
            {
             before(grammarAccess.getTaskAccess().getTagsAssignment_47()); 
            // InternalKPIGenerator.g:1457:2: ( rule__Task__TagsAssignment_47 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CADENA) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKPIGenerator.g:1457:3: rule__Task__TagsAssignment_47
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__TagsAssignment_47();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getTagsAssignment_47()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1465:1: rule__Task__Group__48 : rule__Task__Group__48__Impl ;
    public final void rule__Task__Group__48() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1469:1: ( rule__Task__Group__48__Impl )
            // InternalKPIGenerator.g:1470:2: rule__Task__Group__48__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__48__Impl();

            state._fsp--;


            }

        }
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
    // InternalKPIGenerator.g:1476:1: rule__Task__Group__48__Impl : ( RULE_NEWLINE ) ;
    public final void rule__Task__Group__48__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1480:1: ( ( RULE_NEWLINE ) )
            // InternalKPIGenerator.g:1481:1: ( RULE_NEWLINE )
            {
            // InternalKPIGenerator.g:1481:1: ( RULE_NEWLINE )
            // InternalKPIGenerator.g:1482:2: RULE_NEWLINE
            {
             before(grammarAccess.getTaskAccess().getNEWLINETerminalRuleCall_48()); 
            match(input,RULE_NEWLINE,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNEWLINETerminalRuleCall_48()); 

            }


            }

        }
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


    // $ANTLR start "rule__Status__Group__0"
    // InternalKPIGenerator.g:1492:1: rule__Status__Group__0 : rule__Status__Group__0__Impl rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1496:1: ( rule__Status__Group__0__Impl rule__Status__Group__1 )
            // InternalKPIGenerator.g:1497:2: rule__Status__Group__0__Impl rule__Status__Group__1
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
    // InternalKPIGenerator.g:1504:1: rule__Status__Group__0__Impl : ( ( rule__Status__StatusNameAssignment_0 ) ) ;
    public final void rule__Status__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1508:1: ( ( ( rule__Status__StatusNameAssignment_0 ) ) )
            // InternalKPIGenerator.g:1509:1: ( ( rule__Status__StatusNameAssignment_0 ) )
            {
            // InternalKPIGenerator.g:1509:1: ( ( rule__Status__StatusNameAssignment_0 ) )
            // InternalKPIGenerator.g:1510:2: ( rule__Status__StatusNameAssignment_0 )
            {
             before(grammarAccess.getStatusAccess().getStatusNameAssignment_0()); 
            // InternalKPIGenerator.g:1511:2: ( rule__Status__StatusNameAssignment_0 )
            // InternalKPIGenerator.g:1511:3: rule__Status__StatusNameAssignment_0
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
    // InternalKPIGenerator.g:1519:1: rule__Status__Group__1 : rule__Status__Group__1__Impl rule__Status__Group__2 ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1523:1: ( rule__Status__Group__1__Impl rule__Status__Group__2 )
            // InternalKPIGenerator.g:1524:2: rule__Status__Group__1__Impl rule__Status__Group__2
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
    // InternalKPIGenerator.g:1531:1: rule__Status__Group__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Status__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1535:1: ( ( RULE_SEMICOLON ) )
            // InternalKPIGenerator.g:1536:1: ( RULE_SEMICOLON )
            {
            // InternalKPIGenerator.g:1536:1: ( RULE_SEMICOLON )
            // InternalKPIGenerator.g:1537:2: RULE_SEMICOLON
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
    // InternalKPIGenerator.g:1546:1: rule__Status__Group__2 : rule__Status__Group__2__Impl ;
    public final void rule__Status__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1550:1: ( rule__Status__Group__2__Impl )
            // InternalKPIGenerator.g:1551:2: rule__Status__Group__2__Impl
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
    // InternalKPIGenerator.g:1557:1: rule__Status__Group__2__Impl : ( ( rule__Status__TextAssignment_2 ) ) ;
    public final void rule__Status__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1561:1: ( ( ( rule__Status__TextAssignment_2 ) ) )
            // InternalKPIGenerator.g:1562:1: ( ( rule__Status__TextAssignment_2 ) )
            {
            // InternalKPIGenerator.g:1562:1: ( ( rule__Status__TextAssignment_2 ) )
            // InternalKPIGenerator.g:1563:2: ( rule__Status__TextAssignment_2 )
            {
             before(grammarAccess.getStatusAccess().getTextAssignment_2()); 
            // InternalKPIGenerator.g:1564:2: ( rule__Status__TextAssignment_2 )
            // InternalKPIGenerator.g:1564:3: rule__Status__TextAssignment_2
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
    // InternalKPIGenerator.g:1573:1: rule__BOOL__Group__0 : rule__BOOL__Group__0__Impl rule__BOOL__Group__1 ;
    public final void rule__BOOL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1577:1: ( rule__BOOL__Group__0__Impl rule__BOOL__Group__1 )
            // InternalKPIGenerator.g:1578:2: rule__BOOL__Group__0__Impl rule__BOOL__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIGenerator.g:1585:1: rule__BOOL__Group__0__Impl : ( () ) ;
    public final void rule__BOOL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1589:1: ( ( () ) )
            // InternalKPIGenerator.g:1590:1: ( () )
            {
            // InternalKPIGenerator.g:1590:1: ( () )
            // InternalKPIGenerator.g:1591:2: ()
            {
             before(grammarAccess.getBOOLAccess().getBOOLAction_0()); 
            // InternalKPIGenerator.g:1592:2: ()
            // InternalKPIGenerator.g:1592:3: 
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
    // InternalKPIGenerator.g:1600:1: rule__BOOL__Group__1 : rule__BOOL__Group__1__Impl ;
    public final void rule__BOOL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1604:1: ( rule__BOOL__Group__1__Impl )
            // InternalKPIGenerator.g:1605:2: rule__BOOL__Group__1__Impl
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
    // InternalKPIGenerator.g:1611:1: rule__BOOL__Group__1__Impl : ( ( rule__BOOL__Alternatives_1 ) ) ;
    public final void rule__BOOL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1615:1: ( ( ( rule__BOOL__Alternatives_1 ) ) )
            // InternalKPIGenerator.g:1616:1: ( ( rule__BOOL__Alternatives_1 ) )
            {
            // InternalKPIGenerator.g:1616:1: ( ( rule__BOOL__Alternatives_1 ) )
            // InternalKPIGenerator.g:1617:2: ( rule__BOOL__Alternatives_1 )
            {
             before(grammarAccess.getBOOLAccess().getAlternatives_1()); 
            // InternalKPIGenerator.g:1618:2: ( rule__BOOL__Alternatives_1 )
            // InternalKPIGenerator.g:1618:3: rule__BOOL__Alternatives_1
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


    // $ANTLR start "rule__Task__IdAssignment_1"
    // InternalKPIGenerator.g:1627:1: rule__Task__IdAssignment_1 : ( RULE_INT ) ;
    public final void rule__Task__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1631:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1632:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1632:2: ( RULE_INT )
            // InternalKPIGenerator.g:1633:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getIdINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIdINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__IdAssignment_1"


    // $ANTLR start "rule__Task__ProjectAssignment_3"
    // InternalKPIGenerator.g:1642:1: rule__Task__ProjectAssignment_3 : ( RULE_CADENA ) ;
    public final void rule__Task__ProjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1646:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1647:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1647:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1648:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getProjectCADENATerminalRuleCall_3_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getProjectCADENATerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1657:1: rule__Task__MilestoneAssignment_5 : ( RULE_CADENA ) ;
    public final void rule__Task__MilestoneAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1661:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1662:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1662:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1663:3: RULE_CADENA
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
    // InternalKPIGenerator.g:1672:1: rule__Task__NameAssignment_7 : ( RULE_CADENA ) ;
    public final void rule__Task__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1676:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1677:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1677:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1678:3: RULE_CADENA
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
    // InternalKPIGenerator.g:1687:1: rule__Task__TaskDescriptionAssignment_9 : ( RULE_CADENA ) ;
    public final void rule__Task__TaskDescriptionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1691:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1692:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1692:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1693:3: RULE_CADENA
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
    // InternalKPIGenerator.g:1702:1: rule__Task__StartDateAssignment_11 : ( RULE_DATE ) ;
    public final void rule__Task__StartDateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1706:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:1707:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:1707:2: ( RULE_DATE )
            // InternalKPIGenerator.g:1708:3: RULE_DATE
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
    // InternalKPIGenerator.g:1717:1: rule__Task__DueDateAssignment_13 : ( RULE_DATE ) ;
    public final void rule__Task__DueDateAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1721:1: ( ( RULE_DATE ) )
            // InternalKPIGenerator.g:1722:2: ( RULE_DATE )
            {
            // InternalKPIGenerator.g:1722:2: ( RULE_DATE )
            // InternalKPIGenerator.g:1723:3: RULE_DATE
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
    // InternalKPIGenerator.g:1732:1: rule__Task__PriorityAssignment_15 : ( RULE_STRING ) ;
    public final void rule__Task__PriorityAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1736:1: ( ( RULE_STRING ) )
            // InternalKPIGenerator.g:1737:2: ( RULE_STRING )
            {
            // InternalKPIGenerator.g:1737:2: ( RULE_STRING )
            // InternalKPIGenerator.g:1738:3: RULE_STRING
            {
             before(grammarAccess.getTaskAccess().getPrioritySTRINGTerminalRuleCall_15_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPrioritySTRINGTerminalRuleCall_15_0()); 

            }


            }

        }
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
    // InternalKPIGenerator.g:1747:1: rule__Task__PrivateAssignment_17 : ( ruleBOOL ) ;
    public final void rule__Task__PrivateAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1751:1: ( ( ruleBOOL ) )
            // InternalKPIGenerator.g:1752:2: ( ruleBOOL )
            {
            // InternalKPIGenerator.g:1752:2: ( ruleBOOL )
            // InternalKPIGenerator.g:1753:3: ruleBOOL
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
    // InternalKPIGenerator.g:1762:1: rule__Task__ProgressAssignment_19 : ( RULE_INT ) ;
    public final void rule__Task__ProgressAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1766:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1767:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1767:2: ( RULE_INT )
            // InternalKPIGenerator.g:1768:3: RULE_INT
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
    // InternalKPIGenerator.g:1777:1: rule__Task__TaskAssignment_21 : ( ruleStatus ) ;
    public final void rule__Task__TaskAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1781:1: ( ( ruleStatus ) )
            // InternalKPIGenerator.g:1782:2: ( ruleStatus )
            {
            // InternalKPIGenerator.g:1782:2: ( ruleStatus )
            // InternalKPIGenerator.g:1783:3: ruleStatus
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
    // InternalKPIGenerator.g:1792:1: rule__Task__AssignedToAssignment_23 : ( RULE_CADENA ) ;
    public final void rule__Task__AssignedToAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1796:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1797:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1797:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1798:3: RULE_CADENA
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
    // InternalKPIGenerator.g:1807:1: rule__Task__CreatedDateAssignment_25 : ( RULE_DATEHOUR ) ;
    public final void rule__Task__CreatedDateAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1811:1: ( ( RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:1812:2: ( RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:1812:2: ( RULE_DATEHOUR )
            // InternalKPIGenerator.g:1813:3: RULE_DATEHOUR
            {
             before(grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_25_0()); 
            match(input,RULE_DATEHOUR,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_25_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Task__CompletedDateAssignment_31"
    // InternalKPIGenerator.g:1822:1: rule__Task__CompletedDateAssignment_31 : ( RULE_DATEHOUR ) ;
    public final void rule__Task__CompletedDateAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1826:1: ( ( RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:1827:2: ( RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:1827:2: ( RULE_DATEHOUR )
            // InternalKPIGenerator.g:1828:3: RULE_DATEHOUR
            {
             before(grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_31_0()); 
            match(input,RULE_DATEHOUR,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_31_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedDateAssignment_31"


    // $ANTLR start "rule__Task__TimeLoggedAssignment_37"
    // InternalKPIGenerator.g:1837:1: rule__Task__TimeLoggedAssignment_37 : ( RULE_INT ) ;
    public final void rule__Task__TimeLoggedAssignment_37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1841:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1842:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1842:2: ( RULE_INT )
            // InternalKPIGenerator.g:1843:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeLoggedINTTerminalRuleCall_37_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeLoggedINTTerminalRuleCall_37_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeLoggedAssignment_37"


    // $ANTLR start "rule__Task__BillableMinutesAssignment_39"
    // InternalKPIGenerator.g:1852:1: rule__Task__BillableMinutesAssignment_39 : ( RULE_INT ) ;
    public final void rule__Task__BillableMinutesAssignment_39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1856:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1857:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1857:2: ( RULE_INT )
            // InternalKPIGenerator.g:1858:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getBillableMinutesINTTerminalRuleCall_39_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getBillableMinutesINTTerminalRuleCall_39_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__BillableMinutesAssignment_39"


    // $ANTLR start "rule__Task__ParentTaskAssignment_41"
    // InternalKPIGenerator.g:1867:1: rule__Task__ParentTaskAssignment_41 : ( ( RULE_ID ) ) ;
    public final void rule__Task__ParentTaskAssignment_41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1871:1: ( ( ( RULE_ID ) ) )
            // InternalKPIGenerator.g:1872:2: ( ( RULE_ID ) )
            {
            // InternalKPIGenerator.g:1872:2: ( ( RULE_ID ) )
            // InternalKPIGenerator.g:1873:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getParentTaskTaskCrossReference_41_0()); 
            // InternalKPIGenerator.g:1874:3: ( RULE_ID )
            // InternalKPIGenerator.g:1875:4: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getParentTaskTaskIDTerminalRuleCall_41_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getParentTaskTaskIDTerminalRuleCall_41_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getParentTaskTaskCrossReference_41_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ParentTaskAssignment_41"


    // $ANTLR start "rule__Task__CompletedOnTimeAssignment_43"
    // InternalKPIGenerator.g:1886:1: rule__Task__CompletedOnTimeAssignment_43 : ( ruleBOOL ) ;
    public final void rule__Task__CompletedOnTimeAssignment_43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1890:1: ( ( ruleBOOL ) )
            // InternalKPIGenerator.g:1891:2: ( ruleBOOL )
            {
            // InternalKPIGenerator.g:1891:2: ( ruleBOOL )
            // InternalKPIGenerator.g:1892:3: ruleBOOL
            {
             before(grammarAccess.getTaskAccess().getCompletedOnTimeBOOLParserRuleCall_43_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getCompletedOnTimeBOOLParserRuleCall_43_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__CompletedOnTimeAssignment_43"


    // $ANTLR start "rule__Task__TimeEstimatedAssignment_45"
    // InternalKPIGenerator.g:1901:1: rule__Task__TimeEstimatedAssignment_45 : ( RULE_INT ) ;
    public final void rule__Task__TimeEstimatedAssignment_45() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1905:1: ( ( RULE_INT ) )
            // InternalKPIGenerator.g:1906:2: ( RULE_INT )
            {
            // InternalKPIGenerator.g:1906:2: ( RULE_INT )
            // InternalKPIGenerator.g:1907:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_45_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_45_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeEstimatedAssignment_45"


    // $ANTLR start "rule__Task__TagsAssignment_47"
    // InternalKPIGenerator.g:1916:1: rule__Task__TagsAssignment_47 : ( RULE_CADENA ) ;
    public final void rule__Task__TagsAssignment_47() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1920:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1921:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1921:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1922:3: RULE_CADENA
            {
             before(grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_47_0()); 
            match(input,RULE_CADENA,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_47_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TagsAssignment_47"


    // $ANTLR start "rule__Status__StatusNameAssignment_0"
    // InternalKPIGenerator.g:1931:1: rule__Status__StatusNameAssignment_0 : ( ( rule__Status__StatusNameAlternatives_0_0 ) ) ;
    public final void rule__Status__StatusNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1935:1: ( ( ( rule__Status__StatusNameAlternatives_0_0 ) ) )
            // InternalKPIGenerator.g:1936:2: ( ( rule__Status__StatusNameAlternatives_0_0 ) )
            {
            // InternalKPIGenerator.g:1936:2: ( ( rule__Status__StatusNameAlternatives_0_0 ) )
            // InternalKPIGenerator.g:1937:3: ( rule__Status__StatusNameAlternatives_0_0 )
            {
             before(grammarAccess.getStatusAccess().getStatusNameAlternatives_0_0()); 
            // InternalKPIGenerator.g:1938:3: ( rule__Status__StatusNameAlternatives_0_0 )
            // InternalKPIGenerator.g:1938:4: rule__Status__StatusNameAlternatives_0_0
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
    // InternalKPIGenerator.g:1946:1: rule__Status__TextAssignment_2 : ( RULE_CADENA ) ;
    public final void rule__Status__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIGenerator.g:1950:1: ( ( RULE_CADENA ) )
            // InternalKPIGenerator.g:1951:2: ( RULE_CADENA )
            {
            // InternalKPIGenerator.g:1951:2: ( RULE_CADENA )
            // InternalKPIGenerator.g:1952:3: RULE_CADENA
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});

}