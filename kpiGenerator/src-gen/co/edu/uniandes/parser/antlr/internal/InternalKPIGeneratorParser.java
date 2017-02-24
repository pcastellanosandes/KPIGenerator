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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CADENA", "RULE_INT", "RULE_DATE", "RULE_DATEHOUR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'{\"name\":\"'", "'\",\"phases\":['", "']}'", "','", "'\",\"tasks\":['", "'{\"id\":'", "',\"name\":\"'", "'\",\"useCase\":\"'", "'\",\"sequenceNumber\":'", "'.'", "',\"description\":\"'", "'\"\"'", "'\",\"startDate\":\"'", "'\",\"dueDate\":\"'", "'\",\"priority\":\"'", "'\",\"isPrivate\":'", "',\"progress\":'", "',\"status\":'", "',\"assignedTo\":\"'", "'\",\"createdDate\":\"'", "'\",\"completedDate\":\"'", "'\",\"timeLoggedMin\":'", "',\"billableTime\":'", "',\"completedOnTime\":'", "',\"timeEstimated\":'", "',\"tags\":\"'", "'}'", "'{\"type\":\"'", "'\",\"text\":\"'", "'\"}'"
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
    // InternalKPIGenerator.g:117:1: ruleProject returns [EObject current=null] : ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) ) otherlv_5= ']}' (otherlv_6= ',' )? ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_projectName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_phases_4_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:123:2: ( ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) ) otherlv_5= ']}' (otherlv_6= ',' )? ) )
            // InternalKPIGenerator.g:124:2: ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) ) otherlv_5= ']}' (otherlv_6= ',' )? )
            {
            // InternalKPIGenerator.g:124:2: ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) ) otherlv_5= ']}' (otherlv_6= ',' )? )
            // InternalKPIGenerator.g:125:3: () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) ) otherlv_5= ']}' (otherlv_6= ',' )?
            {
            // InternalKPIGenerator.g:125:3: ()
            // InternalKPIGenerator.g:126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectAccess().getProjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getNameKeyword_1());
            		
            // InternalKPIGenerator.g:136:3: ( (lv_projectName_2_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:137:4: (lv_projectName_2_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:137:4: (lv_projectName_2_0= RULE_CADENA )
            // InternalKPIGenerator.g:138:5: lv_projectName_2_0= RULE_CADENA
            {
            lv_projectName_2_0=(Token)match(input,RULE_CADENA,FOLLOW_6); 

            					newLeafNode(lv_projectName_2_0, grammarAccess.getProjectAccess().getProjectNameCADENATerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"projectName",
            						lv_projectName_2_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getPhasesKeyword_3());
            		
            // InternalKPIGenerator.g:158:3: ( (lv_phases_4_0= rulePhase ) )
            // InternalKPIGenerator.g:159:4: (lv_phases_4_0= rulePhase )
            {
            // InternalKPIGenerator.g:159:4: (lv_phases_4_0= rulePhase )
            // InternalKPIGenerator.g:160:5: lv_phases_4_0= rulePhase
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_phases_4_0=rulePhase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					add(
            						current,
            						"phases",
            						lv_phases_4_0,
            						"co.edu.uniandes.KPIGenerator.Phase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getRightSquareBracketRightCurlyBracketKeyword_5());
            		
            // InternalKPIGenerator.g:181:3: (otherlv_6= ',' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKPIGenerator.g:182:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getCommaKeyword_6());
                    			

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
    // InternalKPIGenerator.g:191:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalKPIGenerator.g:191:46: (iv_rulePhase= rulePhase EOF )
            // InternalKPIGenerator.g:192:2: iv_rulePhase= rulePhase EOF
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
    // InternalKPIGenerator.g:198:1: rulePhase returns [EObject current=null] : ( () otherlv_1= '{\"name\":\"' ( (lv_phaseName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"tasks\":[' ( (lv_tasks_4_0= ruleTask ) ) otherlv_5= ']}' (otherlv_6= ',' )? ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_phaseName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_tasks_4_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:204:2: ( ( () otherlv_1= '{\"name\":\"' ( (lv_phaseName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"tasks\":[' ( (lv_tasks_4_0= ruleTask ) ) otherlv_5= ']}' (otherlv_6= ',' )? ) )
            // InternalKPIGenerator.g:205:2: ( () otherlv_1= '{\"name\":\"' ( (lv_phaseName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"tasks\":[' ( (lv_tasks_4_0= ruleTask ) ) otherlv_5= ']}' (otherlv_6= ',' )? )
            {
            // InternalKPIGenerator.g:205:2: ( () otherlv_1= '{\"name\":\"' ( (lv_phaseName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"tasks\":[' ( (lv_tasks_4_0= ruleTask ) ) otherlv_5= ']}' (otherlv_6= ',' )? )
            // InternalKPIGenerator.g:206:3: () otherlv_1= '{\"name\":\"' ( (lv_phaseName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"tasks\":[' ( (lv_tasks_4_0= ruleTask ) ) otherlv_5= ']}' (otherlv_6= ',' )?
            {
            // InternalKPIGenerator.g:206:3: ()
            // InternalKPIGenerator.g:207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPhaseAccess().getPhaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPhaseAccess().getNameKeyword_1());
            		
            // InternalKPIGenerator.g:217:3: ( (lv_phaseName_2_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:218:4: (lv_phaseName_2_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:218:4: (lv_phaseName_2_0= RULE_CADENA )
            // InternalKPIGenerator.g:219:5: lv_phaseName_2_0= RULE_CADENA
            {
            lv_phaseName_2_0=(Token)match(input,RULE_CADENA,FOLLOW_9); 

            					newLeafNode(lv_phaseName_2_0, grammarAccess.getPhaseAccess().getPhaseNameCADENATerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phaseName",
            						lv_phaseName_2_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPhaseAccess().getTasksKeyword_3());
            		
            // InternalKPIGenerator.g:239:3: ( (lv_tasks_4_0= ruleTask ) )
            // InternalKPIGenerator.g:240:4: (lv_tasks_4_0= ruleTask )
            {
            // InternalKPIGenerator.g:240:4: (lv_tasks_4_0= ruleTask )
            // InternalKPIGenerator.g:241:5: lv_tasks_4_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_tasks_4_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhaseRule());
            					}
            					add(
            						current,
            						"tasks",
            						lv_tasks_4_0,
            						"co.edu.uniandes.KPIGenerator.Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getPhaseAccess().getRightSquareBracketRightCurlyBracketKeyword_5());
            		
            // InternalKPIGenerator.g:262:3: (otherlv_6= ',' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:263:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhaseAccess().getCommaKeyword_6());
                    			

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
    // InternalKPIGenerator.g:272:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalKPIGenerator.g:272:45: (iv_ruleTask= ruleTask EOF )
            // InternalKPIGenerator.g:273:2: iv_ruleTask= ruleTask EOF
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
    // InternalKPIGenerator.g:279:1: ruleTask returns [EObject current=null] : ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_INT ) ) otherlv_9= '.' this_INT_10= RULE_INT otherlv_11= ',\"description\":\"' ( ( (lv_description_12_1= RULE_CADENA | lv_description_12_2= '\"\"' ) ) ) otherlv_13= '\",\"startDate\":\"' ( (lv_startDate_14_0= RULE_DATE ) ) otherlv_15= '\",\"dueDate\":\"' ( (lv_dueDate_16_0= RULE_DATE ) ) otherlv_17= '\",\"priority\":\"' ( ( (lv_priority_18_1= RULE_CADENA | lv_priority_18_2= '\"\"' ) ) ) otherlv_19= '\",\"isPrivate\":' ( (lv_isPrivate_20_0= RULE_CADENA ) ) otherlv_21= ',\"progress\":' ( (lv_progress_22_0= RULE_INT ) ) otherlv_23= ',\"status\":' ( (lv_status_24_0= ruleStatus ) ) otherlv_25= ',\"assignedTo\":\"' ( (lv_assignedTo_26_0= RULE_CADENA ) ) otherlv_27= '\",\"createdDate\":\"' ( (lv_createdDate_28_0= RULE_DATEHOUR ) ) otherlv_29= '\",\"completedDate\":\"' ( ( (lv_completedDate_30_1= RULE_DATEHOUR | lv_completedDate_30_2= '\"\"' ) ) ) otherlv_31= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_32_0= RULE_INT ) ) otherlv_33= ',\"billableTime\":' ( (lv_billableTime_34_0= RULE_INT ) ) otherlv_35= ',\"completedOnTime\":' ( (lv_completedOnTime_36_0= RULE_CADENA ) ) otherlv_37= ',\"timeEstimated\":' ( (lv_timeEstimated_38_0= RULE_INT ) ) otherlv_39= ',\"tags\":\"' ( ( (lv_tags_40_1= RULE_CADENA | lv_tags_40_2= '\"\"' ) ) ) otherlv_41= '}' (otherlv_42= ',' )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_taskId_2_0=null;
        Token otherlv_3=null;
        Token lv_taskName_4_0=null;
        Token otherlv_5=null;
        Token lv_useCase_6_0=null;
        Token otherlv_7=null;
        Token lv_sequenceNumber_8_0=null;
        Token otherlv_9=null;
        Token this_INT_10=null;
        Token otherlv_11=null;
        Token lv_description_12_1=null;
        Token lv_description_12_2=null;
        Token otherlv_13=null;
        Token lv_startDate_14_0=null;
        Token otherlv_15=null;
        Token lv_dueDate_16_0=null;
        Token otherlv_17=null;
        Token lv_priority_18_1=null;
        Token lv_priority_18_2=null;
        Token otherlv_19=null;
        Token lv_isPrivate_20_0=null;
        Token otherlv_21=null;
        Token lv_progress_22_0=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token lv_assignedTo_26_0=null;
        Token otherlv_27=null;
        Token lv_createdDate_28_0=null;
        Token otherlv_29=null;
        Token lv_completedDate_30_1=null;
        Token lv_completedDate_30_2=null;
        Token otherlv_31=null;
        Token lv_timeLoggedMin_32_0=null;
        Token otherlv_33=null;
        Token lv_billableTime_34_0=null;
        Token otherlv_35=null;
        Token lv_completedOnTime_36_0=null;
        Token otherlv_37=null;
        Token lv_timeEstimated_38_0=null;
        Token otherlv_39=null;
        Token lv_tags_40_1=null;
        Token lv_tags_40_2=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        EObject lv_status_24_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:285:2: ( ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_INT ) ) otherlv_9= '.' this_INT_10= RULE_INT otherlv_11= ',\"description\":\"' ( ( (lv_description_12_1= RULE_CADENA | lv_description_12_2= '\"\"' ) ) ) otherlv_13= '\",\"startDate\":\"' ( (lv_startDate_14_0= RULE_DATE ) ) otherlv_15= '\",\"dueDate\":\"' ( (lv_dueDate_16_0= RULE_DATE ) ) otherlv_17= '\",\"priority\":\"' ( ( (lv_priority_18_1= RULE_CADENA | lv_priority_18_2= '\"\"' ) ) ) otherlv_19= '\",\"isPrivate\":' ( (lv_isPrivate_20_0= RULE_CADENA ) ) otherlv_21= ',\"progress\":' ( (lv_progress_22_0= RULE_INT ) ) otherlv_23= ',\"status\":' ( (lv_status_24_0= ruleStatus ) ) otherlv_25= ',\"assignedTo\":\"' ( (lv_assignedTo_26_0= RULE_CADENA ) ) otherlv_27= '\",\"createdDate\":\"' ( (lv_createdDate_28_0= RULE_DATEHOUR ) ) otherlv_29= '\",\"completedDate\":\"' ( ( (lv_completedDate_30_1= RULE_DATEHOUR | lv_completedDate_30_2= '\"\"' ) ) ) otherlv_31= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_32_0= RULE_INT ) ) otherlv_33= ',\"billableTime\":' ( (lv_billableTime_34_0= RULE_INT ) ) otherlv_35= ',\"completedOnTime\":' ( (lv_completedOnTime_36_0= RULE_CADENA ) ) otherlv_37= ',\"timeEstimated\":' ( (lv_timeEstimated_38_0= RULE_INT ) ) otherlv_39= ',\"tags\":\"' ( ( (lv_tags_40_1= RULE_CADENA | lv_tags_40_2= '\"\"' ) ) ) otherlv_41= '}' (otherlv_42= ',' )? ) )
            // InternalKPIGenerator.g:286:2: ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_INT ) ) otherlv_9= '.' this_INT_10= RULE_INT otherlv_11= ',\"description\":\"' ( ( (lv_description_12_1= RULE_CADENA | lv_description_12_2= '\"\"' ) ) ) otherlv_13= '\",\"startDate\":\"' ( (lv_startDate_14_0= RULE_DATE ) ) otherlv_15= '\",\"dueDate\":\"' ( (lv_dueDate_16_0= RULE_DATE ) ) otherlv_17= '\",\"priority\":\"' ( ( (lv_priority_18_1= RULE_CADENA | lv_priority_18_2= '\"\"' ) ) ) otherlv_19= '\",\"isPrivate\":' ( (lv_isPrivate_20_0= RULE_CADENA ) ) otherlv_21= ',\"progress\":' ( (lv_progress_22_0= RULE_INT ) ) otherlv_23= ',\"status\":' ( (lv_status_24_0= ruleStatus ) ) otherlv_25= ',\"assignedTo\":\"' ( (lv_assignedTo_26_0= RULE_CADENA ) ) otherlv_27= '\",\"createdDate\":\"' ( (lv_createdDate_28_0= RULE_DATEHOUR ) ) otherlv_29= '\",\"completedDate\":\"' ( ( (lv_completedDate_30_1= RULE_DATEHOUR | lv_completedDate_30_2= '\"\"' ) ) ) otherlv_31= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_32_0= RULE_INT ) ) otherlv_33= ',\"billableTime\":' ( (lv_billableTime_34_0= RULE_INT ) ) otherlv_35= ',\"completedOnTime\":' ( (lv_completedOnTime_36_0= RULE_CADENA ) ) otherlv_37= ',\"timeEstimated\":' ( (lv_timeEstimated_38_0= RULE_INT ) ) otherlv_39= ',\"tags\":\"' ( ( (lv_tags_40_1= RULE_CADENA | lv_tags_40_2= '\"\"' ) ) ) otherlv_41= '}' (otherlv_42= ',' )? )
            {
            // InternalKPIGenerator.g:286:2: ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_INT ) ) otherlv_9= '.' this_INT_10= RULE_INT otherlv_11= ',\"description\":\"' ( ( (lv_description_12_1= RULE_CADENA | lv_description_12_2= '\"\"' ) ) ) otherlv_13= '\",\"startDate\":\"' ( (lv_startDate_14_0= RULE_DATE ) ) otherlv_15= '\",\"dueDate\":\"' ( (lv_dueDate_16_0= RULE_DATE ) ) otherlv_17= '\",\"priority\":\"' ( ( (lv_priority_18_1= RULE_CADENA | lv_priority_18_2= '\"\"' ) ) ) otherlv_19= '\",\"isPrivate\":' ( (lv_isPrivate_20_0= RULE_CADENA ) ) otherlv_21= ',\"progress\":' ( (lv_progress_22_0= RULE_INT ) ) otherlv_23= ',\"status\":' ( (lv_status_24_0= ruleStatus ) ) otherlv_25= ',\"assignedTo\":\"' ( (lv_assignedTo_26_0= RULE_CADENA ) ) otherlv_27= '\",\"createdDate\":\"' ( (lv_createdDate_28_0= RULE_DATEHOUR ) ) otherlv_29= '\",\"completedDate\":\"' ( ( (lv_completedDate_30_1= RULE_DATEHOUR | lv_completedDate_30_2= '\"\"' ) ) ) otherlv_31= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_32_0= RULE_INT ) ) otherlv_33= ',\"billableTime\":' ( (lv_billableTime_34_0= RULE_INT ) ) otherlv_35= ',\"completedOnTime\":' ( (lv_completedOnTime_36_0= RULE_CADENA ) ) otherlv_37= ',\"timeEstimated\":' ( (lv_timeEstimated_38_0= RULE_INT ) ) otherlv_39= ',\"tags\":\"' ( ( (lv_tags_40_1= RULE_CADENA | lv_tags_40_2= '\"\"' ) ) ) otherlv_41= '}' (otherlv_42= ',' )? )
            // InternalKPIGenerator.g:287:3: () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_INT ) ) otherlv_9= '.' this_INT_10= RULE_INT otherlv_11= ',\"description\":\"' ( ( (lv_description_12_1= RULE_CADENA | lv_description_12_2= '\"\"' ) ) ) otherlv_13= '\",\"startDate\":\"' ( (lv_startDate_14_0= RULE_DATE ) ) otherlv_15= '\",\"dueDate\":\"' ( (lv_dueDate_16_0= RULE_DATE ) ) otherlv_17= '\",\"priority\":\"' ( ( (lv_priority_18_1= RULE_CADENA | lv_priority_18_2= '\"\"' ) ) ) otherlv_19= '\",\"isPrivate\":' ( (lv_isPrivate_20_0= RULE_CADENA ) ) otherlv_21= ',\"progress\":' ( (lv_progress_22_0= RULE_INT ) ) otherlv_23= ',\"status\":' ( (lv_status_24_0= ruleStatus ) ) otherlv_25= ',\"assignedTo\":\"' ( (lv_assignedTo_26_0= RULE_CADENA ) ) otherlv_27= '\",\"createdDate\":\"' ( (lv_createdDate_28_0= RULE_DATEHOUR ) ) otherlv_29= '\",\"completedDate\":\"' ( ( (lv_completedDate_30_1= RULE_DATEHOUR | lv_completedDate_30_2= '\"\"' ) ) ) otherlv_31= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_32_0= RULE_INT ) ) otherlv_33= ',\"billableTime\":' ( (lv_billableTime_34_0= RULE_INT ) ) otherlv_35= ',\"completedOnTime\":' ( (lv_completedOnTime_36_0= RULE_CADENA ) ) otherlv_37= ',\"timeEstimated\":' ( (lv_timeEstimated_38_0= RULE_INT ) ) otherlv_39= ',\"tags\":\"' ( ( (lv_tags_40_1= RULE_CADENA | lv_tags_40_2= '\"\"' ) ) ) otherlv_41= '}' (otherlv_42= ',' )?
            {
            // InternalKPIGenerator.g:287:3: ()
            // InternalKPIGenerator.g:288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskAccess().getTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getIdKeyword_1());
            		
            // InternalKPIGenerator.g:298:3: ( (lv_taskId_2_0= RULE_INT ) )
            // InternalKPIGenerator.g:299:4: (lv_taskId_2_0= RULE_INT )
            {
            // InternalKPIGenerator.g:299:4: (lv_taskId_2_0= RULE_INT )
            // InternalKPIGenerator.g:300:5: lv_taskId_2_0= RULE_INT
            {
            lv_taskId_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_taskId_2_0, grammarAccess.getTaskAccess().getTaskIdINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taskId",
            						lv_taskId_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getNameKeyword_3());
            		
            // InternalKPIGenerator.g:320:3: ( (lv_taskName_4_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:321:4: (lv_taskName_4_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:321:4: (lv_taskName_4_0= RULE_CADENA )
            // InternalKPIGenerator.g:322:5: lv_taskName_4_0= RULE_CADENA
            {
            lv_taskName_4_0=(Token)match(input,RULE_CADENA,FOLLOW_13); 

            					newLeafNode(lv_taskName_4_0, grammarAccess.getTaskAccess().getTaskNameCADENATerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taskName",
            						lv_taskName_4_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getUseCaseKeyword_5());
            		
            // InternalKPIGenerator.g:342:3: ( (lv_useCase_6_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:343:4: (lv_useCase_6_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:343:4: (lv_useCase_6_0= RULE_CADENA )
            // InternalKPIGenerator.g:344:5: lv_useCase_6_0= RULE_CADENA
            {
            lv_useCase_6_0=(Token)match(input,RULE_CADENA,FOLLOW_14); 

            					newLeafNode(lv_useCase_6_0, grammarAccess.getTaskAccess().getUseCaseCADENATerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"useCase",
            						lv_useCase_6_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getSequenceNumberKeyword_7());
            		
            // InternalKPIGenerator.g:364:3: ( (lv_sequenceNumber_8_0= RULE_INT ) )
            // InternalKPIGenerator.g:365:4: (lv_sequenceNumber_8_0= RULE_INT )
            {
            // InternalKPIGenerator.g:365:4: (lv_sequenceNumber_8_0= RULE_INT )
            // InternalKPIGenerator.g:366:5: lv_sequenceNumber_8_0= RULE_INT
            {
            lv_sequenceNumber_8_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_sequenceNumber_8_0, grammarAccess.getTaskAccess().getSequenceNumberINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sequenceNumber",
            						lv_sequenceNumber_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getFullStopKeyword_9());
            		
            this_INT_10=(Token)match(input,RULE_INT,FOLLOW_16); 

            			newLeafNode(this_INT_10, grammarAccess.getTaskAccess().getINTTerminalRuleCall_10());
            		
            otherlv_11=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getDescriptionKeyword_11());
            		
            // InternalKPIGenerator.g:394:3: ( ( (lv_description_12_1= RULE_CADENA | lv_description_12_2= '\"\"' ) ) )
            // InternalKPIGenerator.g:395:4: ( (lv_description_12_1= RULE_CADENA | lv_description_12_2= '\"\"' ) )
            {
            // InternalKPIGenerator.g:395:4: ( (lv_description_12_1= RULE_CADENA | lv_description_12_2= '\"\"' ) )
            // InternalKPIGenerator.g:396:5: (lv_description_12_1= RULE_CADENA | lv_description_12_2= '\"\"' )
            {
            // InternalKPIGenerator.g:396:5: (lv_description_12_1= RULE_CADENA | lv_description_12_2= '\"\"' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_CADENA) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:397:6: lv_description_12_1= RULE_CADENA
                    {
                    lv_description_12_1=(Token)match(input,RULE_CADENA,FOLLOW_18); 

                    						newLeafNode(lv_description_12_1, grammarAccess.getTaskAccess().getDescriptionCADENATerminalRuleCall_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_12_1,
                    							"co.edu.uniandes.KPIGenerator.CADENA");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:412:6: lv_description_12_2= '\"\"'
                    {
                    lv_description_12_2=(Token)match(input,27,FOLLOW_18); 

                    						newLeafNode(lv_description_12_2, grammarAccess.getTaskAccess().getDescriptionQuotationMarkQuotationMarkKeyword_12_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "description", lv_description_12_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_13=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getStartDateKeyword_13());
            		
            // InternalKPIGenerator.g:429:3: ( (lv_startDate_14_0= RULE_DATE ) )
            // InternalKPIGenerator.g:430:4: (lv_startDate_14_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:430:4: (lv_startDate_14_0= RULE_DATE )
            // InternalKPIGenerator.g:431:5: lv_startDate_14_0= RULE_DATE
            {
            lv_startDate_14_0=(Token)match(input,RULE_DATE,FOLLOW_20); 

            					newLeafNode(lv_startDate_14_0, grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_14_0,
            						"co.edu.uniandes.KPIGenerator.DATE");
            				

            }


            }

            otherlv_15=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getDueDateKeyword_15());
            		
            // InternalKPIGenerator.g:451:3: ( (lv_dueDate_16_0= RULE_DATE ) )
            // InternalKPIGenerator.g:452:4: (lv_dueDate_16_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:452:4: (lv_dueDate_16_0= RULE_DATE )
            // InternalKPIGenerator.g:453:5: lv_dueDate_16_0= RULE_DATE
            {
            lv_dueDate_16_0=(Token)match(input,RULE_DATE,FOLLOW_21); 

            					newLeafNode(lv_dueDate_16_0, grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dueDate",
            						lv_dueDate_16_0,
            						"co.edu.uniandes.KPIGenerator.DATE");
            				

            }


            }

            otherlv_17=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getPriorityKeyword_17());
            		
            // InternalKPIGenerator.g:473:3: ( ( (lv_priority_18_1= RULE_CADENA | lv_priority_18_2= '\"\"' ) ) )
            // InternalKPIGenerator.g:474:4: ( (lv_priority_18_1= RULE_CADENA | lv_priority_18_2= '\"\"' ) )
            {
            // InternalKPIGenerator.g:474:4: ( (lv_priority_18_1= RULE_CADENA | lv_priority_18_2= '\"\"' ) )
            // InternalKPIGenerator.g:475:5: (lv_priority_18_1= RULE_CADENA | lv_priority_18_2= '\"\"' )
            {
            // InternalKPIGenerator.g:475:5: (lv_priority_18_1= RULE_CADENA | lv_priority_18_2= '\"\"' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CADENA) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:476:6: lv_priority_18_1= RULE_CADENA
                    {
                    lv_priority_18_1=(Token)match(input,RULE_CADENA,FOLLOW_22); 

                    						newLeafNode(lv_priority_18_1, grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_18_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"priority",
                    							lv_priority_18_1,
                    							"co.edu.uniandes.KPIGenerator.CADENA");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:491:6: lv_priority_18_2= '\"\"'
                    {
                    lv_priority_18_2=(Token)match(input,27,FOLLOW_22); 

                    						newLeafNode(lv_priority_18_2, grammarAccess.getTaskAccess().getPriorityQuotationMarkQuotationMarkKeyword_18_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "priority", lv_priority_18_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_19=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getIsPrivateKeyword_19());
            		
            // InternalKPIGenerator.g:508:3: ( (lv_isPrivate_20_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:509:4: (lv_isPrivate_20_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:509:4: (lv_isPrivate_20_0= RULE_CADENA )
            // InternalKPIGenerator.g:510:5: lv_isPrivate_20_0= RULE_CADENA
            {
            lv_isPrivate_20_0=(Token)match(input,RULE_CADENA,FOLLOW_23); 

            					newLeafNode(lv_isPrivate_20_0, grammarAccess.getTaskAccess().getIsPrivateCADENATerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"isPrivate",
            						lv_isPrivate_20_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_21=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_21, grammarAccess.getTaskAccess().getProgressKeyword_21());
            		
            // InternalKPIGenerator.g:530:3: ( (lv_progress_22_0= RULE_INT ) )
            // InternalKPIGenerator.g:531:4: (lv_progress_22_0= RULE_INT )
            {
            // InternalKPIGenerator.g:531:4: (lv_progress_22_0= RULE_INT )
            // InternalKPIGenerator.g:532:5: lv_progress_22_0= RULE_INT
            {
            lv_progress_22_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_progress_22_0, grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_22_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"progress",
            						lv_progress_22_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_23=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_23, grammarAccess.getTaskAccess().getStatusKeyword_23());
            		
            // InternalKPIGenerator.g:552:3: ( (lv_status_24_0= ruleStatus ) )
            // InternalKPIGenerator.g:553:4: (lv_status_24_0= ruleStatus )
            {
            // InternalKPIGenerator.g:553:4: (lv_status_24_0= ruleStatus )
            // InternalKPIGenerator.g:554:5: lv_status_24_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getStatusStatusParserRuleCall_24_0());
            				
            pushFollow(FOLLOW_26);
            lv_status_24_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_24_0,
            						"co.edu.uniandes.KPIGenerator.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_25, grammarAccess.getTaskAccess().getAssignedToKeyword_25());
            		
            // InternalKPIGenerator.g:575:3: ( (lv_assignedTo_26_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:576:4: (lv_assignedTo_26_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:576:4: (lv_assignedTo_26_0= RULE_CADENA )
            // InternalKPIGenerator.g:577:5: lv_assignedTo_26_0= RULE_CADENA
            {
            lv_assignedTo_26_0=(Token)match(input,RULE_CADENA,FOLLOW_27); 

            					newLeafNode(lv_assignedTo_26_0, grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_26_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"assignedTo",
            						lv_assignedTo_26_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_27=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_27, grammarAccess.getTaskAccess().getCreatedDateKeyword_27());
            		
            // InternalKPIGenerator.g:597:3: ( (lv_createdDate_28_0= RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:598:4: (lv_createdDate_28_0= RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:598:4: (lv_createdDate_28_0= RULE_DATEHOUR )
            // InternalKPIGenerator.g:599:5: lv_createdDate_28_0= RULE_DATEHOUR
            {
            lv_createdDate_28_0=(Token)match(input,RULE_DATEHOUR,FOLLOW_29); 

            					newLeafNode(lv_createdDate_28_0, grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_28_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"createdDate",
            						lv_createdDate_28_0,
            						"co.edu.uniandes.KPIGenerator.DATEHOUR");
            				

            }


            }

            otherlv_29=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_29, grammarAccess.getTaskAccess().getCompletedDateKeyword_29());
            		
            // InternalKPIGenerator.g:619:3: ( ( (lv_completedDate_30_1= RULE_DATEHOUR | lv_completedDate_30_2= '\"\"' ) ) )
            // InternalKPIGenerator.g:620:4: ( (lv_completedDate_30_1= RULE_DATEHOUR | lv_completedDate_30_2= '\"\"' ) )
            {
            // InternalKPIGenerator.g:620:4: ( (lv_completedDate_30_1= RULE_DATEHOUR | lv_completedDate_30_2= '\"\"' ) )
            // InternalKPIGenerator.g:621:5: (lv_completedDate_30_1= RULE_DATEHOUR | lv_completedDate_30_2= '\"\"' )
            {
            // InternalKPIGenerator.g:621:5: (lv_completedDate_30_1= RULE_DATEHOUR | lv_completedDate_30_2= '\"\"' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DATEHOUR) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:622:6: lv_completedDate_30_1= RULE_DATEHOUR
                    {
                    lv_completedDate_30_1=(Token)match(input,RULE_DATEHOUR,FOLLOW_31); 

                    						newLeafNode(lv_completedDate_30_1, grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_30_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"completedDate",
                    							lv_completedDate_30_1,
                    							"co.edu.uniandes.KPIGenerator.DATEHOUR");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:637:6: lv_completedDate_30_2= '\"\"'
                    {
                    lv_completedDate_30_2=(Token)match(input,27,FOLLOW_31); 

                    						newLeafNode(lv_completedDate_30_2, grammarAccess.getTaskAccess().getCompletedDateQuotationMarkQuotationMarkKeyword_30_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "completedDate", lv_completedDate_30_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_31=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_31, grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_31());
            		
            // InternalKPIGenerator.g:654:3: ( (lv_timeLoggedMin_32_0= RULE_INT ) )
            // InternalKPIGenerator.g:655:4: (lv_timeLoggedMin_32_0= RULE_INT )
            {
            // InternalKPIGenerator.g:655:4: (lv_timeLoggedMin_32_0= RULE_INT )
            // InternalKPIGenerator.g:656:5: lv_timeLoggedMin_32_0= RULE_INT
            {
            lv_timeLoggedMin_32_0=(Token)match(input,RULE_INT,FOLLOW_32); 

            					newLeafNode(lv_timeLoggedMin_32_0, grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_32_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeLoggedMin",
            						lv_timeLoggedMin_32_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_33=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_33, grammarAccess.getTaskAccess().getBillableTimeKeyword_33());
            		
            // InternalKPIGenerator.g:676:3: ( (lv_billableTime_34_0= RULE_INT ) )
            // InternalKPIGenerator.g:677:4: (lv_billableTime_34_0= RULE_INT )
            {
            // InternalKPIGenerator.g:677:4: (lv_billableTime_34_0= RULE_INT )
            // InternalKPIGenerator.g:678:5: lv_billableTime_34_0= RULE_INT
            {
            lv_billableTime_34_0=(Token)match(input,RULE_INT,FOLLOW_33); 

            					newLeafNode(lv_billableTime_34_0, grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_34_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"billableTime",
            						lv_billableTime_34_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_35=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_35, grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_35());
            		
            // InternalKPIGenerator.g:698:3: ( (lv_completedOnTime_36_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:699:4: (lv_completedOnTime_36_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:699:4: (lv_completedOnTime_36_0= RULE_CADENA )
            // InternalKPIGenerator.g:700:5: lv_completedOnTime_36_0= RULE_CADENA
            {
            lv_completedOnTime_36_0=(Token)match(input,RULE_CADENA,FOLLOW_34); 

            					newLeafNode(lv_completedOnTime_36_0, grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_36_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"completedOnTime",
            						lv_completedOnTime_36_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_37=(Token)match(input,40,FOLLOW_11); 

            			newLeafNode(otherlv_37, grammarAccess.getTaskAccess().getTimeEstimatedKeyword_37());
            		
            // InternalKPIGenerator.g:720:3: ( (lv_timeEstimated_38_0= RULE_INT ) )
            // InternalKPIGenerator.g:721:4: (lv_timeEstimated_38_0= RULE_INT )
            {
            // InternalKPIGenerator.g:721:4: (lv_timeEstimated_38_0= RULE_INT )
            // InternalKPIGenerator.g:722:5: lv_timeEstimated_38_0= RULE_INT
            {
            lv_timeEstimated_38_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_timeEstimated_38_0, grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_38_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeEstimated",
            						lv_timeEstimated_38_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_39=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_39, grammarAccess.getTaskAccess().getTagsKeyword_39());
            		
            // InternalKPIGenerator.g:742:3: ( ( (lv_tags_40_1= RULE_CADENA | lv_tags_40_2= '\"\"' ) ) )
            // InternalKPIGenerator.g:743:4: ( (lv_tags_40_1= RULE_CADENA | lv_tags_40_2= '\"\"' ) )
            {
            // InternalKPIGenerator.g:743:4: ( (lv_tags_40_1= RULE_CADENA | lv_tags_40_2= '\"\"' ) )
            // InternalKPIGenerator.g:744:5: (lv_tags_40_1= RULE_CADENA | lv_tags_40_2= '\"\"' )
            {
            // InternalKPIGenerator.g:744:5: (lv_tags_40_1= RULE_CADENA | lv_tags_40_2= '\"\"' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CADENA) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:745:6: lv_tags_40_1= RULE_CADENA
                    {
                    lv_tags_40_1=(Token)match(input,RULE_CADENA,FOLLOW_36); 

                    						newLeafNode(lv_tags_40_1, grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_40_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tags",
                    							lv_tags_40_1,
                    							"co.edu.uniandes.KPIGenerator.CADENA");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:760:6: lv_tags_40_2= '\"\"'
                    {
                    lv_tags_40_2=(Token)match(input,27,FOLLOW_36); 

                    						newLeafNode(lv_tags_40_2, grammarAccess.getTaskAccess().getTagsQuotationMarkQuotationMarkKeyword_40_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "tags", lv_tags_40_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_41=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_41, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_41());
            		
            // InternalKPIGenerator.g:777:3: (otherlv_42= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:778:4: otherlv_42= ','
                    {
                    otherlv_42=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_42, grammarAccess.getTaskAccess().getCommaKeyword_42());
                    			

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
    // InternalKPIGenerator.g:787:1: entryRuleStatus returns [EObject current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final EObject entryRuleStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatus = null;


        try {
            // InternalKPIGenerator.g:787:47: (iv_ruleStatus= ruleStatus EOF )
            // InternalKPIGenerator.g:788:2: iv_ruleStatus= ruleStatus EOF
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
    // InternalKPIGenerator.g:794:1: ruleStatus returns [EObject current=null] : ( () otherlv_1= '{\"type\":\"' ( (lv_statusName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"text\":\"' ( (lv_text_4_0= RULE_CADENA ) ) otherlv_5= '\"}' ) ;
    public final EObject ruleStatus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_statusName_2_0=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:800:2: ( ( () otherlv_1= '{\"type\":\"' ( (lv_statusName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"text\":\"' ( (lv_text_4_0= RULE_CADENA ) ) otherlv_5= '\"}' ) )
            // InternalKPIGenerator.g:801:2: ( () otherlv_1= '{\"type\":\"' ( (lv_statusName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"text\":\"' ( (lv_text_4_0= RULE_CADENA ) ) otherlv_5= '\"}' )
            {
            // InternalKPIGenerator.g:801:2: ( () otherlv_1= '{\"type\":\"' ( (lv_statusName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"text\":\"' ( (lv_text_4_0= RULE_CADENA ) ) otherlv_5= '\"}' )
            // InternalKPIGenerator.g:802:3: () otherlv_1= '{\"type\":\"' ( (lv_statusName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"text\":\"' ( (lv_text_4_0= RULE_CADENA ) ) otherlv_5= '\"}'
            {
            // InternalKPIGenerator.g:802:3: ()
            // InternalKPIGenerator.g:803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatusAccess().getStatusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStatusAccess().getTypeKeyword_1());
            		
            // InternalKPIGenerator.g:813:3: ( (lv_statusName_2_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:814:4: (lv_statusName_2_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:814:4: (lv_statusName_2_0= RULE_CADENA )
            // InternalKPIGenerator.g:815:5: lv_statusName_2_0= RULE_CADENA
            {
            lv_statusName_2_0=(Token)match(input,RULE_CADENA,FOLLOW_37); 

            					newLeafNode(lv_statusName_2_0, grammarAccess.getStatusAccess().getStatusNameCADENATerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"statusName",
            						lv_statusName_2_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getStatusAccess().getTextKeyword_3());
            		
            // InternalKPIGenerator.g:835:3: ( (lv_text_4_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:836:4: (lv_text_4_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:836:4: (lv_text_4_0= RULE_CADENA )
            // InternalKPIGenerator.g:837:5: lv_text_4_0= RULE_CADENA
            {
            lv_text_4_0=(Token)match(input,RULE_CADENA,FOLLOW_38); 

            					newLeafNode(lv_text_4_0, grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_4_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_5=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStatusAccess().getQuotationMarkRightCurlyBracketKeyword_5());
            		

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});

}