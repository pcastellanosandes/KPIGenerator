package co.edu.uniandes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.services.KPIGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKPIGeneratorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CADENA", "RULE_INT", "RULE_DATE", "RULE_DATEHOUR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'{'", "'\"name\":\"'", "'\",\"phases\":['", "'}'", "','", "'\",\"tasks\":['", "'\"id\":'", "'\",'", "'\"useCase\":\"'", "'\"sequenceNumber\":'", "'.'", "'\"description\":\"'", "'\"\"'", "'\"startDate\":\"'", "'\"dueDate\":\"'", "'\"priority\":\"'", "'\"isPrivate\":'", "'\"progress\":'", "'\"status\":'", "'\"assignedTo\":\"'", "'\"createdDate\":\"'", "'\"completedDate\":\"'", "'\"timeLoggedMin\":'", "'\"billableTime\":'", "'\"completedOnTime\":'", "'\"timeEstimated\":'", "'\"tags\":\"'", "'\"type\":\"'", "'\"text\":\"'", "'\"'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int RULE_DATE=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int RULE_DATEHOUR=7;
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

        public InternalKPIGeneratorParser(TokenStream input, KPIGeneratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected KPIGeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalKPIGenerator.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalKPIGenerator.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalKPIGenerator.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalKPIGenerator.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) ) otherlv_2= ']' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_projects_1_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:77:2: ( (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) ) otherlv_2= ']' ) )
            // InternalKPIGenerator.g:78:2: (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) ) otherlv_2= ']' )
            {
            // InternalKPIGenerator.g:78:2: (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) ) otherlv_2= ']' )
            // InternalKPIGenerator.g:79:3: otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalKPIGenerator.g:83:3: ( (lv_projects_1_0= ruleProject ) )
            // InternalKPIGenerator.g:84:4: (lv_projects_1_0= ruleProject )
            {
            // InternalKPIGenerator.g:84:4: (lv_projects_1_0= ruleProject )
            // InternalKPIGenerator.g:85:5: lv_projects_1_0= ruleProject
            {

            					newCompositeNode(grammarAccess.getRootAccess().getProjectsProjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_projects_1_0=ruleProject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					add(
            						current,
            						"projects",
            						lv_projects_1_0,
            						"co.edu.uniandes.KPIGenerator.Project");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRootAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleProject"
    // InternalKPIGenerator.g:110:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalKPIGenerator.g:110:48: (iv_ruleProject= ruleProject EOF )
            // InternalKPIGenerator.g:111:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalKPIGenerator.g:117:1: ruleProject returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"name\":\"' ( (lv_projectName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"phases\":[' ( (lv_phases_5_0= rulePhase ) ) otherlv_6= ']' otherlv_7= '}' (otherlv_8= ',' )? ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_projectName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_phases_5_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:123:2: ( ( () otherlv_1= '{' otherlv_2= '\"name\":\"' ( (lv_projectName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"phases\":[' ( (lv_phases_5_0= rulePhase ) ) otherlv_6= ']' otherlv_7= '}' (otherlv_8= ',' )? ) )
            // InternalKPIGenerator.g:124:2: ( () otherlv_1= '{' otherlv_2= '\"name\":\"' ( (lv_projectName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"phases\":[' ( (lv_phases_5_0= rulePhase ) ) otherlv_6= ']' otherlv_7= '}' (otherlv_8= ',' )? )
            {
            // InternalKPIGenerator.g:124:2: ( () otherlv_1= '{' otherlv_2= '\"name\":\"' ( (lv_projectName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"phases\":[' ( (lv_phases_5_0= rulePhase ) ) otherlv_6= ']' otherlv_7= '}' (otherlv_8= ',' )? )
            // InternalKPIGenerator.g:125:3: () otherlv_1= '{' otherlv_2= '\"name\":\"' ( (lv_projectName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"phases\":[' ( (lv_phases_5_0= rulePhase ) ) otherlv_6= ']' otherlv_7= '}' (otherlv_8= ',' )?
            {
            // InternalKPIGenerator.g:125:3: ()
            // InternalKPIGenerator.g:126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectAccess().getProjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getNameKeyword_2());
            		
            // InternalKPIGenerator.g:140:3: ( (lv_projectName_3_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:141:4: (lv_projectName_3_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:141:4: (lv_projectName_3_0= RULE_CADENA )
            // InternalKPIGenerator.g:142:5: lv_projectName_3_0= RULE_CADENA
            {
            lv_projectName_3_0=(Token)match(input,RULE_CADENA,FOLLOW_7); 

            					newLeafNode(lv_projectName_3_0, grammarAccess.getProjectAccess().getProjectNameCADENATerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"projectName",
            						lv_projectName_3_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getPhasesKeyword_4());
            		
            // InternalKPIGenerator.g:162:3: ( (lv_phases_5_0= rulePhase ) )
            // InternalKPIGenerator.g:163:4: (lv_phases_5_0= rulePhase )
            {
            // InternalKPIGenerator.g:163:4: (lv_phases_5_0= rulePhase )
            // InternalKPIGenerator.g:164:5: lv_phases_5_0= rulePhase
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_4);
            lv_phases_5_0=rulePhase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					add(
            						current,
            						"phases",
            						lv_phases_5_0,
            						"co.edu.uniandes.KPIGenerator.Phase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalKPIGenerator.g:189:3: (otherlv_8= ',' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKPIGenerator.g:190:4: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getCommaKeyword_8());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRulePhase"
    // InternalKPIGenerator.g:199:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalKPIGenerator.g:199:46: (iv_rulePhase= rulePhase EOF )
            // InternalKPIGenerator.g:200:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalKPIGenerator.g:206:1: rulePhase returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"name\":\"' ( (lv_phaseName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"tasks\":[' ( (lv_tasks_5_0= ruleTask ) ) otherlv_6= ']' otherlv_7= '}' (otherlv_8= ',' )? ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_phaseName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_tasks_5_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:212:2: ( ( () otherlv_1= '{' otherlv_2= '\"name\":\"' ( (lv_phaseName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"tasks\":[' ( (lv_tasks_5_0= ruleTask ) ) otherlv_6= ']' otherlv_7= '}' (otherlv_8= ',' )? ) )
            // InternalKPIGenerator.g:213:2: ( () otherlv_1= '{' otherlv_2= '\"name\":\"' ( (lv_phaseName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"tasks\":[' ( (lv_tasks_5_0= ruleTask ) ) otherlv_6= ']' otherlv_7= '}' (otherlv_8= ',' )? )
            {
            // InternalKPIGenerator.g:213:2: ( () otherlv_1= '{' otherlv_2= '\"name\":\"' ( (lv_phaseName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"tasks\":[' ( (lv_tasks_5_0= ruleTask ) ) otherlv_6= ']' otherlv_7= '}' (otherlv_8= ',' )? )
            // InternalKPIGenerator.g:214:3: () otherlv_1= '{' otherlv_2= '\"name\":\"' ( (lv_phaseName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"tasks\":[' ( (lv_tasks_5_0= ruleTask ) ) otherlv_6= ']' otherlv_7= '}' (otherlv_8= ',' )?
            {
            // InternalKPIGenerator.g:214:3: ()
            // InternalKPIGenerator.g:215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPhaseAccess().getPhaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPhaseAccess().getNameKeyword_2());
            		
            // InternalKPIGenerator.g:229:3: ( (lv_phaseName_3_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:230:4: (lv_phaseName_3_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:230:4: (lv_phaseName_3_0= RULE_CADENA )
            // InternalKPIGenerator.g:231:5: lv_phaseName_3_0= RULE_CADENA
            {
            lv_phaseName_3_0=(Token)match(input,RULE_CADENA,FOLLOW_10); 

            					newLeafNode(lv_phaseName_3_0, grammarAccess.getPhaseAccess().getPhaseNameCADENATerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phaseName",
            						lv_phaseName_3_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPhaseAccess().getTasksKeyword_4());
            		
            // InternalKPIGenerator.g:251:3: ( (lv_tasks_5_0= ruleTask ) )
            // InternalKPIGenerator.g:252:4: (lv_tasks_5_0= ruleTask )
            {
            // InternalKPIGenerator.g:252:4: (lv_tasks_5_0= ruleTask )
            // InternalKPIGenerator.g:253:5: lv_tasks_5_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_4);
            lv_tasks_5_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhaseRule());
            					}
            					add(
            						current,
            						"tasks",
            						lv_tasks_5_0,
            						"co.edu.uniandes.KPIGenerator.Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPhaseAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalKPIGenerator.g:278:3: (otherlv_8= ',' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:279:4: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getPhaseAccess().getCommaKeyword_8());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleTask"
    // InternalKPIGenerator.g:288:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalKPIGenerator.g:288:45: (iv_ruleTask= ruleTask EOF )
            // InternalKPIGenerator.g:289:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalKPIGenerator.g:295:1: ruleTask returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"id\":' ( (lv_taskId_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= '\"name\":\"' ( (lv_taskName_6_0= RULE_CADENA ) ) otherlv_7= '\",' otherlv_8= '\"useCase\":\"' ( (lv_useCase_9_0= RULE_CADENA ) ) otherlv_10= '\",' otherlv_11= '\"sequenceNumber\":' ( (lv_sequenceNumber_12_0= RULE_INT ) ) otherlv_13= '.' this_INT_14= RULE_INT otherlv_15= ',' otherlv_16= '\"description\":\"' ( ( (lv_description_17_1= RULE_CADENA | lv_description_17_2= '\"\"' ) ) ) otherlv_18= '\",' otherlv_19= '\"startDate\":\"' ( (lv_startDate_20_0= RULE_DATE ) ) otherlv_21= '\",' otherlv_22= '\"dueDate\":\"' ( (lv_dueDate_23_0= RULE_DATE ) ) otherlv_24= '\",' otherlv_25= '\"priority\":\"' ( ( (lv_priority_26_1= RULE_CADENA | lv_priority_26_2= '\"\"' ) ) ) otherlv_27= '\",' otherlv_28= '\"isPrivate\":' ( (lv_isPrivate_29_0= RULE_CADENA ) ) otherlv_30= ',' otherlv_31= '\"progress\":' ( (lv_progress_32_0= RULE_INT ) ) otherlv_33= ',' otherlv_34= '\"status\":' ( (lv_status_35_0= ruleStatus ) ) otherlv_36= ',' otherlv_37= '\"assignedTo\":\"' ( (lv_assignedTo_38_0= RULE_CADENA ) ) otherlv_39= '\",' otherlv_40= '\"createdDate\":\"' ( (lv_createdDate_41_0= RULE_DATEHOUR ) ) otherlv_42= '\",' otherlv_43= '\"completedDate\":\"' ( ( (lv_completedDate_44_1= RULE_DATEHOUR | lv_completedDate_44_2= '\"\"' ) ) ) otherlv_45= '\",' otherlv_46= '\"timeLoggedMin\":' ( (lv_timeLoggedMin_47_0= RULE_INT ) ) otherlv_48= ',' otherlv_49= '\"billableTime\":' ( (lv_billableTime_50_0= RULE_INT ) ) otherlv_51= ',' otherlv_52= '\"completedOnTime\":' ( (lv_completedOnTime_53_0= RULE_CADENA ) ) otherlv_54= ',' otherlv_55= '\"timeEstimated\":' ( (lv_timeEstimated_56_0= RULE_INT ) ) otherlv_57= ',' otherlv_58= '\"tags\":\"' ( ( (lv_tags_59_1= RULE_CADENA | lv_tags_59_2= '\"\"' ) ) ) otherlv_60= '}' (otherlv_61= ',' )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_taskId_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_taskName_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_useCase_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_sequenceNumber_12_0=null;
        Token otherlv_13=null;
        Token this_INT_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_description_17_1=null;
        Token lv_description_17_2=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_startDate_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_dueDate_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_priority_26_1=null;
        Token lv_priority_26_2=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_isPrivate_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token lv_progress_32_0=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token lv_assignedTo_38_0=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token lv_createdDate_41_0=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token lv_completedDate_44_1=null;
        Token lv_completedDate_44_2=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token lv_timeLoggedMin_47_0=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token lv_billableTime_50_0=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token lv_completedOnTime_53_0=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token lv_timeEstimated_56_0=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token lv_tags_59_1=null;
        Token lv_tags_59_2=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        EObject lv_status_35_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:301:2: ( ( () otherlv_1= '{' otherlv_2= '\"id\":' ( (lv_taskId_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= '\"name\":\"' ( (lv_taskName_6_0= RULE_CADENA ) ) otherlv_7= '\",' otherlv_8= '\"useCase\":\"' ( (lv_useCase_9_0= RULE_CADENA ) ) otherlv_10= '\",' otherlv_11= '\"sequenceNumber\":' ( (lv_sequenceNumber_12_0= RULE_INT ) ) otherlv_13= '.' this_INT_14= RULE_INT otherlv_15= ',' otherlv_16= '\"description\":\"' ( ( (lv_description_17_1= RULE_CADENA | lv_description_17_2= '\"\"' ) ) ) otherlv_18= '\",' otherlv_19= '\"startDate\":\"' ( (lv_startDate_20_0= RULE_DATE ) ) otherlv_21= '\",' otherlv_22= '\"dueDate\":\"' ( (lv_dueDate_23_0= RULE_DATE ) ) otherlv_24= '\",' otherlv_25= '\"priority\":\"' ( ( (lv_priority_26_1= RULE_CADENA | lv_priority_26_2= '\"\"' ) ) ) otherlv_27= '\",' otherlv_28= '\"isPrivate\":' ( (lv_isPrivate_29_0= RULE_CADENA ) ) otherlv_30= ',' otherlv_31= '\"progress\":' ( (lv_progress_32_0= RULE_INT ) ) otherlv_33= ',' otherlv_34= '\"status\":' ( (lv_status_35_0= ruleStatus ) ) otherlv_36= ',' otherlv_37= '\"assignedTo\":\"' ( (lv_assignedTo_38_0= RULE_CADENA ) ) otherlv_39= '\",' otherlv_40= '\"createdDate\":\"' ( (lv_createdDate_41_0= RULE_DATEHOUR ) ) otherlv_42= '\",' otherlv_43= '\"completedDate\":\"' ( ( (lv_completedDate_44_1= RULE_DATEHOUR | lv_completedDate_44_2= '\"\"' ) ) ) otherlv_45= '\",' otherlv_46= '\"timeLoggedMin\":' ( (lv_timeLoggedMin_47_0= RULE_INT ) ) otherlv_48= ',' otherlv_49= '\"billableTime\":' ( (lv_billableTime_50_0= RULE_INT ) ) otherlv_51= ',' otherlv_52= '\"completedOnTime\":' ( (lv_completedOnTime_53_0= RULE_CADENA ) ) otherlv_54= ',' otherlv_55= '\"timeEstimated\":' ( (lv_timeEstimated_56_0= RULE_INT ) ) otherlv_57= ',' otherlv_58= '\"tags\":\"' ( ( (lv_tags_59_1= RULE_CADENA | lv_tags_59_2= '\"\"' ) ) ) otherlv_60= '}' (otherlv_61= ',' )? ) )
            // InternalKPIGenerator.g:302:2: ( () otherlv_1= '{' otherlv_2= '\"id\":' ( (lv_taskId_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= '\"name\":\"' ( (lv_taskName_6_0= RULE_CADENA ) ) otherlv_7= '\",' otherlv_8= '\"useCase\":\"' ( (lv_useCase_9_0= RULE_CADENA ) ) otherlv_10= '\",' otherlv_11= '\"sequenceNumber\":' ( (lv_sequenceNumber_12_0= RULE_INT ) ) otherlv_13= '.' this_INT_14= RULE_INT otherlv_15= ',' otherlv_16= '\"description\":\"' ( ( (lv_description_17_1= RULE_CADENA | lv_description_17_2= '\"\"' ) ) ) otherlv_18= '\",' otherlv_19= '\"startDate\":\"' ( (lv_startDate_20_0= RULE_DATE ) ) otherlv_21= '\",' otherlv_22= '\"dueDate\":\"' ( (lv_dueDate_23_0= RULE_DATE ) ) otherlv_24= '\",' otherlv_25= '\"priority\":\"' ( ( (lv_priority_26_1= RULE_CADENA | lv_priority_26_2= '\"\"' ) ) ) otherlv_27= '\",' otherlv_28= '\"isPrivate\":' ( (lv_isPrivate_29_0= RULE_CADENA ) ) otherlv_30= ',' otherlv_31= '\"progress\":' ( (lv_progress_32_0= RULE_INT ) ) otherlv_33= ',' otherlv_34= '\"status\":' ( (lv_status_35_0= ruleStatus ) ) otherlv_36= ',' otherlv_37= '\"assignedTo\":\"' ( (lv_assignedTo_38_0= RULE_CADENA ) ) otherlv_39= '\",' otherlv_40= '\"createdDate\":\"' ( (lv_createdDate_41_0= RULE_DATEHOUR ) ) otherlv_42= '\",' otherlv_43= '\"completedDate\":\"' ( ( (lv_completedDate_44_1= RULE_DATEHOUR | lv_completedDate_44_2= '\"\"' ) ) ) otherlv_45= '\",' otherlv_46= '\"timeLoggedMin\":' ( (lv_timeLoggedMin_47_0= RULE_INT ) ) otherlv_48= ',' otherlv_49= '\"billableTime\":' ( (lv_billableTime_50_0= RULE_INT ) ) otherlv_51= ',' otherlv_52= '\"completedOnTime\":' ( (lv_completedOnTime_53_0= RULE_CADENA ) ) otherlv_54= ',' otherlv_55= '\"timeEstimated\":' ( (lv_timeEstimated_56_0= RULE_INT ) ) otherlv_57= ',' otherlv_58= '\"tags\":\"' ( ( (lv_tags_59_1= RULE_CADENA | lv_tags_59_2= '\"\"' ) ) ) otherlv_60= '}' (otherlv_61= ',' )? )
            {
            // InternalKPIGenerator.g:302:2: ( () otherlv_1= '{' otherlv_2= '\"id\":' ( (lv_taskId_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= '\"name\":\"' ( (lv_taskName_6_0= RULE_CADENA ) ) otherlv_7= '\",' otherlv_8= '\"useCase\":\"' ( (lv_useCase_9_0= RULE_CADENA ) ) otherlv_10= '\",' otherlv_11= '\"sequenceNumber\":' ( (lv_sequenceNumber_12_0= RULE_INT ) ) otherlv_13= '.' this_INT_14= RULE_INT otherlv_15= ',' otherlv_16= '\"description\":\"' ( ( (lv_description_17_1= RULE_CADENA | lv_description_17_2= '\"\"' ) ) ) otherlv_18= '\",' otherlv_19= '\"startDate\":\"' ( (lv_startDate_20_0= RULE_DATE ) ) otherlv_21= '\",' otherlv_22= '\"dueDate\":\"' ( (lv_dueDate_23_0= RULE_DATE ) ) otherlv_24= '\",' otherlv_25= '\"priority\":\"' ( ( (lv_priority_26_1= RULE_CADENA | lv_priority_26_2= '\"\"' ) ) ) otherlv_27= '\",' otherlv_28= '\"isPrivate\":' ( (lv_isPrivate_29_0= RULE_CADENA ) ) otherlv_30= ',' otherlv_31= '\"progress\":' ( (lv_progress_32_0= RULE_INT ) ) otherlv_33= ',' otherlv_34= '\"status\":' ( (lv_status_35_0= ruleStatus ) ) otherlv_36= ',' otherlv_37= '\"assignedTo\":\"' ( (lv_assignedTo_38_0= RULE_CADENA ) ) otherlv_39= '\",' otherlv_40= '\"createdDate\":\"' ( (lv_createdDate_41_0= RULE_DATEHOUR ) ) otherlv_42= '\",' otherlv_43= '\"completedDate\":\"' ( ( (lv_completedDate_44_1= RULE_DATEHOUR | lv_completedDate_44_2= '\"\"' ) ) ) otherlv_45= '\",' otherlv_46= '\"timeLoggedMin\":' ( (lv_timeLoggedMin_47_0= RULE_INT ) ) otherlv_48= ',' otherlv_49= '\"billableTime\":' ( (lv_billableTime_50_0= RULE_INT ) ) otherlv_51= ',' otherlv_52= '\"completedOnTime\":' ( (lv_completedOnTime_53_0= RULE_CADENA ) ) otherlv_54= ',' otherlv_55= '\"timeEstimated\":' ( (lv_timeEstimated_56_0= RULE_INT ) ) otherlv_57= ',' otherlv_58= '\"tags\":\"' ( ( (lv_tags_59_1= RULE_CADENA | lv_tags_59_2= '\"\"' ) ) ) otherlv_60= '}' (otherlv_61= ',' )? )
            // InternalKPIGenerator.g:303:3: () otherlv_1= '{' otherlv_2= '\"id\":' ( (lv_taskId_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= '\"name\":\"' ( (lv_taskName_6_0= RULE_CADENA ) ) otherlv_7= '\",' otherlv_8= '\"useCase\":\"' ( (lv_useCase_9_0= RULE_CADENA ) ) otherlv_10= '\",' otherlv_11= '\"sequenceNumber\":' ( (lv_sequenceNumber_12_0= RULE_INT ) ) otherlv_13= '.' this_INT_14= RULE_INT otherlv_15= ',' otherlv_16= '\"description\":\"' ( ( (lv_description_17_1= RULE_CADENA | lv_description_17_2= '\"\"' ) ) ) otherlv_18= '\",' otherlv_19= '\"startDate\":\"' ( (lv_startDate_20_0= RULE_DATE ) ) otherlv_21= '\",' otherlv_22= '\"dueDate\":\"' ( (lv_dueDate_23_0= RULE_DATE ) ) otherlv_24= '\",' otherlv_25= '\"priority\":\"' ( ( (lv_priority_26_1= RULE_CADENA | lv_priority_26_2= '\"\"' ) ) ) otherlv_27= '\",' otherlv_28= '\"isPrivate\":' ( (lv_isPrivate_29_0= RULE_CADENA ) ) otherlv_30= ',' otherlv_31= '\"progress\":' ( (lv_progress_32_0= RULE_INT ) ) otherlv_33= ',' otherlv_34= '\"status\":' ( (lv_status_35_0= ruleStatus ) ) otherlv_36= ',' otherlv_37= '\"assignedTo\":\"' ( (lv_assignedTo_38_0= RULE_CADENA ) ) otherlv_39= '\",' otherlv_40= '\"createdDate\":\"' ( (lv_createdDate_41_0= RULE_DATEHOUR ) ) otherlv_42= '\",' otherlv_43= '\"completedDate\":\"' ( ( (lv_completedDate_44_1= RULE_DATEHOUR | lv_completedDate_44_2= '\"\"' ) ) ) otherlv_45= '\",' otherlv_46= '\"timeLoggedMin\":' ( (lv_timeLoggedMin_47_0= RULE_INT ) ) otherlv_48= ',' otherlv_49= '\"billableTime\":' ( (lv_billableTime_50_0= RULE_INT ) ) otherlv_51= ',' otherlv_52= '\"completedOnTime\":' ( (lv_completedOnTime_53_0= RULE_CADENA ) ) otherlv_54= ',' otherlv_55= '\"timeEstimated\":' ( (lv_timeEstimated_56_0= RULE_INT ) ) otherlv_57= ',' otherlv_58= '\"tags\":\"' ( ( (lv_tags_59_1= RULE_CADENA | lv_tags_59_2= '\"\"' ) ) ) otherlv_60= '}' (otherlv_61= ',' )?
            {
            // InternalKPIGenerator.g:303:3: ()
            // InternalKPIGenerator.g:304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskAccess().getTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getIdKeyword_2());
            		
            // InternalKPIGenerator.g:318:3: ( (lv_taskId_3_0= RULE_INT ) )
            // InternalKPIGenerator.g:319:4: (lv_taskId_3_0= RULE_INT )
            {
            // InternalKPIGenerator.g:319:4: (lv_taskId_3_0= RULE_INT )
            // InternalKPIGenerator.g:320:5: lv_taskId_3_0= RULE_INT
            {
            lv_taskId_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_taskId_3_0, grammarAccess.getTaskAccess().getTaskIdINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taskId",
            						lv_taskId_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getNameKeyword_5());
            		
            // InternalKPIGenerator.g:344:3: ( (lv_taskName_6_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:345:4: (lv_taskName_6_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:345:4: (lv_taskName_6_0= RULE_CADENA )
            // InternalKPIGenerator.g:346:5: lv_taskName_6_0= RULE_CADENA
            {
            lv_taskName_6_0=(Token)match(input,RULE_CADENA,FOLLOW_14); 

            					newLeafNode(lv_taskName_6_0, grammarAccess.getTaskAccess().getTaskNameCADENATerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taskName",
            						lv_taskName_6_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getUseCaseKeyword_8());
            		
            // InternalKPIGenerator.g:370:3: ( (lv_useCase_9_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:371:4: (lv_useCase_9_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:371:4: (lv_useCase_9_0= RULE_CADENA )
            // InternalKPIGenerator.g:372:5: lv_useCase_9_0= RULE_CADENA
            {
            lv_useCase_9_0=(Token)match(input,RULE_CADENA,FOLLOW_14); 

            					newLeafNode(lv_useCase_9_0, grammarAccess.getTaskAccess().getUseCaseCADENATerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"useCase",
            						lv_useCase_9_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_10=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getSequenceNumberKeyword_11());
            		
            // InternalKPIGenerator.g:396:3: ( (lv_sequenceNumber_12_0= RULE_INT ) )
            // InternalKPIGenerator.g:397:4: (lv_sequenceNumber_12_0= RULE_INT )
            {
            // InternalKPIGenerator.g:397:4: (lv_sequenceNumber_12_0= RULE_INT )
            // InternalKPIGenerator.g:398:5: lv_sequenceNumber_12_0= RULE_INT
            {
            lv_sequenceNumber_12_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_sequenceNumber_12_0, grammarAccess.getTaskAccess().getSequenceNumberINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sequenceNumber",
            						lv_sequenceNumber_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getFullStopKeyword_13());
            		
            this_INT_14=(Token)match(input,RULE_INT,FOLLOW_13); 

            			newLeafNode(this_INT_14, grammarAccess.getTaskAccess().getINTTerminalRuleCall_14());
            		
            otherlv_15=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getCommaKeyword_15());
            		
            otherlv_16=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getDescriptionKeyword_16());
            		
            // InternalKPIGenerator.g:430:3: ( ( (lv_description_17_1= RULE_CADENA | lv_description_17_2= '\"\"' ) ) )
            // InternalKPIGenerator.g:431:4: ( (lv_description_17_1= RULE_CADENA | lv_description_17_2= '\"\"' ) )
            {
            // InternalKPIGenerator.g:431:4: ( (lv_description_17_1= RULE_CADENA | lv_description_17_2= '\"\"' ) )
            // InternalKPIGenerator.g:432:5: (lv_description_17_1= RULE_CADENA | lv_description_17_2= '\"\"' )
            {
            // InternalKPIGenerator.g:432:5: (lv_description_17_1= RULE_CADENA | lv_description_17_2= '\"\"' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_CADENA) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:433:6: lv_description_17_1= RULE_CADENA
                    {
                    lv_description_17_1=(Token)match(input,RULE_CADENA,FOLLOW_14); 

                    						newLeafNode(lv_description_17_1, grammarAccess.getTaskAccess().getDescriptionCADENATerminalRuleCall_17_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_17_1,
                    							"co.edu.uniandes.KPIGenerator.CADENA");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:448:6: lv_description_17_2= '\"\"'
                    {
                    lv_description_17_2=(Token)match(input,28,FOLLOW_14); 

                    						newLeafNode(lv_description_17_2, grammarAccess.getTaskAccess().getDescriptionQuotationMarkQuotationMarkKeyword_17_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "description", lv_description_17_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_18=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_18, grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_18());
            		
            otherlv_19=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getStartDateKeyword_19());
            		
            // InternalKPIGenerator.g:469:3: ( (lv_startDate_20_0= RULE_DATE ) )
            // InternalKPIGenerator.g:470:4: (lv_startDate_20_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:470:4: (lv_startDate_20_0= RULE_DATE )
            // InternalKPIGenerator.g:471:5: lv_startDate_20_0= RULE_DATE
            {
            lv_startDate_20_0=(Token)match(input,RULE_DATE,FOLLOW_14); 

            					newLeafNode(lv_startDate_20_0, grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_20_0,
            						"co.edu.uniandes.KPIGenerator.DATE");
            				

            }


            }

            otherlv_21=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_21, grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_21());
            		
            otherlv_22=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_22, grammarAccess.getTaskAccess().getDueDateKeyword_22());
            		
            // InternalKPIGenerator.g:495:3: ( (lv_dueDate_23_0= RULE_DATE ) )
            // InternalKPIGenerator.g:496:4: (lv_dueDate_23_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:496:4: (lv_dueDate_23_0= RULE_DATE )
            // InternalKPIGenerator.g:497:5: lv_dueDate_23_0= RULE_DATE
            {
            lv_dueDate_23_0=(Token)match(input,RULE_DATE,FOLLOW_14); 

            					newLeafNode(lv_dueDate_23_0, grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_23_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dueDate",
            						lv_dueDate_23_0,
            						"co.edu.uniandes.KPIGenerator.DATE");
            				

            }


            }

            otherlv_24=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_24, grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_24());
            		
            otherlv_25=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_25, grammarAccess.getTaskAccess().getPriorityKeyword_25());
            		
            // InternalKPIGenerator.g:521:3: ( ( (lv_priority_26_1= RULE_CADENA | lv_priority_26_2= '\"\"' ) ) )
            // InternalKPIGenerator.g:522:4: ( (lv_priority_26_1= RULE_CADENA | lv_priority_26_2= '\"\"' ) )
            {
            // InternalKPIGenerator.g:522:4: ( (lv_priority_26_1= RULE_CADENA | lv_priority_26_2= '\"\"' ) )
            // InternalKPIGenerator.g:523:5: (lv_priority_26_1= RULE_CADENA | lv_priority_26_2= '\"\"' )
            {
            // InternalKPIGenerator.g:523:5: (lv_priority_26_1= RULE_CADENA | lv_priority_26_2= '\"\"' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CADENA) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:524:6: lv_priority_26_1= RULE_CADENA
                    {
                    lv_priority_26_1=(Token)match(input,RULE_CADENA,FOLLOW_14); 

                    						newLeafNode(lv_priority_26_1, grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_26_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"priority",
                    							lv_priority_26_1,
                    							"co.edu.uniandes.KPIGenerator.CADENA");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:539:6: lv_priority_26_2= '\"\"'
                    {
                    lv_priority_26_2=(Token)match(input,28,FOLLOW_14); 

                    						newLeafNode(lv_priority_26_2, grammarAccess.getTaskAccess().getPriorityQuotationMarkQuotationMarkKeyword_26_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "priority", lv_priority_26_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_27=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_27, grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_27());
            		
            otherlv_28=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_28, grammarAccess.getTaskAccess().getIsPrivateKeyword_28());
            		
            // InternalKPIGenerator.g:560:3: ( (lv_isPrivate_29_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:561:4: (lv_isPrivate_29_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:561:4: (lv_isPrivate_29_0= RULE_CADENA )
            // InternalKPIGenerator.g:562:5: lv_isPrivate_29_0= RULE_CADENA
            {
            lv_isPrivate_29_0=(Token)match(input,RULE_CADENA,FOLLOW_13); 

            					newLeafNode(lv_isPrivate_29_0, grammarAccess.getTaskAccess().getIsPrivateCADENATerminalRuleCall_29_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"isPrivate",
            						lv_isPrivate_29_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_30=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_30, grammarAccess.getTaskAccess().getCommaKeyword_30());
            		
            otherlv_31=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_31, grammarAccess.getTaskAccess().getProgressKeyword_31());
            		
            // InternalKPIGenerator.g:586:3: ( (lv_progress_32_0= RULE_INT ) )
            // InternalKPIGenerator.g:587:4: (lv_progress_32_0= RULE_INT )
            {
            // InternalKPIGenerator.g:587:4: (lv_progress_32_0= RULE_INT )
            // InternalKPIGenerator.g:588:5: lv_progress_32_0= RULE_INT
            {
            lv_progress_32_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_progress_32_0, grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_32_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"progress",
            						lv_progress_32_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_33=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_33, grammarAccess.getTaskAccess().getCommaKeyword_33());
            		
            otherlv_34=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_34, grammarAccess.getTaskAccess().getStatusKeyword_34());
            		
            // InternalKPIGenerator.g:612:3: ( (lv_status_35_0= ruleStatus ) )
            // InternalKPIGenerator.g:613:4: (lv_status_35_0= ruleStatus )
            {
            // InternalKPIGenerator.g:613:4: (lv_status_35_0= ruleStatus )
            // InternalKPIGenerator.g:614:5: lv_status_35_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getStatusStatusParserRuleCall_35_0());
            				
            pushFollow(FOLLOW_13);
            lv_status_35_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_35_0,
            						"co.edu.uniandes.KPIGenerator.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_36=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_36, grammarAccess.getTaskAccess().getCommaKeyword_36());
            		
            otherlv_37=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_37, grammarAccess.getTaskAccess().getAssignedToKeyword_37());
            		
            // InternalKPIGenerator.g:639:3: ( (lv_assignedTo_38_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:640:4: (lv_assignedTo_38_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:640:4: (lv_assignedTo_38_0= RULE_CADENA )
            // InternalKPIGenerator.g:641:5: lv_assignedTo_38_0= RULE_CADENA
            {
            lv_assignedTo_38_0=(Token)match(input,RULE_CADENA,FOLLOW_14); 

            					newLeafNode(lv_assignedTo_38_0, grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_38_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"assignedTo",
            						lv_assignedTo_38_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_39=(Token)match(input,23,FOLLOW_28); 

            			newLeafNode(otherlv_39, grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_39());
            		
            otherlv_40=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_40, grammarAccess.getTaskAccess().getCreatedDateKeyword_40());
            		
            // InternalKPIGenerator.g:665:3: ( (lv_createdDate_41_0= RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:666:4: (lv_createdDate_41_0= RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:666:4: (lv_createdDate_41_0= RULE_DATEHOUR )
            // InternalKPIGenerator.g:667:5: lv_createdDate_41_0= RULE_DATEHOUR
            {
            lv_createdDate_41_0=(Token)match(input,RULE_DATEHOUR,FOLLOW_14); 

            					newLeafNode(lv_createdDate_41_0, grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_41_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"createdDate",
            						lv_createdDate_41_0,
            						"co.edu.uniandes.KPIGenerator.DATEHOUR");
            				

            }


            }

            otherlv_42=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_42, grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_42());
            		
            otherlv_43=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_43, grammarAccess.getTaskAccess().getCompletedDateKeyword_43());
            		
            // InternalKPIGenerator.g:691:3: ( ( (lv_completedDate_44_1= RULE_DATEHOUR | lv_completedDate_44_2= '\"\"' ) ) )
            // InternalKPIGenerator.g:692:4: ( (lv_completedDate_44_1= RULE_DATEHOUR | lv_completedDate_44_2= '\"\"' ) )
            {
            // InternalKPIGenerator.g:692:4: ( (lv_completedDate_44_1= RULE_DATEHOUR | lv_completedDate_44_2= '\"\"' ) )
            // InternalKPIGenerator.g:693:5: (lv_completedDate_44_1= RULE_DATEHOUR | lv_completedDate_44_2= '\"\"' )
            {
            // InternalKPIGenerator.g:693:5: (lv_completedDate_44_1= RULE_DATEHOUR | lv_completedDate_44_2= '\"\"' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DATEHOUR) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:694:6: lv_completedDate_44_1= RULE_DATEHOUR
                    {
                    lv_completedDate_44_1=(Token)match(input,RULE_DATEHOUR,FOLLOW_14); 

                    						newLeafNode(lv_completedDate_44_1, grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_44_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"completedDate",
                    							lv_completedDate_44_1,
                    							"co.edu.uniandes.KPIGenerator.DATEHOUR");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:709:6: lv_completedDate_44_2= '\"\"'
                    {
                    lv_completedDate_44_2=(Token)match(input,28,FOLLOW_14); 

                    						newLeafNode(lv_completedDate_44_2, grammarAccess.getTaskAccess().getCompletedDateQuotationMarkQuotationMarkKeyword_44_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "completedDate", lv_completedDate_44_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_45=(Token)match(input,23,FOLLOW_32); 

            			newLeafNode(otherlv_45, grammarAccess.getTaskAccess().getQuotationMarkCommaKeyword_45());
            		
            otherlv_46=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_46, grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_46());
            		
            // InternalKPIGenerator.g:730:3: ( (lv_timeLoggedMin_47_0= RULE_INT ) )
            // InternalKPIGenerator.g:731:4: (lv_timeLoggedMin_47_0= RULE_INT )
            {
            // InternalKPIGenerator.g:731:4: (lv_timeLoggedMin_47_0= RULE_INT )
            // InternalKPIGenerator.g:732:5: lv_timeLoggedMin_47_0= RULE_INT
            {
            lv_timeLoggedMin_47_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_timeLoggedMin_47_0, grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_47_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeLoggedMin",
            						lv_timeLoggedMin_47_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_48=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_48, grammarAccess.getTaskAccess().getCommaKeyword_48());
            		
            otherlv_49=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_49, grammarAccess.getTaskAccess().getBillableTimeKeyword_49());
            		
            // InternalKPIGenerator.g:756:3: ( (lv_billableTime_50_0= RULE_INT ) )
            // InternalKPIGenerator.g:757:4: (lv_billableTime_50_0= RULE_INT )
            {
            // InternalKPIGenerator.g:757:4: (lv_billableTime_50_0= RULE_INT )
            // InternalKPIGenerator.g:758:5: lv_billableTime_50_0= RULE_INT
            {
            lv_billableTime_50_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_billableTime_50_0, grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_50_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"billableTime",
            						lv_billableTime_50_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_51=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_51, grammarAccess.getTaskAccess().getCommaKeyword_51());
            		
            otherlv_52=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_52, grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_52());
            		
            // InternalKPIGenerator.g:782:3: ( (lv_completedOnTime_53_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:783:4: (lv_completedOnTime_53_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:783:4: (lv_completedOnTime_53_0= RULE_CADENA )
            // InternalKPIGenerator.g:784:5: lv_completedOnTime_53_0= RULE_CADENA
            {
            lv_completedOnTime_53_0=(Token)match(input,RULE_CADENA,FOLLOW_13); 

            					newLeafNode(lv_completedOnTime_53_0, grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_53_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"completedOnTime",
            						lv_completedOnTime_53_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_54=(Token)match(input,20,FOLLOW_35); 

            			newLeafNode(otherlv_54, grammarAccess.getTaskAccess().getCommaKeyword_54());
            		
            otherlv_55=(Token)match(input,41,FOLLOW_12); 

            			newLeafNode(otherlv_55, grammarAccess.getTaskAccess().getTimeEstimatedKeyword_55());
            		
            // InternalKPIGenerator.g:808:3: ( (lv_timeEstimated_56_0= RULE_INT ) )
            // InternalKPIGenerator.g:809:4: (lv_timeEstimated_56_0= RULE_INT )
            {
            // InternalKPIGenerator.g:809:4: (lv_timeEstimated_56_0= RULE_INT )
            // InternalKPIGenerator.g:810:5: lv_timeEstimated_56_0= RULE_INT
            {
            lv_timeEstimated_56_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_timeEstimated_56_0, grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_56_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeEstimated",
            						lv_timeEstimated_56_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_57=(Token)match(input,20,FOLLOW_36); 

            			newLeafNode(otherlv_57, grammarAccess.getTaskAccess().getCommaKeyword_57());
            		
            otherlv_58=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_58, grammarAccess.getTaskAccess().getTagsKeyword_58());
            		
            // InternalKPIGenerator.g:834:3: ( ( (lv_tags_59_1= RULE_CADENA | lv_tags_59_2= '\"\"' ) ) )
            // InternalKPIGenerator.g:835:4: ( (lv_tags_59_1= RULE_CADENA | lv_tags_59_2= '\"\"' ) )
            {
            // InternalKPIGenerator.g:835:4: ( (lv_tags_59_1= RULE_CADENA | lv_tags_59_2= '\"\"' ) )
            // InternalKPIGenerator.g:836:5: (lv_tags_59_1= RULE_CADENA | lv_tags_59_2= '\"\"' )
            {
            // InternalKPIGenerator.g:836:5: (lv_tags_59_1= RULE_CADENA | lv_tags_59_2= '\"\"' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CADENA) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:837:6: lv_tags_59_1= RULE_CADENA
                    {
                    lv_tags_59_1=(Token)match(input,RULE_CADENA,FOLLOW_8); 

                    						newLeafNode(lv_tags_59_1, grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_59_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tags",
                    							lv_tags_59_1,
                    							"co.edu.uniandes.KPIGenerator.CADENA");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:852:6: lv_tags_59_2= '\"\"'
                    {
                    lv_tags_59_2=(Token)match(input,28,FOLLOW_8); 

                    						newLeafNode(lv_tags_59_2, grammarAccess.getTaskAccess().getTagsQuotationMarkQuotationMarkKeyword_59_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "tags", lv_tags_59_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_60=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_60, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_60());
            		
            // InternalKPIGenerator.g:869:3: (otherlv_61= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:870:4: otherlv_61= ','
                    {
                    otherlv_61=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_61, grammarAccess.getTaskAccess().getCommaKeyword_61());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleStatus"
    // InternalKPIGenerator.g:879:1: entryRuleStatus returns [EObject current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final EObject entryRuleStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatus = null;


        try {
            // InternalKPIGenerator.g:879:47: (iv_ruleStatus= ruleStatus EOF )
            // InternalKPIGenerator.g:880:2: iv_ruleStatus= ruleStatus EOF
            {
             newCompositeNode(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatus=ruleStatus();

            state._fsp--;

             current =iv_ruleStatus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // InternalKPIGenerator.g:886:1: ruleStatus returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"type\":\"' ( (lv_statusName_3_0= RULE_CADENA ) ) otherlv_4= '\",' otherlv_5= '\"text\":\"' ( (lv_text_6_0= RULE_CADENA ) ) otherlv_7= '\"' otherlv_8= '}' ) ;
    public final EObject ruleStatus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_statusName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_text_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:892:2: ( ( () otherlv_1= '{' otherlv_2= '\"type\":\"' ( (lv_statusName_3_0= RULE_CADENA ) ) otherlv_4= '\",' otherlv_5= '\"text\":\"' ( (lv_text_6_0= RULE_CADENA ) ) otherlv_7= '\"' otherlv_8= '}' ) )
            // InternalKPIGenerator.g:893:2: ( () otherlv_1= '{' otherlv_2= '\"type\":\"' ( (lv_statusName_3_0= RULE_CADENA ) ) otherlv_4= '\",' otherlv_5= '\"text\":\"' ( (lv_text_6_0= RULE_CADENA ) ) otherlv_7= '\"' otherlv_8= '}' )
            {
            // InternalKPIGenerator.g:893:2: ( () otherlv_1= '{' otherlv_2= '\"type\":\"' ( (lv_statusName_3_0= RULE_CADENA ) ) otherlv_4= '\",' otherlv_5= '\"text\":\"' ( (lv_text_6_0= RULE_CADENA ) ) otherlv_7= '\"' otherlv_8= '}' )
            // InternalKPIGenerator.g:894:3: () otherlv_1= '{' otherlv_2= '\"type\":\"' ( (lv_statusName_3_0= RULE_CADENA ) ) otherlv_4= '\",' otherlv_5= '\"text\":\"' ( (lv_text_6_0= RULE_CADENA ) ) otherlv_7= '\"' otherlv_8= '}'
            {
            // InternalKPIGenerator.g:894:3: ()
            // InternalKPIGenerator.g:895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatusAccess().getStatusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getStatusAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStatusAccess().getTypeKeyword_2());
            		
            // InternalKPIGenerator.g:909:3: ( (lv_statusName_3_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:910:4: (lv_statusName_3_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:910:4: (lv_statusName_3_0= RULE_CADENA )
            // InternalKPIGenerator.g:911:5: lv_statusName_3_0= RULE_CADENA
            {
            lv_statusName_3_0=(Token)match(input,RULE_CADENA,FOLLOW_14); 

            					newLeafNode(lv_statusName_3_0, grammarAccess.getStatusAccess().getStatusNameCADENATerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"statusName",
            						lv_statusName_3_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getStatusAccess().getQuotationMarkCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getStatusAccess().getTextKeyword_5());
            		
            // InternalKPIGenerator.g:935:3: ( (lv_text_6_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:936:4: (lv_text_6_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:936:4: (lv_text_6_0= RULE_CADENA )
            // InternalKPIGenerator.g:937:5: lv_text_6_0= RULE_CADENA
            {
            lv_text_6_0=(Token)match(input,RULE_CADENA,FOLLOW_39); 

            					newLeafNode(lv_text_6_0, grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_6_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_7=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getStatusAccess().getQuotationMarkKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStatusAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});

}